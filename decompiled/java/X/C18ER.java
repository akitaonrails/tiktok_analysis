package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18ER, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ER extends C09AY implements Function2<String, Map<String, ? extends String>, Unit> {
    public C18ER() {
        super(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String r9, java.util.Map<java.lang.String, ? extends java.lang.String> r10) {
        /*
            r8 = this;
            java.lang.String r9 = (java.lang.String) r9
            java.util.Map r10 = (java.util.Map) r10
            int r0 = r9.length()
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L97
            r0 = 1
        Ld:
            java.lang.String r4 = "btm_page_show"
            if (r0 != 0) goto L17
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r4)
            if (r0 == 0) goto L85
        L17:
            java.lang.String r0 = "scene"
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r0 = "abnormal"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L60
            X.0C59 r2 = X.C0C59.LJ()
            java.lang.String r1 = "bd_btm_sdk_switch_v3"
            r0 = 3
            int r0 = r2.LJI(r1, r0, r5)
            if (r0 == 0) goto L60
            com.bytedance.android.btm.impl.setting.BtmSettingModel r0 = X.C18CS.LIZ
            com.bytedance.android.btm.impl.setting.FeatureModel r3 = r0.LIZJ()
            r3.getClass()
            java.lang.String r2 = r3.getLazyDataRootKey()
            java.lang.String r1 = r3.getLazyDataKey()
            com.bytedance.android.btm.impl.setting.BtmPageShow r0 = r3.btmPageShow
            X.C1972007ny.LIZLLL(r2, r1, r0, r4)
            com.bytedance.android.btm.impl.setting.BtmPageShow r0 = r3.btmPageShow
            int r0 = r0.LIZ()
            if (r0 != r5) goto L60
            boolean r0 = X.C2211631BhB.LIZ
            if (r0 == 0) goto L58
            boolean r0 = X.C2211631BhB.LIZIZ
            if (r0 == 0) goto L60
        L58:
            boolean r0 = X.C2211631BhB.LIZIZ
            if (r0 == 0) goto L95
            boolean r0 = X.C2211631BhB.LIZJ
            if (r0 != 0) goto L95
        L60:
            r7 = 1
        L61:
            java.lang.String r0 = "btm"
            java.lang.Object r1 = r10.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L83
            java.lang.String r0 = "b5106."
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r6)
            if (r0 != r5) goto L83
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            X.0T2C r2 = new java.lang.Runnable() { // from class: X.0T2C
                static {
                    /*
                        X.0T2C r0 = new X.0T2C
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0T2C) X.0T2C.LL X.0T2C
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T2C.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T2C.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r3 = this;
                        java.lang.String r2 = "BTMTracker@a46c.init$3$1"
                        X.C1C7U.LIZ(r2)
                        r0 = 1
                        X.C2211631BhB.LIZJ = r0     // Catch: java.lang.Throwable -> L9
                        goto L14
                    L9:
                        r1 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                        boolean r0 = X.C2179971ATj.LIZ(r1)
                        if (r0 != 0) goto L14
                        throw r1
                    L14:
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T2C.run():void");
                }
            }
            r0 = 5000(0x1388, double:2.4703E-320)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        L83:
            if (r7 == 0) goto L8e
        L85:
            int r0 = r9.length()
            if (r0 != 0) goto L91
            X.C20684815ws.LJIILLIIL(r4, r10)
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L91:
            X.C20684815ws.LJIILLIIL(r9, r10)
            goto L8e
        L95:
            r7 = 0
            goto L61
        L97:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18ER.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
