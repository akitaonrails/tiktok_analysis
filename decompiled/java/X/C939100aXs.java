package X;

import Y.AObjectS382S0100000_7;
import Y.ARunnableS115S0100000_15;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.monitor.MultiGuestMonitorExternalEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.HadInitLinkMicChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3CanExposeForPlayerOptChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3ShowEmptyViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.MultiGuestLayoutMonitorSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizePlayerHandler;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveViewPagerOnMeasureOptSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939100aXs implements InterfaceC463170IEh, LifecycleOwner {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final ViewGroup LL;
    public final DataChannel LLILLJJLI;
    public final Fragment LLILLL;
    public C945320ahu LLILZ;
    public Rect LLILZIL = new Rect();
    public Pair<Integer, Integer> LLILZLL = new Pair<>(0, 0);
    public final List<InterfaceC939110aXt> LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public Function0<String> LLJIJIL;
    public final C01GW LLJILJIL;
    public EnumC939140aXw LLJILJILJ;
    public final C01GW LLJILLL;
    public final AwS594S0100000_15 LLJJ;
    public final AwS594S0100000_15 LLJJI;
    public final AwS594S0100000_15 LLJJIII;
    public final C915610Zvz LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final ARunnableS115S0100000_15 LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public MultiGuestThemeViewModel LLJJJJLIIL;
    public MultiGuestSharedBgGuestViewModel LLJJL;

    @Override // X.InterfaceC463170IEh
    public final void LIZLLL() {
        if (this.LLJJJJ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_tryReInit");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<InterfaceC939110aXt> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().init();
        }
        LJIILLIIL(true);
    }

    public final InterfaceC939110aXt LJIIIZ() {
        List<InterfaceC939110aXt> list = this.LLIZ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC939110aXt interfaceC939110aXt : list) {
            if (interfaceC939110aXt.scene() == this.LLIZLLLIL) {
                arrayList.add(interfaceC939110aXt);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() <= 1) {
            return (InterfaceC939110aXt) ListProtector.get(arrayList, 0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_getCurrentSceneHandle size is larger than 1");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public final InterfaceC937900aVw LJIIJ() {
        return (InterfaceC937900aVw) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC937900aVw LJIIJJI() {
        return (InterfaceC937900aVw) this.LLJJIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel] */
    public final MultiGuestSharedBgGuestViewModel LJIIL() {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel;
        if (!LiveViewPagerOnMeasureOptSetting.INSTANCE.enableInitInNeed()) {
            return this.LLJJL;
        }
        if (this.LLJJL == null) {
            synchronized (this) {
                C259800zU c259800zU = new C259800zU();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
                sbLIZ.append("_initMultiGuestSharedBgGuestViewModel");
                C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
                try {
                    Fragment fragment = this.LLILLL;
                    if (!C924230a9t.LIZ(128)) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiGuestSharedBgGuestViewModel.class);
                        ?? r3 = (MultiGuestSharedBgGuestViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new C940900aam(), new AwS134S0110000_16(fragment, 7), new AwS134S0110000_16(fragment, 6), new C987103tV(fragment, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
                        r3.LLILLJJLI = LJIILJJIL();
                        r3.LL = this.LLILLJJLI;
                        r3.iT0(C1558360qeg.LJFF(fragment, "linkMicScope"));
                        c259800zU.element = r3;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SharedBg newViewModel fail in pre-adjust. ");
                    sbLIZ2.append(th);
                    C1AZW.LJFF("NewMultiGuestV3PreAdjustPlayerManager", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                }
                multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) c259800zU.element;
            }
            this.LLJJL = multiGuestSharedBgGuestViewModel;
            if (C463380IFc.LIZ()) {
                LJJIFFI();
            }
        }
        return this.LLJJL;
    }

    public final C946500ajo LJIILIIL() {
        return (C946500ajo) this.LLJILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel] */
    public final MultiGuestThemeViewModel LJIILJJIL() {
        MultiGuestThemeViewModel multiGuestThemeViewModel;
        if (!LiveViewPagerOnMeasureOptSetting.INSTANCE.enableInitInNeed()) {
            return this.LLJJJJLIIL;
        }
        if (this.LLJJJJLIIL == null) {
            synchronized (this) {
                C259800zU c259800zU = new C259800zU();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
                sbLIZ.append("_initMultiGuestThemeViewModel");
                C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
                try {
                    Fragment fragment = this.LLILLL;
                    if (fragment != null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiGuestThemeViewModel.class);
                        ?? r1 = (MultiGuestThemeViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new C940900aam(), new AwS134S0110000_16(fragment, 7), new AwS134S0110000_16(fragment, 6), new C987103tV(fragment, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
                        r1.iT0(C1558360qeg.LJFF(fragment, "linkMicScope"));
                        c259800zU.element = r1;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SharedBg newViewModel fail in pre-adjust. ");
                    sbLIZ2.append(th);
                    C1AZW.LJFF("NewMultiGuestV3PreAdjustPlayerManager", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                }
                this.LLJJJJJIL = true;
                multiGuestThemeViewModel = (MultiGuestThemeViewModel) c259800zU.element;
            }
            this.LLJJJJLIIL = multiGuestThemeViewModel;
            if (C463380IFc.LIZ()) {
                LJJII();
            }
        }
        return this.LLJJJJLIIL;
    }

    public final boolean LJIILL() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(HadInitLinkMicChannel.class), Boolean.TRUE);
        }
        return false;
    }

    public final boolean LJIIZILJ() {
        int iQZ = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QZ();
        if (LinkmicRtcRatioOptimizePlayerHandler.isEnable()) {
            return (!LJIILL() || iQZ == 0) && !LJIJ();
        }
        return false;
    }

    public final boolean LJIJI() {
        return this.LLJILJILJ == EnumC939140aXw.NEW_LAYOUT;
    }

    public final void LJJIII() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(MultiGuestV3CanExposeForPlayerOptChannel.class), Boolean.TRUE) && this.LLJI) {
            HandlerHook.viewRemoveCallbacks(this.LL, this.LLJJJIL);
            HandlerHook.viewPostDelay(this.LL, this.LLJJJIL, 15000L);
        }
    }

    @Override // X.InterfaceC463170IEh
    public final void clear() {
        ((LifecycleRegistry) this.LLJILJIL.getValue()).setCurrentState(Lifecycle.State.DESTROYED);
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC939110aXt) it2.next()).release();
        }
        Fragment fragment = this.LLILLL;
        if (fragment != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, "linkMicScope");
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelLJIIL = LJIIL();
            if (multiGuestSharedBgGuestViewModelLJIIL != null) {
                multiGuestSharedBgGuestViewModelLJIIL.eB1(interfaceC665370Q7zLJFF);
            }
            MultiGuestThemeViewModel multiGuestThemeViewModelLJIILJJIL = LJIILJJIL();
            if (multiGuestThemeViewModelLJIILJJIL != null) {
                multiGuestThemeViewModelLJIILJJIL.eB1(interfaceC665370Q7zLJFF);
            }
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this.LLILLL);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this.LLJJ);
        }
        this.LLJIJIL = null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJILJIL.getValue();
    }

    public final boolean LJIJ() {
        InterfaceC939110aXt interfaceC939110aXtLJIIIZ = LJIIIZ();
        return (interfaceC939110aXtLJIIIZ == null || interfaceC939110aXtLJIIIZ.LJI()) ? false : true;
    }

    public final void LJIJJLI() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_release");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            InterfaceC937900aVw interfaceC937900aVwLJIIJJI = LJIIJJI();
            if ((interfaceC937900aVwLJIIJJI instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLJIIJJI) != null) {
                interfaceC940060aZQ.LJJLIIIIJ((C942060ace) this.LLJJJ.getValue());
            }
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIJ = LJIIJ();
        if (interfaceC937900aVwLJIIJ != null) {
            interfaceC937900aVwLJIIJ.LJLJLJ(this.LLJJIJI);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this.LLJJ);
        }
    }

    public final void LJJIFFI() {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelLJIIL = LJIIL();
        if (multiGuestSharedBgGuestViewModelLJIIL != null) {
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZ(true);
            c1770850wBP.LIZ = true;
            multiGuestSharedBgGuestViewModelLJIIL.EQ2(new C2217371BqR() { // from class: X.0aXr
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C935650aSJ) obj).LLILZ;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935650aSJ) obj).LLILZ = (String) obj2;
                }
            }, c1770850wBP, this, new AwS594S0100000_15(this, 739));
        }
    }

    public final void LJJII() {
        MultiGuestThemeViewModel multiGuestThemeViewModelLJIILJJIL = LJIILJJIL();
        if (multiGuestThemeViewModelLJIILJJIL != null) {
            Fragment fragment = this.LLILLL;
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZ(true);
            c1770850wBP.LIZ = true;
            multiGuestThemeViewModelLJIILJJIL.vQ2(new C2217371BqR() { // from class: X.0aXz
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C938810aXP) obj).LLILZIL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C938810aXP) obj).LLILZIL = (Rect) obj2;
                }
            }, c1770850wBP, fragment, new AwS594S0100000_15(this, 740));
        }
    }

    @Override // X.InterfaceC463170IEh
    public final boolean LIZJ() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC463170IEh
    public final int getScene() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026d  */
    @Override // X.InterfaceC463170IEh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C945320ahu r12) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939100aXs.LIZIZ(X.0ahu):void");
    }

    @Override // X.InterfaceC463170IEh
    public final void LJ(AObjectS382S0100000_7 aObjectS382S0100000_7) {
        this.LLJIJIL = aObjectS382S0100000_7;
    }

    public final InterfaceC939110aXt LJIIIIZZ(int i) {
        if (i != 2) {
            if (i == 4) {
                C938390aWj c938390aWj = new C938390aWj(this.LL, this.LLILLJJLI);
                c938390aWj.init();
                return c938390aWj;
            }
            throw new IllegalArgumentException("scene is illegal please check!");
        }
        C944290agF c944290agF = new C944290agF(this.LLILLJJLI);
        c944290agF.LJIIIIZZ(false);
        return c944290agF;
    }

    public final void LJIILLIIL(boolean z) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomChannel.class, this.LLJJ);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, MultiGuestV3ShowEmptyViewEvent.class, this.LLJJIII);
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, MultiGuestV3CanExposeForPlayerOptChannel.class, this.LLJJI);
        }
        if (z && !C463380IFc.LIZ()) {
            LJJIFFI();
            LJJII();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3 A[PHI: r5
      0x00d3: PHI (r5v3 android.graphics.Rect) = (r5v2 android.graphics.Rect), (r5v4 android.graphics.Rect) binds: [B:79:0x0122, B:51:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939100aXs.LJIJJ(java.lang.String):void");
    }

    public final void LJJI(boolean z) {
        this.LLJJJJ = z;
        if (!LinkmicRtcRatioOptimizePlayerHandler.isEnable() && !z) {
            this.LLIZLLLIL = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_updateIsPreAdjustIn1VN value = ");
        sbLIZ.append(this.LLJJJJ);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC463170IEh
    public final void LIZ(int i, int i2) {
        if (LJIJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
            sbLIZ.append("_onVideoSizeChange skip old layout logic for NEW_LAYOUT");
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onVideoSizeChangeForNewLayout videoWidth:");
            sbLIZ2.append(i);
            sbLIZ2.append(" videoHeight:");
            sbLIZ2.append(i2);
            sbLIZ2.append(" isCanHandle:");
            sbLIZ2.append(LJIIZILJ());
            C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (LJIIZILJ()) {
                LJIILIIL().getClass();
                return;
            }
            return;
        }
        if (LJIIZILJ()) {
            if (this.LLJ == null) {
                LJJ(this.LLIZLLLIL, null, "onVideoSizeChange");
                return;
            }
            InterfaceC937900aVw interfaceC937900aVwLJIIJ = LJIIJ();
            if (interfaceC937900aVwLJIIJ != null) {
                interfaceC937900aVwLJIIJ.LJJJJJL(this.LLJJIJI);
            }
            InterfaceC937900aVw interfaceC937900aVwLJIIJ2 = LJIIJ();
            if (interfaceC937900aVwLJIIJ2 == null) {
                return;
            }
            interfaceC937900aVwLJIIJ2.LLILZLL(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    @Override // X.InterfaceC463170IEh
    public final void LJI(Rect rect, Pair<Integer, Integer> pair) {
        this.LLILZIL = rect;
        this.LLILZLL = pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlayerRangeAndParentSize actualRange = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" actualParentSize = ");
        sbLIZ.append(this.LLILZLL);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updatePlayerRangeAndParentSize actualRange = ");
        sbLIZ2.append(this.LLILZIL);
        sbLIZ2.append(" actualParentSize = ");
        sbLIZ2.append(this.LLILZLL);
        sbLIZ2.append(" isUsingNewLayout:");
        sbLIZ2.append(LJIJI());
        C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (LJIJI()) {
            LJIILIIL().LJ(rect.left, rect.top, rect.right, rect.bottom, pair);
        }
        InterfaceC939110aXt interfaceC939110aXtLJIIIZ = LJIIIZ();
        if (interfaceC939110aXtLJIIIZ != null) {
            interfaceC939110aXtLJIIIZ.LIZ(pair);
        }
        LJIJJ("updatePlayerRangeAndParentSize");
    }

    public final void LJIL(String str, boolean z) {
        Long lValueOf;
        long id;
        Room room;
        Room room2;
        DataChannel dataChannel;
        if (z && (dataChannel = this.LLILLJJLI) != null && Intrinsics.LJFF(dataChannel.gg0(MultiGuestV3CanExposeForPlayerOptChannel.class), Boolean.FALSE)) {
            return;
        }
        ((LifecycleRegistry) this.LLJILJIL.getValue()).setCurrentState(Lifecycle.State.STARTED);
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC939110aXt) it2.next()).release();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_releaseView isLinkMicClose = ");
        sbLIZ.append(LJIJ());
        sbLIZ.append(" from = ");
        sbLIZ.append(str);
        sbLIZ.append(" hc = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" roomId = ");
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this);
        }
        DataChannel dataChannel4 = this.LLILLJJLI;
        if (dataChannel4 != null) {
            dataChannel4.zQ2(this.LLILLL);
        }
        DataChannel dataChannel5 = this.LLILLJJLI;
        if (dataChannel5 != null) {
            dataChannel5.zQ2(this.LLJJ);
        }
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            C939200aY2.LIZ("releaseView");
            InterfaceC937900aVw interfaceC937900aVwLJIIJJI = LJIIJJI();
            if (interfaceC937900aVwLJIIJJI != null) {
                interfaceC937900aVwLJIIJJI.LJIJ("releaseView in pre");
            }
            IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2LJIIIIZZ = C915980Zwa.LJIIIIZZ();
            if (iMultiGuestV3InternalServiceV2LJIIIIZZ != null) {
                DataChannel dataChannel6 = this.LLILLJJLI;
                if (dataChannel6 != null && (room = (Room) dataChannel6.gg0(RoomChannel.class)) != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                iMultiGuestV3InternalServiceV2LJIIIIZZ.Vs1(id, EnumC945310aht.LIVE_ROOM, "releaseObserverNotIncludeAboutView");
            }
        }
        HandlerHook.viewRemoveCallbacks(this.LL, this.LLJJJIL);
        LJJI(false);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [X.0Zvz] */
    public C939100aXs(ViewGroup viewGroup, DataChannel dataChannel, Fragment fragment) {
        this.LL = viewGroup;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = fragment;
        ArrayList arrayList = new ArrayList();
        this.LLIZ = arrayList;
        this.LLIZLLLIL = -1;
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 648));
        this.LLJILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 651));
        this.LLJJ = new AwS594S0100000_15(this, 738);
        this.LLJJI = new AwS594S0100000_15(this, 735);
        this.LLJJIII = new AwS594S0100000_15(this, 736);
        this.LLJJIJI = new InterfaceC958970b3v() { // from class: X.0Zvz
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
                C935650aSJ state;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
                sbLIZ.append("_onPlayerRangeCalculateFinish");
                C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
                C939100aXs c939100aXs = this.LL;
                MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelLJIIL = c939100aXs.LJIIL();
                if (multiGuestSharedBgGuestViewModelLJIIL != null && (state = multiGuestSharedBgGuestViewModelLJIIL.getState()) != null && state.LL) {
                    HandlerHook.viewPost(c939100aXs.LL, new ARunnableS115S0100000_15(c939100aXs, 124));
                    c939100aXs.LJJ(c939100aXs.LLIZLLLIL, c2180891AWx, "onPlayerRangeCalculateFinish1");
                } else {
                    c939100aXs.LJIJJ("layout change");
                    c939100aXs.LJJ(c939100aXs.LLIZLLLIL, c2180891AWx, "onPlayerRangeCalculateFinish2");
                }
            }
        };
        this.LLJJIJIIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 649));
        this.LLJJIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 650));
        this.LLJJJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(280));
        this.LLJJJIL = new ARunnableS115S0100000_15(this, 123);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_init");
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ2.append(" init");
        C939200aY2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
            arrayList.add(LJIIIIZZ(4));
        }
        if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            arrayList.add(LJIIIIZZ(2));
        }
        if (LiveViewPagerOnMeasureOptSetting.INSTANCE.disableInitInNeed()) {
            try {
                Fragment fragment2 = this.LLILLL;
                if (fragment2 != null) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiGuestThemeViewModel.class);
                    AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659);
                    AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(134);
                    C452070Ho5 c452070Ho5 = new C452070Ho5();
                    C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment2);
                    C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(fragment2);
                    C940900aam c940900aam = new C940900aam();
                    MultiGuestThemeViewModel multiGuestThemeViewModel = (MultiGuestThemeViewModel) C737770Swp.LIZ(awS560S0100000_16, c452070Ho5, c1622206WuLJII, c338490DOtLJIIIZ, c940900aam, new AwS134S0110000_16(fragment2, 7), new AwS134S0110000_16(fragment2, 6), new C987103tV(fragment2, false), aFwS250S0000000_15, c19719912DlLIZ);
                    multiGuestThemeViewModel.iT0(C1558360qeg.LJFF(fragment2, "linkMicScope"));
                    this.LLJJJJJIL = true;
                    this.LLJJJJLIIL = multiGuestThemeViewModel;
                    if (!C924230a9t.LIZ(128)) {
                        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiGuestSharedBgGuestViewModel.class);
                        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = (MultiGuestSharedBgGuestViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 659), c452070Ho5, C724750Sbp.LJII(fragment2), C724750Sbp.LJIIIZ(fragment2), c940900aam, new AwS134S0110000_16(fragment2, 7), new AwS134S0110000_16(fragment2, 6), new C987103tV(fragment2, false), aFwS250S0000000_15, c19719912DlLIZ2);
                        multiGuestSharedBgGuestViewModel.LLILLJJLI = LJIILJJIL();
                        multiGuestSharedBgGuestViewModel.LL = dataChannel;
                        multiGuestSharedBgGuestViewModel.iT0(C1558360qeg.LJFF(fragment2, "linkMicScope"));
                        this.LLJJL = multiGuestSharedBgGuestViewModel;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SharedBg newViewModel fail in pre-adjust. ");
                sbLIZ3.append(th);
                C1AZW.LJFF("NewMultiGuestV3PreAdjustPlayerManager", C2188811AlT.LIZIZ(sbLIZ3), null, null);
            }
        }
        LJIILLIIL(this.LLJJJJJIL);
        ((LifecycleRegistry) this.LLJILJIL.getValue()).setCurrentState(Lifecycle.State.STARTED);
    }

    public final void LJII(C945320ahu c945320ahu, Long l, String str) {
        if (LinkmicRtcRatioOptimizePlayerHandler.isEnable() && C969340bKe.LJI(c945320ahu) && this.LLIZLLLIL > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check live scene, source:");
            sbLIZ.append(str);
            sbLIZ.append(", roomId:");
            sbLIZ.append(l);
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJ = null;
            int i = this.LLIZLLLIL;
            this.LLIZLLLIL = -1;
            LJJ(i, null, "check live end");
        }
    }

    public final void LJJ(int i, C2180891AWx c2180891AWx, String str) {
        boolean z;
        String layoutId;
        boolean z2;
        Function0<String> function0;
        String strInvoke;
        DataChannel dataChannel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        sbLIZ.append("_sendAdjustPlayerEvent, resetToFullScreen:");
        if (c2180891AWx == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", layoutId=");
        if (c2180891AWx != null) {
            layoutId = c2180891AWx.getLayoutId();
        } else {
            layoutId = null;
        }
        sbLIZ.append(layoutId);
        sbLIZ.append(", source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
        if (c2180891AWx != null) {
            if (MultiGuestLayoutMonitorSwitchSetting.INSTANCE.isSwitch() && (function0 = this.LLJIJIL) != null && (strInvoke = function0.invoke()) != null && (dataChannel = this.LLILLJJLI) != null) {
                dataChannel.LC0(MultiGuestMonitorExternalEvent.class, new C1158050gF1(strInvoke, EnumC485960J3y.LAYOUT_RENDERED, null, i, null, 92));
            }
            InterfaceC939110aXt interfaceC939110aXtLJIIIZ = LJIIIZ();
            if (interfaceC939110aXtLJIIIZ != null) {
                interfaceC939110aXtLJIIIZ.LJII(c2180891AWx);
                return;
            }
            return;
        }
        for (InterfaceC939110aXt interfaceC939110aXt : (ArrayList) this.LLIZ) {
            if (interfaceC939110aXt.scene() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC939110aXt.LIZIZ(z2);
        }
    }
}
