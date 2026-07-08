package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.SkeletonDismissTimeConfig;
import com.ss.android.ugc.aweme.slash.component.SlashConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0grB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.plugin.SlashSerialLoadPlugin$tryComponentTimeOut$job$1", f = "SlashSerialLoadPlugin.kt", l = {204, 205}, m = "invokeSuspend")
public final class C1181710grB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1180920gpu LLILLJJLI;
    public final /* synthetic */ C1181730grD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181710grB(C1180920gpu c1180920gpu, C1181730grD c1181730grD, InterfaceC1364105Vn<? super C1181710grB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1180920gpu;
        this.LLILLL = c1181730grD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1181710grB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        SlashConfig slashConfig;
        SkeletonDismissTimeConfig skeletonDismissTimeConfig;
        Integer num;
        C1C7U.LIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        this.LLILLL.LLILZLL.remove(this.LLILLJJLI.LIZ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                BaseComponentData baseComponentData = this.LLILLJJLI.LIZLLL;
                if (baseComponentData != null && (slashConfig = baseComponentData.slashConfig) != null && (skeletonDismissTimeConfig = slashConfig.asyncLoadTimeOutMs) != null && (num = skeletonDismissTimeConfig.androidMs) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 4000;
                }
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(iIntValue, this) == objLJFF) {
                    C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1");
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1181720grC c1181720grC = new C1181720grC(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1181720grC) == objLJFF) {
                C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1");
                return objLJFF;
            }
            this.LLILLL.LLILZLL.remove(this.LLILLJJLI.LIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SlashSerialLoadPlugin@753b.tryComponentTimeOut$job$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LLILZLL.remove(this.LLILLJJLI.LIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
