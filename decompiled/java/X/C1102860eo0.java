package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.toolbar.TBViewModel;

/* JADX INFO: renamed from: X.0eo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102860eo0 {
    public static TBViewModel LIZ(EnumC1102740eno enumC1102740eno, Fragment fragment) {
        return (TBViewModel) ViewModelProviders.of(fragment).get(enumC1102740eno.name(), TBViewModel.class);
    }
}
