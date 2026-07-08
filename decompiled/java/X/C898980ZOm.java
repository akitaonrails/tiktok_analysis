package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898980ZOm implements C0ZRF {
    public final MessagePowerListAbility LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C898980ZOm) && Intrinsics.LJFF(this.LIZ, ((C898980ZOm) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranscribeNext(messageListAbility=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C898980ZOm(MessagePowerListAbility messagePowerListAbility) {
        this.LIZ = messagePowerListAbility;
    }
}
