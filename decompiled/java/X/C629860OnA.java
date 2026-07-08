package X;

import Y.ACListenerS144S0100000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629860OnA implements InterfaceC629870OnB {
    public TuxIconView LIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZIZ;

    public C629860OnA(MusicDetailNavBarAssem musicDetailNavBarAssem) {
        this.LIZIZ = musicDetailNavBarAssem;
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZ(TuxNavBar tuxNavBar) {
        if (C724240Sb0.LJI(this.LIZIZ) == null) {
            return;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZIZ = "collect_music";
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_bookmark;
        c1251150ifB.LIZLLL = true;
        tuxNavBar.LIZ(c1251150ifB);
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZIZ(TuxNavBar tuxNavBar) {
        TuxIconView tuxIconView;
        FavoriteAbility favoriteAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LIZIZ);
        if (fragmentLJI == null) {
            return;
        }
        View viewLJII = tuxNavBar.LJII("collect_music");
        if (viewLJII instanceof TuxIconView) {
            tuxIconView = (TuxIconView) viewLJII;
        } else {
            tuxIconView = null;
        }
        this.LIZ = tuxIconView;
        if (tuxIconView != null && (favoriteAbility = (FavoriteAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), FavoriteAbility.class, null)) != null) {
            favoriteAbility.H30(new AwS588S0100000_9(this, 314));
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(favoriteAbility, 77));
        }
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZJ(int i) {
        int i2;
        TuxIconView tuxIconView = this.LIZ;
        if (tuxIconView != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160));
            musicDetailNavBarAssem.getClass();
            C786410Ut5.x5(tuxIconView, MusicDetailNavBarAssem.mp(iLIZIZ, iLIZIZ2, i));
        }
        TuxIconView tuxIconView2 = this.LIZ;
        if (tuxIconView2 != null) {
            if (Intrinsics.LIZLLL(Float.valueOf(tuxIconView2.getAlpha()), 0.0f)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
        }
    }
}
