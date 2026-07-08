package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0S0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714410S0p implements IEvent {
    public final EnumC714390S0n LIZ;
    public final int LIZIZ;
    public final Float LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;

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

    public /* synthetic */ C714410S0p(EnumC714390S0n enumC714390S0n) {
        this(enumC714390S0n, -1, null, null, null);
    }

    public C714410S0p(EnumC714390S0n enumC714390S0n, int i, Float f, Integer num, Integer num2) {
        this.LIZ = enumC714390S0n;
        this.LIZIZ = i;
        this.LIZJ = f;
        this.LIZLLL = num;
        this.LJ = num2;
    }
}
