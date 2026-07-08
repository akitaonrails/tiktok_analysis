package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15HK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HK extends MusicShowOverChecker implements Runnable {
    public final View LLJI;
    public final Rect LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        if (this.LLJI.getVisibility() != 0 || !this.LLJI.getGlobalVisibleRect((Rect) this.LLJILJIL.getValue()) || ((Rect) this.LLJILJIL.getValue()).isEmpty() || !((Rect) this.LLJILJILJ.getValue()).setIntersect(this.LLJIJIL, (Rect) this.LLJILJIL.getValue())) {
            return false;
        }
        Rect rect = (Rect) this.LLJILJILJ.getValue();
        int iWidth = rect.width() * rect.height();
        Rect rect2 = (Rect) this.LLJILJIL.getValue();
        return iWidth > (rect2.width() * rect2.height()) / 2;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        HandlerHook.viewPost(this.LLJI, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MusicShowOverCheckerForSingleView@ad9f.run");
        try {
            if (!this.LLIZ) {
                LJ();
                HandlerHook.viewPostDelay(this.LLJI, this, 200L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicShowOverCheckerForSingleView@ad9f.run");
    }

    public C15HK(View view, MusicModel musicModel, Integer num) {
        Rect rect;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            View decorView = c19egLIZIZ.getWindow().getDecorView();
            rect = new Rect(decorView.getLeft(), decorView.getTop(), decorView.getWidth(), decorView.getHeight());
        } else {
            rect = new Rect(0, 0, C418440Gaw.LIZLLL(view.getContext()), C418440Gaw.LIZJ(view.getContext()));
        }
        super(musicModel.getId(), musicModel.getName(), musicModel.getRecommendTag(), num, (C15HO) null, 48);
        this.LLJI = view;
        this.LLJIJIL = rect;
        this.LLJILJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(34));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(33));
    }
}
