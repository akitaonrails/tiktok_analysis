package X;

import Y.AfS186S0100000_17;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRankLeftChangedEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSpecialEffectCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleVaultBoostingGloveCardEffectChannel;
import com.bytedance.android.livesdk.CampaignProgressRefreshRequestEvent;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelTopLeafNewArchSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSmallGiftBatchSendOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127650fRz extends AbstractC1100460ek8 implements InterfaceC1127730fS7, InterfaceC1127990fSX {
    public static final AtomicBoolean LLJJJJJIL = new AtomicBoolean(!LiveGiftPanelTopLeafNewArchSetting.INSTANCE.isPreloadEnabled());
    public GiftListResult LLJ;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLJI;
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLJIJIL;
    public C1127660fS0 LLJILJIL;
    public C1127700fS4 LLJILJILJ;
    public C01KK LLJILLL;
    public C23119094b LLJJ;
    public DataChannel LLJJI;
    public LifecycleOwner LLJJIII;
    public final C1127810fSF LLJJIJI;
    public final C1127670fS1 LLJJIJIIJIL;
    public final C5183020f LLJJIJIL;
    public GiftLeafRootViewModel LLJJJ;
    public GiftPanelLeafViewModel LLJJJIL;
    public final int LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.0fZO] */
    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        GiftLeafRootViewModel giftLeafRootViewModel;
        LifecycleOwner lifecycleOwnerLJJIFFI;
        C1100690ekV<AbstractC1127860fSK> c1100690ekV;
        Fragment fragment;
        Fragment fragment2;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment2 = c1100420ek4.getFragment()) == null) {
            giftLeafRootViewModel = null;
        } else if (fragment2.isAdded()) {
            giftLeafRootViewModel = (GiftLeafRootViewModel) new ViewModelProvider(fragment2).get(GiftLeafRootViewModel.class);
        } else {
            C1AF0.LIZJ("GiftPanelTopLeaf cannot get ViewModel");
            giftLeafRootViewModel = null;
        }
        this.LLJJJ = giftLeafRootViewModel;
        C1100420ek4 c1100420ek42 = this.LLILZIL;
        this.LLJJJIL = (c1100420ek42 == null || (fragment = c1100420ek42.getFragment()) == null || !fragment.isAdded()) ? null : (GiftPanelLeafViewModel) new ViewModelProvider(fragment).get(GiftPanelLeafViewModel.class);
        GiftLeafRootViewModel giftLeafRootViewModel2 = this.LLJJJ;
        DataChannel dataChannel = giftLeafRootViewModel2 != null ? giftLeafRootViewModel2.LL : null;
        if (C504210Jpz.LIZ || C464660IKa.LIZ()) {
            lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.LL, false);
        } else {
            ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.LL);
            lifecycleOwnerLJJIFFI = componentCallbacks2LIZ instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2LIZ : null;
        }
        if (LLJJJJJIL.compareAndSet(false, true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1127530fRn(null), 3);
        }
        View view = this.LLILZ;
        if (view == null) {
            return;
        }
        AwS146S0400000_17 awS146S0400000_17 = new AwS146S0400000_17(view, dataChannel, this, lifecycleOwnerLJJIFFI, 3);
        GiftLeafRootViewModel giftLeafRootViewModel3 = this.LLJJJ;
        if (giftLeafRootViewModel3 != null && (c1100690ekV = giftLeafRootViewModel3.LLILZ) != null) {
            c1100690ekV.LIZJ(this.LLILLL, this.LLJJIJI);
        }
        C1100530ekF c1100530ekF = this.LLIZ;
        if (c1100530ekF != null) {
            c1100530ekF.LIZ(this.LLJJIJIIJIL);
        }
        this.LLJILJIL = new C1127660fS0(awS146S0400000_17);
        C1127700fS4 c1127700fS4 = new C1127700fS4(this, dataChannel, lifecycleOwnerLJJIFFI);
        this.LLJILJILJ = c1127700fS4;
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        interfaceC1128210fStInst.registerGiftListListener(c1127700fS4.LIZJ);
        C1127710fS5 c1127710fS5 = c1127700fS4.LIZLLL;
        if (c1127710fS5 != null) {
            interfaceC1128210fStInst.addGalleryInfoUpdateListener(c1127710fS5);
        }
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, BattleTop3CardEffectChannel.class, new AwS596S0100000_17(c1127700fS4, 470));
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, BattleTop2CardEffectChannel.class, new AwS596S0100000_17(c1127700fS4, 472));
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, BattleRankLeftChangedEvent.class, new AwS383S0200000_17(dataChannel, c1127700fS4, 92));
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, BattleVaultBoostingGloveCardEffectChannel.class, new AwS596S0100000_17(c1127700fS4, 465));
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, BattleSpecialEffectCardEffectChannel.class, new AwS596S0100000_17(c1127700fS4, 468));
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C1132240fZO.LIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwnerLJJIFFI, CollaborateGiftingStateChannel.class, new AwS383S0200000_17(c259800zU, (C259800zU<AbstractC1132210fZL>) c1127700fS4, (C1127700fS4) 91));
        }
        LJJJJ();
        if (dataChannel != null) {
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            this.LLJJ = c23119094bLIZ;
            this.LLJILLL = new C01KK(C2296808zG.LIZ(c23119094bLIZ), dataChannel, new AwS561S0100000_17(this, 485));
            if (lifecycleOwnerLJJIFFI != null) {
                this.LLJJI = dataChannel;
                this.LLJJIII = lifecycleOwnerLJJIFFI;
                dataChannel.BQ2(lifecycleOwnerLJJIFFI, CampaignProgressRefreshRequestEvent.class, this.LLJJIJIL);
            }
        }
    }

    @Override // X.InterfaceC1127730fS7
    public final InterfaceC1127800fSE LIZIZ() {
        C1127660fS0 c1127660fS0 = this.LLJILJIL;
        if (c1127660fS0 != null) {
            return c1127660fS0.LIZLLL();
        }
        return null;
    }

    public final void LJJJJ() {
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.GQ2(this.LLJJIII, CampaignProgressRefreshRequestEvent.class, this.LLJJIJIL);
        }
        this.LLJJI = null;
        this.LLJJIII = null;
        C01KK c01kk = this.LLJILLL;
        if (c01kk != null) {
            AnonymousClass0956 anonymousClass0956 = c01kk.LJIIIIZZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c01kk.LJIIIIZZ = null;
            c01kk.LJII.clear();
            c01kk.LJIIJJI++;
        }
        this.LLJILLL = null;
        C23119094b c23119094b = this.LLJJ;
        if (c23119094b != null) {
            c23119094b.LIZIZ(null);
        }
        this.LLJJ = null;
    }

    @Override // X.InterfaceC1127730fS7
    public final int P1() {
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null) {
            return -1;
        }
        return c1128710fTh.P1();
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        C1100690ekV<AbstractC1127860fSK> c1100690ekV;
        super.LJJIZ();
        GiftLeafRootViewModel giftLeafRootViewModel = this.LLJJJ;
        if (giftLeafRootViewModel != null && (c1100690ekV = giftLeafRootViewModel.LLILZ) != null) {
            c1100690ekV.LIZLLL(this.LLJJIJI);
        }
        C1100530ekF c1100530ekF = this.LLIZ;
        if (c1100530ekF != null) {
            C1127670fS1 c1127670fS1 = this.LLJJIJIIJIL;
            C1100530ekF.LIZIZ("addObserver");
            ((ArrayList) c1100530ekF.LIZIZ).remove(c1127670fS1);
        }
        C1127700fS4 c1127700fS4 = this.LLJILJILJ;
        if (c1127700fS4 != null) {
            InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
            interfaceC1128210fStInst.unRegisterGiftListListener(c1127700fS4.LIZJ);
            C1127710fS5 c1127710fS5 = c1127700fS4.LIZLLL;
            if (c1127710fS5 != null) {
                interfaceC1128210fStInst.removeGalleryInfoUpdateListener(c1127710fS5);
            }
        }
        LJJJJ();
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // X.InterfaceC1127730fS7
    public final AbstractC1126600fQI<? extends AnonymousClass0054> LJIIIIZZ() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0fSF] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fS1] */
    public C1127650fRz(Context context) {
        super(context, EnumC1129580fV6.GIFT_PANEL_SUB.getZIndex());
        this.LLJJIJI = new InterfaceC1100670ekT<AbstractC1127860fSK>() { // from class: X.0fSF
            @Override // X.InterfaceC1100670ekT
            public final void LLZZLLIL(AbstractC1127860fSK abstractC1127860fSK) {
                AbstractC1127860fSK abstractC1127860fSK2 = abstractC1127860fSK;
                if (abstractC1127860fSK2 instanceof C1127880fSM) {
                    C1127650fRz c1127650fRz = this.LIZ;
                    c1127650fRz.LLJIJIL = c1127650fRz.LLJI;
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = ((C1127880fSM) abstractC1127860fSK2).LIZ;
                    c1127650fRz.LLJI = abstractC1126600fQI;
                    c1127650fRz.LJ(abstractC1126600fQI, EnumC1127640fRy.NORMAL);
                }
            }
        };
        this.LLJJIJIIJIL = new InterfaceC1100540ekG() { // from class: X.0fS1
            @Override // X.InterfaceC1100540ekG
            public final void LIZ(C1100530ekF c1100530ekF, EnumC1100550ekH enumC1100550ekH) {
                int i = C1100590ekL.LIZ[enumC1100550ekH.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C01KK c01kk = this.LIZ.LLJILLL;
                        if (c01kk != null) {
                            AnonymousClass0956 anonymousClass0956 = c01kk.LJIIIIZZ;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            c01kk.LJIIIIZZ = null;
                            c01kk.LJII.clear();
                            c01kk.LJIIJJI++;
                        }
                        C1127660fS0 c1127660fS0 = this.LIZ.LLJILJIL;
                        if (c1127660fS0 != null) {
                            c1127660fS0.LJ();
                        }
                        C1127700fS4 c1127700fS4 = this.LIZ.LLJILJILJ;
                        if (c1127700fS4 != null) {
                            c1127700fS4.LJ.LJ();
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                C1128590fTV.LJJIFFI = SystemClock.uptimeMillis();
                C1127650fRz c1127650fRz = this.LIZ;
                C1127660fS0 c1127660fS02 = c1127650fRz.LLJILJIL;
                if (c1127660fS02 != null) {
                    c1127660fS02.LJFF(new AwS561S0100000_17(c1127650fRz, 488));
                }
                C1127700fS4 c1127700fS42 = this.LIZ.LLJILJILJ;
                if (c1127700fS42 != null) {
                    c1127700fS42.LJ.LIZ(C784440Upu.LIZ().LIZJ(c1127700fS42.LIZIZ, C1126670fQP.class).LIZJ(new AfS186S0100000_17(c1127700fS42, 127)));
                }
                C1128590fTV.LJJII = SystemClock.uptimeMillis();
            }
        };
        this.LLJJIJIL = new C5183020f(this, 231);
        this.LLJJJJ = R.layout.hzb;
    }

    @Override // X.InterfaceC1127730fS7
    public final void LIZ(GiftListResult giftListResult) {
        this.LLJ = giftListResult;
    }

    @Override // X.InterfaceC1127990fSX
    public final void LIZLLL(C1142020fpA c1142020fpA) {
        InterfaceC1127990fSX interfaceC1127990fSX;
        C1127660fS0 c1127660fS0 = this.LLJILJIL;
        InterfaceC1127800fSE interfaceC1127800fSELIZLLL = null;
        if (c1127660fS0 != null) {
            interfaceC1127800fSELIZLLL = c1127660fS0.LIZLLL();
        }
        if ((interfaceC1127800fSELIZLLL instanceof InterfaceC1127990fSX) && (interfaceC1127990fSX = (InterfaceC1127990fSX) interfaceC1127800fSELIZLLL) != null) {
            interfaceC1127990fSX.LIZLLL(c1142020fpA);
        }
    }

    @Override // X.InterfaceC1127730fS7
    public final void LJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, EnumC1127640fRy enumC1127640fRy) {
        int i;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2;
        C1127660fS0 c1127660fS0;
        Pair<? extends InterfaceC1127800fSE, ? extends View> pair;
        View second;
        InterfaceC1127800fSE interfaceC1127800fSELIZLLL;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3;
        if (abstractC1126600fQI != null && LiveGiftSmallGiftBatchSendOptSetting.enabled() && ((i = C1127780fSC.LIZ[enumC1127640fRy.ordinal()]) == 1 ? !((abstractC1126600fQI2 = this.LLJI) == null || abstractC1126600fQI2.LJFF() != abstractC1126600fQI.LJFF()) : !(i != 2 || (abstractC1126600fQI3 = this.LLJIJIL) == null || abstractC1126600fQI3.LJFF() != abstractC1126600fQI.LJFF()))) {
            C1127660fS0 c1127660fS02 = this.LLJILJIL;
            EnumC1127500fRk bannerType = null;
            if (c1127660fS02 != null && (interfaceC1127800fSELIZLLL = c1127660fS02.LIZLLL()) != null) {
                bannerType = interfaceC1127800fSELIZLLL.getBannerType();
            }
            if (bannerType == EnumC1127500fRk.BATCH_PACKAGE && (c1127660fS0 = this.LLJILJIL) != null && (pair = c1127660fS0.LIZIZ) != null && (second = pair.getSecond()) != null && second.getVisibility() == 0) {
                return;
            }
        }
        C1124680fNC c1124680fNCLJJJIL = LJJJIL(abstractC1126600fQI, enumC1127640fRy);
        C1127660fS0 c1127660fS03 = this.LLJILJIL;
        if (c1127660fS03 != null) {
            c1127660fS03.LIZ(c1124680fNCLJJJIL);
        }
    }

    public final C1124680fNC LJJJIL(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, EnumC1127640fRy enumC1127640fRy) {
        DataChannel dataChannel;
        View second;
        Object obj;
        Gift gift;
        long jLJFF;
        Object obj2;
        Object obj3;
        GiftPanelBanner giftPanelBanner;
        C1128940fU4 c1128940fU4;
        GiftPanelBanner value;
        Room room;
        Long lValueOf;
        MutableLiveData<GiftPanelBanner> mutableLiveData;
        Gift gift2;
        Pair<? extends InterfaceC1127800fSE, ? extends View> pair;
        GiftLeafRootViewModel giftLeafRootViewModel = this.LLJJJ;
        C1127920fSQ c1127920fSQ = null;
        if (giftLeafRootViewModel != null) {
            dataChannel = giftLeafRootViewModel.LL;
        } else {
            dataChannel = null;
        }
        int iP1 = P1();
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJIJIL;
        C1127660fS0 c1127660fS0 = this.LLJILJIL;
        if (c1127660fS0 != null && (pair = c1127660fS0.LIZIZ) != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Gift) {
            gift = (Gift) obj;
        } else {
            gift = null;
        }
        if (abstractC1126600fQI != null) {
            jLJFF = abstractC1126600fQI.LJFF();
        } else {
            jLJFF = 0;
        }
        GiftListResult giftListResult = this.LLJ;
        if (giftListResult == null) {
            giftListResult = GiftManager.inst().getGiftListResult();
        }
        if (abstractC1126600fQI != null) {
            obj2 = abstractC1126600fQI.LIZIZ;
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof Gift) || (gift2 = (Gift) obj2) == null || (giftPanelBanner = gift2.giftPanelBanner) == null) {
            if (abstractC1126600fQI != null) {
                obj3 = abstractC1126600fQI.LIZIZ;
            } else {
                obj3 = null;
            }
            if ((obj3 instanceof C1128940fU4) && (c1128940fU4 = (C1128940fU4) obj3) != null) {
                giftPanelBanner = c1128940fU4.LJIIIZ;
            } else {
                giftPanelBanner = null;
            }
        }
        GiftPanelLeafViewModel giftPanelLeafViewModel = this.LLJJJIL;
        if (giftPanelLeafViewModel != null && (mutableLiveData = giftPanelLeafViewModel.LL) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C1127920fSQ galleryEntranceInfo = GiftManager.inst().getGalleryEntranceInfo();
        if (galleryEntranceInfo != null) {
            if (abstractC1126600fQI != null) {
                lValueOf = Long.valueOf(abstractC1126600fQI.LJFF());
            } else {
                lValueOf = null;
            }
            c1127920fSQ = new C1127920fSQ(C1127480fRi.LJ(lValueOf, null), galleryEntranceInfo.LIZIZ, galleryEntranceInfo.LIZJ);
        }
        return new C1124680fNC(iP1, abstractC1126600fQI, abstractC1126600fQI2, second, gift, jLJFF, giftListResult, giftPanelBanner, value, enumC1127640fRy, abstractC1100450ek7, room, c1127920fSQ);
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C0J3Y c0j3y = C0J3Y.LIZ;
        int i = this.LLJJJJ;
        c0j3y.getClass();
        View viewLJIIIIZZ = C0J3Y.LJIIIIZZ(i);
        if (viewLJIIIIZZ == null) {
            viewLJIIIIZZ = C786410Ut5.Td(layoutInflater, this.LLJJJJ, viewGroup, false);
        }
        this.LLILZ = viewLJIIIIZZ;
        if (viewLJIIIIZZ == null) {
            return null;
        }
        C19ME c19me = new C19ME(-1, -1);
        View view = this.LLILZ;
        if (view == null) {
            return null;
        }
        return new Pair<>(view, c19me);
    }

    @Override // X.InterfaceC1127730fS7
    public final void LIZJ(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, EnumC1127500fRk enumC1127500fRk, EnumC1127640fRy enumC1127640fRy, InterfaceC1123410fL9 interfaceC1123410fL9) {
        Unit unit;
        InterfaceC1127800fSE next;
        C1124680fNC c1124680fNCLJJJIL = LJJJIL(abstractC1126600fQI, enumC1127640fRy);
        C1127660fS0 c1127660fS0 = this.LLJILJIL;
        if (c1127660fS0 != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<InterfaceC1127800fSE> it2 = c1127660fS0.LIZJ().LIZIZ().iterator();
            while (true) {
                unit = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getBannerType() == enumC1127500fRk) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1127800fSE interfaceC1127800fSE = next;
            if (interfaceC1127800fSE != null && interfaceC1127800fSE.LJFF(c1124680fNCLJJJIL)) {
                View viewLJI = interfaceC1127800fSE.LJI(c1124680fNCLJJJIL, c1127660fS0, interfaceC1123410fL9);
                if (viewLJI != null) {
                    c1127660fS0.LJII(interfaceC1127800fSE, viewLJI, c1124680fNCLJJJIL);
                    unit = Unit.LIZ;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to show banner with type ");
                sbLIZ.append(enumC1127500fRk);
                C20441214yg.LJ("GiftPanelTopBannerCoordinator", C2188811AlT.LIZIZ(sbLIZ));
                unit = Unit.LIZ;
            }
            c1127660fS0.LJI(c1124680fNCLJJJIL, ((Number) new Pair(unit, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)).getSecond()).longValue());
        }
    }
}
