package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739760T0c implements IEvent {
    public final boolean LIZ = true;
    public final String LIZIZ;
    public final String LIZJ;
    public final Aweme LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C739760T0c)) {
            return false;
        }
        C739760T0c c739760T0c = (C739760T0c) obj;
        return this.LIZ == c739760T0c.LIZ && Intrinsics.LJFF(this.LIZIZ, c739760T0c.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c739760T0c.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c739760T0c.LIZLLL) && this.LJ == c739760T0c.LJ && Intrinsics.LJFF(this.LJFF, c739760T0c.LJFF);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Aweme aweme = this.LIZLLL;
        int iHashCode = (((iZ2 + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return iHashCode + (str != null ? str.hashCode() : 0);
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
        sbLIZ.append("CreateMixListInFeedEvent(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needOpenDialog=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C739760T0c(String str, String str2, Aweme aweme, boolean z, String str3) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = aweme;
        this.LJ = z;
        this.LJFF = str3;
    }
}
