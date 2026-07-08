package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790390wgv implements InterfaceC1335605Ko {
    public static final C1790390wgv LIZ = new C1790390wgv();
    public static final ConcurrentHashMap<String, C1790400wgw> LIZIZ = new ConcurrentHashMap<>();
    public static final InterfaceC1493505sz LIZJ = C0I0B.LJFF.LIZIZ();

    public static Map LIZLLL(C1790400wgw c1790400wgw) {
        long jCurrentTimeMillis;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("resource_type", c1790400wgw.LIZ);
        Long l = c1790400wgw.LIZJ;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - c1790400wgw.LIZIZ;
        }
        pairArr[1] = new Pair("duration", String.valueOf(jCurrentTimeMillis));
        pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c1790400wgw.LIZLLL.name());
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1335605Ko
    public final void LIZ(String str) {
        ConcurrentHashMap<String, C1790400wgw> concurrentHashMap = LIZIZ;
        C1790400wgw c1790400wgw = concurrentHashMap.get(str);
        if (c1790400wgw != null) {
            c1790400wgw.LIZJ = Long.valueOf(System.currentTimeMillis());
            c1790400wgw.LIZLLL = EnumC1790380wgu.LLILZ;
            InterfaceC1493505sz interfaceC1493505sz = LIZJ;
            if (interfaceC1493505sz != null) {
                interfaceC1493505sz.sendEvent("ttsocial_im_preload_metrics", LIZLLL(c1790400wgw));
            }
            concurrentHashMap.remove(str);
        }
    }

    @Override // X.InterfaceC1335605Ko
    public final void LIZJ(String str) {
        ConcurrentHashMap<String, C1790400wgw> concurrentHashMap = LIZIZ;
        C1790400wgw c1790400wgw = concurrentHashMap.get(str);
        if (c1790400wgw != null) {
            c1790400wgw.LIZLLL = EnumC1790380wgu.LLILLJJLI;
            c1790400wgw.LIZJ = Long.valueOf(System.currentTimeMillis());
            InterfaceC1493505sz interfaceC1493505sz = LIZJ;
            if (interfaceC1493505sz != null) {
                interfaceC1493505sz.sendEvent("ttsocial_im_preload_metrics", LIZLLL(c1790400wgw));
            }
            concurrentHashMap.remove(str);
        }
    }

    @Override // X.InterfaceC1335605Ko
    public final void onFailed(String str) {
        ConcurrentHashMap<String, C1790400wgw> concurrentHashMap = LIZIZ;
        C1790400wgw c1790400wgw = concurrentHashMap.get(str);
        if (c1790400wgw != null) {
            c1790400wgw.LIZJ = Long.valueOf(System.currentTimeMillis());
            c1790400wgw.LIZLLL = EnumC1790380wgu.LLILLL;
            InterfaceC1493505sz interfaceC1493505sz = LIZJ;
            if (interfaceC1493505sz != null) {
                interfaceC1493505sz.sendEvent("ttsocial_im_preload_metrics", LIZLLL(c1790400wgw));
            }
            concurrentHashMap.remove(str);
        }
    }

    @Override // X.InterfaceC1335605Ko
    public final void LIZIZ(String str, String str2) {
        LIZIZ.put(str, new C1790400wgw(str2, System.currentTimeMillis()));
    }
}
