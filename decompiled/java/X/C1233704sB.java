package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04sB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1233704sB implements InterfaceC460300I3g {
    public final int LIZIZ;
    public final List<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1233704sB)) {
            return false;
        }
        C1233704sB c1233704sB = (C1233704sB) obj;
        return this.LIZIZ == c1233704sB.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1233704sB.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZIZ * 31;
        List<String> list = this.LIZJ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrRes(txtRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resArgs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1233704sB(int i, String str) {
        List listSingletonList;
        if (str == null) {
            listSingletonList = null;
        } else {
            listSingletonList = Collections.singletonList(str);
        }
        this(i, (List<String>) listSingletonList);
    }

    public C1233704sB(int i, List<String> list) {
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}
