package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0NHH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHH {
    public final C0N9C LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Aweme LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;
    public final Object LJII;
    public final float LJIIIIZZ;
    public final String LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonCacheItem(providerType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', aweme=");
        Aweme aweme = this.LIZLLL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append('-');
        Aweme aweme2 = this.LIZLLL;
        sbLIZ.append(aweme2 != null ? aweme2.getDesc() : null);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shelfLifeMS=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", creationDateTS=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", originEntity=");
        Object obj = this.LJII;
        sbLIZ.append(obj != null ? obj.getClass().getSimpleName() : null);
        sbLIZ.append(", sortScore=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", sortSnapshot='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("'})");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0NHH(C0N9C c0n9c, String str, String str2, Aweme aweme, String str3, long j, long j2, Object obj) {
        this(c0n9c, str, str2, aweme, str3, j, j2, obj, 0.0f, "");
    }

    public C0NHH(C0N9C c0n9c, String str, String str2, Aweme aweme, String str3, long j, long j2, Object obj, float f, String str4) {
        this.LIZ = c0n9c;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = aweme;
        this.LJ = str3;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = obj;
        this.LJIIIIZZ = f;
        this.LJIIIZ = str4;
    }
}
