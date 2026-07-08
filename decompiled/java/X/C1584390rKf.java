package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584390rKf {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        return C1767800w6U.LJ() ? 1 : 2;
    }

    public static int LIZIZ(C19EG c19eg) {
        HomeTabAbility homeTabAbility;
        List<BottomTabProtocol> listSz;
        Object ability;
        HomeTabAbility homeTabAbility2;
        List listL32;
        HomeViewPagerAbility homeViewPagerAbility;
        int size;
        Object ability2;
        Object ability3;
        if (c19eg == null) {
            return 0;
        }
        int i = -1;
        Object obj = null;
        if (C1767800w6U.LJ()) {
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability3 = c0qsjLIZJ.getAbility(HomeTabAbility.class);
                } else {
                    ability3 = null;
                }
                if (!(ability3 instanceof HomeTabAbility)) {
                    ability3 = null;
                }
                homeTabAbility2 = (HomeTabAbility) ability3;
            } else {
                homeTabAbility2 = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
            }
            if (homeTabAbility2 == null || (listL32 = homeTabAbility2.l32()) == null) {
                listL32 = C13BV.INSTANCE;
            }
            Iterator it2 = listL32.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((InterfaceC1583870rJp) it2.next()).tag(), "Shop")) {
                    if (i2 >= 0) {
                        int size2 = (listL32.size() - 1) - i2;
                        if (C297720Bli.LIZ()) {
                            C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                            if (c0qsjLIZJ2 != null) {
                                ability2 = c0qsjLIZJ2.getAbility(HomeViewPagerAbility.class);
                            } else {
                                ability2 = null;
                            }
                            if (ability2 instanceof HomeViewPagerAbility) {
                                obj = ability2;
                            }
                            homeViewPagerAbility = (HomeViewPagerAbility) obj;
                        } else {
                            homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeViewPagerAbility.class, null);
                        }
                        if (homeViewPagerAbility != null) {
                            size = homeViewPagerAbility.P81();
                        } else {
                            size = listL32.size() - 1;
                        }
                        int size3 = size2 - ((listL32.size() - 1) - size);
                        if (size3 != -1) {
                            return size3 + 1;
                        }
                        return size3;
                    }
                } else {
                    i2++;
                }
            }
            return 0;
        }
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ3 = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ3 != null) {
                ability = c0qsjLIZJ3.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeTabAbility) {
                obj = ability;
            }
            homeTabAbility = (HomeTabAbility) obj;
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility == null || (listSz = homeTabAbility.Sz()) == null) {
            listSz = C13BV.INSTANCE;
        }
        Iterator<BottomTabProtocol> it3 = listSz.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            BottomTabProtocol next = it3.next();
            if (!next.LJI() && Intrinsics.LJFF(next.getTag(), "SHOP_MALL")) {
                i = i3;
                break;
            }
            i3++;
        }
        return i + 1;
    }

    public static String LIZJ(String str) {
        if (str == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (!Intrinsics.LJFF(str, "show_cache") && !Intrinsics.LJFF(str, "show_fetch") && !Intrinsics.LJFF(str, "over") && !Intrinsics.LJFF(str, "render")) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
