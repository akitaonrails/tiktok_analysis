package X;

import X.AbstractC1386130mAt;
import Y.ARunnableS121S0100000_21;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1386130mAt<E extends AbstractC1386130mAt> {
    public final String LIZ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public final Map<String, String> LIZIZ = new HashMap();
    public final Map<String, Object> LIZJ = new HashMap();
    public boolean LJI = false;
    public boolean LJIIL = true;
    public final Map<String, String> LJIILIIL = new ConcurrentHashMap();
    public final Map<String, Object> LJIILJJIL = new HashMap();
    public final Map<String, Set<Object>> LJIILL = new HashMap();

    public void LJII() {
    }

    public abstract void LJIIIIZZ();

    public void LJIILIIL() {
        LJII();
        LJIIIIZZ();
        ((HashMap) this.LIZIZ).putAll(this.LJIILIIL);
    }

    public final void LJIILJJIL() {
        boolean zLJI = MethodIDManager.LJI(137862);
        LJIILIIL();
        C810560Vqw.LJ(new ARunnableS121S0100000_21(this, 112));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public AbstractC1386130mAt(String str) {
        this.LIZ = str;
    }

    public static String LJIIJ(Aweme aweme) {
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    public final void LIZ(Map map) {
        ((HashMap) this.LJIILJJIL).putAll(map);
    }

    public final void LIZIZ(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                ((ConcurrentHashMap) this.LJIILIIL).put(entry.getKey(), entry.getValue());
                entry.getKey();
                entry.getValue();
            }
        }
    }

    public final void LIZJ(String str) {
        LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(str), InterfaceC1210900hcG.LIZ);
    }

    public void LJIIIZ(Aweme aweme) {
        if (aweme != null) {
            if (AwemeBizExtKt.getRank(aweme) != -1) {
                this.LJIIJ = String.valueOf(AwemeBizExtKt.getRank(aweme));
            } else {
                this.LJIIJ = LJIIJJI(9, aweme);
            }
            if (aweme.getVideo() != null && aweme.getVideo().getVideoTag() != null) {
                this.LJIIIZ = aweme.getVideo().getVideoTag().getTitle();
            }
            if (TextUtils.isEmpty(this.LJIIIZ) && aweme.getNewLabel() == 1) {
                this.LJIIIZ = "New";
            }
        }
    }

    public final void LJIILL(String str) {
        ((ConcurrentHashMap) this.LJIILIIL).remove(str);
    }

    public static String LJIIJJI(int i, Aweme aweme) {
        JSONObject jSONObjectLIZJ = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZJ(i, aweme);
        if (jSONObjectLIZJ != null) {
            return jSONObjectLIZJ.optString("order");
        }
        return "";
    }

    public static String LJIIL(int i, Aweme aweme) {
        String requestId;
        String strOptString;
        JSONObject jSONObjectLIZJ = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZJ(i, aweme);
        if (jSONObjectLIZJ != null && (strOptString = jSONObjectLIZJ.optString("request_id")) != null && !strOptString.isEmpty()) {
            return strOptString;
        }
        if (aweme != null && AwemeBizOptExtKt.getAwemeCacheType(aweme) != 0 && (requestId = aweme.getRequestId()) != null) {
            return requestId;
        }
        return "";
    }

    public final void LIZLLL(int i, String str) {
        LJFF(str, String.valueOf(i), InterfaceC1210900hcG.LIZ);
    }

    public final void LJ(String str, String str2) {
        LJFF(str, str2, InterfaceC1210900hcG.LIZ);
    }

    public final void LJI(String str, boolean z) {
        LJFF(str, String.valueOf(z), InterfaceC1210900hcG.LIZ);
    }

    public final void LJFF(String str, String str2, InterfaceC1210900hcG interfaceC1210900hcG) {
        ((HashMap) this.LIZIZ).put(str, interfaceC1210900hcG.LIZ(str2));
    }
}
