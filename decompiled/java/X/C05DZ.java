package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.preview.PublicGroupPreviewConversationLifecycle$prepare$1", f = "PublicGroupPreviewConversationLifecycle.kt", l = {48}, m = "invokeSuspend")
public final class C05DZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DZ(long j, InterfaceC1364105Vn<? super C05DZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05DZ c05dz = new C05DZ(this.LLILLL, interfaceC1364105Vn);
        c05dz.LLILLJJLI = obj;
        return c05dz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PublicGroupPreviewConversationLifecycle@fb8e.prepare$1");
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
                long j = this.LLILLL;
                C874100YQu c874100YQu = C874100YQu.LIZ;
                this.LL = 1;
                obj = c874100YQu.LIZLLL(j, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PublicGroupPreviewConversationLifecycle@fb8e.prepare$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        C1C7U.LIZIZ("PublicGroupPreviewConversationLifecycle@fb8e.prepare$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
