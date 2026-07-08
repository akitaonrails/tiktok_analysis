package X;

import android.app.Activity;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS90S1300000_28;

/* JADX INFO: renamed from: X.103b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191833103b {
    public static final Map<String, C103L> LIZ;

    static {
        C103L c103l = C103I.LIZ;
        C103L c103l2 = C103I.LIZ;
        LIZ = C2097908Jt.LIZJ(new Pair(c103l2.LIZ, c103l2));
    }

    public static final void LIZIZ(Activity activity, String str, Function1<? super C103L, Unit> function1) {
        C259800zU c259800zU = new C259800zU();
        LIZ(str, function1, new AwS572S0100000_28(activity, 661), new AwS572S0100000_28(activity, 662), new AwS429S0200000_28(activity, c259800zU, 68), new AwS572S0100000_28(c259800zU, (C259800zU<DialogC1389620mGW>) 663));
    }

    public static final void LIZ(String str, Function1<? super C103L, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        C191821102p.LIZJ().getClass();
        C103L c103lLJ = TPSCRenderManager.LJ(str);
        if (c103lLJ != null) {
            function1.invoke(c103lLJ);
            return;
        }
        C1913480ztS.LIZ("pns_tpsc_configurable_exception", C2097608Jq.LJIIIIZZ(new Pair("type", "config_not_found"), new Pair("page_tag", str)), null, 12);
        if (function03 != null) {
            function03.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_fallback");
        C103A.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), new AwS90S1300000_28(str, function04, function0, function1, 2), new AwS143S1200000_28(str, function04, function02, 5));
    }
}
