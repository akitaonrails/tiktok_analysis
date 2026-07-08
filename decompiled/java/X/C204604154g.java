package X;

import Y.AObjectS248S0100000_31;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.154g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204604154g extends C204611154n {
    public final Context LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1534));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1535));

    public final C204599154b LJII() {
        return (C204599154b) this.LJI.getValue();
    }

    @Override // X.InterfaceC204626155c
    public final AbstractC21673619ry<?> LJJLIIIJL() {
        InterfaceC204601154d interfaceC204601154d = LJII().LLJ;
        if (interfaceC204601154d != null) {
            return interfaceC204601154d.LJ();
        }
        return null;
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZL() {
        C560530Lyd<Unit> c560530Lyd;
        C204599154b c204599154bLJII = LJII();
        if (c204599154bLJII.LLJJI) {
            c204599154bLJII.LLJJI = false;
            InterfaceC1652770t6x interfaceC1652770t6x = (InterfaceC1652770t6x) c204599154bLJII.LLJJIJIL.getValue(c204599154bLJII, C204599154b.LLJJJJLIIL[5]);
            if (interfaceC1652770t6x != null) {
                interfaceC1652770t6x.Lt0().LIZIZ((AObjectS248S0100000_31) c204599154bLJII.LLJJJIL.getValue());
                interfaceC1652770t6x.dk1().LIZIZ((AObjectS248S0100000_31) c204599154bLJII.LLJJJJ.getValue());
            }
            AbstractC204621154x abstractC204621154xLIZJ = c204599154bLJII.LIZJ();
            if (abstractC204621154xLIZJ == null || (c560530Lyd = abstractC204621154xLIZJ.LL) == null) {
                return;
            }
            c560530Lyd.LIZIZ((AObjectS248S0100000_31) c204599154bLJII.LLJJJJJIL.getValue());
        }
    }

    @Override // X.InterfaceC204626155c
    public final View getView() {
        return (View) LJII().LLILZ.getValue();
    }

    public C204604154g(C1361400lX0 c1361400lX0) {
        this.LJ = c1361400lX0;
    }

    @Override // X.InterfaceC204626155c
    public final void LLZILL(boolean z) {
        boolean z2;
        Fragment fragmentLIZLLL;
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        LIZJ().LIZ.LIZJ = false;
        LIZJ().LJIILIIL.LIZLLL(EnumC1654750tA9.TAB_COLLECT.getStringValue(), z, LJ());
        C204599154b c204599154bLJII = LJII();
        boolean zLJIJI = LJI().LJIJI();
        InterfaceC204601154d interfaceC204601154d = c204599154bLJII.LLJ;
        if (interfaceC204601154d != null && interfaceC204601154d.LJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c204599154bLJII.LLJILLL.LJFF && C20440014yU.LJIIJ.LIZ != null && !z2) {
            if (zLJIJI) {
                AbstractC204621154x abstractC204621154xLIZJ = c204599154bLJII.LIZJ();
                if (abstractC204621154xLIZJ != null) {
                    abstractC204621154xLIZJ.LJJJI();
                }
                c204599154bLJII.LJ(true);
            }
            InterfaceC204601154d interfaceC204601154d2 = c204599154bLJII.LLJ;
            if (interfaceC204601154d2 != null) {
                interfaceC204601154d2.LIZLLL();
            }
        } else {
            AbstractC204621154x abstractC204621154xLIZJ2 = c204599154bLJII.LIZJ();
            if (abstractC204621154xLIZJ2 != null) {
                abstractC204621154xLIZJ2.LJJJI();
            }
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL();
                } else {
                    fragmentLIZLLL = null;
                }
                C0XPD.LIZJ(fragmentLIZLLL, "video_edit_page", "edit_xpage_recommend_favourite", null, new C20749416Hk(c204599154bLJII, 0));
            } else {
                C20440014yU.LJIIJ.LIZ = new C204603154f(c204599154bLJII);
                c204599154bLJII.LLJILLL.LJI = null;
                c204599154bLJII.LJ(false);
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isInOnThisDayPreviewPage()) {
            onThisDayData.setMusicSelectedFromV2("on_this_day_page_recommend_favourite");
        }
        LJI().LJJIII();
        LJI().LJJIFFI();
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZLI(MusicModel musicModel, MusicModel.CollectionType collectionType) {
        boolean z;
        C204599154b c204599154bLJII = LJII();
        if (LJI().LJIILL() == EnumC1654750tA9.TAB_COLLECT) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC204601154d interfaceC204601154d = c204599154bLJII.LLJ;
        if (interfaceC204601154d != null) {
            interfaceC204601154d.LIZJ(musicModel, collectionType, z);
        }
    }
}
