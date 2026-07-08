package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.popup.outreach.ProfileOutreachBannerHelper$fetchOutreachResult$1", f = "ProfileOutreachBannerHelper.kt", l = {109, 115}, m = "invokeSuspend")
public final class C637090Oyp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2238171Cit LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637090Oyp(C2238171Cit c2238171Cit, InterfaceC1364105Vn<? super C637090Oyp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2238171Cit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637090Oyp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("ProfileOutreachBannerHelper@7058.fetchOutreachResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger timeout: ");
            sbLIZ.append(e);
            C1720106oR.LIZ("ProfileOutreachBanner", C2188811AlT.LIZIZ(sbLIZ));
            C2238171Cit c2238171Cit = this.LLILLJJLI;
            this.LL = 2;
            if (c2238171Cit.LIZLLL(this) == objLJFF) {
                C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.fetchOutreachResult$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.fetchOutreachResult$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            final C099F c099fLIZIZ = C090F.LIZIZ();
            C20554315bp.LIZIZ.LJ(EnumC20654715s1.PROFILE_BANNER, "enter_profile_tab", new AbstractC637050Oyl() { // from class: X.0Oyo
                @Override // X.AbstractC637050Oyl
                public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                    if (!c099fLIZIZ.isCompleted()) {
                        c099fLIZIZ.LJIIZILJ(new C443120HZe<>(c20554115bn, str, nVar));
                    }
                }
            });
            C477801tY c477801tY = new C477801tY(c099fLIZIZ, null);
            this.LL = 1;
            objLIZIZ = C099A.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, c477801tY, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.fetchOutreachResult$1");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) objLIZIZ;
        C20554115bn c20554115bn = (C20554115bn) c443120HZe.getFirst();
        String str = (String) c443120HZe.getSecond();
        n nVar = (n) c443120HZe.getThird();
        C2238171Cit c2238171Cit2 = this.LLILLJJLI;
        c2238171Cit2.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C637100Oyq(c20554115bn, str, c2238171Cit2, nVar, null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.fetchOutreachResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
