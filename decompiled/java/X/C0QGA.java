package X;

import Y.ARunnableS110S0100000_10;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QGA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGA {
    public Integer LIZ;
    public Integer LIZLLL;
    public int LJI;
    public int LJIIJJI;
    public Map<String, ? extends Object> LJIIL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(364));
    public long LJIIJ = System.currentTimeMillis();

    public final void LIZJ() {
        C823050WQl.LIZJ().execute(new ARunnableS110S0100000_10(this, 99));
    }

    public final void LIZIZ(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((JSONObject) this.LJIILIIL.getValue()).put((String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[FALL_THROUGH] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.LIZ = r0
            r1.LIZIZ = r3
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L27
            r0 = 402(0x192, float:5.63E-43)
            if (r2 == r0) goto L2d
            r0 = 610(0x262, float:8.55E-43)
            if (r2 == r0) goto L2d
            r0 = 611(0x263, float:8.56E-43)
            if (r2 == r0) goto L2d
            switch(r2) {
                case 201: goto L2d;
                case 202: goto L2d;
                case 203: goto L2b;
                case 204: goto L2b;
                case 205: goto L2b;
                default: goto L1b;
            }
        L1b:
            switch(r2) {
                case 301: goto L2d;
                case 302: goto L2d;
                case 303: goto L2d;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 305: goto L2b;
                case 306: goto L2b;
                case 307: goto L2d;
                case 308: goto L2d;
                case 309: goto L2d;
                case 310: goto L2d;
                default: goto L21;
            }
        L21:
            switch(r2) {
                case 501: goto L2d;
                case 502: goto L2d;
                case 503: goto L2d;
                case 504: goto L2d;
                default: goto L24;
            }
        L24:
            switch(r2) {
                case 601: goto L2d;
                case 602: goto L2d;
                case 603: goto L2d;
                default: goto L27;
            }
        L27:
            r0 = 1
        L28:
            r1.LJIIJJI = r0
            return
        L2b:
            r0 = 2
            goto L28
        L2d:
            r0 = 3
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QGA.LIZ(int, java.lang.String):void");
    }
}
