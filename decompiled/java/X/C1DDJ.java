package X;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.1DDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDJ extends C09AY implements Function0<C1DDG> {
    public C1DDJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DDG] */
    @Override // kotlin.jvm.functions.Function0
    public final C1DDG invoke() {
        return new InterfaceC20673715v5<C1DDI>() { // from class: X.1DDG
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20673715v5
            public final void LIZ(C20673615v4 c20673615v4) {
                T t = c20673615v4.LIZIZ;
                C1DD7 c1dd7 = ((C1DDI) t).LIZJ;
                View view = ((C1DDI) t).LIZIZ;
                if (view != null) {
                    c1dd7.LIZIZ = view.getHeight();
                    c1dd7.LIZ = view.getWidth();
                    c1dd7.LIZJ = view.getResources().getDisplayMetrics().densityDpi;
                    c1dd7.LIZLLL = view.getResources().getDisplayMetrics().density;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1dd7.LIZIZ);
                    sbLIZ.append('*');
                    sbLIZ.append(c1dd7.LIZ);
                    c1dd7.LJ = C2188811AlT.LIZIZ(sbLIZ);
                    new C0RL3(c1dd7);
                    C0T6L.LIZLLL();
                    if (c1dd7.LIZIZ > 0 && c1dd7.LIZ > 0) {
                        c20673615v4.LIZ();
                        return;
                    }
                }
                Activity activity = ((C1DDI) c20673615v4.LIZIZ).LIZ;
                if (activity != null) {
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    c1dd7.LIZIZ = displayMetrics.heightPixels;
                    c1dd7.LIZ = displayMetrics.widthPixels;
                    c1dd7.LIZJ = displayMetrics.densityDpi;
                    c1dd7.LIZLLL = displayMetrics.density;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c1dd7.LIZIZ);
                    sbLIZ2.append('*');
                    sbLIZ2.append(c1dd7.LIZ);
                    c1dd7.LJ = C2188811AlT.LIZIZ(sbLIZ2);
                    new AwS555S0100000_11(c1dd7, 1458);
                    C0T6L.LIZLLL();
                    if (c1dd7.LIZIZ > 0 && c1dd7.LIZ > 0) {
                        c20673615v4.LIZ();
                    }
                }
            }
        };
    }
}
