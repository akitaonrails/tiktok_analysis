package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

/* JADX INFO: renamed from: X.0tQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664610tQ3 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static ViewModel LIZ(C19EG c19eg, Class cls) {
        boolean z = c19eg instanceof InterfaceC1664670tQ9;
        if (z) {
            ((InterfaceC1664670tQ9) c19eg).LLLLJI();
        }
        ViewModel viewModel = ViewModelProviders.of(c19eg).get((Class<ViewModel>) cls);
        if (z) {
            ((InterfaceC1664670tQ9) c19eg).LJJIL();
        }
        return viewModel;
    }
}
