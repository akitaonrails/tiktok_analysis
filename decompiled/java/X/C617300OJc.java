package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617300OJc extends C0OUY {
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final Map<String, C620140OUa> LJIIIZ;

    public C617300OJc() {
        super("bulletin_board_open_page");
        this.LJIIIZ = C2097608Jq.LJIIIIZZ(new Pair("bulletin_list", new C620140OUa(0)), new Pair("account_info", new C620140OUa(0)));
    }

    @Override // X.C0OUY, X.C0OUZ
    public final void LJII() {
        super.LJII();
        this.LJII = false;
        this.LJIIIIZZ = false;
    }

    @Override // X.C0OUY
    public final Map<String, C620140OUa> LJIIIIZZ() {
        return this.LJIIIZ;
    }

    @Override // X.C0OUY, X.C0OUZ
    public final void LJFF(C2241008qG c2241008qG) {
        super.LJFF(c2241008qG);
        c2241008qG.LIZ(Boolean.valueOf(this.LJIIIIZZ), "module_is_from_cache_bulletin_list");
        c2241008qG.LIZ(Boolean.valueOf(this.LJII), "module_is_from_cache_account_info");
    }
}
