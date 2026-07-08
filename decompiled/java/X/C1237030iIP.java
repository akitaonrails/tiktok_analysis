package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237030iIP {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Function1<View, Unit> LIZLLL;

    public C1237030iIP(String str, Integer num, Integer num2, Function1 function1, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        function1 = (i & 8) != 0 ? null : function1;
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = function1;
    }
}
