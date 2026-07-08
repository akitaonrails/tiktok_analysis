package X;

import java.util.LinkedHashMap;
import kotlin.text.a0;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: renamed from: X.0asm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952060asm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(C948680anK c948680anK, String str, String str2) {
        boolean z;
        boolean z2;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        C948680anK c948680anKLIZ = LIZ(c948680anK, "process", str, str2);
        if (c948680anKLIZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("process: applying layout scene=");
        sbLIZ.append(c948680anKLIZ.LJ);
        sbLIZ.append(" version=");
        sbLIZ.append(c948680anKLIZ.LIZLLL.version);
        sbLIZ.append(' ');
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("layoutKey=");
        sbLIZ2.append(c948680anKLIZ.LIZ());
        sbLIZ2.append(" localLayoutOnly=");
        LayoutState layoutState = c948680anKLIZ.LIZLLL.layout;
        CohostTypeLayoutExtra cohostTypeLayoutExtra2 = null;
        if (layoutState != null) {
            cohostTypeLayoutExtra2 = layoutState.cohostLayoutExtra;
        }
        if (cohostTypeLayoutExtra2 != null && cohostTypeLayoutExtra2.localLayoutOnly) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        sbLIZ2.append(" source=");
        sbLIZ2.append(str);
        sbLIZ2.append(' ');
        sbLIZ2.append(str2);
        sbLIZ.append(a0.LJLILLLLZI(C2188811AlT.LIZIZ(sbLIZ2)).toString());
        C20441214yg.LJIIIZ("ServerLayoutProcessor", C2188811AlT.LIZIZ(sbLIZ));
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 == null) {
            C20441214yg.LJ("ServerLayoutApplier", "applyLayout, coHostLayoutAdapter is null, skip");
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("applyLayout scene=");
        sbLIZ3.append(c948680anKLIZ.LJ);
        sbLIZ3.append(" layoutKey=");
        sbLIZ3.append(c948680anKLIZ.LIZ());
        sbLIZ3.append(" spots=");
        sbLIZ3.append(c948680anKLIZ.LIZLLL.spotList.size());
        sbLIZ3.append(" version=");
        sbLIZ3.append(c948680anKLIZ.LIZLLL.version);
        sbLIZ3.append(" localLayoutOnly=");
        LayoutState layoutState2 = c948680anKLIZ.LIZLLL.layout;
        if (layoutState2 != null && (cohostTypeLayoutExtra = layoutState2.cohostLayoutExtra) != null && cohostTypeLayoutExtra.localLayoutOnly) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ3.append(z2);
        C20441214yg.LJIIIZ("ServerLayoutApplier", C2188811AlT.LIZIZ(sbLIZ3));
        int i = c948680anKLIZ.LJ;
        if (i == 2 || i == 16) {
            C948670anJ.LIZ(c948680anKLIZ);
        }
        c955010axXI30.LIZJ(c948680anKLIZ.LIZLLL, c948680anKLIZ.LJ);
        return true;
    }

    public static C948680anK LIZ(C948680anK c948680anK, String str, String str2, String str3) {
        long jLongValue;
        if (c948680anK == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": no valid layout data → no-op ");
            sbLIZ.append(str3);
            C20441214yg.LIZIZ(str2, a0.LJLILLLLZI(C2188811AlT.LIZIZ(sbLIZ)).toString());
            return null;
        }
        C952070asn c952070asn = C952080aso.LIZ;
        c952070asn.getClass();
        long j = c948680anK.LIZJ;
        if (j > 0) {
            long j2 = c948680anK.LIZLLL.version;
            Long l = (Long) ((LinkedHashMap) c952070asn.LIZ).get(Long.valueOf(j));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            if (j2 <= jLongValue) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(": version check failed → no-op ");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("(scene=");
                sbLIZ3.append(c948680anK.LJ);
                sbLIZ3.append(" version=");
                sbLIZ3.append(c948680anK.LIZLLL.version);
                sbLIZ3.append(") ");
                sbLIZ3.append(str3);
                sbLIZ2.append(a0.LJLILLLLZI(C2188811AlT.LIZIZ(sbLIZ3)).toString());
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        }
        long j3 = c948680anK.LIZJ;
        if (j3 > 0) {
            c952070asn.LIZ.put(Long.valueOf(j3), Long.valueOf(c948680anK.LIZLLL.version));
        }
        return c948680anK;
    }
}
