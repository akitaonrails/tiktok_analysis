package X;

import Y.AObjectS78S0000000_28;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10R7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10R7 {
    public static final C10R7 LIZ = new C10R7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(12));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(13));

    public static C19247910Rx LIZIZ() {
        return (C19247910Rx) LIZIZ.getValue();
    }

    public static final C10RJ LIZJ() {
        return new C10RJ(LIZIZ().LIZJ("title", ""), LIZIZ().LIZJ("sub_title", ""), (List) LIZJ.getValue());
    }

    public static final void LJ() {
        C19249910Sr.LIZIZ.LIZ("show_language_selection", new HashMap<>());
    }

    public static final Boolean LIZ() {
        return !Intrinsics.LJFF("run", LIZIZ().LIZJ("should_run", "")) ? Boolean.FALSE : ((List) LIZJ.getValue()).isEmpty() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static final void LIZLLL(String str, List<String> list) {
        String strLJJLIIIJ;
        int size;
        if (list != null && !list.isEmpty()) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = "";
        }
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C19249910Sr.LIZIZ.LIZ("exit_language_selection", C2097608Jq.LJI(new Pair("exit_method", str), new Pair("language_list", strLJJLIIIJ), new Pair("language_selected_cnt", String.valueOf(size))));
    }
}
