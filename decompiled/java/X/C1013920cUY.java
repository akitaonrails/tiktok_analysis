package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0cUY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013920cUY extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;
    public final C1023960ckk LIZIZ;
    public final C1023960ckk LIZJ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1013920cUY(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
        C1013980cUe c1013980cUe = new C1000730c9H() { // from class: X.0cUe
        };
        C1013960cUc.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013960cUc.LIZIZ;
        this.LIZIZ = C1023500ck0.LIZJ("draw_ad", "otherclick", "playable_full_screen_mode", new InterfaceC1023650ckF[]{c1013980cUe.LJI(c1002190cBd)});
        this.LIZJ = C1023500ck0.LIZJ("draw_ad", "otherclick", "playable_full_screen_mode_exit", new InterfaceC1023650ckF[]{c1013980cUe.LJI(c1002190cBd)});
    }
}
