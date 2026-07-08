package X;

import Y.AComparatorS50S0000000_31;
import Y.ARunnableS100S0200000_31;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSubtitleConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15P9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15P9 {
    public AwS610S0100000_31 LIZ;
    public final long LIZIZ = ((long) LiveCoHostSubtitleConfig.INSTANCE.getValue().noSpeakerExitTimeoutSec) * 1000;
    public final WeakHashMap<String, String> LIZJ = new WeakHashMap<>();
    public final LinkedHashMap<String, C13E8<C15PB>> LIZLLL = new LinkedHashMap<>();
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS50S0000000_31(5), C13LP.LLD(2, C13LP.LJLLLL(new AComparatorS50S0000000_31(4), C15438062q.LJIJJLI(this.LIZLLL.values()))));
        ArrayList<C15PB> arrayList = new ArrayList();
        for (Object obj : listLJLLLL) {
            if (System.currentTimeMillis() - ((C15PB) obj).LJI < this.LIZIZ) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C15PB c15pb : arrayList) {
            c15pb.getClass();
            arrayList2.add(new C15PC(c15pb.LIZIZ, c15pb.LIZJ, c15pb.LJI, c15pb.LJII));
        }
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS100S0200000_31(this, arrayList2, 44));
    }

    public final void LIZIZ(String str) {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!Intrinsics.LJFF(jSONObject.optString("businessID"), "subtitle") || !Intrinsics.LJFF(jSONObject.optString("type"), "subtitle") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("payload")) == null) {
                return;
            }
            long jOptLong = jSONObject.optLong("timestamp");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subtitle");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
            while (it2.LLILLL) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(it2.nextInt());
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(jSONObjectOptJSONObject2);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                LIZJ(jOptLong, length, (JSONObject) it3.next());
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse subtitle message: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C20441214yg.LJIIL("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ(long j, int i, JSONObject jSONObject) {
        boolean z;
        String strOptString = jSONObject.optString("linkmic_id");
        long jOptLong = jSONObject.optLong("round_id");
        if (strOptString != null && strOptString.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && jOptLong > 0) {
            String strOptString2 = jSONObject.optString("confirmed");
            String strOptString3 = jSONObject.optString("unconfirmed");
            long jOptLong2 = jSONObject.optLong("timestamp");
            long jOptLong3 = jSONObject.optLong("sequence");
            String strOptString4 = jSONObject.optString("lang");
            String strOptString5 = jSONObject.optString("source_lang");
            long jCurrentTimeMillis = System.currentTimeMillis();
            C15PA c15pa = new C15PA(strOptString, jOptLong, jOptLong3, jOptLong2, j, jCurrentTimeMillis, strOptString4, strOptString5, i);
            C13E8<C15PB> c13e8 = this.LIZLLL.get(strOptString);
            if (c13e8 == null) {
                c13e8 = new C13E8<>(2);
                this.LIZLLL.put(strOptString, c13e8);
            }
            C15PB c15pbLJIIIIZZ = c13e8.LJIIIIZZ();
            if (c15pbLJIIIIZZ == null) {
                c13e8.addLast(LIZLLL(this, strOptString, strOptString2, strOptString3, jOptLong, jOptLong2, jCurrentTimeMillis, c15pa, null, jCurrentTimeMillis));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("processSubtitleItem: add first ");
                sbLIZ.append(jSONObject);
                C20441214yg.LIZIZ("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ));
                LIZ();
                return;
            }
            if (c15pbLJIIIIZZ.LJ >= jOptLong2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("processSubtitleItem: discarding ");
                sbLIZ2.append(jSONObject);
                C20441214yg.LIZIZ("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (c15pbLJIIIIZZ.LIZ == jOptLong) {
                c13e8.removeLast();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("processSubtitleItem: replace ");
                sbLIZ3.append(jSONObject);
                sbLIZ3.append(' ');
                sbLIZ3.append(c15pbLJIIIIZZ.LJFF);
                C20441214yg.LIZIZ("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("processSubtitleItem: add new ");
                sbLIZ4.append(jSONObject);
                C20441214yg.LIZIZ("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ4));
            }
            c13e8.addLast(LIZLLL(this, strOptString, strOptString2, strOptString3, jOptLong, jOptLong2, jCurrentTimeMillis, c15pa, c15pbLJIIIIZZ.LIZLLL, c15pbLJIIIIZZ.LJFF));
            LIZ();
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("processSubtitleItem: invalid data linkMicId=");
        sbLIZ5.append(strOptString);
        sbLIZ5.append(" roundId=");
        sbLIZ5.append(jOptLong);
        C20441214yg.LIZIZ("CoHostSubtitleManager", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public static final C15PB LIZLLL(C15P9 c15p9, String str, String str2, String str3, long j, long j2, long j3, C15PA c15pa, String str4, long j4) {
        String strLIZIZ;
        Object obj;
        C954460awe next;
        String str5;
        String strLIZIZ2 = str2;
        if (!c15p9.LIZJ.containsKey(str)) {
            Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LJIIJJI, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe = next;
            if (c954460awe != null) {
                c15p9.LIZJ.put(str, C946260ajQ.LIZ(c954460awe.LJIJJ));
            } else {
                List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                ArrayList arrayList = new ArrayList();
                Iterator<C954460awe> it3 = listLLILZLL.iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(C915980Zwa.LJII().LJJJJI(it3.next().LJFF), arrayList);
                }
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    if (Intrinsics.LJFF(((C936770aU7) next2).LIZLLL, str)) {
                        obj = next2;
                        break;
                    }
                }
                C936770aU7 c936770aU7 = (C936770aU7) obj;
                if (c936770aU7 != null && (str5 = c936770aU7.LJ) != null) {
                    c15p9.LIZJ.put(str, str5);
                }
            }
        }
        String str6 = c15p9.LIZJ.get(str);
        if (str6 == null) {
            str6 = "";
        }
        if (str4 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str4);
            sbLIZ.append(strLIZIZ2);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (LiveCoHostSubtitleConfig.INSTANCE.getValue().showUnconfirmed) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = strLIZIZ2;
        }
        return new C15PB(j, str6, strLIZIZ, strLIZIZ2, j2, j4, j3, c15pa);
    }
}
