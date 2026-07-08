package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.messages.RunOnDbThreadKt$runOnDbThread$2", f = "RunOnDbThread.kt", l = {38}, m = "invokeSuspend")
public final class C865650Xxb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Object>>, Object> {
    public int LL;
    public final /* synthetic */ C0YEM LLILLJJLI;
    public final /* synthetic */ Function0<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865650Xxb(C0YEM c0yem, Function0<Object> function0, InterfaceC1364105Vn<? super C865650Xxb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yem;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865650Xxb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0Y6Q c0y6qLIZIZ;
        C1C7U.LIZ("RunOnDbThreadKt@d398.runOnDbThread$2");
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
                AbstractC2252651DEx abstractC2252651DExLIZIZ = this.LLILLJJLI.LJIIIIZZ().LIZIZ();
                C411501ir c411501ir = new C411501ir(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, abstractC2252651DExLIZIZ, c411501ir);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RunOnDbThreadKt@d398.runOnDbThread$2");
                    return objLJFF;
                }
            }
            c0y6qLIZIZ = C865670Xxd.LIZJ(obj);
        } catch (C0YPQ e) {
            TryCatchGuardChecker.doCheck(e);
            c0y6qLIZIZ = C865670Xxd.LIZIZ(e);
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            String message = e3.getMessage();
            if (message == null) {
                message = "Unknown DB error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, e3));
        }
        C1C7U.LIZIZ("RunOnDbThreadKt@d398.runOnDbThread$2");
        return c0y6qLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
