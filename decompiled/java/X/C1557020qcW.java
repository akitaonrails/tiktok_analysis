package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557020qcW extends AbstractC1557040qcY {
    public final List<IMContact> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1557020qcW) && Intrinsics.LJFF(this.LIZIZ, ((C1557020qcW) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded(contacts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1557040qcY
    public final List<IMContact> LIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1557020qcW(List<? extends IMContact> list) {
        super(list);
        this.LIZIZ = list;
    }
}
