package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupAssem;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupObserver;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0mIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390810mIR implements InterfaceC1916390zy9 {
    public final /* synthetic */ StemFeedPopupAssem LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    public final void LIZLLL() {
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI2;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
        if (c19egLIZ == null || (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) == null || (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("StemPopupSheet")) == null || (childFragmentManager = fragmentLJJJJZI.getChildFragmentManager()) == null || (fragmentLJJJJZI2 = childFragmentManager.LJJJJZI("sheet_content_fragment")) == null) {
            return;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(fragmentLJJJJZI2, C343980De8.LIZ);
    }

    public final void LJ() {
        ((Keva) this.LIZ.LLJI.getValue()).storeBoolean("popup_with_caption", true);
    }

    @Override // X.InterfaceC1916390zy9
    public final void LIZJ() {
        LIZLLL();
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
        if (c19egLIZ != null) {
            StemFeedPopupAssem stemFeedPopupAssem = this.LIZ;
            Aweme aweme = this.LIZIZ;
            stemFeedPopupAssem.getClass();
            if (EventBus.LIZLLL().LJII(C715480S4s.class)) {
                C0RT2.LIZ().LJIIL(aweme != null ? aweme.getAid() : null, "homepage_topic_stem", EnumC1390800mIQ.STEM_POPUP, c19egLIZ);
            } else {
                C0RT2.LIZ().LIZIZ(c19egLIZ, aweme, "homepage_topic_stem", EnumC1390800mIQ.STEM_POPUP);
            }
        }
    }

    @Override // X.InterfaceC1916390zy9
    public final void LIZ() {
        LIZLLL();
    }

    @Override // X.InterfaceC1916390zy9
    public final void LIZIZ(boolean z) {
        int i;
        C746760TRa.LIZ().LJJJZ(EnumC1390800mIQ.STEM_POPUP.getValue(), z);
        C746760TRa.LIZ().LJJJI(z);
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
        if (c19egLIZ != null) {
            if (z) {
                i = 2131828782;
            } else {
                i = 2131828781;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
        StemFeedPopupObserver stemFeedPopupObserver = (StemFeedPopupObserver) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), StemFeedPopupObserver.class, null);
        if (stemFeedPopupObserver != null) {
            stemFeedPopupObserver.j81();
        }
    }

    public C1390810mIR(StemFeedPopupAssem stemFeedPopupAssem, Aweme aweme) {
        this.LIZ = stemFeedPopupAssem;
        this.LIZIZ = aweme;
    }
}
