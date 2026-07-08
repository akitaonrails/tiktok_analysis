package X;

import Y.AObserverS224S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostLikeViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358210lRr extends FrameLayout implements LifecycleOwner, ViewModelStoreOwner {
    public final LifecycleRegistry LL;
    public final C01GW LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxIconView LLILZ;
    public final TuxTextView LLILZIL;
    public final C01GW LLILZLL;
    public RepostSyncViewModel LLIZ;
    public String LLIZLLLIL;
    public C1358220lRs LLJ;
    public VideoItemParams LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public Aweme LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;

    public final RepostLikeViewModel getRepostLikeVM() {
        return (RepostLikeViewModel) this.LLILZLL.getValue();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLILLJJLI.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        MutableLiveData<C2001007se> mutableLiveData;
        super.onAttachedToWindow();
        this.LL.setCurrentState(Lifecycle.State.CREATED);
        RepostLikeViewModel repostLikeVM = getRepostLikeVM();
        if (repostLikeVM == null || (mutableLiveData = repostLikeVM.LLILLJJLI) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS224S0100000_21(this, 43));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.setCurrentState(Lifecycle.State.DESTROYED);
        getViewModelStore().clear();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i != 4 && i != 8) {
                return;
            }
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            return;
        }
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public C1358210lRr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new LifecycleRegistry(this);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(453));
        this.LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1222));
        FrameLayout.inflate(context, R.layout.i68, this);
        this.LLILLL = (TuxIconView) findViewById(R.id.fub);
        this.LLILZ = (TuxIconView) findViewById(R.id.undigg_view);
        this.LLILZIL = (TuxTextView) findViewById(R.id.mnh);
    }

    public final void LIZ(int i, boolean z) {
        String strValueOf;
        String strValueOf2;
        if (z) {
            C786410Ut5.x5(this.LLILLL, 1.0f);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
            C786410Ut5.x5(this.LLILZ, 0.0f);
            C786410Ut5.LLLLLLZZ(this.LLILZ, 8);
            C339190DRl.LIZLLL(this.LLILZIL);
            TuxTextView tuxTextView = this.LLILZIL;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7331818966_repost_like_count_format", true, true)) {
                strValueOf2 = C618720OOo.LIZ(i);
            } else {
                strValueOf2 = String.valueOf(i);
            }
            tuxTextView.setText(strValueOf2);
            return;
        }
        C786410Ut5.x5(this.LLILLL, 0.0f);
        C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
        C786410Ut5.x5(this.LLILZ, 1.0f);
        C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
        if (i <= 0) {
            C339190DRl.LIZIZ(this.LLILZIL);
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7331818966_repost_like_count_format", true, true)) {
            strValueOf = C618720OOo.LIZ(i);
        } else {
            strValueOf = String.valueOf(i);
        }
        tuxTextView2.setText(strValueOf);
    }
}
