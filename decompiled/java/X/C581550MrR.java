package X;

import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0MrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581550MrR {
    public static WeakReference<IBaseListFragmentPanel> LIZ;
    public static WeakReference<InterfaceC739770T0d> LIZIZ;
    public static final C581560MrS LIZJ = new C581560MrS();

    public static IBaseListFragmentPanel LIZ() {
        WeakReference<IBaseListFragmentPanel> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
