package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XLC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLC extends C09AY implements Function0<Unit> {
    public C0XLC() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[PHI: r1
      0x0072: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v8 java.lang.String), (r1v9 java.lang.String) binds: [B:20:0x005c, B:22:0x0066, B:24:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r7 = this;
            com.bytedance.i18n.region.StoreRegionSource r4 = com.bytedance.i18n.region.StoreRegionSource.LIZ
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = com.bytedance.i18n.region.StoreRegionSource.LIZLLL
            boolean r0 = r1.get()
            if (r0 != 0) goto L7f
            X.0wtI r0 = X.C1798060wtI.LIZ
            X.0wtM r3 = X.C1798060wtI.LIZLLL
            if (r3 == 0) goto L7f
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L7f
            com.bytedance.i18n.region.RegionManager r1 = X.C1798060wtI.LIZJ
            java.lang.String r6 = "store_region"
            if (r1 == 0) goto L2f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0XLD> r0 = r1.LJFF
            r0.put(r6, r4)
            java.util.Map<java.lang.String, X.0XKv> r1 = r1.LJI
            X.0XKv r0 = r4.LIZ()
            r1.put(r6, r0)
        L2f:
            android.content.Context r2 = r3.LIZ
            X.0XLE r5 = r3.LIZLLL
            java.lang.String r1 = "ttnet_store_region"
            r0 = 0
            android.content.SharedPreferences r1 = X.C810670Vr7.LIZJ(r2, r0, r1)
            java.lang.String r3 = ""
            java.lang.String r2 = r1.getString(r6, r3)
            if (r2 != 0) goto L44
            r2 = r3
        L44:
            java.lang.String r0 = "store_region_src"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto L4e
            r3 = r0
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L75
            java.lang.String r1 = r5.getSimCountry()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L72
            java.lang.String r1 = r5.getSysRegion()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L72
            java.lang.String r1 = r5.LIZ()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L75
        L72:
            r2 = r1
            java.lang.String r3 = "local"
        L75:
            X.0XKv r0 = new X.0XKv
            r0.<init>(r2, r3)
            com.bytedance.i18n.region.StoreRegionSource.LIZIZ = r0
            r4.LIZJ()
        L7f:
            X.0X2A r1 = X.C0X2A.LIZIZ()
            X.0XLB r0 = new java.util.Observer() { // from class: X.0XLB
                static {
                    /*
                        X.0XLB r0 = new X.0XLB
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0XLB) X.0XLB.LIZ X.0XLB
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XLB.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XLB.<init>():void");
                }

                @Override // java.util.Observer
                public final void update(java.util.Observable r5, java.lang.Object r6) {
                    /*
                        r4 = this;
                        boolean r0 = r5 instanceof X.C0X2A
                        if (r0 == 0) goto L49
                        java.util.HashMap r6 = (java.util.HashMap) r6
                        java.lang.String r0 = "region_source"
                        java.lang.Object r3 = r6.get(r0)
                        boolean r1 = r3 instanceof java.lang.String
                        r0 = 0
                        if (r1 == 0) goto L4a
                        java.lang.String r3 = (java.lang.String) r3
                    L13:
                        java.lang.String r2 = ""
                        if (r3 != 0) goto L18
                        r3 = r2
                    L18:
                        java.lang.String r0 = "store_region"
                        java.lang.Object r1 = r6.get(r0)
                        boolean r0 = r1 instanceof java.lang.String
                        if (r0 == 0) goto L28
                        java.lang.String r1 = (java.lang.String) r1
                        if (r1 == 0) goto L28
                        r2 = r1
                    L28:
                        X.0XKv r0 = com.bytedance.i18n.region.StoreRegionSource.LIZIZ
                        java.lang.String r0 = r0.LIZ
                        r1 = 1
                        boolean r0 = kotlin.text.u.LJIJI(r0, r2, r1)
                        if (r0 == 0) goto L3d
                        X.0XKv r0 = com.bytedance.i18n.region.StoreRegionSource.LIZIZ
                        java.lang.String r0 = r0.LIZIZ
                        boolean r0 = kotlin.text.u.LJIJI(r0, r3, r1)
                        if (r0 != 0) goto L49
                    L3d:
                        X.0XKv r0 = new X.0XKv
                        r0.<init>(r2, r3)
                        com.bytedance.i18n.region.StoreRegionSource.LIZIZ = r0
                        com.bytedance.i18n.region.StoreRegionSource r0 = com.bytedance.i18n.region.StoreRegionSource.LIZ
                        r0.LIZJ()
                    L49:
                        return
                    L4a:
                        r3 = r0
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0XLB.update(java.util.Observable, java.lang.Object):void");
                }
            }
            r1.addObserver(r0)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "local_test"
            kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLC.invoke():java.lang.Object");
    }
}
