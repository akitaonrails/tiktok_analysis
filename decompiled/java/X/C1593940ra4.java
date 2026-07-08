package X;

import android.util.Log;
import com.bytedance.hox.Hox;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS459S0200000_24;
import njp.a;

/* JADX INFO: renamed from: X.0ra4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$maybeShowProfileRecIntroPanel$1$1$1", f = "ProfileRecommendationService.kt", l = {}, m = "invokeSuspend")
public final class C1593940ra4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ C632880Os2 LLILLL;
    public final /* synthetic */ ProfileRecommendationService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593940ra4(C19EG c19eg, C632880Os2 c632880Os2, ProfileRecommendationService profileRecommendationService, InterfaceC1364105Vn<? super C1593940ra4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = c632880Os2;
        this.LLILZ = profileRecommendationService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1593940ra4 c1593940ra4 = new C1593940ra4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1593940ra4.LL = obj;
        return c1593940ra4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C1C7U.LIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zKQ2 = Hox.LLJILJIL.LIZ(this.LLILLJJLI).KQ2("For You");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isFYP: ");
        sbLIZ.append(zKQ2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zKQ2) {
            C632880Os2 c632880Os2 = this.LLILLL;
            if (c632880Os2 != null) {
                ProfileRecommendationService profileRecommendationService = this.LLILZ;
                C19EG c19eg = this.LLILLJJLI;
                profileRecommendationService.LIZJ = c632880Os2;
                PopupManager.LJIIZILJ(new C606820Nr6(c19eg, C1593960ra6.LIZ.showToast, new AwS459S0200000_24(c19eg, profileRecommendationService, 0)), new C1668306g5("ug_profile_intro_popup"));
            } else {
                this.LLILZ.LIZ();
            }
            objLJ = Unit.LIZ;
        } else {
            objLJ = C2286608xc.LJ(Log.d("PRS_Service", "skip flow, not in feed"));
        }
        C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$1");
        return objLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
