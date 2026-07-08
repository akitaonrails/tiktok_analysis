package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373340lqG {
    public static final C1373370lqJ LIZ = new C1373370lqJ("", C13BV.INSTANCE);

    public static final C1373350lqH LIZ(Function1<? super C1373350lqH, Unit> function1) {
        C1373350lqH c1373350lqH = new C1373350lqH();
        function1.invoke(c1373350lqH);
        return c1373350lqH;
    }

    public static final void LIZIZ(Map<String, String> map, C1373370lqJ c1373370lqJ, String str, String str2) {
        c1373370lqJ.getClass();
        if (!Intrinsics.LJFF(c1373370lqJ, LIZ) && c1373370lqJ.LIZ.length() != 0) {
            if (c1373370lqJ.LIZ.length() > 0) {
                map.put(str, c1373370lqJ.LIZ);
            }
            if (!c1373370lqJ.LIZIZ.isEmpty()) {
                map.put(str2, GsonProtectorUtils.toJson(C09EF.LIZ, c1373370lqJ.LIZIZ));
            }
        }
    }
}
