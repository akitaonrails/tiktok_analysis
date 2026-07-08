package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.04lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1191704lP {
    public static final Map<String, Pair<String, C13IQ<? extends UISlotAssem>>> LIZ = C2097608Jq.LJIIJ(new Pair("sub_space_activity_list_fragment", new Pair("sub_space_activity_list_dialog", C13LE.LIZ(SubSpaceActivityContentAssem.class))));

    public static final void LIZ(Fragment fragment, String str) {
        C13IQ c13iq;
        Pair pair = (Pair) ((LinkedHashMap) LIZ).get(str);
        if (pair != null && (c13iq = (C13IQ) pair.getSecond()) != null) {
            C723850SaN.LIZ(fragment, false, null, new C1147604eI(fragment, c13iq), 3);
        }
    }
}
