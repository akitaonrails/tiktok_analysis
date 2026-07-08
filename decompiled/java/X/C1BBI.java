package X;

/* JADX INFO: renamed from: X.1BBI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BBI implements InterfaceC19912612vc {
    public static final C1BBI LIZ = new C1BBI();

    @Override // X.InterfaceC19912612vc
    public final boolean LJII(int i) {
        EnumC2200651BAx enumC2200651BAx;
        if (i == 0) {
            enumC2200651BAx = EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i == 1) {
            enumC2200651BAx = EnumC2200651BAx.PURCHASES_UPDATED_ACTION;
        } else if (i == 2) {
            enumC2200651BAx = EnumC2200651BAx.LOCAL_PURCHASES_UPDATED_ACTION;
        } else {
            if (i != 3) {
                return false;
            }
            enumC2200651BAx = EnumC2200651BAx.ALTERNATIVE_BILLING_ACTION;
        }
        return enumC2200651BAx != null;
    }
}
