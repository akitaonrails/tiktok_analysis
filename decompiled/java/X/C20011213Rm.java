package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effectplatform.EffectStorageCleanServiceImpl$tryClean$1", f = "EffectStorageCleanServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C20011213Rm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectConfiguration LL;
    public final /* synthetic */ EffectManager LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20011213Rm(EffectConfiguration effectConfiguration, EffectManager effectManager, Function0<Unit> function0, InterfaceC1364105Vn<? super C20011213Rm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectConfiguration;
        this.LLILLJJLI = effectManager;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20011213Rm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectStorageCleanServiceImpl@8d4d.tryClean$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            ArrayList<String> arrayListLJJJJL = EffectPlatform.LJJJJL(true);
            C201955140j.LIZIZ("EffectStorageClean", "configuration.draftList:" + arrayListLJJJJL);
            InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(this.LL.getEffectDir().getAbsolutePath());
            if (interfaceC20004513OxLIZ != null) {
                interfaceC20004513OxLIZ.LJIIL(arrayListLJJJJL);
            }
            if (C297640Bla.LIZ()) {
                if (!C571880Mbq.LIZIZ) {
                    C571880Mbq.LIZ(C571880Mbq.LIZ);
                }
                ArrayList<String> arrayList = C571880Mbq.LJFF;
                C201955140j.LIZIZ("EffectStorageClean", "effect model allow list: " + arrayList);
                InterfaceC20004513Ox interfaceC20004513OxLIZ2 = C19996613Lw.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI(""));
                if (interfaceC20004513OxLIZ2 != null) {
                    interfaceC20004513OxLIZ2.LJIIL(arrayList);
                }
            }
            long jLongValue = ((Number) C300080BpW.LIZIZ.getValue()).longValue();
            if (C19997713Mh.LIZIZ) {
                this.LLILLJJLI.triggerCacheClean(jLongValue);
            } else {
                C2286608xc.LJFF(this.LLILLJJLI.removeUnused(jLongValue));
            }
            this.LLILLL.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectStorageCleanServiceImpl@8d4d.tryClean$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
