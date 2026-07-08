package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RYC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RYC<T extends PriorityProtocol> {
    public final T LIZ;
    public final Function2<T, Boolean, Unit> LIZIZ;
    public final Boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(457));

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityProtocolData(priority=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", finish=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needPending=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MutableLiveData<Boolean> LIZ() {
        return (MutableLiveData) this.LIZLLL.getValue();
    }

    public final boolean equals(Object obj) {
        C0RYC c0ryc;
        T t = this.LIZ;
        T t2 = null;
        if ((obj instanceof C0RYC) && (c0ryc = (C0RYC) obj) != null) {
            t2 = c0ryc.LIZ;
        }
        return Intrinsics.LJFF(t, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0RYC(T t, Function2<? super T, ? super Boolean, Unit> function2, Boolean bool) {
        this.LIZ = t;
        this.LIZIZ = function2;
        this.LIZJ = bool;
    }
}
