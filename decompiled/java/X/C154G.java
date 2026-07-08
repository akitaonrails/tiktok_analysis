package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.154G, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C154G extends C154L implements InterfaceC204601154d {
    public final C154J LLJJIJI;

    @Override // X.InterfaceC204601154d
    public final void LIZ() {
    }

    @Override // X.InterfaceC204601154d
    public final void LJI(boolean z) {
    }

    @Override // X.InterfaceC204601154d
    public final void LJJLIIIIJ() {
    }

    @Override // X.InterfaceC204601154d
    public final void LIZLLL() {
        List<MusicModel> data;
        C129L c129l;
        if (!this.LLJILJIL) {
            LJJIII();
            return;
        }
        C129L c129l2 = this.LLJI;
        if (c129l2 == null || (data = c129l2.getData()) == null || data.isEmpty() || (c129l = this.LLJI) == null) {
            return;
        }
        c129l.notifyDataSetChanged();
    }

    @Override // X.InterfaceC204601154d
    public final View LJIIIIZZ() {
        return (View) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC204601154d
    public final boolean LJII() {
        return LJIIZILJ();
    }

    @Override // X.C154L
    public final void LJJIIJ() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        IMusicRequestParam iMusicRequestParamLJIILIIL = LJIILIIL();
        if (iMusicRequestParamLJIILIIL != null) {
            int soundPageScene = iMusicRequestParamLJIILIIL.getSoundPageScene();
            AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
            if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154H(this, soundPageScene, null), 3);
        }
    }

    @Override // X.C154L
    public final void LJJIIJZLJL() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        IMusicRequestParam iMusicRequestParamLJIILIIL = LJIILIIL();
        if (iMusicRequestParamLJIILIIL != null) {
            int soundPageScene = iMusicRequestParamLJIILIIL.getSoundPageScene();
            AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
            if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154E(this, soundPageScene, null), 3);
        }
    }

    @Override // X.InterfaceC204601154d
    public final C129G LJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC204601154d
    public final boolean LIZIZ(String str) {
        return LJIILLIIL(str);
    }

    @Override // X.InterfaceC204601154d
    public final void LIZJ(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        LJJII(musicModel, collectionType, z);
    }

    public C154G(C1DRG c1drg, Context context, MusicThemeTag musicThemeTag, C154J c154j) {
        super(c1drg, context, musicThemeTag, c154j);
        this.LLJJIJI = c154j;
    }
}
