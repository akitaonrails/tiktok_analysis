package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833410xoJ implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final C19319110i5 LIZJ;
    public final LiveReplySettingViewModel LIZLLL;
    public final C1833560xoY LJ;
    public String LJFF;
    public C19292910dr LJI;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        C19319810iC c19319810iCLIZIZ;
        C19292910dr c19292910dr = this.LJI;
        if (c19292910dr != null && (c19319810iCLIZIZ = c19292910dr.LIZIZ()) != null && !c19319810iCLIZIZ.LLJJIJIL && c19319810iCLIZIZ.LLJLL && 1 != 0) {
            LiveReplySettingViewModel liveReplySettingViewModel = this.LIZLLL;
            liveReplySettingViewModel.getClass();
            liveReplySettingViewModel.setState(AFwS269S0000000_27.get$arr$(462));
            C23250099c.LIZLLL(liveReplySettingViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C1813640xIQ(liveReplySettingViewModel, 1, null), 2);
        }
        C19292910dr c19292910dr2 = this.LJI;
        if (c19292910dr2 != null) {
            c19292910dr2.LJI(AFwS269S0000000_27.get$arr$(440));
        }
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr = this.LJI;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(441));
        }
    }

    public C1833410xoJ(Context context, LifecycleOwner lifecycleOwner, C19319110i5 c19319110i5, LiveReplySettingViewModel liveReplySettingViewModel, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c19319110i5;
        this.LIZLLL = liveReplySettingViewModel;
        this.LJ = c1833560xoY;
    }
}
