package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.063h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoImageC2PAManager$ensureC2PASdkReady$4", f = "TakoImageC2PAManager.kt", l = {155}, m = "invokeSuspend")
public final class C15455063h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15455063h(Context context, InterfaceC1364105Vn<? super C15455063h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15455063h c15455063h = new C15455063h(this.LLILZ, interfaceC1364105Vn);
        c15455063h.LLILLL = obj;
        return c15455063h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TakoImageC2PAManager@c341.ensureC2PASdkReady$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            Context context = this.LLILZ;
            this.LLILLL = interfaceC497601wk;
            this.LL = context;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            try {
                C140D.LIZ.LJJIIJZLJL(context, new AwS246S0300000_2(interfaceC497601wk, c2252611DEt, context, 25), new AwS581S0100000_2(c2252611DEt, 505));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(false);
                c2252611DEt.resumeWith(false);
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoImageC2PAManager@c341.ensureC2PASdkReady$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoImageC2PAManager@c341.ensureC2PASdkReady$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
