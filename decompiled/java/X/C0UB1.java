package X;

import Y.ACListenerS147S0100000_12;
import Y.AsS39S0100000_12;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UB1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UB1 extends C0UB0 {
    public final LifecycleCoroutineScope LJIIJJI;
    public final StickerEffectViewModel LJIIL;
    public AnonymousClass0956 LJIILIIL;
    public volatile long LJIILJJIL;
    public long LJIILL;

    @Override // X.C0UB0
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIILIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.C0UB0
    public final void LIZIZ() {
        String str;
        C0UBH c0ubh = this.LIZLLL;
        if (c0ubh == null || (str = c0ubh.LIZIZ) == null || str.length() == 0) {
            return;
        }
        LJFF(this.LIZLLL);
    }

    public final void LJI() {
        if (((ArrayList) this.LIZIZ.LL).isEmpty()) {
            C500260Jjc.LLFFF(this.LJIIIZ);
            C500260Jjc.LJIILIIL(this.LJII);
            C500260Jjc.LJIILIIL(this.LJIIIIZZ);
            LJ();
            C500260Jjc.LJIILIIL(this.LJI);
        }
    }

    public final void LJFF(C0UBH c0ubh) {
        if (c0ubh == null || System.currentTimeMillis() - this.LJIILL < 1000) {
            return;
        }
        this.LJIILL = System.currentTimeMillis();
        if (c0ubh.LIZIZ.length() == 0) {
            LJI();
        } else {
            C23250099c.LIZLLL(this.LJIIJJI, null, null, new C0UB3(this, c0ubh, null), 3);
        }
    }

    @Override // X.C0UB0
    public final void LIZJ(C0UBH c0ubh, String str) {
        String str2;
        String str3;
        super.LIZJ(c0ubh, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ.getItemCount());
        sbLIZ.append(", ");
        C0UBH c0ubh2 = this.LIZLLL;
        if (c0ubh2 == null || (str2 = c0ubh2.LIZIZ) == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("EffectMonitor#loadmore", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveEffectLoadOptSetting.INSTANCE.allowPageLoad()) {
            C0UBH c0ubh3 = this.LIZLLL;
            if (c0ubh3 != null) {
                str3 = c0ubh3.LIZIZ;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "trending")) {
                this.LJI.clearOnScrollListeners();
                this.LJI.addOnScrollListener(new AsS39S0100000_12(this, 9));
            }
        }
    }

    public C0UB1(ViewGroup viewGroup, LifecycleCoroutineScope lifecycleCoroutineScope, StickerEffectViewModel stickerEffectViewModel, C766200U3u c766200U3u, C0UA2 c0ua2) {
        super(viewGroup, new C766210U3v(R.layout.hmk, c766200U3u, c0ua2), new GridLayoutManager(viewGroup.getContext(), 5));
        this.LJIIJJI = lifecycleCoroutineScope;
        this.LJIIL = stickerEffectViewModel;
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 430), this.LJIIIZ);
        this.LJIILIIL = C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C0UB2(this, null), 3);
        C500260Jjc.LLFFF(this.LJIIIIZZ);
        LIZLLL();
        C500260Jjc.LJIILIIL(this.LJIIIZ);
        C500260Jjc.LJIILIIL(this.LJI);
        C500260Jjc.LJIILIIL(this.LJII);
    }
}
