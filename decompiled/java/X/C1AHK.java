package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import java.util.Map;
import kotlin.Pair;
import tikcast.api.boost.Card;

/* JADX INFO: renamed from: X.1AHK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHK extends C1809480xBi {
    public final int LIZLLL;
    public Card LJ;
    public boolean LJFF;
    public final Map<C1AHM, String> LJI = C2097608Jq.LJIIIIZZ(new Pair(C1AHM.REUSE, C497740JfY.LJIJI(2131836737)), new Pair(C1AHM.RISK, C497740JfY.LJIJI(2131836738)), new Pair(C1AHM.TRAFFIC, C497740JfY.LJIJI(2131836739)), new Pair(C1AHM.PRIVATE, C497740JfY.LJIJI(2131836738)), new Pair(C1AHM.GATED, C497740JfY.LJIJI(2131836736)));

    @Override // X.C1809480xBi
    public final String LIZ() {
        String strLJIJJ;
        String str = "1";
        switch (this.LIZLLL) {
            case 1:
            case 4:
                break;
            case 2:
                str = "2";
                break;
            case 3:
                str = "3";
                break;
            case 5:
                str = "4";
                break;
            case 6:
                str = "5";
                break;
            default:
                str = "";
                break;
        }
        if (str.length() > 0) {
            if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C497740JfY.LJIJJ(2131836743, str));
                sbLIZ.append(' ');
                sbLIZ.append(C497740JfY.LJIIJJI(2131755843, this.LIZ));
                strLJIJJ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131836743, str);
            }
            if (strLJIJJ != null) {
                return strLJIJJ;
            }
        }
        return "";
    }

    @Override // X.C1809480xBi
    public final long LIZJ() {
        Card card = this.LJ;
        if (card != null) {
            return card.expireTime * 1000;
        }
        return 0L;
    }

    @Override // X.C1809480xBi
    public final String LIZLLL() {
        int i = this.LIZLLL;
        return i != 2 ? i != 3 ? i != 5 ? i != 6 ? "ttlive_icon_flare_tier_1.png" : "ttlive_icon_flare_tier_5.png" : "ttlive_icon_flare_tier_4.png" : "ttlive_icon_flare_tier_3.png" : "ttlive_icon_flare_tier_2.png";
    }

    public C1AHK(int i) {
        this.LIZLLL = i;
    }
}
