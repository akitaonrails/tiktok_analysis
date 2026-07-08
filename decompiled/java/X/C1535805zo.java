package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackConfigResponse;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.api.IMSmartReplyFeedbackAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackConfigManager$getFeedbackReason$2", f = "FeedbackConfigManager.kt", l = {}, m = "invokeSuspend")
public final class C1535805zo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1535805zo(InterfaceC1364105Vn<? super C1535805zo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1535805zo(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C1C7U.LIZ("FeedbackConfigManager@9848.getFeedbackReason$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            IMSmartReplyFeedbackAPI.LIZ.getClass();
            BotFeedbackConfigResponse botFeedbackConfigResponseLIZLLL = C1535705zn.LIZ().feedbackConfig().LIZLLL();
            if (botFeedbackConfigResponseLIZLLL != null && ((num = botFeedbackConfigResponseLIZLLL.statusCode) == null || num.intValue() == 0)) {
                try {
                    String strLJ = C051M.LJ(botFeedbackConfigResponseLIZLLL, false);
                    Keva repo = Keva.getRepo("im_ai_feedback_config_keva");
                    C1535905zp.LIZ = repo;
                    repo.storeString("config", strLJ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1535905zp.LIZIZ = botFeedbackConfigResponseLIZLLL;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackConfigManager@9848.getFeedbackReason$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1535805zo(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
