package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import avg.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.GiftBeaconBubbleRefreshEvent;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPanelBeaconBubble;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS2S2300100_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125580fOe extends AbstractC1100460ek8 {
    public AbstractC1126600fQI<? extends AnonymousClass0054> LLJ;
    public String LLJI;
    public C1125560fOc LLJIJIL;
    public C1125790fOz LLJILJIL;
    public C1125530fOZ LLJILJILJ;
    public C1125640fOk LLJILLL;
    public C1125640fOk LLJJ;
    public ViewGroup LLJJI;
    public long LLJJIII;
    public ConstraintLayout LLJJIJI;
    public View LLJJIJIIJIL;
    public final Set<View> LLJJIJIL;
    public long LLJJJ;
    public Room LLJJJIL;
    public final C11NJ LLJJJJ;
    public final int LLJJJJJIL;
    public final C1125590fOf LLJJJJLIIL;
    public final C1125690fOp LLJJL;
    public final C1125650fOl LLJJLIIIJLLLLLLLZ;

    public final GiftPanelLeafViewModel LJJJJIZL() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null || !fragment.isAdded()) {
            return null;
        }
        return (GiftPanelLeafViewModel) ViewModelProviders.of(fragment).get(GiftPanelLeafViewModel.class);
    }

    public final GiftLeafRootViewModel LJJJJJ() {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = this.LLILZIL;
        if (c1100420ek4 == null || (fragment = c1100420ek4.getFragment()) == null) {
            return null;
        }
        if (fragment.isAdded()) {
            return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
        }
        C1AF0.LIZJ("GiftBeaconBubbleLeaf cannot get ViewModel");
        return null;
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        LifecycleOwner lifecycleOwnerLJJIFFI;
        C1100690ekV<AbstractC1125680fOo> c1100690ekV;
        int childCount;
        DataChannel dataChannel;
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
        this.LLJJJIL = (giftLeafRootViewModelLJJJJJ == null || (dataChannel = giftLeafRootViewModelLJJJJJ.LL) == null) ? null : (Room) dataChannel.gg0(RoomChannel.class);
        View view = this.LLILZ;
        ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
        this.LLJJIJI = constraintLayout;
        this.LLJIJIL = constraintLayout != null ? (C1125560fOc) constraintLayout.findViewById(R.id.mym) : null;
        ConstraintLayout constraintLayout2 = this.LLJJIJI;
        this.LLJILJILJ = constraintLayout2 != null ? (C1125530fOZ) constraintLayout2.findViewById(R.id.ixa) : null;
        ConstraintLayout constraintLayout3 = this.LLJJIJI;
        this.LLJILJIL = constraintLayout3 != null ? (C1125790fOz) constraintLayout3.findViewById(R.id.viewer_picks_bubble) : null;
        ConstraintLayout constraintLayout4 = this.LLJJIJI;
        this.LLJILLL = constraintLayout4 != null ? (C1125640fOk) constraintLayout4.findViewById(R.id.hel) : null;
        ConstraintLayout constraintLayout5 = this.LLJJIJI;
        this.LLJJ = constraintLayout5 != null ? (C1125640fOk) constraintLayout5.findViewById(R.id.kkj) : null;
        ConstraintLayout constraintLayout6 = this.LLJJIJI;
        if (!(constraintLayout6 instanceof ViewGroup)) {
            constraintLayout6 = null;
        }
        if (constraintLayout6 != null && (childCount = constraintLayout6.getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = constraintLayout6.getChildAt(i);
                if (childAt instanceof InterfaceC1125550fOb) {
                    this.LLJJIJIL.add(childAt);
                }
                if (i == childCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C1100530ekF c1100530ekF = this.LLIZ;
        if (c1100530ekF != null) {
            c1100530ekF.LIZ(new InterfaceC1100540ekG() { // from class: X.0fOg
                @Override // X.InterfaceC1100540ekG
                public final void LIZ(C1100530ekF c1100530ekF2, EnumC1100550ekH enumC1100550ekH) {
                    int i2 = C1100600ekM.LIZ[enumC1100550ekH.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C1125580fOe c1125580fOe = this.LIZ;
                            c1125580fOe.getClass();
                            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", "doOnParentEnd: ");
                            c1125580fOe.LLJJJJ.LJ();
                            c1125580fOe.LLJJJ++;
                            C1125640fOk c1125640fOk = c1125580fOe.LLJILLL;
                            if (c1125640fOk != null) {
                                c1125640fOk.setTag(null);
                            }
                            C1125640fOk c1125640fOk2 = c1125580fOe.LLJJ;
                            if (c1125640fOk2 != null) {
                                c1125640fOk2.setTag(null);
                            }
                            ConstraintLayout constraintLayout7 = c1125580fOe.LLJJIJI;
                            if (constraintLayout7 != null) {
                                C786410Ut5.LL(8, constraintLayout7);
                                View view2 = c1125580fOe.LLJJIJIIJIL;
                                if (view2 != null) {
                                    C786410Ut5.LJLLLLLL(8, view2);
                                }
                                c1125580fOe.LLJJIJIIJIL = null;
                                return;
                            }
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C1125580fOe c1125580fOe2 = this.LIZ;
                    c1125580fOe2.getClass();
                    C20441214yg.LJIIIZ("GiftBeaconBubbleLeaf", "doOnParentStart: ");
                    c1125580fOe2.LLJJJJ.LIZ(C784440Upu.LIZ().LJ(C1128070fSf.class).LJJLJLI(new AfS186S0100000_17(c1125580fOe2, 154)));
                    c1125580fOe2.LLJJIII = SystemClock.uptimeMillis();
                }
            });
        }
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ2 = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ2 != null && (c1100690ekV = giftLeafRootViewModelLJJJJJ2.LLILZLL) != null) {
            c1100690ekV.LIZJ(this.LLILLL, this.LLJJJJLIIL);
        }
        GiftManager.inst().registerGiftListListener(this.LLJJL);
        GiftManager.inst().addGalleryInfoUpdateListener(this.LLJJLIIIJLLLLLLLZ);
        if (C464660IKa.LIZ()) {
            lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(this.LL, false);
        } else {
            Object obj = this.LL;
            if (!(obj instanceof LifecycleOwner)) {
                return;
            } else {
                lifecycleOwnerLJJIFFI = (LifecycleOwner) obj;
            }
        }
        if (lifecycleOwnerLJJIFFI != null) {
            DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwnerLJJIFFI, GiftBeaconBubbleRefreshEvent.class, new AwS596S0100000_17(this, 625));
            DataChannelGlobal.LLILZ.BQ2(this, lifecycleOwnerLJJIFFI, TaskChangeEvent.class, new AwS596S0100000_17(this, 626));
        }
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        C1100690ekV<AbstractC1125680fOo> c1100690ekV;
        super.LJJIZ();
        GiftManager.inst().unRegisterGiftListListener(this.LLJJL);
        GiftManager.inst().removeGalleryInfoUpdateListener(this.LLJJLIIIJLLLLLLLZ);
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJ = LJJJJJ();
        if (giftLeafRootViewModelLJJJJJ != null && (c1100690ekV = giftLeafRootViewModelLJJJJJ.LLILZLL) != null) {
            c1100690ekV.LIZLLL(this.LLJJJJLIIL);
        }
        C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", "onUnRegister: ");
    }

    public final long LJJJJI() {
        MutableLiveData<Long> mutableLiveData;
        Long value;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL = LJJJJIZL();
        if (giftPanelLeafViewModelLJJJJIZL == null || (mutableLiveData = giftPanelLeafViewModelLJJJJIZL.LLILZIL) == null || (value = mutableLiveData.getValue()) == null) {
            return 0L;
        }
        return value.longValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fOf] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0fOp] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0fOl] */
    public C1125580fOe(Context context) {
        super(context, EnumC1129580fV6.GIFT_PANEL_SUB.getZIndex());
        this.LLJJIJIL = new LinkedHashSet();
        this.LLJJJJ = new C11NJ();
        this.LLJJJJJIL = R.layout.gnq;
        this.LLJJJJLIIL = new InterfaceC1100670ekT<AbstractC1125680fOo>() { // from class: X.0fOf
            @Override // X.InterfaceC1100670ekT
            public final void LLZZLLIL(AbstractC1125680fOo abstractC1125680fOo) {
                long j;
                long jLJI;
                C1125530fOZ c1125530fOZ;
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL;
                MutableLiveData<Long> mutableLiveData;
                AbstractC1125680fOo abstractC1125680fOo2 = abstractC1125680fOo;
                if (abstractC1125680fOo2 instanceof C1125710fOr) {
                    C1125580fOe c1125580fOe = this.LIZ;
                    C1125710fOr c1125710fOr = (C1125710fOr) abstractC1125680fOo2;
                    c1125580fOe.LLJI = c1125710fOr.LIZIZ;
                    long j2 = c1125710fOr.LIZ;
                    if (j2 > 0 && (giftPanelLeafViewModelLJJJJIZL = c1125580fOe.LJJJJIZL()) != null && (mutableLiveData = giftPanelLeafViewModelLJJJJIZL.LLILZIL) != null) {
                        mutableLiveData.setValue(Long.valueOf(j2));
                    }
                    this.LIZ.LJJJJL(null, "InitBubbleState");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("GiftBeaconBubbleLeaf InitBubbleState selectedGiftId: ");
                    sbLIZ.append(j2);
                    sbLIZ.append(" defaultSelectedGiftId: ");
                    sbLIZ.append(this.LIZ.LJJJJI());
                    C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (abstractC1125680fOo2 instanceof C1125660fOm) {
                    C1125660fOm c1125660fOm = (C1125660fOm) abstractC1125680fOo2;
                    this.LIZ.LLJI = c1125660fOm.LIZIZ;
                    this.LIZ.LJJJJL(c1125660fOm.LIZ, "UpdateBubbleState");
                    return;
                }
                if (abstractC1125680fOo2 instanceof C1125720fOs) {
                    C1125580fOe c1125580fOe2 = this.LIZ;
                    if (!Intrinsics.LJFF(c1125580fOe2.LLJJIJIIJIL, c1125580fOe2.LLJILJILJ)) {
                        return;
                    }
                    View view = this.LIZ.LLJJIJIIJIL;
                    boolean z = true;
                    if (view == null || view.getVisibility() != 0) {
                        return;
                    }
                    AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LIZ.LLJ;
                    if (abstractC1126600fQI != null) {
                        j = abstractC1126600fQI.LJIILJJIL;
                    } else {
                        j = 0;
                    }
                    if (abstractC1126600fQI != null) {
                        jLJI = abstractC1126600fQI.LJI();
                    } else {
                        jLJI = 0;
                    }
                    Gift.GiftSponsorInfo giftSponsorInfoLIZJ = C1127480fRi.LIZJ(Long.valueOf(jLJI), null);
                    if (giftSponsorInfoLIZJ != null) {
                        z = giftSponsorInfoLIZJ.canSponsor;
                    }
                    if (j < 0 || !z || (c1125530fOZ = this.LIZ.LLJILJILJ) == null) {
                        return;
                    }
                    C1125530fOZ.LIZ(c1125530fOZ, null, null, z, null, null, null, Integer.valueOf(((C1125720fOs) abstractC1125680fOo2).LIZ), null, 187);
                    return;
                }
                throw new C1954807lC();
            }
        };
        this.LLJJL = new InterfaceC1133110fan() { // from class: X.0fOp
            @Override // X.InterfaceC1133110fan
            public final void LIZLLL(GiftListResult giftListResult, int i) {
                if (giftListResult != null) {
                    this.LL.LJJJJJL("GiftListResponse");
                }
            }
        };
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC1128230fSv() { // from class: X.0fOl
            @Override // X.InterfaceC1128230fSv
            public final void LIZ(C1127820fSG c1127820fSG) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this.LIZ, c1127820fSG, 102);
                if (C805320ViU.LIZ()) {
                    awS418S0200000_17.invoke();
                } else {
                    C473410IhP.LIZIZ(new ARunnableS117S0100000_17(awS418S0200000_17, 252));
                }
            }
        };
    }

    public final void LJJJJ(int i) {
        ViewParent parent;
        C19MB c19mb = new C19MB();
        ViewGroup viewGroup = this.LLJJI;
        ConstraintLayout constraintLayout = null;
        if (viewGroup != null) {
            parent = viewGroup.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
            c19mb.LJII(constraintLayout);
        }
        ViewGroup viewGroup2 = this.LLJJI;
        if (viewGroup2 != null) {
            c19mb.LJIILIIL(viewGroup2.getId(), (int) C497740JfY.LIZIZ(i));
        }
        if (constraintLayout != null) {
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void LJJJJJL(String str) {
        String str2;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Fragment fragment;
        BagListViewModel bagListViewModel;
        MutableLiveData<AbstractC1126600fQI<? extends AnonymousClass0054>> mutableLiveData;
        AbstractC1126600fQI<? extends AnonymousClass0054> value2;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData3;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL = LJJJJIZL();
        if (giftPanelLeafViewModelLJJJJIZL == null || (str2 = giftPanelLeafViewModelLJJJJIZL.LLILZLL) == null) {
            str2 = "";
        }
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL2 = LJJJJIZL();
        Integer value3 = null;
        if (giftPanelLeafViewModelLJJJJIZL2 != null && (mutableLiveData3 = giftPanelLeafViewModelLJJJJIZL2.LLILLJJLI) != null) {
            value = mutableLiveData3.getValue();
        } else {
            value = null;
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQILIZ = C1125160fNy.LIZ(str2, value);
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJJJIZL3 = LJJJJIZL();
        if (giftPanelLeafViewModelLJJJJIZL3 != null && (mutableLiveData2 = giftPanelLeafViewModelLJJJJIZL3.LLILLL) != null) {
            value3 = mutableLiveData2.getValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshBeaconBubble defaultSelectedId = ");
        sbLIZ.append(LJJJJI());
        sbLIZ.append(",current tab = ");
        sbLIZ.append(value3);
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
        if (value3 != null && value3.intValue() == 16) {
            C1100420ek4 c1100420ek4 = this.LLILZIL;
            if (c1100420ek4 != null && (fragment = c1100420ek4.getFragment()) != null && fragment.isAdded() && (bagListViewModel = (BagListViewModel) ViewModelProviders.of(fragment).get(BagListViewModel.class)) != null && (mutableLiveData = bagListViewModel.LLILZ) != null && (value2 = mutableLiveData.getValue()) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("refreshBeaconBubble_backpack_");
                sbLIZ2.append(str);
                LJJJJL(value2, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("refreshBeaconBubble_");
        sbLIZ3.append(str);
        LJJJJL(abstractC1126600fQILIZ, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static boolean LJJJIL(C1125640fOk c1125640fOk, GiftPanelBeaconBubble giftPanelBeaconBubble) {
        Object tag;
        if (giftPanelBeaconBubble == null || (tag = c1125640fOk.getTag()) == null || !(tag instanceof GiftPanelBeaconBubble)) {
            return false;
        }
        GiftPanelBeaconBubble giftPanelBeaconBubble2 = (GiftPanelBeaconBubble) tag;
        if (!Intrinsics.LJFF(giftPanelBeaconBubble2.lynxUrl, giftPanelBeaconBubble.lynxUrl) || !Intrinsics.LJFF(giftPanelBeaconBubble2.lynxExtra, giftPanelBeaconBubble.lynxExtra) || giftPanelBeaconBubble2.type != giftPanelBeaconBubble.type) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125580fOe.LJJJJL(X.0fQI, java.lang.String):void");
    }

    public final void LJJJJLL(View view, String str) {
        Boolean boolValueOf;
        View view2;
        AbstractC1100450ek7 abstractC1100450ek7;
        C1128710fTh c1128710fTh;
        boolean z;
        boolean z2;
        boolean z3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateShownView: source = ");
        sbLIZ.append(str);
        sbLIZ.append(" shownView ");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(" view ");
        sbLIZ.append(view);
        sbLIZ.append("  rootView visible: ");
        ConstraintLayout constraintLayout = this.LLJJIJI;
        Boolean boolValueOf2 = null;
        boolean z4 = true;
        if (constraintLayout != null) {
            if (constraintLayout.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(" view visible: ");
        if (view != null) {
            if (view.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolValueOf2 = Boolean.valueOf(z2);
        }
        sbLIZ.append(boolValueOf2);
        C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
        View view3 = this.LLJJIJIIJIL;
        if (view3 == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showBubbleFirstTime: realView ==null = ");
            if (this.LLJJIJI == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ2));
            ConstraintLayout constraintLayout2 = this.LLJJIJI;
            if (constraintLayout2 != null && constraintLayout2.getVisibility() != 0) {
                Iterator<View> it2 = this.LLJJIJIL.iterator();
                while (it2.hasNext()) {
                    C786410Ut5.LJLLLLLL(8, it2.next());
                }
                C786410Ut5.LJLLLLLL(0, constraintLayout2);
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C786410Ut5.LJLLLLLL(0, view);
                }
            }
            this.LLJJIJIIJIL = view;
            abstractC1100450ek7 = this.LLIZLLLIL;
            if (!(abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null) {
                if (view == null) {
                    z4 = false;
                }
                c1128710fTh.LLFII(Boolean.valueOf(z4));
                return;
            }
        }
        if (!Intrinsics.LJFF(view3, view) && (view2 = this.LLJJIJIIJIL) != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LLJJIJIIJIL = view;
        abstractC1100450ek7 = this.LLIZLLLIL;
        if (!(abstractC1100450ek7 instanceof C1128710fTh)) {
        }
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", "GiftBeaconBubbleLeaf onViewCreated: ");
        C0J3Y c0j3y = C0J3Y.LIZ;
        int i = this.LLJJJJJIL;
        c0j3y.getClass();
        View viewLJIIIIZZ = C0J3Y.LJIIIIZZ(i);
        if (viewLJIIIIZZ == null && (viewLJIIIIZZ = C786410Ut5.Td(layoutInflater, this.LLJJJJJIL, viewGroup, false)) == null) {
            return null;
        }
        this.LLILZ = viewLJIIIIZZ;
        C19ME c19me = new C19ME(-1, -1);
        c19me.endToEnd = 0;
        this.LLJJI = viewGroup;
        View view = this.LLILZ;
        if (view == null) {
            return null;
        }
        return new Pair<>(view, c19me);
    }

    public final void LJJJJLI(C1125670fOn c1125670fOn, C1125640fOk c1125640fOk, long j, String str) throws JSONException {
        Boolean boolValueOf;
        String str2;
        Long lValueOf;
        String secUid;
        Long lValueOf2;
        Fragment fragment;
        String str3;
        C1100420ek4 c1100420ek4;
        String str4;
        C1128710fTh c1128710fTh;
        Boolean boolValueOf2;
        C1128710fTh c1128710fTh2;
        Object tag;
        if (c1125640fOk != null) {
            boolValueOf = Boolean.valueOf(LJJJIL(c1125640fOk, c1125670fOn.LIZIZ));
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateBubble reused lynx beacon bubble, source = ");
            sbLIZ.append(str);
            sbLIZ.append(", bubbleView tag = ");
            if (c1125640fOk != null) {
                tag = c1125640fOk.getTag();
            } else {
                tag = null;
            }
            sbLIZ.append(tag);
            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reuseLynxBubble_");
            sbLIZ2.append(str);
            LJJJJLL(c1125640fOk, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (c1125640fOk == null) {
            return;
        }
        GiftPanelBeaconBubble giftPanelBeaconBubble = c1125670fOn.LIZIZ;
        if (giftPanelBeaconBubble != null && (str2 = giftPanelBeaconBubble.lynxUrl) != null) {
            AbstractC1100450ek7 abstractC1100450ek7 = this.LLIZLLLIL;
            if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && !c1128710fTh.LLLLLLIL) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("createLynxBubble: panel is not showing ");
                AbstractC1100450ek7 abstractC1100450ek72 = this.LLIZLLLIL;
                if ((abstractC1100450ek72 instanceof C1128710fTh) && (c1128710fTh2 = (C1128710fTh) abstractC1100450ek72) != null) {
                    boolValueOf2 = Boolean.valueOf(c1128710fTh2.LLLLLLIL);
                } else {
                    boolValueOf2 = null;
                }
                sbLIZ3.append(boolValueOf2);
                C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            User userLIZJ = C1125800fP0.LIZJ();
            if (userLIZJ == null) {
                Room room = this.LLJJJIL;
                if (room != null) {
                    userLIZJ = room.getOwner();
                } else {
                    userLIZJ = null;
                }
            }
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            LJJJJ(152);
            long j2 = this.LLJJJ + 1;
            this.LLJJJ = j2;
            c1125640fOk.setTag(giftPanelBeaconBubble);
            if (userLIZJ != null) {
                lValueOf = Long.valueOf(userLIZJ.getId());
                secUid = userLIZJ.getSecUid();
            } else {
                lValueOf = null;
                secUid = null;
            }
            String strLIZLLL = C0KVU.LIZLLL(userLIZJ);
            String strLIZLLL2 = C0KVU.LIZLLL(userLJIJJLI);
            Room room2 = this.LLJJJIL;
            if (room2 != null) {
                lValueOf2 = Long.valueOf(room2.getId());
            } else {
                lValueOf2 = null;
            }
            Integer numValueOf = Integer.valueOf(C1125800fP0.LJ());
            C495520Jby c495520Jby = new C495520Jby(str2);
            c495520Jby.LIZJ("tab_name", C1125070fNp.LIZ());
            if (lValueOf != null) {
                c495520Jby.LIZIZ(lValueOf.longValue(), "gift_to_user_id");
            }
            if (lValueOf2 != null) {
                lValueOf2.longValue();
                c495520Jby.LIZIZ(lValueOf2.longValue(), "gift_to_room_id");
            }
            if (secUid != null) {
                c495520Jby.LIZJ("gift_to_sec_user_id", secUid);
            }
            if (strLIZLLL != null) {
                c495520Jby.LIZJ("gift_to_user_nick_name", strLIZLLL);
            }
            if (strLIZLLL2 != null) {
                c495520Jby.LIZJ("gift_from_user_nick_name", strLIZLLL2);
            }
            if (numValueOf != null) {
                c495520Jby.LIZ(numValueOf.intValue(), "gift_to_user_type");
            }
            String strLIZLLL3 = c495520Jby.LIZLLL();
            strLIZLLL3.toString();
            String str5 = "";
            GiftPanelBeaconBubble giftPanelBeaconBubble2 = c1125670fOn.LIZIZ;
            if (giftPanelBeaconBubble2 != null && (str4 = giftPanelBeaconBubble2.lynxExtra) != null) {
                str5 = str4;
            }
            AbstractC1100450ek7 abstractC1100450ek73 = this.LLIZLLLIL;
            if (abstractC1100450ek73 != null && (c1100420ek4 = abstractC1100450ek73.LLILZIL) != null) {
                fragment = c1100420ek4.getFragment();
            } else {
                fragment = null;
            }
            C1125620fOi c1125620fOi = new C1125620fOi(this, j2, c1125640fOk, giftPanelBeaconBubble, j, c1125670fOn);
            C1125610fOh c1125610fOh = new C1125610fOh(this, j2, c1125640fOk, giftPanelBeaconBubble, j);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("createAndAddSparkView: url ");
            sbLIZ4.append(strLIZLLL3);
            C20441214yg.LIZIZ("EventLynxBubble", C2188811AlT.LIZIZ(sbLIZ4));
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (c1125640fOk.getChildCount() > 0) {
                try {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1125640fOk, null);
                    c1125640fOk.removeAllViews();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1125640fOk.LL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1125610fOh.invoke(-1L, -1, "Cannot remove existing views");
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(c1125640fOk.getContext(), strLIZLLL3, fragment, true, new AwS2S2300100_17(str5, c1125620fOi, jUptimeMillis, c1125640fOk, strLIZLLL3, c1125610fOh, 1));
            c1125640fOk.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
            c1125640fOk.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
            View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0fOu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            };
            if (C1848410yCV.LIZ) {
                fVar = new f(fVar);
            }
            View.OnClickListener aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1125640fOk);
            }
            c1125640fOk.setOnClickListener(aVar);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("createLynxBubble createAndAddSparkView and updateShownView lynxUrl ");
            GiftPanelBeaconBubble giftPanelBeaconBubble3 = c1125670fOn.LIZIZ;
            if (giftPanelBeaconBubble3 != null) {
                str3 = giftPanelBeaconBubble3.lynxUrl;
            } else {
                str3 = null;
            }
            sbLIZ5.append(str3);
            sbLIZ5.append(' ');
            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ5));
            LJJJJLL(c1125640fOk, "createLynxBubble");
            return;
        }
        LJJJJLL(null, "lynxUrlEmpty");
    }
}
