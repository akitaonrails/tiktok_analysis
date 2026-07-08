package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0IC6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot$playGame$1", f = "GameChallengeCardProtocol.kt", l = {411}, m = "invokeSuspend")
public final class C0IC6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ GameChallengeCardTemplate LLILLL;
    public final /* synthetic */ GameChallengeCardReusedUISlot LLILZ;
    public final /* synthetic */ C259800zU<GameParticipantScoreComponent> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IC6(Context context, GameChallengeCardTemplate gameChallengeCardTemplate, GameChallengeCardReusedUISlot gameChallengeCardReusedUISlot, C259800zU<GameParticipantScoreComponent> c259800zU, String str, InterfaceC1364105Vn<? super C0IC6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = gameChallengeCardTemplate;
        this.LLILZ = gameChallengeCardReusedUISlot;
        this.LLILZIL = c259800zU;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IC6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameChallengeCardReusedUISlot@f879.playGame$1");
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
            InterfaceC911620ZpY interfaceC911620ZpYLJIIIIZZ = C912070ZqH.LIZIZ.LJIIIIZZ();
            Context context = this.LLILLJJLI;
            String str = this.LLILLL.gameInfo.gameId;
            String conversationId = this.LLILZ.tp().getConversationId();
            GameChallengeCardTemplate gameChallengeCardTemplate = this.LLILLL;
            GameParticipantScoreComponent gameParticipantScoreComponent = gameChallengeCardTemplate.currentUserScore;
            GameParticipantScoreComponent gameParticipantScoreComponent2 = this.LLILZIL.element;
            String str2 = this.LLILZLL;
            GameInfoComponent gameInfoComponent = gameChallengeCardTemplate.gameInfo;
            C0IC8 c0ic8 = new C0IC8(conversationId, gameParticipantScoreComponent, gameParticipantScoreComponent2, str2, gameInfoComponent.gameThumbnail.urls, false, gameChallengeCardTemplate.scores, gameChallengeCardTemplate.taskId, gameChallengeCardTemplate.hasMoreParticipants, gameInfoComponent.order, gameInfoComponent.rankType);
            GameMainFlowEventParameters gameMainFlowEventParametersAp = this.LLILZ.Ap();
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this.LLILZ, 392);
            this.LL = 1;
            if (interfaceC911620ZpYLJIIIIZZ.LIZJ(context, str, c0ic8, gameMainFlowEventParametersAp, awS585S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.playGame$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.playGame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
