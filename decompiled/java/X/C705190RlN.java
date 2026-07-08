package X;

import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContentV2;

/* JADX INFO: renamed from: X.0RlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705190RlN {
    public final String LIZ;
    public final StandardTagContentV2 LIZIZ;
    public final Object LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpStandardTagTemplateField(backgroundColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", headIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", actionKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C705190RlN(String str, StandardTagContentV2 standardTagContentV2, Object obj, String str2) {
        this.LIZ = str;
        this.LIZIZ = standardTagContentV2;
        this.LIZJ = obj;
        this.LIZLLL = str2;
    }
}
