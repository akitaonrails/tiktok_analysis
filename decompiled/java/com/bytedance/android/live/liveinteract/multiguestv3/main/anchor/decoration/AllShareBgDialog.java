package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0DXR;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1555540qa8;
import X.C2217371BqR;
import X.C292401Bi;
import X.C497740JfY;
import X.C766720U5u;
import X.C771260UNg;
import X.C786410Ut5;
import X.C950690aqZ;
import X.C950750aqf;
import X.C950860aqq;
import X.C951190arN;
import X.C953470av3;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.InterfaceC950700aqa;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes16.dex */
public final class AllShareBgDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjHELIOSo2OzE6emE+KSwiZy49Ky0jO2E3LSYjOy4nISoiZw4/JBYkKD02CiIIIC4/JyI=";
    public C950690aqZ LLJLLL;
    public RecyclerView LLJZ;
    public Function0<Unit> LLJZIJLIL;
    public boolean LLL;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS559S0100000_15(this, 178));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS559S0100000_15(this, 179));
    public final C01GW LLLFFI = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(60));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854241));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJ = (ArrayList) this.LLLFF.getValue();
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C951190arN) this.LLLF.getValue()).LLLIIIIL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLJZIJLIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC950700aqa interfaceC950700aqa;
        DataChannel dataChannel;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvr);
        this.LLJZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        }
        RecyclerView recyclerView2 = this.LLJZ;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration((C0DXR) this.LLLFFI.getValue());
        }
        RecyclerView recyclerView3 = this.LLJZ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((AbstractC21673619ry) this.LLLF.getValue());
        }
        C950690aqZ c950690aqZ = this.LLJLLL;
        if (c950690aqZ != null) {
            C950860aqq c950860aqq = new C950860aqq(this);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJI(new C771260UNg(c950690aqZ, jCurrentTimeMillis, c950860aqq), true);
        }
        C950690aqZ c950690aqZ2 = this.LLJLLL;
        if (c950690aqZ2 != null && (interfaceC950700aqa = c950690aqZ2.LIZ) != null && (dataChannel = interfaceC950700aqa.getDataChannel()) != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null && (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null) {
            MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL0, new C2217371BqR() { // from class: X.0aqc
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C935540aS8) obj).LLILZ;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935540aS8) obj).LLILZ = (String) obj2;
                }
            }, this, new AwS591S0100000_12(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        }
        C953470av3.LIZ.getClass();
        C953470av3.LIZ(view);
    }

    public final void uS(List<C950750aqf> list, boolean z) {
        if (list != null && (!list.isEmpty())) {
            if (this.LLJLLL != null) {
                C950690aqZ.LIZLLL(list, this.LLL);
            }
            if (!this.LLL) {
                this.LLL = true;
            }
            ((C1117360fBO) this.LLLF.getValue()).LLLII(list);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h9j, viewGroup, false);
    }
}
