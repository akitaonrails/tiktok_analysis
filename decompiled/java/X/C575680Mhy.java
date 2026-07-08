package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creative.tangram.workflow.ParseModelTask$schedule$4$1$1", f = "ParseModelTask.kt", l = {141}, m = "invokeSuspend")
public final class C575680Mhy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C575640Mhu LLILLJJLI;
    public final /* synthetic */ InterfaceC575760Mi6<?> LLILLL;
    public final /* synthetic */ ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> LLILZ;
    public final /* synthetic */ InterfaceC569070MTp LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C575680Mhy(C575640Mhu c575640Mhu, InterfaceC575760Mi6<?> interfaceC575760Mi6, ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> concurrentHashMap, InterfaceC569070MTp interfaceC569070MTp, InterfaceC1364105Vn<? super C575680Mhy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c575640Mhu;
        this.LLILLL = interfaceC575760Mi6;
        this.LLILZ = concurrentHashMap;
        this.LLILZIL = interfaceC569070MTp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C575680Mhy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ParseModelTask@a58a.schedule$4$1$1");
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
            C575640Mhu c575640Mhu = this.LLILLJJLI;
            InterfaceC575760Mi6<?> interfaceC575760Mi6 = this.LLILLL;
            ConcurrentHashMap<C575620Mhs, InterfaceC575760Mi6<?>> concurrentHashMap = this.LLILZ;
            InterfaceC569070MTp interfaceC569070MTp = this.LLILZIL;
            this.LL = 1;
            if (c575640Mhu.LJIIIZ(interfaceC575760Mi6, concurrentHashMap, interfaceC569070MTp, this) == objLJFF) {
                C1C7U.LIZIZ("ParseModelTask@a58a.schedule$4$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ParseModelTask@a58a.schedule$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
