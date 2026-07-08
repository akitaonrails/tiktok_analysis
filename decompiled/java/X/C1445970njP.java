package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0njP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445970njP implements IEvent {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public C1434650nR9 LJFF;
    public boolean LJI;
    public CreateBaseAwemeResponse LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public PublishModel LJIIJJI;
    public String LJIIL;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishStatus{status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1445970njP(int i) {
        this.LIZ = i;
    }

    public C1445970njP(Object obj, int i, int i2, String str) {
        this.LIZJ = obj;
        this.LIZIZ = i2;
        this.LIZ = i;
        this.LIZLLL = str;
    }
}
