package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518800pcs implements InterfaceC1519000pdC {
    public final EnumC1518970pd9 LIZ = EnumC1518970pd9.APP_LEVEL;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final String[] LIZJ = {"/service/2/app_log", "/monitor/collect", "/monitor/appmonitor", "/src/server/v5/package", "/src/server/v2/combine/check", "/gecko/server/v5/package", "/gecko/server/v2/combine/check", "/gecko/api/settings", "/gurd/api/settings", "/obj/tiktok-teko"};

    @Override // X.InterfaceC1519000pdC
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1519000pdC
    public final String getTag() {
        return "GeoBlockUPCStrategy";
    }

    @Override // X.InterfaceC1519000pdC
    public final void reset() {
    }

    @Override // X.InterfaceC1519000pdC
    public final EnumC1518970pd9 getLevel() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1519000pdC
    public final void LIZ(C1518830pcv c1518830pcv) {
        Object obj;
        Map<String, Object> map = c1518830pcv.LIZJ;
        final String str = null;
        if (map != null) {
            obj = map.get("rule_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        C100C.LIZ.LJI().LIZ(new InterfaceC160100jP() { // from class: X.0pcr
            @Override // X.InterfaceC160100jP
            public final void LIZJ(C159800jM c159800jM) {
            }

            @Override // X.InterfaceC160100jP
            public final void LIZ(C159800jM c159800jM, C112500bj c112500bj, Throwable th) {
                IGeoBlockingService iGeoBlockingService;
                for (String str2 : this.LIZ.LIZJ) {
                    if (a0.LJJIIZI(c159800jM.LIZ, str2, false)) {
                        return;
                    }
                }
                Pair<Integer, String> pairLJ = null;
                if ((th instanceof Exception) && (iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null)) != null && iGeoBlockingService.LIZLLL((Exception) th) != null) {
                    return;
                }
                this.LIZ.getClass();
                Objects.toString(c159800jM);
                Objects.toString(c112500bj);
                if (th != null) {
                    pairLJ = C632140Oqq.LJ(th);
                }
                Objects.toString(pairLJ);
                String str3 = str;
                C13DA c13da = new C13DA();
                c13da.put("path", c159800jM.LIZ);
                if (str3 != null) {
                    c13da.put("rule_id", str3);
                }
                if (th != null) {
                    Pair<Integer, String> pairLJ2 = C632140Oqq.LJ(th);
                    int iIntValue = pairLJ2.getFirst().intValue();
                    String second = pairLJ2.getSecond();
                    c13da.put("error_code", String.valueOf(iIntValue));
                    c13da.put("error_msg", second);
                } else if (c112500bj != null) {
                    c13da.put("status_code", String.valueOf(c112500bj.LIZ));
                }
                Map mapBuild = c13da.build();
                IPNSUpcService iPNSUpcService = (IPNSUpcService) PluggableExtentionKt.pluggableSpi$default(IPNSUpcService.class, false, false, false, 14, null);
                if (iPNSUpcService != null) {
                    iPNSUpcService.LIZIZ(C2097908Jt.LIZJ(new Pair("extra_info", mapBuild)));
                }
            }
        });
    }

    @Override // X.InterfaceC1519000pdC
    public final boolean LIZIZ(C1518830pcv c1518830pcv) {
        return this.LIZIZ.compareAndSet(false, true);
    }
}
