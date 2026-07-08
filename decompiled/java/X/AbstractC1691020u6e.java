package X;

import X.InterfaceC1691090u6l;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1691020u6e<Interval extends InterfaceC1691090u6l> {
    public abstract C1691060u6i LJFF();

    public final Object LJI(int i) {
        Object objInvoke;
        C1691050u6h c1691050u6hLIZJ = LJFF().LIZJ(i);
        int i2 = i - c1691050u6hLIZJ.LIZ;
        Function1<Integer, Object> key = ((InterfaceC1691090u6l) c1691050u6hLIZJ.LIZJ).getKey();
        if (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) {
            return new DefaultLazyKey(i);
        }
        return objInvoke;
    }
}
