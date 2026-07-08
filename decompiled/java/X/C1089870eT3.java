package X;

import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsOptSwitchSetting;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089870eT3 {
    public final InterfaceC1089270eS5 LIZ;
    public final EnumC755280Tjy LIZIZ;
    public final C1088580eQy LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 550));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 555));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(this, 554));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 552));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 556));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 557));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 549));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 551));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 558));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 553));
    public final C01GW LJIILIIL;
    public final boolean LJIILJJIL;
    public final C1089880eT4 LJIILL;

    public static boolean LIZ(EnumC755280Tjy enumC755280Tjy) {
        if (enumC755280Tjy == EnumC755280Tjy.ANCHOR) {
            return true;
        }
        return false;
    }

    public C1089870eT3(C1089240eS2 c1089240eS2, EnumC755280Tjy enumC755280Tjy, C1089290eS7 c1089290eS7, C1088580eQy c1088580eQy) {
        this.LIZ = c1089240eS2;
        this.LIZIZ = enumC755280Tjy;
        this.LIZJ = c1088580eQy;
        this.LJIILIIL = C452501pT.LIZIZ(new AwS418S0200000_17(this, c1089290eS7, 96));
        boolean value = LiveStrategyParamsOptSwitchSetting.getValue();
        this.LJIILJJIL = value;
        if (value) {
            this.LJIILL = new C1089880eT4(enumC755280Tjy);
        }
    }
}
