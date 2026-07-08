package X;

import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12ER, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12ER {
    public static final C01GW<C12ER> LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(340));

    public static void LIZ(int i, String str) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProvideAllowList: ");
        sbLIZ.append(str);
        sbLIZ.append(". Thread: ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(", operationQueue size: ");
        sbLIZ.append(i);
        C201955140j.LJIILL(c0may, "DraftAllowListWithIncrementOpt", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(int i, long j, String str) {
        C2341909Fp.LIZ("provide_draft_allow_list", C2097608Jq.LJIIJ(new Pair("tag", str), new Pair("execute_time", String.valueOf(j)), new Pair("is_in_ui_thread", String.valueOf(C12ES.LJIIL())), new Pair("allow_list_size", String.valueOf(i))));
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("provideAllowList: thread: ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(", executeTime: ");
        sbLIZ.append(j);
        sbLIZ.append(", allowList size: ");
        sbLIZ.append(i);
        C201955140j.LJIILL(c0may, str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
