package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C1161920gLG;
import X.C16FS;
import X.C1AZW;
import X.C334801Rq;
import X.C786410Ut5;
import X.C927550aFF;
import X.C927570aFH;
import X.C931790aM5;
import X.C935290aRj;
import X.C935310aRl;
import X.C935330aRn;
import X.C935350aRp;
import X.C935370aRr;
import X.C937280aUw;
import X.C946060aj6;
import X.ViewOnClickListenerC935080aRO;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class PlaybookGiftSettingDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonDiY1PBYpPTs6JiIIIC4/JyI=";
    public final DataChannel LLJZIJLIL;
    public final C946060aj6<C935370aRr> LLL;
    public ViewOnClickListenerC935080aRO LLLF;
    public volatile MultiLiveAnchorPanelSettings LLLFF;
    public MultiGuestDataHolder LLLFFI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hgk;
    }

    public final MultiGuestDataHolder ES() {
        if (!C937280aUw.LIZIZ(this.LLL.LIZIZ)) {
            return PlaybookUtilKt.LJJIFFI();
        }
        if (this.LLLFFI == null) {
            MultiGuestDataHolder multiGuestDataHolder = new MultiGuestDataHolder();
            multiGuestDataHolder.LIZJ = false;
            multiGuestDataHolder.LJJ(new MultiLiveAnchorPanelSettings(0, 0, 0, 0, null, 0, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0));
            this.LLLFFI = multiGuestDataHolder;
        }
        return this.LLLFFI;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLF != null) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("GiftSettingContract", "[onDestroy]", null, null);
        }
        this.LLLF = null;
        this.LLL.LIZIZ().LIZIZ(2);
    }

    public final void BS(int i) {
        Long lValueOf;
        int i2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLLFF;
        if (multiLiveAnchorPanelSettings != null) {
            this.LLL.LIZIZ().LIZ(new C935370aRr(multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold));
        }
        if (!C937280aUw.LIZIZ(this.LLL.LIZIZ)) {
            DataChannel dataChannel = this.LLJZIJLIL;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLLFF;
            Room roomLJJIII = PlaybookUtilKt.LJJIII();
            if (roomLJJIII != null) {
                lValueOf = Long.valueOf(roomLJJIII.getId());
            } else {
                lValueOf = null;
            }
            C927550aFF c927550aFF = C927570aFH.LLILZ;
            Long lValueOf2 = Long.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
            C334801Rq c334801Rq = this.LLL.LJIILIIL;
            C935290aRj c935290aRj = new C935290aRj(this);
            C935350aRp c935350aRp = new C935350aRp(this);
            if (C931790aM5.LIZIZ()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            c927550aFF.getClass();
            C927550aFF.LIZIZ(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings2, i, null, null, i2, c334801Rq, c935290aRj, c935350aRp, false);
        }
        this.LLL.LIZIZ().LIZIZ(2);
        close(1);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    public PlaybookGiftSettingDialog(DataChannel dataChannel, C946060aj6<C935370aRr> c946060aj6) {
        this.LLJZIJLIL = dataChannel;
        this.LLL = c946060aj6;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        View viewDS = super.dS(layoutInflater, viewGroup, bundle);
        ImageView imageView = (ImageView) viewDS.findViewById(R.id.e1g);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new View.OnClickListener() { // from class: X.0aRm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.LL.close(1);
                    this.LL.LLL.LIZIZ().LIZIZ(2);
                }
            });
        }
        MultiGuestDataHolder multiGuestDataHolderES = ES();
        if (multiGuestDataHolderES != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderES.LIZIZ()) != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607);
            C935370aRr c935370aRrLIZ = this.LLL.LIZ();
            if (c935370aRrLIZ != null) {
                long j = c935370aRrLIZ.LIZ;
                if (j >= 0) {
                    multiLiveAnchorPanelSettingsLIZ.applierSortGiftScoreThreshold = j;
                }
            }
        } else {
            multiLiveAnchorPanelSettingsLIZ = null;
        }
        this.LLLFF = multiLiveAnchorPanelSettingsLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLLFF;
        ViewOnClickListenerC935080aRO viewOnClickListenerC935080aRO = new ViewOnClickListenerC935080aRO(getContext(), ES(), new C935330aRn(this), new C935310aRl(this), this.LLL.LIZIZ);
        this.LLLF = viewOnClickListenerC935080aRO;
        viewOnClickListenerC935080aRO.LJ(viewDS, multiLiveAnchorPanelSettings);
        C16FS c16fs = (C16FS) viewDS.findViewById(R.id.cn5);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0aRo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function1<Integer, Unit> function1;
                    ViewOnClickListenerC935080aRO viewOnClickListenerC935080aRO2 = this.LL.LLLF;
                    if (viewOnClickListenerC935080aRO2 != null && (function1 = viewOnClickListenerC935080aRO2.LLILZ) != null) {
                        function1.invoke(5);
                    }
                }
            });
        }
        return viewDS;
    }
}
