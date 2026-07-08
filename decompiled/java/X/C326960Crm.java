package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import defpackage.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326960Crm implements InterfaceC1858000yRy {
    public final k9 LL;
    public final TakoSug LLILLJJLI;
    public final Message LLILLL;
    public final int LLILZ;
    public int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326960Crm)) {
            return false;
        }
        C326960Crm c326960Crm = (C326960Crm) obj;
        return Intrinsics.LJFF(this.LL, c326960Crm.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326960Crm.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c326960Crm.LLILLL);
    }

    public final int hashCode() {
        k9 k9Var = this.LL;
        int iHashCode = (((k9Var == null ? 0 : k9Var.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        Message message = this.LLILLL;
        return iHashCode + (message != null ? message.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerSug(commonInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sugs=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fromMessage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return String.valueOf(this.LLILZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILZIL = i;
    }

    public C326960Crm(k9 k9Var, TakoSug takoSug, Message message) {
        this.LL = k9Var;
        this.LLILLJJLI = takoSug;
        this.LLILLL = message;
        this.LLILZ = C321460Ciu.LIZ();
        this.LLILZIL = C1919107fR.LIZ();
    }

    public /* synthetic */ C326960Crm(k9 k9Var, TakoSug takoSug, Message message, int i) {
        this((i & 1) != 0 ? null : k9Var, takoSug, (i & 4) != 0 ? null : message);
    }
}
