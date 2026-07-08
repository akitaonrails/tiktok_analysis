package X;

import android.content.Context;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0x4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1805160x4k {
    LifecycleOwner LJJJJ();

    ViewModelStoreOwner LLIIIILZ();

    void dismiss();

    void dismissAllowingStateLoss();

    Context getContext();

    Window getWindow();

    void nD();

    DataChannel o3();

    void qK(boolean z, boolean z2);
}
