package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicManagementFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0y1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841520y1O extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<ExploreCustomTopicResponse> LL;
    public final WeakReference<ExploreTopicManagementFragment> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    @InterfaceC1294060jmO
    public final int getItemCount() {
        return this.LL.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == this.LL.size()) {
            return 1;
        }
        return 0;
    }

    public C1841520y1O(List<ExploreCustomTopicResponse> list, WeakReference<ExploreTopicManagementFragment> weakReference) {
        this.LL = list;
        this.LLILLJJLI = weakReference;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C1841520y1O c1841520y1O;
        if (viewHolder instanceof C1841510y1N) {
            final ExploreCustomTopicResponse exploreCustomTopicResponse = (ExploreCustomTopicResponse) ListProtector.get(this.LL, i);
            final C1841510y1N c1841510y1N = (C1841510y1N) viewHolder;
            c1841510y1N.LLILLL.setText(exploreCustomTopicResponse.topicName);
            if (c1841510y1N.getBindingAdapterPosition() == 0) {
                c1841510y1N.LL.setTintColorRes(R.attr.a02);
                C197039127h c197039127h = c1841510y1N.LLILLJJLI;
                C786410Ut5.LLLLLLJ(c197039127h, 4);
                c197039127h.setEnabled(false);
                c1841510y1N.LLILLL.setTextColorRes(R.attr.a1k);
                c1841510y1N.I5(false);
            } else {
                c1841510y1N.LL.setTintColorRes(R.attr.a1p);
                C197039127h c197039127h2 = c1841510y1N.LLILLJJLI;
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
                c197039127h2.setEnabled(true);
                c1841510y1N.LLILLL.setTextColorRes(R.attr.a1h);
                AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = c1841510y1N.getBindingAdapter();
                if ((bindingAdapter instanceof C1841520y1O) && (c1841520y1O = (C1841520y1O) bindingAdapter) != null) {
                    if (c1841510y1N.getBindingAdapterPosition() >= c1841520y1O.LL.size() - 1) {
                        c1841510y1N.L5(false);
                        c1841510y1N.I5(false);
                    } else {
                        c1841510y1N.L5(true);
                        c1841510y1N.I5(false);
                    }
                }
            }
            final C197039127h c197039127h3 = c1841510y1N.LLILLJJLI;
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0y1P
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view) {
                    if (view != null) {
                        C013C c013c = new C013C();
                        C1397580mTM c1397580mTM = new C1397580mTM(c197039127h3.getContext());
                        c1397580mTM.LJI(c197039127h3.getContext().getString(2131829912));
                        c1397580mTM.LIZIZ(c197039127h3.getContext().getString(2131829911));
                        c1397580mTM.LJIILJJIL = true;
                        C985403tE.LIZ(c1397580mTM, new C1841540y1Q(c197039127h3, c1841510y1N, this, c013c, exploreCustomTopicResponse, i));
                        c1397580mTM.LIZLLL(new AwS393S0200000_27(c013c, exploreCustomTopicResponse, 184));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        C15TA c15ta = C15TA.LIZ;
                        ExploreCustomTopicResponse exploreCustomTopicResponse2 = exploreCustomTopicResponse;
                        final String str = exploreCustomTopicResponse2.topicName;
                        final Long l = exploreCustomTopicResponse2.topicId;
                        final Integer numValueOf = Integer.valueOf(i);
                        List<ExploreCustomTopicResponse> list = this.LL;
                        ArrayList arrayList = new ArrayList();
                        for (ExploreCustomTopicResponse exploreCustomTopicResponse3 : list) {
                            Long l2 = exploreCustomTopicResponse3.topicId;
                            if (l2 == null || l2.longValue() != 0) {
                                arrayList.add(exploreCustomTopicResponse3);
                            }
                        }
                        final String strValueOf = String.valueOf(arrayList.size());
                        c15ta.getClass();
                        C15TA.LJIILL(new Runnable() { // from class: X.0RTe
                            public final /* synthetic */ String LLILZ = "homepage_explore";

                            public final void LIZ() {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("explore_topic", str);
                                c2344009Gk.LJ(l, "explore_topic_id");
                                c2344009Gk.LJ(numValueOf, "subtab_position");
                                c2344009Gk.LJIIIIZZ("enter_from", this.LLILZ);
                                c2344009Gk.LJIIIIZZ("total_subtype_num", strValueOf);
                                C20684815ws.LJIILLIIL("ttexp_topic_manage_click_unpin", c2344009Gk.LIZ);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ExploreMobUtils@18af.logTopicManageClickUnpin$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicManageClickUnpin$1");
                            }
                        });
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c197039127h3);
            if (i == 0) {
                c1841510y1N.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c1841510y1N, 8));
            } else {
                c1841510y1N.itemView.setOnLongClickListener(null);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1841510y1N;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i == 0) {
            c1841510y1N = new C1841510y1N(C786410Ut5.Td(layoutInflaterNe, R.layout.c5t, viewGroup, false));
        } else {
            final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.c5r, viewGroup, false);
            c1841510y1N = new RecyclerView.ViewHolder(viewTd) { // from class: X.0y1S
            };
        }
        try {
            View view = c1841510y1N.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1841510y1N.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1841510y1N.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1841510y1N.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1841510y1N.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1841510y1N.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1841510y1N.getClass().getName();
        return c1841510y1N;
    }
}
