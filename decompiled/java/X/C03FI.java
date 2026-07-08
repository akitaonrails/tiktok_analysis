package X;

import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03FI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FI {
    public static final /* synthetic */ int LIZIZ = 0;
    public final HashSet<String> LIZ = new HashSet<>();

    public final void LIZ(String str, Function0<Unit> function0) {
        if (this.LIZ.contains(str)) {
            return;
        }
        this.LIZ.add(str);
        function0.invoke();
    }
}
