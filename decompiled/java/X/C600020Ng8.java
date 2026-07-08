package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ng8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.addtodsp.feed.button.MusicAddToDspButtonConditionSensor$onInit$6$1", f = "MusicAddToDspButtonConditionSensor.kt", l = {85}, m = "invokeSuspend")
public final class C600020Ng8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C600040NgA LLILLJJLI;
    public final /* synthetic */ C608280NtS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600020Ng8(C600040NgA c600040NgA, C608280NtS c608280NtS, InterfaceC1364105Vn<? super C600020Ng8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c600040NgA;
        this.LLILLL = c608280NtS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600020Ng8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("MusicAddToDspButtonConditionSensor@9724.onInit$6$1");
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
            long j = this.LLILLJJLI.LIZJ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MusicAddToDspButtonConditionSensor@9724.onInit$6$1");
                return objLJFF;
            }
        }
        String str = this.LLILLJJLI.LIZIZ;
        C291001Au<Aweme> c291001Au = ((C709790Rsn) this.LLILLL.LJI().getState()).LLJJJJJIL;
        if (c291001Au != null && (aweme = c291001Au.LIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            this.LLILLJJLI.LIZLLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicAddToDspButtonConditionSensor@9724.onInit$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
