package X;

import Y.AfS162S0200000_28;
import Y.AfS197S0100000_28;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardReq;
import webcast.data.AnchorGrowRewardInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneyRewardInfo;

/* JADX INFO: renamed from: X.0zFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888820zFg extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C1AHD LL;
    public final int LLILLJJLI;
    public final int LLILLL = 1;
    public final int LLILZ = 2;
    public final List<LiveJourneyLevelInfo> LLILZIL = new ArrayList();
    public String LLILZLL = "";
    public final Set<String> LLIZ = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (((ArrayList) this.LLILZIL).size() == 1) {
            return 2;
        }
        return ((ArrayList) this.LLILZIL).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer LLLFZ(int i) {
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(this.LLILZIL);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            Object next = c717610SCx.next();
            if (((int) ((LiveJourneyLevelInfo) ((IndexedValue) next).LIZIZ).level) == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((IndexedValue) it3.next()).LIZ));
        }
        Integer num = (Integer) C13LP.LJJJLL(arrayList2);
        if (num != null) {
            ListProtector.remove(this.LLILZIL, num.intValue());
        }
        return num;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < ((ArrayList) this.LLILZIL).size()) {
            return this.LLILLL;
        }
        return this.LLILZ;
    }

    public C1888820zFg(C1AHD c1ahd, int i) {
        this.LL = c1ahd;
        this.LLILLJJLI = i;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        AnchorGrowRewardInfo anchorGrowRewardInfo;
        String string;
        LiveJourneyRewardInfo liveJourneyRewardInfo;
        int i2;
        if (viewHolder instanceof C1888850zFj) {
            C1888850zFj c1888850zFj = (C1888850zFj) viewHolder;
            LiveJourneyLevelInfo liveJourneyLevelInfo = (LiveJourneyLevelInfo) C13LP.LJJJLL(this.LLILZIL);
            c1888850zFj.getClass();
            if (liveJourneyLevelInfo != null && (liveJourneyRewardInfo = liveJourneyLevelInfo.rewardInfo) != null) {
                c1888850zFj.LL.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131853266), Arrays.copyOf(new Object[]{Long.valueOf(liveJourneyLevelInfo.level)}, 1)));
                AnchorGrowRewardInfo anchorGrowRewardInfo2 = liveJourneyRewardInfo.rewardInfo;
                if (anchorGrowRewardInfo2 != null) {
                    i2 = (int) anchorGrowRewardInfo2.num;
                } else {
                    i2 = 0;
                }
                c1888850zFj.LLILLJJLI.setText(C497740JfY.LJIJJ(2131853268, Integer.valueOf(i2)));
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C1888830zFh)) {
            return;
        }
        final LiveJourneyLevelInfo liveJourneyLevelInfo2 = (LiveJourneyLevelInfo) ListProtector.get(this.LLILZIL, i);
        String strValueOf = String.valueOf(liveJourneyLevelInfo2.level);
        boolean z2 = !this.LLIZ.contains(strValueOf);
        final C1888830zFh c1888830zFh = (C1888830zFh) viewHolder;
        if (((ArrayList) this.LLILZIL).size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        final String str = this.LLILZLL;
        if (z) {
            C786410Ut5.LLJJJJ(c1888830zFh.LLILZ, 8);
        } else {
            C786410Ut5.LLJJJJ(c1888830zFh.LLILZ, 0);
            c1888830zFh.LLILZ.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131853270), Arrays.copyOf(new Object[]{Long.valueOf(liveJourneyLevelInfo2.level)}, 1)));
        }
        LiveJourneyRewardInfo liveJourneyRewardInfo2 = liveJourneyLevelInfo2.rewardInfo;
        if (liveJourneyRewardInfo2 != null && (anchorGrowRewardInfo = liveJourneyRewardInfo2.rewardInfo) != null) {
            C1819620xS4.LIZ().setUrl(anchorGrowRewardInfo.icon).LJJI(c1888830zFh.LLILLL);
            C16F5 c16f5 = c1888830zFh.LLILZIL;
            if (C497740JfY.LJJ()) {
                StringBuilder sb = new StringBuilder();
                sb.append(anchorGrowRewardInfo.num);
                sb.append('x');
                string = sb.toString();
            } else {
                string = "x" + anchorGrowRewardInfo.num;
            }
            c16f5.setText(string);
            if (z2) {
                C1886870zCX.LIZIZ(c1888830zFh.LL, liveJourneyLevelInfo2, i, "show");
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV(liveJourneyLevelInfo2, i, str) { // from class: X.0zFi
            public final /* synthetic */ LiveJourneyLevelInfo LLILZIL;
            public final /* synthetic */ int LLILZLL;

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    C1888830zFh c1888830zFh2 = this.LLILZ;
                    if (!c1888830zFh2.LLJ) {
                        c1888830zFh2.LLJ = true;
                        AnchorLiveJourneyReceiveRewardReq anchorLiveJourneyReceiveRewardReq = new AnchorLiveJourneyReceiveRewardReq();
                        anchorLiveJourneyReceiveRewardReq.levelList = C1697810uHb.LJIILJJIL(Long.valueOf(this.LLILZIL.level));
                        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                        C11NZ<R> c11nzLJIILIIL = C01QD.LIZ().LIZLLL().claimJourneyRewards(anchorLiveJourneyReceiveRewardReq).LJIILIIL(new C0UO0());
                        LiveJourneyLevelInfo liveJourneyLevelInfo3 = this.LLILZIL;
                        C1888830zFh c1888830zFh3 = this.LLILZ;
                        c11nzLJIILIIL.LJJLL(new AfS162S0200000_28(liveJourneyLevelInfo3, (MutableLiveData<Integer>) c1888830zFh3, (Function0<Unit>) 16), new AfS197S0100000_28(c1888830zFh3, 75));
                        C1886870zCX.LIZIZ(this.LLILZ.LL, this.LLILZIL, this.LLILZLL, "click_claim");
                        C1888830zFh c1888830zFh4 = this.LLILZ;
                        C1886870zCX.LIZ(c1888830zFh4.LL, "click_others", c1888830zFh4.LLILLJJLI);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, c1888830zFh.LLIZ);
        if (!z2) {
            return;
        }
        this.LLIZ.add(strValueOf);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1888850zFj;
        if (i == this.LLILLL) {
            C1888830zFh c1888830zFh = new C1888830zFh(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h1_, viewGroup, false), this.LL, this.LLILLJJLI);
            C1143680frq.LJI(c1888830zFh.LLILZLL, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", "live_journey_rewards_bg.png"), null, true);
            c1888830zFh.LLILZ.setBackground(C420940Gey.LIZ(C497740JfY.LIZIZ(4.5f), C497740JfY.LIZLLL(R.attr.ezj, c1888830zFh.itemView.getContext())));
            c1888830zFh.LLILZIL.setBackground(C420940Gey.LIZ(C497740JfY.LIZIZ(25.0f), C497740JfY.LIZLLL(R.attr.ezi, c1888830zFh.itemView.getContext())));
            C16FV c16fv = c1888830zFh.LLIZLLLIL;
            int iLIZLLL = C497740JfY.LIZLLL(R.attr.ey_, c1888830zFh.itemView.getContext());
            float fLIZIZ = C497740JfY.LIZIZ(8.0f);
            float fLIZIZ2 = C497740JfY.LIZIZ(8.0f);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fLIZIZ, fLIZIZ, fLIZIZ2, fLIZIZ2}, null, null));
            shapeDrawable.getPaint().setColor(iLIZLLL);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            shapeDrawable.getPaint().setAntiAlias(true);
            c16fv.setBackground(shapeDrawable);
            c1888850zFj = c1888830zFh;
        } else {
            c1888850zFj = new C1888850zFj(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h1a, viewGroup, false));
        }
        try {
            View view = c1888850zFj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1888850zFj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1888850zFj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1888850zFj.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1888850zFj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1888850zFj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1888850zFj.getClass().getName();
        return c1888850zFj;
    }
}
