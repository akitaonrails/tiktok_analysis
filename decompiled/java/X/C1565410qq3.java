package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565410qq3 implements C15W0 {
    public final String LIZ;

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage_explore"), new Pair("card_position", this.LIZ));
    }

    @Override // X.C15W0
    public final String getEventName() {
        return "explore_exit_feedback_window";
    }

    public C1565410qq3(String str) {
        this.LIZ = str;
    }
}
