package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$retryPublish$1", f = "StoryPublishServiceImpl.kt", l = {107, 116, 124, 130}, m = "invokeSuspend")
public final class C569260MUi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ SimplePublishModel LLILZ;
    public final /* synthetic */ C1441130nbb LLILZIL;
    public final /* synthetic */ PublishFailureReason LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C569260MUi(C19EG c19eg, SimplePublishModel simplePublishModel, C1441130nbb c1441130nbb, PublishFailureReason publishFailureReason, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C569260MUi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19eg;
        this.LLILZ = simplePublishModel;
        this.LLILZIL = c1441130nbb;
        this.LLILZLL = publishFailureReason;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C569260MUi c569260MUi = new C569260MUi(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c569260MUi.LLILLJJLI = obj;
        return c569260MUi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Unit unit;
        IAVPublishService iAVPublishServicePublishService;
        C1C7U.LIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C155000ia.LIZIZ(obj);
                            Unit unit2 = Unit.LIZ;
                            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                            return unit2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                    return unit3;
                }
                C155000ia.LIZIZ(obj);
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                return unit4;
            }
            C155000ia.LIZIZ(obj);
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
            return unit5;
        }
        C155000ia.LIZIZ(obj);
        if (this.LLILLL == null) {
            C2238608ps c2238608ps = C2108108Nr.LIZ;
            C1318005Du c1318005Du = new C1318005Du(this.LLIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c1318005Du) == objLJFF) {
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                return objLJFF;
            }
            Unit unit52 = Unit.LIZ;
            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
            return unit52;
        }
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LLILZ.creationId, 0, null, 6, null), true, false, false, 12));
        if (awemeDraftLJI == null) {
            C2238608ps c2238608ps2 = C2108108Nr.LIZ;
            C1318105Dv c1318105Dv = new C1318105Dv(this.LLIZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, c2238608ps2, c1318105Dv) == objLJFF) {
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                return objLJFF;
            }
            Unit unit42 = Unit.LIZ;
            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
            return unit42;
        }
        getClass();
        CreativeModel creativeModel = awemeDraftLJI.LIZ;
        if (creativeModel.celebrationData == null && !creativeModel.streaksData.isStreaksPost() && !awemeDraftLJI.LIZ.storyEventStickerData.isStoryEventStickerPost()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            try {
                IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                    iAVPublishServicePublishService.restoreNLEData(awemeDraftLJI);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        C19EG c19egLIZLLL = C19221910Hx.LIZLLL(this.LLILLL, true);
        if (c19egLIZLLL == null) {
            Function1<Boolean, Unit> function1 = this.LLIZ;
            C2238608ps c2238608ps3 = C2108108Nr.LIZ;
            C1318305Dx c1318305Dx = new C1318305Dx(function1, null);
            this.LL = 3;
            if (C23250099c.LJI(this, c2238608ps3, c1318305Dx) == objLJFF) {
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
            return unit32;
        }
        C0CHQ.LIZ().getPublishService().LJIIL();
        C1436830nUf.LJIILL(c19egLIZLLL, awemeDraftLJI, this.LLILZLL);
        C2238608ps c2238608ps4 = C2108108Nr.LIZ;
        C1318205Dw c1318205Dw = new C1318205Dw(this.LLIZ, null);
        this.LL = 4;
        if (C23250099c.LJI(this, c2238608ps4, c1318205Dw) == objLJFF) {
            C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.retryPublish$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
