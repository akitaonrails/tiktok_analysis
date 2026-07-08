package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionTeamBase;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.connection.inviter.CatchBeansInviterCoordinator$requestInviteApi$2", f = "CatchBeansInviterCoordinator.kt", l = {286}, m = "invokeSuspend")
public final class C981720bec extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C981670beX LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ List<CompetitionTeamBase> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C974560bT4 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C981720bec(C981670beX c981670beX, long j, long j2, List<CompetitionTeamBase> list, int i, C974560bT4 c974560bT4, InterfaceC1364105Vn<? super C981720bec> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c981670beX;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = list;
        this.LLILZLL = i;
        this.LLIZ = c974560bT4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981720bec(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansInviterCoordinator@5d96.requestInviteApi$2");
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
            C981670beX c981670beX = this.LLILLJJLI;
            long j = this.LLILLL;
            long j2 = this.LLILZ;
            List<CompetitionTeamBase> list = this.LLILZIL;
            int i2 = this.LLILZLL;
            C974560bT4 c974560bT4 = this.LLIZ;
            this.LL = 1;
            if (c981670beX.LJJJJLI(j, j2, list, i2, c974560bT4, this) == objLJFF) {
                C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.requestInviteApi$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CatchBeansInviterCoordinator@5d96.requestInviteApi$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
