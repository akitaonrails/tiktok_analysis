package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$preloadedMaterialAuthKey$1", f = "ReportSession.kt", l = {66}, m = "invokeSuspend")
public final class C508001yQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1735750vGn>, Object> {
    public int LL;
    public final /* synthetic */ C508401yU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508001yQ(C508401yU c508401yU, InterfaceC1364105Vn<? super C508001yQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c508401yU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C508001yQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1735750vGn c1735750vGn;
        C1C7U.LIZ("ReportSession@cd97.preloadedMaterialAuthKey$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C508401yU c508401yU = this.LLILLJJLI;
                this.LL = 1;
                c508401yU.getClass();
                obj = C508401yU.LIZLLL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReportSession@cd97.preloadedMaterialAuthKey$1");
                    return objLJFF;
                }
            }
            c1735750vGn = (C1735750vGn) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1735750vGn = null;
        }
        C1C7U.LIZIZ("ReportSession@cd97.preloadedMaterialAuthKey$1");
        return c1735750vGn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1735750vGn> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
