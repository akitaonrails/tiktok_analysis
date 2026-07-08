package X;

import Y.ARunnableS25S0100100_27;
import Y.ARunnableS5S2100000_11;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicManagementFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0y1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841550y1R extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1841510y1N LL;
    public final /* synthetic */ C1841520y1O LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ ExploreCustomTopicResponse LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841550y1R(C1841510y1N c1841510y1N, C1841520y1O c1841520y1O, C013C c013c, ExploreCustomTopicResponse exploreCustomTopicResponse, int i) {
        super(1);
        this.LL = c1841510y1N;
        this.LLILLJJLI = c1841520y1O;
        this.LLILLL = c013c;
        this.LLILZ = exploreCustomTopicResponse;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        Integer numValueOf;
        RecyclerView recyclerView;
        long jLJIILL;
        TuxNavBar tuxNavBar;
        long jLongValue;
        List<ExploreCustomTopicResponse> listZV0;
        if (this.LL.getBindingAdapterPosition() >= 0 && this.LL.getBindingAdapterPosition() < this.LLILLJJLI.LL.size()) {
            this.LLILLL.element = true;
            C15TA c15ta = C15TA.LIZ;
            ExploreCustomTopicResponse exploreCustomTopicResponse = this.LLILZ;
            Long l = exploreCustomTopicResponse.topicId;
            String str = exploreCustomTopicResponse.topicName;
            String value = EnumC696450RTn.MANAGE.getValue();
            Integer numValueOf2 = Integer.valueOf(this.LLILZIL);
            ExploreManageTabAbility exploreManageTabAbility = (ExploreManageTabAbility) this.LL.LLILZIL.getValue();
            if (exploreManageTabAbility != null && (listZV0 = exploreManageTabAbility.zV0()) != null) {
                numValueOf = Integer.valueOf(listZV0.size());
            } else {
                numValueOf = null;
            }
            String value2 = EnumC1841610y1X.UNPIN.getValue();
            c15ta.getClass();
            C15TA.LIZLLL(null, null, numValueOf2, numValueOf, l, str, null, value, null, value2);
            ExploreManageTabAbility exploreManageTabAbility2 = (ExploreManageTabAbility) this.LL.LLILZIL.getValue();
            if (exploreManageTabAbility2 != null) {
                ExploreCustomTopicResponse exploreCustomTopicResponse2 = this.LLILZ;
                String str2 = exploreCustomTopicResponse2.topicName;
                if (str2 == null) {
                    str2 = "";
                }
                Long l2 = exploreCustomTopicResponse2.topicId;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = -1;
                }
                exploreManageTabAbility2.wK(jLongValue, str2);
            }
            ExploreTopicManagementFragment exploreTopicManagementFragment = this.LLILLJJLI.LLILLJJLI.get();
            if (exploreTopicManagementFragment != null && (tuxNavBar = (TuxNavBar) exploreTopicManagementFragment.LLJI.getValue()) != null) {
                tuxNavBar.LJJ(AFwS269S0000000_27.get$arr$(491), exploreTopicManagementFragment.LLJIJIL);
            }
            C1841520y1O c1841520y1O = this.LLILLJJLI;
            C1841510y1N c1841510y1N = this.LL;
            int bindingAdapterPosition = c1841510y1N.getBindingAdapterPosition();
            c1841520y1O.getClass();
            ViewParent parent = c1841510y1N.itemView.getParent();
            if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
                AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    jLJIILL = itemAnimator.LJIILL();
                    itemAnimator.LJIL(0L);
                } else {
                    jLJIILL = 250;
                }
                ListProtector.remove(c1841520y1O.LL, bindingAdapterPosition);
                c1841520y1O.notifyDataSetChanged();
                HandlerHook.viewPost(recyclerView, new ARunnableS25S0100100_27(jLJIILL, itemAnimator, 7));
            }
            ExploreCustomTopicResponse exploreCustomTopicResponse3 = this.LLILZ;
            C15TA.LJIILL(new ARunnableS5S2100000_11(exploreCustomTopicResponse3.topicId, exploreCustomTopicResponse3.topicName, "done", 0));
        }
        return Unit.LIZ;
    }
}
