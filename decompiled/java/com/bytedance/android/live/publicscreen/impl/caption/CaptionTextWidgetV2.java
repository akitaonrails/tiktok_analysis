package com.bytedance.android.live.publicscreen.impl.caption;

import X.AbstractC315550CYn;
import X.AbstractC327690Csx;
import X.C001A;
import X.C03AV;
import X.C0CVI;
import X.C0DT4;
import X.C0DT6;
import X.C0DT8;
import X.C0DTA;
import X.C0DTJ;
import X.C0IJT;
import X.C1126540fQC;
import X.C1161920gLG;
import X.C12ES;
import X.C16F5;
import X.C19ME;
import X.C19MX;
import X.C327620Csq;
import X.C327630Csr;
import X.C327710Csz;
import X.C327730Ct1;
import X.C418440Gaw;
import X.C474500IjA;
import X.C497740JfY;
import X.C776250Uch;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1106030et7;
import X.InterfaceC914670ZuT;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.bytedance.android.live.publicscreen.impl.caption.v2.CaptionLayoutManager;
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
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CaptionTextWidgetV2 extends LiveRecyclableWidget implements OnMessageListener {
    public static float LLLFFI = C497740JfY.LIZIZ(211);
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public volatile boolean LLJIJIL = true;
    public C16F5 LLJILJIL;
    public C0CVI LLJILJILJ;
    public View LLJILLL;
    public C0DTJ LLJJ;
    public C16F5 LLJJI;
    public LiveIconView LLJJIII;
    public ConstraintLayout LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public C1126540fQC LLJJJ;
    public C0DTA LLJJJIL;
    public IMessageManager LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public Room LLJJLIIIJLLLLLLLZ;
    public C03AV LLJL;
    public CaptionInfo LLJLIL;
    public C0DT4 LLJLILLLLZIIL;
    public C327620Csq LLJLL;
    public C327710Csz LLJLLIL;
    public C327730Ct1 LLJLLL;
    public C0DT6 LLJZ;
    public AbstractC327690Csx LLJZIJLIL;
    public final String LLL;
    public String LLLF;
    public final C0DT8 LLLFF;

    public abstract C03AV B1(C0CVI c0cvi);

    public abstract C327620Csq C1(C0CVI c0cvi);

    public abstract CaptionViewModelV2 D1(C327620Csq c327620Csq);

    public abstract AbstractC327690Csx E1(C0DTA c0dta, C03AV c03av, C0CVI c0cvi, C327620Csq c327620Csq);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hxv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C0DT4 c0dt4;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).K00(this.LLLFF);
        IMessageManager iMessageManager = this.LLJJJJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (InterfaceC1106030et7.r6.LIZIZ().booleanValue() && (c0dt4 = this.LLJLILLLLZIIL) != null) {
            c0dt4.LIZIZ(this.LLJJL, "leave", new AwS548S0100000_4(this, 33), this.LLILZ);
        }
        z1();
        this.LLJLIL = null;
        InterfaceC1106030et7.u6.LJFF(Boolean.FALSE);
    }

    public final void x1() {
        DataChannel dataChannel;
        Long l = (Long) this.dataChannel.gg0(CaptionStartShowEvent.class);
        if ((l == null || l.longValue() == 0) && (dataChannel = this.dataChannel) != null) {
            dataChannel.zW(CaptionStartShowEvent.class, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        C0DT4 c0dt4 = this.LLJLILLLLZIIL;
        if (c0dt4 != null) {
            boolean z = this.LLJIJIL;
            AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 31);
            if (z) {
                awS548S0100000_4.invoke();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_caption_start");
                c474500IjALIZ.LJIJJLI(c0dt4.LIZ);
                c474500IjALIZ.LJJIIZI(c0dt4.LIZ());
                c474500IjALIZ.LIZ();
            }
        }
        C12ES.LJIILL(this.LLILLJJLI ? 0 : 8, this.LLJJIII);
        C12ES.LJIILL(0, this.LLJJ);
        C12ES.LJIILL(8, this.LLJJIJIIJIL);
        z1();
        C12ES.LJIILL(0, this.LLJJJIL);
    }

    public final void z1() {
        C1126540fQC c1126540fQC = this.LLJJJ;
        if (c1126540fQC != null) {
            if (c1126540fQC.LJI()) {
                c1126540fQC.LIZLLL();
            }
            C12ES.LJIILL(4, c1126540fQC);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0DT8] */
    public CaptionTextWidgetV2() {
        String strT2 = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        this.LLL = strT2;
        this.LLLF = strT2;
        this.LLLFF = new InterfaceC914670ZuT() { // from class: X.0DT8
            @Override // X.InterfaceC914670ZuT
            public final void LIZ(boolean z) {
                CaptionTextWidgetV2 captionTextWidgetV2 = this.LIZ;
                captionTextWidgetV2.LLIZ = z;
                C327620Csq c327620Csq = captionTextWidgetV2.LLJLL;
                if (c327620Csq != null) {
                    c327620Csq.LJIIIIZZ = false;
                }
                captionTextWidgetV2.F1(true);
            }
        };
    }

    public final void A1(C0CVI c0cvi) {
        if (!this.LLILZLL) {
            F1(true);
            this.LLILZLL = true;
            C12ES.LJIILL(8, this.LLJJIII);
            final C16F5 c16f5 = this.LLJJIJIIJIL;
            final C1126540fQC c1126540fQC = this.LLJJJ;
            final C0DTA c0dta = this.LLJJJIL;
            final AwS405S0200000_4 awS405S0200000_4 = new AwS405S0200000_4(this, c0cvi, 4);
            ((ArrayList) c0cvi.LJ).add(new AbstractC315550CYn(c16f5, c1126540fQC, c0dta, awS405S0200000_4) { // from class: X.0DT7
                public final C16F5 LJ;
                public final C0DTA LJFF;
                public final Function0<Unit> LJI;

                @Override // X.AbstractC315550CYn
                public final void LIZ() {
                    C12ES.LJIILL(4, this.LJ);
                    C12ES.LJIILL(0, this.LJFF);
                    Function0<Unit> function0 = this.LJI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                {
                    this.LJ = c16f5;
                    this.LJFF = c0dta;
                    this.LJI = awS405S0200000_4;
                    this.LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    if (c16f5 != null) {
                        c16f5.setText(C497740JfY.LJIJI(2131842678));
                    }
                    C12ES.LJIILL(4, c0dta);
                    C12ES.LJIILL(0, c16f5);
                    if (c1126540fQC != null) {
                        if (c1126540fQC.LJI()) {
                            c1126540fQC.LIZLLL();
                        }
                        C12ES.LJIILL(4, c1126540fQC);
                    }
                }
            });
        }
    }

    public final void F1(boolean z) {
        C327620Csq c327620Csq;
        if (!this.LLILZIL && !this.LLJI && !this.LLJ && !this.LLILLL && InterfaceC1106030et7.r6.LIZIZ().booleanValue() && ((!z || ((c327620Csq = this.LLJLL) != null && c327620Csq.LJIIIIZZ)) && !this.LLIZ && !InterfaceC1106030et7.u6.LIZIZ().booleanValue())) {
            show();
        } else {
            z1();
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJJ = (C0DTJ) findViewById(R.id.xop);
        this.LLJJI = (C16F5) findViewById(R.id.f710g86);
        this.LLJJJIL = (C0DTA) findViewById(R.id.dda);
        this.LLJILJIL = (C16F5) findViewById(R.id.xmj);
        this.LLJJIJI = (ConstraintLayout) findViewById(R.id.xpd);
        this.LLJILLL = findViewById(R.id.dc_);
        this.LLJJIII = (LiveIconView) findViewById(R.id.yio);
        this.LLJJIJIIJIL = (C16F5) findViewById(R.id.dd4);
        this.LLJJJ = (C1126540fQC) findViewById(R.id.dd0);
        C19MX c19mx = (C19MX) findViewById(R.id.bsx);
        if (c19mx != null) {
            c19mx.setReferencedIds(new int[]{R.id.dcz, R.id.f710g86});
        }
        this.LLJJIJIL = (LinearLayout) findViewById(R.id.dcz);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [X.0DT6] */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.0Ct1, java.lang.Object] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Room room;
        CaptionInfo captionInfo;
        int i;
        long id;
        long id2;
        ViewGroup.LayoutParams layoutParams;
        String str;
        C03AV c03av;
        C16F5 c16f5;
        ViewGroup.LayoutParams layoutParams2;
        List<String> list;
        User owner;
        CaptionInfo captionInfo2;
        int i2 = 0;
        this.LL = false;
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLJIJIL = true;
        this.LLJ = false;
        this.LLJI = false;
        InterfaceC1106030et7.u6.LJFF(Boolean.FALSE);
        DataChannel dataChannel = this.dataChannel;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLJJJJ = iMessageManager;
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
        } else {
            captionInfo = null;
        }
        this.LLJLIL = captionInfo;
        if (room != null && (captionInfo2 = room.captionInfo) != null) {
            i = captionInfo2.location;
        } else {
            i = 1;
        }
        if (i == 2) {
            C0DTJ c0dtj = this.LLJJ;
            if (c0dtj != null) {
                layoutParams3 = c0dtj.getLayoutParams();
            }
            if (layoutParams3 instanceof C19ME) {
                C19ME c19me = (C19ME) layoutParams3;
                c19me.startToStart = R.id.xpd;
                c19me.bottomToBottom = R.id.xpd;
                c19me.topToTop = -1;
                c19me.endToEnd = -1;
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
                c19me.setMarginEnd(C814420VxA.LIZIZ(C497740JfY.LIZIZ(0)));
                c19me.setMarginStart(C814420VxA.LIZIZ(C497740JfY.LIZIZ(12)));
                C0DTJ c0dtj2 = this.LLJJ;
                if (c0dtj2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0dtj2);
                    c0dtj2.setLayoutParams(layoutParams3);
                }
            }
        }
        Room room2 = this.LLJJLIIIJLLLLLLLZ;
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        this.LLJJJJJIL = id;
        Room room3 = this.LLJJLIIIJLLLLLLLZ;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            id2 = owner.getId();
        } else {
            id2 = 0;
        }
        this.LLJJJJLIIL = id2;
        CaptionInfo captionInfo3 = this.LLJLIL;
        if (captionInfo3 != null && (list = captionInfo3.supportLang) != null && (!list.isEmpty())) {
            if (list.contains(this.LLL)) {
                this.LLLF = this.LLL;
                this.LLILLJJLI = !Intrinsics.LJFF(ListProtector.get(list, 0), this.LLL);
            } else {
                this.LLLF = (String) ListProtector.get(list, 0);
                this.LLILLJJLI = false;
            }
        }
        if (this.LLILLJJLI) {
            LinearLayout linearLayout = this.LLJJIJIL;
            if (linearLayout != null && (layoutParams2 = linearLayout.getLayoutParams()) != null) {
                layoutParams2.width = (int) C497740JfY.LIZIZ(199);
                LinearLayout linearLayout2 = this.LLJJIJIL;
                if (linearLayout2 != null) {
                    C786410Ut5.d6(linearLayout2, layoutParams2);
                }
            }
            LLLFFI = C497740JfY.LIZIZ(199);
        } else {
            LinearLayout linearLayout3 = this.LLJJIJIL;
            if (linearLayout3 != null && (layoutParams = linearLayout3.getLayoutParams()) != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(211);
                LinearLayout linearLayout4 = this.LLJJIJIL;
                if (linearLayout4 != null) {
                    C786410Ut5.d6(linearLayout4, layoutParams);
                }
            }
            LLLFFI = C497740JfY.LIZIZ(211);
        }
        C0DTJ c0dtj3 = this.LLJJ;
        if (c0dtj3 != null) {
            if (this.LLILLJJLI) {
                if (C497740JfY.LJJ()) {
                    c0dtj3.setPadding((int) C497740JfY.LIZIZ(2), c0dtj3.getPaddingTop(), (int) C497740JfY.LIZIZ(6), c0dtj3.getPaddingBottom());
                } else {
                    c0dtj3.setPadding((int) C497740JfY.LIZIZ(6), c0dtj3.getPaddingTop(), (int) C497740JfY.LIZIZ(2), c0dtj3.getPaddingBottom());
                }
            } else if (C497740JfY.LJJ()) {
                c0dtj3.setPadding((int) C497740JfY.LIZIZ(4), c0dtj3.getPaddingTop(), (int) C497740JfY.LIZIZ(6), c0dtj3.getPaddingBottom());
            } else {
                c0dtj3.setPadding((int) C497740JfY.LIZIZ(6), c0dtj3.getPaddingTop(), (int) C497740JfY.LIZIZ(4), c0dtj3.getPaddingBottom());
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        String strValueOf = String.valueOf(this.LLJJJJLIIL);
        String strValueOf2 = String.valueOf(this.LLJJJJJIL);
        String str2 = this.LLL;
        String str3 = this.LLLF;
        String str4 = "translational";
        if (this.LLILLJJLI) {
            str = "translational";
        } else {
            str = "original";
        }
        this.LLJLILLLLZIIL = new C0DT4(dataChannel3, strValueOf, strValueOf2, str2, str3, str);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xh2(this.LLLFF);
        this.dataChannel.zW(CaptionLanguageChannel.class, this.LLLF);
        DataChannel dataChannel4 = this.dataChannel;
        if (!this.LLILLJJLI) {
            str4 = "original";
        }
        dataChannel4.zW(CaptionTypeChannel.class, str4);
        LiveIconView liveIconView = this.LLJJIII;
        if (!this.LLILLJJLI) {
            i2 = 8;
        }
        C12ES.LJIILL(i2, liveIconView);
        C12ES.LJIILL(8, this.LLJILLL);
        C0DTJ c0dtj4 = this.LLJJ;
        if (c0dtj4 != null) {
            c0dtj4.setDataChannel(this.dataChannel);
        }
        if (InterfaceC1106030et7.s6.LIZIZ().booleanValue() && (c16f5 = this.LLJJI) != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        C0CVI c0cvi = new C0CVI();
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 424);
        ?? r4 = new AbstractC315550CYn(awS548S0100000_4) { // from class: X.0Ct1
            public final Function0<Unit> LJ;

            @Override // X.AbstractC315550CYn
            public final int LIZIZ() {
                return 1;
            }

            @Override // X.AbstractC315550CYn
            public final void LIZ() {
                if (InterfaceC1106030et7.r6.LIZIZ().booleanValue()) {
                    if (this.LIZ) {
                        this.LIZIZ = true;
                        return;
                    }
                    this.LIZIZ = false;
                    Function0<Unit> function0 = this.LJ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }

            {
                this.LJ = awS548S0100000_4;
                this.LIZJ = 110000L;
            }
        };
        ((ArrayList) c0cvi.LJ).add(r4);
        this.LLJLLL = r4;
        final C16F5 c16f52 = this.LLJJIJIIJIL;
        final C1126540fQC c1126540fQC = this.LLJJJ;
        final C0DTA c0dta = this.LLJJJIL;
        final LiveIconView liveIconView2 = this.LLJJIII;
        final AwS548S0100000_4 awS548S0100000_42 = new AwS548S0100000_4(this, 425);
        this.LLJZ = new AbstractC315550CYn(c16f52, c1126540fQC, c0dta, liveIconView2, awS548S0100000_42) { // from class: X.0DT6
            public final C16F5 LJ;
            public final C1126540fQC LJFF;
            public final C0DTA LJI;
            public final LiveIconView LJII;
            public final Function0<Unit> LJIIIIZZ;

            @Override // X.AbstractC315550CYn
            public final int LIZIZ() {
                return 2;
            }

            @Override // X.AbstractC315550CYn
            public final void LIZ() {
                if (InterfaceC1106030et7.r6.LIZIZ().booleanValue()) {
                    if (this.LIZ) {
                        Function0<Unit> function0 = this.LJIIIIZZ;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        this.LIZIZ = true;
                        return;
                    }
                    C12ES.LJIILL(8, this.LJ);
                    C12ES.LJIILL(0, this.LJFF);
                    C12ES.LJIILL(4, this.LJI);
                    C12ES.LJIILL(8, this.LJII);
                    this.LIZIZ = false;
                    C1126540fQC c1126540fQC2 = this.LJFF;
                    if (c1126540fQC2 != null && !c1126540fQC2.LJI()) {
                        C1143680frq.LIZLLL(c1126540fQC2, "tiktok_live_watch_resource_demand_1", "ttlive_caption_loading.webp");
                    }
                    Function0<Unit> function02 = this.LJIIIIZZ;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            }

            {
                this.LJ = c16f52;
                this.LJFF = c1126540fQC;
                this.LJI = c0dta;
                this.LJII = liveIconView2;
                this.LJIIIIZZ = awS548S0100000_42;
                this.LIZJ = 10000L;
            }
        };
        C327620Csq c327620CsqC1 = C1(c0cvi);
        this.LLJLL = c327620CsqC1;
        if (c327620CsqC1 != null) {
            C03AV c03avB1 = B1(c0cvi);
            this.LLJL = c03avB1;
            C0DTA c0dta2 = this.LLJJJIL;
            if (c0dta2 != null) {
                c0dta2.setAdapter(c03avB1);
            }
            C0DTA c0dta3 = this.LLJJJIL;
            if (c0dta3 != null) {
                c0dta3.setLayoutManager(new CaptionLayoutManager(this.context));
            }
            C0DTA c0dta4 = this.LLJJJIL;
            if (c0dta4 != null && (c03av = this.LLJL) != null) {
                this.LLJZIJLIL = E1(c0dta4, c03av, c0cvi, c327620CsqC1);
            }
            D1(c327620CsqC1);
        }
        this.LLJILJILJ = c0cvi;
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.zW(CaptionStartShowEvent.class, 0L);
        }
        this.dataChannel.BQ2(this, CaptionDeleteEvent.class, new AwS583S0100000_4(this, 20));
        this.dataChannel.BQ2(this, CaptionTextTouchEvent.class, new AwS583S0100000_4(this, 21));
        this.dataChannel.EQ2(this, CaptionStartShowEvent.class, new AwS583S0100000_4(this, 22));
        this.dataChannel.BQ2(this, CaptionTextTouchMoveEvent.class, new AwS583S0100000_4(this, 23));
        this.dataChannel.BQ2(this, CaptionStateChangeEvent.class, new AwS583S0100000_4(this, 24));
        this.dataChannel.BQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS583S0100000_4(this, 25));
        this.dataChannel.EQ2(this, MultiLiveRTCLayoutChannel.class, new AwS583S0100000_4(this, 26));
        F1(true);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C0DT4 c0dt4;
        if (iMessage instanceof ControlMessage) {
            int i = ((ControlMessage) iMessage).action;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (c0dt4 = this.LLJLILLLLZIIL) != null) {
                        c0dt4.LIZIZ(this.LLJJL, "close", new AwS548S0100000_4(this, 32), this.LLILZ);
                        return;
                    }
                    return;
                }
                this.LLILLL = false;
                C327620Csq c327620Csq = this.LLJLL;
                if (c327620Csq != null) {
                    c327620Csq.LJIIIIZZ = false;
                }
                F1(true);
                return;
            }
            this.LLILLL = true;
            C327620Csq c327620Csq2 = this.LLJLL;
            if (c327620Csq2 != null) {
                c327620Csq2.LJIIIIZZ = false;
            }
            F1(true);
        }
    }

    public final void y1(C327630Csr c327630Csr) {
        C0DT4 c0dt4 = this.LLJLILLLLZIIL;
        if (c0dt4 != null) {
            c0dt4.LIZLLL(c327630Csr.LL, c327630Csr.LLILZLL, -1L, c327630Csr.LLILZIL, null);
        }
    }
}
