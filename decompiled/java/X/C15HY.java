package X;

import Y.ARunnableS131S0100000_31;
import Y.AsS56S0100000_31;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.15HY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HY extends MusicShowOverChecker {
    public final RecyclerView LLJI;
    public final LinearLayoutManager LLJIJIL;
    public final AsS56S0100000_31 LLJILJIL;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        LinearLayoutManager linearLayoutManager = this.LLJIJIL;
        if (linearLayoutManager == null) {
            return false;
        }
        IntRange intRange = new IntRange(linearLayoutManager.findFirstCompletelyVisibleItemPosition(), this.LLJIJIL.findLastCompletelyVisibleItemPosition());
        Integer num = this.LLILZ;
        return num != null && intRange.LJLJL(num.intValue()) && this.LLJI.getVisibility() == 0;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
        this.LLJI.removeOnScrollListener(this.LLJILJIL);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        if (this.LLJIJIL == null) {
            C1AF0.LIZIZ();
            return;
        }
        this.LLJI.addOnScrollListener(this.LLJILJIL);
        LJ();
        HandlerHook.viewPostDelay(this.LLJI, new ARunnableS131S0100000_31(this, 11), 200L);
    }

    public /* synthetic */ C15HY(RecyclerView recyclerView, MusicModel musicModel, int i, int i2) {
        this(recyclerView, musicModel, i, false, null);
    }

    public C15HY(RecyclerView recyclerView, MusicModel musicModel, int i, boolean z, C15HO c15ho) {
        LinearLayoutManager linearLayoutManager;
        super(musicModel.getId(), musicModel.getName(), musicModel.getRecommendTag(), Integer.valueOf(i), z, c15ho);
        this.LLJI = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        this.LLJIJIL = linearLayoutManager;
        this.LLJILJIL = new AsS56S0100000_31(this, 0);
    }
}
