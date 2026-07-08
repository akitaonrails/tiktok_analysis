package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0coB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.profile.impl.ad.profilepage.CommerceProfilePageAdModule$triggerFullScreenJump$1", f = "CommerceProfilePageAdModule.kt", l = {305}, m = "invokeSuspend")
public final class C1026090coB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AutoPullUpConfig LLILLJJLI;
    public final /* synthetic */ C1026080coA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026090coB(AutoPullUpConfig autoPullUpConfig, C1026080coA c1026080coA, InterfaceC1364105Vn<? super C1026090coB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoPullUpConfig;
        this.LLILLL = c1026080coA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026090coB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceProfilePageAdModule@b4b7.triggerFullScreenJump$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long delay = this.LLILLJJLI.getDelay();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(delay, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceProfilePageAdModule@b4b7.triggerFullScreenJump$1");
                return objLJFF;
            }
        }
        C1026190coL c1026190coL = this.LLILLL.LLIZ;
        if (c1026190coL.LIZLLL && !c1026190coL.LIZJ) {
            c1026190coL.LIZJ = true;
            if (C1BCA.LIZIZ().LIZ) {
                C1026080coA c1026080coA = this.LLILLL;
                if (c1026080coA.LLIZ.LIZIZ) {
                    c1026080coA.LIZLLL().logAd(C1026320coY.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommerceProfilePageAdModule@b4b7.triggerFullScreenJump$1");
                    return unit;
                }
            }
            this.LLILLL.LJ(79);
            if (C1210304oP.LIZ()) {
                IFullScreenLandingPageUnityLogger iFullScreenLandingPageUnityLogger = (IFullScreenLandingPageUnityLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageUnityLogger.class, false, false, false, 14, null);
                if (iFullScreenLandingPageUnityLogger != null) {
                    iFullScreenLandingPageUnityLogger.LIZIZ(EnumC1029460ctc.VERSION_3_0, this.LLILLL.LIZIZ(), C1017290cZz.LIZ());
                }
            } else {
                this.LLILLL.LIZLLL().logAd(C1026120coE.LIZ, AFwS252S0000000_16.get$arr$(454));
            }
            AwemeRawAd awemeRawAd = this.LLILLL.LIZIZ().getAwemeRawAd();
            if (awemeRawAd != null) {
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                Long creativeId = awemeRawAd.getCreativeId();
                String logExtra = awemeRawAd.getLogExtra();
                new AwS630S0100000_16(awemeRawAd, 65);
                C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CommerceProfilePageAdModule@b4b7.triggerFullScreenJump$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CommerceProfilePageAdModule@b4b7.triggerFullScreenJump$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
