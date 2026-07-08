package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0nPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433530nPL {
    public volatile PublishModel LIZ;
    public final String LIZIZ;
    public final List<AbstractC1433570nPP> LIZJ;
    public volatile AbstractC1433190nOn LIZLLL;
    public long LJ;
    public long LJFF;
    public InterfaceRunnableC1433480nPG LJI;
    public Integer LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ(AbstractC1433190nOn abstractC1433190nOn) {
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG;
        this.LIZLLL = abstractC1433190nOn;
        if ((abstractC1433190nOn instanceof C1433490nPH) && this.LJ == -1) {
            this.LJ = SystemClock.uptimeMillis();
        }
        if (!(this.LIZLLL instanceof C1433490nPH) && (interfaceRunnableC1433480nPG = this.LJI) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("change state to:");
            sbLIZ.append(this.LIZLLL);
            interfaceRunnableC1433480nPG.LJLJJLL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C1433530nPL(PublishModel publishModel, InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG) {
        this.LIZ = publishModel;
        String str = this.LIZ.expectPublishTaskId;
        this.LIZIZ = str == null ? UUID.randomUUID().toString() : str;
        this.LIZJ = Collections.synchronizedList(new ArrayList());
        this.LIZLLL = C1433220nOq.LIZ;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = interfaceRunnableC1433480nPG;
    }
}
