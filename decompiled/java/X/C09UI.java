package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09UI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.unlocktts.UnlockReadTextVoiceComponent$realFetchVoiceEffect$1", f = "UnlockReadTextVoiceComponent.kt", l = {139, 140, 161}, m = "invokeSuspend")
public final class C09UI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C19522411Zm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09UI(C19522411Zm c19522411Zm, InterfaceC1364105Vn<? super C09UI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19522411Zm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09UI(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map linkedHashMap;
        C1C7U.LIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C09UK c09uk = new C09UK(this.LLILLL, e, null);
            this.LL = null;
            this.LLILLJJLI = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c09uk) == objLJFF) {
                C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
                return unit2;
            }
            linkedHashMap = (Map) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            linkedHashMap = new LinkedHashMap();
            C2247008rE c2247008rE = new C2247008rE(this.LLILLL.H2(), linkedHashMap);
            Function1<EffectCategoryModel, Boolean> function1 = this.LLILLL.LLJJI;
            this.LL = linkedHashMap;
            this.LLILLJJLI = 1;
            obj = c2247008rE.LIZIZ(this, function1);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C09UJ c09uj = new C09UJ((List) obj, this.LLILLL, linkedHashMap, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        obj = C23250099c.LJI(this, abstractC2238408pq2, c09uj);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("UnlockReadTextVoiceComponent@2e46.realFetchVoiceEffect$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
