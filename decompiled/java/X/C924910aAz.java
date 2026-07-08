package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924910aAz {
    public final C934340aQC LIZ;

    public C924910aAz(InterfaceC924890aAx interfaceC924890aAx) {
        this.LIZ = new C934340aQC(interfaceC924890aAx);
    }

    public final void LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisibility = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("ToolbarGameLinkDelegate", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1103130eoR interfaceC1103130eoR = this.LIZ.LLILZ;
        if (interfaceC1103130eoR != null) {
            interfaceC1103130eoR.setVisibility(i);
            if (i == 0) {
                int i2 = C944850ah9.LIZ;
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("event_id", "link_icon_show", jSONObject);
                C0K04.LJFF("live_type", "live_studio", jSONObject);
                C952390atJ.LIZ.getValue();
                C0K04.LIZLLL(0, "is_aab_opt", jSONObject);
                C0K04.LJFF("live_type", "live_studio", jSONObject);
                if (C1127020fQy.LIZ(0.1f, "ttlive_client_audience_link_icon_monitor")) {
                    C1CC2.LJIIIIZZ("ttlive_client_audience_link_icon_monitor", 0, jSONObject);
                }
            }
        }
    }
}
