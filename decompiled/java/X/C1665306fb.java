package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1665306fb implements InterfaceC877200Yb8 {
    public static final C1665306fb LIZ = new C1665306fb();
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(3, 7, 8);

    @Override // X.InterfaceC877200Yb8
    public final boolean LIZIZ(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return false;
        }
        List<Integer> listLIZJ = LIZJ(c0y8t);
        if (listLIZJ.isEmpty()) {
            return false;
        }
        Iterator<Integer> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            if (LIZIZ.contains(Integer.valueOf(it2.next().intValue()))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC877200Yb8
    public final List<Integer> LIZJ(C0Y8T c0y8t) {
        Map<String, String> ext;
        String str;
        ArrayList arrayList = new ArrayList();
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:conv_entrance_log")) != null && str.length() > 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList2.add(numLJIIJJI);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // X.InterfaceC877200Yb8
    public final Boolean LIZ(C0Y8T c0y8t, IMUser iMUser) {
        IMUserBizInfo imUserBizInfo;
        if (c0y8t == null || !C1665606fe.LIZ() || iMUser == null || (imUserBizInfo = iMUser.getImUserBizInfo()) == null || imUserBizInfo.getUserB2CAccountInfo() == null) {
            return null;
        }
        return Boolean.valueOf(C1668706g9.LIZ(IIMBusinessChatService.LIZ).LIZIZ().LIZIZ(iMUser));
    }
}
