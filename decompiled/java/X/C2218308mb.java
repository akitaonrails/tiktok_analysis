package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.api.DeferredApiCall$1", f = "CommentReusePermissionChecker.kt", l = {31}, m = "invokeSuspend")
public final class C2218308mb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2232208oq<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2218308mb(C2232208oq<Object> c2232208oq, InterfaceC1364105Vn<? super C2218308mb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2232208oq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2218308mb c2218308mb = new C2218308mb(this.LLILLL, interfaceC1364105Vn);
        c2218308mb.LLILLJJLI = obj;
        return c2218308mb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DeferredApiCall@dff.<init>$1");
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
                Function1<InterfaceC1364105Vn<? super Object>, Object> function1 = this.LLILLL.LIZIZ;
                this.LL = 1;
                obj = function1.invoke(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DeferredApiCall@dff.<init>$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            obj = new C098200Yq(th);
            C189200o6.m2constructorimpl(obj);
        }
        C099F c099f = this.LLILLL.LIZJ;
        if (c099f != null) {
            if (C189200o6.m7isFailureimpl(obj)) {
                obj = null;
            }
            Boolean.valueOf(c099f.LJJLIIIJILLIZJL(obj));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DeferredApiCall@dff.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
