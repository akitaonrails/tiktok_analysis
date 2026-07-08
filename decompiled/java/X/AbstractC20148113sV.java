package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManagerImpl;

/* JADX INFO: renamed from: X.13sV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20148113sV {
    public abstract void LIZ(int i);

    public abstract <D> C20147913sT<D> LIZJ(int i, Bundle bundle, InterfaceC20148313sX<D> interfaceC20148313sX);

    public static LoaderManagerImpl LIZIZ(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }
}
