package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0K6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512110K6n implements C0K5Y {
    public static final C512110K6n LIZIZ;
    public static final ConcurrentHashMap<String, InterfaceC332260D0u<AbstractC511920K5u>> LIZJ;
    public static final C2252331DDr LIZLLL;

    static {
        C512110K6n c512110K6n = new C512110K6n();
        LIZIZ = c512110K6n;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
        LIZJ = new ConcurrentHashMap<>();
        LIZLLL = C09IR.LIZIZ(0, 64, null, 5);
        C09IC.LJJI(c054gLIZ, new C861640Xr8(new C512120K6o(c512110K6n), C512160K6s.LIZIZ));
    }

    @Override // X.C0K5Y
    public final C0KVE LIZ() {
        return new C0KVE(C09IC.LIZ(LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // X.C0K5Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0K5R LIZIZ(com.bytedance.android.live.base.model.user.User r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getSecUid()
            int r0 = r0.length()
            r3 = 1
            if (r0 <= 0) goto Lb2
            r0 = 1
        Lc:
            r6 = 0
            if (r0 == 0) goto L8e
            java.lang.String r5 = r8.getSecUid()
        L13:
            if (r5 == 0) goto Lb5
            com.bytedance.android.live.base.model.user.SubscribeInfo r4 = r8.getSubscribeInfo()
            java.lang.String r2 = r8.getSecUid()
            int r0 = r2.length()
            if (r0 <= 0) goto L8c
            r0 = 1
        L24:
            r1 = 6
            if (r0 == 0) goto L6e
            X.0K6r r0 = X.C512150K6r.LIZ
            r0.getClass()
            java.util.Set<java.lang.String> r0 = X.C512150K6r.LIZIZ
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L6e
            X.0K6h r3 = new X.0K6h
            X.0K6q r0 = LIZJ(r4, r2)
            r3.<init>(r0, r6, r6, r1)
        L3d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0D0u<X.0K5u>> r0 = X.C512110K6n.LIZJ
            java.lang.Object r2 = r0.get(r5)
            if (r2 != 0) goto L50
            X.1DDq r2 = X.C1BNE.LIZ(r3)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            if (r0 == 0) goto L50
            r2 = r0
        L50:
            X.0D0u r2 = (X.InterfaceC332260D0u) r2
            java.lang.Object r1 = r2.getValue()
            boolean r0 = r3 instanceof X.C512050K6h
            if (r0 != 0) goto L65
            boolean r0 = r1 instanceof X.C512050K6h
            if (r0 != 0) goto L64
            X.0K5v r0 = new X.AbstractC511920K5u() { // from class: X.0K5v
                static {
                    /*
                        X.0K5v r0 = new X.0K5v
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0K5v) X.0K5v.LIZIZ X.0K5v
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C511930K5v.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        java.lang.String r0 = "subscribed_expired_grace_period"
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C511930K5v.<init>():void");
                }
            }
            if (r3 == r0) goto L65
            if (r1 != r0) goto L65
        L64:
            r3 = r1
        L65:
            r2.setValue(r3)
            X.0K5R r0 = new X.0K5R
            r0.<init>(r2)
            return r0
        L6e:
            if (r4 == 0) goto L89
            boolean r0 = r4.isSubscribed()
            if (r0 != r3) goto L80
            X.0K6h r3 = new X.0K6h
            X.0K6q r0 = LIZJ(r4, r2)
            r3.<init>(r0, r6, r6, r1)
            goto L3d
        L80:
            boolean r0 = r4.isInGracePeriod()
            if (r0 != r3) goto L89
            X.0K5v r3 = X.C511930K5v.LIZIZ
            goto L3d
        L89:
            X.0K5t r3 = X.C511910K5t.LIZIZ
            goto L3d
        L8c:
            r0 = 0
            goto L24
        L8e:
            java.lang.String r0 = r8.getIdStr()
            int r0 = r0.length()
            if (r0 <= 0) goto L9e
            java.lang.String r5 = r8.getIdStr()
            goto L13
        L9e:
            long r4 = r8.getId()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            long r0 = r8.getId()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            goto L13
        Lb2:
            r0 = 0
            goto Lc
        Lb5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C512110K6n.LIZIZ(com.bytedance.android.live.base.model.user.User):X.0K5R");
    }

    public static C512140K6q LIZJ(SubscribeInfo subscribeInfo, String str) {
        String str2;
        boolean z;
        SubscribeBadge subscribeBadge = null;
        if (subscribeInfo == null || (str2 = subscribeInfo.packageId) == null) {
            str2 = "";
        }
        if (subscribeInfo != null && subscribeInfo.status == 2) {
            z = true;
        } else {
            z = false;
        }
        if (subscribeInfo != null) {
            subscribeBadge = subscribeInfo.getSubscribeBadge();
        }
        return new C512140K6q(str, str2, z, false, subscribeBadge, false, null, 104);
    }

    public static void LIZLLL(String str, C512050K6h c512050K6h) {
        InterfaceC332260D0u<AbstractC511920K5u> interfaceC332260D0uPutIfAbsent;
        LIZLLL.LIZJ(c512050K6h);
        if (str.length() > 0) {
            ConcurrentHashMap<String, InterfaceC332260D0u<AbstractC511920K5u>> concurrentHashMap = LIZJ;
            InterfaceC332260D0u<AbstractC511920K5u> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
            if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(c512050K6h)))) != null) {
                interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
            }
            interfaceC332260D0uLIZ.setValue(c512050K6h);
        }
    }
}
