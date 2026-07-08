package X;

import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.link.usecase.LeagueMatchCountdownTimerUseCaseImpl$toggleCountdownStream$1", f = "LeagueMatchCountdownTimerUseCase.kt", l = {93}, m = "invokeSuspend")
public final class C327701Ox extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C327801Oy LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ CohostPanelBanner.CountdownInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327701Ox(C327801Oy c327801Oy, long j, CohostPanelBanner.CountdownInfo countdownInfo, InterfaceC1364105Vn<? super C327701Ox> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c327801Oy;
        this.LLILLL = j;
        this.LLILZ = countdownInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327701Ox(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeagueMatchCountdownTimerUseCaseImpl@3f0e.toggleCountdownStream$1");
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
            C327801Oy c327801Oy = this.LLILLJJLI;
            long j = this.LLILLL;
            c327801Oy.getClass();
            C095D c095d = new C095D(new C327601Ow(j, c327801Oy, null));
            final C327801Oy c327801Oy2 = this.LLILLJJLI;
            final CohostPanelBanner.CountdownInfo countdownInfo = this.LLILZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01Oz
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    c327801Oy2.LIZLLL.setValue(new C01P0(((Number) obj2).longValue(), countdownInfo.descText));
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095d.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("LeagueMatchCountdownTimerUseCaseImpl@3f0e.toggleCountdownStream$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeagueMatchCountdownTimerUseCaseImpl@3f0e.toggleCountdownStream$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
