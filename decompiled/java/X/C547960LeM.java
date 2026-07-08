package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LeM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547960LeM {
    public final EnumC1430380nKG LIZ;
    public final String LIZIZ = "";
    public final Function2<CreativeModel, String, CreateAnchorInfo> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547960LeM)) {
            return false;
        }
        C547960LeM c547960LeM = (C547960LeM) obj;
        return this.LIZ == c547960LeM.LIZ && Intrinsics.LJFF(this.LIZIZ, c547960LeM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c547960LeM.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Function2<CreativeModel, String, CreateAnchorInfo> function2 = this.LIZJ;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorConfig(anchorBusinessType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultIconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", anchorBuilder=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C547960LeM(EnumC1430380nKG enumC1430380nKG, AFwS291S0000000_8 aFwS291S0000000_8) {
        this.LIZ = enumC1430380nKG;
        this.LIZJ = aFwS291S0000000_8;
    }
}
