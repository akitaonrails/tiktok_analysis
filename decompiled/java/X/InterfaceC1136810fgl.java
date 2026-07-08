package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1136810fgl extends LifecycleOwner {
    View getContentView();

    DataChannel getDataChannel();

    int getGiftType();

    int getShowErrorToast();

    void onShowVideoError(C1135280feI c1135280feI);

    void onVideoFinished();

    void stopVideoPlay();
}
