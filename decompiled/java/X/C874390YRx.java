package X;

/* JADX INFO: renamed from: X.0YRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874390YRx extends AbstractC873650YPb {
    public C874390YRx() {
        super("camera-validation");
    }

    @Override // X.AbstractC873650YPb
    public final boolean LIZIZ(C873880YPy c873880YPy) {
        if (C455040Hss.LIZ()) {
            Integer num = c873880YPy.LIZ;
            if (num == null || num.intValue() != 1802) {
                Integer num2 = c873880YPy.LIZ;
                if (num2 != null && num2.intValue() == 1803) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC873650YPb
    public final Object LIZ(C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        if (c873910YQb.LIZ == null) {
            C0YS1.LIZ("im-media-sending-step", "null message, ABORT");
            C0YPP c0ypp = C0YPQ.Companion;
            Exception exc = new Exception("null message");
            c0ypp.getClass();
            return new C0YPZ(C0YPP.LIZ(exc));
        }
        return C873780YPo.LIZ;
    }
}
