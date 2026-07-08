package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0axj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955130axj {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC955210axr LIZ(long j) {
        if (!C1152520g66.LIZIZ()) {
            return null;
        }
        if (j <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applySearchingLayout skipped invalid roomId=");
            sbLIZ.append(j);
            C20441214yg.LJIIL("QuickCoHostSearchingLayout", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (C915980Zwa.LJII().L6()) {
            C20441214yg.LJIIIZ("QuickCoHostSearchingLayout", "applySearchingLayout skipped — enlarge layout active");
            return null;
        }
        if (C955010axX.LJIIJ) {
            List listLIZLLL = C957830b25.LIZLLL();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                Long l = ((LinkUser) it2.next()).userId;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.isEmpty()) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                long jLJIILLIIL = C950220apo.LJIILLIIL(C500260Jjc.LJJLI());
                if (jLJIILLIIL > 0) {
                    arrayList2.add(Long.valueOf(jLJIILLIIL));
                }
            }
            C915120ZvC.LIZIZ(j, true, 8, arrayList2, null, 16);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applySearchingLayout server path sdkLinkedSize=");
            sbLIZ2.append(C915980Zwa.LJII().LJJIJ().size());
            sbLIZ2.append(" userIds=");
            sbLIZ2.append(arrayList2);
            C20441214yg.LJIIIZ("QuickCoHostSearchingLayout", C2188811AlT.LIZIZ(sbLIZ2));
            return EnumC955210axr.SERVER_DRIVEN;
        }
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 != null) {
            c955010axXI30.LJJI(C957810b23.LIZJ);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("applySearchingLayout client path sdkLinkedSize=");
        sbLIZ3.append(C915980Zwa.LJII().LJJIJ().size());
        C20441214yg.LJIIIZ("QuickCoHostSearchingLayout", C2188811AlT.LIZIZ(sbLIZ3));
        return EnumC955210axr.CLIENT_DRIVEN;
    }
}
