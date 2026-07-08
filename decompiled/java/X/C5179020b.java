package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5179020b extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C5179020b c5179020b) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C238400w2 c238400w2 = (C238400w2) c5179020b.l0;
        if (jElapsedRealtime - c238400w2.element >= c5179020b.j2) {
            c238400w2.element = SystemClock.elapsedRealtime();
            ((Function0) c5179020b.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C5179020b c5179020b) {
        C01EB c01ebLJIIL;
        BaseCountdownViewModel baseCountdownViewModel = (BaseCountdownViewModel) c5179020b.l0;
        String str = ((C299601Ec) c5179020b.l1).LIZJ;
        baseCountdownViewModel.getClass();
        Long lWQ2 = BaseCountdownViewModel.wQ2(str);
        if (lWQ2 != null) {
            long jLongValue = lWQ2.longValue();
            BaseCountdownViewModel baseCountdownViewModel2 = (BaseCountdownViewModel) c5179020b.l0;
            String str2 = ((C299601Ec) c5179020b.l1).LIZJ;
            baseCountdownViewModel2.getClass();
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ != null) {
                c01ebLJIIL = interfaceC421301kRLIZIZ.LJIIL(str2);
            } else {
                c01ebLJIIL = null;
            }
            if (jLongValue == 0 && c01ebLJIIL == C01EB.ONGOING) {
                String tag = ((BaseCountdownViewModel) c5179020b.l0).getTag();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c5179020b.j2);
                sbLIZ.append(" second, client  manually change finish state");
                C1AZW.LJIIJ(12, tag, C2188811AlT.LIZIZ(sbLIZ), null, null);
                ((BaseCountdownViewModel) c5179020b.l0).CQ2((C299601Ec) c5179020b.l1, "other");
                BaseCountdownViewModel baseCountdownViewModel3 = (BaseCountdownViewModel) c5179020b.l0;
                String str3 = ((C299601Ec) c5179020b.l1).LIZJ;
                baseCountdownViewModel3.getClass();
                InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
                if (interfaceC421301kRLIZIZ2 != null) {
                    interfaceC421301kRLIZIZ2.LIZLLL(str3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C5179020b c5179020b) {
        HandlerHook.viewPostDelay((View) c5179020b.l0, new RunnableC514801zW((Function0) c5179020b.l1, (Function0<Unit>) 162), c5179020b.j2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5179020b(long j, View view, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.j2 = j;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:X.020b) (LINE:67174407) X.020b.l1 java.lang.Object, block:B:2:0x0000 */
    public C5179020b(C238400w2 c238400w2, C238400w2 c238400w22, long j, Function0<Unit> function0) {
        Object obj;
        super(0);
        this.$t = function0;
        this.l0 = c238400w2;
        this.j2 = c238400w22;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5179020b(BaseCountdownViewModel baseCountdownViewModel, C299601Ec c299601Ec, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseCountdownViewModel;
        this.l1 = c299601Ec;
        this.j2 = j;
    }
}
