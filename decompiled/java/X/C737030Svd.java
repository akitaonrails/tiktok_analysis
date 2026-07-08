package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Svd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737030Svd implements IEvent {
    public final int LIZ;
    public final Object LIZIZ;
    public Bundle LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public final Long LJIILL;
    public int LJIILLIIL;
    public PublishModel LJIIZILJ;
    public Boolean LJIJ;
    public final Map<String, Object> LJIJI;

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
        sbLIZ.append("VideoEvent{type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoType=");
        sbLIZ.append(0);
        sbLIZ.append(", from='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentPosition='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isPlaying='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C737030Svd(int i) {
        this.LJII = -1;
        this.LJIJ = Boolean.FALSE;
        this.LJIJI = new HashMap();
        this.LIZ = i;
    }

    public C737030Svd(Object obj, Long l) {
        this.LJII = -1;
        this.LJIJ = Boolean.FALSE;
        this.LJIJI = new HashMap();
        this.LIZ = 14;
        this.LIZIZ = obj;
        this.LJIILL = l;
    }

    public C737030Svd(int i, Object obj) {
        this.LJII = -1;
        this.LJIJ = Boolean.FALSE;
        this.LJIJI = new HashMap();
        this.LIZ = i;
        this.LIZIZ = obj;
    }
}
