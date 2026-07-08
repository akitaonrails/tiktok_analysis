package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PBP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils.SearchAutoplayMonitor$Tracker$job$1$1", f = "SearchAutoplayMonitor.kt", l = {57}, m = "invokeSuspend")
public final class C0PBP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0PBQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PBP(C0PBQ c0pbq, InterfaceC1364105Vn<? super C0PBP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0pbq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0PBP c0pbp = new C0PBP(this.LLILLL, interfaceC1364105Vn);
        c0pbp.LLILLJJLI = obj;
        return c0pbp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN;
        DynamicPatch dynamicPatch;
        C1C7U.LIZ("SearchAutoplayMonitor$Tracker@ff58.job$1$1");
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
            Object obj2 = this.LLILLJJLI;
            long j = ((long) this.LLILLL.LIZ) * 1000;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAutoplayMonitor$Tracker@ff58.job$1$1");
                return objLJFF;
            }
        }
        C0PBQ c0pbq = this.LLILLL;
        try {
            InterfaceC648350Pbt interfaceC648350Pbt = c0pbq.LIZJ;
            str = null;
            if (interfaceC648350Pbt instanceof ViewOnAttachStateChangeListenerC648030PbN) {
                viewOnAttachStateChangeListenerC648030PbN = (ViewOnAttachStateChangeListenerC648030PbN) interfaceC648350Pbt;
            } else {
                viewOnAttachStateChangeListenerC648030PbN = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (viewOnAttachStateChangeListenerC648030PbN != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx:");
            WeakReference<DynamicPatch> weakReference = viewOnAttachStateChangeListenerC648030PbN.LLJILJILJ;
            if (weakReference != null && (dynamicPatch = weakReference.get()) != null) {
                str = dynamicPatch.schema;
            }
            sbLIZ.append(C649470Pdh.LJ(str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                C0PG3 c0pg3 = c0pbq.LIZIZ;
                if (c0pg3 != C0PG3.PLAYER_GET_CALLED) {
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = new Pair("stage", String.valueOf(c0pg3.ordinal()));
                    pairArr[1] = new Pair("card_name", strLIZIZ);
                    String str2 = c0pbq.LIZLLL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    pairArr[2] = new Pair("playAid", str2);
                    C20684815ws.LJIILLIIL("search_autoplay_monitor", C2097608Jq.LJIIIIZZ(pairArr));
                    c0pbq.LIZIZ = C0PG3.REPORTED;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchAutoplayMonitor$Tracker@ff58.job$1$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchAutoplayMonitor$Tracker@ff58.job$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
