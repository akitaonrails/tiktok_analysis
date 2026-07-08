package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2038407yg implements IEvent {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038407yg)) {
            return false;
        }
        C2038407yg c2038407yg = (C2038407yg) obj;
        return Intrinsics.LJFF(this.LIZ, c2038407yg.LIZ) && this.LIZIZ == c2038407yg.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("CommentRepostBlockClickEvent(commentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showRepostGuideTooltip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2038407yg(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
