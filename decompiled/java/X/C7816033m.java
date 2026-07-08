package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7816033m implements IEvent {
    public final List<Aweme> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7816033m)) {
            return false;
        }
        C7816033m c7816033m = (C7816033m) obj;
        return Intrinsics.LJFF(this.LIZ, c7816033m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7816033m.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
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
        sbLIZ.append("HotSpotAwemeListMergeEvent(awemeList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeIdTarget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7816033m(List<? extends Aweme> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
