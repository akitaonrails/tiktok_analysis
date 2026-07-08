package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C01GW;
import X.C092O;
import X.C1119170fEJ;
import X.C13LP;
import X.C16FS;
import X.C452501pT;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C635860Owq;
import X.C748880TZe;
import X.C786410Ut5;
import X.C917810ZzX;
import X.C934960aRC;
import X.C937280aUw;
import X.C942210act;
import X.C942220acu;
import X.C946060aj6;
import X.C947830alx;
import X.C947840aly;
import X.C947850alz;
import X.C947870am1;
import X.C947880am2;
import X.C947920am6;
import X.C947930am7;
import X.C947940am8;
import X.C947950am9;
import X.C947960amA;
import X.C947970amB;
import X.C947980amC;
import X.C948400ams;
import X.InterfaceC916700Zxk;
import X.InterfaceC947990amD;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LayoutConfig;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: loaded from: classes16.dex */
public final class PlaybookLayoutSettingDialogV3 extends BasePlaybookSheetFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonBS4qJzA4GionPCwiLgs6KSkjLhlg";
    public final DataChannel LLJZIJLIL;
    public final C946060aj6<LayoutConfig> LLL;
    public final InterfaceC947990amD LLLF;
    public LayoutSettingContract LLLFFI;
    public volatile MultiLiveAnchorPanelSettings LLLFZ;
    public LayoutSettingContract LLLI;
    public final LayoutConfig LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public final String LLLFF = "setting";
    public final C947870am1 LLLIIIL = new C947870am1();
    public final C947850alz LLLIIL = new InterfaceC916700Zxk() { // from class: X.0alz
        @Override // X.InterfaceC916700Zxk
        public final void LIZIZ(EnumC930180aJU enumC930180aJU) {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // X.InterfaceC916700Zxk
        public final void onSuccess() {
            int i = this.LIZ.LLLIIIL.LIZ;
            C942210act.LIZ.getClass();
            Integer num = 2;
            switch (i) {
                case 1:
                case 2:
                    num = 1;
                    break;
                case 3:
                case 7:
                    break;
                case 4:
                    num = 3;
                    break;
                case 5:
                case 6:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    num = 4;
                    break;
                case 8:
                default:
                    C766270U4b.LIZLLL(2131851936);
            }
            if (num != null) {
                C946050aj5 c946050aj5LIZIZ = this.LIZ.LLL.LIZIZ();
                LayoutConfig layoutConfig = new LayoutConfig();
                PlaybookLayoutSettingDialogV3 playbookLayoutSettingDialogV3 = this.LIZ;
                layoutConfig.layoutType = num.intValue();
                layoutConfig.micCount = (i == 2 || i == 4) ? 0 : playbookLayoutSettingDialogV3.LLLIIIL.LIZIZ - 1;
                layoutConfig.panelLayoutType = i;
                c946050aj5LIZIZ.LIZ(layoutConfig);
                this.LIZ.LLL.LIZIZ().LIZIZ(2);
                this.LIZ.close(1);
                return;
            }
            C766270U4b.LIZLLL(2131851936);
        }

        @Override // X.InterfaceC916700Zxk
        public final void LIZ(LinkCoreError linkCoreError) {
            this.LIZ.LLL.LIZIZ().LIZJ(linkCoreError.errorCode);
        }
    };
    public final PlaybookLayoutSettingDialogV3$layoutMargetLayoutItemClickHandler$1 LLLIILIL = new LayoutMarketFragment.LayoutItemClickHandler() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3$layoutMargetLayoutItemClickHandler$1
        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
        }

        @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment.LayoutItemClickHandler
        public final void Mf(int i, View view) {
            LayoutSettingContract layoutSettingContract = this.LL.LLLI;
            if (layoutSettingContract != null) {
                layoutSettingContract.LJJJJI(i, view);
            }
        }

        @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment.LayoutItemClickHandler
        public final void Fz(Integer num, int i, Context context, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
            C947870am1 c947870am1 = this.LL.LLLIIIL;
            c947870am1.LIZ = i;
            c947870am1.LIZLLL(c947870am1.LJII(i));
            LayoutSettingContract layoutSettingContract = this.LL.LLLI;
            if (layoutSettingContract != null) {
                layoutSettingContract.LJJIJLIJ();
            }
            function1.invoke(null);
        }
    };
    public final C01GW LLLIL = C452501pT.LIZIZ(new C947920am6());

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hgn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public final MultiGuestDataHolder BS() {
        if (!C937280aUw.LIZIZ(this.LLL.LIZIZ)) {
            return PlaybookUtilKt.LJJIFFI();
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LLLIL.getValue();
        multiGuestDataHolder.LIZJ = true;
        multiGuestDataHolder.LIZLLL = false;
        multiGuestDataHolder.LJJ(new MultiLiveAnchorPanelSettings(0, 0, 0, 0, null, 0, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0));
        return multiGuestDataHolder;
    }

    public final void FS() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LLJZIJLIL;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        hide();
        String str = LayoutMarketFragment._pnsPageId;
        C942220acu.LIZ(fragmentManager, this.LLLIILIL, C500260Jjc.LJJLIIIJ(this.LLJZIJLIL) > 0 ? "playbook" : "setting_playbook", this.LLLIIIL, new C947970amB(this), null, 32);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(C497740JfY.LJIJI(2131851935), R.style.ajw, new C092O() { // from class: X.0am4
            @Override // X.C092O
            public final void accept(Object obj) {
                PlaybookLayoutSettingDialogV3 playbookLayoutSettingDialogV3 = this.LIZ;
                playbookLayoutSettingDialogV3.getClass();
                LayoutSettingContract layoutSettingContract = playbookLayoutSettingDialogV3.LLLFFI;
                if (layoutSettingContract != null) {
                    layoutSettingContract.LIZ();
                }
            }
        })));
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(getString(2131842393));
        c1119170fEJ.LJ = Collections.singletonList(WR(new View.OnClickListener() { // from class: X.0am3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.close(1);
                this.LL.LLL.LIZIZ().LIZIZ(2);
            }
        }));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final MultiLiveAnchorPanelSettings ES() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Integer numValueOf;
        C947980amC c947980amC;
        MultiGuestDataHolder multiGuestDataHolderBS = BS();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = null;
        if (multiGuestDataHolderBS != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderBS.LIZIZ()) != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607);
            LayoutConfig layoutConfig = this.LLLII;
            if (layoutConfig != null && (numValueOf = Integer.valueOf(layoutConfig.layoutType)) != null) {
                if (numValueOf.intValue() == 1) {
                    c947980amC = new C947980amC(1, 1);
                } else if (numValueOf.intValue() == 3) {
                    c947980amC = new C947980amC(0, 1);
                } else if (numValueOf.intValue() == 2) {
                    c947980amC = new C947980amC(1, 0);
                } else if (numValueOf.intValue() == 4) {
                    c947980amC = new C947980amC(0, 0);
                }
                multiLiveAnchorPanelSettingsLIZ.layoutType = c947980amC.LIZ;
                multiLiveAnchorPanelSettingsLIZ.fixMicNumAction = c947980amC.LIZIZ;
            }
        }
        this.LLLFZ = multiLiveAnchorPanelSettingsLIZ;
        return this.LLLFZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LayoutSettingContract layoutSettingContract = this.LLLFFI;
        if (layoutSettingContract != null) {
            layoutSettingContract.LJJIII();
        }
        this.LLLFFI = null;
        this.LLL.LIZIZ().LIZIZ(2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLFF;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        this.LLLF.LIZIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLF.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0alz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookLayoutSettingDialogV3$layoutMargetLayoutItemClickHandler$1] */
    public PlaybookLayoutSettingDialogV3(DataChannel dataChannel, C946060aj6<LayoutConfig> c946060aj6, InterfaceC947990amD interfaceC947990amD) {
        this.LLJZIJLIL = dataChannel;
        this.LLL = c946060aj6;
        this.LLLF = interfaceC947990amD;
        this.LLLII = c946060aj6.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        Integer numValueOf;
        int i2;
        C947870am1 c947870am1 = this.LLLIIIL;
        C937280aUw.LIZIZ(this.LLL.LIZIZ);
        c947870am1.getClass();
        LayoutConfig layoutConfig = this.LLLII;
        if (layoutConfig != null && (i2 = layoutConfig.panelLayoutType) > 0) {
            C947870am1 c947870am12 = this.LLLIIIL;
            c947870am12.LIZ = i2;
            c947870am12.LIZLLL(layoutConfig.micCount + 1);
        } else {
            C942210act c942210act = C942210act.LIZ;
            Context context = getContext();
            new C947950am9(this);
            new C947960amA(this);
            C948400ams c948400ams = (C948400ams) C13LP.LJJJLL(c942210act.LJII(context, true));
            if (c948400ams != null) {
                i = c948400ams.LIZIZ;
            } else {
                i = 2;
            }
            int iLIZLLL = C942210act.LIZLLL(i);
            C947870am1 c947870am13 = this.LLLIIIL;
            c947870am13.LIZ = i;
            c947870am13.LIZLLL(iLIZLLL);
        }
        View viewDS = super.dS(layoutInflater, viewGroup, bundle);
        C16FS c16fs = (C16FS) viewDS.findViewById(R.id.cn5);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0am5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlaybookLayoutSettingDialogV3 playbookLayoutSettingDialogV3 = this.LL;
                    playbookLayoutSettingDialogV3.getClass();
                    LayoutSettingContract layoutSettingContract = playbookLayoutSettingDialogV3.LLLFFI;
                    if (layoutSettingContract != null) {
                        layoutSettingContract.LIZ();
                    }
                }
            });
        }
        this.LLLIIII = viewDS.findViewById(R.id.ztf);
        this.LLLIIIIL = viewDS.findViewById(R.id.k1f);
        View view = this.LLLIIII;
        if (view != null) {
            C500260Jjc.LJLIIIL(500L, view, new C947930am7(this));
        }
        View view2 = this.LLLIIIIL;
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new C947940am8(this));
        }
        View view3 = this.LLLIIII;
        if (view3 != null) {
            C635860Owq.LIZ.LIZJ(8, view3);
        }
        View view4 = this.LLLIIIIL;
        if (view4 != null) {
            C635860Owq.LIZ.LIZJ(8, view4);
        }
        if ((!C500260Jjc.LJJ() || !C917810ZzX.LJIIIIZZ()) && C934960aRC.LIZIZ()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        C500260Jjc.LJLJLJ(this.LLLIIII, z2);
        C500260Jjc.LJLJLJ(this.LLLIIIIL, z2);
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsES = ES();
        Context context2 = getContext();
        DataChannel dataChannel = this.LLJZIJLIL;
        MultiGuestDataHolder multiGuestDataHolderBS = BS();
        C947830alx c947830alx = new C947830alx(this);
        C947880am2 c947880am2 = new C947880am2(this);
        C947850alz c947850alz = this.LLLIIL;
        String str = this.LLL.LIZIZ;
        LayoutSettingContract layoutSettingContract = new LayoutSettingContract(context2, dataChannel, multiGuestDataHolderBS, c947830alx, null, c947880am2, c947850alz, str, str, new C947840aly(this), false, false, this.LLLIIIL, 3072);
        this.LLLFFI = layoutSettingContract;
        LayoutConfig layoutConfig2 = this.LLLII;
        if (layoutConfig2 != null) {
            numValueOf = Integer.valueOf(layoutConfig2.micCount);
        } else {
            numValueOf = null;
        }
        layoutSettingContract.LJJII(viewDS, multiLiveAnchorPanelSettingsES, numValueOf);
        this.LLLI = layoutSettingContract;
        return viewDS;
    }
}
