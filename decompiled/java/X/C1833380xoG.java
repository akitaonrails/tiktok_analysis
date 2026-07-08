package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;

/* JADX INFO: renamed from: X.0xoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833380xoG implements InterfaceC1833530xoV {
    public final Context LIZ;
    public final C19318810i2 LIZIZ;
    public Boolean LIZJ;
    public final C19319110i5 LIZLLL;
    public final ViewGroup LJ;
    public final LifecycleOwner LJFF;
    public final LiveReplySettingViewModel LJI;
    public final C1833560xoY LJII;
    public C19292910dr LJIIIIZZ;
    public C1238760iLC LJIIIZ;
    public View LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;

    @Override // X.InterfaceC1833530xoV
    public final void LIZ() {
        this.LJIIJJI = true;
        if (this.LJIILL != 0) {
            C19292910dr c19292910dr = this.LJIIIIZZ;
            if (c19292910dr != null) {
                c19292910dr.LJI(AFwS269S0000000_27.get$arr$(432));
            }
            if (this.LJIILL == 1 || this.LJIIL) {
                return;
            }
            this.LJIIL = true;
            this.LJI.vQ2(true);
        }
    }

    @Override // X.InterfaceC1833530xoV
    public final void LIZIZ() {
        C19292910dr c19292910dr;
        this.LJIIJJI = true;
        this.LJIIL = true;
        if (this.LJIILL == 0 || (c19292910dr = this.LJIIIIZZ) == null) {
            return;
        }
        c19292910dr.LJI(AFwS269S0000000_27.get$arr$(433));
    }

    public final C443090HZb LIZJ(EnumC1813530xIF enumC1813530xIF, EnumC1813530xIF enumC1813530xIF2) {
        int i;
        String label = enumC1813530xIF2.getLabel();
        if (enumC1813530xIF == enumC1813530xIF2) {
            i = R.raw.icon_tick_fill_small;
        } else {
            i = 0;
        }
        return new C443090HZb(label, new AwS428S0200000_27(enumC1813530xIF2, this, 95), 0, null, i, null, 0, false, false, null, 1004);
    }

    public C1833380xoG(Context context, C19318810i2 c19318810i2, Boolean bool, C19319110i5 c19319110i5, ViewGroup viewGroup, LifecycleOwner lifecycleOwner, LiveReplySettingViewModel liveReplySettingViewModel, C1833560xoY c1833560xoY) {
        this.LIZ = context;
        this.LIZIZ = c19318810i2;
        this.LIZJ = bool;
        this.LIZLLL = c19319110i5;
        this.LJ = viewGroup;
        this.LJFF = lifecycleOwner;
        this.LJI = liveReplySettingViewModel;
        this.LJII = c1833560xoY;
    }
}
