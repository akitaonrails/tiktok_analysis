package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS149S1200000_35;
import kotlin.jvm.internal.AwS184S1100000_35;
import kotlin.jvm.internal.Intrinsics;
import r3d.a;

/* JADX INFO: renamed from: X.1E8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2276531E8t<RULE extends a> implements InterfaceC2276541E8u<RULE> {
    public abstract RuleHitState LIZLLL(String str, String str2, List<String> list);

    public AbstractC2276531E8t() {
        new SimpleDateFormat("MM-dd HH:mm:ss");
    }

    @Override // X.InterfaceC822760WPi
    public final RuleHitState LIZ(String str, String str2) {
        List<String> listLIZJ;
        InterfaceC822750WPh context = getContext();
        if (context != null && context.getLogger() != null) {
            new AwS184S1100000_35(str, (String) this, 9);
        }
        if (Intrinsics.LJFF(LIZIZ().getControlScope(), "single")) {
            listLIZJ = Collections.singletonList(str2);
        } else {
            listLIZJ = LIZJ();
        }
        RuleHitState ruleHitStateLIZLLL = LIZLLL(str, str2, listLIZJ);
        InterfaceC822750WPh context2 = getContext();
        if (context2 != null && context2.getLogger() != null) {
            new AwS149S1200000_35(str, (String) this, ruleHitStateLIZLLL, (RuleHitState) 4);
        }
        return ruleHitStateLIZLLL;
    }
}
