package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Card;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShopPromotionData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0vg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751440vg6 extends AbstractC21673619ry<AbstractC1751430vg5> {
    public final ECBaseFragment LL;
    public final SeaPdpViewModel LLILLJJLI;
    public List<Feed> LLILLL = new ArrayList();
    public String LLILZ = "";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Integer num;
        PDPShopPromotionData pDPShopPromotionData;
        Feed feed = null;
        if (getItemCount() >= 1) {
            feed = (Feed) ListProtector.get(this.LLILLL, i % getItemCount());
        }
        if (feed == null || (num = feed.feedType) == null || num.intValue() != 4) {
            return 0;
        }
        Card card = feed.card;
        if (card != null && (pDPShopPromotionData = card.pdpShopPromotionData) != null && pDPShopPromotionData.voucher != null) {
            return 16;
        }
        return 14;
    }

    public C1751440vg6(SeaPdpViewModel seaPdpViewModel, ECBaseFragment eCBaseFragment) {
        this.LL = eCBaseFragment;
        this.LLILLJJLI = seaPdpViewModel;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1751430vg5 abstractC1751430vg5 = (AbstractC1751430vg5) viewHolder;
        if (getItemCount() >= 1) {
            Feed feed = (Feed) ListProtector.get(this.LLILLL, i % getItemCount());
            if (feed != null) {
                abstractC1751430vg5.I5(feed, i);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1751420vg4;
        if (i != 14) {
            if (i != 16) {
                c1751420vg4 = new C1752390vhd(viewGroup, this.LLILLJJLI, this.LLILZ, this.LL);
            } else {
                c1751420vg4 = new C1751470vg9(viewGroup, this.LLILLJJLI);
            }
        } else {
            c1751420vg4 = new C1751420vg4(viewGroup, this.LLILLJJLI);
        }
        try {
            View view = c1751420vg4.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1751420vg4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1751420vg4.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1751420vg4.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1751420vg4.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1751420vg4.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1751420vg4.getClass().getName();
        return c1751420vg4;
    }
}
