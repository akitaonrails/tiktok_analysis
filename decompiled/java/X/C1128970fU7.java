package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@InterfaceC1294060jmO
public final class C1128970fU7 {
    public static final /* synthetic */ int LJJIIJZLJL = 0;
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public Map<String, String> LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public C1130240fWA LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public EnumC1120600fGc LJJIIJ;
    public String LIZ = "";
    public Long LIZIZ = 0L;
    public String LIZJ = "icon";
    public boolean LIZLLL = true;
    public long LJIIJ = -1;
    public String LJIJI = "";

    public static long LIZ() {
        return C1131900fYq.LIZIZ(C497740JfY.LJII(), "default_dialog_item");
    }

    public static Long LIZIZ() {
        long jLIZIZ = C1131900fYq.LIZIZ(C497740JfY.LJII(), "last_sent_music_tab_item");
        if (jLIZIZ == 0) {
            return null;
        }
        return Long.valueOf(jLIZIZ);
    }

    public final void LIZJ(String str) {
        String value;
        if (C1123590fLR.LIZ && Intrinsics.LJFF("icon", str)) {
            String str2 = C1123590fLR.LIZJ;
            EnumC1123470fLF enumC1123470fLF = EnumC1123470fLF.GIFT_GUIDE_INTERACTIVE_GIFT_TAB;
            if (Intrinsics.LJFF(str2, enumC1123470fLF.getValue())) {
                value = enumC1123470fLF.getValue();
            } else {
                value = "gift_guide_bubble";
            }
            this.LIZJ = value;
            return;
        }
        if (str == null) {
            str = "icon";
        }
        this.LIZJ = str;
    }
}
