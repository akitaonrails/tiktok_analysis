package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTechMonitorCalibrationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0bSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974490bSx extends AbstractC963310bAv {
    public final String LJI = "ttlive_client_anchor_match_entrance_monitor";

    @Override // X.AbstractC962030b8r
    public final int LJIJ() {
        return 1;
    }

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return true;
    }

    @Override // X.AbstractC963310bAv, X.AbstractC962030b8r
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        LJIIL(Boolean.valueOf(LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()), "is_match_button_opt", true);
        LJIIL(Boolean.valueOf(C973510bRN.LIZIZ()), "is_match_api_opt", true);
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }

    public final void LJJIIJ(C470590Icr<MultiMatchPrepareResponse> c470590Icr) {
        String json;
        Map<Long, Integer> map;
        LJIILIIL();
        MultiMatchPrepareResponse multiMatchPrepareResponse = c470590Icr.data;
        int iIntValue = -1;
        if (multiMatchPrepareResponse != null && (map = multiMatchPrepareResponse.anchorsPermission) != null) {
            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                if (C950220apo.LJ() == entry.getKey().longValue()) {
                    iIntValue = entry.getValue().intValue();
                }
            }
            json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, map);
        } else {
            json = null;
        }
        LJIIL(json, "anchors_permission", true);
        LJIIL(Integer.valueOf(iIntValue), "permission_pass", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", c470590Icr.LIZIZ, true);
        LJIJJLI("prepare_succeed");
    }

    public final void LJJII(EnumC919170a1j enumC919170a1j, boolean z) {
        EnumC919170a1j.Companion.getClass();
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "selected_match_type", C917350Zyn.LIZJ(enumC919170a1j), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_default", Boolean.valueOf(z), true);
        LJIJJLI("model_panel_click");
    }

    public final void LJJIII(long j, String str, boolean z) {
        LJIIL(str, "reason", true);
        LJIIL(Boolean.valueOf(z), "is_from_cache", true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "prepare_duration", Long.valueOf(j), true);
        LJIJJLI("mode_panel_show");
    }

    public static void LJJIFFI(C974490bSx c974490bSx, String str, String str2, String str3, int i) {
        String value;
        if ((i & 2) != 0) {
            value = EnumC974510bSz.ICON.getValue();
        } else {
            value = null;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        c974490bSx.LJIIL(str, "reason", true);
        c974490bSx.LJIIL(str2, "no_gift_permission_anchor", true);
        c974490bSx.LJIIL(str3, "in_punished_anchor", true);
        if (LiveMatchTechMonitorCalibrationSetting.INSTANCE.isFunnelDetailEnabled()) {
            c974490bSx.LJIIL(value, "source", true);
        }
        c974490bSx.LJIJJLI("battle_icon_click_exit");
    }
}
