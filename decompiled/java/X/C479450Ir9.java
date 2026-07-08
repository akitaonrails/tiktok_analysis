package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Ir9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479450Ir9 {
    public final String LIZ;
    public final long LIZJ;
    public String LIZIZ = "idle";
    public Long LIZLLL = null;
    public Long LJ = null;
    public Long LJFF = null;
    public Long LJI = null;
    public String LJII = "none";
    public String LJIIIIZZ = null;
    public String LJIIIZ = null;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public final String LIZ() {
        String str = this.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        String str2 = this.LJIIIZ;
        if (str2 == null) {
            str2 = "";
        }
        if (str.length() == 0 && str2.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(long j) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "onRenderSuccess");
        if (this.LJFF == null) {
            this.LJFF = Long.valueOf(j);
        }
        this.LJI = Long.valueOf(j);
        LJII(EnumC479460IrA.LLILZLL);
        this.LJIIJ.set(true);
    }

    public final void LJFF(long j) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "onRequestStart");
        if (this.LIZLLL == null) {
            this.LIZLLL = Long.valueOf(j);
        }
        LJII(EnumC479460IrA.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.EnumC479460IrA r7) {
        /*
            r6 = this;
            int r1 = r7.ordinal()
            java.lang.String r5 = "idle"
            java.lang.String r4 = "requesting"
            if (r1 == 0) goto L85
            r0 = 1
            java.lang.String r3 = "rendering"
            if (r1 == r0) goto L78
            r0 = 2
            if (r1 == r0) goto L6a
            r0 = 3
            if (r1 == r0) goto L5c
            r0 = 4
            if (r1 == r0) goto L4b
            r0 = 5
            if (r1 != r0) goto L90
            java.lang.String r2 = r6.LIZIZ
            int r1 = r2.hashCode()
            r0 = 3227604(0x313fd4, float:4.522837E-39)
            if (r1 == r0) goto L3b
            r0 = 37119731(0x23666f3, float:1.3400793E-37)
            if (r1 == r0) goto L42
            r0 = 1839654540(0x6da6e68c, float:6.456653E27)
            if (r1 != r0) goto L48
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L48
        L36:
            java.lang.String r4 = "success"
        L38:
            r6.LIZIZ = r4
            return
        L3b:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L36
            goto L48
        L42:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L36
        L48:
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L4b:
            java.lang.String r1 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 != 0) goto L83
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r5)
            if (r0 != 0) goto L83
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L5c:
            java.lang.String r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L67
            java.lang.String r4 = "error"
            goto L38
        L67:
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L6a:
            java.lang.String r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L75
            java.lang.String r4 = "empty"
            goto L38
        L75:
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L78:
            java.lang.String r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 != 0) goto L83
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L83:
            r4 = r3
            goto L38
        L85:
            java.lang.String r0 = r6.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 != 0) goto L38
            java.lang.String r4 = r6.LIZIZ
            goto L38
        L90:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479450Ir9.LJII(X.0IrA):void");
    }

    public C479450Ir9(String str, long j) {
        this.LIZ = str;
        this.LIZJ = j;
    }

    public final void LIZIZ(long j, String str) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onRenderStart, source: ");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LJFF == null) {
            this.LJFF = Long.valueOf(j);
        }
        LJII(EnumC479460IrA.LLILZIL);
    }

    public final void LIZLLL(long j, String str) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "onRequestEmpty");
        this.LJ = Long.valueOf(j);
        LJII(EnumC479460IrA.LLILLL);
        if (str != null && str.length() != 0) {
            this.LJIIIIZZ = str;
        }
        this.LJIIJ.set(true);
    }

    public final void LJI(long j, String str) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "onRequestSuccess");
        this.LJ = Long.valueOf(j);
        LJII(EnumC479460IrA.LLILLJJLI);
        if (str != null && str.length() != 0) {
            this.LJIIIIZZ = str;
        }
    }

    public final void LJ(long j, String str, String str2) {
        if (this.LJIIJ.get()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TAG ");
        sbLIZ.append(this.LIZ);
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "onRequestError");
        this.LJ = Long.valueOf(j);
        LJII(EnumC479460IrA.LLILZ);
        if (str != null && str.length() != 0) {
            this.LJIIIIZZ = str;
        }
        if (str2 != null && str2.length() != 0) {
            this.LJIIIZ = str2;
        }
        this.LJIIJ.set(true);
    }
}
