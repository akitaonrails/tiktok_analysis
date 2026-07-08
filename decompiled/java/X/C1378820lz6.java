package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378820lz6 {
    public static final C1378820lz6 LIZ = new C1378820lz6();
    public static final Bundle LIZIZ = new Bundle();

    public static String LIZIZ(C1378700lyu c1378700lyu) {
        Integer num;
        Integer num2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent2;
        NetworkResponse<MinisMetaResp> value2;
        MinisMetaResp minisMetaResp2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent3;
        NetworkResponse<MinisMetaResp> value3;
        MinisMetaResp minisMetaResp3;
        C1379010lzP c1379010lzP = EnumC1379020lzQ.Companion;
        MinisViewModel minisViewModel = c1378700lyu.LIZJ;
        Integer num3 = null;
        if (minisViewModel != null && (singleLiveEvent3 = minisViewModel.LLILLJJLI) != null && (value3 = singleLiveEvent3.getValue()) != null && (minisMetaResp3 = value3.data) != null) {
            num = minisMetaResp3.minisType;
        } else {
            num = null;
        }
        c1379010lzP.getClass();
        if (C1379010lzP.LIZ(num) == EnumC1379020lzQ.MINIS_TYPE_APP) {
            return "short_drama";
        }
        MinisViewModel minisViewModel2 = c1378700lyu.LIZJ;
        if (minisViewModel2 != null && (singleLiveEvent2 = minisViewModel2.LLILLJJLI) != null && (value2 = singleLiveEvent2.getValue()) != null && (minisMetaResp2 = value2.data) != null) {
            num2 = minisMetaResp2.minisType;
        } else {
            num2 = null;
        }
        if (C1379010lzP.LIZ(num2) == EnumC1379020lzQ.MINIS_TYPE_GAME) {
            return "mini_game";
        }
        MinisViewModel minisViewModel3 = c1378700lyu.LIZJ;
        if (minisViewModel3 != null && (singleLiveEvent = minisViewModel3.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
            num3 = minisMetaResp.minisType;
        }
        return C1379010lzP.LIZ(num3).name();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(final X.C1378700lyu r13) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1378820lz6.LIZJ(X.0lyu):java.util.List");
    }

    public static List LIZLLL(List list) {
        InterfaceC1370450llb c1370330llP;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1370310llN interfaceC1370310llN : (ArrayList) list) {
            if (interfaceC1370310llN instanceof InterfaceC1370280llK) {
                if (interfaceC1370310llN instanceof InterfaceC1370290llL) {
                    c1370330llP = new C1370390llV(interfaceC1370310llN);
                } else {
                    c1370330llP = new C1370350llR(interfaceC1370310llN);
                }
            } else if (interfaceC1370310llN instanceof InterfaceC1370290llL) {
                c1370330llP = new C1370400llW(interfaceC1370310llN);
            } else {
                c1370330llP = new C1370330llP(interfaceC1370310llN);
            }
            arrayList.add(c1370330llP);
        }
        return arrayList;
    }

    public static String LIZ(C1378700lyu c1378700lyu, String str) {
        Integer num;
        Integer num2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        MinisMetaResp minisMetaResp;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent2;
        NetworkResponse<MinisMetaResp> value2;
        MinisMetaResp minisMetaResp2;
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent3;
        NetworkResponse<MinisMetaResp> value3;
        MinisMetaResp minisMetaResp3;
        C1379010lzP c1379010lzP = EnumC1379020lzQ.Companion;
        MinisViewModel minisViewModel = c1378700lyu.LIZJ;
        Integer num3 = null;
        if (minisViewModel != null && (singleLiveEvent3 = minisViewModel.LLILLJJLI) != null && (value3 = singleLiveEvent3.getValue()) != null && (minisMetaResp3 = value3.data) != null) {
            num = minisMetaResp3.minisType;
        } else {
            num = null;
        }
        c1379010lzP.getClass();
        if (C1379010lzP.LIZ(num) == EnumC1379020lzQ.MINIS_TYPE_APP) {
            new C2196211AxP();
            if (C2196211AxP.LIZLLL(c1378700lyu.LIZJ, str)) {
                return "short_drama";
            }
            return "short_drama_collection";
        }
        MinisViewModel minisViewModel2 = c1378700lyu.LIZJ;
        if (minisViewModel2 != null && (singleLiveEvent2 = minisViewModel2.LLILLJJLI) != null && (value2 = singleLiveEvent2.getValue()) != null && (minisMetaResp2 = value2.data) != null) {
            num2 = minisMetaResp2.minisType;
        } else {
            num2 = null;
        }
        if (C1379010lzP.LIZ(num2) == EnumC1379020lzQ.MINIS_TYPE_GAME) {
            return "game";
        }
        MinisViewModel minisViewModel3 = c1378700lyu.LIZJ;
        if (minisViewModel3 != null && (singleLiveEvent = minisViewModel3.LLILLJJLI) != null && (value = singleLiveEvent.getValue()) != null && (minisMetaResp = value.data) != null) {
            num3 = minisMetaResp.minisType;
        }
        return C1379010lzP.LIZ(num3).name();
    }
}
