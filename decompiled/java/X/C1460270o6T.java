package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.dsl.AlsVMContainer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0o6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460270o6T extends AbstractC1664510tPt<InterfaceC379580EuS> implements InterfaceC379580EuS {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final InterfaceC1731706qJ LLJILJIL;
    public C19A3 LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final int LLJJ;
    public boolean LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460270o6T.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1460270o6T.class, "socialEditBottomUIApi", "getSocialEditBottomUIApi()Lcom/ss/android/ugc/aweme/social/creation/edit/component/bottombar/SocialEditBottomUIApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    @Override // X.InterfaceC379580EuS
    public void Yd() {
    }

    @Override // X.InterfaceC379580EuS
    public void jh1() {
    }

    @Override // X.InterfaceC379580EuS
    public void vv0() {
    }

    @Override // X.InterfaceC379580EuS
    public ViewGroup.MarginLayoutParams zN1() {
        return null;
    }

    private final InterfaceC2221571BxD F4() {
        return (InterfaceC2221571BxD) this.LLJILLL.getValue(this, LLJJIII[1]);
    }

    public final VideoPublishEditModel z4() {
        return (VideoPublishEditModel) this.LLJILJIL.getValue(this, LLJJIII[0]);
    }

    @Override // X.InterfaceC379580EuS
    public void m4() {
        InterfaceC2221571BxD interfaceC2221571BxDF4 = F4();
        if (interfaceC2221571BxDF4 != null) {
            interfaceC2221571BxDF4.m4();
        }
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
        if (!this.LLJJI) {
            return;
        }
        C19A3 c19a3 = this.LLJILJILJ;
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
        T2("EditUILayerGroupComponent", AFwS261S0000000_22.get$arr$(137));
        this.LLJILJILJ = c19a3;
        X1("EditUILayerGroupComponent", new AwS388S0200000_22(this, c19a3, 50));
    }

    public C1460270o6T(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC2221571BxD.class, null);
        this.LLJJ = R.layout.f9o;
    }
}
