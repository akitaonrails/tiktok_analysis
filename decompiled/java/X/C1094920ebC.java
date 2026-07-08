package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ebC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094920ebC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1094920ebC(long j) {
        super(0);
        this.LL = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r0 = r1.fansScoreRule;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r0 = r0.levelMaxScore;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        X.C1094970ebH.LIZ = r2;
        X.C1094970ebH.LIZIZ = r0;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        /*
            r6 = this;
            X.14i1<java.util.List<java.lang.String>> r0 = X.InterfaceC1093910eZZ.LLLLLLLLL
            java.lang.Object r1 = r0.LIZIZ()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L8e
            boolean r0 = X.C1095130ebX.LJII
            if (r0 != 0) goto L8e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L72
            r3.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L72
        L22:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L72
            java.lang.Class<webcast.data.FansConfig> r0 = webcast.data.FansConfig.class
            java.lang.Object r0 = r3.LJII(r1, r0)     // Catch: java.lang.Throwable -> L72
            webcast.data.FansConfig r0 = (webcast.data.FansConfig) r0     // Catch: java.lang.Throwable -> L72
            r4.add(r0)     // Catch: java.lang.Throwable -> L72
            goto L22
        L3a:
            long r0 = r6.LL     // Catch: java.lang.Throwable -> L72
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L72
            com.bytedance.android.livesdk.livesetting.level.FansClubScoreFixedEnableSettings r0 = com.bytedance.android.livesdk.livesetting.level.FansClubScoreFixedEnableSettings.INSTANCE     // Catch: java.lang.Throwable -> L72
            boolean r0 = r0.getValue()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L7b
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L72
        L49:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L7b
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L72
            webcast.data.FansConfig r1 = (webcast.data.FansConfig) r1     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L49
            webcast.data.FansScoreRule r0 = r1.fansScoreRule     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L49
            int r2 = r0.level     // Catch: java.lang.Throwable -> L72
            if (r2 <= 0) goto L49
            if (r5 != r2) goto L49
            if (r1 == 0) goto L64
            goto L67
        L64:
            r0 = 0
            goto L6d
        L67:
            webcast.data.FansScoreRule r0 = r1.fansScoreRule     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L64
            long r0 = r0.levelMaxScore     // Catch: java.lang.Throwable -> L72
        L6d:
            X.C1094970ebH.LIZ = r2     // Catch: java.lang.Throwable -> L72
            X.C1094970ebH.LIZIZ = r0     // Catch: java.lang.Throwable -> L72
            goto L7b
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "fansClub load config from cache exception"
            X.C1CC2.LIZ(r0, r1)
        L7b:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            Y.ARunnableS117S0100000_17 r1 = new Y.ARunnableS117S0100000_17
            r0 = 261(0x105, float:3.66E-43)
            r1.<init>(r4, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1094920ebC.invoke():java.lang.Object");
    }
}
