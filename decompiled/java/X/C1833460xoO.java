package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightIntroDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833460xoO implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final View LIZIZ;
    public final FragmentManager LIZJ;
    public final LiveReplySettingViewModel LIZLLL;
    public final C1833560xoY LJ;
    public C19292910dr LJFF;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        C19319810iC c19319810iCLIZIZ;
        C19319810iC c19319810iCLIZIZ2;
        C19292910dr c19292910dr = this.LJFF;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(428));
        }
        C19292910dr c19292910dr2 = this.LJFF;
        if (c19292910dr2 == null || (c19319810iCLIZIZ = c19292910dr2.LIZIZ()) == null) {
            return;
        }
        if (!c19319810iCLIZIZ.LLJJIJIL) {
            C19292910dr c19292910dr3 = this.LJFF;
            if (c19292910dr3 != null) {
                c19292910dr3.LJI(AFwS269S0000000_27.get$arr$(429));
            }
            C19292910dr c19292910dr4 = this.LJFF;
            if (c19292910dr4 == null || (c19319810iCLIZIZ2 = c19292910dr4.LIZIZ()) == null) {
                return;
            }
            this.LIZLLL.wQ2(2, c19319810iCLIZIZ2.LLJJIJIL ? 2 : 1);
        }
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr = this.LJFF;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(430));
        }
    }

    public final void LIZJ() {
        ViewerHighLightIntroDialogFragment viewerHighLightIntroDialogFragment = new ViewerHighLightIntroDialogFragment("setting_page");
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = viewerHighLightIntroDialogFragment;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC1864700ycm(viewerHighLightIntroDialogFragment, 6);
        tuxSheet2.show(this.LIZJ, "user_highlight_faq");
    }

    public C1833460xoO(Context context, View view, FragmentManager fragmentManager, LiveReplySettingViewModel liveReplySettingViewModel, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = fragmentManager;
        this.LIZLLL = liveReplySettingViewModel;
        this.LJ = c1833560xoY;
    }
}
