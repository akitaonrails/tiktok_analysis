package X;

/* JADX INFO: renamed from: X.05Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1363505Vh {
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C05ZT r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C1363405Vg
            if (r0 == 0) goto L5d
            r7 = r11
            X.05Vg r7 = (X.C1363405Vg) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r9 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 1
            if (r0 == 0) goto L4d
            if (r0 != r6) goto L6a
            X.05ZT r10 = r7.LL
            X.C155000ia.LIZIZ(r9)
        L24:
            X.13fT r9 = (X.C20067313fT) r9
            int r0 = r9.LIZJ
            r0 = r0 & 66
            r5 = 0
            if (r0 == 0) goto L50
            java.util.List<X.13fO> r4 = r9.LIZ
            int r3 = r4.size()
            r2 = 0
        L34:
            if (r2 >= r3) goto L63
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            X.13fO r1 = (X.C20066813fO) r1
            boolean r0 = r1.LIZIZ()
            if (r0 != 0) goto L50
            boolean r0 = r1.LJII
            if (r0 != 0) goto L50
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L50
            int r2 = r2 + 1
            goto L34
        L4d:
            X.C155000ia.LIZIZ(r9)
        L50:
            r7.LL = r10
            r7.LLILLL = r6
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r9 = r10.LJJIJIL(r0, r7)
            if (r9 != r8) goto L24
            return r8
        L5d:
            X.05Vg r7 = new X.05Vg
            r7.<init>(r11)
            goto L12
        L63:
            java.util.List<X.13fO> r0 = r9.LIZ
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            return r8
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363505Vh.LIZ(X.05ZT, X.05Vn):java.lang.Object");
    }
}
