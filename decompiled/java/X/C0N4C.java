package X;

import Y.ARunnableS14S1100000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N4C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4C {
    public static volatile boolean LIZIZ;
    public static final List<Function0<Unit>> LIZ = Collections.synchronizedList(new ArrayList());
    public static EnumC585590Mxx LIZJ = EnumC585590Mxx.DEFAULT;
    public static C0N4B LIZLLL = C0N4B.DEFAULT;
    public static final Set<String> LJ = new LinkedHashSet();

    public static JSONObject LIZIZ(Pair... pairArr) {
        boolean z;
        if (pairArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Pair pair : pairArr) {
            try {
                jSONObject.putOpt((String) pair.getFirst(), pair.getSecond());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public static void LIZLLL(C0N4B c0n4b) {
        Pair[] pairArr = new Pair[3];
        int i = 0;
        pairArr[0] = new Pair("cache_type", 3);
        pairArr[1] = new Pair("errorCode", Integer.valueOf(c0n4b.getType()));
        if (c0n4b.getType() == C0N4B.SUCCESS.getType()) {
            i = 1;
        }
        pairArr[2] = new Pair("is_success", Integer.valueOf(i));
        LIZ("cache_feed_request_response", LIZIZ(pairArr));
        LIZLLL = C0N4B.DEFAULT;
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        C20684815ws.LJFF().execute(new ARunnableS14S1100000_9(str, jSONObject, 1));
    }

    public static void LIZJ(String str, C0N4E c0n4e) {
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        int i = C0N4D.LIZ[c0n4e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c118300cf.element = LJ.contains(str) ? 1 : 0;
            } else {
                return;
            }
        } else {
            c118300cf.element = 0;
        }
        if (!LIZIZ && ((Boolean) C590610NEl.LIZLLL.getValue()).booleanValue()) {
            LIZ.add(new AwS553S0100000_9(c118300cf, 11));
        } else {
            LIZ("cache_video_request_response", LIZIZ(new Pair("cache_type", 3), new Pair("is_remove", Integer.valueOf(c118300cf.element))));
        }
    }
}
