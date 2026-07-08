package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526670Kl7 {
    public final TemplateConsumeCoreParam LIZ;
    public final Activity LIZIZ;
    public final ShortVideoContext LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526670Kl7)) {
            return false;
        }
        C526670Kl7 c526670Kl7 = (C526670Kl7) obj;
        return Intrinsics.LJFF(this.LIZ, c526670Kl7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c526670Kl7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c526670Kl7.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        ShortVideoContext shortVideoContext = this.LIZJ;
        return iHashCode + (shortVideoContext == null ? 0 : shortVideoContext.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LaunchMediaSelectionIn(coreParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", svc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526670Kl7(TemplateConsumeCoreParam templateConsumeCoreParam, Activity activity, ShortVideoContext shortVideoContext) {
        this.LIZ = templateConsumeCoreParam;
        this.LIZIZ = activity;
        this.LIZJ = shortVideoContext;
    }
}
