package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0H7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435810H7b {
    public final Function2<View, C643400PLm, C643400PLm> LIZ;
    public final Function1<EnumC659500Pts, Unit> LIZIZ;

    public C435810H7b() {
        this(3, null, null);
    }

    public C435810H7b(int i, AwS589S0100000_10 awS589S0100000_10, Function2 function2) {
        function2 = (i & 1) != 0 ? null : function2;
        awS589S0100000_10 = (i & 2) != 0 ? null : awS589S0100000_10;
        this.LIZ = function2;
        this.LIZIZ = awS589S0100000_10;
    }
}
