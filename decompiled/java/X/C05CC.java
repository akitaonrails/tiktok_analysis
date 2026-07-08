package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.utils.aigc.AIGCArchNewFrameworkDraftTools$restoreWorkflowsByCreationIds$overallResult$1$1$1", f = "AIGCArchNewFrameworkDraftTools.kt", l = {73}, m = "invokeSuspend")
public final class C05CC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<C552940LmO> LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CC(String str, List<C552940LmO> list, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C05CC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchNewFrameworkDraftTools@d6e0.restoreWorkflowsByCreationIds$overallResult$1$1$1");
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
                C545110LZl c545110LZl = C545110LZl.LIZ;
                String str = this.LLILLJJLI;
                List<C552940LmO> list = this.LLILLL;
                LifecycleOwner lifecycleOwner = this.LLILZ;
                this.LL = 1;
                if (c545110LZl.LIZIZ(str, list, lifecycleOwner, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCArchNewFrameworkDraftTools@d6e0.restoreWorkflowsByCreationIds$overallResult$1$1$1");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gradeDown failed for creationId=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(": ");
            sbLIZ.append(e2.getMessage());
            C201955140j.LJII(c0lx3, C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCArchNewFrameworkDraftTools@d6e0.restoreWorkflowsByCreationIds$overallResult$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
