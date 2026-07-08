package X;

import android.graphics.Bitmap;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getBitmap$bitmaps$1", f = "MixEditingFeatureExtractionTask.kt", l = {}, m = "invokeSuspend")
public final class C2262508tj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2262608tk LLILLJJLI;
    public final /* synthetic */ C2277408w8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262508tj(C2262608tk c2262608tk, C2277408w8 c2277408w8, InterfaceC1364105Vn<? super C2262508tj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2262608tk;
        this.LLILLL = c2277408w8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2262508tj c2262508tj = new C2262508tj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c2262508tj.LL = obj;
        return c2262508tj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$bitmaps$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2262608tk c2262608tk = this.LLILLJJLI;
        C2277408w8 c2277408w8 = this.LLILLL;
        Object obj2 = null;
        try {
            C01GW c01gw = C2278808wM.LIZ;
            Bitmap bitmapLIZIZ = C2278808wM.LIZIZ(c2262608tk, c2277408w8.LJFF);
            if (bitmapLIZIZ != null) {
                c098200Yq = Collections.singletonList(bitmapLIZIZ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIIIZZ(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "load bitmap thumbnail failed, reason=" + thM5exceptionOrNullimpl);
            Npth.reportBizException("MIX_EDITING_FEATURE_EXTRACTION", thM5exceptionOrNullimpl, "[MIX_EDITING_FEATURE_EXTRACTION]load bitmap thumbnail failed, " + thM5exceptionOrNullimpl.getMessage(), C2097608Jq.LJ());
            C2269208uo c2269208uo = C2269208uo.LIZ;
            int iLIZIZ = C2294208yq.LIZIZ();
            c2269208uo.getClass();
            C2269208uo.LIZ(iLIZIZ, "MixEditingFeatureExtractionTask#getBitmap", "load bitmap thumbnail (reuse cocver) failed");
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list = (List) c098200Yq;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Npth.reportBizException("MIX_EDITING_FEATURE_EXTRACTION", new IllegalStateException("[MIX_EDITING_FEATURE_EXTRACTION]empty thumbnail"), "[MIX_EDITING_FEATURE_EXTRACTION]load bitmap thumbnail failed, empty", C2097608Jq.LJ());
            }
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getBitmap$bitmaps$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
