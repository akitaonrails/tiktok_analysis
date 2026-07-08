package X;

import Y.AgS292S0100000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0S6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem$startFoldableDescWindowLayoutInfoCollector$1", f = "VideoDescAssem.kt", l = {840}, m = "invokeSuspend")
public final class C715830S6b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ VideoDescAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715830S6b(C19EG c19eg, VideoDescAssem videoDescAssem, InterfaceC1364105Vn<? super C715830S6b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = videoDescAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C715830S6b(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDescAssem@83ef.startFoldableDescWindowLayoutInfoCollector$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C12LF c12lf = InterfaceC715840S6c.LIZ;
                C19EG c19eg = this.LLILLJJLI;
                c12lf.getClass();
                b bVarLJ = C09IC.LJ(new C12L9(C12LF.LIZ(c19eg), this.LLILLJJLI, null));
                AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(this.LLILLL, 15);
                this.LL = 1;
                if (bVarLJ.collect(agS292S0100000_11, this) == objLJFF) {
                    C1C7U.LIZIZ("VideoDescAssem@83ef.startFoldableDescWindowLayoutInfoCollector$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoDescAssem@83ef.startFoldableDescWindowLayoutInfoCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
