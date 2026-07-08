package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862170yYh extends C1862240yYo {
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public List<BaseImage> LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;
    public Map<String, String> LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoChainContext(sendType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", keyWord=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userIntent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
