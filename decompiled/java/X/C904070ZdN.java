package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904070ZdN implements InterfaceC904130ZdT {
    public final MessageReactionsState.ReactionList.ReactionListData LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C904070ZdN)) {
            return false;
        }
        C904070ZdN c904070ZdN = (C904070ZdN) obj;
        return Intrinsics.LJFF(this.LIZ, c904070ZdN.LIZ) && this.LIZIZ == c904070ZdN.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reaction(reaction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bounceAnimate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C904070ZdN(MessageReactionsState.ReactionList.ReactionListData reactionListData, boolean z) {
        this.LIZ = reactionListData;
        this.LIZIZ = z;
    }
}
