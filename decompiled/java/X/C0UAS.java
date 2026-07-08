package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UAS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UAS implements C0UAN {
    public static final C0UAS LIZ = new C0UAS();
    public static String LIZIZ;
    public static C0UAY LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0U86, X.0UAY] */
    public static final void LIZIZ() {
        ?? r1 = new C0U86() { // from class: X.0UAY
            @Override // X.C0U86
            public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
                Intrinsics.LJFF(str, C0UD4.LIZIZ);
            }
        };
        C0UA1.LIZ().Dr(r1);
        LIZJ = r1;
    }

    public static LiveEffect LIZ(List list) {
        Object obj = null;
        if (LIZIZ == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), LIZIZ)) {
                obj = next;
                break;
            }
        }
        return (LiveEffect) obj;
    }
}
