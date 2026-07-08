package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526080poc extends C09AY implements Function0<List<InterfaceC1526120pog<EnumC1526180pom>>> {
    public C1526080poc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1526120pog<EnumC1526180pom>> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1526120pog<EnumC1526180pom>() { // from class: X.0poT
            @Override // X.InterfaceC1526120pog
            public final boolean LIZ(EnumC1526180pom enumC1526180pom) {
                if (enumC1526180pom != EnumC1526180pom.Init && enumC1526180pom != EnumC1526180pom.Switch) {
                    return false;
                }
                return true;
            }

            public static C443120HZe LIZJ(C1527010pq7 c1527010pq7, List list) {
                List<C801490VcJ> arrayList2;
                String str;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C1527020pq8) it2.next()).topic_type);
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList3);
                ArrayList<C1527020pq8> arrayList4 = new ArrayList();
                for (Object obj : list) {
                    C1527020pq8 c1527020pq8 = (C1527020pq8) obj;
                    if (c1527020pq8.topic_type != EnumC1525890poJ.CustomTopic || c1527020pq8.topic_status == EnumC1527240pqU.Active) {
                        arrayList4.add(obj);
                    }
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                for (C1527020pq8 c1527020pq82 : arrayList4) {
                    arrayList5.add(new Pair(String.valueOf(c1527020pq82.sync_id), c1527020pq82));
                }
                Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList5);
                Set setKeySet = mapLJIILLIIL.keySet();
                try {
                    arrayList2 = ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJII(new C1526010poV(c1527010pq7.f212did, c1527010pq7.uid));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList2 = new ArrayList<>();
                }
                ArrayList arrayList6 = new ArrayList();
                for (C801490VcJ c801490VcJ : arrayList2) {
                    if (setLLIIJI.contains(c801490VcJ.LIZLLL)) {
                        arrayList6.add(c801490VcJ);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList6) {
                    if (!setKeySet.contains(((C801490VcJ) obj2).LIZ)) {
                        arrayList7.add(obj2);
                    }
                }
                ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(((C801490VcJ) it3.next()).LIZ);
                }
                ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (C801490VcJ c801490VcJ2 : arrayList2) {
                    arrayList9.add(new Pair(c801490VcJ2.LIZ, c801490VcJ2));
                }
                Map mapLJIILLIIL2 = C2097608Jq.LJIILLIIL(arrayList9);
                ArrayList arrayList10 = new ArrayList();
                for (Map.Entry entry : mapLJIILLIIL.entrySet()) {
                    C801490VcJ c801490VcJ3 = (C801490VcJ) mapLJIILLIIL2.get(entry.getKey());
                    if (c801490VcJ3 == null) {
                        c801490VcJ3 = new C801490VcJ();
                    }
                    C1527020pq8 c1527020pq83 = (C1527020pq8) entry.getValue();
                    c801490VcJ3.LIZ = String.valueOf(c1527020pq83.sync_id);
                    c801490VcJ3.LIZIZ = c1527010pq7.f212did;
                    EnumC1527250pqV enumC1527250pqV = c1527020pq83.bucket;
                    if (enumC1527250pqV == EnumC1527250pqV.Device) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = c1527010pq7.uid;
                    }
                    c801490VcJ3.LIZJ = str;
                    c801490VcJ3.LJ = enumC1527250pqV;
                    c801490VcJ3.LIZLLL = c1527020pq83.topic_type;
                    if (c1527020pq83.ref_cursor.longValue() > c801490VcJ3.LJI) {
                        c801490VcJ3.LJI = c1527020pq83.ref_cursor.longValue();
                    }
                    arrayList10.add(c801490VcJ3);
                }
                ArrayList arrayList11 = new ArrayList();
                for (C1527020pq8 c1527020pq84 : mapLJIILLIIL.values()) {
                    List<C1527130pqJ> list2 = c1527020pq84.packets;
                    if (list2 != null) {
                        for (C1527130pqJ c1527130pqJ : list2) {
                            if (c1527130pqJ != null) {
                                C801550VcP c801550VcP = new C801550VcP();
                                c801550VcP.LIZ = c1527130pqJ.payload.business.intValue();
                                c801550VcP.LIZJ = c1527020pq84.bucket;
                                c801550VcP.LIZIZ = c1527130pqJ.payload.consume_type;
                                arrayList11.add(c801550VcP);
                            }
                        }
                    }
                }
                return new C443120HZe(arrayList8, arrayList10, arrayList11);
            }

            @Override // X.InterfaceC1526120pog
            public final void LIZIZ(C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
                C1527890prX.LIZJ(Intrinsics.LJIIJJI("recv init msg , try send msg to server", "[InitMsgHandler] "));
                try {
                    C443120HZe c443120HZeLIZJ = LIZJ(c1527010pq7, list);
                    List<String> list2 = (List) c443120HZeLIZJ.getFirst();
                    ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJZZIII((List) c443120HZeLIZJ.getSecond(), list2, (List) c443120HZeLIZJ.getThird());
                    ((InterfaceC1526270pov) C808470VnZ.LIZ(InterfaceC1526270pov.class)).LIZ();
                    ((InterfaceC1526030poX) C808470VnZ.LIZ(InterfaceC1526030poX.class)).LIZ();
                    ((InterfaceC1526020poW) C808470VnZ.LIZ(InterfaceC1526020poW.class)).LJJIJL();
                    try {
                        ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
                        throw null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1527890prX.LIZIZ(Intrinsics.LJIIJJI(th2, " recv init msg err:"));
                }
            }
        });
        return arrayList;
    }
}
