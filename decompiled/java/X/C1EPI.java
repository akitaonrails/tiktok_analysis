package X;

/* JADX INFO: renamed from: X.1EPI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EPI {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C143600gk LIZ(int r1) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1EPI.LIZ(int):X.00gk");
    }

    public static C143600gk LIZIZ(C1EPH c1eph) {
        EnumC0338009w enumC0338009w;
        int value = c1eph.getValue();
        int i = C18SO.LIZ[c1eph.ordinal()];
        if (i != 1) {
            if (i != 2) {
                enumC0338009w = EnumC0338009w.FAIL;
            } else {
                enumC0338009w = EnumC0338009w.NO_VOICE;
            }
        } else {
            enumC0338009w = EnumC0338009w.SUCCESS;
        }
        return new C143600gk(value, enumC0338009w);
    }
}
