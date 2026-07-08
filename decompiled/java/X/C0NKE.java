package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NKE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NKE implements IEvent {
    public final AddYoursTopic LIZ;
    public final EnumC615090OAp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NKE)) {
            return false;
        }
        C0NKE c0nke = (C0NKE) obj;
        return Intrinsics.LJFF(this.LIZ, c0nke.LIZ) && this.LIZIZ == c0nke.LIZIZ;
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
        sbLIZ.append("TopicUpdatedEvent(topic=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NKE(AddYoursTopic addYoursTopic, EnumC615090OAp enumC615090OAp) {
        this.LIZ = addYoursTopic;
        this.LIZIZ = enumC615090OAp;
    }
}
