package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0ORG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORG implements IEvent {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Function0<Unit> LJ;
    public final String LJFF;
    public final Function0<Unit> LJI;
    public final Function0<Unit> LJII;

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

    public C0ORG(long j, String str, String str2, String str3, AwS410S0200000_9 awS410S0200000_9, String str4, AwS410S0200000_9 awS410S0200000_92, AwS553S0100000_9 awS553S0100000_9) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = awS410S0200000_9;
        this.LJFF = str4;
        this.LJI = awS410S0200000_92;
        this.LJII = awS553S0100000_9;
    }
}
