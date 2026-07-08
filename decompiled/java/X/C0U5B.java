package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U5B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U5B extends AbstractC761920Tug<RecyclerView.ViewHolder, LiveEffect> {
    public final DataChannel LLILLJJLI;
    public final StickerEffectViewModel LLILLL;
    public boolean LLILZ;
    public LiveEffect LLILZIL;
    public LiveEffect LLILZLL;
    public Function1<? super LiveEffect, Unit> LLIZ;
    public boolean LLIZLLLIL;

    public void LLLLLLLZIL(LiveEffect liveEffect, View view) {
        throw null;
    }

    public void LLLLLLZ() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC761920Tug
    public final void LLLIIIIL(int i) {
        super.LLLIIIIL(i);
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            UrlModel urlModel = LiveEffect.LIZLLL;
            if (C0UCX.LIZ(this.LLILZIL, (LiveEffect) ListProtector.get(this.LL, i)) && this.LLIZ != null) {
                LLLLLLLLLL((LiveEffect) ListProtector.get(this.LL, i));
            }
        }
    }

    public final void LLLLLLIL(LiveEffect liveEffect) {
        if (liveEffect.LJIJJLI()) {
            return;
        }
        this.LLILZIL = liveEffect;
        if (C767250U7v.LIZLLL(liveEffect)) {
            C0U5D.LIZ(liveEffect, this, this.LLILLL, this.LLILLJJLI, null, null);
        } else if (liveEffect.LJJI()) {
            C0U5D.LIZIZ(liveEffect, this, this.LLILLJJLI, null, null);
        } else {
            C0U5D.LIZJ(liveEffect, this, this.LLILLL, this.LLILLJJLI, null, null, null, null, 240);
        }
    }

    public final boolean LLLLLLL(LiveEffect liveEffect) {
        Boolean boolValueOf;
        C1081600eFi c1081600eFi;
        if (!liveEffect.LLJZ()) {
            return false;
        }
        EnumC768840UDy enumC768840UDy = (EnumC768840UDy) DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class);
        Boolean boolValueOf2 = null;
        if (enumC768840UDy != null) {
            boolValueOf = Boolean.valueOf(enumC768840UDy.isLink());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c1081600eFi = (C1081600eFi) dataChannel.gg0(MultiLiveRTCLayoutChannel.class)) != null) {
            boolValueOf2 = Boolean.valueOf(c1081600eFi.LIZ());
        }
        boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf2);
        if (!zLJJJI && !zLJJIFFI) {
            return false;
        }
        return true;
    }

    public final void LLLLLLLLLL(LiveEffect liveEffect) {
        this.LLILZIL = null;
        LiveEffect liveEffect2 = this.LLILZLL;
        if (liveEffect2 != null) {
            LLLJ(((ArrayList) this.LL).indexOf(liveEffect2));
        }
        if (Intrinsics.LJFF(liveEffect, this.LLILZLL)) {
            this.LLILZLL = null;
            Function1<? super LiveEffect, Unit> function1 = this.LLIZ;
            if (function1 != null) {
                function1.invoke(null);
                return;
            }
            return;
        }
        this.LLILZLL = liveEffect;
        Function1<? super LiveEffect, Unit> function12 = this.LLIZ;
        if (function12 != null) {
            function12.invoke(liveEffect);
        }
        LLLILZLLLI(liveEffect);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((LiveEffect) ListProtector.get(this.LL, i)).LJLIL().getValue();
    }

    public C0U5B(DataChannel dataChannel, StickerEffectViewModel stickerEffectViewModel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = stickerEffectViewModel;
    }

    public final void LLLLLLZZ(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect) {
        C0U5R c0u5r;
        C20515815Po c20515815Po;
        int i = 0;
        if (!liveEffect.LJIJJLI() && (this.LLILLL.yQ2(liveEffect) || C0U7C.LJIILIIL(liveEffect))) {
            liveEffect.LJJLIL(true);
            liveEffect.LJLILLLLZI(false);
        }
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null && (c20515815Po = c0u5r.LLILLL) != null) {
            if (!liveEffect.LIZLLL()) {
                i = 8;
            }
            int visibility = c20515815Po.getVisibility();
            c20515815Po.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c20515815Po);
        }
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLJL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        View view = null;
        if (viewHolder instanceof C0U5R) {
            C0U5R c0u5r = (C0U5R) viewHolder;
            if (c0u5r != null) {
                c0u5r.I5();
            }
            C0U5R c0u5r2 = (C0U5R) viewHolder;
            if (c0u5r2 != null) {
                view = c0u5r2.LLILZIL;
            }
        }
        C500260Jjc.LLFFF(view);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        C20515815Po c20515815Po = null;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            c20515815Po = c0u5r.LLILLL;
        }
        C500260Jjc.LJIILLIIL(c20515815Po);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            C500260Jjc.LLFFF(c0u5r.LLILLL);
            c0u5r.LLILLL.setProgress(0);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        C20515815Po c20515815Po = null;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            c20515815Po = c0u5r.LLILLL;
        }
        C500260Jjc.LJIILLIIL(c20515815Po);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIIL(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
        C0U5R c0u5r;
        LiveEffect liveEffect = (LiveEffect) obj;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            LLLLLLZZ(c0u5r, liveEffect);
            if (i >= 0) {
                c0u5r.LLILLL.setProgress(i);
            }
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        View view = null;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            view = c0u5r.LLILLJJLI;
        }
        C500260Jjc.LLFFF(view);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        View view = null;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            view = c0u5r.LLILZIL;
        }
        C500260Jjc.LJIILIIL(view);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        C0U5R c0u5r;
        View view = null;
        if ((viewHolder instanceof C0U5R) && (c0u5r = (C0U5R) viewHolder) != null) {
            view = c0u5r.LLILLJJLI;
        }
        C500260Jjc.LJIILLIIL(view);
    }
}
