package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0L8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538060L8i {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(564));

    public final void LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateMediaCompressCache put: originalPath=");
        sbLIZ.append(str);
        sbLIZ.append(", compressPath=");
        sbLIZ.append(str2);
        C381530Exb.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((Keva) this.LIZ.getValue()).storeString(str, str2);
    }
}
