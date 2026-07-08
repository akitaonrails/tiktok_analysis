package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationDraftCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.offline.push.system.AIGCOfflineRouteInterceptor$onInterceptRoute$1$1", f = "AIGCOfflineRouteInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C0LZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C0LZK LLILLL;
    public final /* synthetic */ C0LY5 LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZG(AwemeDraft awemeDraft, Context context, C0LZK c0lzk, C0LY5 c0ly5, long j, InterfaceC1364105Vn<? super C0LZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = context;
        this.LLILLL = c0lzk;
        this.LLILZ = c0ly5;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraft = this.LL;
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        Context context = this.LLILLJJLI;
        C0LZK c0lzk = this.LLILLL;
        C0LY5 c0ly5 = this.LLILZ;
        long j = this.LLILZIL;
        if (context != null) {
            aIGCOfflineModel.enterFrom = C0LZQ.LIZ(c0lzk.LIZJ);
            aIGCOfflineModel.enterMethod = "click_notification";
            String str = AIGCGenerationDraftCompatActivity._pnsPageId;
            C0LZH.LIZ(context, c0ly5.LIZ, c0ly5.LJ, C544620LXo.LIZ(awemeDraft), j, aIGCOfflineModel.estimatedWaitingTime, aIGCOfflineModel.reqKey, aIGCOfflineModel.reqJson, awemeDraft.LIZIZ(), aIGCOfflineModel, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineRouteInterceptor@56b0.onInterceptRoute$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
