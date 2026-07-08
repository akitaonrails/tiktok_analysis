package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557010qcV implements InterfaceC1557060qca {
    public final List<IMContact> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557010qcV)) {
            return false;
        }
        C1557010qcV c1557010qcV = (C1557010qcV) obj;
        return Intrinsics.LJFF(this.LIZ, c1557010qcV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557010qcV.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Complete(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1557010qcV(List<? extends IMContact> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
