package X;

/* JADX INFO: renamed from: X.0ZOT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZOT {
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static final boolean LIZJ(X.C869590Y9l r2) {
        /*
            int r2 = r2.getMsgType()
            r0 = -1
            r1 = 1
            if (r2 == r0) goto L31
            if (r2 == r1) goto L31
            r0 = 1022(0x3fe, float:1.432E-42)
            if (r2 == r0) goto L31
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r2 == r0) goto L31
            r0 = 4051(0xfd3, float:5.677E-42)
            if (r2 == r0) goto L31
            r0 = 4052(0xfd4, float:5.678E-42)
            if (r2 == r0) goto L31
            r0 = 4065(0xfe1, float:5.696E-42)
            if (r2 == r0) goto L31
            r0 = 4066(0xfe2, float:5.698E-42)
            if (r2 == r0) goto L31
            r0 = 4084(0xff4, float:5.723E-42)
            if (r2 == r0) goto L31
            r0 = 4085(0xff5, float:5.724E-42)
            if (r2 == r0) goto L31
            switch(r2) {
                case 1: goto L31;
                case 15: goto L31;
                case 1026: goto L31;
                case 1031: goto L31;
                case 1039: goto L31;
                case 1812: goto L31;
                case 1816: goto L31;
                case 4001: goto L31;
                case 4013: goto L31;
                case 4045: goto L31;
                case 4048: goto L31;
                case 4058: goto L31;
                case 4074: goto L31;
                case 4082: goto L31;
                default: goto L2d;
            }
        L2d:
            switch(r2) {
                case 4006: goto L31;
                case 4007: goto L31;
                case 4008: goto L31;
                case 4009: goto L31;
                case 4010: goto L31;
                case 4011: goto L31;
                default: goto L30;
            }
        L30:
            r1 = 0
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZOT.LIZJ(X.0Y9l):boolean");
    }

    public static final boolean LIZ(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2) {
        if (C0ZDX.LJJJJZ(c869590Y9l) || c869590Y9l2 == null || c869590Y9l.getSender() != c869590Y9l2.getSender() || C0ZDX.LJJIIZ(c869590Y9l2) || LIZJ(c869590Y9l2) || c869590Y9l2.getMessageStatus() == C0YUT.RECALLED) {
            return true;
        }
        if (!C287620BPc.LIZ() && c869590Y9l.getCreatedAt() - c869590Y9l2.getCreatedAt() > 60000) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l, C869590Y9l c869590Y9l2) {
        if (c869590Y9l2 == null || c869590Y9l2.getSender() != c869590Y9l.getSender() || LIZJ(c869590Y9l2) || C0ZDX.LJJJJZ(c869590Y9l2) || C0ZDX.LJJIIZ(c869590Y9l2) || c869590Y9l2.getMessageStatus() == C0YUT.RECALLED) {
            return true;
        }
        if (!C287620BPc.LIZ() && c869590Y9l2.getMsgType() != 4046 && c869590Y9l2.getCreatedAt() - c869590Y9l.getCreatedAt() > 60000) {
            return true;
        }
        return false;
    }
}
