package X;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970400bMM<T> {
    public final Function1<C970420bMO<T>, Unit> LIZ;
    public final LiveWidget LIZIZ;
    public final T LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomEnterEntranceParams(dispatchCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ownerWidget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C970400bMM(Function1<? super C970420bMO<T>, Unit> function1, LiveWidget liveWidget, T t) {
        this.LIZ = function1;
        this.LIZIZ = liveWidget;
        this.LIZJ = t;
    }
}
