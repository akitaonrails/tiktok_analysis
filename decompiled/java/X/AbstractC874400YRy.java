package X;

/* JADX INFO: renamed from: X.0YRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC874400YRy extends AbstractC873650YPb {
    public abstract boolean LIZJ(C869590Y9l c869590Y9l);

    public AbstractC874400YRy(String str) {
        super(str);
    }

    @Override // X.AbstractC873650YPb
    public final Object LIZ(C873910YQb c873910YQb, InterfaceC1364105Vn<? super InterfaceC873770YPn> interfaceC1364105Vn) {
        C0YS1.LIZJ("im-media-sending-step", "execute ValidateAttachmentStep");
        if (!LIZJ(c873910YQb.LIZ)) {
            C0YS1.LIZ("im-media-sending-step", "uploaded media not found, ABORT");
            C0YPP c0ypp = C0YPQ.Companion;
            Exception exc = new Exception("uploaded media not found");
            c0ypp.getClass();
            return new C0YPZ(C0YPP.LIZ(exc));
        }
        return C873780YPo.LIZ;
    }
}
