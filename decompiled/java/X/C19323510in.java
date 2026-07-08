package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushLocalCheckExp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10in, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19323510in extends C07KW {
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final InnerPushConfig LJI;
    public final InnerPushUITemplate LJII;
    public final Map<String, String> LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;
    public final C20666215ts LJIIJ;

    public C19323510in() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19323510in)) {
            return false;
        }
        C19323510in c19323510in = (C19323510in) obj;
        return this.LIZJ == c19323510in.LIZJ && Intrinsics.LJFF(this.LIZLLL, c19323510in.LIZLLL) && this.LJ == c19323510in.LJ && this.LJFF == c19323510in.LJFF && Intrinsics.LJFF(this.LJI, c19323510in.LJI) && Intrinsics.LJFF(this.LJII, c19323510in.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c19323510in.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c19323510in.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c19323510in.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZJ * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        Map<String, String> map = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.LJIIIZ;
        return ((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalPush(type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", uiTemplate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mobEventMap=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", extrasMap=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", innerPushTracker=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InnerPushMessage LIZ() {
        long j = this.LJ;
        int i = this.LIZJ;
        String str = this.LIZLLL;
        long j2 = this.LJFF;
        InnerPushUITemplate innerPushUITemplate = this.LJII;
        InnerPushConfig innerPushConfig = this.LJI;
        InnerPushLocalCheckExp.Meta meta = InnerPushLocalCheckExp.LIZ;
        boolean z = InnerPushLocalCheckExp.LIZJ && !C13LQ.LJIILJJIL(i, InnerPushLocalCheckExp.LIZLLL);
        long j3 = this.LJ;
        Map<String, String> map = this.LJIIIIZZ;
        return new InnerPushMessage(1, 2, j, j2, null, i, 0, str, 0L, false, innerPushUITemplate, innerPushConfig, null, false, null, z, false, false, this.LJIIIZ, String.valueOf(map != null ? new JSONObject(map) : null), j3, null, null, null, false, false);
    }

    public final boolean LIZIZ() {
        return C1908480zlO.LIZIZ.LIZLLL(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19323510in(int i, String str, InnerPushConfig innerPushConfig, InnerPushUITemplate innerPushUITemplate, final Map map, final Map map2, int i2) {
        long jCurrentTimeMillis;
        if ((i2 & 4) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        long jCurrentTimeMillis2 = (i2 & 8) != 0 ? System.currentTimeMillis() : 0L;
        innerPushConfig = (i2 & 16) != 0 ? C06MP.LIZ() : innerPushConfig;
        map = (i2 & 64) != 0 ? null : map;
        map2 = (i2 & 128) != 0 ? null : map2;
        C20666215ts c20666215ts = (i2 & 256) != 0 ? new C20666215ts(0) : null;
        new Object(map2, map) { // from class: X.07KW
            public final Map<String, Object> LIZ;
            public final Map<String, String> LIZIZ;

            {
                this.LIZ = map2;
                this.LIZIZ = map;
            }
        };
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = jCurrentTimeMillis;
        this.LJFF = jCurrentTimeMillis2;
        this.LJI = innerPushConfig;
        this.LJII = innerPushUITemplate;
        this.LJIIIIZZ = map;
        this.LJIIIZ = map2;
        this.LJIIJ = c20666215ts;
    }
}
