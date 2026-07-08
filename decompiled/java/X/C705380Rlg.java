package X;

import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateAction;
import com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateActionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705380Rlg {
    public static C705340Rlc LIZ(String str, C704830Rkn c704830Rkn, Map map, InterfaceC497601wk interfaceC497601wk) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start registering actions. actions: ");
        sbLIZ.append(map.keySet());
        C2188811AlT.LIZIZ(sbLIZ);
        C705340Rlc c705340Rlc = new C705340Rlc();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            FcpTemplateActionGroup fcpTemplateActionGroup = (FcpTemplateActionGroup) entry.getValue();
            List list = fcpTemplateActionGroup.events;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZIZ(str, c704830Rkn, (FcpTemplateAction) it2.next(), interfaceC497601wk));
            }
            c705340Rlc.LIZ.put((String) key, arrayList);
            c705340Rlc.LIZIZ.put((String) key, fcpTemplateActionGroup);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finish registering actions. registered action list: ");
        sbLIZ2.append(c705340Rlc.LIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c705340Rlc;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC705350Rld LIZIZ(final java.lang.String r21, final X.C704830Rkn r22, com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateAction r23, final X.InterfaceC497601wk r24) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705380Rlg.LIZIZ(java.lang.String, X.0Rkn, com.ss.android.ugc.aweme.feed.model.banner.FcpTemplateAction, X.01wk):X.0Rld");
    }
}
