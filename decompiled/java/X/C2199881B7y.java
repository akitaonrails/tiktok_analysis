package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: X.1B7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199881B7y implements C1B86 {
    public final C1B86 LIZ;

    @Override // X.C1B86
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.C1B86
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.C1B86
    public final File LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.C1B86
    public final long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.C1B86
    public final FileInputStream LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.C1B86
    public final FileOutputStream LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.C1B86
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // X.C1B86
    public final String LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // X.C1B86
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // X.C1B86
    public final String getExtraMsg() {
        return this.LIZ.getExtraMsg();
    }

    @Override // X.C1B86
    public final File getFile() {
        return this.LIZ.getFile();
    }

    @Override // X.C1B86
    public final String getPath() {
        return this.LIZ.getPath();
    }

    @Override // X.C1B86
    public final boolean isDirectory() {
        return this.LIZ.isDirectory();
    }

    @Override // X.C1B86
    public final long length() {
        return this.LIZ.length();
    }

    @Override // X.C1B86
    public final boolean LJI(C2199881B7y c2199881B7y) {
        return this.LIZ.LJI(c2199881B7y);
    }

    @Override // X.C1B86
    public final boolean LJIIIZ(long j) {
        return this.LIZ.LJIIIZ(j);
    }

    public C2199881B7y(final String str, final String str2, final boolean z, final boolean z2) {
        final int iLIZLLL = C20149513sj.LIZLLL(str);
        if (iLIZLLL == 1) {
            this.LIZ = new C1B86(str, str2, z) { // from class: X.0jma
                public final C0VSJ LIZ;
                public final boolean LIZIZ;

                @Override // X.C1B86
                public final int LIZIZ() {
                    return 1;
                }

                @Override // X.C1B86
                public final String getExtraMsg() {
                    return "";
                }

                @Override // X.C1B86
                public final boolean LIZ() {
                    if (this.LIZIZ) {
                        return this.LIZ.delete();
                    }
                    return true;
                }

                @Override // X.C1B86
                public final File LIZJ() {
                    return this.LIZ.getParentFile();
                }

                @Override // X.C1B86
                public final long LIZLLL() {
                    return this.LIZ.lastModified();
                }

                @Override // X.C1B86
                public final FileInputStream LJ() throws IOException {
                    if (this.LIZ.isFile()) {
                        return new C0VSP(this.LIZ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.getAbsolutePath());
                    sbLIZ.append(" Fail to obtain InputStream, file type error");
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.C1B86
                public final FileOutputStream LJFF() {
                    return new C0VSV(this.LIZ);
                }

                @Override // X.C1B86
                public final boolean LJII() {
                    return this.LIZ.exists();
                }

                @Override // X.C1B86
                public final String LJIIIIZZ() {
                    return this.LIZ.getAbsolutePath();
                }

                @Override // X.C1B86
                public final boolean LJIIJ() {
                    return this.LIZ.canWrite();
                }

                @Override // X.C1B86
                public final String getPath() {
                    return this.LIZ.getPath();
                }

                @Override // X.C1B86
                public final boolean isDirectory() {
                    return this.LIZ.isDirectory();
                }

                @Override // X.C1B86
                public final long length() {
                    return this.LIZ.length();
                }

                @Override // X.C1B86
                public final File getFile() {
                    return this.LIZ;
                }

                @Override // X.C1B86
                public final boolean LJI(C2199881B7y c2199881B7y) {
                    return this.LIZ.renameTo(c2199881B7y.getFile());
                }

                @Override // X.C1B86
                public final boolean LJIIIZ(long j) {
                    return this.LIZ.setLastModified(j);
                }

                {
                    this.LIZIZ = true;
                    if (!TextUtils.isEmpty(str2)) {
                        this.LIZ = new C0VSJ(str, str2);
                    } else {
                        this.LIZ = new C0VSJ(str);
                    }
                    if (z) {
                        this.LIZIZ = C1294200jmc.LIZIZ(str);
                    }
                }
            };
            return;
        }
        try {
            final Uri uri = UriProtector.parse(str);
            C20149513sj.LIZ(uri, iLIZLLL);
            this.LIZ = new C1B86(uri, iLIZLLL, z2) { // from class: X.13si
                public final Uri LIZ;
                public final C0VSJ LIZIZ;
                public final int LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1B86
                public final boolean LIZ() {
                    boolean z3 = false;
                    try {
                        if (!this.LIZLLL) {
                            Uri uri2 = this.LIZ;
                            SparseArray<C20149613sk> sparseArray = C20149513sj.LIZ;
                            ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().delete(uri2, null, null);
                            return false;
                        }
                        FileOutputStream fileOutputStreamLJFF = LJFF();
                        try {
                            fileOutputStreamLJFF.write(new byte[0]);
                            fileOutputStreamLJFF.close();
                            z3 = true;
                            return true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return z3;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        return z3;
                    }
                }

                @Override // X.C1B86
                public final boolean LJI(C2199881B7y c2199881B7y) {
                    return false;
                }

                @Override // X.C1B86
                public final boolean LJIIJ() {
                    return true;
                }

                @Override // X.C1B86
                public final String getExtraMsg() {
                    return "";
                }

                @Override // X.C1B86
                public final File LIZJ() {
                    C0VSJ c0vsj = this.LIZIZ;
                    if (c0vsj != null) {
                        return c0vsj.getParentFile();
                    }
                    return null;
                }

                @Override // X.C1B86
                public final long LIZLLL() {
                    C0VSJ c0vsj = this.LIZIZ;
                    if (c0vsj == null || !c0vsj.exists()) {
                        return 0L;
                    }
                    return this.LIZIZ.lastModified();
                }

                @Override // X.C1B86
                public final FileInputStream LJ() throws IOException {
                    if (this.LIZ != null) {
                        return new C0VSP(C20149513sj.LIZJ(this.LIZ, "r").getFileDescriptor());
                    }
                    throw new IOException("Fail to obtain InputStream, uri is null");
                }

                @Override // X.C1B86
                public final FileOutputStream LJFF() throws IOException {
                    if (this.LIZ != null) {
                        return new C0VSV(C20149513sj.LIZJ(this.LIZ, "w").getFileDescriptor());
                    }
                    throw new IOException("Fail to obtain OutputStream, uri is null");
                }

                @Override // X.C1B86
                public final boolean LJII() {
                    return C20149513sj.LIZIZ(this.LIZ) > 0;
                }

                @Override // X.C1B86
                public final String LJIIIIZZ() {
                    C0VSJ c0vsj = this.LIZIZ;
                    return c0vsj != null ? c0vsj.getAbsolutePath() : "";
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C1B86
                public final String getPath() throws Throwable {
                    Uri uri2 = this.LIZ;
                    SparseArray<C20149613sk> sparseArray = C20149513sj.LIZ;
                    String[] strArr = {"_data"};
                    String string = null;
                    try {
                        Context appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext();
                        if (appContext == null) {
                            C2199671B7d.LJJIII(null);
                            return null;
                        }
                        Cursor cursorLJJJ = C2204961BRm.LJJJ(appContext.getContentResolver(), uri2, strArr, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofzL71pcJghXRmyMz0eWv/scu6UO4ZM=", null));
                        if (cursorLJJJ != null) {
                            try {
                                if (cursorLJJJ.moveToFirst()) {
                                    string = cursorLJJJ.getString(cursorLJJJ.getColumnIndex(strArr[0]));
                                }
                            } catch (Throwable th) {
                                th = th;
                                string = cursorLJJJ;
                            }
                        }
                        C2199671B7d.LJJIII(cursorLJJJ);
                        return string;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2199671B7d.LJJIII(string);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }

                @Override // X.C1B86
                public final boolean isDirectory() {
                    C0VSJ c0vsj = this.LIZIZ;
                    if (c0vsj != null) {
                        return c0vsj.isDirectory();
                    }
                    return false;
                }

                @Override // X.C1B86
                public final long length() {
                    return C20149513sj.LIZIZ(this.LIZ);
                }

                @Override // X.C1B86
                public final int LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.C1B86
                public final File getFile() {
                    return this.LIZIZ;
                }

                @Override // X.C1B86
                public final boolean LJIIIZ(long j) {
                    C0VSJ c0vsj = this.LIZIZ;
                    if (c0vsj != null && c0vsj.exists()) {
                        return this.LIZIZ.setLastModified(j);
                    }
                    return false;
                }

                {
                    this.LIZ = uri;
                    this.LIZJ = iLIZLLL;
                    this.LIZLLL = z2;
                    String path = getPath();
                    if (!TextUtils.isEmpty(path)) {
                        this.LIZIZ = new C0VSJ(path);
                    }
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            final String string = th.toString();
            this.LIZ = new C1B86(string) { // from class: X.0jmb
                public final String LIZ;

                @Override // X.C1B86
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.C1B86
                public final int LIZIZ() {
                    return -1;
                }

                @Override // X.C1B86
                public final File LIZJ() {
                    return null;
                }

                @Override // X.C1B86
                public final long LIZLLL() {
                    return 0L;
                }

                @Override // X.C1B86
                public final FileInputStream LJ() {
                    return null;
                }

                @Override // X.C1B86
                public final FileOutputStream LJFF() {
                    return null;
                }

                @Override // X.C1B86
                public final boolean LJI(C2199881B7y c2199881B7y) {
                    return false;
                }

                @Override // X.C1B86
                public final boolean LJII() {
                    return false;
                }

                @Override // X.C1B86
                public final String LJIIIIZZ() {
                    return "";
                }

                @Override // X.C1B86
                public final boolean LJIIIZ(long j) {
                    return false;
                }

                @Override // X.C1B86
                public final boolean LJIIJ() {
                    return false;
                }

                @Override // X.C1B86
                public final File getFile() {
                    return null;
                }

                @Override // X.C1B86
                public final String getPath() {
                    return "";
                }

                @Override // X.C1B86
                public final boolean isDirectory() {
                    return false;
                }

                @Override // X.C1B86
                public final long length() {
                    return 0L;
                }

                @Override // X.C1B86
                public final String getExtraMsg() {
                    return this.LIZ;
                }

                {
                    this.LIZ = "";
                    this.LIZ = string;
                }
            };
        }
    }
}
