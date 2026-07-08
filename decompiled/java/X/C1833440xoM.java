package X;

import android.content.Context;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0xoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833440xoM implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final LiveReplySettingViewModel LIZIZ;
    public final C1833560xoY LIZJ;
    public Boolean LIZLLL;
    public C19292910dr LJ;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        C19319810iC c19319810iCLIZIZ;
        C19319810iC c19319810iCLIZIZ2;
        C19292910dr c19292910dr = this.LJ;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(419));
        }
        C19292910dr c19292910dr2 = this.LJ;
        if (c19292910dr2 == null || (c19319810iCLIZIZ = c19292910dr2.LIZIZ()) == null) {
            return;
        }
        if (!c19319810iCLIZIZ.LLJJJJ || c19319810iCLIZIZ.LLJJIJIL) {
            return;
        }
        C19292910dr c19292910dr3 = this.LJ;
        if (c19292910dr3 != null) {
            c19292910dr3.LJI(AFwS269S0000000_27.get$arr$(420));
        }
        C19292910dr c19292910dr4 = this.LJ;
        if (c19292910dr4 == null || (c19319810iCLIZIZ2 = c19292910dr4.LIZIZ()) == null) {
            return;
        }
        this.LIZIZ.wQ2(3, c19319810iCLIZIZ2.LLJJIJIL ? 2 : 1);
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr = this.LJ;
        if (c19292910dr != null) {
            c19292910dr.LJI(AFwS269S0000000_27.get$arr$(421));
        }
    }

    public C1833440xoM(Context context, LiveReplySettingViewModel liveReplySettingViewModel, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = liveReplySettingViewModel;
        this.LIZJ = c1833560xoY;
    }
}
