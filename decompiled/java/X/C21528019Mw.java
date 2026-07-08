package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21528019Mw {
    public View LIZ;
    public int LIZIZ;
    public C19N9[] LJII;
    public C2267601DpG LJIIIIZZ;
    public int[] LJIIL;
    public double[] LJIILIIL;
    public double[] LJIILJJIL;
    public String[] LJIILL;
    public int[] LJIILLIIL;
    public HashMap<String, AbstractC21528319Mz> LJIJJLI;
    public HashMap<String, C19N0> LJIL;
    public HashMap<String, C19N1> LJJ;
    public C21528219My[] LJJI;
    public int LIZJ = -1;
    public final C21526519Mh LIZLLL = new C21526519Mh();
    public final C21526519Mh LJ = new C21526519Mh();
    public final C21526619Mi LJFF = new C21526619Mi();
    public final C21526619Mi LJI = new C21526619Mi();
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = 0.0f;
    public float LJIIJJI = 1.0f;
    public final float[] LJIIZILJ = new float[4];
    public final ArrayList<C21526519Mh> LJIJ = new ArrayList<>();
    public final float[] LJIJI = new float[1];
    public final ArrayList<AbstractC21525919Mb> LJIJJ = new ArrayList<>();
    public int LJJIFFI = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" start: x: ");
        sbLIZ.append(this.LIZLLL.LLILZIL);
        sbLIZ.append(" y: ");
        sbLIZ.append(this.LIZLLL.LLILZLL);
        sbLIZ.append(" end: x: ");
        sbLIZ.append(this.LJ.LLILZIL);
        sbLIZ.append(" y: ");
        sbLIZ.append(this.LJ.LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21528019Mw(View view) {
        this.LIZ = view;
        this.LIZIZ = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
        }
    }

    public final void LIZJ(C21526519Mh c21526519Mh) {
        float x = (int) this.LIZ.getX();
        float y = (int) this.LIZ.getY();
        float width = this.LIZ.getWidth();
        float height = this.LIZ.getHeight();
        c21526519Mh.LLILZIL = x;
        c21526519Mh.LLILZLL = y;
        c21526519Mh.LLIZ = width;
        c21526519Mh.LLIZLLLIL = height;
    }

    public final float LIZ(float[] fArr, float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.LJIIJJI;
            if (f4 != 1.0d) {
                float f5 = this.LJIIJ;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        C19NB c19nb = this.LIZLLL.LL;
        float f6 = Float.NaN;
        for (C21526519Mh c21526519Mh : this.LJIJ) {
            C19NB c19nb2 = c21526519Mh.LL;
            if (c19nb2 != null) {
                float f7 = c21526519Mh.LLILLL;
                if (f7 < f) {
                    c19nb = c19nb2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = c21526519Mh.LLILLL;
                }
            }
        }
        if (c19nb != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) c19nb.LIZ(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) c19nb.LIZIZ(d);
            }
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0d69  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0d75  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0d79  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0d9d  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x045f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0489 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:697:0x048f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x049f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x04bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:716:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:757:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x05d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x065c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:763:0x067f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:764:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x06f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x071f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x074c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0664 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:778:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0727 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:795:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:796:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:808:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:814:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:818:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:886:0x0bcd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x0bd4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:888:0x0bdb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:889:0x0be2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:890:0x0be9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:891:0x0bf0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:892:0x0bf7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:893:0x0bfe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:894:0x0c05 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:895:0x0c0c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0c13 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:897:0x0c24 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:898:0x0c35 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:899:0x0c46 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:917:0x0a88 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v198, types: [X.1DpG] */
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
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
    public final void LIZLLL(int r42, int r43, long r44) {
        /*
            Method dump skipped, instruction units count: 3962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21528019Mw.LIZLLL(int, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(float r28, long r29, android.view.View r31, X.C1781840wT8 r32) {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21528019Mw.LIZIZ(float, long, android.view.View, X.0wT8):boolean");
    }
}
