package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646020sw4 extends AbstractC1653180t7c implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final boolean LLJILLL;
    public final C1DRG LLJJ;
    public final boolean LLJJI;
    public final C1664740tQG LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646020sw4.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "DMGroupShotScene";
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
        return this.LLJJ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(24));
        C1664590tQ1.LIZLLL(this, "DMGroupShotScene", false, AFwS266S0000000_25.get$arr$(25), 2);
        C1664600tQ2.LIZ(this, "DMGroupShotScene", new AwS604S0100000_25(this, 30));
    }

    public C1646020sw4(boolean z, C1DRG c1drg, boolean z2) {
        this.LLJILLL = z;
        this.LLJJ = c1drg;
        this.LLJJI = z2;
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, C1645380sv2.class, "lazyBeautyFilter");
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eno, viewGroup, false);
    }
}
