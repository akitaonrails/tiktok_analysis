package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IJR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJR {
    public static DataChannel LIZ(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        DataChannel dataChannel = (DataChannel) viewModelProvider.get(DataChannel.class);
        dataChannel.LLILZ = lifecycleOwner;
        return dataChannel;
    }
}
