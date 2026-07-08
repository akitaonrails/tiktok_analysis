package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMMarkdownAnalysis$reportMarkdownMessagePerf$1", f = "IMMarkdownAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1499505tx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499505tx(String str, long j, long j2, InterfaceC1364105Vn<? super C1499505tx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499505tx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMarkdownAnalysis@2704.reportMarkdownMessagePerf$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMMarkdownAnalysis@2704.reportMarkdownMessagePerf$1");
            return unit;
        }
        Set<String> set = C1499405tw.LIZIZ;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("IMMarkdownAnalysis@2704.reportMarkdownMessagePerf$1");
                    return unit2;
                }
                while (true) {
                    Set<String> set2 = C1499405tw.LIZIZ;
                    if (set2.size() >= 500) {
                        set2.remove(C13LP.LJJJJZ(set2));
                    } else {
                        set2.add(str);
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("update_duration", String.valueOf(this.LLILLJJLI)), new Pair("total_duration", String.valueOf(this.LLILLL)), new Pair("message_id", this.LL));
                        C0I0B.LJFF.LIZIZ();
                        C20684815ws.LJIILLIIL("ttsocial_im_markdown_message_perf", mapLJIIIIZZ);
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("IMMarkdownAnalysis@2704.reportMarkdownMessagePerf$1");
                        return unit3;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
