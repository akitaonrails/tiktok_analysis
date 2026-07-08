package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.BaseSheet;

/* JADX INFO: renamed from: X.0K19, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K19 {
    public static final void LIZ(FragmentManager fragmentManager, BaseSheet baseSheet, String str, Bundle bundle) {
        if (fragmentManager == null) {
            return;
        }
        Bundle arguments = baseSheet.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundle);
        }
        baseSheet.setArguments(arguments);
        baseSheet.show(fragmentManager, str);
    }
}
