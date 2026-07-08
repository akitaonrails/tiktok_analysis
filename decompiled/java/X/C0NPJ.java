package X;

import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
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

/* JADX INFO: renamed from: X.0NPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startSwitchSuccess$1", f = "AuthSequenceManager.kt", l = {163}, m = "invokeSuspend")
public final class C0NPJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0XVI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPJ(C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPJ(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("AuthSequenceManager@5a17.startSwitchSuccess$1");
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
            ArrayList arrayList = new ArrayList(ServiceManager.get().getServices(AfterSwitchAccountHook.class));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Integer numLJ = C2286608xc.LJ(((AfterSwitchAccountHook) obj2).LJFF().getValue());
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
            C0NPH c0nph = new C0NPH((List) ((Map.Entry) it2.next()).getValue(), this.LLILLL, null);
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (C2296908zH.LIZIZ(c0nph, this) == objLJFF) {
                C1C7U.LIZIZ("AuthSequenceManager@5a17.startSwitchSuccess$1");
                return objLJFF;
            }
        }
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.LIZIZ();
        }
        CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
        C0XV8.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startSwitchSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
