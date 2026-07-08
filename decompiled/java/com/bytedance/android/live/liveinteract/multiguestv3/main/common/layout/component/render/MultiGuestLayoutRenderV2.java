package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render;

import X.AbstractC939760aYw;
import X.AbstractC946520ajq;
import X.C11NJ;
import X.C11PQ;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C2268161DqA;
import X.C415901jZ;
import X.C926770aDz;
import X.C937310aUz;
import X.C938220aWS;
import X.C938230aWT;
import X.C939730aYt;
import X.C942000acY;
import X.C957010b0l;
import X.C957020b0m;
import X.EnumC934000aPe;
import X.InterfaceC921620a5g;
import X.InterfaceC941510abl;
import X.InterfaceC942030acb;
import X.InterfaceC942100aci;
import X.InterfaceC951900asW;
import X.ViewTreeObserverOnGlobalLayoutListenerC940070aZR;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutMonitorSetting;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLayoutRenderV2 extends AbstractC939760aYw implements LifecycleOwner {
    public static final C11PQ<Boolean> LLJJIII;
    public final boolean LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final DataChannel LLILZIL;
    public final Map<String, InterfaceC942030acb> LLILZLL;
    public final InterfaceC941510abl LLIZ;
    public final C938220aWS LLJ;
    public final InterfaceC942100aci LLJIJIL;
    public AbstractC946520ajq LLJILJIL;
    public C2268161DqA LLJILJILJ;
    public final C415901jZ LLJILLL;
    public final C942000acY LLJJ;
    public final ViewTreeObserverOnGlobalLayoutListenerC940070aZR LLJJI;
    public final LifecycleRegistry LLIZLLLIL = new LifecycleRegistry(this);
    public final C11NJ LLJI = new C11NJ();

    public static final class EnterBackgroundEvent extends Event<Unit> {
        public static final int $stable = 8;
    }

    public static final class EnterForegroundEvent extends Event<Unit> {
        public static final int $stable = 8;
    }

    public static final class LayoutEndEvent extends Event<Unit> {
        public static final int $stable = 8;
    }

    public static final class RoleChannel extends Channel<List<? extends EnumC934000aPe>> {
        public static final int $stable = 8;

        public RoleChannel() {
            super(C13BV.INSTANCE);
        }
    }

    public static final class SwitchLayoutEvent extends Event<Unit> {
        public static final int $stable = 8;
    }

    @Override // X.AbstractC939760aYw
    public final String LJIIIIZZ() {
        return "MultiGuestLayoutRenderV2";
    }

    static {
        C11PQ<Boolean> c11pq = new C11PQ<>();
        c11pq.onNext(Boolean.FALSE);
        LLJJIII = c11pq;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    @Override // X.AbstractC939760aYw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a7, blocks: (B:23:0x0088, B:25:0x0090, B:27:0x009b, B:28:0x00a1), top: B:34:0x0088 }] */
    @Override // X.AbstractC939760aYw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2.LIZJ():void");
    }

    @Override // X.AbstractC939760aYw
    public final FrameLayout LJIIIZ() {
        ViewGroup viewGroup = this.LLILZ;
        if (viewGroup instanceof FrameLayout) {
            return (FrameLayout) viewGroup;
        }
        return null;
    }

    @Override // X.AbstractC939760aYw
    public final void LJIIJJI() {
        C937310aUz.LJII("MultiGuestLayoutRenderV2", "onPause");
        ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(this.LLILLL);
        if (iLinkStateAbilityLIZJ != null) {
            iLinkStateAbilityLIZJ.Ny(2, null);
        }
        this.LLILZIL.LC0(EnterBackgroundEvent.class, Unit.LIZ);
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILIIL() {
        C937310aUz.LJII("MultiGuestLayoutRenderV2", "onResume");
        ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(this.LLILLL);
        if (iLinkStateAbilityLIZJ != null) {
            iLinkStateAbilityLIZJ.Ny(1, null);
        }
        this.LLILZIL.LC0(EnterForegroundEvent.class, Unit.LIZ);
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILJJIL() {
        this.LLJ.LJIIL();
    }

    @Override // X.AbstractC939760aYw
    public final boolean LJIILL() {
        List list = (List) this.LLILZIL.gg0(RoleChannel.class);
        return (list == null || C13LP.LJJJLL(list) == null) ? false : true;
    }

    @Override // X.AbstractC939760aYw
    public final C938220aWS LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC939760aYw
    public final DataChannel LJII() {
        return this.LLILZIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // X.AbstractC939760aYw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.util.Map<X.EnumC939920aZC, java.util.List<X.EnumC939900aZA>>> LIZLLL(X.C957020b0m r4) {
        /*
            r3 = this;
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r4.getMultiGuestExtra()
            if (r0 == 0) goto L1a
            tikcast.linkmic.common.SocialGameUserSpotExtra r0 = r0.socialGameUser
            if (r0 == 0) goto L1a
            boolean r1 = r0.isMainContent
            r0 = 1
            if (r1 != r0) goto L1a
        Lf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            r0 = 4
            kotlin.Pair r0 = X.AbstractC939760aYw.LJ(r3, r4, r2, r1, r0)
            return r0
        L1a:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2.LIZLLL(X.0b0m):kotlin.Pair");
    }

    @Override // X.AbstractC939760aYw
    public final void LJIIL(C957020b0m c957020b0m) {
        String str;
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null) {
            this.LLJ.LIZJ(str, true, c957020b0m.LLJIJIL);
        }
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILLIIL(EnumC934000aPe enumC934000aPe) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRole role=");
        sbLIZ.append(enumC934000aPe);
        C937310aUz.LJII("MultiGuestLayoutRenderV2", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(this.LLILZLL.values())) {
            if (interfaceC942030acb != null) {
                interfaceC942030acb.LJIIIIZZ(enumC934000aPe);
            }
        }
        this.LLILZIL.zW(RoleChannel.class, Collections.singletonList(enumC934000aPe));
    }

    @Override // X.AbstractC939760aYw
    public final void D2(long j, String str) {
        C11PQ<Long> c11pq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAvatarChangeState linkMicId=");
        sbLIZ.append(str);
        sbLIZ.append(" avatarId=");
        sbLIZ.append(j);
        C937310aUz.LJII("MultiGuestLayoutRenderV2", C2188811AlT.LIZIZ(sbLIZ));
        C938220aWS c938220aWS = this.LLJ;
        c938220aWS.getClass();
        C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
        if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LJIILJJIL) != null) {
            c11pq.onNext(Long.valueOf(j));
        }
    }

    @Override // X.AbstractC939760aYw
    public final C939730aYt LJIIZILJ(C939730aYt c939730aYt, C957020b0m c957020b0m) {
        C939730aYt c939730aYtLJIILLIIL = c939730aYt;
        for (InterfaceC942030acb interfaceC942030acb : C13LP.LLIIII(this.LLILZLL.values())) {
            if (interfaceC942030acb != null) {
                c939730aYtLJIILLIIL = interfaceC942030acb.LJIILLIIL(c939730aYt, c957020b0m);
            } else {
                c939730aYtLJIILLIIL = null;
            }
        }
        return c939730aYtLJIILLIIL;
    }

    public final void LJIJI(int i, int i2) {
        InterfaceC951900asW interfaceC951900asW;
        InterfaceC951900asW interfaceC951900asW2;
        if (i == 1 && (interfaceC951900asW2 = (InterfaceC951900asW) this.LLILZIL.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJIL();
        }
        if (i == i2 && (interfaceC951900asW = (InterfaceC951900asW) this.LLILZIL.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW.LJIIL(System.currentTimeMillis());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0aZR] */
    public MultiGuestLayoutRenderV2(boolean z, InterfaceC921620a5g interfaceC921620a5g, ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel, Map<String, InterfaceC942030acb> map, InterfaceC941510abl interfaceC941510abl) {
        Object next;
        InterfaceC942100aci interfaceC942100aci;
        this.LLILLJJLI = z;
        this.LLILLL = viewGroup;
        this.LLILZ = viewGroup2;
        this.LLILZIL = dataChannel;
        this.LLILZLL = map;
        this.LLIZ = interfaceC941510abl;
        this.LLJ = new C938220aWS(dataChannel, z, interfaceC921620a5g);
        Iterator<T> it2 = map.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof InterfaceC942100aci) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof InterfaceC942100aci) {
            interfaceC942100aci = (InterfaceC942100aci) next;
        } else {
            interfaceC942100aci = null;
        }
        this.LLJIJIL = interfaceC942100aci;
        this.LLJILLL = MultiGuestLayoutMonitorSetting.INSTANCE.enable() ? new C415901jZ() : null;
        this.LLJJ = new C942000acY(this);
        final WeakReference weakReference = new WeakReference(this.LLILZ);
        this.LLJJI = new ViewTreeObserver.OnGlobalLayoutListener(weakReference) { // from class: X.0aZR
            public final WeakReference<ViewGroup> LL;
            public int LLILLJJLI;
            public int LLILLL;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
                InterfaceC940060aZQ interfaceC940060aZQ;
                InterfaceC940060aZQ interfaceC940060aZQ2;
                ViewGroup viewGroup3 = this.LL.get();
                if (viewGroup3 != null) {
                    if (viewGroup3.getWidth() == this.LLILLJJLI && viewGroup3.getHeight() == this.LLILLL) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onGlobalLayout height=");
                    sbLIZ.append(viewGroup3.getHeight());
                    sbLIZ.append(", conH=");
                    sbLIZ.append(this.LLILLL);
                    C937310aUz.LIZLLL("MultiGuestLayoutRenderV2", C2188811AlT.LIZIZ(sbLIZ));
                    if (viewGroup3 instanceof FrameLayout) {
                        C931800aM6.LIZ.getClass();
                        if (C931800aM6.LIZIZ()) {
                            Rect rect = new Rect(viewGroup3.getLeft(), viewGroup3.getTop(), viewGroup3.getRight(), viewGroup3.getBottom());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onGlobalLayout updateParentContainerView1, ");
                            sbLIZ2.append(rect);
                            C937310aUz.LIZLLL("MultiGuestLayoutRenderV2", C2188811AlT.LIZIZ(sbLIZ2));
                            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
                            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ2 = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                                interfaceC940060aZQ2.LLIIJI(rect, new C917100ZyO("onGlobalLayout", String.valueOf(System.currentTimeMillis())));
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onGlobalLayout updateParentContainerView2, w:");
                            sbLIZ3.append(viewGroup3.getWidth());
                            sbLIZ3.append(", h:");
                            sbLIZ3.append(viewGroup3.getHeight());
                            C937310aUz.LIZLLL("MultiGuestLayoutRenderV2", C2188811AlT.LIZIZ(sbLIZ3));
                            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2 != null ? interfaceC954180awCLLJLL2.LLIIJLIL() : null;
                            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                                interfaceC940060aZQ.LLFFF(viewGroup3, new C917100ZyO("onGlobalLayout", String.valueOf(System.currentTimeMillis())));
                            }
                        }
                    }
                    this.LLILLJJLI = viewGroup3.getWidth();
                    this.LLILLL = viewGroup3.getHeight();
                }
            }

            {
                this.LL = weakReference;
            }
        };
    }
}
