package X;

import com.bytedance.android.livesdk.performance.api.PerformanceApi;
import java.util.ArrayList;
import webcast.api.room.ClientPerformanceHarvestRequest;
import webcast.data.Performance;

/* JADX INFO: renamed from: X.0elo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101500elo extends AbstractC467020ITc {
    public final long LIZ;
    public Performance LIZIZ;
    public final C1101510elp<Performance> LIZJ = new C1101510elp<>(4, new ArrayList());
    public final PerformanceApi LIZLLL;
    public final C1101520elq LJ;

    public C1101500elo(long j) {
        this.LIZ = j;
        C480460Ism.LIZ().getClass();
        this.LIZLLL = (PerformanceApi) C480460Ism.LIZLLL(PerformanceApi.class);
        this.LJ = new C1101520elq();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1100800ekg r12, X.C1100750ekb r13) {
        /*
            r11 = this;
            X.0elI r7 = r13.LIZ
            webcast.data.Performance r0 = r11.LIZIZ
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L66
            r10 = 1
        L9:
            webcast.data.Performance r3 = new webcast.data.Performance
            r3.<init>()
            float r0 = r7.LIZIZ
            r3.socre = r0
            X.0elH r0 = r7.LIZLLL
            int r0 = r0.ordinal()
            r3.level = r0
            long r0 = r7.LJ
            r3.harvestTime = r0
            java.util.Map<java.lang.String, X.0JPj> r1 = r7.LIZJ
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r1.size()
            r8.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L31:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getValue()
            X.0JPj r4 = (X.C491530JPj) r4
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            webcast.data.PerformanceElement r1 = new webcast.data.PerformanceElement
            r1.<init>()
            java.lang.String r0 = "drop3_plus"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L58
            java.lang.String r2 = "drop_3_duration_ratio"
        L58:
            r1.name = r2
            float r0 = r4.LIZIZ
            r1.score = r0
            float r0 = r4.LIZ
            r1.value = r0
            r8.add(r1)
            goto L31
        L66:
            r10 = 0
            goto L9
        L68:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            r3.elements = r0
            X.0elq r4 = r11.LJ
            kotlin.jvm.internal.AwS226S0300000_17 r2 = new kotlin.jvm.internal.AwS226S0300000_17
            r0 = 0
            r2.<init>(r11, r3, r7, r0)
            r4.getClass()
            X.0elH r1 = r7.LIZLLL
            X.0elH r0 = X.EnumC1101170elH.UNKNOWN
            if (r1 == r0) goto Lb9
            boolean r0 = r4.LIZ
            if (r0 != 0) goto L9f
            int r1 = r1.ordinal()
            X.0elH r0 = X.EnumC1101170elH.POOR
            int r0 = r0.ordinal()
            if (r1 > r0) goto L9f
            r4.LIZ = r5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.invoke(r0)
        L97:
            r11.LIZIZ = r3
            X.0elp<webcast.data.Performance> r0 = r11.LIZJ
            r0.LIZ(r3)
            return
        L9f:
            boolean r0 = r4.LIZ
            if (r0 == 0) goto Lb9
            X.0elH r0 = r7.LIZLLL
            int r1 = r0.ordinal()
            X.0elH r0 = X.EnumC1101170elH.POOR
            int r0 = r0.ordinal()
            if (r1 <= r0) goto Lb9
            r4.LIZ = r6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r0)
            goto L97
        Lb9:
            if (r10 == 0) goto L97
            float r0 = r7.LIZ
            r11.LIZIZ(r3, r0, r5)
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101500elo.LIZJ(X.0ekg, X.0ekb):void");
    }

    public final void LIZIZ(Performance performance, float f, int i) {
        ClientPerformanceHarvestRequest clientPerformanceHarvestRequest = new ClientPerformanceHarvestRequest();
        clientPerformanceHarvestRequest.harvestAction = i;
        clientPerformanceHarvestRequest.currentPerformance = performance;
        if (!this.LIZJ.LIZIZ.isEmpty()) {
            clientPerformanceHarvestRequest.historyPerformance.addAll(this.LIZJ.LIZIZ);
        }
        clientPerformanceHarvestRequest.roomId = this.LIZ;
        clientPerformanceHarvestRequest.mobileScore = f;
        this.LIZLLL.postPerformanceInfo(clientPerformanceHarvestRequest).LJL(C11S5.LIZ()).LJJLJ();
        this.LIZJ.LIZIZ.clear();
    }
}
