package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.interactive.task.game.recall.GameChallengeChatroomVMImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Hxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interactive.task.game.recall.GameChallengeChatroomVMImpl$deleteTask$2", f = "GameChallengeChatroomVMImpl.kt", l = {48}, m = "invokeSuspend")
public final class C457990Hxd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ GameChallengeCardTemplate LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ GameChallengeChatroomVMImpl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457990Hxd(GameChallengeCardTemplate gameChallengeCardTemplate, C869590Y9l c869590Y9l, GameChallengeChatroomVMImpl gameChallengeChatroomVMImpl, InterfaceC1364105Vn<? super C457990Hxd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = gameChallengeCardTemplate;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = gameChallengeChatroomVMImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457990Hxd(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C013C c013c;
        C013C c013c2;
        GameChallengeChatroomVMImpl gameChallengeChatroomVMImpl;
        AwS585S0100000_6 awS585S0100000_6;
        C1C7U.LIZ("GameChallengeChatroomVMImpl@2502.deleteTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        C013C c013c3 = 1;
        try {
            if (i != 0) {
                if (i == 1) {
                    c013c = this.LLILLJJLI;
                    c013c2 = this.LL;
                    try {
                        C155000ia.LIZIZ(obj);
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C0YS1.LIZ("GameChallengeRecallVM", String.valueOf(e.getMessage()));
                        gameChallengeChatroomVMImpl = this.LLILZLL;
                        awS585S0100000_6 = new AwS585S0100000_6(c013c2, 30);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c013c = new C013C();
                try {
                    InterfaceC911620ZpY interfaceC911620ZpYLJIIIIZZ = C912070ZqH.LIZIZ.LJIIIIZZ();
                    String str = this.LLILZ.taskId;
                    this.LL = c013c;
                    this.LLILLJJLI = c013c;
                    this.LLILLL = 1;
                    obj = interfaceC911620ZpYLJIIIIZZ.LIZIZ(str, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("GameChallengeChatroomVMImpl@2502.deleteTask$2");
                        return objLJFF;
                    }
                    c013c2 = c013c;
                } catch (Exception e2) {
                    e = e2;
                    c013c2 = c013c;
                    TryCatchGuardChecker.doCheck(e);
                    C0YS1.LIZ("GameChallengeRecallVM", String.valueOf(e.getMessage()));
                    gameChallengeChatroomVMImpl = this.LLILZLL;
                    awS585S0100000_6 = new AwS585S0100000_6(c013c2, 30);
                } catch (Throwable th) {
                    th = th;
                    c013c3 = c013c;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILZLL.setState(new AwS585S0100000_6(c013c3, 30));
                    throw th;
                }
            }
            c013c.element = ((Boolean) obj).booleanValue();
            if (c013c2.element) {
                C0Y3I c0y3i = new C0Y3I("recall game task");
                C869590Y9l c869590Y9l = this.LLILZIL;
                c869590Y9l.setContentPB(GameChallengeCardTemplate.LIZ(this.LLILZ, true, EnumC2241721Coc.TASK_STATUS_RECALL, null, null, null, 130551).encode());
                C458020Hxg.LIZ(c0y3i, c869590Y9l);
            }
            gameChallengeChatroomVMImpl = this.LLILZLL;
            awS585S0100000_6 = new AwS585S0100000_6(c013c2, 30);
            gameChallengeChatroomVMImpl.setState(awS585S0100000_6);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GameChallengeChatroomVMImpl@2502.deleteTask$2");
            return unit;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
