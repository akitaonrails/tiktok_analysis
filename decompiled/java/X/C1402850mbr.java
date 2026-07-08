package X;

import com.ss.android.ugc.asve.editor.NLECommitStatisticsConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402850mbr {
    public static final C1402850mbr LIZ = new C1402850mbr();

    public static final void LIZ(List<Integer> list, List<Integer> list2) {
        if (!((Boolean) C1402860mbs.LIZJ.getValue()).booleanValue()) {
            return;
        }
        int i = 0;
        if (list != null && !((ArrayList) list).isEmpty() && list2 != null && !((ArrayList) list2).isEmpty()) {
            C0LAB c0lab = new C0LAB();
            int i2 = 0;
            for (Object obj : (ArrayList) list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("nle_diff_dur");
                        sbLIZ.append(i3);
                        sbLIZ.append("_count");
                        c0lab.LIZ(iIntValue, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            for (Object obj2 : (ArrayList) list2) {
                int i4 = i + 1;
                if (i >= 0) {
                    int iIntValue2 = ((Number) obj2).intValue();
                    if (iIntValue2 != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("nle_render_dur");
                        sbLIZ2.append(i4);
                        sbLIZ2.append("_count");
                        c0lab.LIZ(iIntValue2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c0lab.LIZ(((NLECommitStatisticsConfig) C1402860mbs.LIZIZ.getValue()).version, "version");
            C20684815ws.LJIILLIIL("nle_commit_duration", c0lab.LIZ);
        }
    }
}
