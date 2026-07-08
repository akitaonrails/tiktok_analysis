package X;

import webcast.api.game.InGameRankSettingResponse;

/* JADX INFO: renamed from: X.0TFR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFR {
    public static final C11PQ<InGameRankSettingResponse.ResponseData> LIZ = new C11PQ<>();

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C11PQ LIZ(androidx.lifecycle.LifecycleOwner r5, boolean r6, Y.AfS181S0100000_12 r7, int r8) {
        /*
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r6 = 1
        L5:
            r0 = r8 & 4
            if (r0 == 0) goto La
            r7 = 0
        La:
            r0 = 202130(0x31592, float:2.83244E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            if (r6 != 0) goto L2f
            X.11PQ<webcast.api.game.InGameRankSettingResponse$ResponseData> r2 = X.C0TFR.LIZ
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.LL
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L2f
            boolean r0 = X.C11PO.isComplete(r1)
            if (r0 != 0) goto L2f
            boolean r0 = X.C11PO.isError(r1)
            if (r0 != 0) goto L2f
            if (r4 == 0) goto L2e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L2e:
            return r2
        L2f:
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.game.api.InGameRankApi> r0 = com.bytedance.android.livesdk.game.api.InGameRankApi.class
            r1.getClass()
            java.lang.Object r0 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.game.api.InGameRankApi r0 = (com.bytedance.android.livesdk.game.api.InGameRankApi) r0
            X.11NZ r1 = r0.fetchInGameRankSetting()
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r1 = r1.LJIILIIL(r0)
            X.11L0 r0 = X.C11RD.LJ(r5)
            java.lang.Object r3 = r1.LIZJ(r0)
            X.0J1N r3 = (X.C0J1N) r3
            X.0TBN<T> r2 = new X.C09JN() { // from class: X.0TBN
                static {
                    /*
                        X.0TBN r0 = new X.0TBN
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0TBN<T>) X.0TBN.LL X.0TBN
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TBN.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TBN.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "InGameRank@9c71.fetchInGameRank$1"
                        X.C1C7U.LIZ(r2)
                        com.bytedance.android.live.network.response.BaseResponse r4 = (com.bytedance.android.live.network.response.BaseResponse) r4
                        T r1 = r4.data
                        if (r1 == 0) goto L10
                        X.11PQ<webcast.api.game.InGameRankSettingResponse$ResponseData> r0 = X.C0TFR.LIZ
                        r0.onNext(r1)
                    L10:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TBN.accept(java.lang.Object):void");
                }
            }
            Y.AfS176S0100000_7 r1 = new Y.AfS176S0100000_7
            r0 = 143(0x8f, float:2.0E-43)
            r1.<init>(r7, r0)
            r3.LIZ(r2, r1)
            X.11PQ<webcast.api.game.InGameRankSettingResponse$ResponseData> r2 = X.C0TFR.LIZ
            if (r4 == 0) goto L2e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TFR.LIZ(androidx.lifecycle.LifecycleOwner, boolean, Y.AfS181S0100000_12, int):X.11PQ");
    }
}
