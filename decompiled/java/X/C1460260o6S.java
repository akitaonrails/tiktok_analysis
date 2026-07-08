package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.dsl.AlsVMContainer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0o6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460260o6S extends AbstractC1664510tPt<InterfaceC379580EuS> implements InterfaceC379580EuS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public C19A3 LLJILLL;
    public final int LLJJ;
    public InterfaceC578430MmP LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460260o6S.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = 8;
    }

    @Override // X.InterfaceC379580EuS
    public void Yd() {
        C19A3 c19a3;
        C1DRG c1drgLJIIIZ;
        C1460250o6R c1460250o6R;
        if (!this.LLJJIII || (c19a3 = this.LLJILLL) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3)) == null || (c1460250o6R = (C1460250o6R) c1drgLJIIIZ.LJIIL(null, C1460250o6R.class)) == null) {
            return;
        }
        c1460250o6R.Yd();
    }

    @Override // X.InterfaceC379580EuS
    public void jh1() {
        C19A3 c19a3;
        C1DRG c1drgLJIIIZ;
        C1460250o6R c1460250o6R;
        if (!this.LLJJIII || (c19a3 = this.LLJILLL) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3)) == null || (c1460250o6R = (C1460250o6R) c1drgLJIIIZ.LJIIL(null, C1460250o6R.class)) == null) {
            return;
        }
        c1460250o6R.Oh2();
    }

    @Override // X.InterfaceC379580EuS
    public void m4() {
        C19A3 c19a3;
        C1DRG c1drgLJIIIZ;
        C1460250o6R c1460250o6R;
        if (!this.LLJJIII || (c19a3 = this.LLJILLL) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3)) == null || (c1460250o6R = (C1460250o6R) c1drgLJIIIZ.LJIIL(null, C1460250o6R.class)) == null) {
            return;
        }
        c1460250o6R.m4();
    }

    @Override // X.InterfaceC379580EuS
    public void vv0() {
        C19A3 c19a3;
        C1DRG c1drgLJIIIZ;
        C1460250o6R c1460250o6R;
        if (!this.LLJJIII || (c19a3 = this.LLJILLL) == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3)) == null || (c1460250o6R = (C1460250o6R) c1drgLJIIIZ.LJIIL(null, C1460250o6R.class)) == null) {
            return;
        }
        c1460250o6R.VB1();
    }

    public final VideoPublishEditModel z4() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // X.InterfaceC379580EuS
    public ViewGroup.MarginLayoutParams zN1() {
        InterfaceC578430MmP interfaceC578430MmP = this.LLJJI;
        if (interfaceC578430MmP == null) {
            return null;
        }
        return interfaceC578430MmP.getLayoutParams();
    }

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379580EuS
    public void X51(VESize vESize) {
        View view;
        FrameLayout frameLayout;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!this.LLJJIJI) {
            return;
        }
        C19A3 c19a3 = this.LLJILLL;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (c19a3 != null && (view = c19a3.mView) != null && (frameLayout = (FrameLayout) view.findViewById(R.id.grp)) != null && (i = vESize.width) != 0 && (i2 = vESize.height) != 0) {
            C1675310thJ.LIZ(i, i2, frameLayout);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i3 = marginLayoutParams.bottomMargin;
            } else {
                i3 = 0;
            }
            if (i3 < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                }
                C786410Ut5.a6(frameLayout, marginLayoutParams2);
            }
        }
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c3(), AlsVMContainer.class);
        C1647230sy1 c1647230sy1 = new C1647230sy1(0);
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        alsVMContainer.LL = c1647230sy1;
        T2("EditUILayerGroupComponent", AFwS261S0000000_22.get$arr$(173));
        this.LLJILLL = c19a3;
        X1("EditUILayerGroupComponent", new AwS388S0200000_22(this, c19a3, 112));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI;
        if (c1drg != null) {
            this.LLJJI = (InterfaceC578430MmP) c1drg.LJIIL(null, InterfaceC578430MmP.class);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C1460260o6S(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = c19a3;
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJ = R.layout.bfm;
        this.LLJJIII = true;
    }
}
