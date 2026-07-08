package X;

/* JADX INFO: renamed from: X.0nnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448660nnk implements InterfaceC1448670nnl<Object, Object> {
    public final /* synthetic */ InterfaceC1448670nnl<Object, Object> LIZIZ;
    public final /* synthetic */ InterfaceC1448670nnl<Object, Object> LIZJ;

    @Override // X.InterfaceC1448670nnl
    public final C1448660nnk LIZIZ(InterfaceC1448670nnl interfaceC1448670nnl) {
        return new C1448660nnk(interfaceC1448670nnl, this);
    }

    @Override // X.InterfaceC1448670nnl
    public final Object get(Object obj) {
        return this.LIZIZ.get(this.LIZJ.get(obj));
    }

    public C1448660nnk(InterfaceC1448670nnl<Object, Object> interfaceC1448670nnl, InterfaceC1448670nnl<Object, Object> interfaceC1448670nnl2) {
        this.LIZIZ = interfaceC1448670nnl;
        this.LIZJ = interfaceC1448670nnl2;
    }

    @Override // X.InterfaceC1448670nnl
    public final Object LIZ(Object obj, Object obj2) {
        return this.LIZJ.LIZ(obj, this.LIZIZ.LIZ(this.LIZJ.get(obj), obj2));
    }
}
