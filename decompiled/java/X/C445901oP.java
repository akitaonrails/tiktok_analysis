package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask$prepare$preSchedule$1", f = "OpenLivePreparationTask.kt", l = {147}, m = "invokeSuspend")
public final class C445901oP extends C09AX implements Function1<InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public int LL;

    public C445901oP(InterfaceC1364105Vn<? super C445901oP> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445901oP(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return new C445901oP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LifecycleCoroutineScope lifecycleScope;
        Object c098200Yq;
        C1C7U.LIZ("OpenLivePreparationTask@f498.prepare$preSchedule$1");
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
            LifecycleOwner lifecycleOwner = OpenLivePreparationTask.LJI;
            if (lifecycleOwner != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
            } else {
                lifecycleScope = null;
            }
            if (lifecycleScope != null) {
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                try {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).requestPreSchedule(lifecycleScope, new C5183020f(c2252611DEt, 140));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    C20441214yg.LJ("OpenLivePreparationTask", "preSchedule failed");
                }
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OpenLivePreparationTask@f498.prepare$preSchedule$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1C7U.LIZIZ("OpenLivePreparationTask@f498.prepare$preSchedule$1");
        return obj;
    }
}
