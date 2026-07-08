package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xoK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833420xoK implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final LiveReplySettingViewModel LIZJ;
    public final C1833560xoY LIZLLL;
    public Boolean LJ;
    public C19292910dr LJFF;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        C19319810iC c19319810iCLIZIZ;
        C19292910dr c19292910dr = this.LJFF;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(448));
        }
        C19292910dr c19292910dr2 = this.LJFF;
        if (c19292910dr2 == null || (c19319810iCLIZIZ = c19292910dr2.LIZIZ()) == null || !(!c19319810iCLIZIZ.LLJJIJIL)) {
            return;
        }
        C19292910dr c19292910dr3 = this.LJFF;
        if (c19292910dr3 != null) {
            c19292910dr3.LJI(AFwS269S0000000_27.get$arr$(449));
        }
        LiveReplySettingViewModel liveReplySettingViewModel = this.LIZJ;
        Boolean bool = Boolean.TRUE;
        C23250099c.LIZLLL(liveReplySettingViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C1813630xIP(liveReplySettingViewModel, C500260Jjc.LJJJI(bool) ? 1 : 0, null), 2);
        this.LJ = bool;
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr = this.LJFF;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(450));
        }
    }

    public C1833420xoK(Context context, LifecycleOwner lifecycleOwner, LiveReplySettingViewModel liveReplySettingViewModel, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = liveReplySettingViewModel;
        this.LIZLLL = c1833560xoY;
    }
}
