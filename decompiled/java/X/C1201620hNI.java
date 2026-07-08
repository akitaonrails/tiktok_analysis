package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS29S0102000_18;
import kotlin.jvm.internal.AwS5S0103000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201620hNI extends AbstractC1196150hET {
    public static final C1201620hNI LIZ = new C1201620hNI();
    public static final String LIZIZ = "nearby_double_column_feed";

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }

    public static Map LJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new LinkedHashMap();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.opt(next));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse stageTraceData failed: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return new LinkedHashMap();
        }
    }

    public static void LJFF(int i, EnumC1201640hNK enumC1201640hNK, Integer num, String str) {
        String str2;
        if (num == null) {
            str2 = "revamp_request";
        } else {
            str2 = "revamp_chunk_request";
        }
        String strLIZ = C2177408g0.LIZ("nearby_experience_track", str2, str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("aweme_list_size", String.valueOf(i)));
        if (num != null) {
            mapLJIIJ.put("chunk_index", String.valueOf(num.intValue()));
        }
        InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(strLIZ);
        interfaceC1199990hKfLIZIZ.LJIJJ(mapLJIIJ);
        int i2 = C1201630hNJ.LIZ[enumC1201640hNK.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                interfaceC1199990hKfLIZIZ.LJIJI(enumC1201640hNK.getTypeStr());
                interfaceC1199990hKfLIZIZ.LJJIFFI();
                return;
            } else {
                interfaceC1199990hKfLIZIZ.LJIJJLI();
                interfaceC1199990hKfLIZIZ.LJJIFFI();
                return;
            }
        }
        interfaceC1199990hKfLIZIZ.LJJ(null);
    }

    public final void LJI(EnumC1201640hNK enumC1201640hNK, int i, int i2, String str) {
        LIZJ("nearby_revamp_code", new AwS29S0102000_18(enumC1201640hNK, i, i2, 2));
        LJFF(i2, enumC1201640hNK, null, str);
    }

    public static void LJII(long j, NearbyRevampResponse nearbyRevampResponse, String str, boolean z, long j2) {
        boolean z2;
        Map mapLJ = LJ(nearbyRevampResponse.stageTraceData);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z && j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            mapLJ.put("reuse_duration", Long.valueOf(jElapsedRealtime - j));
        }
        LocationNetTracker.LIZIZ(null, new C1201160hMY(z2, jElapsedRealtime, j2, j, nearbyRevampResponse, str, mapLJ, z));
    }

    public final void LIZLLL(EnumC1201640hNK enumC1201640hNK, int i, int i2, int i3, String str) {
        LIZJ("nearby_revamp_chunk_code", new AwS5S0103000_18(enumC1201640hNK, i, i3, i2, 1));
        LJFF(i3, enumC1201640hNK, Integer.valueOf(i2), str);
    }
}
