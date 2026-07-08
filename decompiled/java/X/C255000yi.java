package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.00yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C255000yi {
    public final int LIZ;
    public final boolean LIZIZ;
    public final Function2<Boolean, List<BagItem>, Unit> LIZJ;

    public C255000yi(int i, boolean z, Function2 function2, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        function2 = (i2 & 4) != 0 ? AnonymousClass0208.get$arr$(1) : function2;
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = function2;
    }
}
