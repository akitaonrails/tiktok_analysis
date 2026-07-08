package X;

/* JADX INFO: renamed from: X.0XLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847310XLt {
    public final int LIZ;
    public final EnumC847320XLu LIZIZ = EnumC847320XLu.Low;
    public final InterfaceC847230XLl LIZJ;

    public C847310XLt(int i, InterfaceC847230XLl interfaceC847230XLl) {
        if (i > 0) {
            this.LIZ = i;
            this.LIZJ = interfaceC847230XLl;
            return;
        }
        throw new IllegalArgumentException("Service identity must be set greater than 0.");
    }
}
