package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.037D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037D implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C037D)) {
            return false;
        }
        C037D c037d = (C037D) obj;
        return Intrinsics.LJFF(this.LIZ, c037d.LIZ) && Intrinsics.LJFF(this.LIZIZ, c037d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c037d.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c037d.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcVoucherOpenShopBagEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lynxSchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C037D(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
    }
}
