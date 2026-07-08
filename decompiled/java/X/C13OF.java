package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.ugc.effectplatform.model.HorizontalEffectsResponse;
import com.ss.ugc.effectplatform.task.Version;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13OF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OF extends AbstractC20000013Ne {
    public final Map<String, String> LIZ;
    public final C13RD LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        HorizontalEffectsModel horizontalEffectsModelCopy;
        String str;
        InterfaceC20004513Ox interfaceC20004513Ox = this.LIZIZ.LJJIFFI;
        C20008813Qo c20008813QoLJIILIIL = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJIILIIL(C13OQ.LJIIIIZZ(this.LJ, this.LIZLLL)) : null;
        try {
            if (c20008813QoLJIILIIL == null) {
                LIZ(new C1662010tLr(10004));
                return;
            }
            try {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("read horizontal data cache  = ");
                sbLIZ.append(strLJIIIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("effect_request_chine_tag", strLIZIZ);
                C13R7 c13r7 = this.LIZIZ.LJIJI;
                HorizontalEffectsResponse horizontalEffectsResponse = c13r7 != null ? (HorizontalEffectsResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, HorizontalEffectsResponse.class) : null;
                C13SB.LIZIZ(c20008813QoLJIILIIL);
                if (horizontalEffectsResponse != null && horizontalEffectsResponse.checkValue()) {
                    HorizontalEffectsModel data = horizontalEffectsResponse.getData();
                    if (data == null || (horizontalEffectsModelCopy = data.copy(data.trending_effects, data.favorite_effects, data.recent_effects, data.insert_effects, data.left_trending_effects, data.url_prefix, true, data.logId)) == null) {
                        return;
                    }
                    C13OH c13oh = Version.Companion;
                    C13RD c13rd = this.LIZIZ;
                    String strLJIIJ = C13OQ.LJIIJ(this.LJ, this.LIZLLL);
                    c13oh.getClass();
                    Version versionLIZ = C13OH.LIZ(c13rd, strLJIIJ);
                    C13LD c13ld = C13LD.LIZ;
                    C13RD c13rd2 = this.LIZIZ;
                    String str2 = this.LIZ.get("panel");
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (versionLIZ != null && (str = versionLIZ.logId) != null) {
                        str3 = str;
                    }
                    boolean z = this.LIZIZ.LJJJJLL;
                    c13ld.getClass();
                    C13LD.LIZLLL(c13rd2, str2, horizontalEffectsModelCopy, str3, z);
                    if (!C04WP.LIZ()) {
                        runOnMainThread(new AwS431S0200000_30(this, horizontalEffectsModelCopy, 88));
                        return;
                    }
                    C13MA c13maLIZ = this.LIZIZ.LJJJIL.LIZ(this.LIZJ);
                    if (c13maLIZ != null) {
                        c13maLIZ.onSuccess(horizontalEffectsModelCopy);
                    }
                    this.LIZIZ.LJJJIL.LIZJ(this.LIZJ);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Json Parse Exception: ");
                sbLIZ2.append(e);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LIZIZ("FetchPanelInfoCacheTask", strLIZIZ2, null);
                C13SB.LIZIZ(c20008813QoLJIILIIL);
            }
            LIZ(new C1662010tLr(10004));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        if (C04WP.LIZ()) {
            this.LIZIZ.LJJJIL.LIZJ(this.LIZJ);
        } else {
            runOnMainThread(new AwS574S0100000_30(this, 292));
        }
    }

    public final void LIZ(C1662010tLr c1662010tLr) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed: ");
        sbLIZ.append(c1662010tLr);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("FetchPanelInfoCacheTask", strLIZIZ, null);
        if (C04WP.LIZ()) {
            C13MA c13maLIZ = this.LIZIZ.LJJJIL.LIZ(this.LIZJ);
            if (c13maLIZ != null) {
                c13maLIZ.onFail(null, c1662010tLr);
            }
            this.LIZIZ.LJJJIL.LIZJ(this.LIZJ);
            return;
        }
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 27));
    }

    public C13OF(Map<String, String> map, C13RD c13rd, String str, String str2, int i) {
        super(str, null);
        this.LIZ = map;
        this.LIZIZ = c13rd;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
    }
}
