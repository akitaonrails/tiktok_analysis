package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20684215wm extends FeatureProducer implements InterfaceC1510030pOj {
    public static final C20684215wm LIZIZ = new C20684215wm();
    public static String LIZJ = "f_m2";
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(365));
    public static boolean LJ = true;
    public static final ConcurrentHashMap<C20684415wo, C20684515wp> LJFF = new ConcurrentHashMap<>();
    public static final C01GW LJI;
    public static final C01GW LJII;

    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LJI = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(364));
        LJII = C452501pT.LIZ(enumC452301pR, AFwS221S0000000_31.get$arr$(363));
    }

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return new CopyOnWriteArraySet();
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(String str) {
        if (LJ) {
            LJ = false;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(this);
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r14, org.json.JSONObject r15, java.lang.String r16, com.ss.ugc.clientai.core.api.meta.ReturnCode r17) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20684215wm.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
