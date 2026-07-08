package X;

import com.ss.android.ugc.feed.platform.componentmanager.ContractMetaFcpData;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697710RYj {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C697720RYk());

    public static final C697730RYl LIZ(C0RYJ c0ryj, String str) {
        Map<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> mapLIZ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (c0ryj != null && (mapLIZ = c0ryj.LIZ()) != null) {
            for (Map.Entry<EnumC697700RYi, InterfaceC697190RWj<? extends FcpNodeProtocol>> entry : mapLIZ.entrySet()) {
                EnumC697700RYi key = entry.getKey();
                List listLLIIII = C13LP.LLIIII(entry.getValue().Ba().keySet());
                List listLLIIII2 = C13LP.LLIIII(entry.getValue().Aa().keySet());
                List listLLIIII3 = C13LP.LLIIII(entry.getValue().za().keySet());
                List listLJLI = C13LP.LJLI(C13LP.LJLI(listLLIIII2, C13LP.LLIIJI(listLLIIII)), C13LP.LLIIJI(listLLIIII3));
                arrayList2.addAll(listLLIIII2);
                arrayList4.addAll(listLLIIII3);
                arrayList5.addAll(listLJLI);
                arrayList.add(new ContractMetaFcpData(key.getKey(), listLLIIII, listLJLI, listLLIIII3, listLLIIII2));
                if (key == EnumC697700RYi.GLOBAL) {
                    arrayList3.addAll(listLLIIII);
                }
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList2);
        List listLJJJJI2 = C13LP.LJJJJI(arrayList3);
        List listLJJJJI3 = C13LP.LJJJJI(arrayList5);
        List listLJJJJI4 = C13LP.LJJJJI(arrayList4);
        C697890RZb.LIZ(str);
        return new C697730RYl(listLJJJJI, listLJJJJI2, listLJJJJI3, listLJJJJI4, arrayList);
    }
}
