package X;

/* JADX INFO: renamed from: X.0pA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1500960pA6<ResponseT, ReturnT> extends AbstractC1500920pA2<ReturnT> {
    public final C1500210p8t LIZ;
    public final InterfaceC1496610p35 LIZIZ;
    public final InterfaceC1501650pBD<AbstractC842510X3h, ResponseT> LIZJ;

    public abstract Object LIZJ(C1500200p8s c1500200p8s, Object[] objArr);

    @Override // X.AbstractC1500920pA2
    public final ReturnT LIZ(Object[] objArr) {
        return (ReturnT) LIZJ(new C1500200p8s(this.LIZ, objArr, this.LIZIZ, this.LIZJ), objArr);
    }

    public AbstractC1500960pA6(C1500210p8t c1500210p8t, InterfaceC1496610p35 interfaceC1496610p35, InterfaceC1501650pBD<AbstractC842510X3h, ResponseT> interfaceC1501650pBD) {
        this.LIZ = c1500210p8t;
        this.LIZIZ = interfaceC1496610p35;
        this.LIZJ = interfaceC1501650pBD;
    }
}
