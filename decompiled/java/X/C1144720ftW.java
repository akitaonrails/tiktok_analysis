package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144720ftW implements InterfaceC0148002o {
    public final BattleItem4FEModel LL;
    public final BattleItem4FEModel LLILLJJLI;
    public final BattleItem4FEModel LLILLL;
    public final BattleItem4FEModel LLILZ;
    public final BattleItem4FEModel LLILZIL;
    public final BattleItem4FEModel LLILZLL;
    public final BattleItem4FEModel LLIZ;
    public final BattleItem4FEModel LLIZLLLIL;
    public final BattleItem4FEModel LLJ;
    public final BattleItem4FEModel LLJI;
    public final BattleItem4FEModel LLJIJIL;
    public final BattleItem4FEModel LLJILJIL;
    public final AbstractC1144780ftc LLJILJILJ;

    public C1144720ftW() {
        this(0);
    }

    public static C1144720ftW LIZ(BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, BattleItem4FEModel battleItem4FEModel3, BattleItem4FEModel battleItem4FEModel4, BattleItem4FEModel battleItem4FEModel5, BattleItem4FEModel battleItem4FEModel6, BattleItem4FEModel battleItem4FEModel7, BattleItem4FEModel battleItem4FEModel8, BattleItem4FEModel battleItem4FEModel9, BattleItem4FEModel battleItem4FEModel10, BattleItem4FEModel battleItem4FEModel11, BattleItem4FEModel battleItem4FEModel12, AbstractC1144780ftc abstractC1144780ftc) {
        return new C1144720ftW(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel3, battleItem4FEModel4, battleItem4FEModel5, battleItem4FEModel6, battleItem4FEModel7, battleItem4FEModel8, battleItem4FEModel9, battleItem4FEModel10, battleItem4FEModel11, battleItem4FEModel12, abstractC1144780ftc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144720ftW)) {
            return false;
        }
        C1144720ftW c1144720ftW = (C1144720ftW) obj;
        return Intrinsics.LJFF(this.LL, c1144720ftW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1144720ftW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1144720ftW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1144720ftW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1144720ftW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1144720ftW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1144720ftW.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1144720ftW.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1144720ftW.LLJ) && Intrinsics.LJFF(this.LLJI, c1144720ftW.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1144720ftW.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1144720ftW.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1144720ftW.LLJILJILJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode();
    }

    public final String toString() {
        return "MatchItemState(selfCriticalStrikeCards=" + this.LL + ", selfSmokeCards=" + this.LLILLJJLI + ", selfExtraTimeCards=" + this.LLILLL + ", selfSpecialEffectCards=" + this.LLILZ + ", selfTop2SpecialEffectCards=" + this.LLILZIL + ", selfTop3SpecialEffectCards=" + this.LLILZLL + ", rivalCriticalStrikeCards=" + this.LLIZ + ", rivalSmokeCards=" + this.LLIZLLLIL + ", rivalExtraTimeCards=" + this.LLJ + ", rivalSpecialEffectCards=" + this.LLJI + ", rivalTop2SpecialEffectCards=" + this.LLJIJIL + ", rivalTop3SpecialEffectCards=" + this.LLJILJIL + ", itemAction=" + this.LLJILJILJ + ')';
    }

    public /* synthetic */ C1144720ftW(int i) {
        this(new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new BattleItem4FEModel(), new C1144810ftf(false));
    }

    public C1144720ftW(BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, BattleItem4FEModel battleItem4FEModel3, BattleItem4FEModel battleItem4FEModel4, BattleItem4FEModel battleItem4FEModel5, BattleItem4FEModel battleItem4FEModel6, BattleItem4FEModel battleItem4FEModel7, BattleItem4FEModel battleItem4FEModel8, BattleItem4FEModel battleItem4FEModel9, BattleItem4FEModel battleItem4FEModel10, BattleItem4FEModel battleItem4FEModel11, BattleItem4FEModel battleItem4FEModel12, AbstractC1144780ftc abstractC1144780ftc) {
        this.LL = battleItem4FEModel;
        this.LLILLJJLI = battleItem4FEModel2;
        this.LLILLL = battleItem4FEModel3;
        this.LLILZ = battleItem4FEModel4;
        this.LLILZIL = battleItem4FEModel5;
        this.LLILZLL = battleItem4FEModel6;
        this.LLIZ = battleItem4FEModel7;
        this.LLIZLLLIL = battleItem4FEModel8;
        this.LLJ = battleItem4FEModel9;
        this.LLJI = battleItem4FEModel10;
        this.LLJIJIL = battleItem4FEModel11;
        this.LLJILJIL = battleItem4FEModel12;
        this.LLJILJILJ = abstractC1144780ftc;
    }
}
