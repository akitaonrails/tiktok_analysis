package X;

import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.15HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HJ extends MusicShowOverChecker implements Runnable {
    public final C15HX LLJI;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        Integer num = this.LLILZ;
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = (ViewPager2MusicBoardWidget) this.LLJI;
        C15H8 c15h8 = viewPager2MusicBoardWidget.LLIZLLLIL;
        if (c15h8 == null) {
            return false;
        }
        View view = c15h8.itemView;
        boolean z = view.getVisibility() == 0;
        int iMax = Math.max(viewPager2MusicBoardWidget.LLJILJIL * 3, 0);
        return iIntValue >= iMax && iIntValue < Math.min(iMax + 3, viewPager2MusicBoardWidget.LLJJIJIIJIL.size()) && z && view.getGlobalVisibleRect(viewPager2MusicBoardWidget.LLJJLIIIJLLLLLLLZ) && viewPager2MusicBoardWidget.LLJJLIIIJLLLLLLLZ.intersect(viewPager2MusicBoardWidget.LLJL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MusicShowOverCheckerForItemVisibleContainer@e385.run");
        try {
            if (!this.LLIZ) {
                LJ();
                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicShowOverCheckerForItemVisibleContainer@e385.run");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        run();
    }

    public C15HJ(C15HX c15hx, MusicModel musicModel, int i, C15HO c15ho) {
        super(musicModel.getId(), musicModel.getName(), musicModel.getRecommendTag(), Integer.valueOf(i), c15ho, 16);
        this.LLJI = c15hx;
    }
}
