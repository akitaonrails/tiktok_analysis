package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.aweme.service.MiniDramaPaymentService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ruf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1606710ruf implements InterfaceC1615720s9C, InterfaceC1614350s6z {
    public final AbstractC738140SxQ LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1460));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1906));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1905));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(816));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(692));
    public C11NJ LLIZ;
    public View LLIZLLLIL;
    public final WeakReference<AbstractC738140SxQ> LLJ;

    @Override // X.InterfaceC1615720s9C
    public void LJFF() {
    }

    public abstract void LJIIIZ(boolean z);

    @Override // X.InterfaceC1615720s9C
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC1614350s6z
    public final void jI1(boolean z) {
    }

    @Override // X.InterfaceC1615720s9C
    public final void onBind(Aweme aweme) {
    }

    @Override // X.InterfaceC1615720s9C
    public final void LIZ() {
        MiniDramaPaymentService miniDramaPaymentService;
        if (this.LLIZ == null || (miniDramaPaymentService = (MiniDramaPaymentService) this.LLILZIL.getValue()) == null) {
            return;
        }
        miniDramaPaymentService.LJIIJ(this);
    }

    public final Aweme LJII() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            return iViewPagerComponentAbility.LJIIIIZZ();
        }
        return null;
    }

    public final IPaidContentPanelAbility LJIIIIZZ() {
        return (IPaidContentPanelAbility) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1615720s9C
    public final void LJJIIJ() {
        C11NJ c11nj = this.LLIZ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        LJFF();
        this.LLIZLLLIL = null;
        MiniDramaPaymentService miniDramaPaymentService = (MiniDramaPaymentService) this.LLILZIL.getValue();
        if (miniDramaPaymentService != null) {
            miniDramaPaymentService.LIZ(this);
        }
    }

    public final boolean LJ() {
        PaidContentInfo paidContentInfo;
        Aweme awemeLJII = LJII();
        return (awemeLJII == null || (paidContentInfo = awemeLJII.mPaidContentInfo) == null || !paidContentInfo.getEnableSingleVideoPurchase()) ? false : true;
    }

    public AbstractC1606710ruf(BaseCellSlotComponent baseCellSlotComponent) {
        this.LL = baseCellSlotComponent;
        this.LLJ = new WeakReference<>(this.LL);
    }

    @Override // X.InterfaceC1615720s9C
    public final void LIZJ(C11NJ c11nj) {
        this.LLIZ = c11nj;
    }

    @Override // X.InterfaceC1615720s9C
    public void onViewCreated(View view) {
        this.LLIZLLLIL = view;
    }

    @Override // X.InterfaceC1614350s6z
    public final void sX0(AbstractC1159090gGh abstractC1159090gGh) {
        long paidCollectionId;
        C19EG c19egLIZ;
        int iHashCode;
        PaidContentInfo paidContentInfo;
        Aweme awemeLJII = LJII();
        if (awemeLJII != null && (paidContentInfo = awemeLJII.mPaidContentInfo) != null) {
            paidCollectionId = paidContentInfo.getPaidCollectionId();
        } else {
            paidCollectionId = 0;
        }
        if (abstractC1159090gGh.LIZ() == paidCollectionId) {
            String str = SeriesInnerFeedActivity._pnsPageId;
            AbstractC738140SxQ abstractC738140SxQ = this.LLJ.get();
            if (abstractC738140SxQ != null) {
                c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            } else {
                c19egLIZ = null;
            }
            int i = SeriesInnerFeedActivity.LLJ;
            if (c19egLIZ != null) {
                iHashCode = c19egLIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            if (i == iHashCode) {
                if (abstractC1159090gGh instanceof C1159110gGj) {
                    LJIIIZ(true);
                    return;
                }
                if ((abstractC1159090gGh instanceof C1159150gGn) || (abstractC1159090gGh instanceof C1159100gGi) || (abstractC1159090gGh instanceof C1159140gGm)) {
                    return;
                }
                if (abstractC1159090gGh instanceof C1159130gGl) {
                    LJIIIZ(false);
                } else {
                    if (abstractC1159090gGh instanceof C1159260gGy) {
                        return;
                    }
                    if (abstractC1159090gGh instanceof C1159120gGk) {
                        LJIIIZ(false);
                        return;
                    }
                    throw new C1954807lC();
                }
            }
        }
    }

    public final String LJI(Boolean bool, Long l) {
        PaidContentInfo paidContentInfo;
        String collectionName = null;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            ICommerceFeedSeriesService iCommerceFeedSeriesService = (ICommerceFeedSeriesService) this.LLILLJJLI.getValue();
            try {
                collectionName = String.valueOf(l);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            return iCommerceFeedSeriesService.Op2(collectionName);
        }
        Aweme awemeLJII = LJII();
        if (awemeLJII != null && (paidContentInfo = awemeLJII.mPaidContentInfo) != null) {
            collectionName = paidContentInfo.getCollectionName();
        }
        if (collectionName == null) {
            return "";
        }
        return collectionName;
    }
}
