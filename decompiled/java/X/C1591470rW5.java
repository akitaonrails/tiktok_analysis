package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.experiment.TopTabPreloadConfig;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591470rW5 {
    public final TopTabPreloadConfig LIZ;
    public final ITabStrip LIZIZ;
    public final HomeTabAbility LIZJ;
    public final HomeViewPagerAbility LIZLLL;
    public int LJ = -1;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final InterfaceC1589850rTT LIZ(String str) {
        List<TopTabProtocol> listB9;
        TopTabProtocol next;
        HomeTabAbility homeTabAbility = this.LIZJ;
        if (homeTabAbility == null || (listB9 = homeTabAbility.b9()) == null) {
            return null;
        }
        Iterator<TopTabProtocol> it2 = listB9.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getTag(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TopTabProtocol topTabProtocol = next;
        if (topTabProtocol == null) {
            return null;
        }
        return topTabProtocol.LJ();
    }

    public C1591470rW5(TopTabPreloadConfig topTabPreloadConfig, MainTabStrip mainTabStrip, HomeTabAbility homeTabAbility, HomeViewPagerAbility homeViewPagerAbility) {
        this.LIZ = topTabPreloadConfig;
        this.LIZIZ = mainTabStrip;
        this.LIZJ = homeTabAbility;
        this.LIZLLL = homeViewPagerAbility;
    }
}
