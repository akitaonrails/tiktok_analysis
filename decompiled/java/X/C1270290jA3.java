package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import java.util.EnumMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0jA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270290jA3 {
    public static final C01GW<C1270290jA3> LIZJ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(48));
    public final Map<EnumC1270240j9y, C1269280j8Q> LIZ = new EnumMap(EnumC1270240j9y.class);
    public EnumC1270260jA0 LIZIZ = EnumC1270260jA0.NONE;

    public static final C1270290jA3 LIZIZ() {
        return LIZJ.getValue();
    }

    public final C1269280j8Q LIZ(EnumC1270240j9y enumC1270240j9y) {
        C1269280j8Q c1269280j8Q;
        int i = C1270250j9z.LIZIZ[enumC1270240j9y.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = C1270250j9z.LIZ[this.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c1269280j8Q = (C1269280j8Q) ((EnumMap) this.LIZ).get(enumC1270240j9y);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c1269280j8Q = new C1269280j8Q(CertProviderManagerKt.findCert("bpea-ttls_switch_audio_capture_stop_release", 1476788483));
                    }
                } else {
                    c1269280j8Q = new C1269280j8Q(CertProviderManagerKt.findCert("bpea-ttls_stop_audio_capture_with_error", 1476788485));
                }
                this.LIZIZ = EnumC1270260jA0.NONE;
                if (c1269280j8Q == null || C1270300jA4.LIZ(c1269280j8Q.LIZ)) {
                    return new C1269280j8Q(CertProviderManagerKt.findCert("bpea-ttlh_audio_capture_stop_release_default", 1476788485));
                }
                return c1269280j8Q;
            }
            throw new C1954807lC();
        }
        C1269280j8Q c1269280j8Q2 = (C1269280j8Q) ((EnumMap) this.LIZ).get(enumC1270240j9y);
        if (c1269280j8Q2 != null && !C1270300jA4.LIZ(c1269280j8Q2.LIZ)) {
            return c1269280j8Q2;
        }
        return new C1269280j8Q(CertProviderManagerKt.findCert("bpea-ttlh_start_audio_capture_default", 1476788497));
    }

    public final void LIZJ(EnumC1270240j9y enumC1270240j9y, Object obj) {
        if (obj instanceof Cert) {
            ((EnumMap) this.LIZ).put(enumC1270240j9y, new C1269280j8Q((Cert) obj));
        }
    }
}
