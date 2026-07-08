package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AwS146S1100000_32;

/* JADX INFO: renamed from: X.18KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KJ {
    public static final C18KJ LIZ = new C18KJ();
    public static final WeakHashMap<Object, String> LIZIZ = new WeakHashMap<>();
    public static final WeakHashMap<Object, String> LIZJ = new WeakHashMap<>();
    public static final WeakHashMap<String, C18K7> LIZLLL = new WeakHashMap<>();
    public static final C18KS LJ = new C18KS();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        FcpComponentTracker tracker;
        C18KG c18kg = C18KG.LIZ;
        C259800zU c259800zU = new C259800zU();
        c18kg.LIZJ().doLoop(new AwS146S1100000_32(c259800zU, 12));
        FcpPageNode fcpPageNode = (FcpPageNode) c259800zU.element;
        if (fcpPageNode == null || (tracker = fcpPageNode.getTracker()) == null) {
            return;
        }
        tracker.markPositive("jump_app");
    }
}
