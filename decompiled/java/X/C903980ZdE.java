package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903980ZdE implements InterfaceC904000ZdG {
    public final InterfaceC879330YeZ LIZ;
    public final View LIZIZ;
    public final MessageReactionsState LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903980ZdE)) {
            return false;
        }
        C903980ZdE c903980ZdE = (C903980ZdE) obj;
        return Intrinsics.LJFF(this.LIZ, c903980ZdE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c903980ZdE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c903980ZdE.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Yes(pendingReaction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previousState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C903980ZdE(InterfaceC879330YeZ interfaceC879330YeZ, View view, MessageReactionsState messageReactionsState) {
        this.LIZ = interfaceC879330YeZ;
        this.LIZIZ = view;
        this.LIZJ = messageReactionsState;
    }
}
