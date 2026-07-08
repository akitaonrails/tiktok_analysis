package X;

import com.bytedance.pumbaa.aspect.thirdpartynetwork.ThirdPartyNetworkSettings;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0WbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826260WbA {
    public static final CopyOnWriteArrayList<InterfaceC826190Wb3> LIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC826190Wb3> LIZIZ = new CopyOnWriteArrayList<>();
    public static volatile boolean LIZJ;
    public static volatile ThirdPartyNetworkSettings.ThirdPartyNetworkConfig LIZLLL;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZ(String str) {
        ThirdPartyNetworkSettings.ThirdPartyNetworkConfig thirdPartyNetworkConfig;
        if (!LIZJ || (thirdPartyNetworkConfig = LIZLLL) == null || !thirdPartyNetworkConfig.enable) {
            return false;
        }
        switch (str.hashCode()) {
            case -1005175793:
                if (str.equals("sshttpcall_enqueue")) {
                    return thirdPartyNetworkConfig.enableSsHttpCallEnqueue;
                }
                return false;
            case -826887173:
                if (str.equals("ss_cronet_new_ss_call")) {
                    return thirdPartyNetworkConfig.enableSsCronetNewSsCall;
                }
                return false;
            case -730487428:
                if (str.equals("sshttpcall_execute")) {
                    return thirdPartyNetworkConfig.enableSsHttpCallExecute;
                }
                return false;
            case -720904109:
                if (str.equals("ttnet_request_interceptor")) {
                    return thirdPartyNetworkConfig.enableTTNetRequestInterceptor;
                }
                return false;
            case -511427520:
                if (str.equals("okhttp_realcall_enqueue")) {
                    return thirdPartyNetworkConfig.enableOkhttpRealCallEnqueue;
                }
                return false;
            case -439901060:
                if (str.equals("urlconnection_on_connect")) {
                    return thirdPartyNetworkConfig.enableUrlConnectionOnConnect;
                }
                return false;
            case -236739155:
                if (str.equals("okhttp_realcall_execute")) {
                    return thirdPartyNetworkConfig.enableOkhttpRealCallExecute;
                }
                return false;
            case -171360897:
                if (str.equals("okhttp_request_builder_build")) {
                    return thirdPartyNetworkConfig.enableOkhttpRequestBuilderBuild;
                }
                return false;
            case -75383666:
                if (str.equals("retrofit_request_builder_build")) {
                    return thirdPartyNetworkConfig.enableRetrofitRequestBuilderBuild;
                }
                return false;
            case 1158375660:
                if (str.equals("okhttp_call_server_intercept")) {
                    return thirdPartyNetworkConfig.enableOkhttpCallServerIntercept;
                }
                return false;
            default:
                return false;
        }
    }

    public static boolean LIZIZ(C826120Waw c826120Waw, CopyOnWriteArrayList... copyOnWriteArrayListArr) {
        ThirdPartyNetworkSettings.ThirdPartyNetworkConfig thirdPartyNetworkConfig;
        if (!LIZJ || (thirdPartyNetworkConfig = LIZLLL) == null || !thirdPartyNetworkConfig.enable) {
            return false;
        }
        for (CopyOnWriteArrayList copyOnWriteArrayList : copyOnWriteArrayListArr) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC826190Wb3) it2.next()).LIZ(c826120Waw)) {
                    return false;
                }
            }
        }
        return true;
    }
}
