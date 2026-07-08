package X;

import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.aireply.AIReplyAssistantFeedbackDialog;
import com.bytedance.android.livesdk.livesetting.watchlive.AIReplyAssistantWatcherDismissDurationSetting;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.aireply.AIReplyAssistantFeedbackDialog$onViewCreated$3", f = "AIReplyAssistantFeedbackDialog.kt", l = {101}, m = "invokeSuspend")
public final class C378001dS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentReplyMessage LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AIReplyAssistantFeedbackDialog LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378001dS(CommentReplyMessage commentReplyMessage, C013C c013c, int i, AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog, InterfaceC1364105Vn<? super C378001dS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentReplyMessage;
        this.LLILLL = c013c;
        this.LLILZ = i;
        this.LLILZIL = aIReplyAssistantFeedbackDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378001dS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIReplyAssistantFeedbackDialog@372e.onViewCreated$3");
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
            IAIReplyWatcherManagerService.Companion.getClass();
            InterfaceC346201Wa<Pair<Long, Integer>> feedbackState = C378201dU.LIZ().getFeedbackState();
            final CommentReplyMessage commentReplyMessage = this.LLILLJJLI;
            final C013C c013c = this.LLILLL;
            final int i2 = this.LLILZ;
            final AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog = this.LLILZIL;
            InterfaceC346701Wf<? super Pair<Long, Integer>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01dR
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog2;
                    LiveIconView liveIconView;
                    Pair pair = (Pair) obj2;
                    if (((Number) pair.getFirst()).longValue() == commentReplyMessage.getMessageId()) {
                        if (c013c.element && i2 != ((Number) pair.getSecond()).intValue() && (liveIconView = (aIReplyAssistantFeedbackDialog2 = aIReplyAssistantFeedbackDialog).LLJZ) != null) {
                            HandlerHook.viewPostDelay(liveIconView, new RunnableC514801zW(aIReplyAssistantFeedbackDialog2, 95), AIReplyAssistantWatcherDismissDurationSetting.getValue());
                        }
                        commentReplyMessage.LL = ((Number) pair.getSecond()).intValue();
                        aIReplyAssistantFeedbackDialog.uS(commentReplyMessage);
                        c013c.element = false;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (feedbackState.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("AIReplyAssistantFeedbackDialog@372e.onViewCreated$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIReplyAssistantFeedbackDialog@372e.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
