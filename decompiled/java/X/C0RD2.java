package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RD2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RD2<T> {
    public final int LIZ;
    public final Function0<T> LIZIZ;
    public final List<T> LIZJ = Collections.synchronizedList(new ArrayList());

    public C0RD2(int i, Function0 function0) {
        this.LIZ = i;
        this.LIZIZ = function0;
    }
}
