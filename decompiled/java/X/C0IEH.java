package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;

/* JADX INFO: renamed from: X.0IEH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEH {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final long LIZ;
    public final LiveMode LIZIZ;
    public final StreamUrlExtra.SrConfig LIZJ;
    public final C463240IEo LIZLLL;
    public final C463240IEo LJ;
    public boolean LJFF;
    public C463710IGj LJI;
    public C0IEJ LJII;
    public Room LJIIIIZZ;
    public C467650IVn LJIIIZ;
    public long LJIIJ;

    public C0IEH(long j, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, C463240IEo c463240IEo, C463240IEo c463240IEo2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = liveMode;
        this.LIZJ = srConfig;
        this.LIZLLL = c463240IEo;
        this.LJ = c463240IEo2;
        this.LJFF = z;
        if (srConfig == null) {
            this.LIZJ = new StreamUrlExtra.SrConfig();
        }
        StreamUrlExtra.SrConfig srConfig2 = this.LIZJ;
        if (srConfig2 != null) {
            srConfig2.LIZ = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId = ");
        sbLIZ.append(j);
        sbLIZ.append(",streamType = ");
        sbLIZ.append(liveMode);
        sbLIZ.append(" , srConfig = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",isLandscape = ");
        sbLIZ.append(this.LJFF);
        C0IER.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("landStreamConfig = ");
        sbLIZ2.append(c463240IEo);
        C0IER.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("portStreamConfig = ");
        sbLIZ3.append(c463240IEo2);
        C0IER.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
