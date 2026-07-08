package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06EE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakPanelOpenMonitor$monitorStreakPanelOpen$1", f = "StreakPanelOpenMonitor.kt", l = {39}, m = "invokeSuspend")
public final class C06EE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06EE(String str, InterfaceC1364105Vn<? super C06EE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06EE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPanelOpenMonitor@7922.monitorStreakPanelOpen$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(20000L, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPanelOpenMonitor@7922.monitorStreakPanelOpen$1");
                return objLJFF;
            }
        }
        C06EW c06ewRemove = C06ED.LJ.remove(this.LLILLJJLI);
        if (c06ewRemove != null) {
            C06ED.LIZIZ.getClass();
            C06ED.LIZ(c06ewRemove, false, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPanelOpenMonitor@7922.monitorStreakPanelOpen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
