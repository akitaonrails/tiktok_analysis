package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1086350eNN {
    void LIZIZ(Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3);

    void LIZJ(DataChannel dataChannel, Function0<Unit> function0);

    void clear();

    ViewGroup.LayoutParams getLayoutParams();

    float getOthersLikeAnimationDistanceRatio();

    float getSelfLikeAnimationDistanceRatio();

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setVisibility(int i);
}
