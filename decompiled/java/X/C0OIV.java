package X;

/* JADX INFO: renamed from: X.0OIV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIV {
    public static final EnumC617010OHz LIZIZ(Integer num) {
        for (EnumC617010OHz enumC617010OHz : EnumC617010OHz.values()) {
            int status = enumC617010OHz.getStatus();
            if (num != null && status == num.intValue()) {
                return enumC617010OHz;
            }
        }
        return EnumC617010OHz.INVALID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0077, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0077, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC617480OJu LIZ(X.EnumC617060OIe r9, java.lang.Integer r10, java.lang.Integer r11) {
        /*
            if (r9 == 0) goto Lb7
            int[] r1 = X.C0OIX.LIZ
            int r0 = r9.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L7d
            r0 = 2
            if (r1 != r0) goto Lb7
            X.0OJu[] r7 = X.EnumC617480OJu.values()
            int r6 = r7.length
            r5 = 0
        L16:
            if (r5 >= r6) goto L7a
            r8 = r7[r5]
            X.0OIe r0 = r8.getIdentityTpe()
            if (r0 != r9) goto L77
            java.util.List r0 = r8.getSubscribeStatus()
            java.util.Iterator r4 = r0.iterator()
        L28:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.0OHz r0 = (X.EnumC617010OHz) r0
            int r2 = r0.getStatus()
            if (r10 != 0) goto L75
            X.0OHz r0 = X.EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED
            int r0 = r0.getStatus()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L45:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L28
            int r0 = r1.intValue()
            if (r2 != r0) goto L28
            if (r3 == 0) goto L77
            java.util.List r0 = r8.getBulletinAccountStatus()
            java.util.Iterator r2 = r0.iterator()
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0OJR r0 = (X.C0OJR) r0
            int r0 = r0.getStatus()
            if (r11 == 0) goto L59
            int r3 = r11.intValue()
            if (r0 != r3) goto L59
            if (r1 == 0) goto L77
            return r8
        L75:
            r1 = r10
            goto L45
        L77:
            int r5 = r5 + 1
            goto L16
        L7a:
            X.0OJu r8 = X.EnumC617480OJu.UNINITIALIZED
            return r8
        L7d:
            X.0OJu[] r6 = X.EnumC617480OJu.values()
            int r5 = r6.length
            r4 = 0
        L83:
            if (r4 >= r5) goto Lb4
            r8 = r6[r4]
            X.0OIe r0 = r8.getIdentityTpe()
            if (r0 != r9) goto Lb1
            java.util.List r0 = r8.getBulletinAccountStatus()
            java.util.Iterator r3 = r0.iterator()
        L95:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0OJR r0 = (X.C0OJR) r0
            int r1 = r0.getStatus()
            if (r11 == 0) goto L95
            int r0 = r11.intValue()
            if (r1 != r0) goto L95
            if (r2 == 0) goto Lb1
            return r8
        Lb1:
            int r4 = r4 + 1
            goto L83
        Lb4:
            X.0OJu r8 = X.EnumC617480OJu.UNINITIALIZED
            return r8
        Lb7:
            X.0OJu r8 = X.EnumC617480OJu.UNINITIALIZED
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OIV.LIZ(X.0OIe, java.lang.Integer, java.lang.Integer):X.0OJu");
    }
}
