package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991890bv1 implements IEvent {
    public final String LIZ;
    public final C1005320cGg LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991890bv1)) {
            return false;
        }
        C991890bv1 c991890bv1 = (C991890bv1) obj;
        return Intrinsics.LJFF(this.LIZ, c991890bv1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c991890bv1.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
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
        sbLIZ.append("AnoleTapEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991890bv1(String str, C1005320cGg c1005320cGg) {
        this.LIZ = str;
        this.LIZIZ = c1005320cGg;
    }
}
