package X;

import android.content.Context;
import com.aweme.storage.StorageCleanServiceImpl;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CS5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoStorageHelperKt$tryClean$1", f = "TakoStorageHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CS5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CS5(Context context, InterfaceC1364105Vn<? super C0CS5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CS5 c0cs5 = new C0CS5(this.LLILLJJLI, interfaceC1364105Vn);
        c0cs5.LL = obj;
        return c0cs5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jCurrentTimeMillis;
        C1C7U.LIZ("TakoStorageHelperKt@6d47.tryClean$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LLILLJJLI;
        try {
            jCurrentTimeMillis = System.currentTimeMillis();
            C1860520yW2.LIZ.getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (jCurrentTimeMillis - C1860520yW2.LJIIL().getLong("tako_clean_low_storage", 0L) < 86400000) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoStorageHelperKt@6d47.tryClean$1");
            return unit;
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        final long jLJIILL = C2354709Kn.LJIILL();
        long j = 1024;
        if (jLJIILL < ((long) ((Number) C0B1J.LIZ.getValue()).intValue()) * j * j) {
            C0CS4.LIZ = true;
            C1860520yW2.LJIIL().storeLong("tako_clean_low_storage", System.currentTimeMillis());
            StorageCleanServiceImpl.LIZJ().LIZIZ(context, new C0CS6() { // from class: X.0CS8
                @Override // X.C0CS6
                public final void LIZ(long j2, boolean z) throws JSONException {
                    boolean z2;
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    if (z && j2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = jLJIILL;
                    long jLJIILL2 = C2354709Kn.LJIILL();
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                    c1862330yYx.getClass();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", z2);
                    jSONObject.put("storage_before_clean", j3);
                    jSONObject.put("storage_cleaned", j2);
                    jSONObject.put("storage_after_clean", jLJIILL2);
                    jSONObject.put("cost", jCurrentTimeMillis3);
                    c20235014FoLIZ.LIZIZ("tikbot_perf_clean_storage", jSONObject);
                }
            });
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            Npth.reportBizException("tako", thM5exceptionOrNullimpl, "clean storage error", C2097608Jq.LJ());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoStorageHelperKt@6d47.tryClean$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
