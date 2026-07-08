package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Yhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.activitystatus.ChatListActivityStatusUpdater$getActivityStatusUpdateListener$1$onActivityStatusUpdate$2", f = "ChatListActivityStatusUpdater.kt", l = {}, m = "invokeSuspend")
public final class C881330Yhn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C881970Yip LL;
    public final /* synthetic */ Map<String, C595660NXw> LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881330Yhn(C881970Yip c881970Yip, Map<String, C595660NXw> map, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C881330Yhn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c881970Yip;
        this.LLILLJJLI = map;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881330Yhn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objPutIfAbsent;
        C1C7U.LIZ("ChatListActivityStatusUpdater@b813.getActivityStatusUpdateListener$1$onActivityStatusUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveActivityStatusData size=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", page=");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LL.LLJ.getValue();
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        Object c881350Yhp = concurrentHashMap.get(interfaceC879010Ye3);
        if (c881350Yhp == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC879010Ye3, (c881350Yhp = new C881350Yhp()))) != null) {
            c881350Yhp = objPutIfAbsent;
        }
        C881350Yhp c881350Yhp2 = (C881350Yhp) c881350Yhp;
        Iterator<T> it2 = this.LLILLJJLI.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.LJFF(((ConcurrentHashMap) c881350Yhp2.LIZIZ.getValue()).get(key), value)) {
                ((ConcurrentHashMap) c881350Yhp2.LIZIZ.getValue()).put(key, value);
                Object obj2 = ((ConcurrentHashMap) c881350Yhp2.LIZ.getValue()).get(key);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListActivityStatusUpdater@b813.getActivityStatusUpdateListener$1$onActivityStatusUpdate$2");
            return unit;
        }
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJLI = this.LL.LJIJJLI();
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILLL;
        C881970Yip c881970Yip = this.LL;
        Iterator<InterfaceC1482905rH> it3 = copyOnWriteArrayListLJIJJLI.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(interfaceC879010Ye32, arrayList, c881970Yip.LIZIZ(), c881970Yip.LLILLJJLI);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListActivityStatusUpdater@b813.getActivityStatusUpdateListener$1$onActivityStatusUpdate$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
