package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0ULX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0ULX {
    void LJZI(View view, Function0<Unit> function0);

    boolean LLZLLLL(int i, Object obj);

    boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent);

    View getBannerView();

    void onDetach();

    void onHide();

    void onPause();

    void onResume();

    void onShow();

    void setOnCloseClickListener(View.OnClickListener onClickListener);
}
