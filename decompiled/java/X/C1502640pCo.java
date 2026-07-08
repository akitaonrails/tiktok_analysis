package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502640pCo {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(286));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 228));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 229));

    public final Long LIZ() {
        return C2095008Iq.LJIILIIL(String.valueOf(FeatureProducer.getFeature$default((FeatureProducer) this.LIZLLL.getValue(), this.LIZ, (JSONObject) null, "im_keva_feature", (ReturnCode) null, 10, (Object) null)));
    }

    public C1502640pCo(String str) {
        this.LIZ = str;
    }
}
