package com.bytedance.android.live.effect.sticker.shortcutpanel;

import X.C011Z;
import X.C01GW;
import X.C0PEM;
import X.C0U60;
import X.C0U9N;
import X.C0UA1;
import X.C0UC4;
import X.C0UD4;
import X.C1161920gLG;
import X.C13LP;
import X.C20337914i1;
import X.C20736316Cj;
import X.C23250099c;
import X.C402201hM;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C767250U7v;
import X.C767560U9a;
import X.C767570U9b;
import X.C767620U9g;
import X.C767640U9i;
import X.C767760U9u;
import X.C781710UlV;
import X.C931050aKt;
import X.EnumC771390UNt;
import X.InterfaceC1813060xHU;
import X.InterfaceC766480U4w;
import X.InterfaceC767730U9r;
import X.InterfaceC769090UEx;
import X.ViewOnClickListenerC1836610xtT;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.RemoveCoHostSameInsertStickerEvent;
import com.bytedance.android.live.effect.api.ScrollToInsertStickerEvent;
import com.bytedance.android.live.effect.api.ShowStickerShortCutPanelEvent;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.api.ToShowSpecialIconEvent;
import com.bytedance.android.live.effect.model.LiveEffectAdaptiveChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.liveinteract.api.MultiGuestUsedEffectChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class StickerShortCutWidget extends BaseSubShortCutPanelWidget {
    public final int LLILZIL;
    public final StickerEffectViewModel LLILZLL;
    public List<LiveEffect> LLIZ;
    public LiveEffect LLIZLLLIL;
    public final C01GW LLJ;
    public final LinearLayoutManager LLJI;
    public C781710UlV LLJIJIL;
    public InterfaceC767730U9r LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public LiveEffect LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public LiveEffect LLJJJ;
    public String LLJJJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2g;
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C0U9N C1() {
        return (C0U9N) this.LLJ.getValue();
    }

    public final void D1() {
        C767640U9i c767640U9iP71;
        LiveEffect liveEffect;
        InterfaceC769090UEx insertStickerManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getInsertStickerManager();
        if (insertStickerManager == null || (c767640U9iP71 = insertStickerManager.p71("")) == null || (liveEffect = c767640U9iP71.LIZ) == null) {
            return;
        }
        int iIndexOf = this.LLIZ.indexOf(liveEffect);
        if (iIndexOf >= 0) {
            LinearLayoutManager linearLayoutManager = this.LLJI;
            int width = (((View) this.LLJILJILJ.getValue()).getWidth() - this.LLILZIL) / 2;
            if (width < 0) {
                width = 0;
            }
            linearLayoutManager.scrollToPositionWithOffset(iIndexOf, width);
        }
        this.LLJJIJIIJIL = false;
    }

    public final void E1() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        ((View) this.LLJJ.getValue()).startAnimation(rotateAnimation);
    }

    public final void F1() {
        StickerEffectViewModel stickerEffectViewModel = this.LLILZLL;
        stickerEffectViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), C0PEM.LIZJ, null, new C402201hM(stickerEffectViewModel, "Carousel", null), 2);
    }

    public final LiveEffect B1() {
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
        return C500260Jjc.LJJJI(liveEffect != null ? Boolean.valueOf(C767250U7v.LJ(liveEffect)) : null) ? (LiveEffect) DataChannelGlobal.LLILZ.gg0(C931050aKt.class) : liveEffect;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C1().LLZZ();
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJJI;
        Boolean bool = Boolean.FALSE;
        c20337914i1.LJFF(bool);
        C1().LLJILLL = false;
        C781710UlV c781710UlV = this.LLJIJIL;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJJIIJ(SystemClock.elapsedRealtime() - this.LLJJIII, this.dataChannel, C1().getItemCount() > 0, true, this.LLJJIJI, this.LLILLL);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(StickerShortcutPanelChannel.class, bool);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, ScrollToInsertStickerEvent.class, new AwS591S0100000_12(this, 117));
        dataChannel.EQ2(this, ShowStickerShortCutPanelEvent.class, new C767570U9b(this));
        dataChannel.EQ2(this, StickerPanelShowEvent.class, new AwS591S0100000_12(this, 118));
        dataChannel.EQ2(this, StickerPanelHideEvent.class, new AwS591S0100000_12(this, 119));
        dataChannel.EQ2(this, NewInsertStickerEvent.class, new AwS591S0100000_12(this, 120));
        dataChannel.EQ2(this, LiveGoalEffectEvent.class, new AwS591S0100000_12(this, 121));
        dataChannel.CQ2(RemoveCoHostSameInsertStickerEvent.class, this, new AwS591S0100000_12(this, 122));
        dataChannel.EQ2(this, ToShowSpecialIconEvent.class, new AwS591S0100000_12(this, 123));
        dataChannel.EQ2(this, MultiLiveAnchorMuteVideoEvent.class, new AwS591S0100000_12(this, 124));
        dataChannel.BQ2(this, DrawGuessIsCountingDownRoundStart.class, new AwS591S0100000_12(this, 113));
        dataChannel.BQ2(this, DrawGuessExitGameEvent.class, new AwS591S0100000_12(this, 114));
        dataChannel.BQ2(this, MultiGuestUsedEffectChannel.class, new AwS591S0100000_12(this, 115));
        dataChannel.EQ2(this, LiveEffectAdaptiveChannel.class, new AwS591S0100000_12(this, 116));
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.e1y);
        if (liveIconView != null) {
            liveIconView.setCheckColorFilter(true);
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9j, liveIconView.getContext()));
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 842));
        }
        LiveIconView liveIconView2 = (LiveIconView) findViewById(R.id.pnq);
        if (liveIconView2 != null) {
            liveIconView2.setCheckColorFilter(true);
            liveIconView2.setIconTint(C20736316Cj.LIZIZ(R.attr.c9j, liveIconView2.getContext()));
            C500260Jjc.LJLIIIL(500L, liveIconView2, new AwS591S0100000_12(this, 843));
        }
        if (C497740JfY.LJJ()) {
            findViewById(R.id.vyj).setBackgroundResource(R.drawable.e8i);
            findViewById(R.id.h4n).setBackgroundResource(R.drawable.e8j);
        } else {
            findViewById(R.id.vyj).setBackgroundResource(R.drawable.e8j);
            findViewById(R.id.h4n).setBackgroundResource(R.drawable.e8i);
        }
        RecyclerView recyclerView = (RecyclerView) this.LLJILJILJ.getValue();
        recyclerView.setAdapter(C1());
        recyclerView.setLayoutManager(this.LLJI);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        this.LLJIJIL = new C781710UlV(0, 0.0d, recyclerView, new AwS626S0100000_12(this, 45));
        C1().LLLZIL();
        C1().LLIZ = new AwS626S0100000_12(this, 46);
        ((ViewOnClickListenerC1836610xtT) this.LLJILLL.getValue()).setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0U9f
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                ((ViewOnClickListenerC1836610xtT) this.LIZ.LLJILLL.getValue()).LJI();
                this.LIZ.E1();
                this.LIZ.F1();
            }
        });
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C767560U9a(this, null), 3);
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (isShowing()) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            C0UC4.LJJIIJ(SystemClock.elapsedRealtime() - this.LLJJIII, this.dataChannel, C1().getItemCount() > 0, true, this.LLJJIJI, "other");
        }
        C1().LLLZLL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        this.LLJJIII = SystemClock.elapsedRealtime();
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJJI;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        C781710UlV c781710UlV = this.LLJIJIL;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        this.LLJJI = B1();
        C0U9N c0u9nC1 = C1();
        c0u9nC1.LLJILLL = true;
        LiveEffect liveEffect = c0u9nC1.LLILZIL;
        if (liveEffect != null) {
            c0u9nC1.LLLLLLIL(liveEffect);
        }
        if (c0u9nC1.LLILZLL) {
            c0u9nC1.LLLJIL(c0u9nC1.LLILZ);
            c0u9nC1.LLILZ = null;
        }
        ((ViewOnClickListenerC1836610xtT) this.LLJILLL.getValue()).LJI();
        E1();
        F1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(StickerShortcutPanelChannel.class, bool);
        }
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC771390UNt x1() {
        return EnumC771390UNt.STICKER;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    public StickerShortCutWidget(Function1<? super EnumC771390UNt, Boolean> function1, Function1<? super EnumC771390UNt, Boolean> function12) {
        C767620U9g c767620U9g;
        super(function1, function12);
        this.LLILZIL = (int) C497740JfY.LIZIZ(50.0f);
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c767620U9g = (C767620U9g) dataChannel.gg0(LiveEffectAdaptiveChannel.class)) != null) {
            int i = c767620U9g.LIZ;
            stickerEffectViewModelLIZ.LLJJ.getClass();
            C767760U9u.LIZJ = i;
        }
        this.LLILZLL = stickerEffectViewModelLIZ;
        this.LLIZ = new ArrayList();
        new ArrayList();
        this.LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 66));
        this.LLJI = new LinearLayoutManager(getContext(), 0, false);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 63));
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 65));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 64));
    }
}
