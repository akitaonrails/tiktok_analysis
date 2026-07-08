package com.bytedance.android.live.design.view.sheet.action;

import X.C1389600mGU;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public class LiveActionSheetDialogFragment extends LiveBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLSogISIiZzk6LTJiOiHELIOSc2LTFiKCwnISoiZwM6PiANKjs6JysfISo2PAElKCM8LwM+KCg+LSs4";

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment
    public final LiveBottomSheetDialog MR() {
        return new LiveActionSheetDialog(getContext(), getTheme());
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        LiveBottomSheetDialog liveBottomSheetDialogMR = MR();
        Window window = liveBottomSheetDialogMR.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(liveBottomSheetDialogMR);
        return liveBottomSheetDialogMR;
    }
}
