package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui;

import X.C19322110iZ;
import X.C19EG;
import X.C20441214yg;
import X.C497740JfY;
import X.C748880TZe;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSheetFragment extends LiveSheetFragment {
    public final DataChannel LLJLLL;
    public View LLJZ;
    public Function1<? super BaseSheetFragment, Unit> LLJZIJLIL;

    public abstract int layoutId();

    public BaseSheetFragment(DataChannel dataChannel) {
        this.LLJLLL = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.LIZ(0, null);
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public void x1(int i) {
        Function1<? super BaseSheetFragment, Unit> function1 = this.LLJZIJLIL;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public final boolean uS(FragmentManager fragmentManager, String str) {
        if (fragmentManager == null) {
            return false;
        }
        try {
            C19322110iZ.LJFF(fragmentManager, this, str, null, 0);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("BaseSheetFragment", th.getMessage());
            return false;
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, layoutId(), viewGroup, false);
        this.LLJZ = viewTd;
        return viewTd;
    }

    public final boolean wS(Fragment fragment, C19EG c19eg, String str) {
        FragmentManager fragmentManager;
        if (fragment != null && fragment.isAdded() && !fragment.isStateSaved()) {
            return uS(fragment.getChildFragmentManager(), str);
        }
        if (c19eg != null) {
            return uS(c19eg.getSupportFragmentManager(), str);
        }
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        } else {
            fragmentManager = null;
        }
        return uS(fragmentManager, str);
    }
}
