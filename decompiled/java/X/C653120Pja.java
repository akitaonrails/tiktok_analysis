package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653120Pja<T> implements InterfaceC650320Pf4<C737030Svd> {
    public final RecyclerView LIZ;
    public final Map<String, Pair<Integer, Aweme>> LIZIZ = new LinkedHashMap();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(456));

    @Override // X.InterfaceC650320Pf4
    public final Class<C737030Svd> LIZ() {
        return C737030Svd.class;
    }

    public C653120Pja(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        C650300Pf2.LIZLLL.LIZ(this);
    }

    @Override // X.InterfaceC650320Pf4
    public final void LIZIZ(C737030Svd c737030Svd) {
        C661470Px3 c661470Px3;
        C652990PjN mScrollStateManager;
        Integer numValueOf;
        C737030Svd c737030Svd2 = c737030Svd;
        if (c737030Svd2.LIZ == 13) {
            IAwemeService iAwemeService = (IAwemeService) this.LIZJ.getValue();
            String str = (String) c737030Svd2.LIZIZ;
            if (str == null) {
                str = "";
            }
            Aweme awemeLLILZ = iAwemeService.LLILZ(str);
            Iterator<T> it2 = ((LinkedHashMap) this.LIZIZ).entrySet().iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) ((Pair) ((Map.Entry) it2.next()).getValue()).getSecond();
                if (Intrinsics.LJFF(aweme.getAid(), c737030Svd2.LIZIZ)) {
                    Bundle bundle = c737030Svd2.LIZJ;
                    if (bundle != null && (numValueOf = Integer.valueOf(bundle.getInt("user_digged"))) != null) {
                        aweme.setUserDigg(numValueOf.intValue());
                    }
                    if (awemeLLILZ != null) {
                        aweme.setUserDigg(awemeLLILZ.getUserDigg());
                        AwemeStatistics statistics = awemeLLILZ.getStatistics();
                        if (statistics != null) {
                            aweme.getStatistics().setDiggCount(statistics.getDiggCount());
                        }
                    }
                }
            }
            Pair pair = (Pair) ((LinkedHashMap) this.LIZIZ).get(c737030Svd2.LIZIZ);
            if (pair != null) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LIZ.findViewHolderForAdapterPosition(((Number) pair.getFirst()).intValue());
                if (viewHolderFindViewHolderForAdapterPosition != null && (viewHolderFindViewHolderForAdapterPosition instanceof ViewOnAttachStateChangeListenerC656430Pov) && (c661470Px3 = ((ViewOnAttachStateChangeListenerC656430Pov) viewHolderFindViewHolderForAdapterPosition).LLJILJIL) != null && (mScrollStateManager = c661470Px3.getMScrollStateManager()) != null) {
                    mScrollStateManager.LJ(c661470Px3.getMScrollStateObserver());
                }
                AbstractC21673619ry adapter = this.LIZ.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(((Number) pair.getFirst()).intValue());
                }
            }
        }
    }
}
