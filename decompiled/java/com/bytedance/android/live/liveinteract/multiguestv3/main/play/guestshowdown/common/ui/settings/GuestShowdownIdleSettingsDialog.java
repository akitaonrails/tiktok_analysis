package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings;

import X.C01HZ;
import X.C01UX;
import X.C020W;
import X.C0UX6;
import X.C1143680frq;
import X.C1161920gLG;
import X.C12ES;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C1EOY;
import X.C308301Hl;
import X.C334801Rq;
import X.C341401Ue;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C5185020h;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C937280aUw;
import X.EnumC499801x6;
import X.RunnableC514801zW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownIdleSettingsDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiLjHELIOSo2OzE/ISAkLCo7J2EwJyghJiF9PSxiOionPCwiLjx9DzApOjsAICo7LSAkJgwoJSoALTE4ICE0OwElKCM8Lw==";
    public final GuestShowdownConfig LLL;
    public final String LLLF;
    public final int LLLFF;
    public final int LLLFFI;
    public final C01UX LLLFZ;
    public final C334801Rq LLLI;
    public C341401Ue LLLII;
    public C16FS LLLIIII;
    public C16F5 LLLIIIIL;
    public C1324720kZq LLLIIIL;
    public View LLLIIL;
    public C16F5 LLLIILIL;
    public final long LLLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g9d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        TuxSheet tuxSheet;
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("begin_setting_page"));
        }
        C1EOY.LIZ.LJJII("guest_showdown_begin_setting_page");
        C341401Ue c341401Ue = this.LLLII;
        if (c341401Ue != null && (tuxSheet = c341401Ue.LJIJ) != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        this.LLLFZ.onDismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(3, null);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.dimBehindType = 1;
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("begin_setting_page"), null);
        }
    }

    public final void uS(GuestShowdownConfig guestShowdownConfig) {
        C308301Hl.LIZLLL(C308301Hl.LIZ, "begin_setting_page", "click_start_now", null, null, null, null, 0L, 124);
        this.LLLFZ.LIZJ(guestShowdownConfig.duration, guestShowdownConfig.loserNum, this.LLLI);
        close(1);
    }

    public final void wS(int i) {
        int i2;
        if (!C937280aUw.LIZIZ(this.LLLF)) {
            if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isChangeMinGuestCount()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (i < i2) {
                C16F5 c16f5 = this.LLLIIIIL;
                if (c16f5 != null) {
                    C12ES.LJIILL(0, c16f5);
                }
                C16FS c16fs = this.LLLIIII;
                if (c16fs != null) {
                    c16fs.setEnabled(false);
                    return;
                }
                return;
            }
        }
        C16F5 c16f52 = this.LLLIIIIL;
        if (c16f52 != null) {
            C439101nJ.LJI(c16f52);
        }
        C16FS c16fs2 = this.LLLIIII;
        if (c16fs2 == null) {
            return;
        }
        c16fs2.setEnabled(true);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C16F5 c16f5;
        int i;
        C16FS c16fs;
        super.onViewCreated(view, bundle);
        this.LLLFZ.LIZ();
        this.LLLIILIL = (C16F5) view.findViewById(R.id.uv8);
        View viewFindViewById = view.findViewById(R.id.uvc);
        this.LLLIIL = viewFindViewById;
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new C5183020f(viewFindViewById, 298));
        }
        this.LLLIIII = (C16FS) view.findViewById(R.id.uvf);
        if (C937280aUw.LIZIZ(this.LLLF) && (c16fs = this.LLLIIII) != null) {
            c16fs.setText(C497740JfY.LJIJI(2131854116));
        }
        C16FS c16fs2 = this.LLLIIII;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new C020W(this, c16fs2, 85));
        }
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.uve);
        MultiGuestGuestShowdownRemainTaskSetting multiGuestGuestShowdownRemainTaskSetting = MultiGuestGuestShowdownRemainTaskSetting.INSTANCE;
        if (multiGuestGuestShowdownRemainTaskSetting.isChangeMinGuestCount()) {
            if (multiGuestGuestShowdownRemainTaskSetting.isChangeMinGuestCount()) {
                i = 1;
            } else {
                i = 2;
            }
            C16F5 c16f52 = this.LLLIIIIL;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIIL(2131755864, i, Integer.valueOf(i)));
            }
        }
        if (multiGuestGuestShowdownRemainTaskSetting.isRemainTaskOpenExcludeMinGuestCount() && (c16f5 = this.LLLIILIL) != null) {
            c16f5.setText(C497740JfY.LJIJI(2131852891));
        }
        C341401Ue c341401Ue = new C341401Ue(getContext(), this.LLJLLL, this.LLL, new C5185020h(this, 51), this.LLLFF);
        c341401Ue.LIZJ(view);
        this.LLLII = c341401Ue;
        this.LLLIIIL = (C1324720kZq) view.findViewById(R.id.uv_);
        C1143680frq.LIZLLL(this.LLLIIIL, "tiktok_live_interaction_normal_4", "multi_guest_guest_showdown_preview_image_new.png");
        HandlerHook.viewPost(view, new RunnableC514801zW(this, 166));
        if (C497740JfY.LJJ()) {
            View view2 = this.LLLIIL;
            if (view2 != null) {
                C786410Ut5.Ob(view2, -1.0f);
            }
        } else {
            View view3 = this.LLLIIL;
            if (view3 != null) {
                C786410Ut5.Ob(view3, 1.0f);
            }
        }
        wS(this.LLLFFI);
        RedDotExtensionKt.LIZ(C0UX6.GUEST_SHOWDOWN_ENTRANCE);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("guest_showdown_begin_setting_page");
        return super.dS(layoutInflater, viewGroup, bundle);
    }

    public GuestShowdownIdleSettingsDialog(DataChannel dataChannel, GuestShowdownConfig guestShowdownConfig, String str, int i, int i2, C01UX c01ux, long j, C334801Rq c334801Rq) {
        super(dataChannel);
        this.LLL = guestShowdownConfig;
        this.LLLF = str;
        this.LLLFF = i;
        this.LLLFFI = i2;
        this.LLLFZ = c01ux;
        this.LLLI = c334801Rq;
        this.LLLIL = System.currentTimeMillis();
    }
}
