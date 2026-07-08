package X;

import android.app.Activity;
import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174051A6p extends C09AY implements Function0<Activity.ScreenCaptureCallback> {
    public final /* synthetic */ C2174021A6m LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174051A6p(C2174021A6m c2174021A6m) {
        super(0);
        this.LL = c2174021A6m;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Activity.ScreenCaptureCallback invoke() {
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        final C2174021A6m c2174021A6m = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.1A6q
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                c2174021A6m.LIZ();
            }
        };
    }
}
