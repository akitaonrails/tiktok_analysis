package X;

import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startLoginSuccess$1", f = "AuthSequenceManager.kt", l = {75}, m = "invokeSuspend")
public final class C0NPN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AfterLoginHook LLILLL;
    public final /* synthetic */ C0XVI LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPN(AfterLoginHook afterLoginHook, C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = afterLoginHook;
        this.LLILZ = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("AuthSequenceManager@5a17.startLoginSuccess$1");
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
            ArrayList arrayList = new ArrayList(ServiceManager.get().getServices(AfterLoginHook.class));
            AfterLoginHook afterLoginHook = this.LLILLL;
            if (afterLoginHook != null) {
                arrayList.add(afterLoginHook);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Integer numLJ = C2286608xc.LJ(((AfterLoginHook) obj2).LIZJ().getValue());
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
            C0NPL c0npl = new C0NPL((List) ((Map.Entry) it2.next()).getValue(), this.LLILZ, null);
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (C2296908zH.LIZIZ(c0npl, this) == objLJFF) {
                C1C7U.LIZIZ("AuthSequenceManager@5a17.startLoginSuccess$1");
                return objLJFF;
            }
        }
        CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
        C0XV8.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLoginSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
