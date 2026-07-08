package com.bytedance.android.live.design.view.sheet;

import X.C1602160rnK;
import X.C415690GRr;
import X.C935280aRi;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public class LiveFixedHeightSheetDialog extends LiveBaseSheetDialog {
    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GJ, X.C19EK, android.app.Dialog
    public final void onStart() throws JSONException {
        super.onStart();
        if (this.LLJILJIL == null) {
            LJLIIL();
        }
        this.LLJILJIL.setState(3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19EK, android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJL = false;
        C415690GRr c415690GRr = this.LLJJJJLIIL;
        if (c415690GRr != null) {
            int visibility = c415690GRr.getVisibility();
            c415690GRr.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c415690GRr);
        }
    }

    public LiveFixedHeightSheetDialog(Context context, C935280aRi c935280aRi) {
        super(context, R.style.sy);
        c935280aRi.getClass();
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    public LiveFixedHeightSheetDialog(Context context, int i) {
        super(context, i);
    }
}
