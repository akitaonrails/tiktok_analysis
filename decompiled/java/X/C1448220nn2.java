package X;

import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448220nn2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0LAB LL;
    public final /* synthetic */ C1448240nn4 LLILLJJLI;
    public final /* synthetic */ u LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448220nn2(C0LAB c0lab, C1448240nn4 c1448240nn4, u uVar, long j) {
        super(0);
        this.LL = c0lab;
        this.LLILLJJLI = c1448240nn4;
        this.LLILLL = uVar;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Long lLJIILIIL;
        u.LLJLIL.getClass();
        if (C1448310nnB.LIZ()) {
            String strLJIIIIZZ = this.LL.LJIIIIZZ("prop_effect_end_timestamp");
            this.LL.LIZIZ(((strLJIIIIZZ == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLJIIIIZZ)) == null) ? System.currentTimeMillis() : lLJIILIIL.longValue()) - this.LLILLJJLI.LIZIZ, "duration");
        }
        if (this.LLILLL.k5()) {
            this.LLILLL.X1(this.LL, this.LLILZ);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_prop_apply_total", this.LL.LIZ);
        return Unit.LIZ;
    }
}
