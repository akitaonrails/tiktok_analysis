package X;

import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IC7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot$buildPlayGame$1$1", f = "GameChallengeCardProtocol.kt", l = {342}, m = "invokeSuspend")
public final class C0IC7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ GameChallengeCardTemplate LLILLL;
    public final /* synthetic */ GameChallengeCardReusedUISlot LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ GameParticipantScoreComponent LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ GameMainFlowEventParameters LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IC7(C19EG c19eg, GameChallengeCardTemplate gameChallengeCardTemplate, GameChallengeCardReusedUISlot gameChallengeCardReusedUISlot, String str, GameParticipantScoreComponent gameParticipantScoreComponent, String str2, GameMainFlowEventParameters gameMainFlowEventParameters, InterfaceC1364105Vn<? super C0IC7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = gameChallengeCardTemplate;
        this.LLILZ = gameChallengeCardReusedUISlot;
        this.LLILZIL = str;
        this.LLILZLL = gameParticipantScoreComponent;
        this.LLIZ = str2;
        this.LLIZLLLIL = gameMainFlowEventParameters;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IC7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GameParticipantScoreComponent gameParticipantScoreComponent;
        C1C7U.LIZ("GameChallengeCardReusedUISlot@f879.buildPlayGame$1$1");
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
            C19EG c19eg = this.LLILLJJLI;
            String str = this.LLILLL.gameInfo.gameId;
            String conversationId = this.LLILZ.tp().getConversationId();
            GameParticipantScoreComponent gameParticipantScoreComponent2 = this.LLILLL.currentUserScore;
            if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(this.LLILZIL)) {
                gameParticipantScoreComponent = null;
            } else {
                gameParticipantScoreComponent = this.LLILZLL;
            }
            GameChallengeCardTemplate gameChallengeCardTemplate = this.LLILLL;
            GameInfoComponent gameInfoComponent = gameChallengeCardTemplate.gameInfo;
            C0IC8 c0ic8 = new C0IC8(conversationId, gameParticipantScoreComponent2, gameParticipantScoreComponent, this.LLIZ, gameInfoComponent.gameThumbnail.urls, false, gameChallengeCardTemplate.scores, gameChallengeCardTemplate.taskId, gameChallengeCardTemplate.hasMoreParticipants, gameInfoComponent.order, gameInfoComponent.rankType);
            GameMainFlowEventParameters gameMainFlowEventParameters = this.LLIZLLLIL;
            this.LL = 1;
            if (interfaceC911620ZpYLJIIIIZZ.LIZJ(c19eg, str, c0ic8, gameMainFlowEventParameters, null, this) == objLJFF) {
                C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.buildPlayGame$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.buildPlayGame$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
