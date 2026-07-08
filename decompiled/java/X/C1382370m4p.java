package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.internalshare.impl.data.loader.WaitSDKFetchShareSortedListRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0m4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382370m4p implements C0Y6L {
    public List<C0Y8T> LL;
    public boolean LLILLJJLI = true;

    @Override // X.C0Y6L
    public final void LIZ() {
    }

    @Override // X.C0Y6L
    @InterfaceC1294060jmO
    public final void LIZJ() {
    }

    public final List<C0Y8T> LIZIZ() {
        List<C0Y8T> listLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZIZ();
        if (!C289820BXo.LIZ()) {
            return listLIZIZ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<C0Y8T> list = this.LL;
        for (C0Y8T c0y8t : listLIZIZ) {
            linkedHashMap.put(c0y8t.getConversationId(), c0y8t);
        }
        if (list != null && !list.isEmpty() && linkedHashMap.size() < 10 && linkedHashMap.size() < list.size() / 2) {
            for (C0Y8T c0y8t2 : list) {
                linkedHashMap.put(c0y8t2.getConversationId(), c0y8t2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllConversations, ");
        sbLIZ.append(linkedHashMap.size());
        sbLIZ.append(", ");
        sbLIZ.append(listLIZIZ.size());
        sbLIZ.append(", ");
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return C13LP.LLIIII(linkedHashMap.values());
    }

    @Override // X.C0Y6L
    public final void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
        Integer numValueOf;
        if (this.LL == null) {
            IMChatListApi.LJJIII.getClass();
            InterfaceC882680Yjy interfaceC882680YjyLJJIL = C890330YwJ.LIZ().LJJIL();
            if (interfaceC882680YjyLJJIL != null && !interfaceC882680YjyLJJIL.LJIIIIZZ(c0y6x.LIZ.LIZ)) {
                return;
            }
            List<C0Y8T> list = c0y6x.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C0Y8T c0y8t : list) {
                if (c0y8t.getLastShowMessage() != null) {
                    arrayList.add(c0y8t);
                }
            }
            this.LL = C13LP.LL(arrayList, 100);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onQuery, size=");
            List<C0Y8T> list2 = this.LL;
            if (list2 != null) {
                numValueOf = Integer.valueOf(list2.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", boot=");
            C799900VZk.LIZ.getClass();
            sbLIZ.append(C0CP9.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLJJLI) {
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new WaitSDKFetchShareSortedListRequest());
                c799890VZj.LIZIZ();
            } else {
                C1366830lfl c1366830lfl = C1366830lfl.LL;
                int value = EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue();
                c1366830lfl.getClass();
                C1366830lfl.LJIILLIIL(null, value, null);
            }
        }
    }
}
