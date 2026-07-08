package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2041507zB implements IEvent {
    public final String LIZ;
    public final List<Aweme> LIZIZ;
    public final String LIZJ;

    public C2041507zB() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2041507zB)) {
            return false;
        }
        C2041507zB c2041507zB = (C2041507zB) obj;
        return Intrinsics.LJFF(this.LIZ, c2041507zB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2041507zB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2041507zB.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Aweme> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
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
        sbLIZ.append("SearchBrandZoneAwemeListMergeEvent(awemeIdTarget=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterAwemeCacheKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2041507zB(String str, List<? extends Aweme> list, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
    }
}
