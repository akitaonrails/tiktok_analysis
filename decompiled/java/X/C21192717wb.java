package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.17wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21192717wb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC21193117wf enumC21193117wf, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Integer num, Boolean bool, Boolean bool2, String str4, int i) {
        if ((i & 512) != 0) {
            bool = null;
        }
        if ((i & 1024) != 0) {
            bool2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str4 = null;
        }
        try {
            String strName = enumC21193117wf.name();
            Locale locale = Locale.ROOT;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("step", strName.toLowerCase(locale)), new Pair("role", str.toLowerCase(locale)), new Pair("room_id", str2), new Pair("product_id", str3), new Pair("is_page_visible", Integer.valueOf(z ? 1 : 0)), new Pair("is_keyboard_showing", Integer.valueOf(z2 ? 1 : 0)), new Pair("has_ec_perm", Integer.valueOf(z3 ? 1 : 0)), new Pair("is_from_message", Integer.valueOf(z4 ? 1 : 0)), new Pair("card_type", num), new Pair("need_retry", bool), new Pair("is_retry_request", bool2), new Pair("fail_reason", str4));
            try {
                C21193917wn.LIZ.getClass();
                mapLJIIJ.putAll(C21193917wn.LIZLLL(num));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1421105hJ.LIZJ("rd_ttec_pin_card_event", mapLJIIJ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
