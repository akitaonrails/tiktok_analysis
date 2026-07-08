package X;

import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.08hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2184808hC implements InterfaceC1788970wed {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    public C2184808hC() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        String channel = c2213981Bky.getChannel();
        long versionCode = c2213981Bky.getVersionCode();
        String versionName = c2213981Bky.getVersionName();
        c2213981Bky.isDebug();
        this.LIZ = channel;
        this.LIZIZ = versionCode;
        this.LIZJ = versionName;
        this.LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(315));
        this.LJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 147));
    }

    @Override // X.InterfaceC1788970wed
    public final String LIZ() {
        return (String) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1788970wed
    public final String getShortVersionCode() {
        return (String) this.LJ.getValue();
    }

    @Override // X.InterfaceC1788970wed
    public final String LIZIZ() {
        return this.LIZ;
    }
}
