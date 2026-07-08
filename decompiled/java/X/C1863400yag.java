package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationEntranceInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0yag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863400yag {
    public static volatile C1863380yae LIZLLL;
    public static final C1863400yag LIZ = new C1863400yag();
    public static final ConcurrentHashMap<String, C1863380yae> LIZIZ = new ConcurrentHashMap<>();
    public static final Set<Long> LIZJ = new LinkedHashSet();
    public static final Map<String, Integer> LJ = new LinkedHashMap();

    public static void LIZ(String str) {
        if (str != null) {
            LIZIZ.remove(str);
            return;
        }
        LIZIZ.clear();
        LIZLLL = null;
        C1863380yae.LJJIII.clear();
        C1863380yae.LJJIIJ.clear();
        C1863380yae.LJJIIJZLJL.clear();
        C1863380yae.LJJIIZ.clear();
        C1863380yae.LJJIIZI.clear();
        C1863380yae.LJJIJ.clear();
        C1863380yae.LJJIJIIJI.clear();
        C1863380yae.LJJIJIIJIL.clear();
        C1863380yae.LJJIJL = null;
        C1863380yae.LJJIJIL = null;
    }

    public static C1863380yae LIZJ(Integer num, Long l) {
        if (l == null || num == null) {
            return null;
        }
        return LIZIZ.get(C1863420yai.LJIIIIZZ(num.intValue(), l.longValue(), null));
    }

    public static Object LIZLLL(C1863400yag c1863400yag, C1863380yae c1863380yae, Function0 function0, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        if ((i & 4) != 0) {
            function0 = AFwS226S0000000_35.get$arr$(688);
        }
        c1863400yag.getClass();
        Object objLJIJ = C1863380yae.LJIJ(c1863380yae, 0, new AwS393S0200000_27(c1863380yae, (C1863380yae) function0, (Function0<Unit>) 144), null, interfaceC1364105Vn, 1);
        if (objLJIJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIJ;
    }

    public static C1863380yae LIZIZ(C1863400yag c1863400yag, Context context, Function0 function0, String str, String str2, String str3, String str4, Lifecycle lifecycle, long j, int i, int i2, int i3, boolean z, boolean z2, String str5, SubConversationEntranceInfo subConversationEntranceInfo, Function1 function1, boolean z3, String str6, int i4) {
        AFwS219S0000000_30 aFwS219S0000000_30;
        String string = str3;
        int i5 = i2;
        boolean z4 = z;
        int i6 = i3;
        String str7 = str5;
        String str8 = str;
        String str9 = str2;
        Lifecycle lifecycle2 = lifecycle;
        SubConversationEntranceInfo subConversationEntranceInfo2 = subConversationEntranceInfo;
        String str10 = null;
        if ((i4 & 4) != 0) {
            aFwS219S0000000_30 = AFwS219S0000000_30.get$arr$(321);
        } else {
            aFwS219S0000000_30 = null;
        }
        if ((i4 & 8) != 0) {
            str8 = "inbox";
        }
        String str11 = "";
        if ((i4 & 16) != 0) {
            str9 = "";
        }
        if ((i4 & 32) != 0) {
            string = UUID.randomUUID().toString();
        }
        if ((i4 & 64) == 0) {
            str11 = str4;
        }
        if ((i4 & 128) != 0) {
            lifecycle2 = null;
        }
        if ((i4 & 1024) != 0) {
            i5 = 0;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i6 = 0;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z4 = false;
        }
        if ((i4 & 8192) != 0) {
            z2 = false;
        }
        if ((i4 & 16384) != 0) {
            str7 = null;
        }
        if ((32768 & i4) != 0) {
            subConversationEntranceInfo2 = null;
        }
        if ((131072 & i4) != 0) {
            z3 = false;
        }
        if ((i4 & 262144) == 0) {
            str10 = str6;
        }
        c1863400yag.getClass();
        C1863380yae c1863380yae = LIZLLL;
        if (c1863380yae == null || !z3 || j != 1 || z2) {
            c1863380yae = c1863380yae;
            C1863380yae c1863380yae2 = new C1863380yae(context, function0, aFwS219S0000000_30, str8, str9, string, str11, j, i, i5, i6, z4, str10, str7, subConversationEntranceInfo2, lifecycle2);
            if (z2) {
                LIZIZ.put(C1863420yai.LJIIIIZZ(i, j, null), c1863380yae);
            }
            function1.invoke(c1863380yae);
            if (z3 && j == 1 && !z2) {
                LIZLLL = c1863380yae;
                return c1863380yae;
            }
        }
        return c1863380yae;
    }
}
