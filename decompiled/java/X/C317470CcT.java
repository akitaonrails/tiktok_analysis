package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.util.PhotoModeEditHelper$downloadAndEditPhoto$1$result$1", f = "PhotoModeEditHelper.kt", l = {53}, m = "invokeSuspend")
public final class C317470CcT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317470CcT(List<String> list, InterfaceC1364105Vn<? super C317470CcT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317470CcT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1$result$1");
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
                C1321600kUo c1321600kUo = C317480CcU.LIZIZ;
                List<String> list2 = this.LLILLJJLI;
                this.LL = 1;
                obj = c1321600kUo.LIZ(list2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1$result$1");
                    return objLJFF;
                }
            }
            list = (List) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            list = null;
        }
        C1C7U.LIZIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1$result$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
