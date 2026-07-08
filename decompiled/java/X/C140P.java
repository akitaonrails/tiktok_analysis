package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.aigc.C2paStatusCodeAllowlistConfig;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.140P, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140P {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;
    public static final C2paStatusCodeAllowlistConfig LIZLLL;

    static {
        List<String> listSingletonList = Collections.singletonList("JumbfNotFound");
        LIZ = listSingletonList;
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("claimSignature.validated", "signingCredential.trusted", "timeStamp.trusted", "assertion.hashedURI.match", "assertion.dataHash.match", "assertion.bmffHash.match", "assertion.accessible");
        LIZIZ = listLJIIJJI;
        List<String> listLJIIJJI2 = C1697810uHb.LJIIJJI("http://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia", "https://cv.iptc.org/newscodes/digitalsourcetype/trainedAlgorithmicMedia", "http://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia", "https://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia");
        LIZJ = listLJIIJJI2;
        LIZLLL = new C2paStatusCodeAllowlistConfig(listSingletonList, listLJIIJJI, listLJIIJJI2, null, null, null, null, 0L, 248, null);
    }

    public static final C2paStatusCodeAllowlistConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        C2paStatusCodeAllowlistConfig c2paStatusCodeAllowlistConfig = LIZLLL;
        C2paStatusCodeAllowlistConfig c2paStatusCodeAllowlistConfig2 = (C2paStatusCodeAllowlistConfig) settingsManagerLIZLLL.LJIIIIZZ("c2pa_status_code_allowlist", C2paStatusCodeAllowlistConfig.class, c2paStatusCodeAllowlistConfig);
        return c2paStatusCodeAllowlistConfig2 != null ? c2paStatusCodeAllowlistConfig2 : c2paStatusCodeAllowlistConfig;
    }
}
