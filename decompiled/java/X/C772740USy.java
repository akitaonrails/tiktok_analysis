package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;

/* JADX INFO: renamed from: X.0USy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772740USy {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamePreparationLiveQualityItem(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sdkKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", suggested=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C772740USy(PushStreamInfo.Quality quality) {
        String str = quality.name;
        String str2 = quality.desc;
        String str3 = quality.sdkKey;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
