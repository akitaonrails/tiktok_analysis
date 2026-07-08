package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveCardDeleteGapComponent;
import com.ss.android.ugc.feed.platform.panel.live.INotifyDataSetChangedAbility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C713370RyZ extends C0SR4 {
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // X.C0SR4
    public String LJJJLIIL() {
        return "full_feed";
    }

    @Override // X.C0SR4
    /* JADX INFO: renamed from: LJJLL, reason: merged with bridge method [inline-methods] */
    public C711360RvK LJJLI() {
        return new C711360RvK(new C710940Rue(this));
    }

    @Override // X.C0SR4, androidx.viewpager.widget.PagerAdapter
    public int LJIJJ(Object obj) {
        C0SZ8 c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ((View) obj);
        if (c0sz8LJJLIIIIJ != null && c0sz8LJJLIIIIJ.getAweme() != null) {
            C01GW c01gw = C1594720rbK.LIZ;
            if (C1594720rbK.LIZIZ(c0sz8LJJLIIIIJ.getAweme())) {
                int count = getCount();
                for (int i = 0; i < count; i++) {
                    if (Intrinsics.LJFF(AwemeSaaSExtKt.getUniqueId((Aweme) ListProtector.get(Fg(), i)), AwemeSaaSExtKt.getUniqueId(c0sz8LJJLIIIIJ.getAweme()))) {
                        return i;
                    }
                }
                return -2;
            }
        }
        return super.LJIJJ(obj);
    }

    @Override // X.C0SR4, X.InterfaceC692440REc
    public void setData(List<? extends Aweme> list) {
        super.setData(list);
        ((AbstractC1604130rqV) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIIJJI(new C07WC(list));
    }

    @Override // X.C0SR4
    @InterfaceC1294060jmO
    public final void LJJJJLL(int i, Aweme aweme) {
        InterfaceC665370Q7z interfaceC665370Q7zK0;
        INotifyDataSetChangedAbility iNotifyDataSetChangedAbility;
        super.LJJJJLL(i, aweme);
        int i2 = FeedLiveCardDeleteGapComponent.LLILZLL;
        InterfaceC713360RyY interfaceC713360RyY = this.LLJILJILJ;
        if (interfaceC713360RyY != null && (interfaceC665370Q7zK0 = interfaceC713360RyY.k0()) != null && (iNotifyDataSetChangedAbility = (INotifyDataSetChangedAbility) C1558520qew.LIZ(interfaceC665370Q7zK0, INotifyDataSetChangedAbility.class, null)) != null) {
            iNotifyDataSetChangedAbility.kJ(i, C0OF0.LIZ(aweme));
        }
        ((AbstractC1604130rqV) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIIJJI(new C07WD(i));
    }

    @Override // X.C0SR4
    @InterfaceC1294060jmO
    public final void LJJLIIIJJI(int i, Aweme aweme) {
        super.LJJLIIIJJI(i, aweme);
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJLIIIJLLLLLLLZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[insert] ");
        sbLIZ.append(i);
        abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
    }

    @Override // X.C0SR4
    @InterfaceC1294060jmO
    public final void LJJLIIJ(int i, Aweme aweme) {
        super.LJJLIIJ(i, aweme);
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJLIIIJLLLLLLLZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[replaceAweme] ");
        sbLIZ.append(i);
        abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
    }

    @Override // X.C0SR4, X.AbstractC714000Rza
    public final View LJJJI(int i, View view, ViewGroup viewGroup) {
        C0SZ8 c0sz8LJJLIIIIJ;
        C104100aN.LIZ().LJJIJL(new Runnable() { // from class: X.1AeE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedBindHelper@48ac.onBindStart$1");
                try {
                    if (((Boolean) C2184771Aex.LIZLLL.getValue()).booleanValue() && C2184341AeG.LIZ != 0) {
                        C1BCA.LIZ((C2184901AfA) C2184341AeG.LIZIZ.getValue());
                    }
                    if (((Boolean) C2184781Aey.LIZLLL.getValue()).booleanValue() && C2184341AeG.LIZ == 0) {
                        C1BCA.LIZ((C2184901AfA) C2184341AeG.LIZJ.getValue());
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedBindHelper@48ac.onBindStart$1");
            }
        });
        C0X35.LJIIJJI("feed_ui_duration_start_to_get_view", true);
        C0R53.LIZ.getClass();
        if (C0R53.LIZIZ) {
            int i2 = C0R53.LIZJ;
            if (i2 == 0) {
                C0X35.LIZ("feed_ui_duration_get_first_view", false);
            } else if (i2 == 1) {
                C1150504el.LIZ().LIZLLL("feed_ui_duration_get_second_view", false);
            }
        }
        if (C1E29.LIZIZ(true, true) && (c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ(view)) != null) {
            c0sz8LJJLIIIIJ.k1("FullFeedPagerAdapter", false);
        }
        View viewLJJJI = super.LJJJI(i, view, viewGroup);
        if (C0R53.LIZIZ) {
            int i3 = C0R53.LIZJ;
            if (i3 == 0) {
                C0X35.LJIIJJI("feed_ui_duration_get_first_view", true);
            } else if (i3 == 1) {
                C1150504el.LIZ().LJI("feed_ui_duration_get_second_view", false);
            }
        }
        if (C0R53.LIZIZ) {
            C0X35.LIZ("feed_ui_duration_get_view_tail", true);
        }
        if (C0R53.LIZIZ) {
            C0R53.LIZJ++;
        }
        C104100aN.LIZ().LJJIJL(new Runnable() { // from class: X.1AeF
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedBindHelper@48ac.onBindEnd$1");
                try {
                    if (((Boolean) C2184771Aex.LIZLLL.getValue()).booleanValue() && C2184341AeG.LIZ != 0) {
                        C1BCA.LJJIIZI((C2184901AfA) C2184341AeG.LIZIZ.getValue());
                    }
                    C2184341AeG.LIZ++;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedBindHelper@48ac.onBindEnd$1");
            }
        });
        return viewLJJJI;
    }

    public C713370RyZ(Context context, LayoutInflater layoutInflater, C0HTT<C737030Svd> c0htt, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        super(context, layoutInflater, c0htt, fragment, onTouchListener, baseFeedPageParams, c0r9l);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(EnumC452301pR.NONE, new C713380Rya());
    }
}
