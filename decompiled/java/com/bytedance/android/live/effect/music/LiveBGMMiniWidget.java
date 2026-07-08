package com.bytedance.android.live.effect.music;

import X.C0JBN;
import X.C0U3P;
import X.C0U3Q;
import X.C1324610kZf;
import X.C162100jj;
import X.C1819620xS4;
import X.C19EG;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C427340GpI;
import X.C500260Jjc;
import X.C762060Tuu;
import X.C762070Tuv;
import X.C762790Tw5;
import X.C762800Tw6;
import X.C762890TwF;
import X.C762900TwG;
import X.C763230Twn;
import X.C763260Twq;
import X.C763390Tx3;
import X.C763480TxC;
import X.EnumC771390UNt;
import X.InterfaceC763330Twx;
import X.InterfaceC766480U4w;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.BGMMiniWidgetShowChannel;
import com.bytedance.android.livesdk.dataChannel.BGMMiniWidgetShowEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveBGMMiniWidget extends BaseSubShortCutPanelWidget implements InterfaceC763330Twx {
    public BGMSongListViewModel LLILZIL;
    public BGMPlaylistViewModel LLILZLL;
    public LiveIconView LLIZ;
    public View LLIZLLLIL;
    public LiveIconView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public C427340GpI LLJILLL;
    public MusicSong LLJJ;
    public long LLJJI;
    public boolean LLJJIII;

    @Override // X.InterfaceC763330Twx
    public final void WE() {
        C1(true);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g4t;
    }

    @Override // X.InterfaceC763330Twx
    public final void onPlayerPause() {
        C1(false);
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC763330Twx
    public final void zk() {
    }

    public final boolean B1() {
        Room room;
        DataChannel dataChannel;
        Integer num;
        PaidEvent paidEvent;
        if (!LiveBgMusicSwitchSetting.INSTANCE.getValue() || !LiveBGMSetting.INSTANCE.inLiveBGMUpgrade() || (((room = (Room) this.dataChannel.gg0(RoomChannel.class)) != null && (paidEvent = room.paidEvent) != null && paidEvent.paidType == 1) || !C500260Jjc.LJJIFFI((Boolean) this.dataChannel.gg0(ECLiveStatusChangeChannel.class)) || ((dataChannel = this.dataChannel) != null && (num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class)) != null && num.intValue() != 0))) {
            return false;
        }
        Room room2 = (Room) this.dataChannel.gg0(RoomChannel.class);
        return room2 == null || room2.liveSubOnly != 1;
    }

    public final void D1() {
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3() && InterfaceC766480U4w.LJIILJJIL.LIZIZ().booleanValue()) {
            return;
        }
        Room roomLIZ = C162100jj.LIZ(this.dataChannel);
        if (C500260Jjc.LJJIFFI(roomLIZ != null ? Boolean.valueOf(roomLIZ.hasUsedMusic) : null)) {
            LiveIconView liveIconView = this.LLJ;
            if (liveIconView != null) {
                liveIconView.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, liveIconView));
            }
            View view = this.LLJI;
            if (view != null) {
                view.setClickable(true);
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                view2.setEnabled(true);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        if (C763260Twq.LJIIL) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.BGM);
        } else {
            ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.BGM);
        }
        C763260Twq.LJIIIZ = false;
        C763230Twn.LJII((System.currentTimeMillis() - this.LLJJI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.dataChannel, "shortcut", this.LLJJIII);
        this.LLJJIII = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C19EG activity = this.widgetCallback.getFragment().getActivity();
        if (activity != null) {
            this.LLILZIL = (BGMSongListViewModel) ViewModelProviders.of(activity, new C762060Tuu(new C763390Tx3(), this.dataChannel)).get(BGMSongListViewModel.class);
            C19EG activity2 = this.widgetCallback.getFragment().getActivity();
            if (activity2 != null) {
                this.LLILZLL = (BGMPlaylistViewModel) ViewModelProviders.of(activity2, new C762070Tuv(new C763480TxC(), this.dataChannel)).get(BGMPlaylistViewModel.class);
            }
        }
        C763260Twq.LIZ(this);
        View view = getView();
        if (view != null) {
            view.setEnabled(true);
        }
        this.LLIZ = (LiveIconView) findViewById(R.id.bz7);
        this.LLIZLLLIL = findViewById(R.id.bz6);
        this.LLJ = (LiveIconView) findViewById(R.id.bz0);
        this.LLJI = findViewById(R.id.byz);
        this.LLJIJIL = findViewById(R.id.byq);
        this.LLJILJIL = findViewById(R.id.byu);
        this.LLJILJILJ = findViewById(R.id.bys);
        this.LLJILLL = (C427340GpI) findViewById(R.id.bza);
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3() && InterfaceC766480U4w.LJIILJJIL.LIZIZ().booleanValue() && B1()) {
            Room roomLIZ = C162100jj.LIZ(this.dataChannel);
            if (C500260Jjc.LJJIFFI(roomLIZ != null ? Boolean.valueOf(roomLIZ.hasUsedMusic) : null)) {
                C500260Jjc.LJJJJJ(this, null, new C762890TwF(this, null), 3);
                LiveIconView liveIconView = this.LLJ;
                if (liveIconView != null) {
                    liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9m, liveIconView.getContext()));
                }
                View view2 = this.LLJI;
                if (view2 != null) {
                    view2.setClickable(false);
                }
                View view3 = this.LLJI;
                if (view3 != null) {
                    view3.setEnabled(false);
                }
                this.LLJJIII = true;
            }
        }
        if (InterfaceC766480U4w.LJIILL.LIZIZ().booleanValue() && B1()) {
            C500260Jjc.LJJJJJ(this, null, new C762900TwG(this, null), 3);
            this.LLJJIII = true;
        }
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LLILZLL;
        if (bGMPlaylistViewModel == null) {
            bGMPlaylistViewModel = null;
        }
        if (bGMPlaylistViewModel.LL.LJ != null) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            BGMPlaylistViewModel bGMPlaylistViewModel2 = this.LLILZLL;
            if (bGMPlaylistViewModel2 == null) {
                bGMPlaylistViewModel2 = null;
            }
            MusicSong musicSong = bGMPlaylistViewModel2.LL.LJ;
            C1324610kZf url = c0jbnLIZ.setUrl(musicSong != null ? musicSong.coverUrl : null);
            View view4 = this.LLJILJILJ;
            if (view4 == null) {
                view4 = null;
            }
            url.LJJI(view4);
            C1(C763260Twq.LJIIL);
            C427340GpI c427340GpI = this.LLJILLL;
            if (c427340GpI == null) {
                c427340GpI = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            BGMPlaylistViewModel bGMPlaylistViewModel3 = this.LLILZLL;
            if (bGMPlaylistViewModel3 == null) {
                bGMPlaylistViewModel3 = null;
            }
            MusicSong musicSong2 = bGMPlaylistViewModel3.LL.LJ;
            sbLIZ.append(musicSong2 != null ? musicSong2.title : null);
            sbLIZ.append('-');
            BGMPlaylistViewModel bGMPlaylistViewModel4 = this.LLILZLL;
            if (bGMPlaylistViewModel4 == null) {
                bGMPlaylistViewModel4 = null;
            }
            MusicSong musicSong3 = bGMPlaylistViewModel4.LL.LJ;
            sbLIZ.append(musicSong3 != null ? musicSong3.author : null);
            c427340GpI.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C763260Twq.LIZLLL(false, false);
        LiveIconView liveIconView2 = this.LLIZ;
        if (liveIconView2 != null) {
            liveIconView2.setIconAttr(R.attr.e9g);
        }
        View view5 = this.LLJILJIL;
        if (view5 != null) {
            C500260Jjc.LJLIIIL(500L, view5, new AwS591S0100000_12(this, 830));
        }
        View view6 = this.LLIZLLLIL;
        if (view6 != null) {
            C500260Jjc.LJLIIIL(500L, view6, new AwS591S0100000_12(this, 832));
        }
        View view7 = this.LLJI;
        if (view7 != null) {
            C500260Jjc.LJLIIIL(500L, view7, new AwS591S0100000_12(this, 833));
        }
        View view8 = this.LLJIJIL;
        if (view8 != null) {
            C500260Jjc.LJLIIIL(500L, view8, new AwS591S0100000_12(this, 834));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, BGMMiniWidgetShowEvent.class, new AwS591S0100000_12(this, 835));
            dataChannel.BQ2(this, ECLiveStatusChangeChannel.class, new AwS591S0100000_12(this, 828));
            dataChannel.BQ2(this, BGMMiniWidgetShowChannel.class, new AwS591S0100000_12(this, 829));
        }
        C500260Jjc.LJJJJJ(this, null, new C762800Tw6(this, null), 3);
        C500260Jjc.LJJJJJ(this, null, new C762790Tw5(this, null), 3);
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (isShowing()) {
            C763230Twn.LJII((System.currentTimeMillis() - this.LLJJI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), this.dataChannel, "shortcut", this.LLJJIII);
        }
        this.LLJJIII = false;
        C763260Twq.LJIILLIIL = isShowing();
        C763260Twq.LIZJ().remove(this);
        InterfaceC766480U4w.LJIILL.LJFF(Boolean.valueOf(isShowing()));
        if (LiveBGMSetting.INSTANCE.inLiveBGMUpgradeV3()) {
            InterfaceC766480U4w.LJIILJJIL.LJFF(Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (B1()) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.BGM);
            C763260Twq.LJIIIZ = true;
        }
        this.LLJJI = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC771390UNt x1() {
        return EnumC771390UNt.BGM_MINI;
    }

    public final void C1(boolean z) {
        C427340GpI c427340GpI = null;
        if (z) {
            C427340GpI c427340GpI2 = this.LLJILLL;
            if (c427340GpI2 == null) {
                c427340GpI2 = null;
            }
            c427340GpI2.requestFocus();
            C427340GpI c427340GpI3 = this.LLJILLL;
            if (c427340GpI3 != null) {
                c427340GpI = c427340GpI3;
            }
            c427340GpI.LJJJJI();
            LiveIconView liveIconView = this.LLIZ;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.e6l);
                return;
            }
            return;
        }
        C427340GpI c427340GpI4 = this.LLJILLL;
        if (c427340GpI4 == null) {
            c427340GpI4 = null;
        }
        c427340GpI4.clearFocus();
        C427340GpI c427340GpI5 = this.LLJILLL;
        if (c427340GpI5 != null) {
            c427340GpI = c427340GpI5;
        }
        c427340GpI.LJJJJIZL();
        LiveIconView liveIconView2 = this.LLIZ;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.e9g);
    }

    public LiveBGMMiniWidget(Function1<? super EnumC771390UNt, Boolean> function1, Function1<? super EnumC771390UNt, Boolean> function12) {
        super(function1, function12);
    }
}
