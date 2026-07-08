package com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.ui.interactsolo;

import X.C1143680frq;
import X.C1295090jo3;
import X.C1295960jpS;
import X.C1296280jpy;
import X.C13LQ;
import X.C16F5;
import X.C1909890znf;
import X.C20441214yg;
import X.C214827195l;
import X.C214831195p;
import X.C214833195r;
import X.C214834195s;
import X.C214835195t;
import X.C214836195u;
import X.C214837195v;
import X.C2188811AlT;
import X.C419910GdJ;
import X.C439101nJ;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC214828195m;
import X.InterfaceC1294390jmv;
import X.InterfaceC1295080jo2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.quickcohost.PreferenceTagsChangedChannel;
import com.bytedance.android.live.liveinteract.multihost.core.model.NewLayoutWindowStateChangeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class QuickCoHostInteractSoloHostWidget extends LiveRecyclableWidget {
    public final C214831195p LL;
    public C214827195l LLILLJJLI;
    public final C214833195r LLILLL;
    public final C214836195u LLILZ;
    public final C214837195v LLILZIL;
    public final C214835195t LLILZLL;
    public final C214834195s LLIZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i26;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() throws Throwable {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        Bitmap bitmap;
        C214827195l c214827195l = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnload — tearing down components + clearing registry (layoutGeometryComponent=");
        sbLIZ.append(c214827195l != null);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("QuickCoHostInteractSoloHostWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (c214827195l == null) {
            C20441214yg.LJIIL("QuickCoHostInteractSoloHostWidget", "onUnload — layoutGeometryComponent NEVER INITIALISED (onLoad never ran on this widget instance!)");
        } else {
            DataChannel dataChannel = c214827195l.LIZ;
            if (dataChannel != null) {
                dataChannel.zQ2(c214827195l);
            }
            c214827195l.LIZIZ.LIZJ = null;
            View view = c214827195l.LJI;
            if (view != null) {
                view.removeOnLayoutChangeListener(c214827195l.LJIILIIL);
            }
            c214827195l.LJI = null;
            ViewGroup viewGroup = c214827195l.LJIIJ;
            if (viewGroup != null) {
                viewGroup.removeOnLayoutChangeListener(c214827195l.LJIIJJI);
            }
            c214827195l.LJIIJ = null;
            c214827195l.LJII = false;
            c214827195l.LJIIIIZZ = false;
            c214827195l.LJIIIZ = false;
            c214827195l.LJFF = null;
            c214827195l.LJIIL++;
            c214827195l.LIZJ = null;
            c214827195l.LIZLLL = null;
            c214827195l.LJ = false;
        }
        C214833195r c214833195r = this.LLILLL;
        c214833195r.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onUnload — T067z: finalCallbackCountThisCycle=");
        sbLIZ2.append(c214833195r.LJJIJ);
        sbLIZ2.append(" lastLoggedPayload=(dx=");
        sbLIZ2.append(c214833195r.LJJIJIIJI);
        sbLIZ2.append(", dy=");
        sbLIZ2.append(c214833195r.LJJIJIIJIL);
        sbLIZ2.append("); T067za scaleCallbackCount=");
        sbLIZ2.append(c214833195r.LJJIJIL);
        sbLIZ2.append(" lastLoggedScale=");
        sbLIZ2.append(c214833195r.LJJIJL);
        sbLIZ2.append('.');
        C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
        c214833195r.LJJII();
        c214833195r.LJIIJJI();
        C1295960jpS c1295960jpS = c214833195r.LIZIZ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = c214833195r.LIZJ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        c214833195r.LJJI++;
        c214833195r.LJJIFFI++;
        c214833195r.LIZIZ = null;
        c214833195r.LIZJ = null;
        c214833195r.LIZLLL = null;
        c214833195r.LJ = null;
        c214833195r.LJIIIIZZ = null;
        c214833195r.LJFF = null;
        c214833195r.LJIILIIL = null;
        c214833195r.LJIILL = null;
        c214833195r.LJIILLIIL = null;
        c214833195r.LJIIL();
        if (c214833195r.LJIJJ && (bitmap = c214833195r.LJIJI) != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        c214833195r.LJIJI = null;
        c214833195r.LJIJJ = false;
        c214833195r.LJIL = false;
        c214833195r.LJJ = false;
        c214833195r.LJJII = false;
        c214833195r.LJJIII = false;
        c214833195r.LJJIIJ = false;
        c214833195r.LJJIIZ = false;
        C214831195p c214831195p = c214833195r.LIZ;
        if (c214831195p != null) {
            c214831195p.LIZIZ();
        }
        EnumC214828195m enumC214828195m = EnumC214828195m.LARGE;
        c214833195r.LJJIIZI = enumC214828195m;
        c214833195r.LJIILJJIL = "";
        C214836195u c214836195u = this.LLILZ;
        c214836195u.LJI.removeCallbacks(c214836195u.LJII);
        View view2 = c214836195u.LIZIZ;
        if (view2 != null) {
            C786410Ut5.I7(null, view2);
        }
        ImageView imageView = c214836195u.LIZJ;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        c214836195u.LIZIZ = null;
        c214836195u.LIZJ = null;
        c214836195u.LJ = false;
        c214836195u.LJFF = false;
        c214836195u.LIZLLL = enumC214828195m;
        C214837195v c214837195v = this.LLILZIL;
        View view3 = c214837195v.LIZ;
        if (view3 != null && (viewPropertyAnimatorAnimate3 = view3.animate()) != null) {
            viewPropertyAnimatorAnimate3.cancel();
        }
        c214837195v.LIZ = null;
        C214835195t c214835195t = this.LLILZLL;
        c214835195t.LJ++;
        C16F5 c16f5 = c214835195t.LIZ;
        if (c16f5 != null && (viewPropertyAnimatorAnimate2 = c16f5.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        c214835195t.LIZ = null;
        c214835195t.LIZJ = false;
        c214835195t.LIZLLL = false;
        c214835195t.LIZIZ = enumC214828195m;
        C214834195s c214834195s = this.LLIZ;
        c214834195s.LJ++;
        c214834195s.LIZLLL = false;
        c214834195s.LIZIZ.removeCallbacksAndMessages(null);
        C16F5 c16f52 = c214834195s.LIZ;
        if (c16f52 != null && (viewPropertyAnimatorAnimate = c16f52.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        C16F5 c16f53 = c214834195s.LIZ;
        if (c16f53 != null) {
            C786410Ut5.l8(c16f53, null);
        }
        c214834195s.LIZ = null;
        c214834195s.LIZJ = enumC214828195m;
        DataChannelGlobal.LLILZ.zQ2(this);
        C214831195p c214831195p2 = this.LL;
        ((ArrayList) c214831195p2.LIZ).clear();
        c214831195p2.LIZJ = null;
        c214831195p2.LIZIZ = false;
        this.LLILLJJLI = null;
    }

    public QuickCoHostInteractSoloHostWidget() {
        C214831195p c214831195p = new C214831195p();
        this.LL = c214831195p;
        this.LLILLL = new C214833195r(c214831195p);
        this.LLILZ = new C214836195u(c214831195p);
        this.LLILZIL = new C214837195v();
        this.LLILZLL = new C214835195t();
        this.LLIZ = new C214834195s();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object objLJJIFFI;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        ViewGroup viewGroup;
        C16F5 c16f5 = null;
        if (objArr != null) {
            objLJJIFFI = C13LQ.LJJIFFI(objArr);
        } else {
            objLJJIFFI = null;
        }
        if (objLJJIFFI instanceof DataChannel) {
            dataChannel = (DataChannel) objLJJIFFI;
        } else {
            dataChannel = null;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel == null) {
            dataChannel2 = dataChannel3;
        } else {
            dataChannel2 = dataChannel;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoad — explicitDc=");
        sbLIZ.append(dataChannel);
        sbLIZ.append(" frameworkDc=");
        sbLIZ.append(dataChannel3);
        sbLIZ.append(" effective=");
        sbLIZ.append(dataChannel2);
        C20441214yg.LJIIIZ("QuickCoHostInteractSoloHostWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel2 == null) {
            C20441214yg.LJIIL("QuickCoHostInteractSoloHostWidget", "onLoad — both explicit AND framework dataChannel are null; LayoutGeometryComponent will silently no-op");
        } else if (dataChannel == null) {
            C20441214yg.LJIIL("QuickCoHostInteractSoloHostWidget", "onLoad — explicit dataChannel is null (args missing or wrong type); falling back to framework dataChannel");
        } else if (dataChannel3 == null) {
            C20441214yg.LJIIL("QuickCoHostInteractSoloHostWidget", "onLoad — framework dataChannel is null; using explicit dataChannel from bind args");
        }
        C214831195p c214831195p = this.LL;
        C214827195l c214827195l = new C214827195l(dataChannel2, c214831195p);
        this.LLILLJJLI = c214827195l;
        C20441214yg.LJIIIZ("QuickCoHostInteractSoloHostWidget", "onLoad — registering components + invoking onLoad on each");
        this.LL.LIZJ(c214827195l);
        this.LL.LIZJ(this.LLILLL);
        this.LL.LIZJ(this.LLILZ);
        this.LL.LIZJ(this.LLILZIL);
        this.LL.LIZJ(this.LLILZLL);
        this.LL.LIZJ(this.LLIZ);
        View view = this.contentView;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        c214827195l.LIZJ = viewGroup;
        if (viewGroup == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLoad — host is not a ViewGroup (got ");
            sbLIZ2.append(view.getClass().getSimpleName());
            sbLIZ2.append("); geometry component cannot resize the container, observer NOT registered. Did the widget XML root change?");
            C20441214yg.LJIIL("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C786410Ut5.LJLZ(8, viewGroup);
            if (dataChannel2 == null) {
                C20441214yg.LJIIL("LayoutGeometryComponent", "onLoad — dataChannel is null, observer NOT registered, overlay positioning WILL be broken");
            } else {
                dataChannel2.CQ2(NewLayoutWindowStateChangeMessage.class, c214827195l, new AwS611S0100000_32(c214827195l, 389));
                c214831195p.LIZJ = new AwS576S0100000_32(c214827195l, 871);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onLoad — observer + layout-reapply callback registered, container=");
                sbLIZ3.append(c214827195l.LIZJ);
                C20441214yg.LJIIIZ("LayoutGeometryComponent", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        final C214833195r c214833195r = this.LLILLL;
        View view2 = this.contentView;
        c214833195r.getClass();
        C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", "onLoad");
        c214833195r.LJIIIIZZ = view2;
        c214833195r.LIZIZ = (C1295960jpS) view2.findViewById(R.id.nrs);
        c214833195r.LIZJ = (C1295960jpS) view2.findViewById(R.id.nrt);
        c214833195r.LIZLLL = (ImageView) view2.findViewById(R.id.sm_);
        c214833195r.LJ = view2.findViewById(R.id.q3_);
        c214833195r.LJFF = (ImageView) view2.findViewById(R.id.smc);
        c214833195r.LJIILIIL = (C16F5) view2.findViewById(R.id.q3b);
        c214833195r.LJIILL = view2.findViewById(R.id.q3a);
        c214833195r.LJIILLIIL = (ImageView) view2.findViewById(R.id.k2g);
        C1295960jpS c1295960jpS = c214833195r.LIZIZ;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = c214833195r.LIZJ;
        if (c1295960jpS2 != null) {
            C786410Ut5.LLD(8, c1295960jpS2);
        }
        ImageView imageView = c214833195r.LIZLLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        ImageView imageView2 = c214833195r.LJFF;
        if (imageView2 != null) {
            C786410Ut5.LJZI(8, imageView2);
        }
        C16F5 c16f52 = c214833195r.LJIILIIL;
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 8);
        }
        View view3 = c214833195r.LJIILL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        c214833195r.LJIIL();
        EnumC214828195m enumC214828195m = EnumC214828195m.LARGE;
        c214833195r.LJJIIZI = enumC214828195m;
        c214833195r.LJIIIZ();
        ImageView imageView3 = c214833195r.LJIILLIIL;
        if (imageView3 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C439101nJ.LIZ(10);
            c419910GdJ.LIZJ = C439101nJ.LIZ(10);
            c419910GdJ.LIZ = R.raw.icon_music_spotlight;
            c419910GdJ.LJ = Integer.valueOf(R.attr.exg);
            imageView3.setImageDrawable(c419910GdJ.LIZ(imageView3.getContext()));
        }
        ImageView imageView4 = c214833195r.LIZLLL;
        if (imageView4 != null) {
            C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", "loadSearchAvatarPlaceholder channel=tiktok_live_interaction_demand_19 file=quick_cohost_search_avatar.png");
            C1143680frq.LJFF(imageView4, "tiktok_live_interaction_demand_19", "quick_cohost_search_avatar.png", ImageView.ScaleType.FIT_CENTER, new C1909890znf());
        }
        C1295960jpS c1295960jpS3 = c214833195r.LIZJ;
        if (c1295960jpS3 != null) {
            c1295960jpS3.setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0jq2
                @Override // X.InterfaceC1294390jmv
                public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                    String str = c1294320jmo.LIZJ;
                    if (Intrinsics.LJFF(str, "image_0")) {
                        return c214833195r.LJIIZILJ;
                    }
                    if (Intrinsics.LJFF(str, "image_1")) {
                        return c214833195r.LJJIII(c1294320jmo.LIZ, c1294320jmo.LIZIZ);
                    }
                    return null;
                }
            });
        }
        c214833195r.LJIILJJIL("onLoad");
        c214833195r.LJIILL("onLoad");
        C1295960jpS c1295960jpS4 = c214833195r.LIZJ;
        if (c1295960jpS4 != null) {
            c1295960jpS4.addValueCallback(new C1295090jo3("Light.png"), InterfaceC1295080jo2.LIZLLL, new C1296280jpy());
        }
        C214836195u c214836195u = this.LLILZ;
        View view4 = this.contentView;
        c214836195u.getClass();
        c214836195u.LIZLLL = enumC214828195m;
        c214836195u.LJ = false;
        c214836195u.LJFF = false;
        View viewFindViewById = view4.findViewById(R.id.ro4);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0bCs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    C20441214yg.LJIIIZ("PreferenceEntranceHintComponent", "hint tapped — opening preference panel via SEARCHING_OVERLAY");
                    Map mapLJJJ = C955400ayA.LJJJ("cohost_window");
                    if (mapLJJJ != null) {
                        C955400ayA.LLIILII("livesdk_connection_preference_entrace_click", mapLJJJ);
                    }
                    InterfaceC964570bCx.LIZ.getClass();
                    if (C964580bCy.LIZIZ == null && !C964580bCy.LIZJ) {
                        C964580bCy.LIZJ = true;
                        try {
                            Class.forName("vj0.d");
                        } catch (ClassNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    InterfaceC964570bCx interfaceC964570bCx = C964580bCy.LIZIZ;
                    if (interfaceC964570bCx != null) {
                        interfaceC964570bCx.LIZ(view5.getContext(), EnumC964540bCu.SEARCHING_OVERLAY);
                    }
                }
            }, viewFindViewById);
        } else {
            viewFindViewById = null;
        }
        c214836195u.LIZIZ = viewFindViewById;
        ImageView imageView5 = (ImageView) view4.findViewById(R.id.k2x);
        if (imageView5 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C439101nJ.LIZ(24);
            c419910GdJ2.LIZJ = C439101nJ.LIZ(24);
            c419910GdJ2.LIZ = R.raw.icon_arrow_right_circle_fill;
            c419910GdJ2.LIZLLL = Integer.valueOf(C497740JfY.LJFF(R.color.a_7));
            imageView5.setImageDrawable(c419910GdJ2.LIZ(imageView5.getContext()));
        } else {
            imageView5 = null;
        }
        c214836195u.LIZJ = imageView5;
        C214837195v c214837195v = this.LLILZIL;
        View view5 = this.contentView;
        c214837195v.getClass();
        View viewFindViewById2 = view5.findViewById(R.id.ug_);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.T4(viewFindViewById2, 1.0f);
        } else {
            viewFindViewById2 = null;
        }
        c214837195v.LIZ = viewFindViewById2;
        C214835195t c214835195t = this.LLILZLL;
        View view6 = this.contentView;
        c214835195t.getClass();
        c214835195t.LIZIZ = enumC214828195m;
        c214835195t.LIZJ = false;
        c214835195t.LIZLLL = false;
        c214835195t.LJ = 0;
        C16F5 c16f53 = (C16F5) view6.findViewById(R.id.uen);
        if (c16f53 != null) {
            C786410Ut5.LLJJJJ(c16f53, 8);
            C786410Ut5.k5(c16f53, 1.0f);
        } else {
            c16f53 = null;
        }
        c214835195t.LIZ = c16f53;
        C214834195s c214834195s = this.LLIZ;
        View view7 = this.contentView;
        c214834195s.LIZLLL = false;
        c214834195s.LJ = 0;
        C16F5 c16f54 = (C16F5) view7.findViewById(R.id.db3);
        if (c16f54 != null) {
            C786410Ut5.LLJJJJ(c16f54, 8);
            C786410Ut5.k5(c16f54, 1.0f);
            C786410Ut5.l8(c16f54, new View.OnClickListener() { // from class: X.0Zuo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view8) {
                    C20441214yg.LJIIIZ("CancelCountdownComponent", "cancel tapped → quitQuickCoHost(CANCEL_BUTTON_CLICKED)");
                    C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.CANCEL_BUTTON_CLICKED, null);
                }
            });
            c16f5 = c16f54;
        }
        c214834195s.LIZ = c16f5;
        c214834195s.LIZJ = enumC214828195m;
        c214834195s.LIZ();
        DataChannelGlobal.LLILZ.CQ2(PreferenceTagsChangedChannel.class, this, new AwS597S0100000_18(this, 47));
    }
}
