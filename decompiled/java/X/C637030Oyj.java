package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637030Oyj {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C637030Oyj)) {
            return false;
        }
        C637030Oyj c637030Oyj = (C637030Oyj) obj;
        return Intrinsics.LJFF(this.LIZ, c637030Oyj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c637030Oyj.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateInboxBannerClickableTextConfig(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", router=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C637030Oyj(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
