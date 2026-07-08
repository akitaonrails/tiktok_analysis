package X;

import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C700450Rdj {
    public final Function2<String, C2344009Gk, Unit> LIZ;
    public final Function2<String, View, Map<String, String>> LIZIZ;
    public final Function0<Map<String, String>> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C700450Rdj(Function2<? super String, ? super C2344009Gk, Unit> function2, Function2<? super String, ? super View, ? extends Map<String, String>> function22, Function0<? extends Map<String, String>> function0) {
        this.LIZ = function2;
        this.LIZIZ = function22;
        this.LIZJ = function0;
    }

    public /* synthetic */ C700450Rdj(Function2 function2, Function2 function22, Function0 function0, int i) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function22, (i & 4) != 0 ? null : function0);
    }
}
