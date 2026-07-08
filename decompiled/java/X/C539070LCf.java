package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539070LCf {
    public final String LIZ;
    public final float LIZIZ;
    public final EnumC545550LaT LIZJ;
    public final Source LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C539070LCf() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C539070LCf)) {
            return false;
        }
        C539070LCf c539070LCf = (C539070LCf) obj;
        return Intrinsics.LJFF(this.LIZ, c539070LCf.LIZ) && Float.compare(this.LIZIZ, c539070LCf.LIZIZ) == 0 && this.LIZJ == c539070LCf.LIZJ && this.LIZLLL == c539070LCf.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftOverallStatus(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C539070LCf(String str, EnumC545550LaT enumC545550LaT, int i) {
        Source source;
        str = (i & 1) != 0 ? "" : str;
        enumC545550LaT = (i & 4) != 0 ? EnumC545550LaT.NONE : enumC545550LaT;
        if ((i & 8) != 0) {
            source = Source.EDITOR_PRO;
        } else {
            source = null;
        }
        this(str, 0.0f, enumC545550LaT, source);
    }

    public C539070LCf(String str, float f, EnumC545550LaT enumC545550LaT, Source source) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = enumC545550LaT;
        this.LIZLLL = source;
    }
}
