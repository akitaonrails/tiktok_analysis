package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.game.GameEffectResultPageConfig;
import com.ss.android.ugc.aweme.interactive.task.game.GameInfo;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot$openResultPage$1$1", f = "GameChallengeCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C900200ZTe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GameChallengeCardReusedUISlot LL;
    public final /* synthetic */ C900210ZTf LLILLJJLI;
    public final /* synthetic */ List<Effect> LLILLL;
    public final /* synthetic */ GameChallengeCardTemplate LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C900200ZTe(GameChallengeCardReusedUISlot gameChallengeCardReusedUISlot, C900210ZTf c900210ZTf, List<? extends Effect> list, GameChallengeCardTemplate gameChallengeCardTemplate, InterfaceC1364105Vn<? super C900200ZTe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gameChallengeCardReusedUISlot;
        this.LLILLJJLI = c900210ZTf;
        this.LLILLL = list;
        this.LLILZ = gameChallengeCardTemplate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C900200ZTe(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C909290Zln c909290Zln;
        IMUser fromUser;
        C1C7U.LIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C900220ZTg c900220ZTg = new Object() { // from class: X.0ZTg
        };
        Context context = this.LL.getContext();
        C900210ZTf c900210ZTf = this.LLILLJJLI;
        String str = c900210ZTf.LJIIIIZZ;
        int i = c900210ZTf.LJIIJ;
        SessionInfo sessionInfoTp = this.LL.tp();
        String uid = null;
        if ((sessionInfoTp instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfoTp) != null && (fromUser = c909290Zln.getFromUser()) != null) {
            uid = fromUser.getUid();
        }
        C900210ZTf c900210ZTf2 = this.LLILLJJLI;
        List<String> list = c900210ZTf2.LIZIZ;
        List<GameParticipantScoreComponent> list2 = c900210ZTf2.LIZJ;
        Effect effect = (Effect) ListProtector.get(this.LLILLL, 0);
        C900210ZTf c900210ZTf3 = this.LLILLJJLI;
        GameEffectResultPageConfig gameEffectResultPageConfig = new GameEffectResultPageConfig(null, this.LLILZ.currentUserScore, null, uid, str, this.LLILLJJLI.LJIIIZ, new GameInfo(list, effect, list2, c900210ZTf3.LIZLLL, c900210ZTf3.LJI, c900210ZTf3.LJII), i, this.LL.Ap());
        c900220ZTg.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/game/results");
        smartRouteBuildRoute.withParam("game_effect_result_page_config", gameEffectResultPageConfig);
        smartRouteBuildRoute.open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
