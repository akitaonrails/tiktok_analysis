package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0STp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class SharedElementCallbackC721950STp extends SharedElementCallback {
    public final Function2<List<String>, Map<String, View>, Unit> LIZ;

    public SharedElementCallbackC721950STp(Function2 function2) {
        this.LIZ = function2;
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List<View> list) {
        super.onRejectSharedElements(list);
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        return super.onCreateSnapshotView(context, parcelable);
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        Function2<List<String>, Map<String, View>, Unit> function2 = this.LIZ;
        if (function2 != null) {
            function2.invoke(list, map);
        }
        super.onMapSharedElements(list, map);
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        super.onSharedElementEnd(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        super.onSharedElementStart(list, list2, list3);
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
    }
}
