package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1D4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250051D4x implements InterfaceC783690Uoh {
    public static final List<Pair<String, EnumC2250061D4y>> LJIJJLI;
    public boolean LJ;
    public String LJI;
    public boolean LJII;
    public C1D41 LJIIIIZZ;
    public final HashMap<EnumC2250061D4y, String> LIZ = new HashMap<>();
    public long LIZIZ = -1;
    public final HashMap<EnumC2250061D4y, String> LIZJ = new HashMap<>();
    public long LIZLLL = -1;
    public int LJFF = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public String LJIIL = "";
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public double LJIILL = -1.0d;
    public int LJIILLIIL = -1;
    public String LJIIZILJ = "";
    public String LJIJ = "default";
    public int LJIJI = 0;
    public String LJIJJ = "";

    public final long LIZJ() {
        this.LJ = true;
        this.LIZIZ = System.currentTimeMillis();
        this.LIZ.clear();
        this.LIZ.put(EnumC2250061D4y.START_SPEED_TEST_TIME, String.valueOf(System.currentTimeMillis()));
        return this.LIZIZ;
    }

    static {
        ArrayList arrayList = new ArrayList();
        LJIJJLI = arrayList;
        arrayList.add(new Pair("start_native_api_call_time", EnumC2250061D4y.LIVECORE_START_TIME));
        arrayList.add(new Pair("start_cpp_api_call_time", EnumC2250061D4y.LIVECORE_CPP_START_TIME));
        arrayList.add(new Pair("node_optimize_time", EnumC2250061D4y.LIVECORE_NODE_TEST_TIME));
        arrayList.add(new Pair("dns_time", EnumC2250061D4y.LIVECORE_DNS_TEST_TIME));
        arrayList.add(new Pair("socket_connect_time", EnumC2250061D4y.LIVECORE_SOCKET_TEST_TIME));
        arrayList.add(new Pair("rtmp_connect_time", EnumC2250061D4y.LIVECORE_RTMP_TEST_TIME));
        arrayList.add(new Pair("start_send_packet_time", EnumC2250061D4y.LIVECORE_PACK_TEST_TIME));
    }

    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordCallLiveCore: ");
        sbLIZ.append(str);
        sbLIZ.append(", shouldReport: ");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJ) {
            LIZJ();
        }
        this.LIZJ.put(EnumC2250061D4y.LIVECORE_SPEED_TEST_TIME, String.valueOf(System.currentTimeMillis() - this.LIZLLL));
        this.LIZJ.put(EnumC2250061D4y.LIVECORE_SPEED_TEST_TIME_RESULT, str);
    }

    public final void LIZLLL(C1D49 c1d49) {
        long jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseBwProbeResult shouldReport:");
        sbLIZ.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("parseBwProbeResult params: ");
        sbLIZ2.append(c1d49);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (c1d49.LJFF) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = c1d49.LJIIIZ;
        }
        this.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_TIME, String.valueOf(jCurrentTimeMillis - this.LIZLLL));
        int i = this.LJIIJ;
        if (i != -1) {
            this.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_RESULT, String.valueOf(i));
        }
        int i2 = this.LJIIIZ;
        if (i2 != -1) {
            this.LIZJ.put(EnumC2250061D4y.SPEED_TEST_END_STATUS, String.valueOf(i2));
        }
        try {
            JSONObject jSONObject = new JSONObject(c1d49.LIZJ);
            for (Pair pair : (ArrayList) LJIJJLI) {
                if (jSONObject.has((String) pair.getFirst())) {
                    this.LIZJ.put((EnumC2250061D4y) pair.getSecond(), String.valueOf(CastLongProtector.parseLong(JSONObjectProtectorUtils.getString(jSONObject, (String) pair.getFirst())) - this.LIZLLL));
                } else {
                    this.LIZJ.put((EnumC2250061D4y) pair.getSecond(), "-999");
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i3 = c1d49.LIZIZ;
        if (i3 != -1) {
            this.LJFF = i3;
        }
        this.LJIILIIL = c1d49.LJIJ;
        this.LJIILJJIL = c1d49.LJIJJ;
        this.LJIILL = c1d49.LJJIII;
        this.LJIILLIIL = c1d49.LJJII;
        this.LJIIZILJ = c1d49.LJJIIJ;
        EnumC1277260jLI enumC1277260jLI = c1d49.LJIIL;
        if (enumC1277260jLI != null) {
            this.LJIJJ = enumC1277260jLI.value();
        }
    }

    public final void LIZIZ(EnumC2250061D4y enumC2250061D4y, String str) {
        this.LIZ.put(enumC2250061D4y, str);
    }
}
