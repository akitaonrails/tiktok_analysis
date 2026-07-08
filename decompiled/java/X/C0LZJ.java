package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationDraftCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.offline.draft.AIGCOfflineDraftServiceImpl$editDraftWithResult$2", f = "AIGCOfflineDraftServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LZJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C0LSZ LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZJ(AwemeDraft awemeDraft, Activity activity, C0LSZ c0lsz, long j, InterfaceC1364105Vn<? super C0LZJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = activity;
        this.LLILLL = c0lsz;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineDraftServiceImpl@cc6a.editDraftWithResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraft = this.LL;
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        Activity activity = this.LLILLJJLI;
        C0LSZ c0lsz = this.LLILLL;
        long j = this.LLILZ;
        String str = AIGCGenerationDraftCompatActivity._pnsPageId;
        C0LZH.LIZ(activity, c0lsz.LIZ, c0lsz.LJ, C544620LXo.LIZ(awemeDraft), j, aIGCOfflineModel.estimatedWaitingTime, aIGCOfflineModel.reqKey, aIGCOfflineModel.reqJson, awemeDraft.LIZIZ(), aIGCOfflineModel, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineDraftServiceImpl@cc6a.editDraftWithResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
