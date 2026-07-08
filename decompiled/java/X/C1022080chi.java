package X;

import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;

/* JADX INFO: renamed from: X.0chi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022080chi extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1022080chi(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1022090chj.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1022090chj.LIZIZ, AFwS252S0000000_16.get$arr$(436)), new C1023630ckD<>(C1022090chj.LIZJ, AFwS252S0000000_16.get$arr$(437)), new C1023630ckD<>(C1022090chj.LIZLLL, AFwS252S0000000_16.get$arr$(438)), new C1023630ckD<>(C1022090chj.LJ, AFwS252S0000000_16.get$arr$(439))};
    }

    public final void LJJIIZ(int i, Integer num) {
        C1022100chk c1022100chk = C1022100chk.LIZ;
        String str = C1022030chd.LIZLLL;
        if (str == null) {
            str = "draw_ad";
        }
        c1022100chk.getClass();
        C1022090chj.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(str, "qip_deeplink_success", "minicard", new InterfaceC1023650ckF[]{c1022100chk.LJI(C1022090chj.LIZIZ, C1022090chj.LIZJ, C1022090chj.LIZLLL, C1022090chj.LJ, C1022090chj.LJFF, C1022090chj.LJI)}), new AwS124S0101000_16(i, num, 12));
    }
}
