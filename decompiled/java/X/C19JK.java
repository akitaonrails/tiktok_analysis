package X;

import Y.ARunnableS101S0200000_32;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.yoga.a;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19JK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JK extends C1049820dQS<C19JN> {
    public C14QK LLLZIIL;
    public C14Q6 LLLZIL;
    public C14QH LLLZL;
    public C14QG LLLZLL;
    public C14QG LLLZLZ;
    public a LLLZZ;

    @Override // X.C19JH
    public final View LIZ() {
        C19JN c19jn = new C19JN(this.LL);
        c19jn.LLILLL = this;
        this.LLLZZ = c19jn.getYogaNode();
        return c19jn;
    }

    @Override // X.C19JH
    public final void LJJI() {
        ImageView.ScaleType scaleType;
        if (this.LLJJLIIIJLLLLLLLZ) {
            C1015690cXP c1015690cXP = this.LLLLLJIL;
            if (c1015690cXP != null) {
                c1015690cXP.LIZIZ();
            }
            C1015570cXD.LIZ().LIZJ.LIZ(this.LLIZ, this.LLJJJJJIL, new C19JT(this));
            return;
        }
        C1015690cXP c1015690cXP2 = this.LLLLLJIL;
        if (c1015690cXP2 != null) {
            c1015690cXP2.LIZIZ();
        }
        ImageView imageView = new ImageView(this.LL);
        C1015570cXD.LIZ().LIZJ.LIZIZ(this.LLIZ, this.LLJJJJJIL, imageView, this.LLILZ.getWidth(), this.LLILZ.getHeight(), new InterfaceC1015950cXp() { // from class: X.19JW
            @Override // X.InterfaceC1015950cXp
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    C19JK c19jk = this.LIZ;
                    C1015690cXP c1015690cXP3 = c19jk.LLLLLJIL;
                    if (c1015690cXP3 != null) {
                        c1015690cXP3.LIZ(c19jk);
                        return;
                    }
                    return;
                }
                C19JK c19jk2 = this.LIZ;
                C1015690cXP c1015690cXP4 = c19jk2.LLLLLJIL;
                if (c1015690cXP4 == null) {
                    return;
                }
                c1015690cXP4.LIZJ(c19jk2);
            }
        });
        if (!this.LLJL || (scaleType = this.LLJJJJLIIL) == ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(scaleType);
        }
        C19JR c19jr = new C19JR(-1, -1);
        c19jr.LIZ.put(14, Float.valueOf(C14QD.ABSOLUTE.intValue()));
        T t = this.LLILZ;
        if (t instanceof C19JN) {
            ((C19JN) t).addView(imageView, 0, c19jr);
            HandlerHook.viewPost(this.LLILZ, new ARunnableS101S0200000_32(imageView, this, 57));
        }
    }

    @Override // X.C19JH
    public final void LJJIFFI() {
        if (this.LLJJIJI) {
            this.LLLZZ.LJJIIZI(C19JM.ALL, this.LLJILJILJ);
        }
        if (this.LLJJIJIIJIL) {
            this.LLLZZ.LJJIIZI(C1015570cXD.LIZ().LJ ? C19JM.START : C19JM.LEFT, this.LLJILLL);
        }
        if (this.LLJJIJIL) {
            this.LLLZZ.LJJIIZI(C1015570cXD.LIZ().LJ ? C19JM.END : C19JM.RIGHT, this.LLJJ);
        }
        if (this.LLJJJ) {
            this.LLLZZ.LJJIIZI(C19JM.TOP, this.LLJJI);
        }
        if (this.LLJJJIL) {
            this.LLLZZ.LJJIIZI(C19JM.BOTTOM, this.LLJJIII);
        }
    }

    @Override // X.C1049820dQS
    public final C19JI LJJIIJZLJL() {
        return new C19JI(this) { // from class: X.19JJ
            public float LJIILL;
            public int LJIJJ;
            public int LJIJJLI;
            public int LJIL;
            public int LJJ;
            public float LJJI;
            public boolean LJJIFFI;
            public boolean LJJII;
            public boolean LJJIII;
            public boolean LJJIIJ;
            public boolean LJJIIJZLJL;
            public boolean LJJIIZ;
            public int LJIILJJIL = 1;
            public float LJIILLIIL = 1.0f;
            public int LJIIZILJ = C14QG.AUTO.intValue();
            public float LJIJ = -1.0f;
            public int LJIJI = C14QD.RELATIVE.intValue();

            @Override // X.C19JI
            public final ViewGroup.LayoutParams LIZ() {
                C1049820dQS c1049820dQS = this.LJIILIIL;
                boolean z = c1049820dQS instanceof C19JK;
                Float fValueOf = Float.valueOf(0.0f);
                if (z) {
                    if (((C19JK) c1049820dQS).LLLZIIL == C14QK.ROW && ((int) c1049820dQS.LLJIJIL) == -2 && this.LIZ == -1.0f && c1049820dQS.LLLII <= 0.0f) {
                        this.LIZ = -2.0f;
                        this.LJIILLIIL = 1.0f;
                        this.LJIILL = 1.0f;
                        this.LJJIFFI = true;
                        this.LJIJ = -1.0f;
                    }
                    if (((C19JK) c1049820dQS).LLLZIIL == C14QK.COLUMN && ((int) c1049820dQS.LLJILJIL) == -2 && this.LIZIZ == -1.0f && c1049820dQS.LLLII <= 0.0f) {
                        this.LIZIZ = -2.0f;
                        this.LJIILLIIL = 1.0f;
                        this.LJIILL = 1.0f;
                        this.LJJIFFI = true;
                        this.LJIJ = -1.0f;
                    }
                }
                C19JR c19jr = new C19JR((int) this.LIZ, (int) this.LIZIZ);
                c19jr.LIZ.put(18, Float.valueOf((int) (this.LJIIIZ ? this.LJFF : this.LJ)));
                c19jr.LIZ.put(20, Float.valueOf((int) (this.LJIIJ ? this.LJI : this.LJ)));
                c19jr.LIZ.put(17, Float.valueOf((int) (this.LJIIJJI ? this.LJII : this.LJ)));
                c19jr.LIZ.put(19, Float.valueOf((int) (this.LJIIL ? this.LJIIIIZZ : this.LJ)));
                c19jr.LIZ.put(5, Float.valueOf(this.LJIILJJIL));
                c19jr.LIZ.put(9, Float.valueOf(this.LJIIZILJ));
                c19jr.LIZ.put(6, Float.valueOf(this.LJIILL));
                c19jr.LIZ.put(7, Float.valueOf(this.LJIILLIIL));
                c19jr.LIZ.put(27, Float.valueOf(this.LIZJ));
                c19jr.LIZ.put(28, Float.valueOf(this.LIZLLL));
                if (this.LJJIFFI) {
                    c19jr.LIZ.put(8, Float.valueOf(this.LJIJ));
                }
                c19jr.LIZ.put(14, Float.valueOf(this.LJIJI));
                if (this.LJJII) {
                    c19jr.LIZ.put(10, Float.valueOf(this.LJIJJ));
                }
                if (this.LJJIII) {
                    c19jr.LIZ.put(12, Float.valueOf(this.LJIJJLI));
                }
                if (this.LJJIIJ) {
                    c19jr.LIZ.put(11, Float.valueOf(this.LJIL));
                }
                if (this.LJJIIJZLJL) {
                    c19jr.LIZ.put(13, Float.valueOf(this.LJJ));
                }
                if (this.LJJIIZ) {
                    float f = this.LIZ;
                    if ((f != -1.0f || this.LIZIZ != -1.0f) && (f == -2.0f || this.LIZIZ == -2.0f)) {
                        float f2 = this.LJJI;
                        if (f2 > 0.0f) {
                            c19jr.LIZ.put(25, Float.valueOf(f2));
                            c19jr.LIZ.put(7, fValueOf);
                            c19jr.LIZ.put(6, fValueOf);
                            return c19jr;
                        }
                    }
                }
                return c19jr;
            }

            @Override // X.C19JI
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LayoutParams{mOrder=");
                sbLIZ.append(this.LJIILJJIL);
                sbLIZ.append(", mFlexGrow=");
                sbLIZ.append(this.LJIILL);
                sbLIZ.append(", mFlexShrink=");
                sbLIZ.append(this.LJIILLIIL);
                sbLIZ.append(", mAlignSelf=");
                sbLIZ.append(this.LJIIZILJ);
                sbLIZ.append(", mFlexBasis=");
                sbLIZ.append(this.LJIJ);
                sbLIZ.append(", mPosition=");
                sbLIZ.append(this.LJIJI);
                sbLIZ.append(", mTop=");
                sbLIZ.append(this.LJIJJ);
                sbLIZ.append(", mBottom=");
                sbLIZ.append(this.LJIJJLI);
                sbLIZ.append(", mLeft=");
                sbLIZ.append(this.LJIL);
                sbLIZ.append(", mRight=");
                sbLIZ.append(this.LJJ);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
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
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
                */
            @Override // X.C19JI
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
                /*
                    Method dump skipped, instruction units count: 332
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19JJ.LIZIZ(android.content.Context, java.lang.String, java.lang.String):void");
            }
        };
    }

    @Override // X.C1049820dQS, X.C19JH
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        this.LLLZZ.LJIJI(this.LLLZIIL);
        this.LLLZZ.LJJIJLIJ(this.LLLZIL);
        this.LLLZZ.LJJII(this.LLLZL);
        this.LLLZZ.LJIIJ(this.LLLZLL);
        this.LLLZZ.LJIIIZ(this.LLLZLZ);
        this.LLLZZ.LJIIL();
        if (C1015570cXD.LIZ().LJ && C1100060ejU.LIZLLL(this.LL)) {
            this.LLLZZ.LJIILL(C0WLU.RTL);
        }
    }

    public C19JK(Context context) {
        super(context);
        this.LLLZIIL = C14QK.ROW;
        this.LLLZIL = C14Q6.NO_WRAP;
        this.LLLZL = C14QH.FLEX_START;
        C14QG c14qg = C14QG.STRETCH;
        this.LLLZLL = c14qg;
        this.LLLZLZ = c14qg;
    }

    @Override // X.C19JH
    public final void LJIL(Drawable drawable) {
        ImageView.ScaleType scaleType;
        ImageView imageView = new ImageView(this.LL);
        imageView.setImageDrawable(drawable);
        if (this.LLJL && (scaleType = this.LLJJJJLIIL) != ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(scaleType);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        C19JR c19jr = new C19JR(-1, -1);
        c19jr.LIZ.put(14, Float.valueOf(C14QD.ABSOLUTE.intValue()));
        T t = this.LLILZ;
        if (t instanceof C19JN) {
            ((C19JN) t).addView(imageView, 0, c19jr);
            HandlerHook.viewPost(this.LLILZ, new ARunnableS101S0200000_32(imageView, this, 57));
        }
    }

    @Override // X.C1049820dQS
    public final void LJJIII(C19JH c19jh) {
        super.LJJIII(c19jh);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C19JH
    public final void LJIJ(String str, String str2) {
        super.LJIJ(str, str2);
        str.getClass();
        switch (str.hashCode()) {
            case -1063257157:
                if (str.equals("alignItems")) {
                    this.LLLZLL = C14QG.fromString(str2);
                }
                break;
            case -975171706:
                if (str.equals("flexDirection")) {
                    this.LLLZIIL = C14QK.fromString(str2);
                }
                break;
            case -752601676:
                if (str.equals("alignContent")) {
                    this.LLLZLZ = C14QG.fromString(str2);
                }
                break;
            case 1744216035:
                if (str.equals("flexWrap")) {
                    this.LLLZIL = C14Q6.fromString(str2);
                }
                break;
            case 1860657097:
                if (str.equals("justifyContent")) {
                    this.LLLZL = C14QH.fromString(str2);
                }
                break;
        }
    }

    @Override // X.C1049820dQS
    public final void LJJIIJ(C19JH c19jh, ViewGroup.LayoutParams layoutParams) {
        ((ArrayList) this.LLLZI).add(c19jh);
        View view = c19jh.LLILZ;
        if (view != null) {
            ((ViewGroup) this.LLILZ).addView(view, layoutParams);
        }
    }
}
