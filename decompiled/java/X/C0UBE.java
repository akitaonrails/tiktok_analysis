package X;

import Y.ACListenerS147S0100000_12;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UBE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBE extends C0UB0 {
    public final LifecycleCoroutineScope LJIIJJI;
    public final StickerEffectViewModel LJIIL;

    @Override // X.C0UB0
    public final void LIZIZ() {
        C23250099c.LIZLLL(this.LJIIJJI, null, null, new C0UBB(this, null), 3);
    }

    public C0UBE(ViewGroup viewGroup, LifecycleCoroutineScope lifecycleCoroutineScope, StickerEffectViewModel stickerEffectViewModel, C766200U3u c766200U3u, C0UA2 c0ua2) {
        super(viewGroup, new C766210U3v(R.layout.hmk, c766200U3u, c0ua2), new GridLayoutManager(viewGroup.getContext(), 5));
        this.LJIIJJI = lifecycleCoroutineScope;
        this.LJIIL = stickerEffectViewModel;
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 431), this.LJIIIZ);
        C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C0UB9(this, null), 3);
    }
}
