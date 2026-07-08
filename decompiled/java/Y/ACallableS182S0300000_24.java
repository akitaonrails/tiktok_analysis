package Y;

import X.C086I;
import X.C1388190mED;
import X.C1400330mXn;
import X.C1582020rGq;
import X.C1586930rOl;
import X.C1587810rQB;
import X.C1595430rcT;
import X.C1606360ru6;
import X.C19EG;
import X.C1C7U;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C785410UrT;
import X.C798060VSi;
import X.C816490W1f;
import X.DialogC19268110Zr;
import X.EnumC1586890rOh;
import X.InterfaceC1583870rJp;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public class ACallableS182S0300000_24 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS182S0300000_24 aCallableS182S0300000_24) {
        C1606360ru6 c1606360ru6 = (C1606360ru6) aCallableS182S0300000_24.l0;
        Context context = (Context) aCallableS182S0300000_24.l1;
        String[] strArr = (String[]) aCallableS182S0300000_24.l2;
        c1606360ru6.getClass();
        C1C7U.LIZ("InitialChooseLanguageManager@38df.tryShowDialog$1L");
        if ((context instanceof Activity) && C1388190mED.LIZ(context).isFinishing()) {
            C1C7U.LIZIZ("InitialChooseLanguageManager@38df.tryShowDialog$1L");
            return null;
        }
        if (c1606360ru6.LJI == null) {
            c1606360ru6.LJI = new DialogC19268110Zr(context, strArr);
        }
        if (!c1606360ru6.LJI.isShowing()) {
            DialogC19268110Zr dialogC19268110Zr = c1606360ru6.LJI;
            dialogC19268110Zr.show();
            C785410UrT.LIZIZ(dialogC19268110Zr);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC19268110Zr);
            C816490W1f.LIZ(dialogC19268110Zr);
        }
        c1606360ru6.LIZ = false;
        C1C7U.LIZIZ("InitialChooseLanguageManager@38df.tryShowDialog$1L");
        return null;
    }

    public static final Object call$1(ACallableS182S0300000_24 aCallableS182S0300000_24) {
        C1C7U.LIZ("TabAbilityAssem@1a05.commitPreLoadTask$2");
        C1582020rGq.LIZJ("scene_collect_bottom_tab");
        Pair<List<InterfaceC1583870rJp>, List<BottomTabProtocol>> pairLIZIZ = ((TabAbilityAssem) aCallableS182S0300000_24.l0).mo().LIZIZ((C19EG) aCallableS182S0300000_24.l1, (InterfaceC665370Q7z) aCallableS182S0300000_24.l2, 1);
        C1582020rGq.LIZ("scene_collect_bottom_tab");
        C1582020rGq.LIZIZ("stage_fcp_calculate");
        C1C7U.LIZIZ("TabAbilityAssem@1a05.commitPreLoadTask$2");
        return pairLIZIZ;
    }

    public static final Object call$2(ACallableS182S0300000_24 aCallableS182S0300000_24) {
        boolean z;
        List<FriendsFeed> list;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        C1C7U.LIZ("FriendsFeedModel@e8fc.handleMsg$1");
        C1587810rQB c1587810rQB = (C1587810rQB) aCallableS182S0300000_24.l0;
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) aCallableS182S0300000_24.l1;
        c1587810rQB.getClass();
        try {
            C1586930rOl redDotMetadataBeforeEnteringTab = C1595430rcT.LIZIZ.LIZIZ().getRedDotMetadataBeforeEnteringTab();
            boolean z3 = redDotMetadataBeforeEnteringTab.LIZLLL;
            if (z3) {
                c1587810rQB.LLJILJIL = redDotMetadataBeforeEnteringTab.LIZJ;
                c1587810rQB.LLJILJILJ = redDotMetadataBeforeEnteringTab.LIZ.size();
            }
            if (friendsFeedResponse == null) {
                list = null;
            } else {
                list = friendsFeedResponse.friendFeedData;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null && !C086I.LIZIZ(list)) {
                z2 = false;
                i = 0;
                i3 = 0;
                i4 = 0;
                i2 = 0;
                for (FriendsFeed friendsFeed : list) {
                    Aweme aweme = friendsFeed.getAweme();
                    int source = friendsFeed.getSource();
                    if (source == EnumC1586890rOh.SORT.getDataLevel()) {
                        i2++;
                        if (aweme != null) {
                            if (AwemeExtKt.getFollowStatus(aweme) == 1) {
                                if (aweme.getIsTikTokStory()) {
                                    c1587810rQB.LLJI++;
                                } else {
                                    c1587810rQB.LLIZLLLIL++;
                                }
                            } else if (AwemeExtKt.getFollowStatus(aweme) == 2) {
                                if (aweme.getIsTikTokStory()) {
                                    c1587810rQB.LLJIJIL++;
                                } else {
                                    c1587810rQB.LLJ++;
                                }
                            } else if (AwemeExtKt.getFollowStatus(aweme) == 0) {
                                i++;
                            }
                            if (!C1595430rcT.LIZIZ.LIZIZ().originalNumberDotList().contains(aweme.getAid())) {
                                arrayList.add(aweme.getAid());
                            }
                        }
                    } else {
                        if (source == EnumC1586890rOh.HISTORY_UNVIEWED.getDataLevel() && aweme != null) {
                            if (!aweme.getIsTikTokStory()) {
                                i4++;
                            } else {
                                i3++;
                            }
                        }
                        z2 = true;
                    }
                }
            } else {
                z2 = false;
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (friendsFeedResponse == null || friendsFeedResponse.extra == null || (str = friendsFeedResponse.extra.logid) == null) {
                str = "";
            }
            if (z3 || (z2 && (c1587810rQB.LLJILJILJ != 0 || c1587810rQB.LLJILJIL != 0))) {
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                int i6 = c1587810rQB.LLJILJILJ;
                int i7 = c1587810rQB.LLJILJIL;
                int i8 = c1587810rQB.LLJI;
                int i9 = c1587810rQB.LLIZLLLIL;
                int i10 = c1587810rQB.LLJIJIL;
                int i11 = c1587810rQB.LLJ;
                String redDotRequestId = C1595430rcT.LIZIZ.LIZIZ().getRedDotRequestId();
                if (z2) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                c1400330mXn.getClass();
                C1400330mXn.LJI(str, i6, i7, i2, i8, i9, i10, i11, i, i3, i4, arrayList, redDotRequestId, i5, z3);
                if (z2) {
                    try {
                        c1587810rQB.LLJIJIL = 0;
                        c1587810rQB.LLJ = 0;
                        c1587810rQB.LLJI = 0;
                        c1587810rQB.LLIZLLLIL = 0;
                        c1587810rQB.LLJILJIL = 0;
                        c1587810rQB.LLJILJILJ = 0;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportRedDotAccuracyMob error ");
                        sbLIZ.append(e.getMessage());
                        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        C1587810rQB c1587810rQB2 = (C1587810rQB) aCallableS182S0300000_24.l0;
        FriendsFeedResponse friendsFeedResponse2 = (FriendsFeedResponse) aCallableS182S0300000_24.l1;
        C798060VSi c798060VSi = (C798060VSi) aCallableS182S0300000_24.l2;
        if (c798060VSi != null) {
            z = c798060VSi.LIZIZ;
        } else {
            z = false;
        }
        c1587810rQB2.LJIIL(friendsFeedResponse2, z);
        C1C7U.LIZIZ("FriendsFeedModel@e8fc.handleMsg$1");
        return null;
    }

    public ACallableS182S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
