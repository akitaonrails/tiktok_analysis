package X;

import com.ss.android.ugc.aweme.account.hook.AfterLogoutHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startLogout$1", f = "AuthSequenceManager.kt", l = {254}, m = "invokeSuspend")
public final class C0NPE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0XVI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPE(C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPE(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("AuthSequenceManager@5a17.startLogout$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList = new ArrayList(ServiceManager.get().getServices(AfterLogoutHook.class));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Integer numLJ = C2286608xc.LJ(((AfterLogoutHook) obj2).LJII().getValue());
                Object arrayList2 = linkedHashMap.get(numLJ);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(numLJ, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            it2 = new TreeMap(linkedHashMap).entrySet().iterator();
        }
        while (it2.hasNext()) {
            C0NPF c0npf = new C0NPF((List) ((Map.Entry) it2.next()).getValue(), this.LLILLL, null);
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (C2296908zH.LIZIZ(c0npf, this) == objLJFF) {
                C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
