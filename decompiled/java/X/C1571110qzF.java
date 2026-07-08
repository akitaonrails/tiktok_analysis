package X;

import android.widget.FrameLayout;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.HomepageToolBar;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar;

/* JADX INFO: renamed from: X.0qzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571110qzF implements IHomePageToolbar {
    public static final /* synthetic */ C1571110qzF LIZJ = new C1571110qzF();
    public final /* synthetic */ IHomePageToolbar LIZIZ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1571080qzC LIZ(FrameLayout frameLayout) {
        return this.LIZIZ.LIZ(frameLayout);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1570990qz3 LIZIZ(InterfaceC1617760sCU interfaceC1617760sCU) {
        return this.LIZIZ.LIZIZ(interfaceC1617760sCU);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1564200qo6 LIZJ(InterfaceC1617760sCU interfaceC1617760sCU) {
        return this.LIZIZ.LIZJ(interfaceC1617760sCU);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar
    public final InterfaceC1571000qz4 LIZLLL(InterfaceC1617760sCU interfaceC1617760sCU) {
        return this.LIZIZ.LIZLLL(interfaceC1617760sCU);
    }

    public C1571110qzF() {
        IHomePageToolbar iHomePageToolbar;
        Object objLIZ = C04TD.LIZ(IHomePageToolbar.class, false);
        if (objLIZ != null) {
            iHomePageToolbar = (IHomePageToolbar) objLIZ;
        } else {
            if (C04TD.LJJJZ == null) {
                synchronized (IHomePageToolbar.class) {
                    if (C04TD.LJJJZ == null) {
                        C04TD.LJJJZ = new HomepageToolBar();
                    }
                }
            }
            iHomePageToolbar = C04TD.LJJJZ;
        }
        this.LIZIZ = iHomePageToolbar;
    }
}
