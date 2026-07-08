package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedCenterRecallAreaGroup;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C297201De implements Serializable, InterfaceC2753014t {
    public final List<PoiFeedCenterRecallAreaGroup> LL;

    public final C297201De copy(List<PoiFeedCenterRecallAreaGroup> list) {
        return new C297201De(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C297201De) && Intrinsics.LJFF(this.LL, ((C297201De) obj).LL);
    }

    public String getSourceId() {
        return "MapDetailAreaFilterData";
    }

    public int hashCode() {
        List<PoiFeedCenterRecallAreaGroup> list = this.LL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapDetailAreaFilterData(recallAreaGroup=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<PoiFeedCenterRecallAreaGroup> getRecallAreaGroup() {
        return this.LL;
    }

    public C297201De(List<PoiFeedCenterRecallAreaGroup> list) {
        this.LL = list;
    }
}
