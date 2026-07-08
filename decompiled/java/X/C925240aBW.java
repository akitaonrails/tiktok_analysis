package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925240aBW extends C944730agx {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJIILL(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("show_error_type", "permission", jSONObject);
        C0K04.LJFF("event_id", "link_icon_show_error", jSONObject);
        C0K04.LJFF("permission_type", str, jSONObject);
        C944730agx.LJIIJ(th, jSONObject);
        LJIJ(jSONObject, true);
    }

    public static final void LJIILLIIL(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        C0K04.LJ("icon_type", j, jSONObject);
        C0K04.LJFF("event_id", "link_icon_show", jSONObject);
        C0K04.LJ("permission_status", j2, jSONObject);
        C944730agx.LJIIJ(null, jSONObject);
        LJIJ(jSONObject, true);
    }

    public static final void LJIJ(JSONObject jSONObject, boolean z) {
        int iLIZLLL;
        InterfaceC927900aFo interfaceC927900aFoLIZ = C927890aFn.LIZ();
        if (interfaceC927900aFoLIZ != null) {
            iLIZLLL = interfaceC927900aFoLIZ.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        C0K04.LIZLLL(iLIZLLL, "is_aab_opt", jSONObject);
        if (z) {
            C1CC2.LJIIIIZZ("ttlive_client_anchor_link_icon_monitor", 0, jSONObject);
        } else {
            if (!C1127020fQy.LIZ(0.1f, "ttlive_client_audience_link_icon_monitor")) {
                return;
            }
            C1CC2.LJIIIIZZ("ttlive_client_audience_link_icon_monitor", 0, jSONObject);
        }
    }

    public static final void LJIIZILJ(long j, long j2, boolean z) {
        String str;
        if (!C1127020fQy.LIZ(0.1f, "ttlive_multi_guest_v3_open_record")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "host";
        } else {
            str = "audience";
        }
        C0K04.LJFF("use_role", str, jSONObject);
        C0K04.LJFF("version", String.valueOf(3), jSONObject);
        C0K04.LJFF("room_id", String.valueOf(j), jSONObject);
        C0K04.LJFF("anchor_id", String.valueOf(j2), jSONObject);
        C1CC2.LJIIIIZZ("ttlive_multi_guest_v3_open_record", 0, jSONObject);
    }
}
