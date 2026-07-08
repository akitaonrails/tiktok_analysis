package X;

import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0na8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440220na8 {
    public static final C1440220na8 LIZ = new C1440220na8();
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS210S0000000_22.get$arr$(359));
    public static final List<Integer> LIZJ = C1697810uHb.LJIIJJI(480, 576, 720, 1080);
    public static final List<Integer> LIZLLL = C1697810uHb.LJIIJJI(720, 1024, 1280, 1920);
    public static final Map<String, String> LJ = new LinkedHashMap();

    public static boolean LIZ() {
        String str;
        C01GW c01gw = LIZIZ;
        SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c01gw.getValue();
        String str2 = smartSynthesisModelPath != null ? smartSynthesisModelPath.smartcodec : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            return false;
        }
        SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c01gw.getValue();
        if (smartSynthesisModelPath2 != null && (str = smartSynthesisModelPath2.statics) != null) {
            str3 = str;
        }
        return str3.length() > 0;
    }

    public static final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartSynthesisModelFetcher -> ");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZJ(int i, String str) {
        return u.LJJIFFI(str, "${resolution}", String.valueOf(i), false);
    }
}
