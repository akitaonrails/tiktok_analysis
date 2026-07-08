package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561130Lzb {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(627));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(628));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(629));

    public final synchronized void LIZ(AwemeDraft awemeDraft) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeDraftCaches : query -> creationId = ");
        sbLIZ.append(awemeDraft.LIZ());
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        if (C291100Bb2.LIZ()) {
            ((C603820NmG) this.LIZIZ.getValue()).LIZLLL(awemeDraft.LIZ(), awemeDraft);
        } else {
            ((ConcurrentHashMap) this.LIZ.getValue()).put(awemeDraft.LIZ(), awemeDraft);
        }
    }

    public final synchronized void LIZJ(String str) {
        ((ConcurrentHashMap) this.LIZJ.getValue()).remove(str);
    }

    public final synchronized AwemeDraft LIZLLL(String str) {
        return LJFF(str);
    }

    public final synchronized AwemeDraft LJ(String str) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeDraftCaches : query -> creationId = ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        if (C291100Bb2.LIZ()) {
            AwemeDraft awemeDraftLJFF = (AwemeDraft) ((C603820NmG) this.LIZIZ.getValue()).LIZJ(str);
            if (awemeDraftLJFF == null) {
                awemeDraftLJFF = LJFF(str);
            }
            return awemeDraftLJFF;
        }
        AwemeDraft awemeDraftLJFF2 = (AwemeDraft) ((ConcurrentHashMap) this.LIZ.getValue()).get(str);
        if (awemeDraftLJFF2 == null) {
            awemeDraftLJFF2 = LJFF(str);
        }
        return awemeDraftLJFF2;
    }

    public final AwemeDraft LJFF(String str) {
        AwemeDraft awemeDraftLIZJ = C0M4A.LIZJ(new C0M4B(new CreativeInfo(str, 0, null, 6, null), false, (List) null, 14));
        if (awemeDraftLIZJ != null) {
            if (C291100Bb2.LIZ()) {
                ((C603820NmG) this.LIZIZ.getValue()).LIZLLL(str, awemeDraftLIZJ);
            } else {
                ((ConcurrentHashMap) this.LIZ.getValue()).put(str, awemeDraftLIZJ);
            }
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AwemeDraftCaches : query -> draft from db,creationId = ");
            sbLIZ.append(awemeDraftLIZJ.LIZJ());
            C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        }
        return awemeDraftLIZJ;
    }

    public final synchronized void LIZIZ(String str, C0M0P c0m0p) {
        ((ConcurrentHashMap) this.LIZJ.getValue()).put(str, c0m0p);
    }
}
