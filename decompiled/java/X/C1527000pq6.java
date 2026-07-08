package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527000pq6 implements InterfaceC1525730po3 {
    public final Context LL;
    public final InterfaceC1527530pqx LLILLJJLI;

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJI() {
        /*
            java.lang.Class<X.0ppF> r0 = X.InterfaceC1526470ppF.class
            X.0VnY r0 = X.C808470VnZ.LIZ(r0)
            X.0ppF r0 = (X.InterfaceC1526470ppF) r0
            java.util.Map r1 = r0.getCommonParams()
            if (r1 != 0) goto L13
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L13:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L53
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L53
            r3.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L53
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L2f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L53
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L4b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L53
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L53
            goto L2f
        L4b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L53
            throw r1     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1527000pq6.LJI():org.json.JSONObject");
    }

    @Override // X.InterfaceC1525730po3
    public final boolean LJIIIIZZ() {
        return this.LLILLJJLI.LJIIIIZZ();
    }

    @Override // X.InterfaceC1525730po3
    public final void LJJIJIIJIL(List<? extends C0WYW> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1525900poK interfaceC1525900poK = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
        HashMap map = new HashMap();
        map.put(Integer.valueOf(EnumC1527590pr3.Params.getValue()), ByteString.encodeUtf8(C786410Ut5.J3(LJI())));
        C1527100pqG c1527100pqG = new C1527100pqG();
        c1527100pqG.LIZLLL = EnumC1527210pqR.V4;
        c1527100pqG.LJFF = c1526010poVLIZIZ.LIZ;
        c1527100pqG.LJ = c1526010poVLIZIZ.LIZIZ;
        c1527100pqG.LJI = Long.valueOf(jCurrentTimeMillis);
        c1527100pqG.LJIIIIZZ = "-1";
        c1527100pqG.LJIIJ = EnumC1527220pqS.android;
        C1516540pZE.LIZIZ(map);
        c1527100pqG.LJIIJJI = map;
        C1527010pq7 c1527010pq7Build = c1527100pqG.build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = ((C0WYW) obj).LIZ;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        try {
            List<C801490VcJ> listLJIILJJIL = interfaceC1525900poK.LJIILJJIL(C13LP.LLIIII(linkedHashMap.keySet()));
            ArrayList arrayList3 = new ArrayList();
            for (C801490VcJ c801490VcJ : listLJIILJJIL) {
                List<C0WYW> list2 = (List) linkedHashMap.get(c801490VcJ.LIZ);
                if (list2 != null) {
                    C1527110pqH c1527110pqH = new C1527110pqH();
                    c1527110pqH.LIZLLL = EnumC1527170pqN.FIN;
                    c1527110pqH.LJFF = c801490VcJ.LIZLLL;
                    c1527110pqH.LJI = Long.valueOf(CastLongProtector.parseLong(c801490VcJ.LIZ));
                    c1527110pqH.LJII = Long.valueOf(c801490VcJ.LJFF);
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (C0WYW c0wyw : list2) {
                        C1527150pqL c1527150pqL = new C1527150pqL();
                        C1527230pqT c1527230pqT = new C1527230pqT();
                        c1527230pqT.LIZLLL = Long.valueOf(c0wyw.LIZLLL);
                        c1527150pqL.LIZLLL = c1527230pqT.build();
                        C1527200pqQ c1527200pqQ = new C1527200pqQ();
                        c1527200pqQ.LIZLLL = Integer.valueOf((int) c0wyw.LJI);
                        c1527200pqQ.LJ = c0wyw.LJII;
                        c1527200pqQ.LJI = ByteString.EMPTY;
                        c1527150pqL.LJ = c1527200pqQ.build();
                        c1527150pqL.LJIIJ = Long.valueOf(jCurrentTimeMillis);
                        arrayList4.add(c1527150pqL.build());
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    C1516540pZE.LIZ(arrayList5);
                    c1527110pqH.LJIIIZ = arrayList5;
                    arrayList3.add(c1527110pqH.build());
                }
            }
            C1527190pqP c1527190pqP = new C1527190pqP();
            c1527190pqP.LIZLLL = c1527010pq7Build;
            C1516540pZE.LIZ(arrayList3);
            c1527190pqP.LJ = arrayList3;
            C1527060pqC c1527060pqCBuild = c1527190pqP.build();
            C1527500pqu c1527500pqu = new C1527500pqu();
            c1527500pqu.LIZIZ = true;
            c1527500pqu.LIZ = c1527060pqCBuild;
            this.LLILLJJLI.LJJLIIIJL(c1527500pqu);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1526300poy.LIZLLL(null, th);
        }
    }

    public C1527000pq6(Context context, InterfaceC1527530pqx interfaceC1527530pqx) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1527530pqx;
    }

    @Override // X.InterfaceC1525730po3
    public final void LJIILLIIL(int i, boolean z) {
        InterfaceC1525900poK interfaceC1525900poK = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
        try {
            List<C801490VcJ> listLJJII = interfaceC1525900poK.LJJII(c1526010poVLIZIZ);
            HashMap map = new HashMap();
            map.put(Integer.valueOf(EnumC1527590pr3.Params.getValue()), ByteString.encodeUtf8(C786410Ut5.J3(LJI())));
            C1527100pqG c1527100pqG = new C1527100pqG();
            c1527100pqG.LIZLLL = EnumC1527210pqR.V4;
            c1527100pqG.LJFF = c1526010poVLIZIZ.LIZ;
            c1527100pqG.LJ = c1526010poVLIZIZ.LIZIZ;
            c1527100pqG.LJI = Long.valueOf(System.currentTimeMillis());
            c1527100pqG.LJIIIIZZ = "-1";
            c1527100pqG.LJIIJ = EnumC1527220pqS.android;
            C1516540pZE.LIZIZ(map);
            c1527100pqG.LJIIJJI = map;
            if (i == EnumC1526180pom.Init.getValue() || i == EnumC1526180pom.Switch.getValue()) {
                c1527100pqG.LJII = EnumC1526160pok.NeedData;
            }
            c1527100pqG.LJIIIZ = EnumC1526180pom.fromValue(i);
            C1527010pq7 c1527010pq7Build = c1527100pqG.build();
            if (!C08MU.LIZLLL(this.LL)) {
                ArrayList arrayList = new ArrayList();
                for (C801490VcJ c801490VcJ : listLJJII) {
                    if (c801490VcJ.LIZLLL == EnumC1525890poJ.SpecTopic) {
                        arrayList.add(c801490VcJ);
                    }
                }
                listLJJII = arrayList;
            }
            if (listLJJII.isEmpty()) {
                C801490VcJ c801490VcJ2 = new C801490VcJ();
                c801490VcJ2.LIZLLL = EnumC1525890poJ.SpecTopic;
                c801490VcJ2.LJ = EnumC1527250pqV.Device;
                c801490VcJ2.LIZ = CardStruct.IStatusCode.DEFAULT;
                c801490VcJ2.LJFF = 0L;
                listLJJII = Collections.singletonList(c801490VcJ2);
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJII, 10));
            for (C801490VcJ c801490VcJ3 : listLJJII) {
                C1527110pqH c1527110pqH = new C1527110pqH();
                c1527110pqH.LIZLLL = EnumC1527170pqN.Poll;
                c1527110pqH.LJFF = c801490VcJ3.LIZLLL;
                c1527110pqH.LJ = c801490VcJ3.LJ;
                c1527110pqH.LJI = Long.valueOf(CastLongProtector.parseLong(c801490VcJ3.LIZ));
                c1527110pqH.LJII = Long.valueOf(c801490VcJ3.LJFF);
                arrayList2.add(c1527110pqH.build());
            }
            C1527190pqP c1527190pqP = new C1527190pqP();
            c1527190pqP.LIZLLL = c1527010pq7Build;
            C1516540pZE.LIZ(arrayList2);
            c1527190pqP.LJ = arrayList2;
            C1527060pqC c1527060pqCBuild = c1527190pqP.build();
            C1527500pqu c1527500pqu = new C1527500pqu();
            c1527500pqu.LIZIZ = !z;
            c1527500pqu.LIZJ = z;
            c1527500pqu.LIZ = c1527060pqCBuild;
            c1527500pqu.LJ = i;
            this.LLILLJJLI.LJJLIIIJL(c1527500pqu);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1526300poy.LIZLLL(null, th);
        }
    }

    @Override // X.InterfaceC1525730po3
    public final List LJJIJIIJI(String str, boolean z, List list) {
        ArrayList<C801520VcM> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MsgSenderWrapperV4] ");
            sbLIZ.append("payload is null or empty when send to server,syncId = ");
            sbLIZ.append(str);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
        HashMap map = new HashMap();
        map.put(Integer.valueOf(EnumC1527590pr3.Params.getValue()), ByteString.encodeUtf8(C786410Ut5.J3(LJI())));
        C1527100pqG c1527100pqG = new C1527100pqG();
        c1527100pqG.LIZLLL = EnumC1527210pqR.V4;
        c1527100pqG.LJFF = c1526010poVLIZIZ.LIZ;
        c1527100pqG.LJ = c1526010poVLIZIZ.LIZIZ;
        c1527100pqG.LJI = Long.valueOf(jCurrentTimeMillis);
        c1527100pqG.LJIIIIZZ = "-1";
        c1527100pqG.LJIIJ = EnumC1527220pqS.android;
        C1516540pZE.LIZIZ(map);
        c1527100pqG.LJIIJJI = map;
        C1527010pq7 c1527010pq7Build = c1527100pqG.build();
        ArrayList arrayList2 = new ArrayList();
        C1527110pqH c1527110pqH = new C1527110pqH();
        c1527110pqH.LIZLLL = EnumC1527170pqN.Data;
        c1527110pqH.LJFF = EnumC1525890poJ.SpecTopic;
        c1527110pqH.LJI = Long.valueOf(CastLongProtector.parseLong(str));
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C801520VcM c801520VcM : arrayList) {
            String string = UUID.randomUUID().toString();
            String strLIZIZ = c801520VcM.LJIIIZ;
            if (strLIZIZ == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c801520VcM.LIZLLL);
                sbLIZ2.append((Object) c801520VcM.LIZIZ);
                sbLIZ2.append(c801520VcM.LJI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            arrayList2.add(new Pair(strLIZIZ, string));
            C1527150pqL c1527150pqL = new C1527150pqL();
            C1527230pqT c1527230pqT = new C1527230pqT();
            c1527230pqT.LIZLLL = Long.valueOf(c801520VcM.LJI);
            c1527150pqL.LIZLLL = c1527230pqT.build();
            C1527200pqQ c1527200pqQ = new C1527200pqQ();
            c1527200pqQ.LIZLLL = Integer.valueOf((int) c801520VcM.LIZJ);
            byte[] bArr = c801520VcM.LJII;
            c1527200pqQ.LJI = ByteString.of(bArr, 0, bArr.length);
            c1527150pqL.LJ = c1527200pqQ.build();
            c1527150pqL.LJIIJ = Long.valueOf(jCurrentTimeMillis);
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("msg_id", strLIZIZ), new Pair("msg_req_id", string));
            C1516540pZE.LIZIZ(mapLJIIIIZZ);
            c1527150pqL.LJIIJJI = mapLJIIIIZZ;
            arrayList3.add(c1527150pqL.build());
        }
        List<C1527130pqJ> listLLIIII = C13LP.LLIIII(arrayList3);
        C1516540pZE.LIZ(listLLIIII);
        c1527110pqH.LJIIIZ = listLLIIII;
        C1527020pq8 c1527020pq8Build = c1527110pqH.build();
        C1527190pqP c1527190pqP = new C1527190pqP();
        c1527190pqP.LIZLLL = c1527010pq7Build;
        ArrayList arrayListLJ = C1697810uHb.LJ(c1527020pq8Build);
        C1516540pZE.LIZ(arrayListLJ);
        c1527190pqP.LJ = arrayListLJ;
        C1527060pqC c1527060pqCBuild = c1527190pqP.build();
        C1527500pqu c1527500pqu = new C1527500pqu();
        c1527500pqu.LIZIZ = !z;
        c1527500pqu.LIZ = c1527060pqCBuild;
        c1527500pqu.LIZJ = z;
        c1527500pqu.LJ = 3;
        this.LLILLJJLI.LJJLIIIJL(c1527500pqu);
        return arrayList2;
    }
}
