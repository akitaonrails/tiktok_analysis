package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526790KlJ {
    public final TemplateConsumeCoreParam LIZ;
    public final Activity LIZIZ;
    public final ShortVideoContext LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526790KlJ)) {
            return false;
        }
        C526790KlJ c526790KlJ = (C526790KlJ) obj;
        return Intrinsics.LJFF(this.LIZ, c526790KlJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c526790KlJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c526790KlJ.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        ShortVideoContext shortVideoContext = this.LIZJ;
        return iHashCode + (shortVideoContext == null ? 0 : shortVideoContext.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefetchMusicIn(coreParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", svc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526790KlJ(TemplateConsumeCoreParam templateConsumeCoreParam, Activity activity, ShortVideoContext shortVideoContext) {
        this.LIZ = templateConsumeCoreParam;
        this.LIZIZ = activity;
        this.LIZJ = shortVideoContext;
    }
}
