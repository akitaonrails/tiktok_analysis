package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19310810gk {
    public static C19310610gi LIZ(boolean z, ViewGroup viewGroup, boolean z2, SignupViewModel signupViewModel, EnumC19310710gj enumC19310710gj, String str, String str2) {
        int i;
        if (z) {
            i = R.layout.z6;
        } else {
            i = R.layout.z5;
        }
        return new C19310610gi(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false), z2, enumC19310710gj, str, str2, signupViewModel);
    }
}
