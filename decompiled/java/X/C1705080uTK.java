package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705080uTK implements InterfaceC1705120uTO {
    public final List<InterfaceC1705100uTM> LIZ = Collections.singletonList(new InterfaceC1705100uTM() { // from class: X.0uTJ
        @Override // X.InterfaceC1705100uTM
        public final void LIZ(Effect effect) {
            String strLIZLLL = C1705060uTI.LIZLLL(C1705060uTI.LIZ(effect), "ame_ab_keys");
            if (strLIZLLL == null || strLIZLLL.length() == 0) {
                return;
            }
            Iterator it2 = a0.LJJLIIIJILLIZJL(strLIZLLL, new String[]{","}, 0, 6).iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    });

    @Override // X.InterfaceC1705120uTO
    public final boolean LIZ(Effect effect) {
        C1705090uTL.LIZ(effect, this.LIZ);
        return true;
    }
}
