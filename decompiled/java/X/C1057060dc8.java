package X;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CustomNetConfig;

/* JADX INFO: renamed from: X.0dc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057060dc8 extends AbstractC1056960dby {
    public EnumC588020N4m LIZIZ = EnumC588020N4m.BUSY;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1057050dc7());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1057110dcD(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C1057100dcC(this));

    @Override // X.AbstractC1056960dby
    public final void LIZJ() {
        Long l;
        InterfaceC1006670cIr interfaceC1006670cIr = (InterfaceC1006670cIr) this.LJ.getValue();
        CustomNetConfig customNetConfig = (CustomNetConfig) this.LIZJ.getValue();
        long jLongValue = (customNetConfig == null || (l = customNetConfig.checkLoopInterval) == null) ? 10000L : l.longValue();
        C1057250dcR c1057250dcR = (C1057250dcR) this.LIZLLL.getValue();
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LIZ()) {
            return;
        }
        C2201101BCq.LJII(C1BC9.Traffic, interfaceC1006670cIr, true, jLongValue, c1057250dcR);
    }

    @Override // X.AbstractC1056960dby
    public final EnumC588020N4m LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1056960dby
    public final EnumC1017030cZZ LIZLLL() {
        return EnumC1017030cZZ.NET_IDLE;
    }
}
