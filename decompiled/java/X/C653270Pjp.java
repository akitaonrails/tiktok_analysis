package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653270Pjp {
    public final View LIZ;
    public InterfaceC653170Pjf LIZJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(414));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(415));
    public final Rect LJ = new Rect(0, 0, 0, 0);
    public final Rect LJFF = new Rect(0, 0, 0, 0);

    public C653270Pjp(View view) {
        this.LIZ = view;
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        ((Rect) this.LIZIZ.getValue()).set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f + f3))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f2 + f4))));
    }
}
