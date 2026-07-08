package X;

import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent$onShow$1$1", f = "CommerceLandingPageVideoShrinkComponent.kt", l = {307}, m = "invokeSuspend")
public final class C436340H9c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceLandingPageVideoShrinkComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436340H9c(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent, InterfaceC1364105Vn<? super C436340H9c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceLandingPageVideoShrinkComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436340H9c(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwemeRawAd awemeRawAd;
        int i;
        C1C7U.LIZ("CommerceLandingPageVideoShrinkComponent@dd67.onShow$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILLJJLI)).getAweme();
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                LandingPageConfig landingPageConfig = awemeRawAd.getLandingPageConfig();
                if (landingPageConfig != null) {
                    i = landingPageConfig.whileLoadingExpandMaxTime;
                } else {
                    i = -1;
                }
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(i, this) == objLJFF) {
                    C1C7U.LIZIZ("CommerceLandingPageVideoShrinkComponent@dd67.onShow$1$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.LJJIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandingPageVideoShrinkComponent@dd67.onShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
