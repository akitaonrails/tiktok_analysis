package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.19Mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21526619Mi implements Comparable<C21526619Mi> {
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LL = 1.0f;
    public float LLIZLLLIL = 1.0f;
    public float LLJ = 1.0f;
    public float LLJI = Float.NaN;
    public float LLJIJIL = Float.NaN;
    public float LLJJ = Float.NaN;
    public float LLJJI = Float.NaN;
    public final LinkedHashMap<String, C21526019Mc> LLJJIII = new LinkedHashMap<>();

    @Override // java.lang.Comparable
    public final int compareTo(C21526619Mi c21526619Mi) {
        c21526619Mi.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public static boolean LJFF(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        }
        if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0008 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
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
    public final void LIZJ(int r8, java.util.HashMap r9) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21526619Mi.LIZJ(int, java.util.HashMap):void");
    }

    public final void LJI(C19OA c19oa, C19MB c19mb, int i) {
        float f;
        c19oa.getX();
        c19oa.getY();
        c19oa.getWidth();
        c19oa.getHeight();
        C19MA c19maLJIJI = c19mb.LJIJI(i);
        C19M9 c19m9 = c19maLJIJI.LIZIZ;
        int i2 = c19m9.LIZJ;
        this.LLILLJJLI = i2;
        int i3 = c19m9.LIZIZ;
        this.LLILLL = i3;
        if (i3 != 0 && i2 == 0) {
            f = 0.0f;
        } else {
            f = c19m9.LIZLLL;
        }
        this.LL = f;
        C19M7 c19m7 = c19maLJIJI.LJ;
        this.LLILZ = c19m7.LJIIL;
        this.LLILZIL = c19m7.LIZIZ;
        this.LLILZLL = c19m7.LIZJ;
        this.LLIZ = c19m7.LIZLLL;
        this.LLIZLLLIL = c19m7.LJ;
        this.LLJ = c19m7.LJFF;
        this.LLJI = c19m7.LJI;
        this.LLJIJIL = c19m7.LJII;
        this.LLJILJIL = c19m7.LJIIIIZZ;
        this.LLJILJILJ = c19m7.LJIIIZ;
        this.LLJILLL = c19m7.LJIIJ;
        C19NB.LIZJ(c19maLJIJI.LIZJ.LIZJ);
        this.LLJJ = c19maLJIJI.LIZJ.LJI;
        this.LLJJI = c19maLJIJI.LIZIZ.LJ;
        for (String str : c19maLJIJI.LJFF.keySet()) {
            C21526019Mc c21526019Mc = c19maLJIJI.LJFF.get(str);
            if (c21526019Mc.LIZIZ != EnumC21526219Me.STRING_TYPE) {
                this.LLJJIII.put(str, c21526019Mc);
            }
        }
    }
}
