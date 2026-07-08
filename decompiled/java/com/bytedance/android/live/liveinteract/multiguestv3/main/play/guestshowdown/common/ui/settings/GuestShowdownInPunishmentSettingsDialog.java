package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings;

import X.C01HZ;
import X.C01UV;
import X.C1161920gLG;
import X.C16F5;
import X.C303801Fs;
import X.C341401Ue;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C786410Ut5;
import X.C915900ZwS;
import X.EnumC499801x6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownInPunishmentSettingsDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiLjo2OzHELIOSE/ISAkLCo7J2EwJyghJiF9PSxiOionPCwiLjx9DzApOjsAICo7LSAkJgwiGTo9ITYkJCo9PBYpPTs6JiI/DSYyJCor";
    public final GuestShowdownConfig LLL;
    public final int LLLF;
    public final C01UV LLLFF;
    public C16F5 LLLFFI;
    public C341401Ue LLLFZ;
    public View LLLI;
    public final String LLLII;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g9a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        TuxSheet tuxSheet;
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ(this.LLLII));
        }
        C341401Ue c341401Ue = this.LLLFZ;
        if (c341401Ue == null || (tuxSheet = c341401Ue.LJIJ) == null) {
            return;
        }
        tuxSheet.dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(0, null);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.dimBehindType = 1;
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ(this.LLLII), null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C16F5 c16f5;
        super.onViewCreated(view, bundle);
        this.LLLFFI = (C16F5) view.findViewById(R.id.uv8);
        View viewFindViewById = view.findViewById(R.id.ja_);
        this.LLLI = viewFindViewById;
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new C5183020f(viewFindViewById, 299));
        }
        View viewFindViewById2 = view.findViewById(R.id.uv0);
        if (viewFindViewById2 != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById2, new C5183020f(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
        View viewFindViewById3 = view.findViewById(R.id.uv9);
        if (viewFindViewById3 != null) {
            C439101nJ.LJI(viewFindViewById3);
        }
        C341401Ue c341401Ue = new C341401Ue(getContext(), this.LLJLLL, this.LLL, null, this.LLLF);
        c341401Ue.LIZJ(view);
        this.LLLFZ = c341401Ue;
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount() && (c16f5 = this.LLLFFI) != null) {
            c16f5.setText(C497740JfY.LJIJI(2131852891));
        }
        if (C497740JfY.LJJ()) {
            View view2 = this.LLLI;
            if (view2 != null) {
                C786410Ut5.Ob(view2, -1.0f);
                return;
            }
            return;
        }
        View view3 = this.LLLI;
        if (view3 == null) {
            return;
        }
        C786410Ut5.Ob(view3, 1.0f);
    }

    public GuestShowdownInPunishmentSettingsDialog(DataChannel dataChannel, GuestShowdownConfig guestShowdownConfig, int i, C303801Fs c303801Fs) {
        super(dataChannel);
        this.LLL = guestShowdownConfig;
        this.LLLF = i;
        this.LLLFF = c303801Fs;
        this.LLLII = "guest_showdown_punishment";
    }
}
