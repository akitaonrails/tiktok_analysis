package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VESize;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: X.13xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20182113xz {
    public static final C20182113xz LIZ = new C20182113xz();

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment");
        sbLIZ.append(File.separator);
        sbLIZ.append("image");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static File LJ(boolean z) throws IOException {
        File c0vsj;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(UUID.randomUUID().toString());
            sbLIZ.append(".mp4");
            c0vsj = new C2215208m6("y+2X0e3qfIqkZDbYHfFiN/8XI5fyqrwX5d+bZ2FL2joC4LH16E0=", C2188811AlT.LIZIZ(sbLIZ));
            C2215208m6 parentFile = c0vsj.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (z && !c0vsj.exists()) {
                c0vsj.createNewFile();
                return c0vsj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VSJ c0vsjLJIIL = C2354709Kn.LJIIL(LJIIIIZZ());
            if (c0vsjLJIIL == null) {
                return null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(UUID.randomUUID().toString());
            sbLIZ2.append(".mp4");
            c0vsj = new C0VSJ(c0vsjLJIIL, C2188811AlT.LIZIZ(sbLIZ2));
            File parentFile2 = c0vsj.getParentFile();
            if (parentFile2 != null && !parentFile2.exists()) {
                parentFile2.mkdirs();
            }
            if (z && !c0vsj.exists()) {
                c0vsj.createNewFile();
            }
        }
        return c0vsj;
    }

    public static float LJFF(String str) {
        try {
            C844470XAv.LIZ.getClass();
            C539280LDa c539280LDaLIZ = MediaUtil.LIZ.LIZ(C844470XAv.LIZ(), str);
            if (c539280LDaLIZ.LIZIZ > 0 && c539280LDaLIZ.LIZJ > 0) {
                return c539280LDaLIZ.LJFF;
            }
            return 0.0f;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    public static VESize LJI(String str) {
        int i;
        try {
            C844470XAv.LIZ.getClass();
            C539280LDa c539280LDaLIZ = MediaUtil.LIZ.LIZ(C844470XAv.LIZ(), str);
            int i2 = c539280LDaLIZ.LIZIZ;
            if (i2 > 0 && (i = c539280LDaLIZ.LIZJ) > 0) {
                if (c539280LDaLIZ.LIZLLL % 180 != 0) {
                    return new VESize(i, i2);
                }
                return new VESize(i2, i);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJIIIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("compress live photo video failed: ");
        sbLIZ.append(str);
        C2344809Gs.LIZLLL(6, "CommentImageCompress", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJ(File file) {
        if (file != null && file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        if (r5 > 0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2208361Bbu LJIIJJI(android.graphics.Bitmap r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20182113xz.LJIIJJI(android.graphics.Bitmap):X.1Bbu");
    }

    public static VESize LIZ(int i, int i2, int i3) {
        if (i > 0 && i2 > 0) {
            int i4 = 2;
            if (Math.max(i, i2) <= i3) {
                if (i < 2) {
                    i = 2;
                }
                if (i2 < 2) {
                    i2 = 2;
                }
                return new VESize(i, i2);
            }
            if (i >= i2) {
                int i5 = (int) ((i2 / i) * i3);
                if (i5 >= 2) {
                    i4 = i5;
                }
                return new VESize(i3, i4);
            }
            int i6 = (int) ((i / i2) * i3);
            if (i6 >= 2) {
                i4 = i6;
            }
            return new VESize(i4, i3);
        }
        return new VESize(720, 1280);
    }

    public static C2208311Bbp LIZIZ(String str, boolean z, boolean z2) {
        VESize vESize;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.canRead() && c0vsj.length() > 0) {
            C539280LDa c539280LDaLIZ = MediaUtil.LIZ.LIZ(contextLIZ, str);
            int i = c539280LDaLIZ.LIZIZ;
            int i2 = c539280LDaLIZ.LIZJ;
            if (c539280LDaLIZ.LIZLLL % 180 != 0) {
                vESize = new VESize(i2, i);
            } else {
                vESize = new VESize(i, i2);
            }
            return new C2208311Bbp(c539280LDaLIZ.LJFF, z, c539280LDaLIZ.LJ, z2, vESize.width, c0vsj.length(), vESize.height, str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r10.element = true;
        r0 = (X.C352620Ds4) r8.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r0.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r13.element = "timeout";
        X.C20182113xz.LIZ.getClass();
        LJIIIZ("timeout");
        LJIIJ(r21);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r2
      0x0066: PHI (r2v1 float) = (r2v0 float), (r2v3 float) binds: [B:16:0x005c, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r20, final java.io.File r21, com.ss.android.vesdk.VESize r22, float r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20182113xz.LIZLLL(java.lang.String, java.io.File, com.ss.android.vesdk.VESize, float):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d9, blocks: (B:3:0x0001, B:6:0x0016, B:8:0x0028, B:9:0x002a, B:11:0x002e, B:12:0x0030, B:14:0x0043, B:40:0x0081, B:42:0x009a, B:29:0x0061, B:32:0x0066, B:36:0x0071, B:39:0x0077), top: B:69:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LJII(java.lang.String r17, android.graphics.BitmapFactory.Options r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20182113xz.LJII(java.lang.String, android.graphics.BitmapFactory$Options, int, int):android.graphics.Bitmap");
    }

    public static AnonymousClass0956 LIZJ(C054G c054g, String str, int i, int i2, float f, InterfaceC19728212Gq interfaceC19728212Gq) {
        return C23250099c.LIZLLL(c054g, C0PEM.LIZJ, null, new C19728012Go(f, str, i, i2, interfaceC19728212Gq, null), 2);
    }
}
