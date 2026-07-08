package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655220Pmy implements C0PWT {
    public final Function1<EnterRoomConfig, EnterRoomConfig> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C655220Pmy) && Intrinsics.LJFF(this.LL, ((C655220Pmy) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAwemeEnterRoomConfigAction(liveRoomConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C655220Pmy.class), AFwS293S0000000_10.get$arr$(81));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C655220Pmy(Function1<? super EnterRoomConfig, EnterRoomConfig> function1) {
        this.LL = function1;
    }
}
