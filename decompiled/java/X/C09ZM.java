package X;

import Y.ACallableS174S0300000_3;
import Y.ACallableS411S0100000_3;
import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZM extends AbstractC1552040qUU {
    public final C09ZO LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC1552040qUU
    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
        if (!this.LIZJ) {
            this.LIZ.LJ();
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        C15O7.LIZIZ(new ACallableS411S0100000_3(this, 31), C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        C15O7.LIZIZ(new ACallableS174S0300000_3(this, map2, map, 1), C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        C15O7.LIZIZ(new C09ZE(this, updatePackage, true, th), C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        C15O7.LIZIZ(new C09ZE(this, updatePackage, false, null), C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZN(this, map2, map, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILIIL(final UpdatePackage updatePackage, final long j, final long j2) {
        C15O7.LIZIZ(new Callable() { // from class: X.09ZG
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                String channel;
                C1C7U.LIZ("BridgeGeckoUpdateListener@90e1.onDownloadProgress$1");
                JSONObject jSONObject = new JSONObject();
                UpdatePackage updatePackage2 = updatePackage;
                C09ZM c09zm = this.LL;
                long j3 = j;
                long j4 = j2;
                if (updatePackage2 == null || (channel = updatePackage2.getChannel()) == null) {
                    channel = c09zm.LIZIZ;
                }
                jSONObject.put("channel", channel);
                jSONObject.put("totalResources", j3);
                jSONObject.put("loadedResources", j4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LL.LIZIZ);
                sbLIZ.append("_getGeckoUpdateProgress");
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), C2188811AlT.LIZIZ(sbLIZ)));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BridgeGeckoUpdateListener@90e1.onDownloadProgress$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public C09ZM(C09ZO c09zo, String str, boolean z, String str2) {
        this.LIZ = c09zo;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
    }
}
