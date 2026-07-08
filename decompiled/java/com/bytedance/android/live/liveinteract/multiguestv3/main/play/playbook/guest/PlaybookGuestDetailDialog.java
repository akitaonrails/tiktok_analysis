package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest;

import X.C01GW;
import X.C20366314mb;
import X.C20373514nl;
import X.C20379114of;
import X.C20736316Cj;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC20387814q4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookFixAITechSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookGuestDetailDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiOSMyMScjJiR9LzApOjt9GCktMC08Jy4LPCogPAEpPS46JAElKCM8Lw==";
    public final PlaybookGuestViewModel LLJZIJLIL;
    public final long LLL;
    public final DataChannel LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 304));
    public final String LLLFFI = "playbook_detail_panel";
    public final boolean LLLFZ = true;
    public final C20366314mb LLLI = new InterfaceC20387814q4() { // from class: X.14mb
        @Override // X.InterfaceC20387814q4
        public final void LIZIZ(AwS575S0100000_31 awS575S0100000_31) {
        }

        @Override // X.InterfaceC20387814q4
        public final void LIZJ(C20379114of c20379114of, C20359414lU c20359414lU) {
        }

        @Override // X.InterfaceC20387814q4
        public final void LJ(C20361214lm c20361214lm, C20379114of c20379114of) {
        }

        @Override // X.InterfaceC20387814q4
        public final void LJFF() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        @Override // X.InterfaceC20387814q4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ(X.C20379114of r16, kotlin.jvm.internal.AwS575S0100000_31 r17) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C20366314mb.LIZ(X.14of, kotlin.jvm.internal.AwS575S0100000_31):void");
        }

        @Override // X.InterfaceC20387814q4
        public final void LIZLLL(C20361214lm c20361214lm, C20379114of c20379114of) {
            String strLIZ = C01EI.LIZ(0, (String) this.LIZ.LLLFF.getValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clickTask playbookTask:");
            sbLIZ.append(c20361214lm.LIZ);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            int i = c20361214lm.LIZJ.LJI;
            if (i == 0) {
                InterfaceC927850aFj interfaceC927850aFjLIZIZ = C935150aRV.LIZIZ();
                if (interfaceC927850aFjLIZIZ != null) {
                    interfaceC927850aFjLIZIZ.LJIILLIIL(c20361214lm, new AwS610S0100000_31(this.LIZ, 43));
                    return;
                }
                return;
            }
            if (C20358014lG.LIZIZ(i, 2)) {
                C766270U4b.LIZLLL(2131854103);
            } else {
                if (!C20358014lG.LIZIZ(c20361214lm.LIZJ.LJI, 4)) {
                    return;
                }
                C766270U4b.LIZLLL(2131854102);
            }
        }
    };
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 153));

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9l;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20379114of value;
        Playbook playbook;
        super.onDestroy();
        PlaybookGuestViewModel playbookGuestViewModel = this.LLJZIJLIL;
        if (playbookGuestViewModel == null || (value = playbookGuestViewModel.LLILLL.getValue()) == null || (playbook = value.LIZ) == null) {
            return;
        }
        playbookGuestViewModel.AQ2(playbook, false);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLLFZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLFFI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        return C20373514nl.LIZ(false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.tsc);
        if (frameLayout != null) {
            C786410Ut5.LJJJLL(frameLayout);
        }
        if (this.LLJZIJLIL == null) {
            return;
        }
        if (LinkMicPlaybookFixAITechSwitchSetting.INSTANCE.isEnable()) {
            ViewParent parent = ((View) this.LLLII.getValue()).getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ((View) this.LLLII.getValue(), (ViewGroup) parent);
            }
        }
        if (frameLayout != null) {
            frameLayout.addView((View) this.LLLII.getValue(), new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.14mb] */
    public PlaybookGuestDetailDialog(PlaybookGuestViewModel playbookGuestViewModel, long j, DataChannel dataChannel) {
        this.LLJZIJLIL = playbookGuestViewModel;
        this.LLL = j;
        this.LLLF = dataChannel;
    }
}
