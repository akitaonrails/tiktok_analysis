package com.bytedance.android.live.effect.karaoke.view;

import X.C01GW;
import X.C0JDJ;
import X.C1091700eW0;
import X.C19EH;
import X.C23250099c;
import X.C452501pT;
import X.C465220IMe;
import X.C475510Ikn;
import X.C764670Tz7;
import X.C764680Tz8;
import X.C764690Tz9;
import X.C765700U1w;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeContainerDialogV2 extends LiveSheetFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyHELIOSOiQjIip9PiwpPmEYKTctJiQ2CyoiPS46JiA+DSYyJCorH30=";
    public Integer LLJLLL;
    public KaraokeViewModel LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 43));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        ((KaraokeContainerDialog) this.LLJZIJLIL.getValue()).LLJI = 2;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764670Tz7(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void oS() {
        ((KaraokeContainerDialog) this.LLJZIJLIL.getValue()).LLJI = 3;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764680Tz8(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        ((KaraokeContainerDialog) this.LLJZIJLIL.getValue()).LLJI = 4;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C764690Tz9(this, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(iIntValue, (Fragment) this.LLJZIJLIL.getValue(), null);
            c19ehLJIIJ.LJIIJ();
        }
        this.LLJZ = C765700U1w.LIZJ(C475510Ikn.LJ(this));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJLLL = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
