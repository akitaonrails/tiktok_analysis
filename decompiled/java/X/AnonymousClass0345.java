package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0345, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public final class AnonymousClass0345 implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0345)) {
            return false;
        }
        AnonymousClass0345 anonymousClass0345 = (AnonymousClass0345) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0345.LIZ) && this.LIZIZ == anonymousClass0345.LIZIZ && this.LIZJ == anonymousClass0345.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
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
        sbLIZ.append("CollectAwemeEvent(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0345(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
