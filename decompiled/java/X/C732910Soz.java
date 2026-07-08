package X;

import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Soz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732910Soz {
    public AnimatorSet LIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final List<C21647019ng> LIZIZ = new ArrayList();
    public final C01GW LJ = C452501pT.LIZIZ(new C733320Spe());
    public final C01GW LJFF = C452501pT.LIZIZ(new C733140SpM());

    public static String LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_emoji_anim_show_count");
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(View view, View view2) {
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.Ob(view2, 0.0f);
        C786410Ut5.pc(view2, 0.0f);
    }
}
