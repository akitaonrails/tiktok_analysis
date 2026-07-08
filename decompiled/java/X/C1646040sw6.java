package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import nv7.c0;

/* JADX INFO: renamed from: X.0sw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646040sw6 extends AbstractC1653180t7c implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final String LLJILLL;
    public final boolean LLJJ;
    public final C1DRG LLJJI;
    public final boolean LLJJIII;
    public final C1664740tQG LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646040sw6.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "DMPlayGroundScene";
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.NON_COVER_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(26));
        C1664590tQ1.LIZLLL(this, "DMPlayGroundScene", false, AFwS266S0000000_25.get$arr$(27), 2);
        C1664600tQ2.LIZ(this, "DMPlayGroundScene", new AwS604S0100000_25(this, 31));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.wxb);
        if (C1462920oAk.LIZLLL()) {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                iLIZIZ = c1660590tJZ.LIZIZ();
            } else {
                iLIZIZ = 0;
            }
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = iLIZIZ + iLIZIZ2;
                    C786410Ut5.W5(viewFindViewById, layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.enq, viewGroup, false);
    }

    public C1646040sw6(String str, boolean z, C1DRG c1drg, boolean z2) {
        this.LLJILLL = str;
        this.LLJJ = z;
        this.LLJJI = c1drg;
        this.LLJJIII = z2;
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
    }
}
