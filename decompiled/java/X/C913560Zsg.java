package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Zsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913560Zsg {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final Function1<String, Unit> LJ;
    public final IEvent LJFF;

    public C913560Zsg() {
        this(false, null, false, 0L, null, null, 511);
    }

    public C913560Zsg(boolean z, String str, boolean z2, long j, AwS593S0100000_14 awS593S0100000_14, IEvent iEvent, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? "" : str;
        z2 = (i & 32) != 0 ? false : z2;
        j = (i & 64) != 0 ? 0L : j;
        awS593S0100000_14 = (i & 128) != 0 ? null : awS593S0100000_14;
        iEvent = (i & 256) != 0 ? null : iEvent;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = j;
        this.LJ = awS593S0100000_14;
        this.LJFF = iEvent;
    }
}
