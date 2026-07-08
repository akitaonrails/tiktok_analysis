package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oI4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467460oI4 implements InterfaceC1467560oIE {
    public static boolean LJIIIIZZ(int i) {
        return i >= 40000 && i <= 49999;
    }

    @Override // X.InterfaceC1467560oIE
    public final /* synthetic */ C1467880oIk LJ(int i, JSONObject jSONObject) {
        return null;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZ(int i, String str) {
        return (LJIIIIZZ(i) || i == 355 || i == 662 || i == 360 || i == 361) ? null : null;
    }

    @Override // X.InterfaceC1467560oIE
    public final C1467880oIk LIZIZ(int i, long j) {
        return (LJIIIIZZ(i) || i == 709) ? null : null;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // X.InterfaceC1467560oIE
    public final X.C1467880oIk LJFF(float r3, int r4) {
        /*
            r2 = this;
            boolean r1 = LJIIIIZZ(r4)
            r0 = 0
            if (r1 == 0) goto L8
            return r0
        L8:
            switch(r4) {
                case 325: goto L1c;
                case 326: goto L1d;
                case 327: goto L1e;
                case 328: goto L1f;
                default: goto Lb;
            }
        Lb:
            switch(r4) {
                case 344: goto L19;
                case 345: goto L1a;
                case 346: goto L1b;
                default: goto Le;
            }
        Le:
            switch(r4) {
                case 348: goto L12;
                case 349: goto L13;
                case 350: goto L14;
                case 351: goto L15;
                case 352: goto L16;
                case 353: goto L17;
                case 354: goto L18;
                default: goto L11;
            }
        L11:
            return r0
        L12:
            return r0
        L13:
            return r0
        L14:
            return r0
        L15:
            return r0
        L16:
            return r0
        L17:
            return r0
        L18:
            return r0
        L19:
            return r0
        L1a:
            return r0
        L1b:
            return r0
        L1c:
            return r0
        L1d:
            return r0
        L1e:
            return r0
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1467460oI4.LJFF(float, int):X.0oIk");
    }
}
