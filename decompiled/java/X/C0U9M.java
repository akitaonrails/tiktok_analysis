package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS79S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.api.ToShowShortCutPanelPallet;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9M, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U9M extends C0U9B {
    public final DataChannel LLJJJIL;

    @Override // X.AbstractC761920Tug
    public final void LLLLIL(RecyclerView.ViewHolder viewHolder, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        if (viewHolder instanceof C0U9P) {
            LLZLLLL((C0U9G) viewHolder, liveEffect);
        }
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLILI(RecyclerView.ViewHolder viewHolder, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        if (viewHolder instanceof C0U9P) {
            liveEffect.LJJJIL(false);
            if (C500260Jjc.LJJJJIZL(((C0U9P) viewHolder).LLJJIJI)) {
                LLZLLIL((C0U9G) viewHolder, liveEffect);
            }
        }
    }

    @Override // X.C0U9B
    public final void LLLLZ(C0U9G c0u9g, LiveEffect liveEffect) {
        if (Intrinsics.LJFF(this.LLILZ, liveEffect) && C0U7C.LJIJJ(liveEffect)) {
            if (liveEffect.LJIJ()) {
                DataChannel dataChannel = this.LLJJJIL;
                if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0U9Q.class), Boolean.TRUE)) {
                    LLZLLLL(c0u9g, liveEffect);
                    return;
                }
            } else {
                DataChannel dataChannel2 = this.LLJJJIL;
                if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(C0U9Q.class), Boolean.TRUE)) {
                    this.LLJJJIL.LC0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
                }
            }
        }
        LLZLLIL(c0u9g, liveEffect);
    }

    public final void LLZLLIL(C0U9G c0u9g, LiveEffect liveEffect) {
        if (!(c0u9g instanceof C0U9P)) {
            return;
        }
        Pair pairLLZZ = LLZZ(c0u9g, c0u9g.LL.getWidth(), c0u9g.LL.getHeight());
        int iIntValue = ((Number) pairLLZZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLLZZ.getSecond()).intValue();
        C0U9P c0u9p = (C0U9P) c0u9g;
        List<String> list = null;
        if (C500260Jjc.LJJJJIZL(c0u9p.LLJJIJI)) {
            C786410Ut5.h5(c0u9g.LL, 0.0f);
            C500260Jjc.LLFFF(c0u9g.LL);
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            UrlModel icon = liveEffect.getIcon();
            if (icon != null) {
                list = icon.urlList;
            }
            C1324610kZf c1324610kZfLJIIIIZZ = c0jbnLIZ.LJIIIIZZ("live_effect_grid_list", list);
            Boolean bool = Boolean.FALSE;
            c1324610kZfLJIIIIZZ.LJJ = bool;
            c1324610kZfLJIIIIZZ.LJIIIZ = R.drawable.eg5;
            c1324610kZfLJIIIIZZ.LJJIJ(ImageView.ScaleType.FIT_XY);
            c1324610kZfLJIIIIZZ.LJ = iIntValue;
            c1324610kZfLJIIIIZZ.LJFF = iIntValue2;
            c1324610kZfLJIIIIZZ.LJIIL = new C0U4E(liveEffect, this);
            c1324610kZfLJIIIIZZ.LJJI(c0u9g.LL);
            C0U9O c0u9o = c0u9p.LLJJIJI;
            if (c0u9o != null) {
                C1091380eVU.LIZ(c0u9o);
            }
            c0u9g.LL.animate().alpha(1.0f).setDuration(350L).setInterpolator(new LinearInterpolator());
            DataChannel dataChannel = this.LLJJJIL;
            if (dataChannel != null) {
                dataChannel.SX0(C753780ThY.class, bool);
            }
        } else {
            C786410Ut5.h5(c0u9g.LL, 1.0f);
            C500260Jjc.LLFFF(c0u9g.LL);
            C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
            UrlModel icon2 = liveEffect.getIcon();
            if (icon2 != null) {
                list = icon2.urlList;
            }
            C1324610kZf c1324610kZfLJIIIIZZ2 = c0jbnLIZ2.LJIIIIZZ("live_effect_grid_list", list);
            c1324610kZfLJIIIIZZ2.LJJ = Boolean.FALSE;
            c1324610kZfLJIIIIZZ2.LJIIIZ = R.drawable.eg5;
            c1324610kZfLJIIIIZZ2.LJJIJ(ImageView.ScaleType.FIT_XY);
            c1324610kZfLJIIIIZZ2.LJ = iIntValue;
            c1324610kZfLJIIIIZZ2.LJFF = iIntValue2;
            c1324610kZfLJIIIIZZ2.LJIIL = new C0U4E(liveEffect, this);
            c1324610kZfLJIIIIZZ2.LJJI(c0u9g.LL);
        }
        liveEffect.LJJJIL(false);
    }

    public final void LLZLLLL(C0U9G c0u9g, LiveEffect liveEffect) {
        C21538619Qy iconView;
        C21538619Qy iconView2;
        List<String> list;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        if (!(c0u9g instanceof C0U9P)) {
            return;
        }
        C0U9P c0u9p = (C0U9P) c0u9g;
        c0u9p.P5();
        if (C500260Jjc.LJJJJIZL(c0u9p.LLJJIJI)) {
            return;
        }
        C0U9O c0u9o = c0u9p.LLJJIJI;
        if (c0u9o != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0u9o);
            c0u9o.setAlpha(0.0f);
        }
        C500260Jjc.LLFFF(c0u9p.LLJJIJI);
        C0U9O c0u9o2 = c0u9p.LLJJIJI;
        if (c0u9o2 != null && (iconView = c0u9o2.getIconView()) != null) {
            int width = iconView.getWidth();
            C0U9O c0u9o3 = c0u9p.LLJJIJI;
            if (c0u9o3 != null && (iconView2 = c0u9o3.getIconView()) != null) {
                Pair pairLLZZ = LLZZ(c0u9g, width, iconView2.getHeight());
                int iIntValue = ((Number) pairLLZZ.getFirst()).intValue();
                int iIntValue2 = ((Number) pairLLZZ.getSecond()).intValue();
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                UrlModel icon = liveEffect.getIcon();
                C21538619Qy iconView3 = null;
                if (icon != null) {
                    list = icon.urlList;
                } else {
                    list = null;
                }
                C1324610kZf c1324610kZfLJIIIIZZ = c0jbnLIZ.LJIIIIZZ("live_effect_grid_list", list);
                c1324610kZfLJIIIIZZ.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIIZZ.LJIIIZ = R.drawable.eg5;
                c1324610kZfLJIIIIZZ.LJJIJ(ImageView.ScaleType.FIT_XY);
                c1324610kZfLJIIIIZZ.LJ = iIntValue;
                c1324610kZfLJIIIIZZ.LJFF = iIntValue2;
                c1324610kZfLJIIIIZZ.LJIIL = new C0U4E(liveEffect, this);
                C0U9O c0u9o4 = c0u9p.LLJJIJI;
                if (c0u9o4 != null) {
                    iconView3 = c0u9o4.getIconView();
                }
                c1324610kZfLJIIIIZZ.LJJI(iconView3);
                C1091380eVU.LIZ(c0u9g.LL);
                C0U9O c0u9o5 = ((C0U9P) c0u9g).LLJJIJI;
                if (c0u9o5 != null && (viewPropertyAnimatorAnimate = c0u9o5.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(350L)) != null) {
                    duration.setInterpolator(new LinearInterpolator());
                }
                liveEffect.LJJJIL(true);
                DataChannel dataChannel = this.LLJJJIL;
                if (dataChannel != null) {
                    dataChannel.SX0(C753780ThY.class, Boolean.TRUE);
                }
            }
        }
    }

    @Override // X.C0U9B, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0u9p;
        if (i == C0U9E.NONE.getValue()) {
            c0u9p = new C0U9J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gf6, viewGroup, false));
        } else {
            c0u9p = new C0U9P(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gfd, viewGroup, false));
        }
        try {
            View view = c0u9p.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0u9p.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0u9p.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0u9p.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0u9p.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0u9p.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0u9p.getClass().getName();
        return c0u9p;
    }

    public C0U9M(DataChannel dataChannel, StickerEffectViewModel stickerEffectViewModel, C768560UCw c768560UCw) {
        super(dataChannel, stickerEffectViewModel);
        this.LLJJJIL = dataChannel;
    }

    public static Pair LLZZ(C0U9G c0u9g, int i, int i2) {
        if (LiveBroadcastPictureMemOpt.fitEffectPanelIconSize()) {
            LiveBroadcastPictureMemOpt liveBroadcastPictureMemOpt = LiveBroadcastPictureMemOpt.INSTANCE;
            if (liveBroadcastPictureMemOpt.getEffectIconSize() == null) {
                int i3 = c0u9g.LL.getLayoutParams().width;
                int i4 = c0u9g.LL.getLayoutParams().height;
                if (i3 > 0 && i4 > 0) {
                    liveBroadcastPictureMemOpt.setEffectIconSize(new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4)));
                }
            }
            Pair<Integer, Integer> effectIconSize = liveBroadcastPictureMemOpt.getEffectIconSize();
            if (effectIconSize != null) {
                i = effectIconSize.getFirst().intValue();
            }
            Integer numValueOf = Integer.valueOf(i);
            Pair<Integer, Integer> effectIconSize2 = liveBroadcastPictureMemOpt.getEffectIconSize();
            if (effectIconSize2 != null) {
                i2 = effectIconSize2.getSecond().intValue();
            }
            return new Pair(numValueOf, Integer.valueOf(i2));
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLJIL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLL(viewHolder, (LiveEffect) obj, i);
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZI */
    public final void LLLLL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        DataChannel dataChannel;
        C0U9J c0u9j;
        super.LLLLL(viewHolder, liveEffect, i);
        View view = null;
        if ((viewHolder instanceof C0U9J) && (c0u9j = (C0U9J) viewHolder) != null) {
            view = c0u9j.LL;
        }
        C500260Jjc.LLFFF(view);
        if ((viewHolder instanceof C0U9P) && C0U7C.LJIJJ(liveEffect) && C500260Jjc.LJJIFFI(Boolean.valueOf(liveEffect.LJIJ())) && (dataChannel = this.LLJJJIL) != null && Intrinsics.LJFF(dataChannel.gg0(C0U9Q.class), Boolean.TRUE)) {
            this.LLJJJIL.LC0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
        }
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZIL */
    public final void LLLLLJIL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        C0U9J c0u9j;
        super.LLLLLJIL(viewHolder, liveEffect, i);
        View view = null;
        if ((viewHolder instanceof C0U9J) && (c0u9j = (C0U9J) viewHolder) != null) {
            view = c0u9j.LL;
        }
        C500260Jjc.LJIILLIIL(view);
        if ((viewHolder instanceof C0U9P) && C500260Jjc.LJJJJIZL(((C0U9P) viewHolder).LLJJIJI)) {
            LLZLLIL((C0U9G) viewHolder, liveEffect);
        }
    }

    @Override // X.C0U9B
    /* JADX INFO: renamed from: LLLLZLL */
    public final void LLLLLL(RecyclerView.ViewHolder viewHolder, LiveEffect liveEffect, int i) {
        if (viewHolder instanceof C0U9J) {
            C0U9J c0u9j = (C0U9J) viewHolder;
            View view = c0u9j.LL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.eev);
            }
            C500260Jjc.LJLJLJ(c0u9j.LL, C767250U7v.LJIIIIZZ(this.LLILZ));
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, viewHolder, 45), viewHolder.itemView);
            return;
        }
        if (!(viewHolder instanceof C0U9P)) {
            return;
        }
        C0U5R c0u5r = (C0U5R) viewHolder;
        c0u5r.LLILLJJLI.setBackgroundResource(R.drawable.eev);
        LLZLL((C0U9G) viewHolder, liveEffect);
        UrlModel urlModel = LiveEffect.LIZLLL;
        if (C0UCX.LIZ(this.LLILZ, liveEffect)) {
            LLLLL(viewHolder, liveEffect, i);
        } else {
            LLLLLJIL(viewHolder, liveEffect, i);
        }
        c0u5r.LL.setContentDescription(liveEffect.getName());
        C786410Ut5.I7(new ACListenerS79S0300000_12(this, liveEffect, viewHolder, 11), viewHolder.itemView);
        C444140HbI.LIZ(viewHolder.itemView, AFwS296S0000000_12.get$arr$(9));
        C0U9G c0u9g = (C0U9G) viewHolder;
        LLLLZ(c0u9g, liveEffect);
        if (LLLLLLZ(liveEffect)) {
            C0U9B.LLLLLZIL(viewHolder);
        } else {
            if (!(viewHolder instanceof C0U9G) || c0u9g == null) {
                return;
            }
            C500260Jjc.LJIILIIL(c0u9g.LLILZIL);
        }
    }

    @Override // X.C0U9B
    public final boolean LLLLZLLIL(LiveEffect liveEffect, RecyclerView.ViewHolder viewHolder, boolean z) {
        if ((viewHolder instanceof C0U9P) && C500260Jjc.LJJJJIZL(((C0U9P) viewHolder).LLJJIJI)) {
            LLZLLIL((C0U9G) viewHolder, liveEffect);
            DataChannel dataChannel = this.LLJJJIL;
            if (dataChannel != null) {
                dataChannel.LC0(ToShowShortCutPanelPallet.class, Boolean.TRUE);
                return false;
            }
            return false;
        }
        return super.LLLLZLLIL(liveEffect, viewHolder, z);
    }
}
