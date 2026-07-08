package com.bytedance.android.live.liveinteract.competition.game.guide;

import X.C098200Yq;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C786410Ut5;
import X.C973660bRc;
import X.C978980baC;
import X.EnumC919170a1j;
import X.InterfaceC1106030et7;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansModeGuideFragment extends CatchBeansModeGuideContract$View {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpHELIOSPSYnISoiZygyJSBiLjo6LCBiCi4nKy0OLC49OwgjLSoUPSwoLAkhKSIhLCEn";
    public C1324720kZq LLILZ;
    public C16FS LLILZIL;
    public Function1<? super EnumC919170a1j, Unit> LLILZLL;
    public Integer LLIZ;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        if (!LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable()) {
            C978980baC c978980baC = new C978980baC();
            c978980baC.LJIIL = false;
            c978980baC.LJIILIIL = false;
            c978980baC.LJIIIIZZ = true;
            return c978980baC;
        }
        C978980baC c978980baC2 = new C978980baC();
        c978980baC2.LJIIL = false;
        c978980baC2.LJIILIIL = false;
        c978980baC2.LJIIIIZZ = true;
        c978980baC2.LJIIIZ = true;
        c978980baC2.LJIIJ = new AwS559S0100000_15(this, 109);
        return c978980baC2;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C16FS c16fs;
        super.onViewCreated(view, bundle);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.lon);
        this.LLILZIL = (C16FS) view.findViewById(R.id.di5);
        Integer num = this.LLIZ;
        if (num != null && num.intValue() == 7 && (c16fs = this.LLILZIL) != null) {
            c16fs.setText(C497740JfY.LJIJI(2131851532));
        }
        C16FS c16fs2 = this.LLILZIL;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 277));
        }
        C1143680frq.LJ(this.LLILZ, "tiktok_live_interaction_demand_10", "ttlive_catch_beans_guide_dialog_header_pic.png", ImageView.ScaleType.CENTER_CROP);
        InterfaceC1106030et7.R4.LJFF(1);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        Integer num2 = this.LLIZ;
        if (num2 != null && num2.intValue() == 7) {
            str = "capsule_guide";
        } else {
            str = "plaza_icon";
        }
        c973660bRc.LJJLL("catch_bean", str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g51, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
