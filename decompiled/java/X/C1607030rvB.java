package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0rvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607030rvB extends AbstractC1608790ry1<AbstractC994080byY, C1606330ru3> {
    public static final List<C07TW> LJ = C1697810uHb.LJIIJJI(new C07TW(24.0f, 12.0f, -8.0f), new C07TW(30.0f, -9.0f, 4.0f));
    public static final List<C07TW> LJFF = C1697810uHb.LJIIJJI(new C07TW(24.0f, -4.5f, 11.5f), new C07TW(24.0f, -10.0f, -10.0f), new C07TW(24.0f, 12.5f, -5.5f));
    public final C1606330ru3 LIZLLL;

    @Override // X.AbstractC1608790ry1
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
        return this.LIZLLL;
    }

    public C1607030rvB(C1606330ru3 c1606330ru3) {
        this.LIZLLL = c1606330ru3;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
        if (interfaceC1606880ruw instanceof C994090byZ) {
            return null;
        }
        if (!(interfaceC1606880ruw instanceof C994060byW) && !(interfaceC1606880ruw instanceof C994070byX)) {
            throw new C1954807lC();
        }
        return new C1606960rv4(new C1606970rv5(new C1609250ryl(C1606920rv0.LIZ, new C1608470rxV(AFwS264S0000000_24.get$arr$(742), AFwS264S0000000_24.get$arr$(743), 4), null, AFwS243S0000000_11.get$arr$(778), new AwS585S0100000_6(this, 410), null, true, true, AFwS264S0000000_24.get$arr$(744), null, 3148)));
    }

    @Override // X.AbstractC1608790ry1
    public final C1606990rv7 LIZJ(InterfaceC1606880ruw interfaceC1606880ruw) {
        AbstractC994080byY abstractC994080byY = (AbstractC994080byY) interfaceC1606880ruw;
        if (abstractC994080byY instanceof C994090byZ) {
            return null;
        }
        if (abstractC994080byY instanceof C994060byW) {
            return LJI("story_reveal_centralized_entry_two_avatars", ((C994060byW) abstractC994080byY).LL, C13LP.LJLJJLL(LJ));
        }
        if (abstractC994080byY instanceof C994070byX) {
            return LJI("story_reveal_centralized_entry_three_avatars", ((C994070byX) abstractC994080byY).LL, C13LP.LJLJJLL(LJFF));
        }
        throw new C1954807lC();
    }

    public static void LJII(C1606310ru1 c1606310ru1, List list) {
        FrameLayout frameLayout;
        int i;
        float f;
        View view = c1606310ru1.LIZIZ;
        if (!(view instanceof FrameLayout) || (frameLayout = (FrameLayout) view) == null || frameLayout.getChildCount() == list.size()) {
            return;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        Context context = frameLayout.getContext();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        float f2 = 1.0f;
        if (i > 0) {
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(66.0f));
            if (fLIZIZ > 0.0f) {
                f2 = i / fLIZIZ;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C07TW c07tw = (C07TW) it2.next();
            C430210Gtv c430210Gtv = new C430210Gtv(context);
            c430210Gtv.setBorderAttrRes(R.attr.zi);
            c430210Gtv.setBorderWidthPx((int) (C418440Gaw.LIZIZ(Float.valueOf(2.5f)) * f2));
            c430210Gtv.setRoundingParamsPadding(0.0f);
            int iLIZIZ = (int) (C418440Gaw.LIZIZ(Float.valueOf(c07tw.LIZ + 5.0f)) * f2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
            if (i > 0) {
                f = i / 2.0f;
            } else {
                f = 0.0f;
            }
            float f3 = iLIZIZ / 2.0f;
            Pair pair = new Pair(Integer.valueOf((int) (((C418440Gaw.LIZIZ(Float.valueOf(c07tw.LIZIZ)) * f2) + f) - f3)), Integer.valueOf((int) ((f + (C418440Gaw.LIZIZ(Float.valueOf(c07tw.LIZJ)) * f2)) - f3)));
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            layoutParams2.leftMargin = iIntValue;
            layoutParams2.topMargin = iIntValue2;
            frameLayout.addView(c430210Gtv, layoutParams2);
        }
    }

    public static void LJFF(C1606310ru1 c1606310ru1, List list, List list2) {
        ViewGroup viewGroup;
        int i;
        C430210Gtv c430210Gtv;
        View view = c1606310ru1.LIZIZ;
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            float f = 1.0f;
            if (i > 0) {
                float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(66.0f));
                if (fLIZIZ > 0.0f) {
                    f = i / fLIZIZ;
                }
            }
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C07TW c07tw = (C07TW) obj;
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof C430210Gtv) && (c430210Gtv = (C430210Gtv) childAt) != null) {
                        User user = (User) C13LP.LJJJLZIJ(i2, new C13EL(list));
                        if (user == null) {
                            C786410Ut5.n(c430210Gtv, 8);
                        } else {
                            C786410Ut5.n(c430210Gtv, 0);
                            int iLIZIZ = (int) (C418440Gaw.LIZIZ(Float.valueOf(c07tw.LIZ)) * f);
                            c430210Gtv.LJIIJ(user.getAvatarThumb(), null, iLIZIZ, iLIZIZ, "AvatarStoryRevealNodeFactory", false, null);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final C1606990rv7 LJI(String str, List<? extends User> list, List<C07TW> list2) {
        return new C1606990rv7(new C1606970rv5(new C1609250ryl(new InterfaceC1609270ryn() { // from class: X.0qdz
            @Override // X.InterfaceC1609270ryn
            public final Function1<C1608740rxw, C1609310ryr> LJIJJ() {
                return null;
            }

            @Override // X.InterfaceC1609270ryn
            public final boolean LJIJJLI() {
                return true;
            }

            @Override // X.InterfaceC1609270ryn
            public final int LJIL() {
                return 17;
            }
        }, new C1608470rxV(AFwS264S0000000_24.get$arr$(739), AFwS264S0000000_24.get$arr$(740), 4), null, AFwS264S0000000_24.get$arr$(741), new AwS233S0300000_24(this, (C1607030rvB) list2, (List<C07TW>) list, (List<? extends User>) 21), new AwS233S0300000_24(this, (C1607030rvB) list2, (List<C07TW>) list, (List<? extends User>) 22), false, false, null, str, 1932)));
    }
}
