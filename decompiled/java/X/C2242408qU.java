package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2242408qU {
    public static final C2242408qU LIZ = new C2242408qU();
    public static final ConcurrentHashMap<String, InterfaceC383701eN> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC383701eN> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC383701eN> LIZLLL = new ConcurrentHashMap<>();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1175));

    public static String LIZ(String str) {
        String strLJIIIZ = LJIIIZ(str);
        String strLJIIL = LJIIL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("background_light_");
        sbLIZ.append(strLJIIL);
        sbLIZ.append('.');
        sbLIZ.append(strLJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII(String str) {
        String string;
        String strLJLIL;
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.EP_AI_CREATE, "ep_ai_create_resources", true).getAbsolutePath();
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && (strLJLIL = a0.LJLIL(string, '/')) != null && strLJLIL.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(absolutePath);
            sbLIZ.append('/');
            sbLIZ.append(strLJLIL);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return absolutePath;
    }

    public static C0VSJ LJIIIIZZ(String str) {
        boolean z;
        String string = a0.LJLIIIL(str).toString();
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(LJII("lottie_creation_aicreate_guide"), LJIIJJI(string, "lottie_guide", "json"));
        if (!c0vsj.exists() || !c0vsj.isFile() || c0vsj.length() <= 0) {
            return null;
        }
        return c0vsj;
    }

    public static String LJIIIZ(String str) {
        String strLJJLL = a0.LJJLL('?', str, str);
        String strLJJLL2 = a0.LJJLL('#', strLJJLL, strLJJLL);
        String lowerCase = a0.LJJLJ('.', a0.LJJLJ('/', strLJJLL2, strLJJLL2), "").toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isLetterOrDigit(lowerCase.charAt(i))) {
                lowerCase = lowerCase.substring(0, i);
                break;
            }
            i++;
        }
        int length2 = lowerCase.length();
        if (2 <= length2 && length2 < 6) {
            return lowerCase;
        }
        return "webp";
    }

    public static String LJIIJ(String str) {
        String strLJIIIZ = LJIIIZ(str);
        String strLJIIL = LJIIL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model_icon_");
        sbLIZ.append(strLJIIL);
        sbLIZ.append('.');
        sbLIZ.append(strLJIIIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIL(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                sb.append("0123456789abcdef".charAt(i >>> 4));
                sb.append("0123456789abcdef".charAt(i & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.io.File>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2242608qW
            if (r0 == 0) goto L3d
            r5 = r8
            X.08qW r5 = (X.C2242608qW) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08lh r1 = new X.08lh
            r0 = 0
            r1.<init>(r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.08qW r5 = new X.08qW
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2242408qU.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r11, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.io.File>> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C2242708qX
            r4 = r10
            if (r0 == 0) goto L3d
            r9 = r12
            X.08qX r9 = (X.C2242708qX) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LLILLL
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L43
            X.C155000ia.LIZIZ(r3)
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
        L29:
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r6 = "lottie_creation_aicreate_guide"
            java.lang.String r7 = "lottie_guide"
            java.lang.String r8 = "json"
            r9.LLILLL = r0
            r5 = r11
            java.lang.Object r0 = r4.LJI(r5, r6, r7, r8, r9)
            if (r0 != r2) goto L29
            return r2
        L3d:
            X.08qX r9 = new X.08qX
            r9.<init>(r4, r12)
            goto L13
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2242408qU.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r7, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.io.File>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2242808qY
            if (r0 == 0) goto L3d
            r5 = r8
            X.08qY r5 = (X.C2242808qY) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08lf r1 = new X.08lf
            r0 = 0
            r1.<init>(r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.08qY r5 = new X.08qY
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2242408qU.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static final boolean LIZIZ(String str, String str2, String str3) {
        C0VSJ c0vsj = new C0VSJ(str, str2);
        C0VSJ c0vsj2 = new C0VSJ(str, str3);
        if (c0vsj.exists() && c0vsj.length() > 0) {
            if (c0vsj2.exists()) {
                c0vsj2.delete();
            }
            boolean zRenameTo = c0vsj.renameTo(c0vsj2);
            if (!zRenameTo) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Rename failed: ");
                sbLIZ.append(str2);
                sbLIZ.append(" -> ");
                sbLIZ.append(str3);
                C201955140j.LIZLLL(c554890LpX, "EPAiCreateResource", C2188811AlT.LIZIZ(sbLIZ));
            }
            return zRenameTo;
        }
        C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Temp file invalid: ");
        sbLIZ2.append(str2);
        C201955140j.LIZLLL(c554890LpX2, "EPAiCreateResource", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public static String LJIIJJI(String str, String str2, String str3) {
        String strLJJLL = a0.LJJLL('?', str, str);
        String strLJJLL2 = a0.LJJLL('#', strLJJLL, strLJJLL);
        String lowerCase = a0.LJJLJ('.', a0.LJJLJ('/', strLJJLL2, strLJJLL2), "").toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Character.isLetterOrDigit(lowerCase.charAt(i))) {
                lowerCase = lowerCase.substring(0, i);
                break;
            }
            i++;
        }
        int length2 = lowerCase.length();
        if (2 <= length2 && length2 < 6) {
            str3 = lowerCase;
        }
        String strLJIIL = LJIIL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(strLJIIL);
        sbLIZ.append('.');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(final com.ss.android.socialbase.downloader.depend.AbsDownloadListener r20, java.lang.String r21, final java.lang.String r22, final java.lang.String r23, X.InterfaceC1364105Vn r24) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2242408qU.LIZJ(com.ss.android.socialbase.downloader.depend.AbsDownloadListener, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.io.File>> r16) throws java.lang.Throwable {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C2242908qZ
            if (r0 == 0) goto L43
            r4 = r3
            X.08qZ r4 = (X.C2242908qZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L49
            X.C155000ia.LIZIZ(r3)
        L24:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.08le r5 = new X.08le
            r10 = 0
            r9 = r15
            r8 = r14
            r7 = r13
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L24
            return r2
        L43:
            X.08qZ r4 = new X.08qZ
            r4.<init>(r11, r3)
            goto L14
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2242408qU.LJI(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
