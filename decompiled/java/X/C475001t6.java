package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabBar$applyTabLottie$1$composition$1", f = "TemplateTabBar.kt", l = {}, m = "invokeSuspend")
public final class C475001t6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1294720jnS>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475001t6(String str, InterfaceC1364105Vn<? super C475001t6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C475001t6 c475001t6 = new C475001t6(this.LLILLJJLI, interfaceC1364105Vn);
        c475001t6.LL = obj;
        return c475001t6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TemplateTabBar@4cc1.applyTabLottie$1$composition$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = null;
        try {
            C0VSP c0vsp = new C0VSP(this.LLILLJJLI);
            try {
                c098200Yq = C1294250jmh.LJFF(c0vsp, null);
                C2107108Nh.LIZ(c0vsp, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsp, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) c098200Yq;
        if (c1292000jj4 != null) {
            obj2 = c1292000jj4.LIZ;
        }
        C1C7U.LIZIZ("TemplateTabBar@4cc1.applyTabLottie$1$composition$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1294720jnS> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
