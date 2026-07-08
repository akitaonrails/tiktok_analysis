package X;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19J9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19J9 {
    public Map<String, TreeMap<Float, String>> LIZ;
    public long LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public long LJ;
    public C19JF LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ = 1;
    public JSONObject LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationModel{mKeyFramesMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mPlayCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mPlayDirection=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mDelay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mPlayState=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mTransformOrigin='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mTimingFunction='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
