package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.ss.android.ugc.aweme.experiment.LiveReplayListPreloadExperiment;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0xpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833940xpA extends AbstractC1844760y6c<C1833960xpC, AnchorReplayInfoData> {
    public static final C1833940xpA LJ = new C1833940xpA();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(346));

    static {
        LiveReplayListPreloadExperiment liveReplayListPreloadExperiment = LiveReplayListPreloadExperiment.INSTANCE;
        AbstractC1844760y6c.LIZJ.put("live_replay_list", new C1833960xpC(liveReplayListPreloadExperiment.getTtl(), liveReplayListPreloadExperiment.getInterval()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1833950xpB
            if (r0 == 0) goto L20
            r6 = r8
            X.0xpB r6 = (X.C1833950xpB) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L52
        L20:
            X.0xpB r6 = new X.0xpB
            r6.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = "LiveReplayPreloader"
            java.lang.String r0 = "fetchData()"
            X.C20441214yg.LIZIZ(r1, r0)     // Catch: java.lang.Exception -> L66
            X.01GW r0 = X.C1833940xpA.LJFF     // Catch: java.lang.Exception -> L66
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L66
            X.0xor r0 = (X.C1833750xor) r0     // Catch: java.lang.Exception -> L66
            X.0xp6 r3 = r0.LLILLL     // Catch: java.lang.Exception -> L66
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L66
            r6.LLILLL = r4     // Catch: java.lang.Exception -> L66
            r1 = 0
            r0 = 10
            java.lang.Object r1 = r3.LJLZ(r1, r0, r2, r6)     // Catch: java.lang.Exception -> L66
            if (r1 != r5) goto L55
            return r5
        L52:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L66
        L55:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L66
            if (r1 == 0) goto L60
            T r0 = r1.data     // Catch: java.lang.Exception -> L66
            com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r0 = (com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData) r0     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L60
            return r0
        L60:
            com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r0 = new com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData     // Catch: java.lang.Exception -> L66
            r0.<init>()     // Catch: java.lang.Exception -> L66
            return r0
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r0 = new com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833940xpA.LIZIZ(X.05Vn):java.lang.Object");
    }
}
