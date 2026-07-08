package X;

import java.util.List;

/* JADX INFO: renamed from: X.17vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21186617vc extends C21186717vd {
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C21186917vf LIZ() {
        /*
            r9 = this;
            X.01GW r0 = r9.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C21187017vg
            if (r0 == 0) goto L11
            r5.add(r1)
            goto L11
        L23:
            java.lang.String r3 = r9.LIZ
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L57
            java.util.Iterator r2 = r5.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            X.17vg r1 = (X.C21187017vg) r1
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto L2f
            X.17va r1 = r1.LIZIZ
            X.17va r0 = X.EnumC21186417va.SUCCESS
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L2f
            X.17vh r4 = X.EnumC21187117vh.CRITICAL
        L4b:
            java.lang.String r6 = r9.LIZJ
            java.lang.String r7 = r9.LIZLLL
            java.lang.String r8 = r9.LJ
            X.17vf r2 = new X.17vf
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L57:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L7a
            java.util.Iterator r2 = r5.iterator()
        L61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r2.next()
            X.17vg r0 = (X.C21187017vg) r0
            X.17va r1 = r0.LIZIZ
            X.17va r0 = X.EnumC21186417va.REDUNDANT
            if (r1 == r0) goto L61
            X.17va r0 = X.EnumC21186417va.SUCCESS
            if (r1 == r0) goto L61
            X.17vh r4 = X.EnumC21187117vh.ERROR
            goto L4b
        L7a:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L85
            X.17vh r4 = X.EnumC21187117vh.WARNING
            goto L4b
        L85:
            X.17vh r4 = X.EnumC21187117vh.SUCCESS
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21186617vc.LIZ():X.17vf");
    }

    public C21186617vc(String str) {
        super(str);
    }

    public final void LIZIZ(String str, EnumC21186417va enumC21186417va, boolean z, String str2, String str3, String str4, String str5) {
        ((List) this.LIZIZ.getValue()).add(new C21187017vg(str, enumC21186417va, z, str2, str3, str4, str5));
        C21187917vp c21187917vp = C21187917vp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putParamError: ");
        sbLIZ.append(str4);
        sbLIZ.append(", ");
        sbLIZ.append(str3);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(enumC21186417va);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(str5);
        C2188811AlT.LIZIZ(sbLIZ);
        C21187917vp.LIZ(c21187917vp, null, 6);
    }
}
