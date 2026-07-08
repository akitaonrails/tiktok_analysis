package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank;

import X.C01GV;
import X.C01HZ;
import X.C01MC;
import X.C01UP;
import X.C1161920gLG;
import X.C11NJ;
import X.C13BV;
import X.C15438062q;
import X.C1EOY;
import X.C410901il;
import X.C433001mK;
import X.C915900ZwS;
import X.C951190arN;
import X.EnumC499801x6;
import X.RunnableC781530UlD;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownRankDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiLjo2OzE/ISAkLCo7J2EwJyghJiF9PSxiOy49I2sLPCogPBYkJjg3JzIiGy49IwElKCM8Lw==";
    public final C01MC LLL;
    public GuestShowdownContent LLLF;
    public int LLLFF;
    public LiveIconView LLLFFI;
    public LiveIconView LLLFZ;
    public LiveIconView LLLI;
    public TextView LLLII;
    public final long LLLIIII;
    public RunnableC781530UlD LLLIIIIL;
    public final C951190arN LLLIIIL;
    public final C11NJ LLLIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g9b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void uS() {
        ?? arrayList;
        List<GuestShowdownUser> list;
        C951190arN c951190arN = this.LLLIIIL;
        C410901il c410901il = new C410901il();
        GuestShowdownContent guestShowdownContent = this.LLLF;
        if (guestShowdownContent == null || (list = guestShowdownContent.runningPlayUsers) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<GuestShowdownUser> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C01UP(it2.next()));
            }
        }
        c410901il.addAll(arrayList);
        c951190arN.LLLII(c410901il);
        if (this.LLLFF == 3) {
            LiveIconView liveIconView = this.LLLFZ;
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.ezt);
            }
            LiveIconView liveIconView2 = this.LLLFFI;
            if (liveIconView2 != null) {
                liveIconView2.setIconTintAttr(R.attr.ezt);
                return;
            }
            return;
        }
        LiveIconView liveIconView3 = this.LLLFZ;
        if (liveIconView3 != null) {
            liveIconView3.setIconTintAttr(R.attr.ezq);
        }
        LiveIconView liveIconView4 = this.LLLFFI;
        if (liveIconView4 != null) {
            liveIconView4.setIconTintAttr(R.attr.ezq);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_ranking_page"));
        }
        C1EOY.LIZ.LJJII("guest_showdown_party_ranking_page");
        this.LLLIIL.LJ();
        C433001mK.LIZLLL.remove("GuestShowdownRankDialog");
        this.LLLIIIL.LLLIIIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.dimBehindType = 1;
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.GUEST_SHOWDOWN, C915900ZwS.LIZIZ("party_ranking_page"), null);
        }
    }

    public GuestShowdownRankDialog(DataChannel dataChannel, C01GV c01gv) {
        super(dataChannel);
        this.LLL = c01gv;
        this.LLLFF = 2;
        this.LLLIIII = System.currentTimeMillis();
        this.LLLIIIL = new C951190arN();
        this.LLLIIL = new C11NJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("guest_showdown_party_ranking_page");
        return super.dS(layoutInflater, viewGroup, bundle);
    }
}
