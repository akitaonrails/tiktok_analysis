package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1O implements IEvent {
    public final BaseShortVideoContext LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I1O)) {
            return false;
        }
        C0I1O c0i1o = (C0I1O) obj;
        return Intrinsics.LJFF(this.LIZ, c0i1o.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i1o.LIZIZ);
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
        sbLIZ.append("BulletinMediaPublishEvent(editModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I1O(VideoPublishEditModel videoPublishEditModel, Map map) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = map;
    }
}
