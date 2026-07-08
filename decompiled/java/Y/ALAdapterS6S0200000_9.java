package Y;

import X.C612110Nzd;
import X.C631370Opb;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCollectIconAssem;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ALAdapterS6S0200000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0200000_9 aLAdapterS6S0200000_9, Animator animator) {
        super.onAnimationEnd(animator);
        C612110Nzd c612110Nzd = C612110Nzd.LIZ;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((VideoMusicCoverAssem) aLAdapterS6S0200000_9.l0)).getAweme();
        c612110Nzd.getClass();
        if (!C612110Nzd.LIZIZ(aweme)) {
            C786410Ut5.Pd((ObjectAnimator) aLAdapterS6S0200000_9.l1);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0200000_9 aLAdapterS6S0200000_9, Animator animator) {
        ((AnimatorSet) aLAdapterS6S0200000_9.l0).start();
        MusicCellCollectIconViewModel musicCellCollectIconViewModelOp = ((MusicCellCollectIconAssem) aLAdapterS6S0200000_9.l1).op();
        musicCellCollectIconViewModelOp.getClass();
        musicCellCollectIconViewModelOp.setState(AFwS240S0000000_9.get$arr$(896));
    }

    public ALAdapterS6S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
