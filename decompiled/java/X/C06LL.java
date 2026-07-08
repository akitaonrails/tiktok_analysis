package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.06LL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06LL {
    <T extends ViewModel> T getActivityViewModel(Class<T> cls, ViewModelProvider.Factory factory);

    <T extends ViewModel> T getFragmentViewModel(Class<T> cls, ViewModelProvider.Factory factory);
}
