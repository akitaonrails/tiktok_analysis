package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.component.ctacomponent.AnolFeedCtaButtonData;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017810cap implements InterfaceC1004990cG9 {
    public final C1004960cG6 LIZ;
    public final InterfaceC1017820caq LIZIZ;
    public final TuxTextView LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final AwS595S0100000_16 LJI;

    @Override // X.InterfaceC1004990cG9
    public final boolean LIZ() {
        String str;
        String packageName = this.LIZ.LLILLJJLI.LIZLLL.getPackageName();
        if (packageName == null) {
            return false;
        }
        switch (C1017990cb7.LIZ[this.LIZIZ.LJIIZILJ(packageName).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                String str2 = C2162308dZ.LJFF(this.LIZ.LLILZ, packageName) ? "cip_open" : "cip_download";
                C1D2P c1d2pLJIIIIZZ = this.LIZIZ.LJIIIIZZ(this.LIZ.LLILLJJLI.LIZLLL);
                AnoleLogInfo logInfo = this.LIZ.LL.getLogInfo();
                str = logInfo != null ? logInfo.tag : null;
                AnoleComponentModel anoleComponentModel = this.LIZ.LL;
                c1d2pLJIIIIZZ.LJJIIZI(Long.valueOf(anoleComponentModel.getID()), str, anoleComponentModel.type, str2);
                return false;
            case 5:
            case 6:
                this.LIZIZ.LJJL(packageName);
                C1D2P c1d2pLJIIIIZZ2 = this.LIZIZ.LJIIIIZZ(this.LIZ.LLILLJJLI.LIZLLL);
                AnoleLogInfo logInfo2 = this.LIZ.LL.getLogInfo();
                str = logInfo2 != null ? logInfo2.tag : null;
                AnoleComponentModel anoleComponentModel2 = this.LIZ.LL;
                c1d2pLJIIIIZZ2.LJJIIZI(Long.valueOf(anoleComponentModel2.getID()), str, anoleComponentModel2.type, "cip_cancel");
                return true;
            case 7:
                return true;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1004990cG9
    public final void LIZIZ() {
        String packageName = this.LIZ.LLILLJJLI.LIZLLL.getPackageName();
        if (packageName == null) {
            return;
        }
        this.LIZIZ.preloadService();
        this.LIZIZ.LJIIJ(packageName, this.LJI);
    }

    @Override // X.InterfaceC1004990cG9
    public final boolean LIZLLL() {
        String packageName = this.LIZ.LLILLJJLI.LIZLLL.getPackageName();
        if (packageName == null) {
            return false;
        }
        EnumC1017980cb6 enumC1017980cb6LJIIZILJ = this.LIZIZ.LJIIZILJ(packageName);
        return enumC1017980cb6LJIIZILJ == EnumC1017980cb6.DOWNLOAD_WAITING || enumC1017980cb6LJIIZILJ == EnumC1017980cb6.DOWNLOAD_STARTED || enumC1017980cb6LJIIZILJ == EnumC1017980cb6.INSTALL_STARTED;
    }

    @Override // X.InterfaceC1004990cG9
    public final void LJ() {
        this.LIZIZ.LJIILLIIL(this.LJI);
    }

    public final void LIZJ(boolean z) {
        AnolFeedCtaButtonData ctaButtonData;
        int i = 0;
        if (z) {
            View view = this.LIZLLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LJFF;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            View view3 = this.LJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
                return;
            }
            return;
        }
        View view4 = this.LIZLLL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LJFF;
        if (view5 != null) {
            AnoleFeedCTAData anoleFeedCTADataLJJIIJ = this.LIZ.LJJIIJ();
            if (anoleFeedCTADataLJJIIJ == null || (ctaButtonData = anoleFeedCTADataLJJIIJ.getCtaButtonData()) == null || !Intrinsics.LJFF(ctaButtonData.haveArrow, Boolean.TRUE)) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view5);
        }
        View view6 = this.LJ;
        if (view6 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view6);
    }

    public C1017810cap(C1004960cG6 c1004960cG6, InterfaceC1017820caq interfaceC1017820caq) {
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        this.LIZ = c1004960cG6;
        this.LIZIZ = interfaceC1017820caq;
        View view = c1004960cG6.LLJJIJIL;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.b53);
        } else {
            tuxTextView = null;
        }
        this.LIZJ = tuxTextView;
        View view2 = c1004960cG6.LLJJIJIL;
        if (view2 != null) {
            viewFindViewById = view2.findViewById(R.id.b52);
        } else {
            viewFindViewById = null;
        }
        this.LIZLLL = viewFindViewById;
        View view3 = c1004960cG6.LLJJIJIL;
        if (view3 != null) {
            viewFindViewById2 = view3.findViewById(R.id.faj);
        } else {
            viewFindViewById2 = null;
        }
        this.LJ = viewFindViewById2;
        View view4 = c1004960cG6.LLJJIJIL;
        this.LJFF = view4 != null ? view4.findViewById(R.id.b4v) : null;
        this.LJI = new AwS595S0100000_16(this, 386);
    }
}
