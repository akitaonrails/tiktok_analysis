package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.d8;
import defpackage.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326880Cre implements InterfaceC1858000yRy {
    public final k9 LL;
    public final C326890Crf LLILLJJLI;
    public final Message LLILLL;
    public int LLILZ;
    public final d8 LLILZIL;
    public int LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326880Cre)) {
            return false;
        }
        C326880Cre c326880Cre = (C326880Cre) obj;
        return Intrinsics.LJFF(this.LL, c326880Cre.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326880Cre.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c326880Cre.LLILLL) && this.LLILZ == c326880Cre.LLILZ && Intrinsics.LJFF(this.LLILZIL, c326880Cre.LLILZIL);
    }

    public final int hashCode() {
        k9 k9Var = this.LL;
        int iHashCode = (((((((k9Var == null ? 0 : k9Var.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31;
        d8 d8Var = this.LLILZIL;
        return iHashCode + (d8Var != null ? d8Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerMessage(commonInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bubbleLayoutStyle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", retryMessageConfig=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1858000yRy
    public final String retrieveIncrementalId() {
        return this.LLILLL.uuid;
    }

    @Override // X.InterfaceC1858000yRy
    public final int getMessageTopMargin() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1858000yRy
    public final void setMessageTopMargin(int i) {
        this.LLILZLL = i;
    }

    public C326880Cre(k9 k9Var, Message message, d8 d8Var, int i) {
        C326890Crf c326890Crf;
        k9Var = (i & 1) != 0 ? null : k9Var;
        if ((i & 2) != 0) {
            c326890Crf = new C326890Crf(0);
        } else {
            c326890Crf = null;
        }
        d8Var = (i & 16) != 0 ? null : d8Var;
        this.LL = k9Var;
        this.LLILLJJLI = c326890Crf;
        this.LLILLL = message;
        this.LLILZ = 0;
        this.LLILZIL = d8Var;
        this.LLILZLL = C1919107fR.LIZ();
    }
}
