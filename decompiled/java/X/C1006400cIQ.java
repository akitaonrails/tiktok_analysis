package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.flow.MinisInstantPlayLoadFlow$startLoad$job$1", f = "MinisInstantPlayLoadFlow.kt", l = {}, m = "invokeSuspend")
public final class C1006400cIQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1006440cIU LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006400cIQ(C1006440cIU c1006440cIU, String str, InterfaceC1364105Vn<? super C1006400cIQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1006440cIU;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006400cIQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1006410cIR interfaceC1006410cIRLIZIZ;
        boolean z;
        C1C7U.LIZ("MinisInstantPlayLoadFlow@9679.startLoad$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startLoad fail cardId=");
            sbLIZ.append(this.LL.LIZ);
            sbLIZ.append(" reason=noActivity");
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
            this.LL.LJ(EnumC1006480cIY.FAILED, C2286608xc.LJ(-2), "main activity is not ready");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.startLoad$job$1");
            return unit;
        }
        IMiniGameRenderService iMiniGameRenderService = (IMiniGameRenderService) PluggableExtentionKt.pluggableSpi$default(IMiniGameRenderService.class, false, false, false, 14, null);
        if (iMiniGameRenderService != null && (interfaceC1006410cIRLIZIZ = iMiniGameRenderService.LIZIZ(activityLIZ, this.LLILLJJLI)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startLoad render created cardId=");
            sbLIZ2.append(this.LL.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1007120cJa.LIZ();
            C1006440cIU c1006440cIU = this.LL;
            synchronized (c1006440cIU.LIZLLL) {
                try {
                    if (!c1006440cIU.LJI) {
                        c1006440cIU.LJFF = interfaceC1006410cIRLIZIZ;
                        interfaceC1006410cIRLIZIZ.LIZLLL(c1006440cIU.LJIIZILJ);
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!z) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("startLoad post-release destroy cardId=");
                sbLIZ3.append(this.LL.LIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1007120cJa.LIZ();
                interfaceC1006410cIRLIZIZ.destroy();
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.startLoad$job$1");
                return unit2;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.startLoad$job$1");
            return unit3;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startLoad fail cardId=");
        sbLIZ4.append(this.LL.LIZ);
        sbLIZ4.append(" reason=noRender");
        C2188811AlT.LIZIZ(sbLIZ4);
        C1007120cJa.LIZ();
        this.LL.LJ(EnumC1006480cIY.FAILED, C2286608xc.LJ(-3), "mini game render is not available");
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("MinisInstantPlayLoadFlow@9679.startLoad$job$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
