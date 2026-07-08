package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCatchBeansMetricsToggleSettings;

/* JADX INFO: renamed from: X.0bgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982790bgL extends C974560bT4 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LJIIIIZZ = "ttlive_client_anchor_game_monitor";

    @Override // X.C974560bT4, X.AbstractC962030b8r
    public final int LJIJ() {
        return 1;
    }

    @Override // X.C974560bT4, X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC962030b8r
    public final void LJIJJLI(String str) {
        if (!LiveMatchCatchBeansMetricsToggleSettings.INSTANCE.isEnable()) {
            return;
        }
        super.LJIJJLI(str);
    }

    public final void LJJJJJ(EnumC974400bSo enumC974400bSo) {
        LJIIL(enumC974400bSo.getValue(), "message_type", true);
        LJIJJLI("game_receive_fe_message");
    }

    public final void LJJJJJL(EnumC2010107u7 enumC2010107u7) {
        LJIIL(enumC2010107u7.getValue(), "message_type", true);
        LJIJJLI("game_receive_server_message");
    }

    public final void LJJJJL(int i, long j, String str) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "process_duration", Long.valueOf(j), true);
        LJIIL(Integer.valueOf(i), "spawn_error_code", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "spawn_error_reason", str, true);
        LJIJJLI("game_process_combo_message");
    }
}
