package com.bytedance.android.live.watchfocus;

import X.C0IJT;
import X.C1090150eTV;
import X.C325420CpI;
import X.C325440CpK;
import X.C474500IjA;
import X.C753740ThU;
import X.C778700Uge;
import X.C786410Ut5;
import X.EnumC325450CpL;
import X.InterfaceC1097170eep;
import X.InterfaceC325410CpH;
import X.InterfaceC325430CpJ;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.GameMomentChannel;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.ProgrammedPinMsgVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.WatchFocusWidgetVisibility;
import com.bytedance.android.livesdk.game.model.GameTagDetail;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMomentQuickCommentWatchliveSetting;
import com.bytedance.android.livesdk.model.message.GameMomentMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes18.dex */
public class WatchFocusTrayWidget extends AnimatableRecyclableWidget implements InterfaceC325410CpH {
    public C1090150eTV LL;
    public C325420CpI LLILLJJLI;
    public GameMomentMessage LLILLL;
    public TextView LLILZ;
    public TextView LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.gnm;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(WatchFocusWidgetVisibility.class, Boolean.TRUE);
        }
        super.show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(WatchFocusWidgetVisibility.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        String str;
        GameTagDetail gameTagDetail;
        GameTagDetail gameTagDetail2;
        show();
        C1090150eTV c1090150eTV = this.LL;
        if (c1090150eTV != null) {
            GameMomentMessage gameMomentMessage = this.LLILLL;
            Room room = (Room) c1090150eTV.LIZ.gg0(RoomChannel.class);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_moment_broadcast_show");
            c474500IjALIZ.LJIJJLI(c1090150eTV.LIZ);
            c474500IjALIZ.LJJII("audience", "user_type");
            c474500IjALIZ.LJJII(C778700Uge.LIZ(gameMomentMessage != null ? gameMomentMessage.messageType : 0), "highlight_moment_type");
            c474500IjALIZ.LJJII("live_room", "show_position");
            if (room == null || (gameTagDetail2 = room.gameTagDetail) == null || (str = gameTagDetail2.gameTagName) == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "game_name");
            c474500IjALIZ.LJJII(Long.valueOf((room == null || (gameTagDetail = room.gameTagDetail) == null) ? 0L : gameTagDetail.gameTagId), "game_id");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC325410CpH
    public final void LLL() {
        hide();
    }

    @Override // X.InterfaceC325410CpH
    public final void LLLLZLLLI() {
        animateHide();
    }

    @Override // X.InterfaceC325410CpH
    public final void T0() {
        show();
    }

    @Override // X.InterfaceC325410CpH
    public final void c() {
        animateShow();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        hide();
    }

    @Override // X.InterfaceC325410CpH
    public final void n1(GameMomentMessage gameMomentMessage) {
        this.LLILLL = gameMomentMessage;
        int i = gameMomentMessage.messageType;
        if (i != 2) {
            if (i != 3) {
                TextView textView = this.LLILZ;
                if (textView != null) {
                    textView.setText(this.context.getResources().getString(2131841862));
                }
                TextView textView2 = this.LLILZIL;
                if (textView2 != null) {
                    textView2.setText(this.context.getResources().getString(2131841861));
                    return;
                }
                return;
            }
            TextView textView3 = this.LLILZ;
            if (textView3 != null) {
                textView3.setText(this.context.getResources().getString(2131852516));
            }
            TextView textView4 = this.LLILZIL;
            if (textView4 == null) {
                return;
            }
            textView4.setText(this.context.getResources().getString(2131852515));
            return;
        }
        TextView textView5 = this.LLILZ;
        if (textView5 != null) {
            textView5.setText(this.context.getResources().getString(2131852514));
        }
        TextView textView6 = this.LLILZIL;
        if (textView6 == null) {
            return;
        }
        textView6.setText(this.context.getResources().getString(2131852513));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 19), view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        C325420CpI c325420CpI = this.LLILLJJLI;
        if (c325420CpI != null) {
            List<InterfaceC325430CpJ> list = c325420CpI.LJ.LIZIZ.get(EnumC325450CpL.WATCH_FOCUS);
            if (list == null) {
                list = null;
            }
            List<InterfaceC325430CpJ> list2 = list;
            if (list2 != null) {
                list2.remove(c325420CpI);
            }
            c325420CpI.LJI = null;
            c325420CpI.LIZIZ();
        }
        hide();
        this.LLILLL = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Fragment parentFragment;
        Fragment fragment;
        this.LLILZ = (TextView) findViewById(R.id.znd);
        this.LLILZIL = (TextView) findViewById(R.id.znc);
        ((ImageView) findViewById(R.id.irr)).setImageResource(R.drawable.c6d);
        C325440CpK c325440CpK = new C325440CpK();
        DataChannel dataChannel = this.dataChannel;
        long quickCommentTrayDuration = LiveGameMomentQuickCommentWatchliveSetting.INSTANCE.getQuickCommentTrayDuration();
        C325420CpI c325420CpI = new C325420CpI(this, dataChannel, quickCommentTrayDuration, this, c325440CpK);
        this.LLILLJJLI = c325420CpI;
        this.LL = new C1090150eTV(this.dataChannel);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            parentFragment = fragment.getParentFragment();
        } else {
            parentFragment = null;
        }
        dataChannel.BQ2(this, GameMomentChannel.class, new AwS583S0100000_4(c325420CpI, 308));
        c325440CpK.LIZ = 0L;
        dataChannel.BQ2(this, CommentComboTrayWidgetVisibility.class, new AwS583S0100000_4(c325440CpK, 215));
        dataChannel.BQ2(this, WatchFocusWidgetVisibility.class, new AwS583S0100000_4(c325440CpK, 216));
        dataChannel.BQ2(this, CommentPinWidgetVisibility.class, new AwS583S0100000_4(c325440CpK, 217));
        EnumC325450CpL enumC325450CpL = EnumC325450CpL.WATCH_FOCUS;
        HashMap<EnumC325450CpL, List<InterfaceC325430CpJ>> map = c325440CpK.LIZIZ;
        List<InterfaceC325430CpJ> arrayList = map.get(enumC325450CpL);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(enumC325450CpL, arrayList);
        }
        List<InterfaceC325430CpJ> list = arrayList;
        if (!list.contains(c325420CpI)) {
            list.add(c325420CpI);
        }
        Long l = (Long) dataChannel.gg0(C753740ThU.class);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0 && System.currentTimeMillis() - jLongValue < quickCommentTrayDuration) {
                C325420CpI.LIZJ(c325420CpI, quickCommentTrayDuration - (System.currentTimeMillis() - jLongValue), true, 1);
            }
        }
        dataChannel.BQ2(this, ProgrammedPinMsgVisibility.class, new AwS370S0200000_4(c325420CpI, parentFragment, 100));
    }
}
