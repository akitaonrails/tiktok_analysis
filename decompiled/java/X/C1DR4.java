package X;

/* JADX INFO: renamed from: X.1DR4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DR4 implements InterfaceC2255741DQu {
    public final /* synthetic */ C1DR7 LIZ;

    public C1DR4(C1DR7 c1dr7) {
        this.LIZ = c1dr7;
    }

    @Override // X.InterfaceC2255741DQu
    public final C2255751DQv LIZ(Class<? extends C05YF> cls) {
        C1DR9 c1dr9;
        InterfaceC2255741DQu interfaceC2255741DQu;
        Class<?> cls2 = this.LIZ.LIZJ.get(cls);
        if (cls2 == null) {
            C1DRG c1drg = this.LIZ.LIZ;
            if (c1drg == null || (interfaceC2255741DQu = (InterfaceC2255741DQu) c1drg.LJIIL(null, InterfaceC2255741DQu.class)) == null) {
                return null;
            }
            return interfaceC2255741DQu.LIZ(cls);
        }
        C1DR5 c1dr5 = this.LIZ.LIZIZ.get(cls2);
        if (c1dr5 == null || (c1dr9 = c1dr5.LIZLLL) == null) {
            return null;
        }
        return new C2255751DQv(cls2, c1dr9.LIZJ);
    }

    @Override // X.InterfaceC2255741DQu
    public final AbstractC2255721DQs<?> LIZIZ(Class<? extends C05YF> cls) {
        InterfaceC2255741DQu interfaceC2255741DQu;
        AbstractC2255721DQs<?> abstractC2255721DQs = this.LIZ.LIZLLL.get(cls);
        if (abstractC2255721DQs == null) {
            C1DRG c1drg = this.LIZ.LIZ;
            if (c1drg == null || (interfaceC2255741DQu = (InterfaceC2255741DQu) c1drg.LJIIL(null, InterfaceC2255741DQu.class)) == null) {
                return null;
            }
            return interfaceC2255741DQu.LIZIZ(cls);
        }
        return abstractC2255721DQs;
    }
}
