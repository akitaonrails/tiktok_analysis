package X;

import com.ss.android.ugc.aweme.ml.strategycenter.stream.CaiSlardarEventBlackList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0Wgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829770Wgp {
    public static final C829770Wgp LIZ = new C829770Wgp();
    public static final CaiSlardarEventBlackList LIZIZ;
    public static final C01GW LIZJ;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("bpea_event");
        linkedHashSet.add("pns_decision_execute_result");
        linkedHashSet.add("network_partner_log");
        linkedHashSet.add("pumbaa_performance");
        LIZIZ = new CaiSlardarEventBlackList(linkedHashSet);
        LIZJ = C452501pT.LIZIZ(new C829780Wgq());
    }
}
