package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0U9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767780U9w implements C0UAJ {
    public static final C767780U9w LIZ = new C767780U9w();
    public static final Set<String> LIZIZ;
    public static final Set<C0UA7> LIZJ;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZIZ = linkedHashSet;
        LIZJ = new LinkedHashSet();
        linkedHashSet.addAll(InterfaceC766480U4w.LJJJJ.LIZIZ());
    }

    public static final void LIZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return;
        }
        String resourceId = liveEffect.getResourceId();
        if (resourceId != null) {
            Set<String> set = LIZIZ;
            set.add(resourceId);
            C20337914i1<Set<String>> c20337914i1 = InterfaceC766480U4w.LJJJJ;
            c20337914i1.LJFF(set);
            c20337914i1.LIZJ();
        }
        Iterator<C0UA7> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(liveEffect);
        }
    }

    public static boolean LIZIZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        return LIZIZ.contains(liveEffect.getResourceId());
    }
}
