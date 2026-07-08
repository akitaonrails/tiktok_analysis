package X;

import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;

/* JADX INFO: renamed from: X.0q5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536580q5Y {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final SparkI18nManager.Meta LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadResponse(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hitCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastUpdate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", langTag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", meta=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cdnUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1536580q5Y(String str, boolean z, long j, String str2, SparkI18nManager.Meta meta, String str3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = meta;
        this.LJFF = str3;
    }
}
