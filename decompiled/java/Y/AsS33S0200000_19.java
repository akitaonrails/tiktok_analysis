package Y;

import X.AbstractC1585810rMx;
import X.AbstractC1881807Yq;
import X.C08S3;
import X.C1227904rF;
import X.C1232610iBH;
import X.C1233080iC2;
import X.C13LP;
import X.C1881907Yr;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196291AxX;
import X.C2344009Gk;
import X.C481090Itn;
import X.C786410Ut5;
import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity;
import com.ss.android.ugc.aweme.relation.recommend.NewVersionRecFriendsListAssem;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes20.dex */
public class AsS33S0200000_19 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS33S0200000_19(MinisSubscriptionListActivity minisSubscriptionListActivity, int i) {
        this.$t = i;
        this.l1 = minisSubscriptionListActivity;
        this.l0 = new LinkedHashSet();
    }

    public AsS33S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIZI$0(AsS33S0200000_19 asS33S0200000_19, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int itemCount;
        C1233080iC2 c1233080iC2;
        AbstractC1881807Yq abstractC1881807Yq;
        MinisSubscriptionInfo minisSubscriptionInfo;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            Set setLLIIIZ = C13LP.LLIIIZ(new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition()));
            Set setLJLLLLLL = C13LP.LJLLLLLL(setLLIIIZ, (Set) asS33S0200000_19.l0);
            MinisSubscriptionListActivity minisSubscriptionListActivity = (MinisSubscriptionListActivity) asS33S0200000_19.l1;
            Iterator it2 = setLJLLLLLL.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                C1233080iC2 c1233080iC22 = minisSubscriptionListActivity.LLILZ;
                if (c1233080iC22 != null) {
                    itemCount = c1233080iC22.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (iIntValue < itemCount && (c1233080iC2 = minisSubscriptionListActivity.LLILZ) != null) {
                    if (iIntValue >= 0 && iIntValue < ((ArrayList) c1233080iC2.LLILLJJLI).size()) {
                        abstractC1881807Yq = (AbstractC1881807Yq) ListProtector.get(c1233080iC2.LLILLJJLI, iIntValue);
                    } else {
                        abstractC1881807Yq = null;
                    }
                    if ((abstractC1881807Yq instanceof C1881907Yr) && (minisSubscriptionInfo = ((C1881907Yr) abstractC1881807Yq).LIZ) != null) {
                        String str = minisSubscriptionInfo.clientKey;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        SchemaParserData.Companion.getClass();
                        String strLIZ = C2196291AxX.LIZ(str);
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        String str3 = minisSubscriptionInfo.status;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        C1232610iBH.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJFF("minis_id", str);
                        c2344009Gk.LJFF("minis_type", strLIZ);
                        c2344009Gk.LJFF("sub_status", str2);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSubscriptionListPageShow, ");
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        Map<String, String> map = c2344009Gk.LIZ;
                        c1227904rF.getClass();
                        sbLIZ.append(C1227904rF.LJI(map));
                        C2188811AlT.LIZIZ(sbLIZ);
                        C08S3 c08s3 = C08S3.LIZ;
                        Map<String, String> map2 = c2344009Gk.LIZ;
                        c08s3.getClass();
                        C08S3.LIZJ("tm_subscription_list_page_show", map2);
                    }
                }
            }
            asS33S0200000_19.l0 = setLLIIIZ;
        }
    }

    public static final void LJJIIZI$1(AsS33S0200000_19 asS33S0200000_19, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        Boolean boolValueOf;
        boolean z2;
        boolean z3;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) asS33S0200000_19.l0).getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else if (layoutManager instanceof GridLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            int[] iArrLJIILL = ((StaggeredGridLayoutManager) layoutManager).LJIILL(null);
            int i3 = 0;
            for (int i4 : iArrLJIILL) {
                if (i4 <= 0) {
                    i3++;
                }
            }
            if (i3 > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (boolValueOf != null && (((C481090Itn) asS33S0200000_19.l1).isEnabled() ^ boolValueOf.booleanValue())) {
            if (boolValueOf.booleanValue()) {
                ((C481090Itn) asS33S0200000_19.l1).setEnabled(true);
                return;
            }
            C481090Itn c481090Itn = (C481090Itn) asS33S0200000_19.l1;
            if (c481090Itn.LLLFF) {
                return;
            }
            c481090Itn.setEnabled(false);
        }
    }

    public static final void LJJIIZI$2(AsS33S0200000_19 asS33S0200000_19, RecyclerView recyclerView, int i, int i2) {
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) asS33S0200000_19.l0).findFirstVisibleItemPosition();
        TuxNavBar tuxNavBar = null;
        if (iFindFirstVisibleItemPosition == 0) {
            TuxNavBar tuxNavBar2 = ((NewVersionRecFriendsListAssem) asS33S0200000_19.l1).LLIZLLLIL;
            if (tuxNavBar2 == null) {
                tuxNavBar2 = null;
            }
            if (tuxNavBar2.getAlpha() == 1.0f) {
                TuxNavBar tuxNavBar3 = ((NewVersionRecFriendsListAssem) asS33S0200000_19.l1).LLIZLLLIL;
                if (tuxNavBar3 != null) {
                    tuxNavBar = tuxNavBar3;
                }
                C786410Ut5.C5(tuxNavBar, 0.0f);
                return;
            }
            return;
        }
        if (iFindFirstVisibleItemPosition <= 0) {
            return;
        }
        TuxNavBar tuxNavBar4 = ((NewVersionRecFriendsListAssem) asS33S0200000_19.l1).LLIZLLLIL;
        if (tuxNavBar4 == null) {
            tuxNavBar4 = null;
        }
        if (tuxNavBar4.getAlpha() != 0.0f) {
            return;
        }
        TuxNavBar tuxNavBar5 = ((NewVersionRecFriendsListAssem) asS33S0200000_19.l1).LLIZLLLIL;
        if (tuxNavBar5 != null) {
            tuxNavBar = tuxNavBar5;
        }
        C786410Ut5.C5(tuxNavBar, 1.0f);
    }

    public static final void LJJIIZI$3(AsS33S0200000_19 asS33S0200000_19, RecyclerView recyclerView, int i, int i2) {
        ProfileBaseAwemeListFragment profileBaseAwemeListFragment = (ProfileBaseAwemeListFragment) asS33S0200000_19.l0;
        RecyclerView recyclerView2 = profileBaseAwemeListFragment.LLJJJIL;
        if (recyclerView2 != null) {
            HandlerHook.viewPostDelay(recyclerView2, new ARunnableS25S0201000_19(i2, profileBaseAwemeListFragment, (Rect) asS33S0200000_19.l1, 5), 1500L);
        }
    }
}
