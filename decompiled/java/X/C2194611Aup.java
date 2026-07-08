package X;

import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import java.util.Map;

/* JADX INFO: renamed from: X.1Aup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194611Aup extends C1504590pFx {
    public C2194611Aup(InterfaceC1177504j7 interfaceC1177504j7) {
        super(interfaceC1177504j7);
    }

    public static void LJII(EnumC1386450mBP enumC1386450mBP, int i, Map map, String str) {
        EnumC2194261AuG enumC2194261AuG;
        MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
        if (miniGameFragmentLIZIZ != null && ((enumC2194261AuG = miniGameFragmentLIZIZ.LLLIIII) == EnumC2194261AuG.LOAD_START || enumC2194261AuG == EnumC2194261AuG.MAINFRAME_LOAD_SUCCESS)) {
            miniGameFragmentLIZIZ.uA(enumC1386450mBP, i, map);
        }
        C2195011AvT c2195011AvTLIZJ = C2195221Avo.LIZJ();
        if (c2195011AvTLIZJ != null && c2195011AvTLIZJ.LJIJJLI == EnumC1006650cIp.IN_PROGRESS) {
            c2195011AvTLIZJ.LJIIIZ(i, str, false);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchLoadError dropped: no live fragment/render in loading state, monitorCode=");
        sbLIZ.append(i);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
