package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0qLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546260qLA implements InterfaceC1543050qFz {
    public LiveData<NetworkResponse<MinisMetaResp>> LIZ;
    public final C1546250qL9 LIZIZ = new InterfaceC1543270qGL() { // from class: X.0qL9
        @Override // X.InterfaceC1543270qGL
        public final C1543210qGF LIZ(C1543910qHN c1543910qHN) {
            List<String> list;
            NetworkResponse<MinisMetaResp> value;
            MinisMetaResp minisMetaResp;
            String str = c1543910qHN.LJI;
            String str2 = c1543910qHN.LJFF;
            String strName = c1543910qHN.LIZ().name();
            ArrayList arrayList = new ArrayList();
            LiveData<NetworkResponse<MinisMetaResp>> liveData = this.LIZ.LIZ;
            if (liveData != null && (value = liveData.getValue()) != null && (minisMetaResp = value.data) != null) {
                list = minisMetaResp.scopes;
            } else {
                list = null;
            }
            arrayList.add("default.allowed.jsb");
            if (list != null) {
                arrayList.addAll(list);
            }
            List listLIZ = C2195051AvX.LIZ(arrayList);
            C1543210qGF c1543210qGF = new C1543210qGF(Boolean.TRUE, null);
            if (!((ArrayList) listLIZ).contains(str2)) {
                c1543210qGF = new C1543210qGF(Boolean.FALSE, "blocked by jsb control");
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check, url:");
            sbLIZ.append(str);
            sbLIZ.append(", result:");
            sbLIZ.append(c1543210qGF.LIZ);
            sbLIZ.append(", bridgeName:");
            sbLIZ.append(str2);
            sbLIZ.append(", platform:");
            sbLIZ.append(strName);
            sbLIZ.append(", allowedJsbList:");
            sbLIZ.append(listLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            return c1543210qGF;
        }
    };

    @Override // X.InterfaceC1543050qFz
    public final InterfaceC1543270qGL LIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0qL9] */
    public C1546260qLA(LiveData<NetworkResponse<MinisMetaResp>> liveData) {
        this.LIZ = liveData;
    }

    @Override // X.InterfaceC1543050qFz
    public final InterfaceC1538820q9A LIZIZ(C1537480q70 c1537480q70) {
        int i = C2187451AjH.LIZ;
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        InterfaceC1075390e5h interfaceC1075390e5h = (InterfaceC1075390e5h) C1075530e5v.LIZIZ().LIZIZ(InterfaceC1075390e5h.class, c1537480q70.bidFrom);
        if (interfaceC1075390e5h != null) {
            return interfaceC1075390e5h.LIZIZ();
        }
        return null;
    }
}
