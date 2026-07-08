package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedExtra;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0vGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735810vGt {
    public static final C1735810vGt LIZ = new C1735810vGt();

    public static void LIZ(Aweme aweme) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C312501Jb(aweme, null), 3);
    }

    public static ECMixFeedExtra LIZIZ(C2189821An6 c2189821An6) {
        ECMixFeedExtra eCMixFeedExtra;
        Type type;
        Object obj = null;
        if (c2189821An6 == null) {
            return null;
        }
        try {
            if (c2189821An6.getEcMixFeedExtra() == null) {
                if (c2189821An6.getEcMixFeedExtraStr() == null) {
                    return null;
                }
                Gson gson = C7740030o.LIZ().getGson();
                String ecMixFeedExtraStr = c2189821An6.getEcMixFeedExtraStr();
                try {
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(ECMixFeedExtra.class));
                    } else {
                        type = new TypeToken<ECMixFeedExtra>() { // from class: X.0r7u
                        }.getType();
                    }
                    Object objLJIIIIZZ = gson.LJIIIIZZ(ecMixFeedExtraStr, type);
                    if (!(objLJIIIIZZ instanceof ECMixFeedExtra)) {
                        objLJIIIIZZ = null;
                    }
                    eCMixFeedExtra = (ECMixFeedExtra) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    eCMixFeedExtra = null;
                }
                c2189821An6.setEcMixFeedExtra(eCMixFeedExtra);
            }
            Object ecMixFeedExtra = c2189821An6.getEcMixFeedExtra();
            if (!(ecMixFeedExtra instanceof ECMixFeedExtra)) {
                return null;
            }
            return (ECMixFeedExtra) ecMixFeedExtra;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (ECMixFeedExtra) obj;
        }
    }
}
