package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.C01GW;
import X.C01ZD;
import X.C09JN;
import X.C0IJT;
import X.C0JGZ;
import X.C1161920gLG;
import X.C11NJ;
import X.C12ES;
import X.C1303170k15;
import X.C13LE;
import X.C13LP;
import X.C1555540qa8;
import X.C1697810uHb;
import X.C16F5;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C304201Fw;
import X.C339610DTb;
import X.C406001hy;
import X.C418440Gaw;
import X.C439101nJ;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C800330VaR;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917140ZyS;
import X.C917650ZzH;
import X.C917660ZzI;
import X.C917740ZzQ;
import X.C917910Zzh;
import X.C917920Zzi;
import X.C918060Zzw;
import X.C918100a00;
import X.C920190a3N;
import X.C920450a3n;
import X.C923330a8R;
import X.C925150aBN;
import X.C927550aFF;
import X.C927570aFH;
import X.C930170aJT;
import X.C930200aJW;
import X.C930210aJX;
import X.C930280aJe;
import X.C930540aK4;
import X.C931740aM0;
import X.C931750aM1;
import X.C931780aM4;
import X.C931790aM5;
import X.C935470aS1;
import X.C935540aS8;
import X.C937280aUw;
import X.C940770aaZ;
import X.C942200acs;
import X.C942210act;
import X.C942220acu;
import X.C944400agQ;
import X.C947390alF;
import X.C947840aly;
import X.C947870am1;
import X.C948360amo;
import X.C948400ams;
import X.C953610avH;
import X.C956790b0P;
import X.C957020b0m;
import X.EnumC919910a2v;
import X.EnumC930180aJU;
import X.InterfaceC1294060jmO;
import X.InterfaceC1303160k14;
import X.InterfaceC1631630sYr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC781210Ukh;
import X.InterfaceC916700Zxk;
import X.InterfaceC920110a3F;
import X.InterfaceC920220a3Q;
import X.InterfaceC920680a4A;
import X.InterfaceC927510aFB;
import X.InterfaceC930220aJY;
import X.InterfaceC945610aiN;
import X.InterfaceC947410alH;
import X.InterfaceC954180awC;
import Y.ARunnableS23S0400000_15;
import Y.ARunnableS84S0200000_15;
import Y.AcS496S0100000_15;
import Y.AcS4S0002000_15;
import Y.AcS81S0110000_15;
import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayoutKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS100S0201000_15;
import kotlin.jvm.internal.AwS21S0401000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS42S0301000_15;
import kotlin.jvm.internal.AwS4S0420000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS9S0410000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutSettingContract implements View.OnClickListener, LayoutMarketFragment.LayoutItemClickHandler {
    public static final int $stable;
    public static final C930280aJe Companion;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public final C01GW adapterV3$delegate;
    public View alwaysUseContainerV3;
    public final Function0<MultiLiveAnchorPanelSettings> anchorPanelSettingsTemp;
    public View availableSpotContainerV3;
    public final InterfaceC916700Zxk bizSwitchLayoutCallBack;
    public final C01GW chooseV3ScrollListener$delegate;
    public final C11NJ compositeDisposable;
    public final Context context;
    public final DataChannel dataChannel;
    public Integer editGuestMaxCount;
    public String editLayout;
    public Integer editLayoutStyle;
    public final String enterFrom;
    public ImageView fixedGridItem;
    public C16F5 fixedGridText;
    public ImageView fixedPanelItem;
    public C16F5 fixedPanelText;
    public final boolean gridFixNum4Enable;
    public int gridGuestMaxCount;
    public ImageView gridItem;
    public View gridMicNum2Item;
    public View gridMicNum3Item;
    public View gridMicNum4Item;
    public View gridMicNum5Item;
    public View gridMicNum8Item;
    public View gridNumChooseContainer;
    public C16F5 gridText;
    public boolean hasReportedAlwaysUseShow;
    public boolean hasReportedAvailableSpotShow;
    public boolean hasReportedManualScroll;
    public final boolean isFromLayoutMarketBack;
    public boolean isLayoutOperationEnable;
    public View lastSelectGridView;
    public View lastSelectLayoutItem;
    public C16F5 lastSelectLayoutText;
    public View layoutChooseV2View;
    public RecyclerView layoutChooseV3Rv;
    public View layoutChooseV3View;
    public View maxPosContainerV3;
    public C16F5 maxPosCountTvV3;
    public LiveIconView maxPosIconV3;
    public final MultiGuestDataHolder multiGuestDataHolder;
    public final Function1<Integer, Unit> onChangeFailed;
    public int panelGuestMaxCount;
    public ImageView panelItem;
    public View panelMicNum4Item;
    public View panelMicNum6Item;
    public View panelMicNum8Item;
    public View panelNumChooseContainer;
    public C16F5 panelText;
    public View playbookContainer;
    public final Function0<Unit> requestRollbackSettingLayout;
    public final InterfaceC1631630sYr<Integer, String, Integer, EnumC930180aJU, Unit> requestUpdateSettingLayout;
    public final InterfaceC930220aJY simpleLayoutDataSourceForV3;
    public final boolean skipAutoLayoutModuleShow;
    public final String source;
    public TextView tvGridMicNum2Item;
    public TextView tvGridMicNum3Item;
    public TextView tvGridMicNum4Item;
    public TextView tvGridMicNum5Item;
    public TextView tvGridMicNum8Item;
    public TextView tvMicNumTitle;
    public TextView tvPanelMicNum4Item;
    public TextView tvPanelMicNum6Item;
    public TextView tvPanelMicNum8Item;
    public HashMap<View, Boolean> viewClickableMap;
    public final C304201Fw zoomService$delegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aJe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LayoutSettingContract.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217381BqS};
        Companion = new Object() { // from class: X.0aJe
        };
        $stable = 8;
    }

    public LayoutSettingContract() {
        throw null;
    }

    public final void LIZ() {
        if (C937280aUw.LIZIZ(this.source)) {
            InterfaceC916700Zxk interfaceC916700Zxk = this.bizSwitchLayoutCallBack;
            if (interfaceC916700Zxk != null) {
                interfaceC916700Zxk.onSuccess();
                return;
            }
            return;
        }
        int panelLayoutType = this.simpleLayoutDataSourceForV3.getPanelLayoutType();
        Context context = this.context;
        RecyclerView recyclerView = this.layoutChooseV3Rv;
        Fz(null, panelLayoutType, context, recyclerView != null ? ViewTreeLifecycleOwner.get(recyclerView) : null, new AwS559S0100000_15(this, 778), new AwS594S0100000_15(this, 208), new AwS559S0100000_15(this, 779));
    }

    public final boolean LJIJJLI() {
        return (C01ZD.LIZ(1) && this.layoutChooseV3View != null) || C931780aM4.LIZIZ();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final C948360amo LJIIIZ() {
        return (C948360amo) this.adapterV3$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018c  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJIIJJI():java.lang.String");
    }

    @InterfaceC1294060jmO
    public final Pair<Integer, Integer> LJIIL() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        if (!C937280aUw.LIZ(this.source)) {
            Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
            return C942200acs.LIZIZ((function0 == null || (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) == null) ? 0 : C917650ZzH.LJII(multiLiveAnchorPanelSettingsInvoke));
        }
        Integer num = this.editLayoutStyle;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 4);
        Integer num2 = this.editGuestMaxCount;
        Pair<Integer, Integer> pair = new Pair<>(numValueOf, Integer.valueOf((num2 != null ? num2.intValue() : 8) + 1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source = playbook, getSelectedLayoutSetting= ");
        sbLIZ.append(pair);
        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
        return pair;
    }

    @InterfaceC1294060jmO
    public final String LJIILIIL() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        String strLIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        return (multiGuestDataHolder == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null || (strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) == null) ? "" : strLIZ;
    }

    @InterfaceC1294060jmO
    public final String LJIILJJIL() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
        return (function0 == null || (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) == null || multiLiveAnchorPanelSettingsInvoke.layoutType != 1) ? "grid" : "floating";
    }

    public final InterfaceC927510aFB LJIILL() {
        C304201Fw c304201Fw = this.zoomService$delegate;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LL;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    public final Boolean LJIL() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null || (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) == null || (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) == null || (state = multiGuestSharedBgAnchorViewModelGL0.getState()) == null) {
            return null;
        }
        return Boolean.valueOf(state.LLILLL);
    }

    public final void LJJI() {
        View view;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        if (this.hasReportedAvailableSpotShow || (view = this.availableSpotContainerV3) == null || view.getVisibility() != 8 || C937280aUw.LIZ(this.source)) {
            return;
        }
        this.hasReportedAvailableSpotShow = true;
        Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
        C917660ZzI.LIZJ((function0 == null || (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) == null || multiLiveAnchorPanelSettingsInvoke.showAvailableSpot != 3) ? CardStruct.IStatusCode.DEFAULT : "1", LJJIL());
    }

    public final void LJJIII() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.compositeDisposable.LJ();
        this.viewClickableMap.clear();
    }

    public final void LJJIJLIJ() {
        LJJJLZIJ(this.simpleLayoutDataSourceForV3.LIZJ() - 1);
        LJJJLL(this.simpleLayoutDataSourceForV3.getPanelLayoutType());
        C942210act c942210act = C942210act.LIZ;
        Context context = this.context;
        boolean zLIZ = C937280aUw.LIZ(this.source);
        if (C937280aUw.LIZ(this.source)) {
            new AwS559S0100000_15(this, 190);
        }
        if (C937280aUw.LIZ(this.source)) {
            new AwS559S0100000_15(this, 191);
        }
        List listLJII = c942210act.LJII(context, zLIZ);
        C948360amo c948360amoLJIIIZ = LJIIIZ();
        if (c948360amoLJIIIZ != null) {
            c948360amoLJIIIZ.LLLII(listLJII, new ARunnableS84S0200000_15(this, listLJII, 13));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r1.equals("design_page") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1.equals("multiguest_icon") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.equals("live_take_detail") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r1.equals("live_setting") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r1.equals("unknown") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r0 = r3.enterFrom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return "live_take_detail";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIL() {
        /*
            r3 = this;
            java.lang.String r1 = r3.enterFrom
            java.lang.String r2 = "live_take_detail"
            if (r1 == 0) goto Ld
            int r0 = r1.hashCode()
            switch(r0) {
                case -902905744: goto L20;
                case -284840886: goto L42;
                case 1104220281: goto L29;
                case 1663113270: goto L32;
                case 1820834301: goto L39;
                default: goto Ld;
            }
        Ld:
            java.lang.String r1 = r3.source
            java.lang.String r0 = "playbook_edit"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1f
            boolean r0 = X.C500260Jjc.LJJ()
            if (r0 == 0) goto L4f
            java.lang.String r2 = "playbook"
        L1f:
            return r2
        L20:
            java.lang.String r0 = "design_page"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto Ld
        L29:
            java.lang.String r0 = "multiguest_icon"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto Ld
        L32:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L4a
            goto Ld
        L39:
            java.lang.String r0 = "live_setting"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto Ld
        L42:
            java.lang.String r0 = "unknown"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
        L4a:
            java.lang.String r0 = r3.enterFrom
            if (r0 == 0) goto L1f
            return r0
        L4f:
            java.lang.String r2 = "setting_playbook"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJJIL():java.lang.String");
    }

    public final void LJJJJLI() {
        Function0<Unit> function0 = this.requestRollbackSettingLayout;
        if (function0 != null) {
            function0.invoke();
        }
        Function1<Integer, Unit> function1 = this.onChangeFailed;
        if (function1 != null) {
            function1.invoke(0);
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJJZ() {
        C942210act.LIZ.getClass();
        int iLJ = C942210act.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFloatingWindowClickable curGuestCount:");
        sbLIZ.append(iLJ);
        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
        if (C937280aUw.LIZIZ(this.source) || iLJ > 0) {
            boolean z = iLJ <= (C917910Zzh.LIZ(C930540aK4.LIZJ()) ? 8 : 6);
            LJJJI(this.viewClickableMap, this.panelItem, Boolean.valueOf(z));
            LJJJI(this.viewClickableMap, this.fixedPanelItem, Boolean.valueOf(z));
            LJJL(this.panelItem, this.panelText, z);
            LJJL(this.fixedPanelItem, this.fixedPanelText, z);
        }
    }

    public static final int LJJIJL(LayoutSettingContract layoutSettingContract) {
        Boolean boolValueOf;
        if (LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_skip_enlarge_check_in_change_layout")) {
            InterfaceC927510aFB interfaceC927510aFBLJIILL = layoutSettingContract.LJIILL();
            if (interfaceC927510aFBLJIILL != null) {
                boolValueOf = Boolean.valueOf(interfaceC927510aFBLJIILL.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return 2131843357;
            }
            return 2131843496;
        }
        return 2131843496;
    }

    @InterfaceC1294060jmO
    public final void LJFF(Function1<? super Boolean, Unit> function1) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        Integer numValueOf;
        Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
        if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null && (numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsInvoke.layoutType)) != null) {
            if (numValueOf.intValue() == 0) {
                LJ(null, function1);
                return;
            } else if (numValueOf.intValue() == 1) {
                LJI(null, function1);
                return;
            }
        }
        function1.invoke(Boolean.FALSE);
    }

    @InterfaceC1294060jmO
    public final int LJIIJ(Integer num) {
        if (num == null) {
            return 0;
        }
        if (num.intValue() == 0) {
            return this.gridGuestMaxCount;
        }
        if (num.intValue() != 1) {
            return 0;
        }
        return this.panelGuestMaxCount;
    }

    @InterfaceC1294060jmO
    public final void LJIILLIIL(int i) {
        Integer numValueOf;
        EnumC930180aJU enumC930180aJU;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        EnumC930180aJU enumC930180aJU2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke4;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke5;
        boolean z = true;
        if (C937280aUw.LIZIZ(this.source)) {
            Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
            if (function0 != null && (multiLiveAnchorPanelSettingsInvoke5 = function0.invoke()) != null) {
                multiLiveAnchorPanelSettingsInvoke5.layoutType = 0;
            }
            Function0<MultiLiveAnchorPanelSettings> function02 = this.anchorPanelSettingsTemp;
            if (function02 != null && (multiLiveAnchorPanelSettingsInvoke4 = function02.invoke()) != null) {
                multiLiveAnchorPanelSettingsInvoke4.fixMicNumAction = i;
            }
            if (i == 1) {
                enumC930180aJU2 = EnumC930180aJU.CHANGE_TO_GRID_ITEM;
            } else {
                enumC930180aJU2 = EnumC930180aJU.CHANGE_TO_GRID_FIX_ITEM;
            }
            LJJJJJL(this, enumC930180aJU2);
            return;
        }
        if (C930540aK4.LIZJ() && ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.dataChannel)) {
            C766270U4b.LIZLLL(2131841389);
            Function1<Integer, Unit> function1 = this.onChangeFailed;
            if (function1 != null) {
                function1.invoke(-2);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_draw_function_conflict_toast_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            C923330a8R c923330a8R = C923330a8R.LIZ;
            c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
            c474500IjALIZ.LJJII("guest_connection_icon", "click_position");
            c474500IjALIZ.LJJII("guest_connection_gird", "function_type");
            c474500IjALIZ.LIZ();
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        Integer numValueOf2 = null;
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.layoutType);
            numValueOf2 = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction);
            if (numValueOf != null && numValueOf.intValue() == 0 && numValueOf2 != null && numValueOf2.intValue() == i && !C937280aUw.LIZ(this.source)) {
                C766270U4b.LIZLLL(2131842394);
                return;
            }
        } else {
            numValueOf = null;
        }
        Function0<MultiLiveAnchorPanelSettings> function03 = this.anchorPanelSettingsTemp;
        if (function03 != null && (multiLiveAnchorPanelSettingsInvoke3 = function03.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke3.layoutType = 0;
        }
        Function0<MultiLiveAnchorPanelSettings> function04 = this.anchorPanelSettingsTemp;
        if (function04 != null && (multiLiveAnchorPanelSettingsInvoke2 = function04.invoke()) != null) {
            multiLiveAnchorPanelSettingsInvoke2.fixMicNumAction = i;
        }
        if (i == 1) {
            enumC930180aJU = EnumC930180aJU.CHANGE_TO_GRID_ITEM;
        } else {
            enumC930180aJU = EnumC930180aJU.CHANGE_TO_GRID_FIX_ITEM;
        }
        int iLJJ = LJJ(0, Integer.valueOf(i));
        Function0<MultiLiveAnchorPanelSettings> function05 = this.anchorPanelSettingsTemp;
        if (function05 == null || (multiLiveAnchorPanelSettingsInvoke = function05.invoke()) == null || multiLiveAnchorPanelSettingsInvoke.showAvailableSpot != 3) {
            z = false;
        }
        if (LJJIJ(iLJJ, z, new AwS21S0401000_15(this, enumC930180aJU, numValueOf, numValueOf2, i, 1))) {
            return;
        }
        LJJIJIIJI(enumC930180aJU, numValueOf, numValueOf2, i, false);
    }

    @InterfaceC1294060jmO
    public final void LJIJI(Function0<Unit> function0) {
        if (function0 != null) {
            function0.invoke();
        }
        if (C937280aUw.LIZ(this.source)) {
            TextView textView = this.tvMicNumTitle;
            if (textView != null) {
                C12ES.LJIILL(4, textView);
            }
            View view = this.panelNumChooseContainer;
            if (view != null) {
                C12ES.LJIILL(4, view);
            }
            View view2 = this.gridNumChooseContainer;
            if (view2 != null) {
                C12ES.LJIILL(4, view2);
                return;
            }
            return;
        }
        TextView textView2 = this.tvMicNumTitle;
        if (textView2 != null) {
            C439101nJ.LJI(textView2);
        }
        View view3 = this.panelNumChooseContainer;
        if (view3 != null) {
            C439101nJ.LJI(view3);
        }
        View view4 = this.gridNumChooseContainer;
        if (view4 == null) {
            return;
        }
        C439101nJ.LJI(view4);
    }

    @InterfaceC1294060jmO
    public final boolean LJIJJ(View view) {
        if (Intrinsics.LJFF(view, this.fixedPanelItem)) {
            String str = this.editLayout;
            boolean z = C925150aBN.LIZ;
            if (Intrinsics.LJFF(str, C925150aBN.LJIIIIZZ) || Intrinsics.LJFF(this.editLayout, C925150aBN.LJII) || Intrinsics.LJFF(this.editLayout, C925150aBN.LJIIIZ)) {
                return true;
            }
            return false;
        }
        if (!Intrinsics.LJFF(view, this.fixedGridItem)) {
            return false;
        }
        String str2 = this.editLayout;
        boolean z2 = C925150aBN.LIZ;
        if (Intrinsics.LJFF(str2, C925150aBN.LJI) || Intrinsics.LJFF(this.editLayout, C925150aBN.LJFF) || Intrinsics.LJFF(this.editLayout, C925150aBN.LJ) || Intrinsics.LJFF(this.editLayout, C925150aBN.LIZLLL) || Intrinsics.LJFF(this.editLayout, C925150aBN.LIZJ)) {
            return true;
        }
        return false;
    }

    public final void LJJIIZ(int i) {
        View view;
        if (LJIJJLI()) {
            view = this.layoutChooseV3View;
        } else {
            view = this.layoutChooseV2View;
        }
        if (i != 0) {
            if (i == 8 && view != null) {
                C439101nJ.LJI(view);
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        C12ES.LJIILL(0, view);
    }

    public final void LJJIIZI(String str) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
            String strLJIL = dataSource.LJIL();
            String strLIZ = dataSource.LIZ();
            String strValueOf = String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType());
            List listLJII = C942210act.LIZ.LJII(null, false);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJII.iterator();
            while (it2.hasNext()) {
                String strValueOf2 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
                if (strValueOf2 != null) {
                    arrayList.add(strValueOf2);
                }
            }
            C931740aM0.LJIIJJI(new C931750aM1("show_all", strLJIL, strLIZ, strValueOf, null, arrayList, "origin_panel", str, 240));
            String str2 = LayoutMarketFragment._pnsPageId;
            C942220acu.LIZ(fragmentManager, this, str, this.simpleLayoutDataSourceForV3, null, this.dataChannel, 16);
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJJLL(boolean z) {
        ImageView imageView = this.panelItem;
        C16F5 c16f5 = this.panelText;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        LJJL(imageView, c16f5, z);
        ImageView imageView2 = this.gridItem;
        C16F5 c16f52 = this.gridText;
        if (imageView2 != null) {
            imageView2.setEnabled(z);
        }
        LJJL(imageView2, c16f52, z);
        ImageView imageView3 = this.fixedPanelItem;
        C16F5 c16f53 = this.fixedPanelText;
        if (imageView3 != null) {
            imageView3.setEnabled(z);
        }
        LJJL(imageView3, c16f53, z);
        ImageView imageView4 = this.fixedGridItem;
        C16F5 c16f54 = this.fixedGridText;
        if (imageView4 != null) {
            imageView4.setEnabled(z);
        }
        LJJL(imageView4, c16f54, z);
    }

    @InterfaceC1294060jmO
    public final void LJJJJZI(int i) {
        View view = this.panelNumChooseContainer;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        View view2 = this.gridNumChooseContainer;
        if (view2 != null) {
            C12ES.LJIILL(0, view2);
        }
        this.gridGuestMaxCount = i;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 8 || Intrinsics.LJFF(this.lastSelectGridView, this.gridMicNum8Item)) {
                            return;
                        }
                        View view3 = this.gridMicNum8Item;
                        if (view3 != null) {
                            view3.setBackgroundResource(R.drawable.f66);
                        }
                        View view4 = this.lastSelectGridView;
                        if (view4 != null) {
                            view4.setBackgroundResource(R.drawable.f68);
                        }
                        this.lastSelectGridView = this.gridMicNum8Item;
                        return;
                    }
                    if (Intrinsics.LJFF(this.lastSelectGridView, this.gridMicNum5Item)) {
                        return;
                    }
                    View view5 = this.gridMicNum5Item;
                    if (view5 != null) {
                        view5.setBackgroundResource(R.drawable.f66);
                    }
                    View view6 = this.lastSelectGridView;
                    if (view6 != null) {
                        view6.setBackgroundResource(R.drawable.f68);
                    }
                    this.lastSelectGridView = this.gridMicNum5Item;
                    return;
                }
                if (Intrinsics.LJFF(this.lastSelectGridView, this.gridMicNum4Item)) {
                    return;
                }
                View view7 = this.gridMicNum4Item;
                if (view7 != null) {
                    view7.setBackgroundResource(R.drawable.f66);
                }
                View view8 = this.lastSelectGridView;
                if (view8 != null) {
                    view8.setBackgroundResource(R.drawable.f68);
                }
                this.lastSelectGridView = this.gridMicNum4Item;
                return;
            }
            if (Intrinsics.LJFF(this.lastSelectGridView, this.gridMicNum3Item)) {
                return;
            }
            View view9 = this.gridMicNum3Item;
            if (view9 != null) {
                view9.setBackgroundResource(R.drawable.f66);
            }
            View view10 = this.lastSelectGridView;
            if (view10 != null) {
                view10.setBackgroundResource(R.drawable.f68);
            }
            this.lastSelectGridView = this.gridMicNum3Item;
            return;
        }
        if (Intrinsics.LJFF(this.lastSelectGridView, this.gridMicNum2Item)) {
            return;
        }
        View view11 = this.gridMicNum2Item;
        if (view11 != null) {
            view11.setBackgroundResource(R.drawable.f66);
        }
        View view12 = this.lastSelectGridView;
        if (view12 != null) {
            view12.setBackgroundResource(R.drawable.f68);
        }
        this.lastSelectGridView = this.gridMicNum2Item;
    }

    @InterfaceC1294060jmO
    public final void LJJJLIIL(Integer num) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        if (num == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGuestMaxCountClickable layoutType:");
        sbLIZ.append(num);
        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
        C942210act.LIZ.getClass();
        int iLJ = C942210act.LJ();
        int iIntValue = num.intValue();
        int i7 = R.attr.ewz;
        boolean z7 = false;
        if (iIntValue == 0) {
            if (this.context != null) {
                if (!C937280aUw.LIZ(this.source)) {
                    TextView textView = this.tvGridMicNum2Item;
                    if (textView != null) {
                        Context context = this.context;
                        if (iLJ <= 2) {
                            i6 = R.attr.ewy;
                        } else {
                            i6 = R.attr.ewz;
                        }
                        textView.setTextColor(C20736316Cj.LIZIZ(i6, context));
                    }
                    TextView textView2 = this.tvGridMicNum3Item;
                    if (textView2 != null) {
                        Context context2 = this.context;
                        if (iLJ <= 3) {
                            i5 = R.attr.ewy;
                        } else {
                            i5 = R.attr.ewz;
                        }
                        textView2.setTextColor(C20736316Cj.LIZIZ(i5, context2));
                    }
                    TextView textView3 = this.tvGridMicNum4Item;
                    if (textView3 != null) {
                        Context context3 = this.context;
                        if (iLJ <= 4) {
                            i4 = R.attr.ewy;
                        } else {
                            i4 = R.attr.ewz;
                        }
                        textView3.setTextColor(C20736316Cj.LIZIZ(i4, context3));
                    }
                    TextView textView4 = this.tvGridMicNum5Item;
                    if (textView4 != null) {
                        Context context4 = this.context;
                        if (iLJ <= 5) {
                            i3 = R.attr.ewy;
                        } else {
                            i3 = R.attr.ewz;
                        }
                        textView4.setTextColor(C20736316Cj.LIZIZ(i3, context4));
                    }
                    TextView textView5 = this.tvGridMicNum8Item;
                    if (textView5 != null) {
                        Context context5 = this.context;
                        if (iLJ <= 8) {
                            i7 = R.attr.ewy;
                        }
                        textView5.setTextColor(C20736316Cj.LIZIZ(i7, context5));
                    }
                } else {
                    TextView textView6 = this.tvGridMicNum2Item;
                    if (textView6 != null) {
                        textView6.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                    }
                    TextView textView7 = this.tvGridMicNum3Item;
                    if (textView7 != null) {
                        textView7.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                    }
                    TextView textView8 = this.tvGridMicNum4Item;
                    if (textView8 != null) {
                        textView8.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                    }
                    TextView textView9 = this.tvGridMicNum5Item;
                    if (textView9 != null) {
                        textView9.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                    }
                    TextView textView10 = this.tvGridMicNum8Item;
                    if (textView10 != null) {
                        textView10.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                    }
                }
            }
            HashMap<View, Boolean> map = this.viewClickableMap;
            View view = this.gridMicNum2Item;
            if (iLJ <= 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJJJI(map, view, Boolean.valueOf(z3));
            HashMap<View, Boolean> map2 = this.viewClickableMap;
            View view2 = this.gridMicNum3Item;
            if (iLJ <= 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            LJJJI(map2, view2, Boolean.valueOf(z4));
            HashMap<View, Boolean> map3 = this.viewClickableMap;
            View view3 = this.gridMicNum4Item;
            if (iLJ <= 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            LJJJI(map3, view3, Boolean.valueOf(z5));
            HashMap<View, Boolean> map4 = this.viewClickableMap;
            View view4 = this.gridMicNum5Item;
            if (iLJ <= 5) {
                z6 = true;
            } else {
                z6 = false;
            }
            LJJJI(map4, view4, Boolean.valueOf(z6));
            HashMap<View, Boolean> map5 = this.viewClickableMap;
            View view5 = this.gridMicNum8Item;
            if (iLJ <= 8) {
                z7 = true;
            }
            LJJJI(map5, view5, Boolean.valueOf(z7));
            return;
        }
        if (num.intValue() != 1) {
            return;
        }
        if (this.context != null) {
            if (!C937280aUw.LIZ(this.source)) {
                TextView textView11 = this.tvPanelMicNum4Item;
                if (textView11 != null) {
                    Context context6 = this.context;
                    if (iLJ <= 4) {
                        i2 = R.attr.ewy;
                    } else {
                        i2 = R.attr.ewz;
                    }
                    textView11.setTextColor(C20736316Cj.LIZIZ(i2, context6));
                }
                TextView textView12 = this.tvPanelMicNum6Item;
                if (textView12 != null) {
                    Context context7 = this.context;
                    if (iLJ <= 6) {
                        i = R.attr.ewy;
                    } else {
                        i = R.attr.ewz;
                    }
                    textView12.setTextColor(C20736316Cj.LIZIZ(i, context7));
                }
                TextView textView13 = this.tvPanelMicNum8Item;
                if (textView13 != null) {
                    Context context8 = this.context;
                    if (iLJ <= 8) {
                        i7 = R.attr.ewy;
                    }
                    textView13.setTextColor(C20736316Cj.LIZIZ(i7, context8));
                }
            } else {
                TextView textView14 = this.tvPanelMicNum4Item;
                if (textView14 != null) {
                    textView14.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                }
                TextView textView15 = this.tvPanelMicNum6Item;
                if (textView15 != null) {
                    textView15.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                }
                TextView textView16 = this.tvPanelMicNum8Item;
                if (textView16 != null) {
                    textView16.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.context));
                }
            }
        }
        HashMap<View, Boolean> map6 = this.viewClickableMap;
        View view6 = this.panelMicNum4Item;
        if (iLJ <= 4) {
            z = true;
        } else {
            z = false;
        }
        LJJJI(map6, view6, Boolean.valueOf(z));
        HashMap<View, Boolean> map7 = this.viewClickableMap;
        View view7 = this.panelMicNum6Item;
        if (iLJ <= 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJJJI(map7, view7, Boolean.valueOf(z2));
        HashMap<View, Boolean> map8 = this.viewClickableMap;
        View view8 = this.panelMicNum8Item;
        if (iLJ <= 8) {
            z7 = true;
        }
        LJJJI(map8, view8, Boolean.valueOf(z7));
    }

    public final void LJJJLL(int i) {
        View view;
        if (i != 11) {
            if (i != 12) {
                switch (i) {
                    case 2:
                        View view2 = this.maxPosContainerV3;
                        if (view2 != null) {
                            if (C937280aUw.LIZ(this.source)) {
                                C12ES.LJIILL(4, view2);
                            } else {
                                C439101nJ.LJI(view2);
                            }
                        }
                        LJJI();
                        View view3 = this.availableSpotContainerV3;
                        if (view3 != null) {
                            C500260Jjc.LJLJLJ(view3, !C937280aUw.LIZ(this.source));
                        }
                        break;
                    case 3:
                        View view4 = this.maxPosContainerV3;
                        if (view4 != null) {
                            C12ES.LJIILL(0, view4);
                        }
                        View view5 = this.availableSpotContainerV3;
                        if (view5 != null) {
                            C439101nJ.LJI(view5);
                        }
                        break;
                    case 4:
                        View view6 = this.maxPosContainerV3;
                        if (view6 != null) {
                            if (C937280aUw.LIZ(this.source)) {
                                C12ES.LJIILL(4, view6);
                            } else {
                                C439101nJ.LJI(view6);
                            }
                        }
                        LJJI();
                        View view7 = this.availableSpotContainerV3;
                        if (view7 != null) {
                            C500260Jjc.LJLJLJ(view7, !C937280aUw.LIZ(this.source));
                        }
                        break;
                    case 5:
                        View view8 = this.maxPosContainerV3;
                        if (view8 != null) {
                            C12ES.LJIILL(0, view8);
                        }
                        View view9 = this.availableSpotContainerV3;
                        if (view9 != null) {
                            C439101nJ.LJI(view9);
                        }
                        break;
                    case 6:
                        View view10 = this.maxPosContainerV3;
                        if (view10 != null) {
                            C12ES.LJIILL(0, view10);
                        }
                        View view11 = this.availableSpotContainerV3;
                        if (view11 != null) {
                            C439101nJ.LJI(view11);
                        }
                        break;
                    case 7:
                        View view12 = this.maxPosContainerV3;
                        if (view12 != null) {
                            C12ES.LJIILL(0, view12);
                        }
                        View view13 = this.availableSpotContainerV3;
                        if (view13 != null) {
                            C439101nJ.LJI(view13);
                        }
                        break;
                    default:
                        View view14 = this.maxPosContainerV3;
                        if (view14 != null) {
                            C439101nJ.LJI(view14);
                        }
                        View view15 = this.availableSpotContainerV3;
                        if (view15 != null) {
                            C439101nJ.LJI(view15);
                        }
                        break;
                }
            } else {
                View view16 = this.maxPosContainerV3;
                if (view16 != null) {
                    C12ES.LJIILL(0, view16);
                }
                View view17 = this.availableSpotContainerV3;
                if (view17 != null) {
                    C439101nJ.LJI(view17);
                }
            }
        } else {
            View view18 = this.maxPosContainerV3;
            if (view18 != null) {
                C12ES.LJIILL(0, view18);
            }
            View view19 = this.availableSpotContainerV3;
            if (view19 != null) {
                C439101nJ.LJI(view19);
            }
        }
        if (!C01ZD.LIZ(15) && i != 1 && !C931780aM4.LIZIZ() && !C937280aUw.LIZ(this.source)) {
            if (!this.hasReportedAlwaysUseShow && (view = this.alwaysUseContainerV3) != null && view.getVisibility() == 8) {
                this.hasReportedAlwaysUseShow = true;
                C406001hy.LIZIZ();
            }
            View view20 = this.alwaysUseContainerV3;
            if (view20 != null) {
                C12ES.LJIILL(0, view20);
                return;
            }
            return;
        }
        View view21 = this.alwaysUseContainerV3;
        if (view21 == null) {
            return;
        }
        C439101nJ.LJI(view21);
    }

    public final void LJJJLZIJ(int i) {
        C16F5 c16f5 = this.maxPosCountTvV3;
        if (c16f5 != null) {
            c16f5.setText(String.valueOf(i));
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJZ(int i) {
        View view = this.panelNumChooseContainer;
        if (view != null) {
            C12ES.LJIILL(0, view);
        }
        View view2 = this.gridNumChooseContainer;
        if (view2 != null) {
            C439101nJ.LJI(view2);
        }
        this.panelGuestMaxCount = i;
        if (i != 4) {
            if (i != 6) {
                if (i == 8) {
                    View view3 = this.panelMicNum4Item;
                    if (view3 != null) {
                        view3.setBackgroundResource(R.drawable.f68);
                    }
                    View view4 = this.panelMicNum6Item;
                    if (view4 != null) {
                        view4.setBackgroundResource(R.drawable.f68);
                    }
                    View view5 = this.panelMicNum8Item;
                    if (view5 != null) {
                        view5.setBackgroundResource(R.drawable.f66);
                        return;
                    }
                    return;
                }
                return;
            }
            View view6 = this.panelMicNum4Item;
            if (view6 != null) {
                view6.setBackgroundResource(R.drawable.f68);
            }
            View view7 = this.panelMicNum6Item;
            if (view7 != null) {
                view7.setBackgroundResource(R.drawable.f66);
            }
            View view8 = this.panelMicNum8Item;
            if (view8 == null) {
                return;
            }
            view8.setBackgroundResource(R.drawable.f68);
            return;
        }
        View view9 = this.panelMicNum4Item;
        if (view9 != null) {
            view9.setBackgroundResource(R.drawable.f66);
        }
        View view10 = this.panelMicNum6Item;
        if (view10 != null) {
            view10.setBackgroundResource(R.drawable.f68);
        }
        View view11 = this.panelMicNum8Item;
        if (view11 == null) {
            return;
        }
        view11.setBackgroundResource(R.drawable.f68);
    }

    @Override // android.view.View.OnClickListener
    @InterfaceC1294060jmO
    public final void onClick(View view) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        String str;
        Integer num = 6;
        if (C937280aUw.LIZ(this.source)) {
            Function0<MultiLiveAnchorPanelSettings> function0 = this.anchorPanelSettingsTemp;
            if (function0 != null && (multiLiveAnchorPanelSettingsInvoke = function0.invoke()) != null) {
                if (Intrinsics.LJFF(view, this.panelItem)) {
                    multiLiveAnchorPanelSettingsInvoke.layoutType = 1;
                    multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = 1;
                    this.editLayout = null;
                    this.editGuestMaxCount = num;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, null, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.gridItem)) {
                    multiLiveAnchorPanelSettingsInvoke.layoutType = 0;
                    multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = 1;
                    this.editLayout = null;
                    this.editGuestMaxCount = 8;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, null, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.fixedPanelItem)) {
                    multiLiveAnchorPanelSettingsInvoke.layoutType = 1;
                    multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = 0;
                    this.editLayoutStyle = 2;
                    if (!LJIJJ(this.fixedPanelItem)) {
                        if (C917910Zzh.LIZ(true)) {
                            str = C925150aBN.LJIIIZ;
                        } else {
                            str = C925150aBN.LJIIIIZZ;
                        }
                        this.editLayout = str;
                        if (C917910Zzh.LIZ(true)) {
                            num = 8;
                        }
                        this.editGuestMaxCount = num;
                    }
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, this.editLayout, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.fixedGridItem)) {
                    multiLiveAnchorPanelSettingsInvoke.layoutType = 0;
                    multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = 0;
                    if (!LJIJJ(this.fixedGridItem)) {
                        this.editLayout = C925150aBN.LJI;
                        this.editGuestMaxCount = 8;
                    }
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, this.editLayout, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.panelMicNum4Item)) {
                    this.editGuestMaxCount = 4;
                    String str2 = C925150aBN.LJII;
                    this.editLayout = str2;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str2, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.panelMicNum6Item)) {
                    this.editGuestMaxCount = num;
                    String str3 = C925150aBN.LJIIIIZZ;
                    this.editLayout = str3;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str3, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.panelMicNum8Item)) {
                    this.editGuestMaxCount = 8;
                    String str4 = C925150aBN.LJIIIZ;
                    this.editLayout = str4;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str4, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.gridMicNum2Item)) {
                    this.editGuestMaxCount = 2;
                    String str5 = C925150aBN.LIZJ;
                    this.editLayout = str5;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str5, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.gridMicNum3Item)) {
                    this.editGuestMaxCount = 3;
                    String str6 = C925150aBN.LIZLLL;
                    this.editLayout = str6;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str6, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.gridMicNum4Item)) {
                    this.editGuestMaxCount = 4;
                    String str7 = C925150aBN.LJ;
                    this.editLayout = str7;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str7, null);
                    return;
                }
                if (Intrinsics.LJFF(view, this.gridMicNum5Item)) {
                    this.editGuestMaxCount = 5;
                    String str8 = C925150aBN.LJFF;
                    this.editLayout = str8;
                    LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str8, null);
                    return;
                }
                if (!Intrinsics.LJFF(view, this.gridMicNum8Item)) {
                    return;
                }
                this.editGuestMaxCount = 8;
                String str9 = C925150aBN.LJI;
                this.editLayout = str9;
                LJJIIJ(multiLiveAnchorPanelSettingsInvoke, str9, null);
                return;
            }
            return;
        }
        if ((Intrinsics.LJFF(view, this.panelItem) || Intrinsics.LJFF(view, this.gridItem) || Intrinsics.LJFF(view, this.fixedPanelItem) || Intrinsics.LJFF(view, this.fixedGridItem) || Intrinsics.LJFF(view, this.panelMicNum4Item) || Intrinsics.LJFF(view, this.panelMicNum6Item) || Intrinsics.LJFF(view, this.panelMicNum8Item) || Intrinsics.LJFF(view, this.gridMicNum2Item) || Intrinsics.LJFF(view, this.gridMicNum3Item) || Intrinsics.LJFF(view, this.gridMicNum4Item) || Intrinsics.LJFF(view, this.gridMicNum5Item) || Intrinsics.LJFF(view, this.gridMicNum8Item)) && !LIZLLL(this, view, null, 2)) {
            return;
        }
        if (Intrinsics.LJFF(view, this.panelItem)) {
            LJIJ(1, this.panelItem);
            return;
        }
        if (Intrinsics.LJFF(view, this.gridItem)) {
            LJIILLIIL(1);
            return;
        }
        if (Intrinsics.LJFF(view, this.fixedPanelItem)) {
            LJIJ(0, this.fixedPanelItem);
            return;
        }
        if (Intrinsics.LJFF(view, this.fixedGridItem)) {
            LJIILLIIL(0);
            return;
        }
        if (Intrinsics.LJFF(view, this.panelMicNum4Item)) {
            LJIIZILJ(view, 4, C925150aBN.LJII, true);
            return;
        }
        if (Intrinsics.LJFF(view, this.panelMicNum6Item)) {
            LJIIZILJ(view, 6, C925150aBN.LJIIIIZZ, true);
            return;
        }
        if (Intrinsics.LJFF(view, this.panelMicNum8Item)) {
            LJIIZILJ(view, 8, C925150aBN.LJIIIZ, true);
            return;
        }
        if (Intrinsics.LJFF(view, this.gridMicNum2Item)) {
            LJIIZILJ(view, 2, C925150aBN.LIZJ, false);
            return;
        }
        if (Intrinsics.LJFF(view, this.gridMicNum3Item)) {
            LJIIZILJ(view, 3, C925150aBN.LIZLLL, false);
            return;
        }
        if (Intrinsics.LJFF(view, this.gridMicNum4Item)) {
            LJIIZILJ(view, 4, C925150aBN.LJ, false);
        } else if (Intrinsics.LJFF(view, this.gridMicNum5Item)) {
            LJIIZILJ(view, 5, C925150aBN.LJFF, false);
        } else {
            if (!Intrinsics.LJFF(view, this.gridMicNum8Item)) {
                return;
            }
            LJIIZILJ(view, 8, C925150aBN.LJI, false);
        }
    }

    public static int LJJ(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            if (num.intValue() == 1) {
                if (num2.intValue() == 0) {
                    return 3;
                }
                return 2;
            }
            if (num.intValue() == 0) {
                if (num2.intValue() == 0) {
                    return 5;
                }
                return 4;
            }
            return 0;
        }
        return 0;
    }

    public static void LJJJJJL(final LayoutSettingContract layoutSettingContract, final EnumC930180aJU enumC930180aJU) {
        String str;
        if (C937280aUw.LIZIZ(layoutSettingContract.source)) {
            Pair<Integer, Integer> pairLJIIL = layoutSettingContract.LJIIL();
            int iIntValue = pairLJIIL.getFirst().intValue();
            int iIntValue2 = pairLJIIL.getSecond().intValue();
            if (iIntValue == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layoutStyle = LayoutStyle.UNDEFINED, maxPosition = ");
                sbLIZ.append(iIntValue2);
                C20441214yg.LJ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            InterfaceC916700Zxk interfaceC916700Zxk = layoutSettingContract.bizSwitchLayoutCallBack;
            if (interfaceC916700Zxk == null) {
                return;
            }
            interfaceC916700Zxk.LIZIZ(enumC930180aJU);
            return;
        }
        final Function0 function0 = null;
        if (C931790aM5.LIZIZ()) {
            if (C917140ZyS.LIZJ()) {
                Pair<Integer, Integer> pairLJIIL2 = layoutSettingContract.LJIIL();
                int iIntValue3 = pairLJIIL2.getFirst().intValue();
                int iIntValue4 = pairLJIIL2.getSecond().intValue();
                if (iIntValue3 == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("layoutStyle = LayoutStyle.UNDEFINED, maxPosition = ");
                    sbLIZ2.append(iIntValue4);
                    C20441214yg.LJ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                C940770aaZ.LIZ().getAction().LJII(iIntValue3, iIntValue4, new AwS259S0300000_15(layoutSettingContract, iIntValue4, enumC930180aJU, null, 7), new AwS594S0100000_15(layoutSettingContract, 214));
                return;
            }
            C766270U4b.LIZLLL(2131843698);
            return;
        }
        if (C917140ZyS.LIZJ()) {
            String strLJIILIIL = layoutSettingContract.LJIILIIL();
            final String strLJIIJJI = layoutSettingContract.LJIIJJI();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            String str2 = "";
            if (interfaceC954180awCLLJLL != null) {
                if (strLJIIJJI == null) {
                    str = "";
                } else {
                    str = strLJIIJJI;
                }
                interfaceC954180awCLLJLL.LLILIL(Boolean.FALSE, str);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sourceLayoutId:");
            sbLIZ3.append(strLJIILIIL);
            sbLIZ3.append(", targetLayoutId:");
            sbLIZ3.append(strLJIIJJI);
            C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ3));
            C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
            if (c1303170k15Y22 == null) {
                return;
            }
            if (strLJIIJJI != null) {
                str2 = strLJIIJJI;
            }
            c1303170k15Y22.LJJL(0, str2, new InterfaceC1303160k14() { // from class: X.0Zxc
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    EnumC918990a1R enumC918990a1RLIZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
                    int maxCount = DslLayoutKt.getMaxCount(layout);
                    Function0<MultiLiveAnchorPanelSettings> function02 = this.LIZ.anchorPanelSettingsTemp;
                    if (function02 != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null) {
                        enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsInvoke);
                    } else {
                        enumC918990a1RLIZ = null;
                    }
                    int iLIZJ = C922550a7B.LIZJ(enumC918990a1RLIZ);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("switch layout: maxPos:");
                    sbLIZ4.append(maxCount);
                    sbLIZ4.append(", layoutId:");
                    sbLIZ4.append(strLJIIJJI);
                    sbLIZ4.append(", displayId:");
                    sbLIZ4.append(iLIZJ);
                    C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ4));
                    this.LIZ.LIZIZ(maxCount, strLJIIJJI, iLIZJ, enumC930180aJU, null, function0);
                }
            }, null);
            return;
        }
        C766270U4b.LIZLLL(2131843698);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021b  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    @InterfaceC1294060jmO
    public final void LJI(final Function0<Unit> function0, final Function1<? super Boolean, Unit> function1) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        int i;
        PosIdentity posIdentity;
        boolean z = false;
        if (C931790aM5.LIZIZ()) {
            Function0<MultiLiveAnchorPanelSettings> function02 = this.anchorPanelSettingsTemp;
            if (function02 != null && (multiLiveAnchorPanelSettingsInvoke2 = function02.invoke()) != null && multiLiveAnchorPanelSettingsInvoke2.fixMicNumAction == 0) {
                List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
                if ((listLJIIIZ instanceof Collection) && listLJIIIZ.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (C957020b0m c957020b0m : listLJIIIZ) {
                        PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                        if ((posIdentity2 != null && posIdentity2.type == 1) || ((posIdentity = c957020b0m.getPosIdentity()) != null && posIdentity.type == 2)) {
                            i++;
                            if (i < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                }
                int iIntValue = LJIIL().getSecond().intValue() - 1;
                int i2 = i - 1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkIncreasePanelGuestCount, curGuestCount:");
                sbLIZ.append(i2);
                sbLIZ.append(", panelSelectedGuestCount:");
                sbLIZ.append(iIntValue);
                C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
                if (i2 > 0 && iIntValue > 0) {
                    if (C917910Zzh.LIZ(C930540aK4.LIZJ()) && i2 > 6 && iIntValue < 8) {
                        LJIIIIZZ(iIntValue, i2, 8, function0);
                    } else if (iIntValue + 1 <= i2 && i2 < 7) {
                        LJIIIIZZ(iIntValue, i2, 6, function0);
                    }
                    z = true;
                }
                function1.invoke(Boolean.valueOf(z));
                return;
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        Function0<MultiLiveAnchorPanelSettings> function03 = this.anchorPanelSettingsTemp;
        if (function03 != null && (multiLiveAnchorPanelSettingsInvoke = function03.invoke()) != null && multiLiveAnchorPanelSettingsInvoke.fixMicNumAction == 0) {
            C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
            if (c1303170k15Y22 != null) {
                String strLJIIJJI = LJIIJJI();
                if (strLJIIJJI == null) {
                    strLJIIJJI = "";
                }
                c1303170k15Y22.LJJL(0, strLJIIJJI, new InterfaceC1303160k14() { // from class: X.0a4a
                    @Override // X.InterfaceC1303160k14
                    public final void LIZ(Layout layout) {
                        C942210act.LIZ.getClass();
                        int iLJ = C942210act.LJ();
                        boolean z2 = true;
                        int maxCount = DslLayoutKt.getMaxCount(layout) - 1;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("checkIncreasePanelGuestCount, curGuestCount:");
                        sbLIZ2.append(iLJ);
                        sbLIZ2.append(", panelSelectedGuestCount:");
                        sbLIZ2.append(maxCount);
                        C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ2));
                        if (iLJ > 0 && maxCount > 0 && maxCount + 1 <= iLJ && iLJ < 7) {
                            if (!C937280aUw.LIZ(this.LIZ.source)) {
                                this.LIZ.LJJJIL(iLJ, C497740JfY.LJIJI(2131843508), C497740JfY.LJIJJ(2131843507, Integer.valueOf(maxCount), Integer.valueOf(iLJ)), C925150aBN.LJIIIIZZ, function0);
                            } else {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843509, Integer.valueOf(maxCount)));
                                Function1<Integer, Unit> function12 = this.LIZ.onChangeFailed;
                                if (function12 != null) {
                                    function12.invoke(-3);
                                }
                            }
                        } else {
                            z2 = false;
                        }
                        function1.invoke(Boolean.valueOf(z2));
                    }
                }, null);
                return;
            }
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(int r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJIJ(int, android.view.View):void");
    }

    public final void LJJIFFI(String str, String str2) {
        String strLJIL;
        int panelLayoutType;
        String strLJJIL;
        InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
        String strLIZ = "";
        if (C937280aUw.LIZ(this.source)) {
            strLJIL = "";
        } else {
            strLJIL = dataSource.LJIL();
        }
        if (!C937280aUw.LIZ(this.source)) {
            strLIZ = dataSource.LIZ();
        }
        if (C937280aUw.LIZ(this.source)) {
            panelLayoutType = this.simpleLayoutDataSourceForV3.getPanelLayoutType();
        } else {
            panelLayoutType = C940770aaZ.LIZ().getDataSource().getPanelLayoutType();
        }
        String strValueOf = String.valueOf(panelLayoutType);
        List listLJII = C942210act.LIZ.LJII(null, C937280aUw.LIZ(this.source));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJII.iterator();
        while (it2.hasNext()) {
            String strValueOf2 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
            if (strValueOf2 != null) {
                arrayList.add(strValueOf2);
            }
        }
        if (C937280aUw.LIZ(this.source)) {
            if (C500260Jjc.LJJ()) {
                strLJJIL = "playbook";
            } else {
                strLJJIL = "setting_playbook";
            }
        } else {
            strLJJIL = LJJIL();
        }
        C931750aM1 c931750aM1 = new C931750aM1(str, strLJIL, strLIZ, strValueOf, null, arrayList, "origin_panel", strLJJIL, 240);
        if (Intrinsics.LJFF(str, "click") && str2 != null) {
            c931750aM1.LJII = str2;
        }
        C931740aM0.LJIIJJI(c931750aM1);
    }

    @InterfaceC1294060jmO
    public final void LJJJ(View view, C16F5 c16f5) {
        if (Intrinsics.LJFF(view, this.lastSelectLayoutItem)) {
            return;
        }
        if (view != null) {
            view.setBackgroundResource(R.drawable.f66);
        }
        if (c16f5 != null) {
            c16f5.LJJJI(R.style.a9e);
        }
        View view2 = this.lastSelectLayoutItem;
        if (view2 != null) {
            view2.setBackgroundResource(0);
        }
        this.lastSelectLayoutItem = view;
        C16F5 c16f52 = this.lastSelectLayoutText;
        if (c16f52 != null) {
            c16f52.LJJJI(R.style.a9d);
        }
        this.lastSelectLayoutText = c16f5;
    }

    public final void LJJJJI(int i, View view) {
        int iIntValue;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        CharSequence text = null;
        View viewSd = C786410Ut5.Sd(R.layout.haj, C786410Ut5.ne(context), null);
        RecyclerView recyclerView = (RecyclerView) viewSd.findViewById(R.id.ri7);
        int iLIZJ = this.simpleLayoutDataSourceForV3.LIZJ() - 1;
        C942210act.LIZ.getClass();
        List listLLIIII = C13LP.LLIIII(C942210act.LJI(i));
        TextView textView = (TextView) view.findViewById(R.id.o4p);
        if (textView != null || (textView = this.maxPosCountTvV3) != null) {
            text = textView.getText();
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(String.valueOf(text));
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 1;
        }
        PopupWindow popupWindow = new PopupWindow(viewSd, -2, -2, true);
        popupWindow.setBackgroundDrawable(C800330VaR.LIZIZ(context, R.drawable.f4m));
        popupWindow.setElevation(C418440Gaw.LIZIZ(2));
        recyclerView.setAdapter(new C339610DTb(this.source, listLLIIII, iIntValue, new AwS100S0201000_15(iLIZJ, popupWindow, this, 4), new AwS100S0201000_15(iLIZJ, popupWindow, this, 5), new AwS42S0301000_15(this, view, popupWindow, iLIZJ, 3), new AwS559S0100000_15(popupWindow, 781)));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        int iIndexOf = listLLIIII.indexOf(Integer.valueOf(iIntValue));
        if (iIndexOf != -1) {
            recyclerView.scrollToPosition(iIndexOf);
        }
        HandlerHook.viewPost(view, new ARunnableS23S0400000_15(view, viewSd, this, popupWindow, 3));
        C931740aM0.LJII(iLIZJ, iLIZJ, "", "drop_down", "", LJJIL());
    }

    public final void LJJJJJ(Function0<Unit> function0, Function0<Unit> function02) {
        C935470aS1.LJFF("change_to_floating", "show");
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LJIIZILJ(2131854358);
        c782110Um9.LJII(2131843382);
        c782110Um9.LJIIJ(2131854350, new AcS496S0100000_15(function02, 17));
        c782110Um9.LJIILIIL(2131854357, new AcS496S0100000_15(function0, 18));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment.LayoutItemClickHandler
    public final void Mf(int i, View view) {
        LJJJJI(i, view);
    }

    public static void LJJJI(HashMap map, Object obj, Object obj2) {
        if (obj != null) {
            map.put(obj, obj2);
        }
    }

    @InterfaceC1294060jmO
    public static void LJJL(View view, C16F5 c16f5, boolean z) {
        if (z) {
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            if (c16f5 != null) {
                C786410Ut5.k5(c16f5, 1.0f);
                return;
            }
            return;
        }
        if (view != null) {
            C786410Ut5.T4(view, 0.34f);
        }
        if (c16f5 == null) {
            return;
        }
        C786410Ut5.k5(c16f5, 0.34f);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(android.view.View r10, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r11, java.lang.Integer r12) {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJJII(android.view.View, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings, java.lang.Integer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r10, java.lang.String r11, kotlin.jvm.functions.Function0 r12) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJJIIJ(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJ(int r6, boolean r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = X.C930540aK4.LIZJ()
            boolean r0 = X.C931810aM7.LIZJ(r0)
            r3 = 0
            if (r0 == 0) goto Lb4
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.dataChannel
            r1 = 0
            if (r2 == 0) goto Lb1
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel.class
            java.lang.Object r2 = r2.gg0(r0)
        L16:
            boolean r0 = X.C500260Jjc.LJJIL()
            if (r0 != 0) goto L9e
            boolean r0 = com.bytedance.android.livesdk.util.PlayEntityUtilKt.LJIIIZ()
            if (r0 != 0) goto L9e
            X.0aEU r0 = X.C301101Er.LIZ()
            if (r0 == 0) goto L30
            boolean r0 = r0.isRunning()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L30:
            boolean r0 = X.C176600m4.LIZIZ(r1)
        L34:
            r4 = 1
            if (r0 == 0) goto L9c
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestSupportTextHeaderPanelLayoutStyleListSetting r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.MultiGuestSupportTextHeaderPanelLayoutStyleListSetting.INSTANCE
            int[] r0 = r1.getValue()
            boolean r0 = X.C13LQ.LJIILJJIL(r6, r0)
            if (r0 == 0) goto L5d
            int[] r0 = r1.getValue()
            boolean r0 = X.C13LQ.LJIILJJIL(r6, r0)
            if (r0 == 0) goto L9c
            r0 = 4
            if (r6 == r0) goto L53
            r0 = 2
            if (r6 != r0) goto L9c
        L53:
            if (r7 != 0) goto L9c
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r5.multiGuestDataHolder
            if (r0 == 0) goto L5d
            int r0 = r0.LJJIFFI
            if (r0 > 0) goto L9c
        L5d:
            r1 = 1
        L5e:
            if (r2 == 0) goto Lb4
            X.01F5 r0 = X.C01F5.LJIIIIZZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto Lb4
            if (r1 == 0) goto Lb4
            X.0Um9 r2 = new X.0Um9
            android.content.Context r0 = r5.context
            r2.<init>(r0)
            r0 = 2131854358(0x7f118416, float:1.9342389E38)
            r2.LJIIZILJ(r0)
            r0 = 2131854355(0x7f118413, float:1.9342383E38)
            r2.LJII(r0)
            X.0aJc r1 = new X.InterfaceC743640TFa() { // from class: X.0aJc
                static {
                    /*
                        X.0aJc r0 = new X.0aJc
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0aJc) X.0aJc.LIZ X.0aJc
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C930260aJc.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C930260aJc.<init>():void");
                }

                @Override // X.InterfaceC743640TFa
                public final void LIZ(com.bytedance.android.live.design.app.LiveDialog r1) {
                    /*
                        r0 = this;
                        r1.dismiss()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C930260aJc.LIZ(com.bytedance.android.live.design.app.LiveDialog):void");
                }
            }
            r0 = 2131854350(0x7f11840e, float:1.9342373E38)
            r2.LJIIJ(r0, r1)
            Y.AcS496S0100000_15 r1 = new Y.AcS496S0100000_15
            r0 = 16
            r1.<init>(r8, r0)
            r0 = 2131854357(0x7f118415, float:1.9342387E38)
            r2.LJIILIIL(r0, r1)
            r2.LJIILL = r3
            com.bytedance.android.live.design.app.LiveDialog r0 = r2.LIZ()
            X.C786410Ut5.E4(r0)
            return r4
        L9c:
            r1 = 0
            goto L5e
        L9e:
            X.0bOb r0 = X.C01OF.LIZIZ()
            if (r0 == 0) goto Lac
            boolean r0 = r0.isRunning()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        Lac:
            boolean r0 = X.C176600m4.LIZIZ(r1)
            goto L34
        Lb1:
            r2 = r1
            goto L16
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJJIJ(int, boolean, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r6, android.view.View r7, java.lang.Integer r8, int r9) {
        /*
            r0 = r9 & 1
            r5 = 0
            if (r0 == 0) goto L6
            r7 = r5
        L6:
            r1 = 2
            r0 = r9 & 2
            if (r0 == 0) goto Lc
            r8 = r5
        Lc:
            r0 = -2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 0
            if (r7 == 0) goto Lbc
            android.widget.ImageView r0 = r6.panelItem
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L33
            android.widget.ImageView r0 = r6.fixedPanelItem
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L33
        L24:
            if (r8 == 0) goto L53
            int r0 = r8.intValue()
            if (r0 == r1) goto L33
            int r1 = r8.intValue()
            r0 = 3
            if (r1 != r0) goto L53
        L33:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L53
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus> r0 = com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus.class
            java.lang.Object r1 = r1.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
            r0 = 2131842484(0x7f1155b4, float:1.9318306E38)
            X.C766270U4b.LIZLLL(r0)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r6.onChangeFailed
            if (r0 == 0) goto L52
            r0.invoke(r2)
        L52:
            return r4
        L53:
            X.01Fg r0 = X.C01FQ.LIZ()
            if (r0 == 0) goto Lac
            boolean r0 = r0.LJIJI()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L61:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            r3 = 1
            if (r0 != 0) goto L86
            X.0aFB r0 = r6.LJIILL()
            if (r0 == 0) goto L76
            boolean r0 = r0.LJIIIIZZ()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L76:
            boolean r0 = X.C500260Jjc.LJJJI(r5)
            if (r0 == 0) goto Lc1
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting.INSTANCE
            java.lang.String r0 = "multi_guest_skip_enlarge_check_in_change_layout"
            boolean r0 = r1.getBooleanValue(r0)
            if (r0 != 0) goto Lc1
        L86:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r6.multiGuestDataHolder
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto Lae
            int r0 = r0.layoutType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto Lae
            int r0 = r0.intValue()
            if (r0 != r3) goto Lae
            r0 = 2131843608(0x7f115a18, float:1.9320585E38)
            X.C766270U4b.LIZLLL(r0)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r6.onChangeFailed
            if (r0 == 0) goto L52
            r0.invoke(r2)
            return r4
        Lac:
            r0 = r5
            goto L61
        Lae:
            r0 = 2131843607(0x7f115a17, float:1.9320583E38)
            X.C766270U4b.LIZLLL(r0)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r6.onChangeFailed
            if (r0 == 0) goto L52
            r0.invoke(r2)
            return r4
        Lbc:
            r6.getClass()
            goto L24
        Lc1:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LIZLLL(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract, android.view.View, java.lang.Integer, int):boolean");
    }

    public final void LJII(int i, Context context, LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        if (i != 0 && i != 1) {
            C947390alF.LIZ(context, lifecycleOwner, this.dataChannel, new InterfaceC947410alH() { // from class: X.0aJf
            }, AFwS193S0000000_7.get$arr$(224), new AwS559S0100000_15(function0, (Function0<Unit>) 189));
            return;
        }
        function0.invoke();
    }

    @InterfaceC1294060jmO
    public final void LJIIIIZZ(int i, int i2, int i3, Function0 function0) {
        if (!C937280aUw.LIZ(this.source)) {
            LJJJJ(i2, 2, i3 + 1, C497740JfY.LJIJI(2131843508), C497740JfY.LJIJJ(2131843507, Integer.valueOf(i), Integer.valueOf(i2)), function0);
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843509, Integer.valueOf(i)));
        Function1<Integer, Unit> function1 = this.onChangeFailed;
        if (function1 == null) {
            return;
        }
        function1.invoke(-3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(android.view.View r18, int r19, final java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract.LJIIZILJ(android.view.View, int, java.lang.String, boolean):void");
    }

    public final void LJJIJIL(final boolean z, final EnumC930180aJU enumC930180aJU, final Function0<Unit> function0, Context context) {
        int i;
        String strLJIJI;
        int i2;
        if (C937280aUw.LIZ(this.source)) {
            LJJJJJL(this, enumC930180aJU);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        int[] iArr = C930170aJT.LIZ;
        switch (iArr[enumC930180aJU.ordinal()]) {
            case 1:
            case 2:
                i = 2131843584;
                break;
            case 3:
            default:
                i = 2131843361;
                break;
            case 4:
            case 5:
                i = 2131843585;
                break;
            case 6:
                i = 2131843362;
                break;
            case 7:
                i = 2131843589;
                break;
            case 8:
                i = 2131843587;
                break;
        }
        String strLJIJI2 = C497740JfY.LJIJI(i);
        int i3 = iArr[enumC930180aJU.ordinal()];
        if (i3 != 3 && i3 != 6) {
            if (i3 == 7 || i3 != 8) {
                strLJIJI = C497740JfY.LJIJI(LJJIJL(this));
            } else {
                strLJIJI = C497740JfY.LJIJI(LJJIJL(this));
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843360);
        }
        int i4 = iArr[enumC930180aJU.ordinal()];
        if (i4 != 7) {
            if (i4 != 8) {
                i2 = 2131843583;
            } else {
                i2 = 2131843586;
            }
        } else {
            i2 = 2131843588;
        }
        if (context == null) {
            context = this.context;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = strLJIJI2;
        if (C500260Jjc.LJJIIZ(strLJIJI)) {
            c782110Um9.LJIIIZ(strLJIJI);
        }
        c782110Um9.LJIILIIL(i2, new InterfaceC743640TFa() { // from class: X.0a4g
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                boolean z2;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
                liveDialog.dismiss();
                LayoutSettingContract.LJJJJJL(this.LIZ, enumC930180aJU);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                String strLJIILJJIL = this.LIZ.LJIILJJIL();
                Function0<MultiLiveAnchorPanelSettings> function03 = this.LIZ.anchorPanelSettingsTemp;
                if (function03 != null && (multiLiveAnchorPanelSettingsInvoke = function03.invoke()) != null && multiLiveAnchorPanelSettingsInvoke.fixMicNumAction == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0JGZ.LIZIZ(strLJIILJJIL, "switch", this.LIZ.enterFrom, z2, z);
            }
        });
        c782110Um9.LJIIJ(2131843510, new AcS81S0110000_15(this, z, 1));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public final void LJJJJL(int i, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
        Pair pair;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2;
        if (!C917140ZyS.LIZJ()) {
            C766270U4b.LIZLLL(2131843698);
            return;
        }
        InterfaceC930220aJY interfaceC930220aJY = this.simpleLayoutDataSourceForV3;
        interfaceC930220aJY.LJ(i, interfaceC930220aJY.LJII(i));
        function0.invoke();
        int iIntValue = 0;
        switch (i) {
            case 1:
                pair = new Pair(1, 0);
                break;
            case 2:
            case 8:
            default:
                pair = new Pair(null, null);
                break;
            case 3:
                pair = new Pair(2, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case 4:
                pair = new Pair(3, 0);
                break;
            case 5:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case 6:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case 7:
                pair = new Pair(2, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                pair = new Pair(4, Integer.valueOf(this.simpleLayoutDataSourceForV3.LJII(i)));
                break;
        }
        Integer num = (Integer) pair.getFirst();
        Integer num2 = (Integer) pair.getSecond();
        if (num != null) {
            int iIntValue2 = num.intValue();
            Function0<MultiLiveAnchorPanelSettings> function03 = this.anchorPanelSettingsTemp;
            if (function03 != null && (multiLiveAnchorPanelSettingsInvoke2 = function03.invoke()) != null) {
                multiLiveAnchorPanelSettingsInvoke2.layoutType = iIntValue2;
            }
        }
        if (num2 != null) {
            int iIntValue3 = num2.intValue();
            Function0<MultiLiveAnchorPanelSettings> function04 = this.anchorPanelSettingsTemp;
            if (function04 != null && (multiLiveAnchorPanelSettingsInvoke = function04.invoke()) != null) {
                multiLiveAnchorPanelSettingsInvoke.fixMicNumAction = iIntValue3;
            }
        }
        C920190a3N action = C940770aaZ.LIZ().getAction();
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        action.LJFF(i, iIntValue, new AwS381S0200000_15(this, (LayoutSettingContract) function1, (Function1<? super LayoutState, Unit>) 32), new AwS381S0200000_15(this, (LayoutSettingContract) function02, (Function0<Unit>) 33));
    }

    public final void LJJIJIIJI(EnumC930180aJU enumC930180aJU, Integer num, Integer num2, int i, boolean z) {
        boolean z2;
        String str;
        EnumC930180aJU enumC930180aJU2;
        LJJJJIZL(this, enumC930180aJU, null, null, z, 13);
        if (num == null || num.intValue() != 0) {
            C0JGZ.LIZ(LJIILJJIL(), this.enterFrom);
        }
        if (num2 == null || num2.intValue() != i) {
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = "on";
                enumC930180aJU2 = EnumC930180aJU.TURN_ON;
            } else {
                str = "off";
                enumC930180aJU2 = EnumC930180aJU.TURN_OFF;
            }
            C918100a00.LIZ(str, enumC930180aJU2, this.enterFrom);
        }
    }

    public final void LJJIJIIJIL(int i, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        InterfaceC945610aiN interfaceC945610aiNLIZ;
        int i2;
        int i3;
        List<LinkUser> listLIZLLL;
        switch (i) {
            case 1:
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null && listLIZLLL.size() > 1) {
                    C766270U4b.LIZLLL(2131854585);
                    LJJIFFI("click", CardStruct.IStatusCode.DEFAULT);
                } else {
                    C953610avH.LJJI.getClass();
                    if (C500260Jjc.LJJIIZ(C953610avH.LJJII) && !z) {
                        C942210act c942210act = C942210act.LIZ;
                        Context context = this.context;
                        AwS21S0401000_15 awS21S0401000_15 = new AwS21S0401000_15(this, (LayoutSettingContract) 1, (int) function0, (Function0<Unit>) function1, (Function1<? super LayoutState, Unit>) function02, (Function0<Unit>) 3);
                        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 787);
                        c942210act.getClass();
                        MultiguestNoticeboardV2Setting multiguestNoticeboardV2Setting = MultiguestNoticeboardV2Setting.INSTANCE;
                        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
                            i2 = 2131854013;
                        } else {
                            i2 = 2131854012;
                        }
                        String strLJIJI = C497740JfY.LJIJI(i2);
                        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
                            i3 = 2131854010;
                        } else {
                            i3 = 2131854009;
                        }
                        String strLJIJI2 = C497740JfY.LJIJI(i3);
                        String strLJIJI3 = C497740JfY.LJIJI(2131854001);
                        String strLJIJI4 = C497740JfY.LJIJI(2131854011);
                        if (context != null) {
                            C782110Um9 c782110Um9 = new C782110Um9(context);
                            c782110Um9.LJIILLIIL = false;
                            c782110Um9.LJIILL = false;
                            c782110Um9.LIZJ = strLJIJI;
                            c782110Um9.LJIIIZ(strLJIJI2);
                            c782110Um9.LJIILJJIL(strLJIJI3, new AcS496S0100000_15(awS21S0401000_15, 42));
                            c782110Um9.LJIIJJI(strLJIJI4, new AcS496S0100000_15(awS559S0100000_15, 44));
                            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
                            if (liveDialogLIZ != null) {
                                C786410Ut5.E4(liveDialogLIZ);
                            }
                        }
                    } else {
                        if (C500260Jjc.LJJIIZ(C953610avH.LJJII) && (interfaceC945610aiNLIZ = C944400agQ.LIZ()) != null) {
                            interfaceC945610aiNLIZ.LJFF(null);
                        }
                        LJJJJL(i, function0, function1, function02);
                    }
                }
                break;
            case 2:
            case 3:
            case 7:
                if (Intrinsics.LJFF(LJIL(), Boolean.TRUE) && !z) {
                    LJJJJJ(new AwS21S0401000_15(this, (LayoutSettingContract) i, (int) function0, (Function0<Unit>) function1, (Function1<? super LayoutState, Unit>) function02, (Function0<Unit>) 4), new AwS559S0100000_15(this, 788));
                } else {
                    LJJJJL(i, function0, function1, function02);
                }
                break;
            case 4:
            case 5:
            case 6:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (C930540aK4.LIZJ() && ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.dataChannel)) {
                    C766270U4b.LIZLLL(2131841389);
                    Function1<Integer, Unit> function12 = this.onChangeFailed;
                    if (function12 != null) {
                        function12.invoke(-2);
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_draw_function_conflict_toast_show");
                    c474500IjALIZ.LJIJJLI(this.dataChannel);
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    c474500IjALIZ.LJJII(C923330a8R.LIZLLL(), "is_multi_guest_moderator");
                    c474500IjALIZ.LJJII("guest_connection_icon", "click_position");
                    c474500IjALIZ.LJJII("guest_connection_gird", "function_type");
                    c474500IjALIZ.LIZ();
                    LJJIFFI("click", CardStruct.IStatusCode.DEFAULT);
                } else {
                    LJJJJL(i, function0, function1, function02);
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJJJL(i, function0, function1, function02);
                break;
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJIL(final int i, String str, String str2, final String str3, final Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIIJ(2131843504, new InterfaceC743640TFa() { // from class: X.0ZxM
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
                if (c1303170k15Y22 != null) {
                    String str4 = str3;
                    final int i2 = i;
                    c1303170k15Y22.LJJL(0, str4, new InterfaceC1303160k14() { // from class: X.0Zxg
                        @Override // X.InterfaceC1303160k14
                        public final void LIZ(Layout layout) {
                            C931740aM0.LJII(i2, DslLayoutKt.getMaxCount(layout) - 1, "guidance", "click", "cancel", "live_take_detail");
                        }
                    }, null);
                }
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILIIL(2131843503, new InterfaceC743640TFa() { // from class: X.0Zxd
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                EnumC918990a1R enumC918990a1RLIZ;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
                liveDialog.dismiss();
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LLILIL(Boolean.FALSE, str3);
                }
                Function0<MultiLiveAnchorPanelSettings> function02 = this.anchorPanelSettingsTemp;
                if (function02 != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null) {
                    enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettingsInvoke);
                } else {
                    enumC918990a1RLIZ = null;
                }
                final int iLIZJ = C922550a7B.LIZJ(enumC918990a1RLIZ);
                C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
                if (c1303170k15Y22 != null) {
                    final String str4 = str3;
                    final LayoutSettingContract layoutSettingContract = this;
                    final Function0<Unit> function03 = function0;
                    final int i2 = i;
                    c1303170k15Y22.LJJL(0, str4, new InterfaceC1303160k14() { // from class: X.0Zxf
                        @Override // X.InterfaceC1303160k14
                        public final void LIZ(Layout layout) {
                            layoutSettingContract.LIZIZ(DslLayoutKt.getMaxCount(layout), str4, iLIZJ, null, null, function03);
                            C931740aM0.LJII(i2, DslLayoutKt.getMaxCount(layout) - 1, "guidance", "click", "change", "live_take_detail");
                        }
                    }, null);
                }
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LJJL(0, str3, new InterfaceC1303160k14() { // from class: X.0Zxh
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    C931740aM0.LJII(i, DslLayoutKt.getMaxCount(layout) - 1, "guidance", "show", "", "live_take_detail");
                }
            }, null);
        }
    }

    public static void LJJJJIZL(LayoutSettingContract layoutSettingContract, EnumC930180aJU enumC930180aJU, AwS416S0200000_15 awS416S0200000_15, Context context, boolean z, int i) {
        boolean z2 = z;
        AwS416S0200000_15 awS416S0200000_152 = awS416S0200000_15;
        Context context2 = null;
        if ((i & 4) != 0) {
            awS416S0200000_152 = null;
        }
        if ((i & 8) == 0) {
            context2 = context;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        layoutSettingContract.getClass();
        switch (C930170aJT.LIZ[enumC930180aJU.ordinal()]) {
            case 1:
            case 2:
            case 3:
                layoutSettingContract.LJ(awS416S0200000_152, new AwS4S0420000_15(z2, (boolean) awS416S0200000_152, (Function0<Unit>) layoutSettingContract, (LayoutSettingContract) enumC930180aJU, (EnumC930180aJU) false, (boolean) context2, (Context) 0));
                break;
            case 4:
            case 5:
            case 6:
                layoutSettingContract.LJI(awS416S0200000_152, new AwS4S0420000_15(z2, (boolean) awS416S0200000_152, (Function0<Unit>) layoutSettingContract, (LayoutSettingContract) enumC930180aJU, (EnumC930180aJU) false, (boolean) context2, (Context) 1));
                break;
            case 7:
                layoutSettingContract.LJFF(new AwS9S0410000_15(layoutSettingContract, (LayoutSettingContract) false, (boolean) enumC930180aJU, (EnumC930180aJU) awS416S0200000_152, (Function0<Unit>) context2, (Context) 0));
                break;
            case 8:
                layoutSettingContract.LJFF(new AwS9S0410000_15(layoutSettingContract, (LayoutSettingContract) false, (boolean) enumC930180aJU, (EnumC930180aJU) awS416S0200000_152, (Function0<Unit>) context2, (Context) 1));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zxb, X.0a4A] */
    @InterfaceC1294060jmO
    public final void LIZIZ(final int i, final String str, final int i2, final EnumC930180aJU enumC930180aJU, final Integer num, final Function0<Unit> function0) {
        Boolean boolValueOf;
        final String strLJIILIIL = LJIILIIL();
        C927550aFF c927550aFF = C927570aFH.LLILZ;
        InterfaceC927510aFB interfaceC927510aFBLJIILL = LJIILL();
        final ?? r4 = new InterfaceC920680a4A<ChangeMaxPositionResult>() { // from class: X.0Zxb
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(ChangeMaxPositionResult changeMaxPositionResult) {
                Function0<MultiLiveAnchorPanelSettings> function02;
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
                MultiGuestDataHolder multiGuestDataHolder;
                Map<Integer, String> map;
                Map<Integer, String> map2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkChangeMaxPos onSuccess ");
                sbLIZ.append(changeMaxPositionResult);
                C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
                DataChannel dataChannel = this.LIZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(CurrentRealDisplayChannel.class, new Pair(str, Integer.valueOf(i2)));
                }
                LayoutSettingContract layoutSettingContract = this.LIZ;
                String str2 = str;
                layoutSettingContract.getClass();
                if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && !LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig.INSTANCE.isInFilter(str2) && str2 != null && (function02 = layoutSettingContract.anchorPanelSettingsTemp) != null && (multiLiveAnchorPanelSettingsInvoke = function02.invoke()) != null && multiLiveAnchorPanelSettingsInvoke.fixMicNumAction == 0) {
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke2 = layoutSettingContract.anchorPanelSettingsTemp.invoke();
                    if (multiLiveAnchorPanelSettingsInvoke2 != null && multiLiveAnchorPanelSettingsInvoke2.layoutType == 1) {
                        MultiGuestDataHolder multiGuestDataHolder2 = layoutSettingContract.multiGuestDataHolder;
                        if (multiGuestDataHolder2 != null && (map2 = multiGuestDataHolder2.LJIJJLI) != null) {
                            ((ConcurrentHashMap) map2).put(1, str2);
                        }
                    } else {
                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke3 = layoutSettingContract.anchorPanelSettingsTemp.invoke();
                        if (multiLiveAnchorPanelSettingsInvoke3 != null && multiLiveAnchorPanelSettingsInvoke3.layoutType == 0 && (multiGuestDataHolder = layoutSettingContract.multiGuestDataHolder) != null && (map = multiGuestDataHolder.LJIJJLI) != null) {
                            ((ConcurrentHashMap) map).put(2, str2);
                        }
                    }
                }
                InterfaceC1631630sYr<Integer, String, Integer, EnumC930180aJU, Unit> interfaceC1631630sYr = this.LIZ.requestUpdateSettingLayout;
                if (interfaceC1631630sYr != null) {
                    interfaceC1631630sYr.invoke(Integer.valueOf(i), str, num, enumC930180aJU);
                }
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkChangeMaxPos onFail ");
                sbLIZ.append(linkCoreError);
                C20441214yg.LJ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
                Function0<Unit> function02 = this.LIZ.requestRollbackSettingLayout;
                if (function02 != null) {
                    function02.invoke();
                }
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LLILIL(Boolean.FALSE, strLJIILIIL);
                }
                C501540Jlg.LIZJ(this.LIZ.context, th);
                if (th != null) {
                    C919310a1x.LIZJ("BaseMultiLiveAnchorSettingView", "changeMaxPosition failed,", th);
                }
                Function1<Integer, Unit> function1 = this.LIZ.onChangeFailed;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(linkCoreError.errorCode));
                }
            }
        };
        C11NJ c11nj = this.compositeDisposable;
        c927550aFF.getClass();
        InterfaceC920110a3F interfaceC920110a3F = new InterfaceC920110a3F() { // from class: X.0ZxD
            @Override // X.InterfaceC920110a3F
            public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
            }

            @Override // X.InterfaceC920110a3F
            public final void LIZJ(String str2) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    int i3 = i;
                    String str3 = str;
                    BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                    bizChangeLayoutParams.displayId = i2;
                    interfaceC954180awCLLJLL.LLFF(new C920450a3n(i3, str3, bizChangeLayoutParams), r4);
                }
            }

            @Override // X.InterfaceC920110a3F
            public final void LIZ(int i3, String str2, String str3, Throwable th) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    int i4 = i;
                    String str4 = str;
                    BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                    bizChangeLayoutParams.displayId = i2;
                    interfaceC954180awCLLJLL.LLFF(new C920450a3n(i4, str4, bizChangeLayoutParams), r4);
                }
            }
        };
        if (!C917740ZzQ.LIZIZ(C930540aK4.LIZJ()) && C917920Zzi.LIZIZ(C930540aK4.LIZJ())) {
            if (interfaceC927510aFBLJIILL != null) {
                boolValueOf = Boolean.valueOf(interfaceC927510aFBLJIILL.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean zLIZJ = C930540aK4.LIZJ();
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(zLIZJ)) {
                    if (interfaceC927510aFBLJIILL != null) {
                        interfaceC927510aFBLJIILL.LJIIJJI(interfaceC920110a3F, str);
                        return;
                    }
                    return;
                } else {
                    if (interfaceC927510aFBLJIILL == null) {
                        return;
                    }
                    Integer numLJIILJJIL = interfaceC927510aFBLJIILL.LJIILJJIL();
                    if (numLJIILJJIL != null) {
                        c11nj.LIZ(interfaceC927510aFBLJIILL.LJIILLIIL(numLJIILJJIL.intValue(), false).LJII(new InterfaceC781210Ukh() { // from class: X.0aJd
                            @Override // X.InterfaceC781210Ukh
                            public final void run() {
                                C20441214yg.LJIIIZ("MultiLiveAnchorSettingPresenter", "zoom position shrink successfully.");
                            }
                        }).LJIIIIZZ(new C09JN() { // from class: X.00Jp
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MultiLiveSettingPresenter$Companion@15c9.checkChangeMaxPos$1$2");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("zoom position shrink error throwable=");
                                sbLIZ.append(obj);
                                sbLIZ.append('.');
                                C20441214yg.LJIIIZ("MultiLiveAnchorSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
                                C1C7U.LIZIZ("MultiLiveSettingPresenter$Companion@15c9.checkChangeMaxPos$1$2");
                            }
                        }).LJIILL().LJII(new InterfaceC781210Ukh() { // from class: X.0ZxE
                            @Override // X.InterfaceC781210Ukh
                            public final void run() {
                                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                                if (interfaceC954180awCLLJLL != null) {
                                    int i3 = i;
                                    String str2 = str;
                                    BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                                    bizChangeLayoutParams.displayId = i2;
                                    interfaceC954180awCLLJLL.LLFF(new C920450a3n(i3, str2, bizChangeLayoutParams), r4);
                                }
                            }
                        }).LJIIZILJ());
                    }
                    String strLJIILIIL2 = interfaceC927510aFBLJIILL.LJIILIIL();
                    if (strLJIILIIL2 == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("restoreZoom in zoom ");
                    sbLIZ.append(strLJIILIIL2);
                    C20441214yg.LIZIZ("MultiLiveAnchorSettingPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC927510aFBLJIILL.LJI(strLJIILIIL2, interfaceC920110a3F, false, false, true, true, EnumC919910a2v.FROM_HOST_ZOOM_SELF, null);
                    return;
                }
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == 0) {
                return;
            }
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = i2;
            interfaceC954180awCLLJLL.LLFF(new C920450a3n(i, str, bizChangeLayoutParams), r4);
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 == 0) {
            return;
        }
        BizChangeLayoutParams bizChangeLayoutParams2 = new BizChangeLayoutParams();
        bizChangeLayoutParams2.displayId = i2;
        interfaceC954180awCLLJLL2.LLFF(new C920450a3n(i, str, bizChangeLayoutParams2), r4);
    }

    @InterfaceC1294060jmO
    public final void LJJJJ(final int i, final int i2, final int i3, String str, String str2, final Function0 function0) {
        PosIdentity posIdentity;
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        int i4 = 0;
        if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
            i4 = 0;
            for (C957020b0m c957020b0m : listLJIIIZ) {
                PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                if ((posIdentity2 != null && posIdentity2.type == 1) || ((posIdentity = c957020b0m.getPosIdentity()) != null && posIdentity.type == 2)) {
                    i4++;
                    if (i4 < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        final int i5 = i4 - 1;
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIIJ(2131843504, new AcS4S0002000_15(i, i5, 0));
        c782110Um9.LJIILIIL(2131843503, new InterfaceC743640TFa() { // from class: X.0Zxl
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C920190a3N action = C940770aaZ.LIZ().getAction();
                int i6 = i2;
                int i7 = i3;
                action.LJII(i6, i7, new AwS416S0200000_15(this, i7, function0, 21), new AwS594S0100000_15(this, 209));
                C931740aM0.LJII(i, i5, "guidance", "click", "change", "live_take_detail");
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        C931740aM0.LJII(i, i5, "guidance", "show", "", "live_take_detail");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment.LayoutItemClickHandler
    public final void Fz(Integer num, int i, Context context, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
        boolean z;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsInvoke;
        if (LIZLLL(this, null, Integer.valueOf(i), 1)) {
            C942210act.LIZ.getClass();
            int iLIZLLL = C942210act.LIZLLL(i);
            if (!C942210act.LJIIIZ(i) && i != 1) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131854593, Integer.valueOf(iLIZLLL)));
            } else if (num != null && num.intValue() == i) {
                switch (i) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        C766270U4b.LIZLLL(2131842394);
                        break;
                }
            } else {
                Function0<MultiLiveAnchorPanelSettings> function03 = this.anchorPanelSettingsTemp;
                if (function03 != null && (multiLiveAnchorPanelSettingsInvoke = function03.invoke()) != null && multiLiveAnchorPanelSettingsInvoke.showAvailableSpot == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (LJJIJ(i, z, new C930210aJX(this, i, context, lifecycleOwner, function0, function1, function02))) {
                    return;
                }
                LJII(i, context, lifecycleOwner, new AwS21S0401000_15(this, (LayoutSettingContract) i, (int) function0, (Function0<Unit>) function1, (Function1<? super LayoutState, Unit>) function02, (Function0<Unit>) 0));
                return;
            }
        }
        LJJIFFI("click", CardStruct.IStatusCode.DEFAULT);
    }

    public LayoutSettingContract(Context context, DataChannel dataChannel, MultiGuestDataHolder multiGuestDataHolder, Function0 function0, InterfaceC1631630sYr interfaceC1631630sYr, Function0 function02, InterfaceC916700Zxk interfaceC916700Zxk, String str, String str2, C947840aly c947840aly, boolean z, boolean z2, C947870am1 c947870am1, int i) {
        boolean z3 = z;
        InterfaceC930220aJY interfaceC930220aJY = c947870am1;
        str = (i & 128) != 0 ? null : str;
        str2 = (i & 256) != 0 ? null : str2;
        C947840aly c947840aly2 = (i & 512) == 0 ? c947840aly : null;
        z3 = (i & 1024) != 0 ? false : z3;
        boolean z4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? z2 : false;
        interfaceC930220aJY = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C930200aJW.LIZ : interfaceC930220aJY;
        this.context = context;
        this.dataChannel = dataChannel;
        this.multiGuestDataHolder = multiGuestDataHolder;
        this.anchorPanelSettingsTemp = function0;
        this.requestUpdateSettingLayout = interfaceC1631630sYr;
        this.requestRollbackSettingLayout = function02;
        this.bizSwitchLayoutCallBack = interfaceC916700Zxk;
        this.enterFrom = str;
        this.source = str2;
        this.onChangeFailed = c947840aly2;
        this.skipAutoLayoutModuleShow = z3;
        this.isFromLayoutMarketBack = z4;
        this.simpleLayoutDataSourceForV3 = interfaceC930220aJY;
        this.zoomService$delegate = new C304201Fw("ZOOM_SERVICE");
        this.viewClickableMap = new HashMap<>();
        this.adapterV3$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 208));
        this.isLayoutOperationEnable = true;
        this.compositeDisposable = new C11NJ();
        this.gridFixNum4Enable = C917740ZzQ.LIZ(C930540aK4.LIZJ());
        this.chooseV3ScrollListener$delegate = C452501pT.LIZIZ(new AwS559S0100000_15(this, 209));
    }
}
