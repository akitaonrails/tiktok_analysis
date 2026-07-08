package X;

import Y.ACListenerS137S0100000_2;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$showProfileIntroPanelInner$1$1$1", f = "ProfileRecommendationService.kt", l = {}, m = "invokeSuspend")
public final class C1637006b2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileRecommendationService LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1637006b2(ProfileRecommendationService profileRecommendationService, C19EG c19eg, InterfaceC1364105Vn<? super C1637006b2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileRecommendationService;
        this.LLILLJJLI = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1637006b2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileRecommendationService@e133.showProfileIntroPanelInner$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProfileRecommendationService profileRecommendationService = this.LL;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null) {
            profileRecommendationService.getClass();
        } else {
            String str = profileRecommendationService.LIZJ.LJ;
            SmartImageView smartImageView = new SmartImageView(c19eg);
            C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
            c1389910mGz.LJIIIZ(2131834900);
            c1389910mGz.LJFF(2131834899);
            c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)));
            c1389910mGz.LJIIIIZZ(true);
            c1389910mGz.LJII(true);
            c1389910mGz.LJI(R.style.y0);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZIZ = 4;
            c1360890lWB.LIZLLL = 1;
            c1389910mGz.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
            c1389910mGz.LIZ.LIZJ = new AwS115S1100000_1(smartImageView, str, 3);
            c1389910mGz.LIZLLL(new AwS546S0100000_2(profileRecommendationService, 27));
            c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS137S0100000_2(profileRecommendationService, 11);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("author_id", profileRecommendationService.LIZJ.LIZ);
            C20684815ws.LJIILLIIL("follow_success_card_show", c2344009Gk.LIZ);
            c1389910mGz.LJIIJJI();
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg), C0PEM.LIZJ, null, new C05BO(profileRecommendationService, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileRecommendationService@e133.showProfileIntroPanelInner$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
