package X;

/* JADX INFO: renamed from: X.0wjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792030wjZ {
    public static final /* synthetic */ int LIZ = 0;

    public static C0KTZ LIZ(int i) {
        C0KTZ c0ktz = C0KTZ.INIT;
        if (i != c0ktz.getValue()) {
            C0KTZ c0ktz2 = C0KTZ.ACTIVE;
            if (i != c0ktz2.getValue()) {
                C0KTZ c0ktz3 = C0KTZ.CANCEL;
                if (i != c0ktz3.getValue()) {
                    C0KTZ c0ktz4 = C0KTZ.ON_HOLD;
                    if (i != c0ktz4.getValue()) {
                        C0KTZ c0ktz5 = C0KTZ.EXPIRED;
                        if (i != c0ktz5.getValue()) {
                            return C0KTZ.UNKNOWN;
                        }
                        return c0ktz5;
                    }
                    return c0ktz4;
                }
                return c0ktz3;
            }
            return c0ktz2;
        }
        return c0ktz;
    }

    public static C0KQW LIZIZ(C518080KTm c518080KTm) {
        String str = c518080KTm.LJIIIZ;
        if (str == null) {
            str = "";
        }
        return LJ(c518080KTm.LJIIIIZZ, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[PHI: r1
      0x001d: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x000a, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c A[PHI: r1
      0x000c: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:7:0x000a, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0KQW LIZJ(X.C1792840wks r1) {
        /*
            X.0wjH r0 = r1.LJIIIIZZ
            if (r0 == 0) goto L8
            java.lang.String r1 = r0.LIZIZ
            if (r1 != 0) goto Lc
        L8:
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
        Lc:
            X.0wja r0 = r0.LIZ
            if (r0 == 0) goto L1d
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L18:
            X.0KQW r0 = LJ(r0, r1)
            return r0
        L1d:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1792030wjZ.LIZJ(X.0wks):X.0KQW");
    }

    public static C0KM0 LIZLLL(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return C0KM0.PRE_CHECK_UNKNOWN;
                        }
                        return C0KM0.PRE_CHECK_PAYMENT_METHOD_MISMATCH;
                    }
                    return C0KM0.PRE_CHECK_STORE_ACCOUNT_MISMATCH;
                }
                return C0KM0.PRE_CHECK_ACCOUNT_MISMATCH;
            }
            return C0KM0.PRE_CHECK_FAILURE;
        }
        return C0KM0.PRE_CHECK_SUCCESS;
    }

    public static C0KQW LJ(Integer num, String str) {
        int value = EnumC1792040wja.UNDEFINED.getValue();
        if (num != null && num.intValue() == value) {
            return new C0KQW(EnumC1792020wjY.UNDEFINED, str);
        }
        int value2 = EnumC1792040wja.STORE_CONNECTION_FAILURE.getValue();
        if (num != null && num.intValue() == value2) {
            return new C0KQW(EnumC1792020wjY.STORE_CONNECTION_FAILURE, str);
        }
        int value3 = EnumC1792040wja.PRODUCT_NOT_AVAILABLE.getValue();
        if (num != null && num.intValue() == value3) {
            return new C0KQW(EnumC1792020wjY.PRODUCT_NOT_AVAILABLE, str);
        }
        int value4 = EnumC1792040wja.TIME_OUT.getValue();
        if (num != null && num.intValue() == value4) {
            return new C0KQW(EnumC1792020wjY.TIME_OUT, str);
        }
        int value5 = EnumC1792040wja.BILLING_NOT_SUPPORTED.getValue();
        if (num != null && num.intValue() == value5) {
            return new C0KQW(EnumC1792020wjY.BILLING_NOT_SUPPORTED, str);
        }
        int value6 = EnumC1792040wja.FEATURE_NOT_SUPPORTED.getValue();
        if (num != null && num.intValue() == value6) {
            return new C0KQW(EnumC1792020wjY.FEATURE_NOT_SUPPORTED, str);
        }
        int value7 = EnumC1792040wja.DEVICE_NOT_SUPPORTED.getValue();
        if (num != null && num.intValue() == value7) {
            return new C0KQW(EnumC1792020wjY.DEVICE_NOT_SUPPORTED, str);
        }
        int value8 = EnumC1792040wja.INTEGRATION_ERROR.getValue();
        if (num != null && num.intValue() == value8) {
            return new C0KQW(EnumC1792020wjY.INTEGRATION_ERROR, str);
        }
        int value9 = EnumC1792040wja.INTERNAL_ERROR.getValue();
        if (num != null && num.intValue() == value9) {
            return new C0KQW(EnumC1792020wjY.INTERNAL_ERROR, str);
        }
        int value10 = EnumC1792040wja.PAYMENT_BLOCK.getValue();
        if (num != null && num.intValue() == value10) {
            return new C0KQW(EnumC1792020wjY.PAYMENT_BLOCK, str);
        }
        int value11 = EnumC1792040wja.PRODUCT_ALREADY_OWNED.getValue();
        if (num != null && num.intValue() == value11) {
            return new C0KQW(EnumC1792020wjY.PRODUCT_ALREADY_OWNED, str);
        }
        int value12 = EnumC1792040wja.CHANNEL_DECLINE.getValue();
        if (num != null && num.intValue() == value12) {
            return new C0KQW(EnumC1792020wjY.CHANNEL_DECLINE, str);
        }
        int value13 = EnumC1792040wja.INSUFFICIENT_FUNDS.getValue();
        if (num != null && num.intValue() == value13) {
            return new C0KQW(EnumC1792020wjY.INSUFFICIENT_FUNDS, str);
        }
        return new C0KQW(EnumC1792020wjY.UNDEFINED, "Mapping Failed");
    }
}
