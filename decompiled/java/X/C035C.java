package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035C implements IEvent {
    public final Aweme LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C035C)) {
            return false;
        }
        C035C c035c = (C035C) obj;
        return Intrinsics.LJFF(this.LIZ, c035c.LIZ) && Float.compare(this.LIZIZ, c035c.LIZIZ) == 0;
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
        sbLIZ.append("LiveTaskPlayerProgressEvent(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C035C(float f, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = f;
    }
}
