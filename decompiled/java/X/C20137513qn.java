package X;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13qn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137513qn {
    public static final C20137513qn LIZ = new C20137513qn();
    public static final LruCache<String, C1452210ntT> LIZIZ = new LruCache<>(100);
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[] LJ;
    public static final byte[][] LJFF;

    static {
        new LruCache(100);
        LIZJ = new byte[]{82, 73, 70, 70};
        LIZLLL = new byte[]{87, 69, 66, 80};
        LJ = new byte[]{104, 101, 105, 99};
        LJFF = new byte[][]{new byte[]{-1, -40}, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10}, new byte[]{71, 73, 70, 56, 55, 97}, new byte[]{71, 73, 70, 56, 57, 97}, new byte[]{66, 77}};
    }

    public static boolean LIZIZ(String str) throws Throwable {
        if (!new C0VSJ(str).exists()) {
            return false;
        }
        try {
            byte[] bArr = new byte[12];
            C0VSP c0vsp = new C0VSP(str);
            Throwable th = null;
            try {
                c0vsp.read(bArr);
                C2107108Nh.LIZ(c0vsp, null);
                if (Arrays.equals(LIZJ, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(0, 4))) && Arrays.equals(LIZLLL, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(8, 12)))) {
                    return true;
                }
                for (byte[] bArr2 : LJFF) {
                    if (Arrays.equals(bArr2, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(0, bArr2.length)))) {
                        return true;
                    }
                }
                if (u.LJIIZILJ(str.toUpperCase(Locale.getDefault()), ".HEIC", false) || Arrays.equals(LJ, C13LQ.LJJLI(bArr, C13LZ.LJIILJJIL(8, 12)))) {
                    return true;
                }
                C13LQ.LJJIJIL(bArr, " ", AFwS274S0000000_30.get$arr$(282));
                return false;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final synchronized C1452210ntT LIZ(String str) {
        C1452210ntT c1452210ntT;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2 = str;
        c1452210ntT = LIZIZ.get(str2);
        if (c1452210ntT == null) {
            int i6 = 0;
            if (LIZIZ(str2)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str2, options);
                if (!TextUtils.isEmpty(str2) && new C0VSJ(str2).exists()) {
                    try {
                        ExifInterface exifInterface = new ExifInterface(str2);
                        if (exifInterface != null) {
                            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterface, -1, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yq2dNrjb1eP3+BP0UGu8eV1xF3kAYJepyhH9xx34TiQ==", null));
                            if (iLJLILLLLZI != 3) {
                                if (iLJLILLLLZI != 6) {
                                    if (iLJLILLLLZI == 8) {
                                        i6 = 270;
                                    }
                                } else {
                                    i6 = 90;
                                }
                            } else {
                                i6 = 180;
                            }
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                str2 = str2;
                c1452210ntT = new C1452210ntT(options.outWidth, options.outHeight, i6, 4000, 0, 0, 480, str2, "image");
                LIZIZ.put(str2, c1452210ntT);
            } else {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
                if (videoFileInfo != null && videoFileInfo.width > 0 && videoFileInfo.height > 0 && videoFileInfo.maxDuration > 0) {
                    int i7 = videoFileInfo.width;
                    int i8 = videoFileInfo.height;
                    int i9 = videoFileInfo.rotation;
                    int i10 = videoFileInfo.maxDuration;
                    int i11 = videoFileInfo.bitrate;
                    int i12 = videoFileInfo.fps;
                    int i13 = videoFileInfo.codec;
                    c1452210ntT = new C1452210ntT(i7, i8, i9, i10, i11, i12, i13, videoFileInfo.duration, str2, VEUtils.getVideoEncodeTypeByID(i13));
                } else {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(str2);
                            String strLJII = C20144413ru.LJII(mediaMetadataRetriever);
                            if (strLJII != null) {
                                i = Integer.parseInt(strLJII);
                            } else {
                                i = 0;
                            }
                            String strLJFF = C20144413ru.LJFF(mediaMetadataRetriever);
                            if (strLJFF != null) {
                                i2 = Integer.parseInt(strLJFF);
                            } else {
                                i2 = 0;
                            }
                            String strLJI = C20144413ru.LJI(mediaMetadataRetriever);
                            if (strLJI != null) {
                                i3 = Integer.parseInt(strLJI);
                            } else {
                                i3 = 0;
                            }
                            String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetriever);
                            if (strLIZJ != null) {
                                i4 = Integer.parseInt(strLIZJ);
                            } else {
                                i4 = 0;
                            }
                            String strLIZ = C20144413ru.LIZ(mediaMetadataRetriever);
                            if (strLIZ != null) {
                                i5 = Integer.parseInt(strLIZ);
                            } else {
                                i5 = 0;
                            }
                            String strLIZIZ = C20144413ru.LIZIZ(mediaMetadataRetriever);
                            if (strLIZIZ != null) {
                                i6 = Integer.parseInt(strLIZIZ);
                            }
                            String strLJ = C20144413ru.LJ(mediaMetadataRetriever);
                            if (strLJ == null) {
                                strLJ = "unknown";
                            }
                            c1452210ntT = new C1452210ntT(i, i2, i3, i4, i5, i6, 384, str2, strLJ);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            str2 = str2;
                            c1452210ntT = new C1452210ntT(0, 0, 0, 0, 0, 0, 992, str2, null);
                        }
                        mediaMetadataRetriever.release();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                }
                LIZIZ.put(str2, c1452210ntT);
            }
        }
        return c1452210ntT;
    }
}
