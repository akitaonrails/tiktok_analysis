package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$scheduleRecallContentCleanup$1", f = "RecallMsgUseCase.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 305}, m = "invokeSuspend")
public final class C864210XvH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0Y3S LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864210XvH(long j, C0Y3S c0y3s, long j2, String str, InterfaceC1364105Vn<? super C864210XvH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c0y3s;
        this.LLILZ = j2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864210XvH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.LIZ.LJ().LJ().getUid() != this.LLILZ) {
            C868780Y6i.LJ(this.LLILLL.LIZ.LIZLLL(), "RecallMsgUseCase", "recallContentCleanup skipped: uid changed since scheduling", 4);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
            return unit2;
        }
        C0Y3S c0y3s = this.LLILLL;
        String str = this.LLILZIL;
        this.LL = 2;
        if (c0y3s.LIZLLL(str, this) == objLJFF) {
            C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scheduleRecallContentCleanup$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
