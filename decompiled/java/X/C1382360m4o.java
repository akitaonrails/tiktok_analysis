package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.internalshare.impl.data.loader.WaitSDKFetchShareSortedListRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0m4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382360m4o implements InterfaceC1366120lec, C0Y6L {
    public List<C0Y8T> LL;
    public boolean LLILLJJLI = true;

    @Override // X.C0Y6L
    public final void LIZ() {
    }

    @Override // X.C0Y6L
    @InterfaceC1294060jmO
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1366120lec
    public final List<C0Y8T> LIZIZ() {
        List<C0Y8T> listLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZIZ();
        if (!C289820BXo.LIZ()) {
            C1720006oQ.LIZLLL(new AwS553S0100000_9(listLIZIZ, (List<C0Y8T>) 1757), false);
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
        C1720006oQ.LIZLLL(new AwS253S0300000_9((Map) linkedHashMap, (Map<String, C0Y8T>) listLIZIZ, list, (List<C0Y8T>) 8), false);
        return C13LP.LLIIII(linkedHashMap.values());
    }

    @Override // X.C0Y6L
    public final void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
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
            C1720006oQ.LIZLLL(new AwS553S0100000_9(this, 1758), false);
            if (this.LLILLJJLI) {
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new WaitSDKFetchShareSortedListRequest());
                c799890VZj.LIZIZ();
                return;
            }
            C1365990leP c1365990leP = C1365990leP.LIZ;
            int value = EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue();
            C1365990leP c1365990leP2 = C1365990leP.LIZ;
            C1365990leP.LIZJ(value, null, "default", null);
        }
    }
}
