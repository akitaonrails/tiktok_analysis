package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103280eog extends AbstractC1103270eof implements InterfaceC1121770fIV {
    public static final C1103280eog LIZLLL;

    @Override // X.InterfaceC1121770fIV
    public final void LIZ() {
        LIZLLL(1, "smb_go_live_service_plus_entrance_show");
    }

    @Override // X.AbstractC1103270eof
    public final Map<String, List<String>> LJ() {
        return C2097608Jq.LJIIJ(new Pair("livesdk_service_plus_management_page", Collections.singletonList("smb_anchor_service_plus_management_show_count")));
    }

    static {
        C1103280eog c1103280eog = new C1103280eog();
        LIZLLL = c1103280eog;
        C1103310eoj c1103310eoj = new C1103310eoj("smb_industry_type", C0J0Q.ANCHOR);
        c1103280eog.LIZIZ.getClass();
        C1103290eoh.LIZIZ.put("smb_industry_type", c1103310eoj);
    }

    @Override // X.InterfaceC1121770fIV
    public final void LIZIZ(int i) {
        LJI("smb_anchor_service_plus_status", Integer.valueOf(i));
    }

    @Override // X.InterfaceC1121770fIV
    public final void LIZJ(int i) {
        LJFF();
        LJI("smb_anchor_service_plus_status", Integer.valueOf(i));
    }

    public final void LJII(String str, boolean z) {
        LJI("smb_anchor_board_is_in_use", Boolean.valueOf(z));
        LJI("smb_board_in_use_id", str);
    }
}
