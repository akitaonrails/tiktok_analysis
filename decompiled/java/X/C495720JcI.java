package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import webcast.api.room.ComponentLayoutConfig;

/* JADX INFO: renamed from: X.0JcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495720JcI extends AbstractC495740JcK {
    public final List<EnumC495780JcO> LJ;
    public final List<EnumC495780JcO> LJFF;
    public final EnumC495860JcW LJI;

    @Override // X.AbstractC495740JcK
    public final void LIZ() {
        ViewGroup viewGroup;
        Iterator<AbstractC495790JcP<?>> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            View viewLIZ = this.LIZIZ.LIZ(it2.next());
            if (viewLIZ != null && (viewGroup = this.LIZJ) != null) {
                viewGroup.addView(viewLIZ, new LinearLayout.LayoutParams(-1, -2));
            }
        }
    }

    @Override // X.AbstractC495740JcK
    public final EnumC495860JcW LIZLLL() {
        return this.LJI;
    }

    public C495720JcI(C495920Jcc c495920Jcc, C495810JcR c495810JcR) {
        super(c495920Jcc, c495810JcR);
        this.LJ = C1697810uHb.LJIIJJI(EnumC495780JcO.SERVICE_PLUS, EnumC495780JcO.ECOM, EnumC495780JcO.GROUP_CHAT, EnumC495780JcO.BULLETIN_BOARD, EnumC495780JcO.LIVE_EVENT);
        this.LJFF = C1697810uHb.LJIIJJI(EnumC495780JcO.GIFT_GALLERY, EnumC495780JcO.FEST_HONORS);
        this.LJI = EnumC495860JcW.BUSINESS;
    }

    @Override // X.AbstractC495740JcK
    public final boolean LIZIZ(User user, Map<AbstractC495790JcP<?>, ? extends Object> map, ComponentLayoutConfig componentLayoutConfig) {
        float fLIZIZ;
        int i;
        Object next;
        View view;
        EnumC495780JcO enumC495780JcO;
        if (LJFF(user)) {
            return false;
        }
        List<AbstractC495790JcP<?>> list = this.LIZLLL;
        ArrayList<AbstractC495790JcP> arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            AbstractC495790JcP abstractC495790JcP = (AbstractC495790JcP) next2;
            Object obj2 = map.get(abstractC495790JcP);
            abstractC495790JcP.getClass();
            if (obj2 != null) {
                obj = obj2;
            }
            if (abstractC495790JcP.LJIIIZ(user, obj)) {
                arrayList.add(next2);
            }
        }
        if (componentLayoutConfig != null) {
            ViewGroup viewGroup = this.LIZJ;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            Iterator<ComponentLayoutConfig.VerticalRow> it3 = componentLayoutConfig.verticalRows.iterator();
            while (it3.hasNext()) {
                Iterator<Integer> it4 = it3.next().componentList.iterator();
                while (it4.hasNext()) {
                    int iIntValue = it4.next().intValue();
                    Iterator it5 = arrayList.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next = it5.next();
                            EnumC495780JcO enumC495780JcOLIZLLL = ((AbstractC495790JcP) next).LIZLLL();
                            switch (iIntValue) {
                                case 1:
                                    enumC495780JcO = EnumC495780JcO.GIFT_GALLERY;
                                    break;
                                case 2:
                                    enumC495780JcO = EnumC495780JcO.FEST_HONORS;
                                    break;
                                case 3:
                                    enumC495780JcO = EnumC495780JcO.ECOM;
                                    break;
                                case 4:
                                    enumC495780JcO = EnumC495780JcO.SERVICE_PLUS;
                                    break;
                                case 5:
                                    enumC495780JcO = EnumC495780JcO.GROUP_CHAT;
                                    break;
                                case 6:
                                    enumC495780JcO = EnumC495780JcO.BULLETIN_BOARD;
                                    break;
                                case 7:
                                    enumC495780JcO = EnumC495780JcO.LIVE_EVENT;
                                    break;
                                default:
                                    enumC495780JcO = null;
                                    break;
                            }
                            if (enumC495780JcOLIZLLL == enumC495780JcO) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    AbstractC495790JcP abstractC495790JcP2 = (AbstractC495790JcP) next;
                    if (abstractC495790JcP2 != null && C500260Jjc.LJJJJIZL(abstractC495790JcP2.LLILLL) && ((view = abstractC495790JcP2.LLILLL) == null || view.getParent() == null)) {
                        ViewGroup viewGroup2 = this.LIZJ;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(abstractC495790JcP2.LLILLL);
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC495790JcP abstractC495790JcP3 : arrayList) {
            Object obj3 = map.get(abstractC495790JcP3);
            abstractC495790JcP3.getClass();
            if (obj3 == null) {
                obj3 = null;
            }
            Map mapLJIIJJI = abstractC495790JcP3.LJIIJJI(obj3);
            if (mapLJIIJJI != null) {
                linkedHashMap.putAll(mapLJIIJJI);
            }
        }
        int i2 = 0;
        for (Object obj4 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                AbstractC495790JcP abstractC495790JcP4 = (AbstractC495790JcP) obj4;
                if (i2 == 0) {
                    if (this.LJ.contains(abstractC495790JcP4.LIZLLL())) {
                        fLIZIZ = C497740JfY.LIZIZ(20.0f);
                    } else {
                        fLIZIZ = C497740JfY.LIZIZ(8.0f);
                    }
                } else if (this.LJ.contains(abstractC495790JcP4.LIZLLL()) && arrayList.size() > i2 - 1 && this.LJFF.contains(((AbstractC495790JcP) ListProtector.get(arrayList, i)).LIZLLL())) {
                    fLIZIZ = C497740JfY.LIZIZ(20.0f);
                } else {
                    fLIZIZ = C497740JfY.LIZIZ(8.0f);
                }
                int iLIZIZ = (int) fLIZIZ;
                if (LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable()) {
                    iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
                }
                abstractC495790JcP4.LJIILLIIL(0, iLIZIZ, 0);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_vertical_tool_show");
        c474500IjALIZ.LJIJJLI(this.LIZ.LJIIJJI);
        c474500IjALIZ.LJJII(this.LIZ.LJIIIIZZ.clickModule, "click_module");
        c474500IjALIZ.LJJII(this.LIZ.LIZJ.LIZ(), "card_click_view");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJFF.getId()), "actual_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJFF.getOwnerUserId()), "actual_anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJI.getId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJII), "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ.LJFF.getOwner().getFollowInfo().getFollowStatus()), "follow_status");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((AbstractC495790JcP) it6.next()).LIZLLL());
        }
        for (EnumC495780JcO enumC495780JcO2 : (ArrayList) LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is_");
            sbLIZ.append(enumC495780JcO2.name().toLowerCase(Locale.ROOT));
            sbLIZ.append("_show");
            c474500IjALIZ.LJJII(Integer.valueOf(arrayList2.contains(enumC495780JcO2) ? 1 : 0), C2188811AlT.LIZIZ(sbLIZ));
        }
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        return true ^ arrayList.isEmpty();
    }
}
