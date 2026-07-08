package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035D implements IEvent {
    public final Aweme LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C035D)) {
            return false;
        }
        C035D c035d = (C035D) obj;
        return Intrinsics.LJFF(this.LIZ, c035d.LIZ) && Float.compare(this.LIZIZ, c035d.LIZIZ) == 0;
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
        sbLIZ.append("TaskPlayerProgressEvent(aweme=");
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

    public C035D(float f, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = f;
    }
}
