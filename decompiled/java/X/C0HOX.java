package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HOX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$clickOnElement$1", f = "MixStudioHomePageAssem.kt", l = {2127}, m = "invokeSuspend")
public final class C0HOX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioHomePageAssem LLILLJJLI;
    public final /* synthetic */ C0H6M LLILLL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILZ;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILZIL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILZLL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOX(MixStudioHomePageAssem mixStudioHomePageAssem, C0H6M c0h6m, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb2, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb3, InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb4, InterfaceC1364105Vn<? super C0HOX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioHomePageAssem;
        this.LLILLL = c0h6m;
        this.LLILZ = interfaceC440230HOb;
        this.LLILZIL = interfaceC440230HOb2;
        this.LLILZLL = interfaceC440230HOb3;
        this.LLIZ = interfaceC440230HOb4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer numLJ;
        int iIntValue;
        String strLIZLLL;
        FriendsIDInfo friendsIDInfo;
        String str2;
        Integer numLJ2;
        int iIntValue2;
        String strLIZLLL2;
        C0HGK c0hgk;
        FriendsIDInfo friendsIDInfo2;
        Object objLJIIJ = obj;
        C1C7U.LIZ("MixStudioHomePageAssem@94b0.clickOnElement$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            C440370HOp c440370HOp = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ2 = this.LLILLJJLI.hp().vQ2();
            boolean zIsNewUser = this.LLILLJJLI.hp().isNewUser();
            EnumC440220HOa enumC440220HOa = EnumC440220HOa.SELECT_ELEMENT;
            boolean z = this.LLILLJJLI.mp().getState().LLIZLLLIL;
            C0HGY c0hgyLJ = this.LLILLL.LJ();
            C0H7H c0h7hLIZLLL = this.LLILLL.LIZLLL();
            Integer numLIZJ = this.LLILLL.LIZJ();
            String strLIZIZ = this.LLILLL.LIZIZ();
            C440500HPc c440500HPcUp = this.LLILLJJLI.up();
            if (c440500HPcUp != null && (friendsIDInfo = c440500HPcUp.LLJ) != null) {
                str = friendsIDInfo.chatType;
            } else {
                str = null;
            }
            String strLIZLLL3 = this.LLILZ.LIZLLL();
            if (C0H6Q.LIZ()) {
                numLJ = C2286608xc.LJ(this.LLILLJJLI.op().wQ2());
            } else {
                Integer numLIZ = this.LLILZIL.LIZ();
                if (numLIZ != null) {
                    int iIntValue3 = numLIZ.intValue();
                    Integer numLIZ2 = this.LLILZLL.LIZ();
                    if (numLIZ2 != null) {
                        iIntValue = numLIZ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    numLJ = C2286608xc.LJ(iIntValue3 + iIntValue);
                } else {
                    numLJ = null;
                }
            }
            Integer numLIZJ2 = this.LLILZ.LIZJ();
            if (C0H6Q.LIZ()) {
                strLIZLLL = this.LLILLJJLI.op().zQ2();
            } else {
                strLIZLLL = this.LLIZ.LIZLLL();
            }
            C440370HOp.LIZIZ(c440370HOp, enumC441640HTmVQ2, zIsNewUser, enumC440220HOa, z, c0hgyLJ, c0h7hLIZLLL, numLIZJ, strLIZIZ, str, strLIZLLL3, numLJ, numLIZJ2, strLIZLLL);
            C0H6M c0h6m = this.LLILLL;
            this.LL = 1;
            objLJIIJ = c0h6m.LJIIJ(this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.clickOnElement$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJIIJ;
        C0HOC c0hoc = (C0HOC) pair.getFirst();
        EnumC440340HOm enumC440340HOm = (EnumC440340HOm) pair.getSecond();
        if (c0hoc == null) {
            if (this.LLILLL.LJFF()) {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0HOW(this.LLILLJJLI, null), 2);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.clickOnElement$1");
            return unit;
        }
        MixStudioHomePageViewModel mixStudioHomePageViewModelMp = this.LLILLJJLI.mp();
        mixStudioHomePageViewModelMp.getClass();
        mixStudioHomePageViewModelMp.setState(new AwS585S0100000_6(c0hoc, 290));
        if (enumC440340HOm != null) {
            C440370HOp c440370HOp2 = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ22 = this.LLILLJJLI.hp().vQ2();
            boolean zIsNewUser2 = this.LLILLJJLI.hp().isNewUser();
            InterfaceC440090HNn interfaceC440090HNn = c0hoc.LIZ;
            c440370HOp2.getClass();
            C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn);
            C0H7H c0h7h = c0hoc.LIZIZ;
            String strLJIIL = C440370HOp.LJIIL(c0hoc.LIZ);
            Integer num = c0hoc.LIZJ;
            C440500HPc c440500HPcUp2 = this.LLILLJJLI.up();
            if (c440500HPcUp2 != null && (friendsIDInfo2 = c440500HPcUp2.LLJ) != null) {
                str2 = friendsIDInfo2.chatType;
            } else {
                str2 = null;
            }
            String strLIZLLL4 = this.LLILZ.LIZLLL();
            if (C0H6Q.LIZ()) {
                numLJ2 = C2286608xc.LJ(this.LLILLJJLI.op().wQ2());
            } else {
                Integer numLIZ3 = this.LLILZIL.LIZ();
                if (numLIZ3 != null) {
                    int iIntValue4 = numLIZ3.intValue();
                    Integer numLIZ4 = this.LLILZLL.LIZ();
                    if (numLIZ4 != null) {
                        iIntValue2 = numLIZ4.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    numLJ2 = C2286608xc.LJ(iIntValue4 + iIntValue2);
                } else {
                    numLJ2 = null;
                }
            }
            Integer numLIZJ3 = this.LLILZ.LIZJ();
            if (C0H6Q.LIZ()) {
                strLIZLLL2 = this.LLILLJJLI.op().zQ2();
            } else {
                strLIZLLL2 = this.LLIZ.LIZLLL();
            }
            InterfaceC440090HNn interfaceC440090HNn2 = c0hoc.LIZ;
            if (interfaceC440090HNn2 instanceof C0HGK) {
                c0hgk = (C0HGK) interfaceC440090HNn2;
            } else {
                c0hgk = null;
            }
            if (c0hgk != null) {
                str3 = c0hgk.LIZ;
            }
            C440370HOp.LIZJ(enumC441640HTmVQ22, zIsNewUser2, c0hgyLJIILIIL, c0h7h, enumC440340HOm, strLJIIL, num, str2, strLIZLLL4, numLJ2, numLIZJ3, strLIZLLL2, str3, C440370HOp.LJIILL(interfaceC440090HNn2));
            this.LLILLJJLI.hp().setState(new AwS585S0100000_6(enumC440340HOm.toEnterGenerationPanelEnterMethod(), 271));
            try {
                MixStudioHomePageViewModel mixStudioHomePageViewModelMp2 = this.LLILLJJLI.mp();
                EnumC441640HTm enumC441640HTmVQ23 = this.LLILLJJLI.hp().vQ2();
                mixStudioHomePageViewModelMp2.getClass();
                mixStudioHomePageViewModelMp2.withState(new AwS372S0200000_6(mixStudioHomePageViewModelMp2, enumC441640HTmVQ23, 61));
            } catch (C440280HOg e) {
                TryCatchGuardChecker.doCheck(e);
                C440370HOp c440370HOp3 = C440370HOp.LIZ;
                EnumC441640HTm enumC441640HTmVQ24 = this.LLILLJJLI.hp().vQ2();
                c440370HOp3.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C441660HTo.LIZ(c2344009Gk, enumC441640HTmVQ24);
                C20684815ws.LJIILLIIL("imagine_studio_show_select_element_toast", c2344009Gk.LIZ);
                C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLJJLI.getContentView());
                c1389880mGw.LJIIIIZZ(2131835862);
                c1389880mGw.LJIIJ();
            } catch (C440290HOh e2) {
                TryCatchGuardChecker.doCheck(e2);
                C440370HOp c440370HOp4 = C440370HOp.LIZ;
                EnumC441640HTm enumC441640HTmVQ25 = this.LLILLJJLI.hp().vQ2();
                c440370HOp4.getClass();
                C440370HOp.LJIIIZ(enumC441640HTmVQ25);
                C1389880mGw c1389880mGw2 = new C1389880mGw(this.LLILLJJLI.getContentView());
                c1389880mGw2.LJIIIIZZ(2131835880);
                c1389880mGw2.LJIIJ();
            }
        } else {
            C440370HOp c440370HOp5 = C440370HOp.LIZ;
            EnumC441640HTm enumC441640HTmVQ26 = this.LLILLJJLI.hp().vQ2();
            boolean zIsNewUser3 = this.LLILLJJLI.hp().isNewUser();
            InterfaceC440090HNn interfaceC440090HNn3 = c0hoc.LIZ;
            c440370HOp5.getClass();
            C440370HOp.LIZ(enumC441640HTmVQ26, zIsNewUser3, C440370HOp.LJIILIIL(interfaceC440090HNn3), c0hoc.LIZIZ, EnumC436720HAo.CREATION_PANEL, c0hoc.LIZJ, C440370HOp.LJIIL(c0hoc.LIZ));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageAssem@94b0.clickOnElement$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
