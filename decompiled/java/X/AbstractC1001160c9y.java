package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1001160c9y<KEY, STORE_TYPE> {
    public final Function1<KEY, STORE_TYPE> LIZ;
    public final Function1<STORE_TYPE, KEY> LIZIZ;
    public final Map<Class<? extends KEY>, STORE_TYPE> LIZJ = new LinkedHashMap();

    public AbstractC1001160c9y(Function1 function1, Function1 function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
