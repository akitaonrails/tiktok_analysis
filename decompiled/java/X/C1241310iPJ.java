package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241310iPJ implements InterfaceC1891350zJl {
    public final C0Y8T LL;
    public final boolean LLILLJJLI;
    public final EnumC1241340iPM LLILLL;
    public final Map<String, String> LLILZ;

    public C1241310iPJ() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchGroupItem(conversation=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needDelete=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        C1241310iPJ c1241310iPJ;
        if (obj instanceof C1241310iPJ) {
            c1241310iPJ = (C1241310iPJ) obj;
        } else {
            c1241310iPJ = null;
        }
        if (c1241310iPJ == null || !Intrinsics.LJFF(c1241310iPJ.LL.getConversationId(), c1241310iPJ.LL.getConversationId()) || c1241310iPJ.LLILLJJLI != this.LLILLJJLI || c1241310iPJ.LLILLL != this.LLILLL) {
            return false;
        }
        return true;
    }

    public C1241310iPJ(C0Y8T c0y8t, boolean z, EnumC1241340iPM enumC1241340iPM, int i) {
        LinkedHashMap linkedHashMap;
        z = (i & 2) != 0 ? false : z;
        if ((i & 8) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        this.LL = c0y8t;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1241340iPM;
        this.LLILZ = linkedHashMap;
    }
}
