package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531670KtB {
    public final TemplateConsumeCoreParam LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531670KtB)) {
            return false;
        }
        C531670KtB c531670KtB = (C531670KtB) obj;
        return Intrinsics.LJFF(this.LIZ, c531670KtB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c531670KtB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefillIn(coreParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nleSummary=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531670KtB(TemplateConsumeCoreParam templateConsumeCoreParam, String str) {
        this.LIZ = templateConsumeCoreParam;
        this.LIZIZ = str;
    }
}
