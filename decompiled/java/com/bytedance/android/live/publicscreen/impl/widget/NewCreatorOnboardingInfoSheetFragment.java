package com.bytedance.android.live.publicscreen.impl.widget;

import X.C1119170fEJ;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C521860KdM;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class NewCreatorOnboardingInfoSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOToxJCwvOiwhLSAiZyY+OCliHELIOSPiY3LyA4ZwE2PwY+LC4nJzcDJy08KTcoICE0ASsqJhw7LSA4Dz0yLygpJzs=";
    public final Fragment LLJLLL;
    public final DataChannel LLJZ;

    public NewCreatorOnboardingInfoSheetFragment() {
        this(null, null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        String strLJIJI = C497740JfY.LJIJI(2131855002);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        arrayList.add(new C510160Jza(strLJIJI, R.style.a7h, new C521860KdM(this, 0)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS142S0100000_7(this, 4)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.isHeaderFloating = true;
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    public NewCreatorOnboardingInfoSheetFragment(Fragment fragment, DataChannel dataChannel) {
        this.LLJLLL = fragment;
        this.LLJZ = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hfa, viewGroup, false);
    }
}
