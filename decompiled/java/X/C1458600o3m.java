package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0o3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458600o3m {
    public String LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public long LJ;
    public String LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public C1458600o3m() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicRequestData(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fatalErrorStage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requestMusicDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cacheStage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isUsedPreMusic=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hasContentEmb=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hasLocalContentEmb=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", carryLocalEmb=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1458600o3m(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = true;
        this.LIZLLL = "";
        this.LJ = 0L;
        this.LJFF = "";
        this.LJI = 0;
        this.LJII = CardStruct.IStatusCode.DEFAULT;
        this.LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
        this.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
    }
}
