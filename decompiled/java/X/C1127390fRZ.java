package X;

import Y.ACListenerS86S1100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS50S0300000_17;
import Y.AUListenerS220S0200000_12;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRankLeftChangedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleVaultBoostingGloveCardEffectChannel;
import com.bytedance.android.livesdk.BatchBannerVisibilityChannel;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.api.coin.incentive.UgPointsBalanceChangeEvent;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSmallGiftBatchSendOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AwS20S0300100_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS482S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@InterfaceC1294060jmO
public final class C1127390fRZ extends AbstractC1100460ek8 implements InterfaceC1127990fSX {
    public final Fragment LLJ;
    public final BPEAHandler LLJI;
    public final Set<View> LLJIJIL;
    public View LLJILJIL;
    public EnumC1127500fRk LLJILJILJ;
    public C1124840fNS LLJILLL;
    public C1128340fT6 LLJJ;
    public final C1127870fSL LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public C420570GeN LLJJIJIIJIL;
    public C1124630fN7 LLJJIJIL;
    public C1124720fNG LLJJJ;
    public C1124780fNM LLJJJIL;
    public C1123340fL2 LLJJJJ;
    public C1124540fMy LLJJJJJIL;
    public C1133700fbk LLJJJJLIIL;
    public C420550GeL LLJJL;
    public C420560GeM LLJJLIIIJLLLLLLLZ;
    public C1125880fP8 LLJL;
    public C1118180fCi LLJLIL;
    public C1128080fSg LLJLILLLLZIIL;
    public C1118050fCV LLJLL;
    public C1132800faI LLJLLIL;
    public C1091250eVH LLJLLL;
    public C1143190fr3 LLJZ;
    public boolean LLJZIJLIL;
    public final C987150bnN LLL;
    public C0T89 LLLF;
    public Room LLLFF;
    public final C11NJ LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final C1127410fRb LLLIIIL;
    public GiftListResult LLLIIL;
    public final C1127400fRa LLLIILIL;
    public final ARunnableS117S0100000_17 LLLIL;

