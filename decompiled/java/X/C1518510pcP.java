package X;

import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0pcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518510pcP implements InterfaceC1518570pcV {
    public static final C1518510pcP LIZ = new C1518510pcP();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(234));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(233));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(232));

    @Override // X.InterfaceC1518570pcV
    public final C1518410pcF LIZIZ() {
        return (C1518410pcF) LIZLLL.getValue();
    }

    @Override // X.InterfaceC1518570pcV
    public final boolean LIZLLL() {
        return ((Boolean) C593690NQh.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1518570pcV
    public final <T> T LIZJ(Class<T> cls) {
        return (T) ((InterfaceC2661011f) LIZJ.getValue()).create(cls);
    }

    @Override // X.InterfaceC1518570pcV
    public final Object LIZ(Class cls, String str) {
        C1499850p8J c1499850p8JCreateBuilder = C09S2.LIZLLL().createBuilder(str);
        c1499850p8JCreateBuilder.LIZJ((AbstractC2343909Gj) LIZIZ.getValue());
        return c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
    }
}
