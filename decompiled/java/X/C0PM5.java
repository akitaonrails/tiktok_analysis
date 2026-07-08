package X;

import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0PM5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PM5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1049));

    public static final boolean LIZ() {
        return !((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final boolean LIZIZ(C0PSG c0psg) {
        String requestContent;
        if (LIZ() && c0psg != null) {
            if (c0psg.isDefaultOption()) {
                ResearchFilterStruct researchFilterOption = c0psg.getResearchFilterOption();
                if (researchFilterOption != null) {
                    requestContent = researchFilterOption.getRequestContent();
                } else {
                    requestContent = null;
                }
                if (C703302op.LIZ(requestContent)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
