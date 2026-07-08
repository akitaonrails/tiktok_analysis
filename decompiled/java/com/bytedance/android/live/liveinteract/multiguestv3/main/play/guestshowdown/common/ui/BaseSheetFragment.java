package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui;

import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSheetFragment extends LiveSheetFragment {
    public final DataChannel LLJLLL;
    public Function0<Unit> LLJZ;
    public View LLJZIJLIL;

    public abstract int layoutId();

    public BaseSheetFragment(DataChannel dataChannel) {
        this.LLJLLL = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.LIZ(0, null);
        sheetOptions.canceledOnTouchOutside = false;
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLJZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, layoutId(), viewGroup, false);
        this.LLJZIJLIL = viewTd;
        return viewTd;
    }
}
