package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: renamed from: X.0Mbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571790Mbh {
    public static Set LIZ(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(new C571770Mbf(), (C571770Mbf) linkedHashSet, (Set<String>) 154);
        Exception excLJ = C0CHQ.LIZ().LJI().LJIILJJIL().LJ(new C0M4J(false, false, null, C0M4F.ALL, null, 119), awS374S0200000_8);
        if (excLJ != null) {
            return LIZIZ(str, excLJ);
        }
        AwemeDraft awemeDraftLJII = C0CHQ.LIZ().LJIIJ().LJII();
        if (awemeDraftLJII != null) {
            awS374S0200000_8.invoke(awemeDraftLJII);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fullCalculateAllowListWithMemoryOpt: accuracyAllowList size: ");
        sbLIZ.append(linkedHashSet.size());
        C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashSet;
    }

    public static Set LIZIZ(String str, Exception exc) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C20022113Vr().LIZIZ);
        C0CHQ.LIZ().LJI().LIZJ().LJIILIIL(str, exc);
        C571810Mbj.LIZ().getClass();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDefaultAllowListWhenException: exception: ");
        sbLIZ.append(exc);
        C201955140j.LJIILL(c0may, str, C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashSet;
    }
}
