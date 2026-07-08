package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS40S2100000_16;

/* JADX INFO: renamed from: X.0cWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015330cWp extends AbstractC1023470cjx {
    public final C1022410ciF LIZ;
    public final C1023630ckD<?>[] LIZIZ;

    public final void LJJIIZ() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        String str;
        String str2;
        try {
            if (((Boolean) C263370ATv.LIZ.getValue()).booleanValue()) {
                Object obj = getProvidedContexts().get(Aweme.class);
                if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                    entry.getKey();
                    AnoleComponentModel value = entry.getValue();
                    C1014250cV5.LIZ.getClass();
                    C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(value);
                    if (c1014490cVTLIZ != null) {
                        str = c1014490cVTLIZ.LIZ;
                        str2 = c1014490cVTLIZ.LIZIZ;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    C1015360cWs.LIZ.getClass();
                    logAd(C1015360cWs.LIZIZ, new AwS40S2100000_16(value, str, str2, 8));
                    arrayList.add(Unit.LIZ);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC1023360cjm
    public final AbstractC1023090cjL getAdBizScene() {
        return this.LIZ;
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C1015330cWp(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = C1022410ciF.LIZIZ;
        this.LIZIZ = new C1023630ckD[0];
    }
}
