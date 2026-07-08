package com.bytedance.android.live.effect.soundeffect;

import X.C0DXQ;
import X.C0IJT;
import X.C0U4C;
import X.C23250099c;
import X.C439101nJ;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C761220TtY;
import X.C761230TtZ;
import X.C761450Ttv;
import X.C761610TuB;
import X.C761680TuI;
import X.C761740TuO;
import X.C761960Tuk;
import X.C781710UlV;
import X.C786410Ut5;
import X.EnumC771390UNt;
import X.InterfaceC766480U4w;
import X.RunnableC781530UlD;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.live.effect.api.SoundEffectPanelCloseEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class SoundEffectMiniWidget extends BaseSubShortCutPanelWidget {
    public SoundEffectViewModel LLILZIL;
    public C761610TuB LLILZLL;
    public RunnableC781530UlD LLIZ;
    public View LLIZLLLIL;
    public C781710UlV LLJ;
    public long LLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.geg;
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        this.LLILZIL = (SoundEffectViewModel) C520010KaN.LJJJ(this.widgetCallback.getFragment(), SoundEffectViewModel.class, new C761450Ttv(new C761960Tuk((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0L : room.getId()), new C761740TuO()), null, false);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761230TtZ(this, null), 3);
        View view = getView();
        if (view != null) {
            view.setEnabled(true);
        }
        if (C497740JfY.LJJ()) {
            C439101nJ.LIZLLL(R.drawable.e7g, findViewById(R.id.bxd));
        } else {
            C439101nJ.LIZLLL(R.drawable.e7f, findViewById(R.id.bxd));
        }
        this.LLIZ = (RunnableC781530UlD) findViewById(R.id.tx5);
        this.LLIZLLLIL = findViewById(R.id.e2g);
        this.LLILZLL = new C761610TuB(this.dataChannel, true, this, this.LLILZIL, R.layout.gew);
        RunnableC781530UlD runnableC781530UlD = this.LLIZ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setItemAnimator(null);
            C761610TuB c761610TuB = this.LLILZLL;
            if (c761610TuB == null) {
                c761610TuB = null;
            }
            runnableC781530UlD.setAdapter(c761610TuB);
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(runnableC781530UlD.getContext(), 0, false));
            runnableC781530UlD.setHasFixedSize(true);
            runnableC781530UlD.addItemDecoration(new C0DXQ(12.0f, 62.0f, 8.0f));
            C0U4C c0u4c = C0U4C.EFFECT_SOUND_MINI_V1;
            int i = RunnableC781530UlD.LLIZLLLIL;
            RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlD.LJ(c0u4c, true, null);
            if (recycledViewPoolLJ != null) {
                recycledViewPoolLJ.setMaxRecycledViews(0, 7);
            }
            this.LLJ = new C781710UlV(0, 0.0d, runnableC781530UlD, new AwS626S0100000_12(this, 74));
        }
        if (LiveBroadcastCpuOptSetting.enableV2WidgetManager()) {
            A1(AFwS199S0000000_12.get$arr$(528));
        } else if (InterfaceC766480U4w.LJJJ.LIZIZ().booleanValue()) {
            A1(AFwS199S0000000_12.get$arr$(529));
        } else {
            z1("", null);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 458), view2);
        }
        this.dataChannel.BQ2(this, SoundEffectPanelCloseEvent.class, new AwS591S0100000_12(this, 98));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        InterfaceC766480U4w.LJJJ.LJFF(Boolean.FALSE);
        C781710UlV c781710UlV = this.LLJ;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        String str = this.LLILLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sound_shortcut_panel_close");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C761680TuI.LIZ)) ? 1 : 0), "is_live_take_default");
        c474500IjALIZ.LJJII(str, "close_method");
        c474500IjALIZ.LIZ();
        C761680TuI.LIZIZ(this.LLJI, this.dataChannel, true);
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C761680TuI.LIZIZ(this.LLJI, this.dataChannel, true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        InterfaceC766480U4w.LJJJ.LJFF(Boolean.TRUE);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C761220TtY(this, null), 3);
        C781710UlV c781710UlV = this.LLJ;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        C761680TuI.LIZJ(this.dataChannel, true);
        this.LLJI = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget
    public final EnumC771390UNt x1() {
        return EnumC771390UNt.SOUND_EFFECT;
    }

    public SoundEffectMiniWidget(Function1<? super EnumC771390UNt, Boolean> function1, Function1<? super EnumC771390UNt, Boolean> function12) {
        super(function1, function12);
    }
}
