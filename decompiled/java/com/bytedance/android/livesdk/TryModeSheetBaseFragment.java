package com.bytedance.android.livesdk;

import X.C475510Ikn;
import X.C500260Jjc;
import X.RunnableC1118500fDE;
import Y.ATListenerS463S0100000_31;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public abstract class TryModeSheetBaseFragment extends LiveSheetFragment {
    public long LLJLLL = System.currentTimeMillis();
    public DataChannel LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJZ = C475510Ikn.LJ(this);
    }

    public final void uS(ViewGroup viewGroup) {
        RunnableC1118500fDE runnableC1118500fDE;
        if (C500260Jjc.LJJJIL(this.LLJZ) && viewGroup != null && (runnableC1118500fDE = (RunnableC1118500fDE) viewGroup.findViewById(R.id.eqx)) != null) {
            ((ArrayList) runnableC1118500fDE.LLIZLLLIL).add(new ATListenerS463S0100000_31(this, 0));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        uS(viewGroup);
    }
}
