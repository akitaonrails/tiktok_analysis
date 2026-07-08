package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891610YyN {
    public static final C0IBF[] LIZ = {C0IBF.FEATURE_STATUS_HIDE, C0IBF.FEATURE_STATUS_DISABLED};

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            String conversationId = ((IMConversation) obj).getConversationId();
            if (conversationId != null && C0ZNY.LIZ.LIZLLL(conversationId, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LIZIZ(List list, boolean z, C1231704rr c1231704rr) {
        List list2;
        String str;
        boolean z2;
        Object c098200Yq;
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(516);
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((BaseContact) it2.next()).getUid());
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(aFwS248S0000000_14.invoke(it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ((String) it4.next());
            if (c0y8tLIZ != null) {
                arrayList4.add(c0y8tLIZ);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((C0Y8T) it5.next()).getConversationId());
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LJLLLLLL(arrayList3, C13LP.LLIIJI(arrayList5)));
        if (listLLIIII.isEmpty()) {
            list2 = C13BV.INSTANCE;
        } else {
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = interfaceC876950YajLIZIZ.LJIIJJI(C869770YAd.LIZ(new C869690Y9v(C1262604wq.LIZ(listLLIIII), null, null, null, null, null, 1022), 0, 0L, false, 62));
            if (c0y6qLJIIJJI.LIZIZ == null) {
                list2 = c0y6qLJIIJJI.LIZ.LIZIZ;
            } else {
                list2 = C13BV.INSTANCE;
            }
        }
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.addAll(arrayList4);
        c13dvLIZIZ.addAll(list2);
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : listLIZ) {
            try {
                c098200Yq = C2272701DxU.ADAPTER.decode(((C0Y8T) obj).getBizExt()).camera_status;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                c098200Yq = C0IBF.FEATURE_STATUS_UNKNOWN;
            }
            if (C13LQ.LJIILLIIL(c098200Yq, LIZ)) {
                arrayList6.add(obj);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (z) {
            str = "suggested";
        } else {
            str = "search";
        }
        sbLIZ.append(str);
        sbLIZ.append(" no camera status list size ");
        sbLIZ.append(arrayList6.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList6, 10));
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            arrayList7.add(((C0Y8T) it6.next()).getConversationId());
        }
        String.valueOf(arrayList7);
        c1231704rr.LIZIZ();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Object objInvoke = aFwS248S0000000_14.invoke(((BaseContact) obj2).getUid());
            Iterator it7 = arrayList6.iterator();
            while (true) {
                if (it7.hasNext()) {
                    if (Intrinsics.LJFF(((C0Y8T) it7.next()).getConversationId(), objInvoke)) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                arrayList8.add(obj2);
            }
        }
        return arrayList8;
    }
}
