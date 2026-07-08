package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0PeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649960PeU implements IEvent {
    public final int LIZ;
    public final C0PSG LIZIZ;
    public final String LIZJ;
    public final Map<String, ? extends Object> LIZLLL;
    public final Map<String, ? extends Object> LJ;
    public final String LJFF;

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

    public C649960PeU(int i) {
        this.LIZ = i;
    }

    public C649960PeU(int i, C0PSG c0psg) {
        this.LIZ = i;
        this.LIZIZ = c0psg;
    }

    public C649960PeU(int i, Map<String, ? extends Object> map) {
        this.LIZ = i;
        this.LIZLLL = map;
    }

    public C649960PeU(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZJ = str;
        this.LJFF = str2;
    }

    public C649960PeU(int i, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.LIZ = i;
        this.LIZLLL = map;
        this.LJ = map2;
    }
}
