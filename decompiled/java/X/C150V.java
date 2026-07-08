package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.150V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150V {
    public static final C150U LIZIZ = new C150U();
    public static volatile C150V LIZJ;
    public final WeakHashMap<Context, WeakReference<NativePreloadController>> LIZ = new WeakHashMap<>();

    public final NativePreloadController LIZ(Context context) {
        NativePreloadController nativePreloadController;
        C19719612Di.LJJIII(this.LIZ.entrySet(), AnonymousClass0207.get$arr$(148), false);
        WeakReference<NativePreloadController> weakReference = this.LIZ.get(context);
        if (weakReference == null || (nativePreloadController = weakReference.get()) == null) {
            NativePreloadController nativePreloadController2 = new NativePreloadController(context);
            this.LIZ.put(context, new WeakReference<>(nativePreloadController2));
            return nativePreloadController2;
        }
        return nativePreloadController;
    }
}
