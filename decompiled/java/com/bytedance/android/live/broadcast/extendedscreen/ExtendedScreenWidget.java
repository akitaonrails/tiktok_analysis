package com.bytedance.android.live.broadcast.extendedscreen;

import X.C006A;
import X.C01GW;
import X.C09AY;
import X.C0IGJ;
import X.C0IJ7;
import X.C0TVI;
import X.C1090450eTz;
import X.C1120000fFe;
import X.C1161920gLG;
import X.C11JF;
import X.C14K9;
import X.C14KS;
import X.C15E5;
import X.C16F5;
import X.C20097313kJ;
import X.C20516015Pq;
import X.C20736316Cj;
import X.C292401Bi;
import X.C354201Zc;
import X.C439101nJ;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C781520UlC;
import X.C782430Umf;
import X.C784440Upu;
import X.C786410Ut5;
import X.C963140bAe;
import X.EnumC1083260eIO;
import X.InterfaceC1113710f5V;
import X.InterfaceC1113880f5m;
import X.InterfaceC1113900f5o;
import X.InterfaceC773000UTy;
import X.InterfaceC782440Umg;
import Y.ARunnableS117S0100000_17;
import Y.AfS181S0100000_12;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.AddDisplaySourceOptionEvent;
import com.bytedance.android.live.broadcast.api.DisplaySourceOptionsChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.gift.ExtendedGiftTrayHeightChange;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiCoHostAcceptInvitationEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.api.revenue.crm.CRMGoalChannel;
import com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting;
import com.bytedance.android.livesdk.api.revenue.crm.ICRMGoalService;
import com.bytedance.android.livesdk.api.revenue.crm.LiveHideCrmTipsWidgetSetting;
import com.bytedance.android.livesdk.broadcast.BroadcastService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenLiveStudioOpenEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenMarkViewGuideTouchEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.OpenExtendedScreenChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceAndExtendScreenLoadOptEnable;
import com.bytedance.android.livesdk.livesetting.broadcast.OptimizeEffectGestureSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendedScreenWidget extends LiveRecyclableWidget implements InterfaceC773000UTy {
    public Room LL;
    public InterfaceC782440Umg LLILLJJLI;
    public C15E5 LLILLL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJJJIL;
    public IPublicScreenHolderWidget LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public IPublicScreenContextWidget LLJJL;
    public C09AY LLJJLIIIJLLLLLLLZ;
    public C1120000fFe LLJL;
    public C782430Umf LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLLIL;
    public C11JF LLJLLL;
    public long LLJZIJLIL;
    public final WidgetCreateTimeUtil LLILZ = new WidgetCreateTimeUtil(null);
    public final int LLILZIL = C14KS.LJFF();
    public EnumC1083260eIO LLIZ = EnumC1083260eIO.HIDE;
    public String LLJI = "draw";
    public final C01GW LLJILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 50));
    public final C01GW LLJJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 48));
    public final C01GW LLJJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 42));
    public final C01GW LLJJIII = C292401Bi.LIZ(new AwS561S0100000_17(this, 49));
    public final C01GW LLJJIJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 51));
    public final C01GW LLJJIJIIJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 43));
    public final C01GW LLJJIJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 44));
    public final C01GW LLJJJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 45));
    public final ARunnableS117S0100000_17 LLJJJJ = new ARunnableS117S0100000_17(this, 25);
    public final List<InterfaceC1113900f5o> LLJLL = new ArrayList();
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 46));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0f5T] */
    public final void A1() {
        LiveMode liveMode;
        BroadcastService broadcastService;
        Room room = this.LL;
        if (room != null) {
            long id = room.getId();
            C006A c006aLIZJ = C1161920gLG.LIZJ(IBroadcastService.class);
            if ((c006aLIZJ instanceof BroadcastService) && (broadcastService = (BroadcastService) c006aLIZJ) != null) {
                broadcastService.LLILZIL.put(id, this);
            }
        }
        Iterator<InterfaceC1113710f5V> it2 = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getOnExtendedScreenRegistryReadyListeners().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(DisplaySourceOptionsChannel.class, this.LLJLL);
        }
        enableSubWidgetManager(this.LLILZ, C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        DataChannel dataChannel2 = this.dataChannel;
        TextView textView = (TextView) this.LLJILLL.getValue();
        C20516015Pq c20516015Pq = (C20516015Pq) this.LLJJIII.getValue();
        DataChannel dataChannel3 = this.dataChannel;
        iPublicScreenService.f50(this, dataChannel2, textView, c20516015Pq, (dataChannel3 == null || (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) == null || !C354201Zc.LIZLLL(liveMode)) ? false : true, new InterfaceC1113880f5m() { // from class: X.0f5T
            @Override // X.InterfaceC1113880f5m
            public final void LIZIZ() {
                IPublicScreenHolderWidget iPublicScreenHolderWidget = this.LIZ.LLJJJJJIL;
                if (iPublicScreenHolderWidget != null) {
                    iPublicScreenHolderWidget.hide();
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LIZJ() {
                IPublicScreenContextWidget iPublicScreenContextWidget = this.LIZ.LLJJL;
                if (iPublicScreenContextWidget != null) {
                    iPublicScreenContextWidget.show();
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LIZLLL() {
                C15E5 c15e5 = this.LIZ.LLILLL;
                if (c15e5 != null) {
                    c15e5.i0();
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LJI() {
                IPublicScreenContextWidget iPublicScreenContextWidget = this.LIZ.LLJJL;
                if (iPublicScreenContextWidget != null) {
                    iPublicScreenContextWidget.hide();
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LJIIIIZZ() {
                IPublicScreenHolderWidget iPublicScreenHolderWidget = this.LIZ.LLJJJJJIL;
                if (iPublicScreenHolderWidget != null) {
                    iPublicScreenHolderWidget.show();
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LJ(LiveWidget liveWidget) {
                if (liveWidget != null) {
                    ExtendedScreenWidget extendedScreenWidget = this.LIZ;
                    C1124140fMK.LIZ.add(liveWidget.getClass().getSimpleName());
                    extendedScreenWidget.subWidgetManager.load(R.id.yq5, liveWidget);
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final void LJII(LiveWidget liveWidget) {
                if (liveWidget != null) {
                    this.LIZ.subWidgetManager.unload(liveWidget);
                }
            }

            @Override // X.InterfaceC1113880f5m
            public final LiveRecyclableWidget LJFF(int i, Class cls) {
                return this.LIZ.subWidgetManager.load(i, cls);
            }

            @Override // X.InterfaceC1113880f5m
            public final LiveRecyclableWidget LIZ(int i, C20516015Pq c20516015Pq2, Class cls, Object[] objArr) {
                return this.LIZ.subWidgetManager.load(i, c20516015Pq2, cls, true, objArr);
            }
        });
        LiveExtendedScreenGiftOptimizeSetting liveExtendedScreenGiftOptimizeSetting = LiveExtendedScreenGiftOptimizeSetting.INSTANCE;
        if (liveExtendedScreenGiftOptimizeSetting.removeGiftTray()) {
            View view = (View) this.LLJZ.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = 0;
            marginLayoutParams.topMargin = 0;
            C786410Ut5.W5(view, marginLayoutParams);
            C786410Ut5.LJLLLLLL(8, (View) this.LLJZ.getValue());
            C1090450eTz c1090450eTzZ1 = z1();
            ViewGroup.LayoutParams layoutParams2 = c1090450eTzZ1.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            C786410Ut5.W5(c1090450eTzZ1, marginLayoutParams2);
        }
        if (FullScreenCsCompanionSetting.INSTANCE.getValue(this.dataChannel) > 0) {
            if (!LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled() && LiveHideCrmTipsWidgetSetting.INSTANCE.getValue() == 0) {
                this.subWidgetManager.load(R.id.yq1, ((ICRMGoalService) C1161920gLG.LIZJ(ICRMGoalService.class)).Qs1());
                C1090450eTz c1090450eTzZ12 = z1();
                ViewGroup.LayoutParams layoutParams3 = c1090450eTzZ12.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = 0;
                C786410Ut5.W5(c1090450eTzZ12, marginLayoutParams3);
            }
            this.dataChannel.BQ2(this, ExtendedGiftTrayHeightChange.class, new AwS596S0100000_17(this, 28));
        }
        this.LLJJJJJIL = (IPublicScreenHolderWidget) this.subWidgetManager.load((View) this.LLJJ.getValue(), ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).wL());
        this.subWidgetManager.addRecyclableWidgetEventListener(new RecyclableWidgetEventListener() { // from class: X.0eJy
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIL(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1109770ez9 c1109770ez9Y1;
                C1078300eAO.LJFF(this, c0ulm, liveRecyclableWidget);
                if (Intrinsics.LJFF(this.LIZ.LLJJJJJIL, liveRecyclableWidget) && ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).qD(this.LIZ.LL)) {
                    ExtendedScreenWidget extendedScreenWidget = this.LIZ;
                    extendedScreenWidget.LLJJL = (IPublicScreenContextWidget) extendedScreenWidget.subWidgetManager.load(R.id.ecq, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).M60());
                    ExtendedScreenWidget extendedScreenWidget2 = this.LIZ;
                    IPublicScreenContextWidget iPublicScreenContextWidget = extendedScreenWidget2.LLJJL;
                    if (iPublicScreenContextWidget != null) {
                        IPublicScreenHolderWidget iPublicScreenHolderWidget = extendedScreenWidget2.LLJJJJJIL;
                        if (iPublicScreenHolderWidget != null) {
                            c1109770ez9Y1 = iPublicScreenHolderWidget.y1();
                        } else {
                            c1109770ez9Y1 = null;
                        }
                        iPublicScreenContextWidget.LL = c1109770ez9Y1;
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
            }
        });
        if (!LiveExtendedScreenUiOptimizeSetting.INSTANCE.giftTrayOptimize(this.dataChannel) && !liveExtendedScreenGiftOptimizeSetting.removeGiftTray()) {
            this.subWidgetManager.load((View) this.LLJZ.getValue(), ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getExtendScreenGiftTrayWidget());
        }
        this.subWidgetManager.load((View) this.LLJJIJIIJIL.getValue(), ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).v80());
    }

    public final void B1() {
        this.LLILLJJLI = null;
        C1120000fFe c1120000fFe = this.LLJL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLJLIL);
        }
        C15E5 c15e5 = this.LLILLL;
        if (c15e5 != null) {
            c15e5.LLJJ = null;
            c15e5.LLJJI = null;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        BroadcastService broadcastService;
        if (LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftTraySpaceOptimize()) {
            HandlerHook.viewRemoveCallbacks(z1(), this.LLJJJJ);
            ((ValueAnimator) this.LLJJJ.getValue()).cancel();
            C1090450eTz c1090450eTzZ1 = z1();
            ViewGroup.LayoutParams layoutParams = c1090450eTzZ1.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            C786410Ut5.W5(c1090450eTzZ1, marginLayoutParams);
        }
        C11JF c11jf = this.LLJLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJLLL = null;
        this.LLJLILLLLZIIL = false;
        C15E5 c15e5 = this.LLILLL;
        if (c15e5 != null) {
            c15e5.n0();
        }
        C1120000fFe c1120000fFe = this.LLJL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLJLIL);
        }
        this.LLJJLIIIJLLLLLLLZ = AFwS254S0000000_17.get$arr$(27);
        this.LLJL = null;
        this.LLJLIL = null;
        Room room = this.LL;
        if (room != null) {
            long id = room.getId();
            C006A c006aLIZJ = C1161920gLG.LIZJ(IBroadcastService.class);
            if ((c006aLIZJ instanceof BroadcastService) && (broadcastService = (BroadcastService) c006aLIZJ) != null) {
                broadcastService.LLILZIL.remove(id);
            }
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final int x1() {
        if (FullScreenCsCompanionSetting.INSTANCE.getValue(null) <= 0) {
            return 0;
        }
        Integer num = (Integer) this.dataChannel.gg0(CRMGoalChannel.class);
        return (num == null || num.intValue() != 100) ? 1 : 0;
    }

    public final long y1() {
        DataChannel dataChannel = this.dataChannel;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        long jLIZJ = C963140bAe.LIZJ() - ((room != null ? room.getCreateTime() : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (jLIZJ >= 0) {
            return jLIZJ;
        }
        return 0L;
    }

    public final C1090450eTz z1() {
        return (C1090450eTz) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.15E5] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void C1(InterfaceC782440Umg interfaceC782440Umg) {
        this.LLILLJJLI = interfaceC782440Umg;
        C1120000fFe c1120000fFe = this.LLJL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZIZ(this.LLJLIL);
        }
        C15E5 c15e5 = this.LLILLL;
        if (c15e5 != null) {
            c15e5.setGestureDetectLayout(interfaceC782440Umg);
        }
        ?? r1 = this.LLILLL;
        if (r1 != 0) {
            C09AY c09ay = this.LLJJLIIIJLLLLLLLZ;
            ?? r0 = c09ay;
            if (c09ay == null) {
                r0 = 0;
            }
            r1.setOnScrollListener(r0);
        }
    }

    public final void D1(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams = z1().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = 0;
        }
        if (i2 == i) {
            return;
        }
        ((ValueAnimator) this.LLJJJ.getValue()).cancel();
        ((ValueAnimator) this.LLJJJ.getValue()).setIntValues(i2, i);
        ((ValueAnimator) this.LLJJJ.getValue()).start();
    }

    @Override // X.InterfaceC773000UTy
    public final void LLJIJIL(InterfaceC1113900f5o interfaceC1113900f5o) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(AddDisplaySourceOptionEvent.class, interfaceC1113900f5o);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int iLIZ;
        int i;
        int iLJIJ;
        this.LLILLL = (C15E5) findViewById(R.id.yqa);
        if (FullScreenCsCompanionSetting.INSTANCE.getValue(this.dataChannel) > 0) {
            C15E5 c15e5 = this.LLILLL;
            if (c15e5 != null) {
                c15e5.setPadding(c15e5.getPaddingLeft(), c15e5.getPaddingTop(), c15e5.getPaddingRight(), C439101nJ.LIZ(4));
            }
            ((C16F5) this.LLJJI.getValue()).LJJJI(R.style.a9a);
        }
        LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
        if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(this.dataChannel)) {
            iLIZ = C439101nJ.LIZ(1);
        } else if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(this.dataChannel)) {
            iLIZ = C439101nJ.LIZ(40);
        } else {
            iLIZ = C439101nJ.LIZ(78);
        }
        this.LLJLLIL = iLIZ;
        if (iLIZ > 0) {
            View view = (View) this.LLJJIJI.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i2 = this.LLJLLIL;
                if (C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.dataChannel))) {
                    iLJIJ = C497740JfY.LJIJ();
                } else {
                    iLJIJ = 0;
                }
                marginLayoutParams.topMargin = i2 + iLJIJ;
                C786410Ut5.W5(view, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C20736316Cj.LIZIZ(R.attr.exk, this.context);
        this.LL = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLJL = new C1120000fFe(this.dataChannel);
        C15E5 c15e52 = this.LLILLL;
        InterfaceC782440Umg interfaceC782440Umg = this.LLILLJJLI;
        if (OptimizeEffectGestureSetting.INSTANCE.enable()) {
            i = 2;
        } else {
            i = 7;
        }
        this.LLJLIL = new C782430Umf(interfaceC782440Umg, i, new AwS596S0100000_17(c15e52, 29));
        this.dataChannel.BQ2(this, LiveExtendedScreenMarkViewGuideTouchEvent.class, new AwS596S0100000_17(this, 30));
        if (C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.dataChannel))) {
            C14K9.LJIJJ(this.contentView, new C0TVI() { // from class: X.0f5U
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    int i3 = c20246014Ju.LIZ(7).LIZIZ;
                    View view3 = (View) this.LL.LLJJIJI.getValue();
                    ExtendedScreenWidget extendedScreenWidget = this.LL;
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = i3 + extendedScreenWidget.LLJLLIL;
                        C786410Ut5.W5(view3, marginLayoutParams2);
                        return c20246014Ju;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            });
            C20097313kJ.LIZJ(this.contentView);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean boolValueOf;
        hide();
        C1120000fFe c1120000fFe = this.LLJL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZIZ(this.LLJLIL);
        }
        C15E5 c15e5 = this.LLILLL;
        if (c15e5 != null) {
            c15e5.setGestureDetectLayout(this.LLILLJJLI);
        }
        AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 31);
        this.LLJJLIIIJLLLLLLLZ = awS596S0100000_17;
        C15E5 c15e52 = this.LLILLL;
        if (c15e52 != null) {
            c15e52.setOnScrollListener(awS596S0100000_17);
        }
        C15E5 c15e53 = this.LLILLL;
        if (c15e53 != null) {
            c15e53.setOnSlideBackToMainAfterDrag(new AwS561S0100000_17(this, 47));
        }
        C15E5 c15e54 = this.LLILLL;
        if (c15e54 != null) {
            c15e54.setOnScrollInterceptor(new AwS556S0100000_12(this, 39));
        }
        Room room = this.LL;
        if (room != null) {
            boolValueOf = Boolean.valueOf(C781520UlC.LJII(room));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf) || !GameDualDeviceAndExtendScreenLoadOptEnable.INSTANCE.enableExtendScreenLoadOp()) {
            A1();
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, LinkGuestCountChangeChannel.class, new AwS596S0100000_17(this, 285));
        dataChannel.EQ2(this, MultiLiveRTCLayoutChannel.class, new AwS596S0100000_17(this, 286));
        dataChannel.BQ2(this, LiveExtendScreenCloseEvent.class, new AwS596S0100000_17(this, 287));
        dataChannel.EQ2(this, VoiceChatLayoutChannel.class, new AwS596S0100000_17(this, 288));
        dataChannel.EQ2(this, MultiCoHostAcceptInvitationEvent.class, new AwS596S0100000_17(this, 289));
        dataChannel.EQ2(this, LiveExtendScreenLiveStudioOpenEvent.class, new AwS596S0100000_17(this, 290));
        C784440Upu.LIZ().LIZJ(this, C0IGJ.class).LIZJ(new AfS181S0100000_12(this, 147));
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenExtendedScreenChannel.class, new AwS596S0100000_17(this, 291));
    }
}
