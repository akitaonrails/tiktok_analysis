package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings;

import X.C01EJ;
import X.C01HZ;
import X.C1161920gLG;
import X.C16F5;
import X.C16FS;
import X.C1EOY;
import X.C20736316Cj;
import X.C341701Uh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C786410Ut5;
import X.C915900ZwS;
import X.EnumC499801x6;
import X.InterfaceC341301Ud;
import X.RunnableC514801zW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownRemainTaskSetting;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import webcast.data.multi_guest_play.GuestShowdownConfig;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownOngoingSettingsDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiLjo2HELIOSOzE/ISAkLCo7J2EwJyghJiF9PSxiOionPCwiLjx9DzApOjsAICo7LSAkJgoiLiA6JiIfLDsnISsrOgs6KSkjLg==";
    public final GuestShowdownConfig LLL;
    public final int LLLF;
    public final InterfaceC341301Ud LLLFF;
    public final int LLLFFI;
    public C16FS LLLFZ;
    public C16FS LLLI;
    public C16FS LLLII;
    public C16FS LLLIIII;
    public final HashMap<Long, C16FS> LLLIIIIL;
    public C16FS LLLIIIL;
    public C16FS LLLIIL;
    public TextView LLLIILIL;
    public C16FS LLLIL;
    public C16F5 LLLILZ;
    public final long LLLILZJ;
    public long LLLILZLLLI;
    public int LLLIZZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g9c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yS() {
        /*
            r8 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownComplianceSetting r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownComplianceSetting.INSTANCE
            boolean r0 = r1.getValue()
            r7 = 0
            if (r0 == 0) goto L23
            boolean r0 = r1.getValue()
            if (r0 == 0) goto L41
            X.0aWx r0 = X.C01IB.LIZ()
            if (r0 == 0) goto L3f
            boolean r0 = r0.isRunning()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L1d:
            boolean r0 = X.C500260Jjc.LJJIJIIJIL(r0)
            if (r0 == 0) goto L41
        L23:
            r6 = 1
        L24:
            X.16FS r5 = r8.LLLIL
            if (r5 == 0) goto L3e
            long r3 = r8.LLLILZLLLI
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
            int r1 = r8.LLLIZZ
            webcast.data.multi_guest_play.GuestShowdownConfig r0 = r8.LLL
            int r0 = r0.loserNum
            if (r1 == r0) goto L3b
        L38:
            if (r6 == 0) goto L3b
            r7 = 1
        L3b:
            r5.setEnabled(r7)
        L3e:
            return
        L3f:
            r0 = 0
            goto L1d
        L41:
            r6 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownOngoingSettingsDialog.yS():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("ing_setting_page"));
        }
        C1EOY.LIZ.LJJII("guest_showdown_ing_setting_page");
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
            c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("ing_setting_page"), null);
        }
    }

    public final void uS(int i) {
        TextView textView = this.LLLIILIL;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        C16FS c16fs = this.LLLIIIL;
        if (c16fs != null) {
            c16fs.setEnabled(true);
        }
        C16FS c16fs2 = this.LLLIIL;
        if (c16fs2 != null) {
            c16fs2.setEnabled(true);
        }
        C16FS c16fs3 = this.LLLIIIL;
        if (c16fs3 != null) {
            C786410Ut5.j5(c16fs3, 1.0f);
        }
        C16FS c16fs4 = this.LLLIIL;
        if (c16fs4 != null) {
            C786410Ut5.j5(c16fs4, 1.0f);
        }
        if (i >= this.LLLF) {
            C16FS c16fs5 = this.LLLIIIL;
            if (c16fs5 != null) {
                c16fs5.setEnabled(false);
            }
            C16FS c16fs6 = this.LLLIIIL;
            if (c16fs6 != null) {
                C786410Ut5.j5(c16fs6, 0.4f);
            }
        } else if (i < this.LLLFFI) {
            C16FS c16fs7 = this.LLLIIL;
            if (c16fs7 != null) {
                c16fs7.setEnabled(false);
            }
            C16FS c16fs8 = this.LLLIIL;
            if (c16fs8 != null) {
                C786410Ut5.j5(c16fs8, 0.4f);
            }
        }
        this.LLLIZZ = i;
        yS();
    }

    public final void wS(long j) {
        if (this.LLLILZLLLI == j) {
            C16FS c16fs = this.LLLIIIIL.get(Long.valueOf(j));
            if (c16fs != null) {
                c16fs.setSelected(false);
            }
            this.LLLILZLLLI = 0L;
            yS();
            return;
        }
        for (View view : this.LLLIIIIL.values()) {
            if (view != null) {
                view.setSelected(false);
            }
        }
        C16FS c16fs2 = this.LLLIIIIL.get(Long.valueOf(j));
        if (c16fs2 != null) {
            c16fs2.setSelected(true);
        }
        this.LLLILZLLLI = j;
        yS();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        C16F5 c16f5;
        C16F5 c16f52;
        String strLIZ;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        C16FS c16fs = null;
        if (view2 != null) {
            c16f5 = (C16F5) view2.findViewById(R.id.uv8);
        } else {
            c16f5 = null;
        }
        this.LLLILZ = c16f5;
        new Object(view) { // from class: X.01Ua
            public final View LIZ;
            public final View LIZIZ;
            public final View LIZJ;

            {
                View viewFindViewById;
                this.LIZ = view;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.uvc);
                } else {
                    viewFindViewById = null;
                }
                this.LIZIZ = viewFindViewById;
                View viewFindViewById2 = view != null ? view.findViewById(R.id.uvd) : null;
                this.LIZJ = viewFindViewById2;
                if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount()) {
                    C500260Jjc.LJLJLJ(viewFindViewById, false);
                    C500260Jjc.LJLJLJ(viewFindViewById2, true);
                    if (viewFindViewById2 != null) {
                        C500260Jjc.LJLIIIL(500L, viewFindViewById2, new C5183020f(viewFindViewById2, 246));
                    }
                    if (C497740JfY.LJJ()) {
                        if (viewFindViewById2 != null) {
                            C786410Ut5.Ob(viewFindViewById2, -1.0f);
                            return;
                        }
                        return;
                    } else {
                        if (viewFindViewById2 == null) {
                            return;
                        }
                        C786410Ut5.Ob(viewFindViewById2, 1.0f);
                        return;
                    }
                }
                C500260Jjc.LJLJLJ(viewFindViewById, true);
                C500260Jjc.LJLJLJ(viewFindViewById2, false);
                if (viewFindViewById != null) {
                    C500260Jjc.LJLIIIL(500L, viewFindViewById, new C5183020f(viewFindViewById, 246));
                }
                if (C497740JfY.LJJ()) {
                    if (viewFindViewById == null) {
                        return;
                    }
                    C786410Ut5.Ob(viewFindViewById, -1.0f);
                } else {
                    if (viewFindViewById == null) {
                        return;
                    }
                    C786410Ut5.Ob(viewFindViewById, 1.0f);
                }
            }
        };
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.uv2);
        this.LLLIL = c16fs2;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new C5183020f(this, 307));
        }
        C16FS c16fs3 = this.LLLIL;
        if (c16fs3 != null) {
            c16fs3.setEnabled(false);
        }
        TextView textView = (TextView) view.findViewById(R.id.uwk);
        int i = 1;
        if (textView != null) {
            long j = this.LLL.duration;
            long j2 = 60;
            int i2 = (int) (j / j2);
            long j3 = j % j2;
            if (j3 == 0) {
                strLIZ = C341701Uh.LIZ(C497740JfY.LJIJI(2131852950), Integer.valueOf(i2));
            } else {
                strLIZ = C341701Uh.LIZ(C497740JfY.LJIJI(2131852951), Integer.valueOf(i2), Integer.valueOf((int) j3));
            }
            textView.setText(strLIZ);
        }
        C16FS c16fs4 = (C16FS) view.findViewById(R.id.uwr);
        if (c16fs4 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs4, new C5183020f(this, 301));
        } else {
            c16fs4 = null;
        }
        this.LLLFZ = c16fs4;
        C16FS c16fs5 = (C16FS) view.findViewById(R.id.uwv);
        if (c16fs5 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs5, new C5183020f(this, 302));
            c16fs5.setText(C341701Uh.LIZ(C497740JfY.LJIJI(2131852942), 1));
        } else {
            c16fs5 = null;
        }
        this.LLLI = c16fs5;
        C16FS c16fs6 = (C16FS) view.findViewById(R.id.uwo);
        if (c16fs6 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs6, new C5183020f(this, 303));
            c16fs6.setText(C341701Uh.LIZ(C497740JfY.LJIJI(2131852942), 3));
        } else {
            c16fs6 = null;
        }
        this.LLLII = c16fs6;
        C16FS c16fs7 = (C16FS) view.findViewById(R.id.uws);
        if (c16fs7 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs7, new C5183020f(this, 304));
            c16fs7.setText(C341701Uh.LIZ(C497740JfY.LJIJI(2131852942), 5));
        } else {
            c16fs7 = null;
        }
        this.LLLIIII = c16fs7;
        HashMap<Long, C16FS> map = this.LLLIIIIL;
        map.put(30L, this.LLLFZ);
        map.put(60L, this.LLLI);
        map.put(180L, this.LLLII);
        map.put(300L, this.LLLIIII);
        for (C16FS c16fs8 : map.values()) {
            if (c16fs8 != null) {
                c16fs8.LLILLL.LJI(0);
                c16fs8.setBackground(C497740JfY.LJIIJ(R.drawable.dyz));
                c16fs8.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
                c16fs8.setSelected(false);
            }
        }
        C16FS c16fs9 = (C16FS) view.findViewById(R.id.uxa);
        if (c16fs9 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs9, new C5183020f(this, 305));
        } else {
            c16fs9 = null;
        }
        this.LLLIIIL = c16fs9;
        C16FS c16fs10 = (C16FS) view.findViewById(R.id.ux1);
        if (c16fs10 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs10, new C5183020f(this, 306));
            c16fs = c16fs10;
        }
        this.LLLIIL = c16fs;
        this.LLLIILIL = (TextView) view.findViewById(R.id.ux8);
        if (MultiGuestGuestShowdownRemainTaskSetting.INSTANCE.isRemainTaskOpenExcludeMinGuestCount() && (c16f52 = this.LLLILZ) != null) {
            c16f52.setText(C497740JfY.LJIJI(2131852891));
        }
        GuestShowdownConfig guestShowdownConfig = this.LLL;
        if (guestShowdownConfig != null) {
            i = guestShowdownConfig.loserNum;
        }
        uS(i);
        View view3 = getView();
        if (view3 != null) {
            HandlerHook.viewPost(view3, new RunnableC514801zW(this, 167));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("guest_showdown_ing_setting_page");
        return super.dS(layoutInflater, viewGroup, bundle);
    }

    public GuestShowdownOngoingSettingsDialog(DataChannel dataChannel, GuestShowdownConfig guestShowdownConfig, int i, C01EJ c01ej) {
        super(dataChannel);
        this.LLL = guestShowdownConfig;
        this.LLLF = i;
        this.LLLFF = c01ej;
        this.LLLFFI = 1;
        this.LLLIIIIL = new HashMap<>();
        this.LLLILZJ = System.currentTimeMillis();
        this.LLLIZZ = guestShowdownConfig.loserNum;
    }
}
