package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0t6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652680t6o {
    public final View LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public static C1652680t6o LIZ(C1652680t6o c1652680t6o, View view) {
        boolean z = c1652680t6o.LIZIZ;
        boolean z2 = c1652680t6o.LIZJ;
        Function0<Unit> function0 = c1652680t6o.LIZLLL;
        Function0<Unit> function02 = c1652680t6o.LJ;
        c1652680t6o.getClass();
        return new C1652680t6o(view, z, z2, function0, function02);
    }

    public /* synthetic */ C1652680t6o(View view, Function0 function0, Function0 function02, int i) {
        this((i & 1) != 0 ? null : view, false, false, function0, function02);
    }

    public C1652680t6o(View view, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = function0;
        this.LJ = function02;
    }
}
