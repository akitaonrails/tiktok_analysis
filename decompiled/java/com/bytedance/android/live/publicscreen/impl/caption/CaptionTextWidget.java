package com.bytedance.android.live.publicscreen.impl.caption;

import X.C001A;
import X.C0DTJ;
import X.C0IJT;
import X.C1161920gLG;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C16F5;
import X.C19MX;
import X.C20441214yg;
import X.C327770Ct5;
import X.C327810Ct9;
import X.C474500IjA;
import X.C497740JfY;
import X.C776250Uch;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import Y.AObserverS208S0100000_4;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionDeleteEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionLanguageChannel;
import com.bytedance.android.livesdk.dataChannel.CaptionStartShowEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchMoveEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTypeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptionTextWidget extends LiveRecyclableWidget implements OnMessageListener {
    public static final float LLJLL = C497740JfY.LIZIZ(219);
    public static final float LLJLLIL = C497740JfY.LIZIZ(12);
    public float LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public View LLJ;
    public TextView LLJI;
    public TextView LLJIJIL;
    public C0DTJ LLJILJIL;
    public LiveIconView LLJILJILJ;
    public C16F5 LLJILLL;
    public LinearLayout LLJJ;
    public CaptionViewModel LLJJI;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public C327810Ct9 LLJJIJIL;
    public IMessageManager LLJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public Room LLJJLIIIJLLLLLLLZ;
    public CaptionInfo LLJL;
    public final String LLJLIL;
    public String LLJLILLLLZIIL;
    public volatile boolean LLIZLLLIL = true;
    public final ArrayList<TextView> LLJJIII = new ArrayList<>();
    public final C327770Ct5 LLJJJIL = new C327770Ct5("", 0.0f);
    public final C327770Ct5 LLJJJJ = new C327770Ct5("", 0.0f);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void B1() {
        if (this.LLILZLL || this.LLILZIL || !InterfaceC1106030et7.r6.LIZIZ().booleanValue()) {
            hide();
            C20441214yg.LIZIZ("captiontextwidget", "hide");
        } else {
            show();
            C20441214yg.LIZIZ("captiontextwidget", "show");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LLJJJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLJJI = null;
        if (InterfaceC1106030et7.r6.LIZIZ().booleanValue()) {
            y1("leave");
        }
        this.LLJJIII.clear();
        this.LLJJIJIL = null;
        this.LLJL = null;
    }

    public final Map<String, String> x1() {
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(this.LLJJJJJIL));
        map.put("room_id", String.valueOf(this.LLJJJJLIIL));
        map.put("app_language", this.LLJLIL);
        map.put("caption_language", this.LLJLILLLLZIIL);
        map.put("caption_type", this.LLILLL ? "translational" : "original");
        map.put("device_model", Build.MODEL);
        return map;
    }

    public final void z1() {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_start");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJIIZI(x1());
            c474500IjALIZ.LIZ();
        }
    }

    public CaptionTextWidget() {
        String strT2 = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        this.LLJLIL = strT2;
        this.LLJLILLLLZIIL = strT2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJILJIL = (C0DTJ) findViewById(R.id.xop);
        this.LLJILLL = (C16F5) findViewById(R.id.f710g86);
        this.LLJI = (TextView) findViewById(R.id.xmj);
        this.LLJIJIL = (TextView) findViewById(R.id.xq9);
        this.LLJJ = (LinearLayout) findViewById(R.id.xpd);
        this.LLJ = findViewById(R.id.dc_);
        this.LLJILJILJ = (LiveIconView) findViewById(R.id.yio);
        C19MX c19mx = (C19MX) findViewById(R.id.bsx);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.xmj, R.id.xq9, R.id.f710g86});
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Room room;
        long id;
        long id2;
        String str;
        MutableLiveData<C327810Ct9> mutableLiveData;
        C16F5 c16f5;
        User owner;
        int i;
        List<String> list;
        User owner2;
        this.LL = 0.0f;
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLIZLLLIL = true;
        DataChannel dataChannel = this.dataChannel;
        CaptionInfo captionInfo = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLJJJ = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.CONTROL.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJJLIIIJLLLLLLLZ = room;
        if (room != null) {
            captionInfo = room.captionInfo;
        }
        this.LLJL = captionInfo;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLJJJJLIIL = id;
        Room room2 = this.LLJJLIIIJLLLLLLLZ;
        if (room2 != null && (owner2 = room2.getOwner()) != null) {
            id2 = owner2.getId();
        } else {
            id2 = 0;
        }
        this.LLJJJJJIL = id2;
        CaptionInfo captionInfo2 = this.LLJL;
        if (captionInfo2 != null && (list = captionInfo2.supportLang) != null && (!list.isEmpty())) {
            if (list.contains(this.LLJLIL)) {
                this.LLJLILLLLZIIL = this.LLJLIL;
                this.LLILLL = !Intrinsics.LJFF(ListProtector.get(list, 0), this.LLJLIL);
            } else {
                this.LLJLILLLLZIIL = (String) ListProtector.get(list, 0);
                this.LLILLL = false;
            }
        }
        this.dataChannel.zW(CaptionLanguageChannel.class, this.LLJLILLLLZIIL);
        DataChannel dataChannel3 = this.dataChannel;
        if (this.LLILLL) {
            str = "translational";
        } else {
            str = "original";
        }
        dataChannel3.zW(CaptionTypeChannel.class, str);
        C0DTJ c0dtj = this.LLJILJIL;
        if (c0dtj != null) {
            if (this.LLILLL) {
                if (C497740JfY.LJJ()) {
                    c0dtj.setPadding((int) C497740JfY.LIZIZ(2), c0dtj.getPaddingTop(), (int) C497740JfY.LIZIZ(6), c0dtj.getPaddingBottom());
                } else {
                    c0dtj.setPadding((int) C497740JfY.LIZIZ(6), c0dtj.getPaddingTop(), (int) C497740JfY.LIZIZ(2), c0dtj.getPaddingBottom());
                }
            } else if (C497740JfY.LJJ()) {
                c0dtj.setPadding((int) C497740JfY.LIZIZ(4), c0dtj.getPaddingTop(), (int) C497740JfY.LIZIZ(6), c0dtj.getPaddingBottom());
            } else {
                c0dtj.setPadding((int) C497740JfY.LIZIZ(6), c0dtj.getPaddingTop(), (int) C497740JfY.LIZIZ(4), c0dtj.getPaddingBottom());
            }
        }
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            if (this.LLILLL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i);
        }
        Room room3 = this.LLJJLIIIJLLLLLLLZ;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            owner.getSecret();
        }
        View view = this.LLJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJJIII.addAll(C1697810uHb.LJIIJJI(this.LLJI, this.LLJIJIL));
        C0DTJ c0dtj2 = this.LLJILJIL;
        if (c0dtj2 != null) {
            c0dtj2.setDataChannel(this.dataChannel);
        }
        C0DTJ c0dtj3 = this.LLJILJIL;
        if (c0dtj3 != null) {
            int visibility = c0dtj3.getVisibility();
            c0dtj3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0dtj3);
        }
        if (InterfaceC1106030et7.s6.LIZIZ().booleanValue() && (c16f5 = this.LLJILLL) != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        TextView textView = this.LLJI;
        if (textView != null) {
            this.LLJJI = new CaptionViewModel(textView.getPaint(), LLJLL - LLJLLIL, this.dataChannel, this.LLJLILLLLZIIL, this);
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.zW(CaptionStartShowEvent.class, 0L);
        }
        this.dataChannel.BQ2(this, CaptionDeleteEvent.class, new AwS583S0100000_4(this, 15));
        CaptionViewModel captionViewModel = this.LLJJI;
        if (captionViewModel != null && (mutableLiveData = captionViewModel.LLILZIL) != null) {
            mutableLiveData.observe(this, new AObserverS208S0100000_4(this, 0));
        }
        this.dataChannel.BQ2(this, CaptionTextTouchEvent.class, new AwS583S0100000_4(this, 16));
        this.dataChannel.EQ2(this, CaptionStartShowEvent.class, new AwS583S0100000_4(this, 17));
        this.dataChannel.BQ2(this, CaptionTextTouchMoveEvent.class, new AwS583S0100000_4(this, 18));
        this.dataChannel.BQ2(this, CaptionStateChangeEvent.class, new AwS583S0100000_4(this, 19));
        this.dataChannel.BQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS583S0100000_4(this, 14));
        IMessageManager iMessageManager2 = this.LLJJJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.RANK_UPDATE_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C20441214yg.LIZIZ("captiontextwidget", "ControlMessage");
        if (iMessage instanceof ControlMessage) {
            int i = ((ControlMessage) iMessage).action;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y1("close");
                        return;
                    }
                    return;
                } else {
                    this.LLILZIL = false;
                    B1();
                    return;
                }
            }
            this.LLILZIL = true;
            B1();
        }
    }

    public final void y1(String str) {
        long jLongValue;
        Long l = (Long) this.dataChannel.gg0(CaptionStartShowEvent.class);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if ((!Intrinsics.LJFF(str, "leave") || this.LLJJL == 0) && (jLongValue == 0 || this.LLIZ)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_duration");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        Map<String, String> mapX1 = x1();
        HashMap map = (HashMap) mapX1;
        map.put("reason", str);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        map.put("duration", String.valueOf(jElapsedRealtime / j));
        if (Intrinsics.LJFF(str, "leave")) {
            map.put("duration", String.valueOf((SystemClock.elapsedRealtime() - this.LLJJL) / j));
            w.LIZ.getClass();
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("enter_method", w.LJIIL());
            map.put("action_type", w.LIZLLL());
        }
        c474500IjALIZ.LJJIIZI(mapX1);
        c474500IjALIZ.LIZ();
        this.dataChannel.zW(CaptionStartShowEvent.class, 0L);
        if (!Intrinsics.LJFF(str, "close") && !Intrinsics.LJFF(str, "leave")) {
            return;
        }
        this.LLIZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(X.C327810Ct9 r20, java.util.List<? extends android.widget.TextView> r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget.A1(X.0Ct9, java.util.List, X.05Vn):java.lang.Object");
    }
}
