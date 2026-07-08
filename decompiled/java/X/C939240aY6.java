package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939240aY6 extends AbstractC939760aYw implements LifecycleOwner {
    public static final C11PQ<Boolean> LLJJLIIIJLLLLLLLZ;
    public final boolean LLILLJJLI;
    public final ViewGroup LLILLL;
    public final DataChannel LLILZ;
    public final LifecycleRegistry LLILZIL = new LifecycleRegistry(this);
    public final FrameLayout LLILZLL;
    public final C11NJ LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public C943360aek LLJJIII;
    public final C921900a68 LLJJIJI;
    public C2268161DqA LLJJIJIIJIL;
    public final C415901jZ LLJJIJIL;
    public final C941990acX LLJJJ;
    public final C938220aWS LLJJJIL;
    public final C920300a3Y LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final ViewTreeObserverOnGlobalLayoutListenerC940080aZS LLJJJJLIIL;
    public AbstractC946520ajq LLJJL;

    @Override // X.AbstractC939760aYw
    public final String LJIIIIZZ() {
        return "MultiGuestLayoutRender";
    }

    static {
        C11PQ<Boolean> c11pq = new C11PQ<>();
        c11pq.onNext(Boolean.FALSE);
        LLJJLIIIJLLLLLLLZ = c11pq;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    @Override // X.AbstractC939760aYw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939240aY6.LIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0206 A[Catch: Exception -> 0x020c, TRY_LEAVE, TryCatch #0 {Exception -> 0x020c, blocks: (B:73:0x01ed, B:75:0x01f5, B:77:0x0200, B:78:0x0206), top: B:91:0x01ed }] */
    @Override // X.AbstractC939760aYw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939240aY6.LIZJ():void");
    }

    @Override // X.AbstractC939760aYw
    public final void LJIIJJI() {
        C937310aUz.LJII("MultiGuestLayoutRender", "onPause");
        ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(this.LLILLL);
        if (iLinkStateAbilityLIZJ != null) {
            iLinkStateAbilityLIZJ.Ny(2, null);
        }
        this.LLILZ.LC0(MultiGuestLayoutRenderV2.EnterBackgroundEvent.class, Unit.LIZ);
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILIIL() {
        C937310aUz.LJII("MultiGuestLayoutRender", "onResume");
        ILinkStateAbility iLinkStateAbilityLIZJ = C926770aDz.LIZJ(this.LLILLL);
        if (iLinkStateAbilityLIZJ != null) {
            iLinkStateAbilityLIZJ.Ny(1, null);
        }
        this.LLILZ.LC0(MultiGuestLayoutRenderV2.EnterForegroundEvent.class, Unit.LIZ);
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILJJIL() {
        this.LLJJJIL.LJIIL();
    }

    public final EnumC934000aPe LJIJI() {
        List list = (List) this.LLILZ.gg0(MultiGuestLayoutRenderV2.RoleChannel.class);
        if (list != null) {
            return (EnumC934000aPe) C13LP.LJJJLL(list);
        }
        return null;
    }

    @Override // X.AbstractC939760aYw
    public final boolean LJIILL() {
        return LJIJI() != null;
    }

    @Override // X.AbstractC939760aYw
    public final C938220aWS LJI() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC939760aYw
    public final DataChannel LJII() {
        return this.LLILZ;
    }

    @Override // X.AbstractC939760aYw
    public final FrameLayout LJIIIZ() {
        return this.LLILZLL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C939240aY6.LIZLLL(X.0b0m):kotlin.Pair");
    }

    @Override // X.AbstractC939760aYw
    public final void LJIIL(C957020b0m c957020b0m) {
        String str;
        PosIdentity posIdentity = c957020b0m.getPosIdentity();
        if (posIdentity != null && posIdentity.type == 1 && (str = posIdentity.value) != null) {
            this.LLJJJIL.LIZJ(str, true, c957020b0m.LLJIJIL);
        }
    }

    @Override // X.AbstractC939760aYw
    public final void LJIILLIIL(EnumC934000aPe enumC934000aPe) {
        LinkStatusViewModel linkStatusViewModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchRole role=");
        sbLIZ.append(enumC934000aPe);
        C937310aUz.LJII("MultiGuestLayoutRender", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC934000aPe != EnumC934000aPe.ANCHOR && enumC934000aPe != EnumC934000aPe.GUEST) {
            if (enumC934000aPe == EnumC934000aPe.AUDIENCE) {
                C937310aUz.LIZLLL("MultiGuestLayoutRender", "uninstallAbility");
                InterfaceC665370Q7z interfaceC665370Q7zLJ = C1555540qa8.LJ(this.LLILLL);
                if (interfaceC665370Q7zLJ != null) {
                    InterfaceC494301wD interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null);
                    if ((interfaceC494301wDLIZIZ instanceof LinkStatusViewModel) && (linkStatusViewModel = (LinkStatusViewModel) interfaceC494301wDLIZIZ) != null) {
                        linkStatusViewModel.eB1(interfaceC665370Q7zLJ);
                    }
                    C926770aDz.LIZ(interfaceC665370Q7zLJ, false);
                }
                ((C938400aWk) this.LLJILJILJ.getValue()).LIZ();
            }
        } else {
            C937310aUz.LIZLLL("MultiGuestLayoutRender", "installAbility");
            Fragment fragmentLIZ = C946803n0.LIZ(this.LLILLL);
            if (fragmentLIZ != null) {
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(LinkStatusViewModel.class);
                LinkStatusViewModel linkStatusViewModel2 = (LinkStatusViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new C940900aam(), new AwS134S0110000_16(fragmentLIZ, 7), new AwS134S0110000_16(fragmentLIZ, 6), new C987103tV(fragmentLIZ, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
                InterfaceC665370Q7z interfaceC665370Q7zLIZLLL = C1555540qa8.LIZLLL(this.LLILLL);
                C926770aDz.LIZ(interfaceC665370Q7zLIZLLL, true);
                linkStatusViewModel2.iT0(interfaceC665370Q7zLIZLLL);
                ((C938400aWk) this.LLJILJILJ.getValue()).LIZLLL(linkStatusViewModel2);
            }
        }
        this.LLILZ.zW(MultiGuestLayoutRenderV2.RoleChannel.class, Collections.singletonList(enumC934000aPe));
    }

    @Override // X.AbstractC939760aYw
    public final void D2(long j, String str) {
        C11PQ<Long> c11pq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAvatarChangeState linkmicId=");
        sbLIZ.append(str);
        sbLIZ.append(" avatarId=");
        sbLIZ.append(j);
        C937310aUz.LJII("MultiGuestLayoutRender", C2188811AlT.LIZIZ(sbLIZ));
        C938220aWS c938220aWS = this.LLJJJIL;
        c938220aWS.getClass();
        C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
        if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LJIILJJIL) != null) {
            c11pq.onNext(Long.valueOf(j));
        }
    }

    public final void LJIJJ(int i, int i2) {
        InterfaceC951900asW interfaceC951900asW;
        InterfaceC951900asW interfaceC951900asW2;
        if (i == 1 && (interfaceC951900asW2 = (InterfaceC951900asW) this.LLILZ.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJIL();
        }
        if (i == i2 && (interfaceC951900asW = (InterfaceC951900asW) this.LLILZ.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW.LJIIL(System.currentTimeMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0a68] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0aZS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C939240aY6(boolean r7, X.InterfaceC921620a5g r8, android.view.ViewGroup r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939240aY6.<init>(boolean, X.0a5g, android.view.ViewGroup, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
