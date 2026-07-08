package X;

import android.util.Base64;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.06Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1609306Rv {
    public static final C1609306Rv LIZ = new C1609306Rv();

    public static void LIZIZ(List list) {
        String currentUserID;
        String strLJJIIZ;
        C0Y8T c0y8tLJIL;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null) {
                    currentUserID = iUserService.getCurrentUserID();
                } else {
                    currentUserID = null;
                }
                if (!Intrinsics.LJFF(str2, currentUserID) && (c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL((strLJJIIZ = C1336205Ku.LIZ(false).getImChatService().LJJIIZ(str2)))) != null && ((coreInfo = c0y8tLJIL.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:collaborative_collection_status")) == null || !Boolean.parseBoolean(str))) {
                    C0YNP.LIZIZ(strLJJIIZ).LJIL(C2097908Jt.LIZJ(new Pair("a:collaborative_collection_status", "true")), new C1768906wJ(0));
                }
            }
        }
    }

    public static void LIZ(String str, String str2, String str3, List list, List list2) {
        String currentUserID = null;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!Intrinsics.LJFF(obj, currentUserID)) {
                    arrayList.add(obj);
                }
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C2241931Cox.LIZLLL(C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode((String) it2.next(), 0)), DynamicCardTemplate.class);
                    if (dynamicCardTemplate != null) {
                        String strLJJIIZ = C1336205Ku.LIZ(false).getImChatService().LJJIIZ((String) C13LP.LJJJLZIJ(0, arrayList));
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1609106Rt(dynamicCardTemplate, strLJJIIZ, str, str2, str3, null), 3);
                    }
                }
            }
        }
    }
}
