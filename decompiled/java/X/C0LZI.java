package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationDraftCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.offline.draft.AIGCOfflineDraftServiceImpl$editDraftWithResultNewFramework$2", f = "AIGCOfflineDraftServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LZI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C552940LmO LLILLL;
    public final /* synthetic */ C0LY5 LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZI(AwemeDraft awemeDraft, Activity activity, C552940LmO c552940LmO, C0LY5 c0ly5, long j, InterfaceC1364105Vn<? super C0LZI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = activity;
        this.LLILLL = c552940LmO;
        this.LLILZ = c0ly5;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineDraftServiceImpl@cc6a.editDraftWithResultNewFramework$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraft = this.LL;
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        Activity activity = this.LLILLJJLI;
        C552940LmO c552940LmO = this.LLILLL;
        C0LY5 c0ly5 = this.LLILZ;
        long j = this.LLILZIL;
        String str = AIGCGenerationDraftCompatActivity._pnsPageId;
        C0LZH.LIZ(activity, c552940LmO.LIZ, c0ly5.LJ, C544620LXo.LIZ(awemeDraft), j, aIGCOfflineModel.estimatedWaitingTime, aIGCOfflineModel.reqKey, aIGCOfflineModel.reqJson, awemeDraft.LIZIZ(), aIGCOfflineModel, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineDraftServiceImpl@cc6a.editDraftWithResultNewFramework$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
