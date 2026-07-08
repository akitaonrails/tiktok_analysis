package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager$clearApis$1", f = "EcomApiLifecycleManager.kt", l = {}, m = "invokeSuspend")
public final class C08ZL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZL(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZL(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomApiLifecycleManager@22cc.clearApis$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<C08ZM, ArrayList<WeakReference<C0X9S<?>>>> map = EcomApiLifecycleManager.LIZLLL;
        List<String> list = this.LL;
        String str = this.LLILLJJLI;
        synchronized (map) {
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C08ZM c08zm = new C08ZM(it2.next(), str);
                    ArrayList arrayList = (ArrayList) ((LinkedHashMap) EcomApiLifecycleManager.LIZLLL).get(c08zm);
                    if (arrayList != null) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C0X9S c0x9s = (C0X9S) ((WeakReference) it3.next()).get();
                            if (c0x9s != null) {
                                c0x9s.cancel();
                            }
                        }
                    }
                    EcomApiLifecycleManager.LIZLLL.remove(c08zm);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomApiLifecycleManager@22cc.clearApis$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
