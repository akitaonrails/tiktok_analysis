package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184901AfA {
    public static final /* synthetic */ int LJI = 0;
    public int LIZ;
    public List<C2184301AeC> LIZIZ = new ArrayList();
    public long LIZJ = Mp4ScreenVideoLoadTimeout.CONTROL;
    public EnumC2184841Af4 LIZLLL = EnumC2184841Af4.NONE;
    public final C2184891Af9 LJ = new C2184891Af9();
    public String LJFF = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableBlockConfigs(maxQueueSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", blockConfigs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskTimeOut=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", splitMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", staggeredRelease=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", distinctStr='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
