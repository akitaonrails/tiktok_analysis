package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656680PpK {
    public static final HashMap<Integer, EnumC656690PpL> LIZ = new HashMap<>();

    public static final void LIZ(View view, EnumC656690PpL enumC656690PpL, Function1<? super View, Unit> function1) {
        C786410Ut5.I7(new ACListenerS145S0100000_10(function1, 99), view);
        LIZ.put(Integer.valueOf(view.getId()), enumC656690PpL);
    }
}
