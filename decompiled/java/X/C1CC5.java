package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1CC5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CC5 extends C1CC6 {
    @Override // X.C1CC6
    public final void LJIILIIL() {
        C1CC2.LJIIJ(0, LJIIJ(), "ttlive_download_sticker_all", new JSONObject());
    }

    @Override // X.C1CC6
    public final void LJIILL() {
        C1CC2.LJIIJ(0, LJIIJJI(), "ttlive_load_sticker_list_all", new JSONObject());
    }

    @Override // X.C1CC6
    public final void LJIIL(int i, String str) {
        LJIIJ();
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "error_code", jSONObject);
        C0K04.LJFF("error_msg", str, jSONObject);
        C1CC2.LJIIL(1, "ttlive_download_sticker_all", jSONObject);
        C1CC2.LJIIIIZZ("ttlive_download_sticker_error", 1, jSONObject);
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str2 = EnumC1143310frF.Room.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LJ(str2, jSONObject, "ttlive_download_sticker", 1);
    }

    @Override // X.C1CC6
    public final void LJIILJJIL(int i, String str) {
        LJIIJJI();
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(i, "error_code", jSONObject);
        C0K04.LJFF("error_msg", str, jSONObject);
        C1CC2.LJIIL(1, "ttlive_load_sticker_list_all", jSONObject);
        C1CC2.LJIIIIZZ("ttlive_load_sticker_list_error", 1, jSONObject);
        C466380IQq c466380IQqLIZIZ = C466380IQq.LIZIZ();
        String str2 = EnumC1143310frF.Room.info;
        c466380IQqLIZIZ.getClass();
        C466380IQq.LJ(str2, jSONObject, "ttlive_load_sticker_list", 1);
    }
}
