package X;

import Y.AComparatorS42S0000000_23;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0po8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525780po8 extends AbstractC1525800poA implements InterfaceC1526090pod<EnumC1527170pqN>, Handler.Callback {
    public final String LLILZIL;
    public int LLILZLL;
    public final int LLIZ;
    public final C01GW LLIZLLLIL;

    public C1525780po8(Context context) {
        super(context);
        this.LLILZIL = "[DataMsgHandlerV4] ";
        this.LLIZ = 1;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 178));
    }

    @Override // X.InterfaceC1526090pod
    public final boolean LIZ(EnumC1527170pqN enumC1527170pqN) {
        if (enumC1527170pqN == EnumC1527170pqN.Data) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == this.LLIZ) {
            ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(EnumC1526180pom.DataAck.getValue(), false);
            this.LLILZLL = 0;
        }
        return true;
    }

    @Override // X.InterfaceC1526090pod
    public final void LIZIZ(int i, C1527010pq7 c1527010pq7, List<C1527020pq8> list) throws JSONException {
        C801490VcJ c801490VcJ;
        C1525840poE c1525840poE;
        int iIntValue;
        long jLongValue;
        C801490VcJ c801490VcJ2;
        boolean z;
        JSONObject jSONObject;
        String str;
        String str2;
        String str3;
        List listLJJLIIIJILLIZJL;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1527020pq8 c1527020pq8 : list) {
            Long l = c1527020pq8.sync_id;
            Object arrayList = linkedHashMap.get(l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(l, arrayList);
            }
            ((List) arrayList).add(c1527020pq8);
        }
        EnumC1526180pom enumC1526180pom = EnumC1526180pom.DataAck;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue2 = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            try {
                C801490VcJ c801490VcJLJJIII = LIZLLL().LJJIII(jLongValue2);
                if (list2.isEmpty()) {
                    C1527890prX.LIZJ(Intrinsics.LJIIJJI("topics is null !", this.LLILZIL));
                } else if (c801490VcJLJJIII == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LLILZIL);
                    sbLIZ.append("can't be found in local db, ");
                    sbLIZ.append(jLongValue2);
                    sbLIZ.append(' ');
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else if (!AbstractC1525800poA.LIZJ(jLongValue2, c1527010pq7, c801490VcJLJJIII)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LLILZIL);
                    sbLIZ2.append("info not match when handle ");
                    sbLIZ2.append(jLongValue2);
                    sbLIZ2.append('.');
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    byte b = 0;
                    for (C1527020pq8 c1527020pq82 : C13LP.LJLLLL(new AComparatorS42S0000000_23(15), list2)) {
                        if (c1527020pq82.ref_cursor.longValue() <= c801490VcJLJJIII.LJFF) {
                            List<C1527130pqJ> list3 = c1527020pq82.packets;
                            ArrayList arrayList2 = new ArrayList();
                            for (C1527130pqJ c1527130pqJ : list3) {
                                if (c1527130pqJ.cursor.cursor.longValue() > c801490VcJLJJIII.LJFF) {
                                    arrayList2.add(c1527130pqJ);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            if (arrayList3.size() > 1) {
                                C08XD.LJJ(arrayList3, new AComparatorS42S0000000_23(16));
                            }
                            ArrayList<C0WYW> arrayList4 = new ArrayList<>();
                            EnumC1525890poJ enumC1525890poJ = c1527020pq82.topic_type;
                            Iterator it2 = arrayList3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C1527130pqJ c1527130pqJ2 = (C1527130pqJ) it2.next();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("topic", c1527020pq82.topic_type.getValue());
                                    jSONObject2.put("pipeline", "receive");
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("time_consuming", System.currentTimeMillis() - c1527130pqJ2.ts.longValue());
                                    jSONObject3.put("receive_cnt", 1);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("sync_id", jLongValue2);
                                    C1527080pqE c1527080pqE = c1527130pqJ2.payload;
                                    if (c1527080pqE != null && (num = c1527080pqE.business) != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    jSONObject4.put("business", iIntValue);
                                    C1526300poy.LIZ("sync_sdk_pipeline", jSONObject2, jSONObject3, jSONObject4);
                                    try {
                                        Map<String, String> map = c1527130pqJ2.extra;
                                        if (map != null && Intrinsics.LJFF(map.get("hit_sampling"), "1")) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            JSONObject jSONObject5 = new JSONObject();
                                            String str4 = map.get("msg_id");
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            C1499090p75.LIZJ("msg_id", str4, jSONObject5);
                                            try {
                                                C1499090p75.LIZIZ("biz_id", c1527130pqJ2.payload.business.intValue(), jSONObject5);
                                                C1499090p75.LIZIZ("sync_id", c1527020pq82.sync_id.longValue(), jSONObject5);
                                                if (c1527020pq82.topic_type == EnumC1525890poJ.CustomTopic) {
                                                    String str5 = c1527020pq82.req_id;
                                                    if (str5 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str5, new String[]{":"}, 0, 6)) != null) {
                                                        str3 = (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    C1499090p75.LIZJ("topic", str3, jSONObject5);
                                                }
                                                C1499090p75.LIZIZ("cursor", c1527130pqJ2.cursor.cursor.longValue(), jSONObject5);
                                                EnumC1525890poJ enumC1525890poJ2 = c1527020pq82.topic_type;
                                                if (enumC1525890poJ2 != null) {
                                                    int i2 = C1525860poG.LIZ[enumC1525890poJ2.ordinal()];
                                                    if (i2 != 1) {
                                                        if (i2 != 2) {
                                                            if (i2 == 3) {
                                                                str = "global";
                                                            }
                                                        } else {
                                                            str = "custom";
                                                        }
                                                    } else {
                                                        str = "spec";
                                                    }
                                                    C1499090p75.LIZJ("topic_type", str, jSONObject5);
                                                    C1499090p75.LIZJ("step", "sdk_recv", jSONObject5);
                                                    if (i == 0) {
                                                        str2 = "frontier";
                                                    } else {
                                                        str2 = "http";
                                                    }
                                                    C1499090p75.LIZJ("ev_channel", str2, jSONObject5);
                                                    C1499090p75.LIZIZ("start_ms", System.currentTimeMillis(), jSONObject5);
                                                    C1499090p75.LIZIZ("cost_ms", jCurrentTimeMillis - c1527130pqJ2.ts.longValue(), jSONObject5);
                                                    C1499090p75.LIZJ("result", "success", jSONObject5);
                                                    C1525750po5.LIZJ("sync_sdk_event_recv", jSONObject5);
                                                }
                                                throw new C1954807lC();
                                            } catch (Throwable th) {
                                                th = th;
                                                TryCatchGuardChecker.doCheck(th);
                                                C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "eventReceive error: "));
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (c1527130pqJ2.expire_ts.longValue() <= 0 || c1527130pqJ2.expire_ts.longValue() >= System.currentTimeMillis()) {
                                        C0WYW c0wyw = new C0WYW();
                                        if (c0wyw.LJIIZILJ == null) {
                                            c0wyw.LJIIZILJ = new HashMap();
                                        }
                                        ((HashMap) c0wyw.LJIIZILJ).put("channel", String.valueOf(i));
                                        Map<String, String> map2 = c1527130pqJ2.extra;
                                        if (map2 != null) {
                                            ((HashMap) c0wyw.LJIIZILJ).putAll(map2);
                                        }
                                        long jLongValue3 = c1527130pqJ2.expire_ts.longValue();
                                        c0wyw.LJIILL = jLongValue3;
                                        if (jLongValue3 <= 0) {
                                            c0wyw.LJIILL = System.currentTimeMillis() + ((long) 86400000);
                                        }
                                        c0wyw.LJIILLIIL = c1527130pqJ2.ctrl;
                                        c0wyw.LJIILIIL = enumC1525890poJ;
                                        C1527080pqE c1527080pqE2 = c1527130pqJ2.payload;
                                        c0wyw.LJI = c1527080pqE2.business.intValue();
                                        c0wyw.LJII = c1527080pqE2.consume_type;
                                        c0wyw.LIZ = String.valueOf(jLongValue2);
                                        c0wyw.LJFF = c1527080pqE2.md5;
                                        Long l2 = c1527130pqJ2.ts;
                                        if (l2 == null) {
                                            jLongValue = C1527010pq7.DEFAULT_TS.longValue();
                                        } else {
                                            jLongValue = l2.longValue();
                                        }
                                        c0wyw.LJIIIZ = jLongValue;
                                        c0wyw.LJIIJ = System.currentTimeMillis();
                                        c0wyw.LIZLLL = c1527130pqJ2.cursor.cursor.longValue();
                                        c0wyw.LIZIZ = c1527010pq7.f212did;
                                        c0wyw.LIZJ = c1527010pq7.uid;
                                        c0wyw.LJIIJJI = c1527020pq82.bucket;
                                        String str6 = c1527020pq82.req_id;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        c0wyw.LJIIL = str6;
                                        ByteString byteString = c1527130pqJ2.payload.data;
                                        if (byteString == null) {
                                            c0wyw.LJ = ByteString.EMPTY.toByteArray();
                                            c0wyw.LJIIIIZZ = EnumC825070WYf.ORIGIN;
                                            jSONObject = null;
                                        } else if (byteString.size() > ((InterfaceC1525970poR) this.LLILZ.getValue()).LJIIJ()) {
                                            try {
                                                c801490VcJ2 = null;
                                                jSONObject = null;
                                                c801490VcJ = c801490VcJLJJIII;
                                            } catch (Exception e) {
                                                e = e;
                                                c801490VcJ = c801490VcJLJJIII;
                                                c801490VcJ2 = null;
                                            }
                                            try {
                                                String strLJIIZILJ = ((InterfaceC1525530pnj) this.LLILLL.getValue()).LJIIZILJ(jLongValue2, c0wyw.LIZLLL, c1527130pqJ2.payload.data.toByteArray());
                                                if (strLJIIZILJ != null) {
                                                    c0wyw.LJ = strLJIIZILJ.getBytes(Charsets.UTF_8);
                                                    c0wyw.LJIIIIZZ = EnumC825070WYf.FILE_PATH;
                                                    z = true;
                                                    JSONObject jSONObject6 = new JSONObject();
                                                    jSONObject6.put("save_file", z);
                                                    JSONObject jSONObject7 = new JSONObject();
                                                    jSONObject7.put("sync_id", c0wyw.LIZ);
                                                    jSONObject7.put("cursor", c0wyw.LIZLLL);
                                                    jSONObject7.put("business", c0wyw.LJI);
                                                    C1526300poy.LIZ("sync_sdk_synclog_save_file", jSONObject6, jSONObject, jSONObject7);
                                                    C1527890prX.LIZLLL(this.LLILZIL + "add sync_log to list : " + c0wyw);
                                                    arrayList4.add(c0wyw);
                                                } else {
                                                    C1527890prX.LIZIZ(Intrinsics.LJIIJJI("save data to file failed", this.LLILZIL));
                                                    c1525840poE = new C1525840poE(false, null);
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                TryCatchGuardChecker.doCheck(e);
                                                C1527890prX.LIZIZ(Intrinsics.LJIIJJI("UnsupportedEncodingException when save syncLog data", this.LLILZIL));
                                                c1525840poE = new C1525840poE(false, c801490VcJ2);
                                            }
                                        } else {
                                            jSONObject = null;
                                            c0wyw.LJ = c1527130pqJ2.payload.data.toByteArray();
                                            c0wyw.LJIIIIZZ = EnumC825070WYf.ORIGIN;
                                        }
                                        z = false;
                                        JSONObject jSONObject62 = new JSONObject();
                                        jSONObject62.put("save_file", z);
                                        JSONObject jSONObject72 = new JSONObject();
                                        jSONObject72.put("sync_id", c0wyw.LIZ);
                                        jSONObject72.put("cursor", c0wyw.LIZLLL);
                                        jSONObject72.put("business", c0wyw.LJI);
                                        C1526300poy.LIZ("sync_sdk_synclog_save_file", jSONObject62, jSONObject, jSONObject72);
                                        C1527890prX.LIZLLL(this.LLILZIL + "add sync_log to list : " + c0wyw);
                                        arrayList4.add(c0wyw);
                                    }
                                } else {
                                    c801490VcJ = c801490VcJLJJIII;
                                    C801490VcJ c801490VcJ3 = new C801490VcJ(c801490VcJLJJIII);
                                    c801490VcJ3.LJFF = c1527020pq82.new_cursor.longValue();
                                    try {
                                        ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJIFFI(arrayList4, c801490VcJ3);
                                        c1525840poE = new C1525840poE(true, c801490VcJ3);
                                        break;
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        C1526710ppd.LIZJ().ensureNotReachHere(th3, "execute sql failed when insertSyncLogAndCursor");
                                        c1525840poE = new C1525840poE(false, null);
                                    }
                                }
                            }
                            boolean z2 = c1525840poE.LIZ;
                            c801490VcJLJJIII = c1525840poE.LIZIZ;
                            if (!z2 || c801490VcJLJJIII == null) {
                                C1527890prX.LIZIZ(Intrinsics.LJIIJJI("patchAndSave failed. break process data", this.LLILZIL));
                                b = -4;
                                c801490VcJLJJIII = c801490VcJ;
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(this.LLILZIL);
                            sbLIZ3.append(c1527020pq82.ref_cursor);
                            sbLIZ3.append(" > ");
                            sbLIZ3.append(c801490VcJLJJIII.LJFF);
                            sbLIZ3.append(", server cursor > db cursor when patch syncId = ");
                            sbLIZ3.append(jLongValue2);
                            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            if (!Intrinsics.LJFF(c1527020pq82.ref_cursor, c1527020pq82.new_cursor)) {
                                b = -5;
                            }
                        }
                    }
                    if (b == -5) {
                        enumC1526180pom = EnumC1526180pom.DataLost;
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1526710ppd.LIZJ().ensureNotReachHere(e3, "execute sql failed when queryLocalSyncCursorInfo when receive data");
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = linkedHashMap.keySet().iterator();
        while (it3.hasNext()) {
            linkedHashSet.add(it3.next());
        }
        C1527890prX.LIZJ(Intrinsics.LJIIJJI("handle data finished. continue poll again...", this.LLILZIL));
        if (enumC1526180pom != EnumC1526180pom.DataLost && ((InterfaceC1525970poR) this.LLILZ.getValue()).LJIIL()) {
            int i3 = this.LLILZLL + 1;
            this.LLILZLL = i3;
            if (i3 >= ((InterfaceC1525970poR) this.LLILZ.getValue()).LIZIZ()) {
                ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(EnumC1526180pom.DataAck.getValue(), false);
                this.LLILZLL = 0;
                ((Handler) this.LLIZLLLIL.getValue()).removeMessages(this.LLIZ);
            } else if (!((Handler) this.LLIZLLLIL.getValue()).hasMessages(this.LLIZ)) {
                C786410Ut5.LJLJJI(this.LLIZ, ((long) ((InterfaceC1525970poR) this.LLILZ.getValue()).LJ()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), (Handler) this.LLIZLLLIL.getValue());
            }
        } else {
            ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(enumC1526180pom.getValue(), false);
        }
        ((InterfaceC1525570pnn) C808470VnZ.LIZ(InterfaceC1525570pnn.class)).LJJJIL(linkedHashSet);
    }
}
