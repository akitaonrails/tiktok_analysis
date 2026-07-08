package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586100Mym implements IEvent {
    public final Aweme LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C586100Mym)) {
            return false;
        }
        C586100Mym c586100Mym = (C586100Mym) obj;
        return Intrinsics.LJFF(this.LIZ, c586100Mym.LIZ) && this.LIZIZ == c586100Mym.LIZIZ && Intrinsics.LJFF(this.LIZJ, c586100Mym.LIZJ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((((aweme == null ? 0 : aweme.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("DiggLocalEvent(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLike=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C586100Mym(Aweme aweme, String str, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
