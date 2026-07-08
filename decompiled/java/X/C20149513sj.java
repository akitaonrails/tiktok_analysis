package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.13sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20149513sj {
    public static final SparseArray<C20149613sk> LIZ;

    static {
        try {
            SparseArray<C20149613sk> sparseArray = new SparseArray<>();
            LIZ = sparseArray;
            if (!(Build.VERSION.SDK_INT >= 29)) {
                sparseArray.put(2, C20149613sk.LIZ(MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
                sparseArray.put(3, C20149613sk.LIZ(MediaStore.Video.Media.EXTERNAL_CONTENT_URI));
                sparseArray.put(4, C20149613sk.LIZ(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI));
            } else {
                sparseArray.put(2, C20149613sk.LIZ(MediaStore.Images.Media.getContentUri("external_primary")));
                sparseArray.put(3, C20149613sk.LIZ(MediaStore.Video.Media.getContentUri("external_primary")));
                sparseArray.put(4, C20149613sk.LIZ(MediaStore.Audio.Media.getContentUri("external_primary")));
                sparseArray.put(5, C20149613sk.LIZ(MediaStore.Downloads.EXTERNAL_CONTENT_URI));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static long LIZIZ(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorLIZJ = null;
        try {
            parcelFileDescriptorLIZJ = LIZJ(uri, "r");
            long statSize = parcelFileDescriptorLIZJ.getStatSize();
            C2199671B7d.LJJIIJ(parcelFileDescriptorLIZJ);
            return statSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2199671B7d.LJJIIJ(parcelFileDescriptorLIZJ);
            return -1L;
        }
    }

    public static int LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith("content")) {
            int i = 0;
            while (true) {
                SparseArray<C20149613sk> sparseArray = LIZ;
                if (i >= sparseArray.size()) {
                    return -1;
                }
                int iKeyAt = sparseArray.keyAt(i);
                if (str.startsWith(sparseArray.get(iKeyAt).LIZIZ)) {
                    return iKeyAt;
                }
                i++;
            }
        } else {
            return 1;
        }
    }

    public static boolean LJ(String str) {
        Context appContext;
        File fileX2;
        File obbDir;
        if (LIZLLL(str) > 1) {
            return true;
        }
        File fileW3 = C786410Ut5.W3();
        if (fileW3 == null || !str.startsWith(fileW3.getPath()) || (appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()) == null || (fileX2 = C786410Ut5.x2(appContext)) == null) {
            return false;
        }
        String parent = fileX2.getParent();
        if ((parent != null && str.startsWith(parent)) || (obbDir = appContext.getObbDir()) == null || str.startsWith(obbDir.getAbsolutePath()) || C2199751B7l.LJFF.LJIIIIZZ("uncheck_external_public_dir", 0) > 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(Uri uri, int i) throws Throwable {
        C20149613sk c20149613sk = LIZ.get(i);
        if (c20149613sk != null) {
            String str = c20149613sk.LIZJ + " = ?";
            String[] strArr = {uri.getLastPathSegment()};
            Cursor cursorLJJJ = null;
            try {
                Uri includePending = c20149613sk.LIZ;
                if (Build.VERSION.SDK_INT >= 29) {
                    includePending = MediaStore.setIncludePending(includePending);
                }
                cursorLJJJ = C2204961BRm.LJJJ(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver(), includePending, null, str, strArr, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofzL71pcJghXRmyMz0eWv/scu6UO4ZM=", null));
                if (cursorLJJJ != null && cursorLJJJ.moveToFirst()) {
                    C2199671B7d.LJJIII(cursorLJJJ);
                    return;
                }
                throw new Throwable("Fail to check Uri with cursor.");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2199671B7d.LJJIII(cursorLJJJ);
                throw th;
            }
        }
        throw new Throwable("Fail to check Uri, type error :" + i);
    }

    public static ParcelFileDescriptor LIZJ(Uri uri, String str) throws IOException {
        if (uri != null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorLIZLLL = C09NT.LIZLLL(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver(), uri, str);
                if (parcelFileDescriptorLIZLLL != null) {
                    return parcelFileDescriptorLIZLLL;
                }
                throw new IOException("Fail to get ParcelFileDescriptor, fileDescriptor is null");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IOException("Fail to get ParcelFileDescriptor", e);
            }
        }
        throw new IOException("Fail to get ParcelFileDescriptor, uri is null");
    }
}
