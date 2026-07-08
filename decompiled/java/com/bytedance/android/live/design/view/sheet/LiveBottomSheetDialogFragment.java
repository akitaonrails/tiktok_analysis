package com.bytedance.android.live.design.view.sheet;

import X.C1389600mGU;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public class LiveBottomSheetDialogFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLSogISIiZzk6LTHELIOSJiOic2LTFiBSYlLQcjPTs8JRYkLConDCwtJSA0DjctLiI2JjE=";

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.sw;
    }

    public LiveBottomSheetDialog MR() {
        return new LiveBottomSheetDialog(requireContext(), getTheme());
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
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
