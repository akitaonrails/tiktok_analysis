package X;

import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C82, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C82 {
    public static final void LIZ(Function0<Unit> function0, Function0<Unit> function02) {
        boolean z;
        if (!AwemeConfigCenter.LIZIZ()) {
            function0.invoke();
            return;
        }
        C01GW c01gw = C261270ALt.LIZ;
        if ((((Number) c01gw.getValue()).intValue() & 1) == 1) {
            function0.invoke();
            z = false;
        } else {
            z = true;
        }
        if ((((Number) c01gw.getValue()).intValue() & 2) == 2 && C806950Vl7.LIZIZ.LJIIIZ()) {
            function02.invoke();
        } else {
            if (!z) {
                return;
            }
            function0.invoke();
        }
    }
}
