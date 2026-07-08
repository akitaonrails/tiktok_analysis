package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.casting.api.ICastingService;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0rSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip$submitSlideModePoint$1", f = "MainTabStrip.kt", l = {}, m = "invokeSuspend")
public final class C1589130rSJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MainTabStrip LLILZ;
    public final /* synthetic */ C0J90 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589130rSJ(String str, String str2, String str3, MainTabStrip mainTabStrip, C0J90 c0j90, int i, String str4, InterfaceC1364105Vn<? super C1589130rSJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = mainTabStrip;
        this.LLILZIL = c0j90;
        this.LLILZLL = i;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1589130rSJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String strLIZJ;
        EnumC1588650rRX enumC1588650rRXBT0;
        C1C7U.LIZ("MainTabStrip@28b8.submitSlideModePoint$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1590820rV2 c1590820rV2 = new C1590820rV2(this.LL);
        c1590820rV2.LJIJ = this.LLILLJJLI;
        c1590820rV2.LIZLLL = this.LLILLL;
        c1590820rV2.LJIILLIIL(C740740T3w.LJFF(this.LLILZ.getActivity()));
        if (Intrinsics.LJFF(this.LL, "enter_homepage_follow")) {
            if (((C0J97) this.LLILZ.LLJJJJ.getValue()).LIZ == 2 || ((C0J97) this.LLILZ.LLJJJJ.getValue()).LIZ == 3) {
                C0J90 c0j90 = this.LLILZIL;
                c1590820rV2.LJJI = c0j90.LIZ;
                c1590820rV2.LJJIFFI = c0j90.LIZIZ;
            }
            ICastingService iCastingService = (ICastingService) PluggableExtentionKt.pluggableSpi$default(ICastingService.class, false, false, false, 14, null);
            String strQ21 = null;
            FollowTabAbility followTabAbility = (FollowTabAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LLILZ.LLILLJJLI, null), FollowTabAbility.class, null);
            if (iCastingService != null && iCastingService.isConnected()) {
                z = true;
            } else {
                z = false;
            }
            c1590820rV2.LJJIII = z;
            if (iCastingService == null || (strLIZJ = iCastingService.LIZJ()) == null) {
                strLIZJ = "";
            }
            c1590820rV2.LJJIIJ = strLIZJ;
            if (this.LLILZLL == 1) {
                if (followTabAbility != null) {
                    strQ21 = followTabAbility.Q21();
                }
            } else if (followTabAbility != null && ((enumC1588650rRXBT0 = followTabAbility.bT0()) == null || (strQ21 = enumC1588650rRXBT0.getDesc()) == null)) {
                strQ21 = followTabAbility.Q21();
            }
            c1590820rV2.LJIJJLI = strQ21;
        }
        if (TextUtils.equals(this.LL, "enter_topic_tab")) {
            C1591440rW2 c1591440rW2 = MainTabStrip.LLJLLIL;
            String str = this.LLIZ;
            c1591440rW2.getClass();
            String strLIZLLL = C1591440rW2.LIZLLL(str);
            if (Intrinsics.LJFF(strLIZLLL, "homepage_topic_stem") && this.LLILZLL == 3 && C0C64.LJIILLIIL().LJIIIZ(31744, "stem_tab_enter_mob_fix", true, false)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MainTabStrip@28b8.submitSlideModePoint$1");
                return unit;
            }
            c1590820rV2.LJJII = strLIZLLL;
        }
        c1590820rV2.LJIILJJIL();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MainTabStrip@28b8.submitSlideModePoint$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
