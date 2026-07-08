package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525590pnp implements Handler.Callback {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1526570ppP LL;
    public final C1526350pp3 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1525620pns());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1525610pnr(this));

    public final Handler LIZJ() {
        return (Handler) this.LLILZ.getValue();
    }

    public final void LIZIZ(C0WYW c0wyw) {
        boolean z;
        C1527890prX.LIZJ(Intrinsics.LJIIJJI("doNotifySnapshots", "[MsgNotifierV4] "));
        InterfaceC1525900poK interfaceC1525900poK = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
        ArrayList arrayList = new ArrayList();
        try {
            ExecutorService executorService = (ExecutorService) C1525650pnv.LIZ.getValue();
            int size = 0;
            do {
                try {
                    List<C0WYY> listLJJJI = interfaceC1525900poK.LJJJI(size);
                    if (listLJJJI != null && !listLJJJI.isEmpty()) {
                        size += listLJJJI.size();
                        if (listLJJJI.size() >= 50) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                        InterfaceC1525530pnj interfaceC1525530pnj = (InterfaceC1525530pnj) C808470VnZ.LIZ(InterfaceC1525530pnj.class);
                        for (C0WYY c0wyy : listLJJJI) {
                            C1525690pnz c1525690pnz = (C1525690pnz) ((ConcurrentHashMap) this.LLILLJJLI.LLILLJJLI).get(Long.valueOf(c0wyy.LIZIZ));
                            if (c1525690pnz == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[MsgNotifierV4] ");
                                sbLIZ.append("business not register,ignore submit snapshot. business = ");
                                sbLIZ.append(c0wyy.LIZIZ);
                                C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                Object[] objArrLIZJ = c1525690pnz.LIZJ();
                                if (objArrLIZJ != null && objArrLIZJ.length != 0) {
                                    if (!TextUtils.equals(c0wyy.LIZLLL, c1526010poVLIZIZ.LIZ)) {
                                        C1527890prX.LIZIZ("[MsgNotifierV4] did is error ,not notify. did = " + ((Object) c0wyy.LIZLLL) + ", current = " + ((Object) c1526010poVLIZIZ.LIZ));
                                    } else if (c0wyy.LJII == EnumC1527250pqV.User && !C1525640pnu.LIZ(c0wyy.LIZJ, c1526010poVLIZIZ.LIZIZ)) {
                                        C1527890prX.LIZIZ("[MsgNotifierV4] uid is error ,not notify. uid = " + ((Object) c0wyy.LIZJ) + ", current = " + ((Object) c1526010poVLIZIZ.LIZIZ));
                                    } else {
                                        C1525630pnt c1525630pnt = new C1525630pnt();
                                        if (c0wyy.LJIIIIZZ == EnumC825070WYf.FILE_PATH) {
                                            CastLongProtector.parseLong(c0wyy.LIZ);
                                            byte[] bArr = c0wyy.LJFF;
                                            Charset charset = Charsets.UTF_8;
                                            String strLJIIL = interfaceC1525530pnj.LJIIL(new String(bArr, charset));
                                            if (strLJIIL == null) {
                                                LJ(CastLongProtector.parseLong(c0wyy.LIZ), "deserialization failed when submit snapshots");
                                            } else {
                                                c1525630pnt.LIZ = strLJIIL.getBytes(charset);
                                            }
                                        } else {
                                            c1525630pnt.LIZ = c0wyy.LJFF;
                                        }
                                        c1525630pnt.LIZIZ = c0wyy.LJIIIZ;
                                        c1525630pnt.LIZJ = c0wyy.LJIIJ;
                                        c0wyy.LJI = c0wyy.LJ;
                                        int i = c0wyy.LJIIL;
                                        c0wyy.LJIIL = 0;
                                        try {
                                            interfaceC1525900poK.LJIIJJI(c0wyy);
                                            arrayList.add(c0wyy);
                                            executorService.submit(new RunnableC1525600pnq(c0wyw, this, c1525630pnt, i, objArrLIZJ));
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            C1526710ppd.LIZJ().ensureNotReachHere(e, "execute sql failed when changeSnapshotToNotified.");
                                        }
                                    }
                                } else {
                                    C1527890prX.LIZIZ("[MsgNotifierV4] listener is null ,not notify.snapshot = " + c0wyy + " business = " + c0wyy.LIZIZ);
                                }
                            }
                        }
                    } else {
                        C1527890prX.LIZJ(Intrinsics.LJIIJJI("snapshots is null ,not notify", "[MsgNotifierV4] "));
                        return;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1526710ppd.LIZJ().ensureNotReachHere(e2, "execute sql failed. notifySnapshots .");
                    return;
                }
            } while (z);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1526710ppd.LIZJ().ensureNotReachHere(e3, null);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 102) {
            LIZJ().removeMessages(102);
            LIZIZ(null);
        }
        if (message.what == 104) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : (List) messageObj) {
                    Long lValueOf = Long.valueOf(((C0WYW) obj).LJI);
                    Object arrayList = linkedHashMap.get(lValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(lValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    LIZ(((Number) entry.getKey()).longValue(), (List) entry.getValue());
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.bytedance.sync.v4.presistence.table.SyncLogV4>");
            }
        }
        if (message.what == 103) {
            Object messageObj2 = HandlerHook.getMessageObj(message.obj);
            if (messageObj2 != null) {
                long jLongValue = ((Long) messageObj2).longValue();
                int i = message.arg1;
                LIZJ().removeMessages(103, Long.valueOf(jLongValue));
                ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                List listLJJJJI = ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJJJI(i, jLongValue, System.currentTimeMillis());
                if (listLJJJJI != null && !listLJJJJI.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[MsgNotifierV4] ");
                    sbLIZ.append("submit one by one finished, business = ");
                    sbLIZ.append(jLongValue);
                    C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    int iLIZ = LIZ(jLongValue, listLJJJJI);
                    if (iLIZ >= 0) {
                        if (listLJJJJI.size() >= 50) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[MsgNotifierV4] ");
                            sbLIZ2.append("continue one by one, business = ");
                            sbLIZ2.append(jLongValue);
                            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                            LJFF(listLJJJJI.size() - iLIZ, jLongValue, 0L);
                            return false;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[MsgNotifierV4] ");
                        sbLIZ3.append("submit one by one finished, business = ");
                        sbLIZ3.append(jLongValue);
                        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                        return false;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
        }
        return false;
    }

    public C1525590pnp(C1526570ppP c1526570ppP, C1526350pp3 c1526350pp3) {
        this.LL = c1526570ppP;
        this.LLILLJJLI = c1526350pp3;
    }

    public static void LIZLLL(int i, List list) {
        C0WYW c0wyw;
        Map<String, String> map;
        String str;
        String str2;
        String str3;
        String str4;
        try {
            if (list.isEmpty()) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext() && (c0wyw = (C0WYW) it2.next()) != null && (map = c0wyw.LJIIZILJ) != null) {
                HashMap map2 = (HashMap) map;
                if (Intrinsics.LJFF(map2.get("hit_sampling"), "1")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    String str5 = (String) map2.get("msg_id");
                    if (str5 == null) {
                        str5 = "";
                    }
                    C1499090p75.LIZJ("msg_id", str5, jSONObject);
                    C1499090p75.LIZIZ("biz_id", c0wyw.LJI, jSONObject);
                    C1499090p75.LIZJ("sync_id", c0wyw.LIZ, jSONObject);
                    C1499090p75.LIZIZ("cursor", c0wyw.LIZLLL, jSONObject);
                    String str6 = (String) ((HashMap) c0wyw.LJIIZILJ).get("channel");
                    if (str6 != null && CastIntegerProtector.parseInt(str6) == 0) {
                        str = "frontier";
                    } else {
                        str = "http";
                    }
                    C1499090p75.LIZJ("ev_channel", str, jSONObject);
                    int i2 = C1525870poH.LIZ[c0wyw.LJIILIIL.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                str2 = "global";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            str2 = "custom";
                        }
                    } else {
                        str2 = "spec";
                    }
                    C1499090p75.LIZJ("topic_type", str2, jSONObject);
                    C1499090p75.LIZJ("step", "biz_recv", jSONObject);
                    C1499090p75.LIZIZ("start_ms", System.currentTimeMillis(), jSONObject);
                    C1499090p75.LIZIZ("cost_ms", jCurrentTimeMillis - c0wyw.LJIIIZ, jSONObject);
                    if (i == 0) {
                        str3 = "success";
                    } else {
                        str3 = "failed";
                    }
                    C1499090p75.LIZJ("result", str3, jSONObject);
                    if (i != 0) {
                        C1499090p75.LIZJ("reason", "err", jSONObject);
                        JSONObject jSONObject2 = new JSONObject();
                        if (i == 1) {
                            str4 = "no_biz";
                        } else {
                            str4 = "db_err";
                        }
                        jSONObject2.put("err", str4);
                        C1499090p75.LIZJ("extra", C786410Ut5.J3(jSONObject2), jSONObject);
                    }
                    C1525750po5.LIZJ("sync_sdk_event_biz", jSONObject);
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MsgNotifierV4] ");
            sbLIZ.append("onEventSubmit error: ");
            sbLIZ.append(Log.getStackTraceString(th));
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[MsgNotifierV4] ");
        sbLIZ.append("something is wrong when notify. syncId = ");
        sbLIZ.append(j);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int LIZ(long j, List<? extends C0WYW> list) {
        String str;
        List listLJJLIIIJ;
        try {
            ExecutorService executorService = (ExecutorService) C1525650pnv.LIZ.getValue();
            C1525690pnz c1525690pnz = (C1525690pnz) ((ConcurrentHashMap) this.LLILLJJLI.LLILLJJLI).get(Long.valueOf(j));
            int i = 1;
            if (c1525690pnz == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[MsgNotifierV4] ");
                sbLIZ.append("business not register,ignore it. business = ");
                sbLIZ.append(j);
                C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                LIZLLL(1, list);
                return -1;
            }
            Object[] objArrLIZJ = c1525690pnz.LIZJ();
            boolean z = false;
            if (objArrLIZJ != null && objArrLIZJ.length != 0) {
                ArrayList arrayList = new ArrayList();
                C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                Iterator<? extends C0WYW> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0WYW next = it2.next();
                        if (!TextUtils.equals(next.LIZIZ, c1526010poVLIZIZ.LIZ)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[MsgNotifierV4] ");
                            sbLIZ2.append("did is error ,not notify. did = ");
                            sbLIZ2.append((Object) next.LIZIZ);
                            sbLIZ2.append(", current = ");
                            sbLIZ2.append((Object) c1526010poVLIZIZ.LIZ);
                            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        } else if (next.LJIIJJI == EnumC1527250pqV.User && !C1525640pnu.LIZ(next.LIZJ, c1526010poVLIZIZ.LIZIZ)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[MsgNotifierV4] ");
                            sbLIZ3.append("uid is error ,not notify. uid = ");
                            sbLIZ3.append((Object) next.LIZJ);
                            sbLIZ3.append(", current = ");
                            sbLIZ3.append((Object) c1526010poVLIZIZ.LIZIZ);
                            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            C1525630pnt c1525630pnt = new C1525630pnt();
                            EnumC825070WYf enumC825070WYf = next.LJIIIIZZ;
                            EnumC825070WYf enumC825070WYf2 = EnumC825070WYf.FILE_PATH;
                            if (enumC825070WYf == enumC825070WYf2) {
                                InterfaceC1525530pnj interfaceC1525530pnj = (InterfaceC1525530pnj) this.LLILLL.getValue();
                                CastLongProtector.parseLong(next.LIZ);
                                byte[] bArrLJJZZI = interfaceC1525530pnj.LJJZZI(new String(next.LJ, Charsets.UTF_8));
                                if (bArrLJJZZI == null) {
                                    LJ(CastLongProtector.parseLong(next.LIZ), "deserialization failed when submit syncLog");
                                    break;
                                }
                                c1525630pnt.LIZ = bArrLJJZZI;
                            } else {
                                c1525630pnt.LIZ = next.LJ;
                            }
                            c1525630pnt.LIZJ = next.LJIIJ;
                            c1525630pnt.LIZIZ = next.LJIIIZ;
                            String str2 = next.LJIIL;
                            if (str2 != null && (listLJJLIIIJ = a0.LJJLIIIJ(str2, new char[]{':'}, false, 0, 6)) != null) {
                                C13LP.LJJLIIIJJI(listLJJLIIIJ);
                            }
                            Map<String, String> map = next.LJIIZILJ;
                            if (map == null) {
                                str = null;
                            } else {
                                str = (String) ((HashMap) map).get("msg_id");
                            }
                            c1525630pnt.LIZLLL = str;
                            if (((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJIJI(C1697810uHb.LJ(next))) {
                                if (next.LJIIIIZZ == enumC825070WYf2) {
                                    ((InterfaceC1525530pnj) this.LLILLL.getValue()).LJJIZ(new String(next.LJ, Charsets.UTF_8));
                                }
                                executorService.submit(new RunnableC1525600pnq(next, this, c1525630pnt, i, objArrLIZJ));
                                if (next.LJIILLIIL == EnumC1527260pqW.NeedFin) {
                                    arrayList.add(next);
                                }
                            } else {
                                C1527890prX.LIZIZ("[MsgNotifierV4] delete syncLog failed, not notify, syncId = " + next.LIZ + ", cursor = " + next.LIZLLL);
                                LIZLLL(2, Collections.singletonList(next));
                                break;
                            }
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJJIJIIJIL(arrayList);
                }
                if (z) {
                    return arrayList.size();
                }
                return -1;
            }
            C1527890prX.LIZ("[MsgNotifierV4] listener is empty ,ignore it. business = " + j);
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1526710ppd.LIZJ().ensureNotReachHere(e, null);
            return -1;
        }
    }

    public final void LJFF(int i, long j, long j2) {
        LIZJ().removeMessages(103, Long.valueOf(j));
        Message messageObtainMessage = LIZJ().obtainMessage(103, Long.valueOf(j));
        messageObtainMessage.arg1 = i;
        C786410Ut5.LJLJLJ(LIZJ(), messageObtainMessage, j2);
    }
}
