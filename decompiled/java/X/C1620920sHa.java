package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.log.ICommerceSessionPositionManagerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedAssem;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedViewHolder;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksAssem;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksPanel;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksVM;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620920sHa implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrollStateChanged$0(C1620920sHa c1620920sHa, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1620920sHa c1620920sHa, int i) {
    }

    public static final void onPageScrollStateChanged$2(C1620920sHa c1620920sHa, int i) {
    }

    public static final void onPageScrolled$0(C1620920sHa c1620920sHa, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1620920sHa c1620920sHa, int i, float f, int i2) {
    }

    public static final void onPageSelected$1(C1620920sHa c1620920sHa, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
        }
    }

    public static final void onPageSelected$0(C1620920sHa c1620920sHa, int i) {
        Aweme aweme;
        SeriesFeedVM seriesFeedVMHo = ((SeriesFeedAssem) c1620920sHa.l0).Ho();
        C0SZ8 c0sz8LJLIL = ((SeriesFeedViewHolder) c1620920sHa.l1).LJLIL();
        if (c0sz8LJLIL != null) {
            aweme = c0sz8LJLIL.getAweme();
        } else {
            aweme = null;
        }
        seriesFeedVMHo.AQ2(new C1567980quC(i, aweme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onPageSelected$2(C1620920sHa c1620920sHa, int i) {
        Aweme aweme;
        String aid;
        int i2;
        int size;
        DramaPicksVM dramaPicksVMGo = ((DramaPicksAssem) c1620920sHa.l0).Go();
        C0SZ8 c0sz8LJLIL = ((DramaPicksPanel) c1620920sHa.l1).LJLIL();
        Aweme aweme2 = null;
        if (c0sz8LJLIL != null) {
            aweme = c0sz8LJLIL.getAweme();
        } else {
            aweme = null;
        }
        List<Aweme> list = ((C1567810qtv) dramaPicksVMGo.getState()).LL.LLILZ;
        if (aweme == null) {
            if (list != null) {
                aweme2 = (Aweme) C13LP.LJJJLZIJ(i, list);
            }
        } else {
            aweme2 = aweme;
        }
        dramaPicksVMGo.LLILLL = aweme2;
        int i3 = 0;
        if (C1492500owS.LIZ()) {
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            boolean z = true;
            if (i != 0 && (i <= 0 || i != size - 1)) {
                z = false;
            }
            try {
                Boolean boolValueOf = Boolean.valueOf(z);
                AtomicBoolean atomicBoolean = NoNetDetectHelper.LIZ;
                if (C1492500owS.LIZ()) {
                    NoNetDetectHelper.LJIJJ.set(boolValueOf.booleanValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Aweme aweme3 = dramaPicksVMGo.LLILLL;
        if (aweme3 != null) {
            HashMap<String, String> mobParams = aweme3.getMobParams();
            if (mobParams == null || (aid = mobParams.get("source_video_id")) == null) {
                aid = aweme3.getAid();
            }
            List<Aweme> list2 = ((C1567810qtv) dramaPicksVMGo.getState()).LL.LLILZ;
            int i4 = -1;
            if (list2 != null) {
                Iterator<Aweme> it2 = list2.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), aid)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i2 = -1;
            } else {
                i2 = -1;
            }
            List<Aweme> list3 = ((C1567810qtv) dramaPicksVMGo.getState()).LL.LLILZ;
            if (list3 != null) {
                Iterator<Aweme> it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it3.next().getAid(), dramaPicksVMGo.LLIZLLLIL)) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
            }
            if (i2 > i4) {
                dramaPicksVMGo.LLIZLLLIL = aid;
            }
            ((C1612500s40) dramaPicksVMGo.LLILZIL.getValue()).LIZ(aweme3);
            ICommerceSessionPositionManagerService iCommerceSessionPositionManagerService = (ICommerceSessionPositionManagerService) PluggableExtentionKt.pluggableSpi$default(ICommerceSessionPositionManagerService.class, false, false, false, 14, null);
            if (iCommerceSessionPositionManagerService != null) {
                iCommerceSessionPositionManagerService.r3(aweme3);
            }
        }
    }

    public C1620920sHa(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onPageScrolled$1(C1620920sHa c1620920sHa, int i, float f, int i2) {
        if (Math.abs(i2) > C339190DRl.LIZ(10)) {
            C013C c013c = (C013C) c1620920sHa.l0;
            if (!c013c.element) {
                c013c.element = true;
                C1602840roQ c1602840roQ = C1602820roO.LIZ;
                if (c1602840roQ != null) {
                    c1602840roQ.dismiss();
                }
                Function0 function0 = (Function0) c1620920sHa.l1;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
