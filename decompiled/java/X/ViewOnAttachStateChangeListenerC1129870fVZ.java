package X;

import Y.ACListenerS120S0200000_17;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.viewholder.TitleSwitcherHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fVZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnAttachStateChangeListenerC1129870fVZ extends AbstractC1126560fQE implements View.OnAttachStateChangeListener {
    public static final int LLLLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    public static final int LLLLIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLLLIILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public final View LLLILZ;
    public final String LLLILZJ;
    public final TextSwitcher LLLILZLLLI;
    public final View LLLIZZ;
    public final View LLLJ;
    public final TitleSwitcherHandler LLLJIL;
    public C292001Be LLLJL;
    public final C1324720kZq LLLL;
    public final AwS561S0100000_17 LLLLII;
    public final AwS561S0100000_17 LLLLIIIILLL;

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public ViewOnAttachStateChangeListenerC1129870fVZ(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "GiftGroupHeaderViewHolder";
        TextSwitcher textSwitcher = (TextSwitcher) view.findViewById(R.id.myi);
        this.LLLILZLLLI = textSwitcher;
        this.LLLIZZ = view.findViewById(R.id.myh);
        this.LLLJ = view.findViewById(R.id.xlh);
        TitleSwitcherHandler titleSwitcherHandler = new TitleSwitcherHandler();
        this.LLLJIL = titleSwitcherHandler;
        this.LLLL = (C1324720kZq) view.findViewById(R.id.myg);
        this.LLLLII = new AwS561S0100000_17(this, 322);
        this.LLLLIIIILLL = new AwS561S0100000_17(this, 321);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.0fRX
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                C16F5 c16f5 = new C16F5(this.LIZ.itemView.getContext(), null);
                ViewOnAttachStateChangeListenerC1129870fVZ viewOnAttachStateChangeListenerC1129870fVZ = this.LIZ;
                C786410Ut5.y6(c16f5, new FrameLayout.LayoutParams(-1, -2));
                if (C1125810fP1.LIZIZ() || (Build.VERSION.SDK_INT >= 29 && viewOnAttachStateChangeListenerC1129870fVZ.LLLILZ.getSourceLayoutResId() == R.layout.gt8)) {
                    c16f5.LJJJI(R.style.a9i);
                } else {
                    c16f5.LJJJI(R.style.a91);
                }
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ef, viewOnAttachStateChangeListenerC1129870fVZ.itemView.getContext());
                if (numLIZJ != null) {
                    c16f5.setTextColor(numLIZJ.intValue());
                }
                return c16f5;
            }
        });
        AwS561S0100000_17 awS561S0100000_17 = this.LLLLII;
        AwS561S0100000_17 awS561S0100000_172 = this.LLLLIIIILLL;
        titleSwitcherHandler.LL = new WeakReference<>(awS561S0100000_17);
        titleSwitcherHandler.LLILLJJLI = new WeakReference<>(awS561S0100000_172);
        view.addOnAttachStateChangeListener(this);
        if (!C1125810fP1.LIZIZ()) {
            C500260Jjc.LJJZ(LLLLIIL, view);
            view.setPadding(view.getPaddingStart(), LLLLIILL, view.getPaddingEnd(), LLLLIILLL);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C292001Be c292001Be = this.LLLJL;
        if (c292001Be != null && c292001Be.LIZIZ && C1118430fD7.LIZ()) {
            TitleSwitcherHandler titleSwitcherHandler = this.LLLJIL;
            titleSwitcherHandler.removeMessages(1);
            titleSwitcherHandler.removeCallbacksAndMessages(null);
            titleSwitcherHandler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        TitleSwitcherHandler titleSwitcherHandler = this.LLLJIL;
        titleSwitcherHandler.removeMessages(1);
        String str = null;
        titleSwitcherHandler.removeCallbacksAndMessages(null);
        TextSwitcher textSwitcher = this.LLLILZLLLI;
        C292001Be c292001Be = this.LLLJL;
        if (c292001Be != null) {
            str = c292001Be.LIZ;
        }
        textSwitcher.setCurrentText(str);
    }

    public final Pair<Animation, Animation> z6(boolean z) {
        int i;
        int i2;
        Context context = this.itemView.getContext();
        if (z) {
            i = R.anim.f474a3;
            i2 = R.anim.a5;
        } else {
            i = R.anim.a4;
            i2 = R.anim.a2;
        }
        return new Pair<>(AnimationUtils.loadAnimation(context, i), AnimationUtils.loadAnimation(context, i2));
    }

    @Override // X.AbstractC1126560fQE
    public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i) {
        C292001Be c292001Be;
        C292301Bh c292301Bh;
        ImageModel imageModel;
        setIsRecyclable(false);
        T t = abstractC1126600fQI.LIZIZ;
        if ((t instanceof C292001Be) && (c292001Be = (C292001Be) t) != null) {
            C786410Ut5.LJLLLLLL(8, this.LLLIZZ);
            String str = c292001Be.LIZ;
            if (str.length() == 0) {
                C500260Jjc.LJIILIIL(this.LLLJ);
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, 0);
                }
                if (layoutParams.height != 0 || this.itemView.getVisibility() != 8) {
                    layoutParams.height = 0;
                    C786410Ut5.W5(this.itemView, layoutParams);
                    C786410Ut5.LJLLLLLL(8, this.itemView);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
                if (layoutParams2 != null && layoutParams2.height == 0) {
                    layoutParams2.height = -2;
                    C786410Ut5.W5(this.itemView, layoutParams2);
                }
                if (this.itemView.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, this.itemView);
                }
                C500260Jjc.LLFFF(this.LLLJ);
                this.LLLILZLLLI.setCurrentText(str);
            }
            if (abstractC1126600fQI instanceof C01AX) {
                C500260Jjc.LLFFF(this.LLLIZZ);
            }
            this.LLLJL = c292001Be;
            if ((abstractC1126600fQI instanceof C292301Bh) && (c292301Bh = (C292301Bh) abstractC1126600fQI) != null && (imageModel = c292301Bh.LJJII) != null) {
                C12ES.LJIILL(0, this.LLLL);
                if (C454590Hs9.LIZ(this.LLLILZ.getContext()) && ((C292301Bh) abstractC1126600fQI).LJJIIJZLJL) {
                    C786410Ut5.Yb(this.LLLL, -1.0f);
                }
                C0JSS.LIZLLL(this.LLLL, imageModel);
                if (((C292301Bh) abstractC1126600fQI).LJJIII.length() > 0) {
                    C786410Ut5.e8(this.LLLL, new ACListenerS120S0200000_17(abstractC1126600fQI, this, 21));
                    return;
                }
                return;
            }
            C12ES.LJIILL(4, this.LLLL);
        }
    }
}
