package X;

import Y.AObjectS245S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0o8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461380o8G extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final InterfaceC1461390o8H LLJI;
    public final C1DRG LLJIJIL;
    public final C1664750tQH LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461380o8G.class, "editGestureApi", "getEditGestureApi()Lcom/ss/android/ugc/gamora/editor/gesture/EditGestureApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1664750tQH c1664750tQH = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        ((InterfaceC1452130ntL) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).tt1().LIZ(this, new AObjectS245S0100000_22(this, 274));
        ((InterfaceC1452130ntL) this.LLJILJIL.getValue(this, interfaceC2217461BqaArr[0])).lF0().LIZ(this, new AObjectS245S0100000_22(this, 275));
        ((InterfaceC1452130ntL) this.LLJILJIL.getValue(this, interfaceC2217461BqaArr[0])).gc0().LIZ(this, new AObjectS245S0100000_22(this, 276));
    }

    public C1461380o8G(InterfaceC1461390o8H interfaceC1461390o8H, C1DRG c1drg) {
        this.LLJI = interfaceC1461390o8H;
        this.LLJIJIL = c1drg;
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1452130ntL.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new View(requireSceneContext());
    }
}
