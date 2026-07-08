package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardCreatorLeagueBadgeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import webcast.api.room.ComponentLayoutConfig;

/* JADX INFO: renamed from: X.0JcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495730JcJ extends AbstractC495740JcK {
    public final EnumC495860JcW LJ;

    @Override // X.AbstractC495740JcK
    public final void LIZ() {
        ViewGroup viewGroup;
        Iterator<AbstractC495790JcP<?>> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            View viewLIZ = this.LIZIZ.LIZ(it2.next());
            if (viewLIZ != null && (viewGroup = this.LIZJ) != null) {
                viewGroup.addView(viewLIZ, new LinearLayout.LayoutParams(-2, -2));
            }
        }
    }

    @Override // X.AbstractC495740JcK
    public final EnumC495860JcW LIZLLL() {
        return this.LJ;
    }

    public C495730JcJ(C495920Jcc c495920Jcc, C495810JcR c495810JcR) {
        super(c495920Jcc, c495810JcR);
        this.LJ = EnumC495860JcW.HONOR;
    }

    @Override // X.AbstractC495740JcK
    public final boolean LIZIZ(User user, Map<AbstractC495790JcP<?>, ? extends Object> map, ComponentLayoutConfig componentLayoutConfig) {
        int iLIZIZ;
        int iLIZIZ2;
        if (LJFF(user)) {
            return false;
        }
        if (LiveProfileCardCreatorLeagueBadgeSetting.INSTANCE.enable()) {
            ArrayList arrayList = new ArrayList();
            List<BadgeStruct> badgeList = user.getBadgeList();
            if (badgeList != null) {
                for (BadgeStruct badgeStruct : badgeList) {
                    for (AbstractC495790JcP abstractC495790JcP : (ArrayList) this.LIZLLL) {
                        if ((abstractC495790JcP instanceof AbstractC498420Jge) && ((AbstractC498420Jge) abstractC495790JcP).LJJIIJZLJL() == badgeStruct.badgeScene) {
                            arrayList.add(abstractC495790JcP);
                        }
                    }
                }
            }
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LIZLLL).addAll(arrayList);
            ViewGroup viewGroup = this.LIZJ;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            LIZ();
        }
        List<AbstractC495790JcP<?>> list = this.LIZLLL;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            AbstractC495790JcP abstractC495790JcP2 = (AbstractC495790JcP) next;
            Object obj2 = map.get(abstractC495790JcP2);
            abstractC495790JcP2.getClass();
            if (obj2 != null) {
                obj = obj2;
            }
            if (abstractC495790JcP2.LJIIIZ(user, obj)) {
                arrayList2.add(next);
            }
        }
        int i = 0;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC495790JcP abstractC495790JcP3 = (AbstractC495790JcP) obj3;
                if (i == 0) {
                    abstractC495790JcP3.LJIILLIIL(0, 0, 0);
                } else {
                    if (C497740JfY.LJJ()) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                    }
                    if (C497740JfY.LJJ()) {
                        iLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
                    } else {
                        iLIZIZ2 = 0;
                    }
                    abstractC495790JcP3.LJIILLIIL(iLIZIZ, 0, iLIZIZ2);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_privilege_tool_show");
        c474500IjALIZ.LJIJJLI(this.LIZ.LJIIJJI);
        c474500IjALIZ.LJJII(this.LIZ.LJIIIIZZ.clickModule, "click_module");
        c474500IjALIZ.LJJII(this.LIZ.LIZJ.LIZ(), "card_click_view");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJFF.getId()), "actual_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJFF.getOwnerUserId()), "actual_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJI.getId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJII), "to_user_id");
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC495790JcP) it3.next()).LIZLLL());
        }
        for (EnumC495780JcO enumC495780JcO : (ArrayList) LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_");
            sbLIZ.append(enumC495780JcO.name().toLowerCase(Locale.ROOT));
            sbLIZ.append("_show");
            c474500IjALIZ.LJJII(Integer.valueOf(arrayList3.contains(enumC495780JcO) ? 1 : 0), C2188811AlT.LIZIZ(sbLIZ));
        }
        c474500IjALIZ.LIZ();
        return !arrayList2.isEmpty();
    }
}
