package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ActionEntryDoc;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.EntryDoc;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321240CiY {
    public final String LIZ;
    public final Message LIZIZ;
    public final String LIZJ;
    public final InterfaceC320970Ci7 LIZLLL;
    public final String LJ;
    public final EntryDoc LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C321240CiY() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321240CiY)) {
            return false;
        }
        C321240CiY c321240CiY = (C321240CiY) obj;
        return Intrinsics.LJFF(this.LIZ, c321240CiY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c321240CiY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321240CiY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c321240CiY.LIZLLL) && Intrinsics.LJFF(this.LJ, c321240CiY.LJ) && Intrinsics.LJFF(this.LJFF, c321240CiY.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Message message = this.LIZIZ;
        int iHashCode2 = (iHashCode + (message == null ? 0 : message.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC320970Ci7 interfaceC320970Ci7 = this.LIZLLL;
        return ((((iHashCode3 + (interfaceC320970Ci7 != null ? interfaceC320970Ci7.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateCommonInfo(logId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", answerMessageId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commerceAgentSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", entryDoc=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C321240CiY(InterfaceC320970Ci7 interfaceC320970Ci7, String str, int i) {
        String str2;
        InterfaceC320970Ci7 interfaceC320970Ci72 = interfaceC320970Ci7;
        if ((i & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str2, null, null, (i & 8) != 0 ? null : interfaceC320970Ci72, (i & 16) == 0 ? str : "", (i & 32) != 0 ? new EntryDoc("", new ActionEntryDoc(null, 1, null), "", new HashMap(), 0.0f, 0L, "", "", "", "", "", "", "", null, null, null) : null);
    }

    public static C321240CiY LIZ(C321240CiY c321240CiY, String str, Message message, String str2, int i) {
        InterfaceC320970Ci7 interfaceC320970Ci7;
        String str3;
        String str4 = str2;
        Message message2 = message;
        String str5 = str;
        if ((i & 1) != 0) {
            str5 = c321240CiY.LIZ;
        }
        if ((i & 2) != 0) {
            message2 = c321240CiY.LIZIZ;
        }
        if ((i & 4) != 0) {
            str4 = c321240CiY.LIZJ;
        }
        EntryDoc entryDoc = null;
        if ((i & 8) != 0) {
            interfaceC320970Ci7 = c321240CiY.LIZLLL;
        } else {
            interfaceC320970Ci7 = null;
        }
        if ((i & 16) != 0) {
            str3 = c321240CiY.LJ;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            entryDoc = c321240CiY.LJFF;
        }
        return new C321240CiY(str5, message2, str4, interfaceC320970Ci7, str3, entryDoc);
    }

    public C321240CiY(String str, Message message, String str2, InterfaceC320970Ci7 interfaceC320970Ci7, String str3, EntryDoc entryDoc) {
        this.LIZ = str;
        this.LIZIZ = message;
        this.LIZJ = str2;
        this.LIZLLL = interfaceC320970Ci7;
        this.LJ = str3;
        this.LJFF = entryDoc;
    }
}
