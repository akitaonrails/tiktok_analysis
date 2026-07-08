package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget;

/* JADX INFO: renamed from: X.15H6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15H6 implements C15HG {
    public final /* synthetic */ MusicClassWidget LIZ;

    @Override // X.C15HG
    public final C20491215Gc LIZIZ() {
        return null;
    }

    public C15H6(MusicClassWidget musicClassWidget) {
        this.LIZ = musicClassWidget;
    }

    @Override // X.C15HG
    public final void LIZ(C15HO c15ho, String str) {
        MusicClassWidget musicClassWidget = this.LIZ;
        Fragment fragment = musicClassWidget.LLJJIJI;
        if (fragment == null) {
            return;
        }
        c15ho.LJIILIIL = musicClassWidget.LLJJI;
        c15ho.LJIILLIIL = "song_selection_page";
        if (fragment.getUserVisibleHint()) {
            C15HG c15hg = this.LIZ.LLJJIII;
            if (c15hg != null) {
                c15hg.LIZ(c15ho, str);
                return;
            }
            return;
        }
        this.LIZ.LLJJIJIIJIL.add(c15ho);
    }
}
