package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1622406Ww {
    public final C1622006Ws<Function1<Function1<? super Boolean, Unit>, Unit>> LIZ;
    public final C1622006Ws<Function0<Unit>> LIZIZ;
    public final C1622006Ws<Long> LIZJ;
    public final C06XH LIZLLL;
    public final boolean LJ;
    public final long LJFF;
    public final AbstractC1751306tT LJI;
    public final C1622006Ws<Function1<Boolean, Unit>> LJII;
    public final boolean LJIIIIZZ;

    public C1622406Ww() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationQueueExecutableBlock(startAnimation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stopAnimation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enqueueTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", typeWithPriority=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disableAutoCompletion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", completionTimeoutMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", conflictOption=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", onResult=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ignoreDuplicateTypes=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1622406Ww(C1622006Ws c1622006Ws, C1622006Ws c1622006Ws2, C06XH c06xh, boolean z, long j, AbstractC1751306tT abstractC1751306tT, C1622006Ws c1622006Ws3, boolean z2) {
        C1622006Ws<Long> c1622006Ws4 = new C1622006Ws<>(Long.valueOf(System.currentTimeMillis()));
        this.LIZ = c1622006Ws;
        this.LIZIZ = c1622006Ws2;
        this.LIZJ = c1622006Ws4;
        this.LIZLLL = c06xh;
        this.LJ = z;
        this.LJFF = j;
        this.LJI = abstractC1751306tT;
        this.LJII = c1622006Ws3;
        this.LJIIIIZZ = z2;
    }
}