    public final GiftPanelLeafViewModel LJJJJIZL() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftPanelLeafViewModel LJJJJJ() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJJJJL() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null) {
            return null;
        }
        if (fragment.isAdded()) {
            return (GiftLeafRootViewModel) new ViewModelProvider(fragment).get(GiftLeafRootViewModel.class);
        }
        C1AF0.LIZJ("GiftPanelTopLeaf cannot get ViewModel");
        return null;
    }

    public final C1127870fSL LJJJJLI() {
        C1128710fTh c1128710fTh;
        C1127870fSL c1127870fSL;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        return (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null || (c1127870fSL = c1128710fTh.LLLIIIL) == null) ? this.LLJJI : c1127870fSL;
    }

    public final C1117710fBx LJJJJLL() {
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null) {
            return null;
        }
        return c1128710fTh.LLZZZZ;
    }

    public final int P1() {
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null) {
            return -1;
        }
        return c1128710fTh.P1();
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [T, X.0fZO] */
    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        C1100690ekV<AbstractC1127860fSK> c1100690ekV;
        DataChannel dataChannel;
        C1117710fBx c1117710fBx;
        C1128710fTh c1128710fTh;
        int childCount;
        DataChannel dataChannel2;
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = LJJJJJL();
        LifecycleOwner lifecycleOwnerLJJIFFI = null;
        this.LLLFF = (giftLeafRootViewModelLJJJJJL == null || (dataChannel2 = giftLeafRootViewModelLJJJJJL.LL) == null) ? null : (Room) dataChannel2.gg0(RoomChannel.class);
        View view = this.LLILZ;
        C0T89 c0t89 = view instanceof C0T89 ? (C0T89) view : null;
        this.LLLF = c0t89;
        this.LLJILLL = c0t89 != null ? (C1124840fNS) c0t89.findViewById(R.id.sps) : null;
        C0T89 c0t892 = this.LLLF;
        this.LLJJ = c0t892 != null ? (C1128340fT6) c0t892.findViewById(R.id.wvg) : null;
        C0T89 c0t893 = this.LLLF;
        this.LLJJIJIIJIL = c0t893 != null ? (C420570GeN) c0t893.findViewById(R.id.cie) : null;
        C0T89 c0t894 = this.LLLF;
        this.LLJJIJIL = c0t894 != null ? (C1124630fN7) c0t894.findViewById(R.id.mm7) : null;
        C0T89 c0t895 = this.LLLF;
        this.LLJJJ = c0t895 != null ? (C1124720fNG) c0t895.findViewById(R.id.ug_points_gift_banner) : null;
        C0T89 c0t896 = this.LLLF;
        this.LLJJJIL = c0t896 != null ? (C1124780fNM) c0t896.findViewById(R.id.pbk) : null;
        C0T89 c0t897 = this.LLLF;
        this.LLJJJJ = c0t897 != null ? (C1123340fL2) c0t897.findViewById(R.id.pbl) : null;
        C0T89 c0t898 = this.LLLF;
        this.LLJJJJJIL = c0t898 != null ? (C1124540fMy) c0t898.findViewById(R.id.hzt) : null;
        C0T89 c0t899 = this.LLLF;
        this.LLJJJJLIIL = c0t899 != null ? (C1133700fbk) c0t899.findViewById(R.id.iza) : null;
        C0T89 c0t8910 = this.LLLF;
        this.LLJJL = c0t8910 != null ? (C420550GeL) c0t8910.findViewById(R.id.bp4) : null;
        C0T89 c0t8911 = this.LLLF;
        this.LLJL = c0t8911 != null ? (C1125880fP8) c0t8911.findViewById(R.id.ivt) : null;
        C0T89 c0t8912 = this.LLLF;
        this.LLJLILLLLZIIL = c0t8912 != null ? (C1128080fSg) c0t8912.findViewById(R.id.ivs) : null;
        C0T89 c0t8913 = this.LLLF;
        this.LLJLIL = c0t8913 != null ? (C1118180fCi) c0t8913.findViewById(R.id.vvk) : null;
        C0T89 c0t8914 = this.LLLF;
        this.LLJLL = c0t8914 != null ? (C1118050fCV) c0t8914.findViewById(R.id.jfr) : null;
        C0T89 c0t8915 = this.LLLF;
        this.LLJLLIL = c0t8915 != null ? (C1132800faI) c0t8915.findViewById(R.id.f771ovb) : null;
        this.LLJILJIL = this.LLJJIJIIJIL;
        C0T89 c0t8916 = this.LLLF;
        this.LLJJLIIIJLLLLLLLZ = c0t8916 != null ? (C420560GeM) c0t8916.findViewById(R.id.yl7) : null;
        C0T89 c0t8917 = this.LLLF;
        this.LLJZ = c0t8917 != null ? (C1143190fr3) c0t8917.findViewById(R.id.bu0) : null;
        C0T89 c0t8918 = this.LLLF;
        if (!(c0t8918 instanceof ViewGroup)) {
            c0t8918 = null;
        }
        if (c0t8918 != null && (childCount = c0t8918.getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = c0t8918.getChildAt(i);
                if (childAt instanceof C0T8B) {
                    this.LLJIJIL.add(childAt);
                }
                if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C0T89 c0t8919 = this.LLLF;
        if (c0t8919 != null && (c1117710fBx = (C1117710fBx) c0t8919.findViewById(R.id.user_level_banner_top)) != null) {
            AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
            if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null) {
                c1128710fTh.LLZZZZ = c1117710fBx;
            }
        }
        C1117710fBx c1117710fBxLJJJJLL = LJJJJLL();
        if (c1117710fBxLJJJJLL != null) {
            GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL2 = LJJJJJL();
            c1117710fBxLJJJJLL.setDatachannel(giftLeafRootViewModelLJJJJJL2 != null ? giftLeafRootViewModelLJJJJJL2.LL : null);
        }
        C0T89 c0t8920 = this.LLLF;
        C1091250eVH c1091250eVH = c0t8920 != null ? (C1091250eVH) c0t8920.findViewById(R.id.user_level_banner_container) : null;
        this.LLJLLL = c1091250eVH;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = this.LLJLLL;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(true);
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL3 = LJJJJJL();
        if (giftLeafRootViewModelLJJJJJL3 != null && (dataChannel = giftLeafRootViewModelLJJJJJL3.LL) != null && C500260Jjc.LJJJIL(dataChannel)) {
            C420560GeM c420560GeM = this.LLJJLIIIJLLLLLLLZ;
            if (c420560GeM != null) {
                C500260Jjc.LLFFF(c420560GeM);
            }
            C420570GeN c420570GeN = this.LLJJIJIIJIL;
            if (c420570GeN != null) {
                C500260Jjc.LJIILIIL(c420570GeN);
                return;
            }
            return;
        }
        C420560GeM c420560GeM2 = this.LLJJLIIIJLLLLLLLZ;
        if (c420560GeM2 != null) {
            C500260Jjc.LJIILIIL(c420560GeM2);
        }
        C420570GeN c420570GeN2 = this.LLJJIJIIJIL;
        if (c420570GeN2 != null) {
            C500260Jjc.LLFFF(c420570GeN2);
        }
        C1100530ekF c1100530ekF = this.LLIZ;
        if (c1100530ekF != null) {
            c1100530ekF.LIZ(new InterfaceC1100540ekG() { // from class: X.0fRh
                @Override // X.InterfaceC1100540ekG
                public final void LIZ(C1100530ekF c1100530ekF2, EnumC1100550ekH enumC1100550ekH) {
                    DataChannel dataChannel3;
                    int i2 = C1100580ekK.LIZ[enumC1100550ekH.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C1127390fRZ c1127390fRZ = this.LIZ;
                            c1127390fRZ.LLLFFI.LJ();
                            GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL4 = c1127390fRZ.LJJJJJL();
                            if (giftLeafRootViewModelLJJJJJL4 != null && (dataChannel3 = giftLeafRootViewModelLJJJJJL4.LL) != null) {
                                dataChannel3.zW(BatchBannerVisibilityChannel.class, Boolean.FALSE);
                            }
                            C1142070fpF.LIZ.getClass();
                            C1142070fpF.LJIIJJI = false;
                            C1142070fpF.LJIL();
                            C1132800faI c1132800faI = c1127390fRZ.LLJLLIL;
                            if (c1132800faI != null) {
                                c1132800faI.setPlaybackState(false);
                            }
                            C0T89 c0t8921 = c1127390fRZ.LLLF;
                            if (c0t8921 != null) {
                                int visibility = c0t8921.getVisibility();
                                c0t8921.setVisibility(8);
                                C1602160rnK.LIZIZ(visibility, 8, c0t8921);
                                View view2 = c1127390fRZ.LLJILJIL;
                                if (view2 != null) {
                                    C786410Ut5.LJLLLLLL(8, view2);
                                }
                                c1127390fRZ.LLJILJIL = null;
                            }
                            c1127390fRZ.LLJI.removeCallbacks(c1127390fRZ.LLLIL);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C1127390fRZ c1127390fRZ2 = this.LIZ;
                    c1127390fRZ2.getClass();
                    C1128590fTV.LJJIFFI = SystemClock.uptimeMillis();
                    c1127390fRZ2.LLLIIIIL = InterfaceC1106030et7.S6.LIZIZ().booleanValue();
                    C1142070fpF.LIZ.getClass();
                    C1142070fpF.LJIIJJI = true;
                    IMusicGiftService iMusicGiftServiceLJIILIIL = C1142070fpF.LJIILIIL();
                    if (iMusicGiftServiceLJIILIIL != null) {
                        iMusicGiftServiceLJIILIIL.HB2(C1142070fpF.LJIIL);
                    }
                    c1127390fRZ2.LLLFFI.LIZ(C09JM.LIZ(C784440Upu.LIZ().LJ(C1127980fSW.class), new AfS186S0100000_17(c1127390fRZ2, 115)));
                    c1127390fRZ2.LLLFFI.LIZ(C784440Upu.LIZ().LJ(C1128070fSf.class).LJJLJLI(new AfS186S0100000_17(c1127390fRZ2, 118)));
                    c1127390fRZ2.LLLFFI.LIZ(C784440Upu.LIZ().LJ(C1126670fQP.class).LJJLJLI(new AfS186S0100000_17(c1127390fRZ2, 120)));
                    C1128590fTV.LJJII = SystemClock.uptimeMillis();
                }
            });
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL4 = LJJJJJL();
        if (giftLeafRootViewModelLJJJJJL4 != null && (c1100690ekV = giftLeafRootViewModelLJJJJJL4.LLILZ) != null) {
            c1100690ekV.LIZJ(this.LLILLL, this.LLLIIIL);
        }
        GiftManager.inst().registerGiftListListener(this.LLLIILIL);
        GiftManager.inst().addGalleryInfoUpdateListener(new InterfaceC1128230fSv() { // from class: X.0fSA
            @Override // X.InterfaceC1128230fSv
            public final void LIZ(C1127820fSG c1127820fSG) {
                if (C1125810fP1.LIZ()) {
                    return;
                }
                C1127390fRZ c1127390fRZ = this.LIZ;
                C786410Ut5.LJLIIL(300L, c1127390fRZ.LLJI, new ARunnableS117S0100000_17(c1127390fRZ, 225));
            }
        });
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL5 = LJJJJJL();
        DataChannel dataChannel3 = giftLeafRootViewModelLJJJJJL5 != null ? giftLeafRootViewModelLJJJJJL5.LL : null;
        if (C504210Jpz.LIZ || C464660IKa.LIZ()) {
            lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.LL, false);
        } else {
            ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.LL);
            if (componentCallbacks2LIZ instanceof LifecycleOwner) {
                lifecycleOwnerLJJIFFI = (LifecycleOwner) componentCallbacks2LIZ;
            }
        }
        if (dataChannel3 != null) {
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, UgPointsBalanceChangeEvent.class, new AwS596S0100000_17(this, 456));
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, BattleTop3CardEffectChannel.class, new AwS596S0100000_17(this, 447));
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, BattleTop2CardEffectChannel.class, new AwS596S0100000_17(this, 449));
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, BattleRankLeftChangedEvent.class, new AwS596S0100000_17(this, 453));
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, BattleVaultBoostingGloveCardEffectChannel.class, new AwS596S0100000_17(this, 446));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1132240fZO.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(lifecycleOwnerLJJIFFI, CollaborateGiftingStateChannel.class, new AwS383S0200000_17(c259800zU, (C259800zU<AbstractC1132210fZL>) this, (C1127390fRZ) 90));
        }
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        C1100690ekV<AbstractC1127860fSK> c1100690ekV;
        super.LJJIZ();
        GiftManager.inst().unRegisterGiftListListener(this.LLLIILIL);
        GiftManager.inst().removeAllGalleryInfoListener();
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = LJJJJJL();
        if (giftLeafRootViewModelLJJJJJL != null && (c1100690ekV = giftLeafRootViewModelLJJJJJL.LLILZ) != null) {
            c1100690ekV.LIZLLL(this.LLLIIIL);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final long LJJJJI() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJJ = LJJJJJ();
        if (giftPanelLeafViewModelLJJJJJ == null || (mutableLiveData = giftPanelLeafViewModelLJJJJJ.LLILZIL) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    public final String LJJJJL() {
        String str;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJJ = LJJJJJ();
        return (giftPanelLeafViewModelLJJJJJ == null || (str = giftPanelLeafViewModelLJJJJJ.LLILZLL) == null) ? "" : str;
    }

    public final boolean LJJJLIIL() {
        C1128710fTh c1128710fTh;
        C1117710fBx c1117710fBxLJJJJLL = LJJJJLL();
        if (c1117710fBxLJJJJLL == null || !c1117710fBxLJJJJLL.getUpdateBadgeViewOpt()) {
            return false;
        }
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        return (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null || c1128710fTh.LLLLLLIL) ? false : true;
    }

    @Override // X.InterfaceC1127990fSX
    public final void LIZLLL(C1142020fpA c1142020fpA) {
        C1132800faI c1132800faI;
        if (Intrinsics.LJFF(this.LLJILJIL, this.LLJLLIL) && (c1132800faI = this.LLJLLIL) != null) {
            c1132800faI.i0(c1142020fpA);
        }
    }

    public final String LJJJJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        Gift gift;
        GiftPanelBanner giftPanelBanner;
        if (GiftManager.inst().isEoy()) {
            return "eoy_activity";
        }
        if (this.LLJILJIL instanceof C1117710fBx) {
            return "level_bar";
        }
        Object obj = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftPanelBanner = gift.giftPanelBanner) != null && giftPanelBanner.bannerPriority == 3) {
            return "gift_hub";
        }
        return "others";
    }

    public final void LJJJJZI(C1127440fRe c1127440fRe) {
        List listLJ;
        long jLongValue;
        Long l;
        Long l2;
        Long l3;
        C1128340fT6 c1128340fT6 = this.LLJJ;
        if (c1128340fT6 == null) {
            return;
        }
        List list = c1127440fRe.LIZLLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Gift.ColorPickerInfo colorPickerInfo = c1127440fRe.LJ;
        long j = c1127440fRe.LJI;
        LJJJJLI().LIZ(j);
        boolean zLIZIZ = C1128300fT2.LIZIZ(colorPickerInfo);
        GiftColorInfo giftColorInfoLJII = null;
        if (zLIZIZ) {
            giftColorInfoLJII = C1128300fT2.LJII(j, colorPickerInfo, list);
        }
        GiftColorInfo giftColorInfoLJIIIZ = C1128300fT2.LJIIIZ(j, colorPickerInfo, list);
        if (giftColorInfoLJIIIZ != null) {
            listLJ = C1128300fT2.LJ(list, giftColorInfoLJIIIZ, LJJJJLI().LIZ);
        } else {
            C1127870fSL c1127870fSLLJJJJLI = LJJJJLI();
            c1127870fSLLJJJJLI.getClass();
            listLJ = C1128300fT2.LJ(list, giftColorInfoLJII, c1127870fSLLJJJJLI.LIZ);
        }
        GiftColorInfo giftColorInfo = LJJJJLI().LIZ;
        if (giftColorInfo != null && (l3 = giftColorInfo.colorId) != null) {
            jLongValue = l3.longValue();
        } else if (giftColorInfoLJIIIZ != null && (l2 = giftColorInfoLJIIIZ.colorId) != null) {
            jLongValue = l2.longValue();
        } else if (giftColorInfoLJII != null && (l = giftColorInfoLJII.colorId) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = c1127440fRe.LJFF;
        }
        this.LLJJIJI = jLongValue;
        c1128340fT6.e0(new C1128330fT5(listLJ, jLongValue, j));
        c1128340fT6.setShowMoreButton(zLIZIZ);
        c1128340fT6.LLILZ = new AwS482S0200000_17(this, c1127440fRe, 0);
        c1128340fT6.setOnMoreClickListener(new AwS20S0300100_17(j, this, colorPickerInfo, list, 1));
        LJJLIIIJJI(c1128340fT6, c1127440fRe, EnumC1127500fRk.CHANGE_COLOR);
    }

    public final void LJJL(int i) {
        long j;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        View view;
        this.LLJI.removeCallbacks(this.LLLIL);
        C1118180fCi c1118180fCi = this.LLJLIL;
        if (c1118180fCi != null && c1118180fCi.LLILZ) {
            j = 12000;
        } else {
            j = 8000;
        }
        C786410Ut5.LJLIIL(j, this.LLJI, this.LLLIL);
        if (i > 0 && (abstractC1126600fQI = this.LLLII) != null) {
            long j2 = abstractC1126600fQI.LJIILJJIL;
            if (Intrinsics.LJFF(this.LLJILJIL, this.LLJLIL) && (view = this.LLJILJIL) != null && view.getVisibility() == 0 && !Intrinsics.LJFF(this.LLJILJIL, this.LLJZ)) {
                if (j2 >= 0) {
                    C1118180fCi c1118180fCi2 = this.LLJLIL;
                    if (c1118180fCi2 != null) {
                        c1118180fCi2.LIZ(null, C1127480fRi.LJI());
                        return;
                    }
                    return;
                }
                this.LLJI.removeCallbacks(this.LLLIL);
                this.LLLIL.run();
            }
        }
    }

    public final void LJJLIIIIJ(C1127440fRe c1127440fRe) {
        boolean zBooleanValue;
        C1128710fTh c1128710fTh;
        DataChannel dataChannel;
        Boolean bool;
        C1124780fNM c1124780fNM = this.LLJJJIL;
        if (c1124780fNM != null) {
            LJJJJIZL();
            if (c1124780fNM.z0(c1127440fRe.LJI)) {
                LJJLIIIJJI(this.LLJJJIL, c1127440fRe, EnumC1127500fRk.DEFAULT_GENERIC);
                return;
            }
        }
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        C1094360eaI c1094360eaIHP2 = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = LJJJJJL();
        if (giftLeafRootViewModelLJJJJJL != null && (dataChannel = giftLeafRootViewModelLJJJJJL.LL) != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if ((c1094360eaIHP2 != null && c1094360eaIHP2.LJFF == 2) || zBooleanValue) {
            LJJLIIIJJI(this.LLJJIJIIJIL, c1127440fRe, EnumC1127500fRk.DEFAULT);
            return;
        }
        if (LJJJLIIL()) {
            return;
        }
        LJJLIIIJJI(LJJJJLL(), c1127440fRe, EnumC1127500fRk.USER_LEVEL);
        C1117710fBx c1117710fBxLJJJJLL = LJJJJLL();
        if (c1117710fBxLJJJJLL != null) {
            HandlerHook.viewPostDelay(c1117710fBxLJJJJLL, new ARunnableS50S0300000_17(this, c1094360eaIHP, c1127440fRe, 15), 300L);
        }
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null) {
            return;
        }
        c1128710fTh.LLZILL = true;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0fRb] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0fRa] */
    public C1127390fRZ(Fragment fragment, Context context) {
        super(context, EnumC1129580fV6.GIFT_PANEL_SUB.getZIndex());
        this.LLJ = fragment;
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJIJIL = new LinkedHashSet();
        this.LLJJI = new C1127870fSL();
        this.LLJJIII = -1L;
        this.LLL = new C987150bnN(context, 2);
        this.LLLFFI = new C11NJ();
        this.LLLFZ = (int) C497740JfY.LIZIZ(48);
        this.LLLI = R.layout.hza;
        this.LLLIIIL = new InterfaceC1100670ekT<AbstractC1127860fSK>() { // from class: X.0fRb
            /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
            @Override // X.InterfaceC1100670ekT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLZZLLIL(X.AbstractC1127860fSK r7) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 387
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1127410fRb.LLZZLLIL(java.lang.Object):void");
            }
        };
        this.LLLIILIL = new InterfaceC1133110fan() { // from class: X.0fRa
            /* JADX WARN: Removed duplicated region for block: B:126:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:180:0x0263  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x0277  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x02a4  */
            /* JADX WARN: Removed duplicated region for block: B:200:0x02a6  */
            /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
            @Override // X.InterfaceC1133110fan
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(com.bytedance.android.livesdk.gift.model.GiftListResult r19, int r20) {
                /*
                    Method dump skipped, instruction units count: 680
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1127400fRa.LIZLLL(com.bytedance.android.livesdk.gift.model.GiftListResult, int):void");
            }
        };
        this.LLLIL = new ARunnableS117S0100000_17(this, 226);
    }

    public final boolean LJJLI(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, EnumC1127640fRy enumC1127640fRy) {
        View view;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLLII;
        if (abstractC1126600fQI2 == null || abstractC1126600fQI == null || !LiveGiftSmallGiftBatchSendOptSetting.enabled()) {
            return false;
        }
        if ((enumC1127640fRy != EnumC1127640fRy.GIFT_LIST && enumC1127640fRy != EnumC1127640fRy.NORMAL) || this.LLJILJILJ != EnumC1127500fRk.BATCH_PACKAGE || !Intrinsics.LJFF(this.LLJILJIL, this.LLJZ) || (view = this.LLJILJIL) == null || view.getVisibility() != 0 || abstractC1126600fQI.LJFF() != abstractC1126600fQI2.LJFF()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DataChannel dataChannel;
        C0J3Y c0j3y = C0J3Y.LIZ;
        int i = this.LLLI;
        c0j3y.getClass();
        View viewLJIIIIZZ = C0J3Y.LJIIIIZZ(i);
        if (viewLJIIIIZZ == null && (viewLJIIIIZZ = C786410Ut5.Td(layoutInflater, this.LLLI, viewGroup, false)) == null) {
            return null;
        }
        this.LLILZ = viewLJIIIIZZ;
        C19ME c19me = new C19ME(-1, -1);
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = LJJJJJL();
        if (giftLeafRootViewModelLJJJJJL != null && (dataChannel = giftLeafRootViewModelLJJJJJL.LL) != null && C500260Jjc.LJJJIL(dataChannel)) {
            C420560GeM c420560GeM = this.LLJJLIIIJLLLLLLLZ;
            if (c420560GeM != null) {
                C500260Jjc.LLFFF(c420560GeM);
            }
            C420570GeN c420570GeN = this.LLJJIJIIJIL;
            if (c420570GeN != null) {
                C500260Jjc.LJIILIIL(c420570GeN);
            }
        }
        return new Pair<>(this.LLILZ, c19me);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJJIL(long j, boolean z, boolean z2) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Object next;
        Gift gift;
        GiftColorInfo giftColorInfoLIZLLL;
        ImageModel imageModel;
        C1128710fTh c1128710fTh;
        C1127050fR1 c1127050fR1;
        String strLJIILIIL;
        String strLJJJJL = LJJJJL();
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJJ = LJJJJJ();
        Object obj = null;
        if (giftPanelLeafViewModelLJJJJJ != null && (mutableLiveData = giftPanelLeafViewModelLJJJJJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            Iterator it2 = C13LP.LLIIL(value).iterator();
            while (true) {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (c717610SCx.hasNext()) {
                    next = c717610SCx.next();
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) ((IndexedValue) next).LIZIZ;
                    if (abstractC1126600fQI != null) {
                        strLJIILIIL = abstractC1126600fQI.LJIILIIL();
                    } else {
                        strLJIILIIL = null;
                    }
                    if (Intrinsics.LJFF(strLJIILIIL, strLJJJJL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IndexedValue indexedValue = (IndexedValue) next;
            if (indexedValue != null) {
                Pair pair = new Pair(Integer.valueOf(indexedValue.LIZ), indexedValue.LIZIZ);
                int iIntValue = ((Number) pair.getFirst()).intValue();
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) pair.getSecond();
                if (abstractC1126600fQI2 != null) {
                    abstractC1126600fQI2.LJ = null;
                    abstractC1126600fQI2.LJFF = null;
                    obj = abstractC1126600fQI2.LIZIZ;
                }
                if ((obj instanceof Gift) && (gift = (Gift) obj) != null && (giftColorInfoLIZLLL = C1128300fT2.LIZLLL(gift, j)) != null && (imageModel = giftColorInfoLIZLLL.giftImage) != null) {
                    if (z || !Intrinsics.LJFF(abstractC1126600fQI2.LJFF, imageModel)) {
                        abstractC1126600fQI2.LJFF = imageModel;
                        abstractC1126600fQI2.LJI = z2;
                        if (abstractC1126600fQI2.LJIJ != j) {
                            abstractC1126600fQI2.LJIJ = j;
                            if (z) {
                                abstractC1126600fQI2.LJ = imageModel;
                            }
                        }
                        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
                        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && (c1127050fR1 = c1128710fTh.LLJJIJI) != null) {
                            c1127050fR1.notifyItemChanged(iIntValue, abstractC1126600fQI2);
                        }
                    }
                }
            }
        }
    }

    public final void LJJJLZIJ(C1127440fRe c1127440fRe, String str, EnumC1127500fRk enumC1127500fRk) {
        String strLIZLLL;
        C1100420ek4 c1100420ek4;
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        Fragment fragment = null;
        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && !c1128710fTh.LLLLLLIL) {
            return;
        }
        if (this.LLJJJJ != null) {
            C495520Jby c495520Jby = new C495520Jby(str);
            c495520Jby.LIZJ("new_ui_container", String.valueOf(C1125810fP1.LIZJ()));
            strLIZLLL = c495520Jby.LIZLLL();
            strLIZLLL.toString();
        } else {
            strLIZLLL = null;
        }
        C1123340fL2 c1123340fL2 = this.LLJJJJ;
        if (c1123340fL2 != null) {
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            AbstractC1100450ek7 abstractC1100450ek72 = this.LLIZLLLIL;
            if (abstractC1100450ek72 != null && (c1100420ek4 = abstractC1100450ek72.LLILZIL) != null) {
                fragment = c1100420ek4.getFragment();
            }
            c1123340fL2.LIZIZ(strLIZLLL, null, fragment, new AwS596S0100000_17(c1127440fRe, 445), new AwS482S0200000_17(this, c1127440fRe, 1));
        }
        LJJLIIIJJI(this.LLJJJJ, c1127440fRe, enumC1127500fRk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJI(final View view, C1127440fRe c1127440fRe, EnumC1127500fRk enumC1127500fRk) {
        View view2;
        String strName;
        int i;
        Long lValueOf;
        C1132800faI c1132800faI;
        boolean z = false;
        if (!Intrinsics.LJFF(this.LLJILJIL, view) && Intrinsics.LJFF(this.LLJILJIL, this.LLJLLIL) && (c1132800faI = this.LLJLLIL) != null) {
            c1132800faI.setPlaybackState(false);
        }
        View view3 = this.LLJILJIL;
        if (view3 == null) {
            final C0T89 c0t89 = this.LLLF;
            if (c0t89 != null && c0t89.getVisibility() != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                ViewGroup.LayoutParams layoutParams = c0t89.getLayoutParams();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.LLLFZ);
                valueAnimatorOfInt.setDuration(30L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS220S0200000_12(layoutParams, c0t89, 5));
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.0T8C
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Iterator<View> it2 = this.LL.LLJIJIL.iterator();
                        while (it2.hasNext()) {
                            C786410Ut5.LJLLLLLL(8, it2.next());
                        }
                        C786410Ut5.LJLLLLLL(0, c0t89);
                        if (view != null) {
                            View view4 = view;
                            HandlerHook.viewPostDelay(view4, new RunnableC514801zW(view4, 136), 50L);
                        }
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.0fSS
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }
                });
                animatorSet.playTogether(valueAnimatorOfInt);
                animatorSet.start();
            }
        } else if (!Intrinsics.LJFF(view3, view) && (view2 = this.LLJILJIL) != null) {
            C1117830fC9.LIZIZ(view2, false);
        }
        C0T89 c0t892 = this.LLLF;
        if (c0t892 != null) {
            Gift gift = c1127440fRe.LJIIIIZZ;
            if (gift != null) {
                lValueOf = Long.valueOf(gift.id);
            } else {
                lValueOf = null;
            }
            C0T89.LIZLLL(c0t892, lValueOf, c1127440fRe.LJII, (C0T8B) view, new AwS561S0100000_17(view, 452), 8);
        }
        this.LLJILJIL = view;
        this.LLJILJILJ = enumC1127500fRk;
        boolean zLJFF = Intrinsics.LJFF(view, LJJJJLL());
        C1091250eVH c1091250eVH = this.LLJLLL;
        if (c1091250eVH != null) {
            if (zLJFF) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLIILIL(c1091250eVH, i);
        }
        C1117710fBx c1117710fBxLJJJJLL = LJJJJLL();
        if (c1117710fBxLJJJJLL != null) {
            if (!c1117710fBxLJJJJLL.LLJLIL && zLJFF) {
                z = true;
            }
            C1117710fBx.u0(z);
            c1117710fBxLJJJJLL.LLJLIL = zLJFF;
        }
        if (((Boolean) C1127850fSJ.LIZIZ.getValue()).booleanValue()) {
            Pair pair = new Pair(this.LLJILJIL, this.LLJILJILJ);
            Object first = pair.getFirst();
            EnumC1127500fRk enumC1127500fRk2 = (EnumC1127500fRk) pair.getSecond();
            e eVar = new e();
            eVar.LJIILIIL = true;
            Gson gsonLIZ = eVar.LIZ();
            Map<String, String> map = C1127850fSJ.LIZ;
            map.put("top_banner_arch", "Old (GiftPanelTopLeaf)");
            map.put("top_banner_gift_id", String.valueOf(c1127440fRe.LJI));
            String name = "";
            if (enumC1127500fRk2 == null || (strName = enumC1127500fRk2.name()) == null) {
                strName = "";
            }
            map.put("top_banner_current_banner_type", strName);
            if (first != null) {
                name = first.getClass().getName();
            }
            map.put("top_banner_current_banner_panel", name);
            map.put("top_banner_gift_banner", GsonProtectorUtils.toJson(gsonLIZ, c1127440fRe.LIZ));
            map.put("top_banner_gift_page_banner", GsonProtectorUtils.toJson(gsonLIZ, c1127440fRe.LIZIZ));
            map.put("top_banner_list", "Not Available for Old Arch");
            InterfaceC1100860ekm interfaceC1100860ekmSg = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Sg();
            if (interfaceC1100860ekmSg != null) {
                ((C1133970fcB) interfaceC1100860ekmSg).LIZ(map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x04ff A[PHI: r11
      0x04ff: PHI (r11v3 com.bytedance.ies.sdk.datachannel.DataChannel) = 
      (r11v2 com.bytedance.ies.sdk.datachannel.DataChannel)
      (r11v7 com.bytedance.ies.sdk.datachannel.DataChannel)
      (r11v7 com.bytedance.ies.sdk.datachannel.DataChannel)
      (r11v7 com.bytedance.ies.sdk.datachannel.DataChannel)
      (r11v7 com.bytedance.ies.sdk.datachannel.DataChannel)
      (r11v7 com.bytedance.ies.sdk.datachannel.DataChannel)
     binds: [B:354:0x0497, B:356:0x049b, B:358:0x04a5, B:360:0x04a9, B:362:0x04af, B:364:0x04b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJZ(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r28, com.bytedance.android.livesdk.model.GiftPanelBanner r29, boolean r30, X.EnumC1127640fRy r31) {
        /*
            Method dump skipped, instruction units count: 1477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127390fRZ.LJJJZ(X.0fQI, com.bytedance.android.livesdk.model.GiftPanelBanner, boolean, X.0fRy):void");
    }

    public final void LJJLIIIJ(GiftPanelBanner giftPanelBanner, C1127440fRe c1127440fRe, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2, EnumC1127500fRk enumC1127500fRk) {
        C1128710fTh c1128710fTh;
        C1127920fSQ c1127920fSQ;
        C1124780fNM c1124780fNM = this.LLJJJIL;
        if (c1124780fNM != null) {
            c1124780fNM.setData(giftPanelBanner);
        }
        C1124780fNM c1124780fNM2 = this.LLJJJIL;
        if (c1124780fNM2 != null) {
            C786410Ut5.D8(c1124780fNM2, new ACListenerS86S1100000_17(new AwS261S0300000_17(c1127440fRe, this, giftPanelBanner, 15), giftPanelBanner.schemaUrl, 3));
        }
        LJJLIIIJJI(this.LLJJJIL, c1127440fRe, enumC1127500fRk);
        C1124780fNM c1124780fNM3 = this.LLJJJIL;
        boolean z = false;
        if (c1124780fNM3 != null && ((c1127920fSQ = c1127440fRe.LJII) == null || !c1127920fSQ.LIZ)) {
            C1117830fC9.LIZ(0, c1124780fNM3);
            c1124780fNM3.requestLayout();
        }
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && c1128710fTh.LLLLLLIL && !Intrinsics.LJFF(abstractC1126600fQI2, abstractC1126600fQI)) {
            long j = c1127440fRe.LJI;
            if (P1() == 16) {
                z = true;
            }
            C1123800fLm.LIZIZ(j, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x08eb  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIJILLIZJL(X.C1127390fRZ r18, X.C1127440fRe r19, X.AbstractC1126600fQI r20, boolean r21, boolean r22, int r23) {
        /*
            Method dump skipped, instruction units count: 2434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127390fRZ.LJJLIIIJILLIZJL(X.0fRZ, X.0fRe, X.0fQI, boolean, boolean, int):void");
    }
}
