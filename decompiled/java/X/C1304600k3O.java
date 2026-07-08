package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.tracker.JniTrackerNativeApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicAssertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRustMonitorConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl$addNode$$inlined$postAction$1", f = "TrackerImpl.kt", l = {272}, m = "invokeSuspend")
public final class C1304600k3O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C927240aEk LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304600k3O(InterfaceC1364105Vn interfaceC1364105Vn, C927240aEk c927240aEk, String str, String str2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c927240aEk;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1304600k3O(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TrackerImpl@989c.addNode$$inlined$postAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C099G c099g = C1304610k3P.LIZJ;
                this.LL = 1;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TrackerImpl@989c.addNode$$inlined$postAction$1");
                    return objLJFF;
                }
            }
            if (((Boolean) ((Pair) obj).getSecond()).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Node(");
                sbLIZ.append(this.LLILLJJLI.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(this.LLILLJJLI.LIZIZ);
                sbLIZ.append(") Add: \n\t ");
                sbLIZ.append(this.LLILLL);
                C939210aY3.LIZ(C2188811AlT.LIZIZ(sbLIZ), "Node");
                String str = this.LLILZ;
                C927240aEk c927240aEk = this.LLILLJJLI;
                JniTrackerNativeApi.nativeSaveNode(str, c927240aEk.LIZ, c927240aEk.LIZIZ, c927240aEk.LIZJ);
                c098200Yq = Unit.LIZ;
            } else {
                C939210aY3.LIZIZ("call Tracker with error Init", "");
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
            C939210aY3.LIZIZ("call tracker native error: " + thM5exceptionOrNullimpl.getMessage(), "CallException");
            if (C1304630k3R.LIZIZ && LinkMicAssertSetting.INSTANCE.enable()) {
                throw new AssertionError(thM5exceptionOrNullimpl);
            }
            if (LinkMicRustMonitorConfigSetting.INSTANCE.canReport()) {
                C1304660k3U.LIZ.LIZIZ(520, "call tracker error", thM5exceptionOrNullimpl, null);
            }
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("TrackerImpl@989c.addNode$$inlined$postAction$1");
        return obj2;
    }
}
