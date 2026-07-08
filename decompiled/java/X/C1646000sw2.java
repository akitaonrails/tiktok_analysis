package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import nv7.c0;

/* JADX INFO: renamed from: X.0sw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646000sw2 extends AbstractC1653180t7c implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1DRG LLJILLL;
    public final C1664740tQG LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646000sw2.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "PhotoSwapScene";
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        c0.LIZ.getClass();
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.NON_COVER_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C1646000sw2(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(176));
        C1664590tQ1.LIZLLL(this, "PhotoSwapScene", false, AFwS266S0000000_25.get$arr$(177), 2);
        C1664600tQ2.LIZ(this, "PhotoSwapScene", new AwS604S0100000_25(this, 219));
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.er2, viewGroup, false);
    }
}
