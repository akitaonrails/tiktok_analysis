package X;

import android.view.ViewGroup;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I15, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I15 {
    public final String LIZ;
    public final C0I16 LIZIZ;
    public final Map<String, String> LIZJ;
    public final Function1<ViewGroup, Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I15)) {
            return false;
        }
        C0I15 c0i15 = (C0I15) obj;
        return Intrinsics.LJFF(this.LIZ, c0i15.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0i15.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0i15.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0i15.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Function1<ViewGroup, Unit> function1 = this.LIZLLL;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionPanelConfig(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onPanelViewCreated=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0I15(String str, C0I16 c0i16, Map<String, String> map, Function1<? super ViewGroup, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = c0i16;
        this.LIZJ = map;
        this.LIZLLL = function1;
    }
}
