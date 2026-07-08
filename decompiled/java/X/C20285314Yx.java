package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.14Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285314Yx {
    public final HashMap<Integer, InterfaceC690490R6p> LIZ = new HashMap<>();
    public final C20280514Xb LIZIZ = new C20280514Xb();
    public final C20285614Za LIZJ = new C20285614Za();
    public final List<Integer> LIZLLL = C1697810uHb.LJIIJJI(Integer.valueOf(C14Z5.DIALOG.getType()), Integer.valueOf(C14Z5.GREY_CARD.getType()), Integer.valueOf(C14Z5.FORCE_VIDEO.getType()), Integer.valueOf(C14Z5.FORCE_VIDEO_NO_COVER.getType()), Integer.valueOf(C14Z5.FORCE_VIDEO_LYNX.getType()), Integer.valueOf(C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()), Integer.valueOf(C14Z5.BACKGROUND.getType()), Integer.valueOf(C14Z5.COMMON_BACKGROUND_LYNX.getType()));

    public final InterfaceC690490R6p LIZ(Aweme aweme) {
        InterfaceC690490R6p c20284814Ys;
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        if (!this.LIZLLL.contains(Integer.valueOf(iLIZLLL))) {
            return this.LIZIZ;
        }
        if (!this.LIZ.containsKey(Integer.valueOf(iLIZLLL))) {
            HashMap<Integer, InterfaceC690490R6p> map = this.LIZ;
            Integer numValueOf = Integer.valueOf(iLIZLLL);
            if (iLIZLLL != C14Z5.FORCE_VIDEO.getType() && iLIZLLL != C14Z5.FORCE_VIDEO_NO_COVER.getType()) {
                if (iLIZLLL == C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()) {
                    c20284814Ys = this.LIZJ;
                } else if (iLIZLLL == C14Z5.GREY_CARD.getType()) {
                    c20284814Ys = new C20280714Xd();
                } else if (iLIZLLL == C14Z5.DIALOG.getType()) {
                    c20284814Ys = C20286714Zl.LLJI;
                } else if (iLIZLLL == C14Z5.BACKGROUND.getType()) {
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "survey_compose", true) == 1) {
                        c20284814Ys = new C14XN();
                    } else {
                        c20284814Ys = new C14XZ();
                    }
                } else if (iLIZLLL == C14Z5.COMMON_BACKGROUND_LYNX.getType()) {
                    c20284814Ys = new C14ZZ();
                } else {
                    c20284814Ys = new C20284814Ys();
                }
            } else {
                c20284814Ys = this.LIZIZ;
            }
            map.put(numValueOf, c20284814Ys);
        }
        InterfaceC690490R6p interfaceC690490R6p = this.LIZ.get(Integer.valueOf(iLIZLLL));
        if (interfaceC690490R6p != null) {
            return interfaceC690490R6p;
        }
        return this.LIZIZ;
    }
}
