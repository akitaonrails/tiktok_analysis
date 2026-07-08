package X;

import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0dKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046180dKa {
    public static final C1046180dKa LIZLLL = new C1046180dKa();
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), new C1046200dKc(CoroutineExceptionHandler.LJJLIL)));
    public final Map<Integer, String> LIZJ = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:52:0x016a, B:54:0x01a8, B:56:0x01b4, B:58:0x01ca, B:60:0x01ce, B:61:0x01d0, B:67:0x01dc, B:69:0x01e2, B:74:0x0201, B:71:0x01e8, B:73:0x01fe), top: B:89:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fe A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:52:0x016a, B:54:0x01a8, B:56:0x01b4, B:58:0x01ca, B:60:0x01ce, B:61:0x01d0, B:67:0x01dc, B:69:0x01e2, B:74:0x0201, B:71:0x01e8, B:73:0x01fe), top: B:89:0x016a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.View r31, java.util.HashSet r32, X.C1046220dKe r33, X.InterfaceC1046170dKZ r34) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1046180dKa.LIZJ(android.view.View, java.util.HashSet, X.0dKe, X.0dKZ):void");
    }

    public final void LIZLLL(View view, HashSet<String> hashSet, C1046110dKT c1046110dKT, Rect rect, C1046220dKe c1046220dKe) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && LIZ(childAt, hashSet, c1046110dKT, rect, c1046220dKe, null)) {
                LIZLLL(childAt, hashSet, c1046110dKT, rect, c1046220dKe);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.view.View r13, java.util.HashSet<java.lang.String> r14, X.C1046110dKT r15, android.graphics.Rect r16, X.C1046220dKe r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1046180dKa.LIZ(android.view.View, java.util.HashSet, X.0dKT, android.graphics.Rect, X.0dKe, android.view.View):boolean");
    }
}
