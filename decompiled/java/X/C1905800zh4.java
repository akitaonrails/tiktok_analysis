package X;

import Y.ARunnableS40S0300000_7;

/* JADX INFO: renamed from: X.0zh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("global_top_live_pop")
public final class C1905800zh4 extends C10GR {
    public final C19EG LL;
    public final C0J70 LLILLJJLI;
    public final Runnable LLILLL;
    public final int LLILZ = 2000;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
        C0J70 c0j70 = this.LLILLJJLI;
        c0j70.LJFF.add(new InterfaceC482890Iwh() { // from class: X.0zh5
            @Override // X.InterfaceC482890Iwh
            public final void LIZ() {
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZJ() {
            }

            @Override // X.InterfaceC482890Iwh
            public final void LIZIZ() {
                c20656615sK.LIZ();
            }
        });
        this.LLILLL.run();
    }

    public C1905800zh4(C19EG c19eg, C0J70 c0j70, ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        this.LL = c19eg;
        this.LLILLJJLI = c0j70;
        this.LLILLL = aRunnableS40S0300000_7;
    }
}
