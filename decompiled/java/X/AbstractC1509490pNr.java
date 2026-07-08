package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1509490pNr extends MemoryFeatureInfo {
    public static final ConcurrentHashMap<String, AbstractC1509490pNr> LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public final String LIZ;
    public int LIZIZ;
    public String LIZJ;
    public long LJ;
    public int LJI;
    public String LIZLLL = "";
    public String LJFF = "";

    public Aweme LIZ() {
        return null;
    }

    public void LIZIZ(Aweme aweme) {
    }

    public void LIZJ(String str, boolean z) {
    }

    static {
        new C1509480pNq();
        LJII = new ConcurrentHashMap<>(16);
        LJIIJ = 64;
        LJIIJJI = 8;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed(aidKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" requestId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" begin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" isStartLoadmore=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" fromActionType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1509490pNr(String str) {
        this.LIZ = str;
        new ArrayList(8);
    }
}
