package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0JcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495680JcE extends AbstractC495740JcK {
    public Map<String, Integer> LJ;
    public final EnumC495860JcW LJFF;

    @Override // X.AbstractC495740JcK
    public final void LIZ() {
        AbstractC495580Jc4 abstractC495580Jc4;
        ViewGroup viewGroup;
        AbstractC495790JcP<?> abstractC495790JcP = (AbstractC495790JcP) C13LP.LJJJLL(this.LIZLLL);
        if (abstractC495790JcP != null) {
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LIZLLL).add(abstractC495790JcP);
            View viewLIZ = this.LIZIZ.LIZ(abstractC495790JcP);
            if (viewLIZ != null && (viewGroup = this.LIZJ) != null) {
                viewGroup.addView(viewLIZ, new FrameLayout.LayoutParams(-1, -1));
            }
            if (!(abstractC495790JcP instanceof AbstractC495580Jc4) || (abstractC495580Jc4 = (AbstractC495580Jc4) abstractC495790JcP) == null) {
                return;
            }
            abstractC495580Jc4.LLJ.observe(this.LIZ.LIZIZ, new Observer() { // from class: X.0JcD
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    List list = (List) obj;
                    C495680JcE c495680JcE = this.LL;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (EnumC495590Jc5 enumC495590Jc5 : EnumC495590Jc5.getEntries()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("is_");
                        sbLIZ.append(enumC495590Jc5.name().toLowerCase(Locale.ROOT));
                        sbLIZ.append("_show");
                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(list.contains(enumC495590Jc5) ? 1 : 0));
                    }
                    c495680JcE.LJ = linkedHashMap;
                    C495680JcE c495680JcE2 = this.LL;
                    c495680JcE2.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_operate_tool_show");
                    c474500IjALIZ.LJIJJLI(c495680JcE2.LIZ.LJIIJJI);
                    c474500IjALIZ.LJJII(c495680JcE2.LIZ.LJIIIIZZ.clickModule, "click_module");
                    c474500IjALIZ.LJJII(c495680JcE2.LIZ.LIZJ.LIZ(), "card_click_view");
                    c474500IjALIZ.LJJII(Long.valueOf(c495680JcE2.LIZ.LJFF.getId()), "actual_room_id");
                    c474500IjALIZ.LJJII(Long.valueOf(c495680JcE2.LIZ.LJFF.getOwnerUserId()), "actual_anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(c495680JcE2.LIZ.LJI.getId()), "user_id");
                    c474500IjALIZ.LJJII(Long.valueOf(c495680JcE2.LIZ.LJII), "to_user_id");
                    for (Map.Entry entry : ((LinkedHashMap) c495680JcE2.LJ).entrySet()) {
                        c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
                    }
                    c474500IjALIZ.LIZ();
                }
            });
        }
    }

    @Override // X.AbstractC495740JcK
    public final EnumC495860JcW LIZLLL() {
        return this.LJFF;
    }

    public C495680JcE(C495920Jcc c495920Jcc, C495810JcR c495810JcR) {
        super(c495920Jcc, c495810JcR);
        this.LJ = new LinkedHashMap();
        this.LJFF = EnumC495860JcW.OPERATION;
    }
}
