package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SA5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SA5 {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public Aweme LJFF;
    public C2189821An6 LJII;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public AwS412S0200000_11 LJIILIIL;
    public Map<String, String> LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;
    public boolean LIZLLL = true;
    public String LJI = "";
    public String LJIIIIZZ = "";
    public String LJIIL = "";

    public final boolean LIZ() {
        Aweme aweme = this.LJFF;
        return aweme != null && C0ST8.LIZJ(aweme) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SA5.LIZIZ():void");
    }

    public C0SA5(AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LIZ = awS555S0100000_11;
        this.LIZIZ = awS555S0100000_112;
    }

    public final void LIZJ(long j, long j2) {
        this.LJIIJJI = j2;
        this.LJIIJ = j;
        C696350RTd c696350RTd = C721270SQz.LLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayEventTracker setPhotoStayTime totalFeedStayTimeMs: ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", totalFullPageStayTime: ");
        sbLIZ.append(this.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        c696350RTd.getClass();
    }
}
