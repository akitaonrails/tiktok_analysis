package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;

/* JADX INFO: renamed from: X.0x8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807680x8o {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public final C19EG LIZ;
    public final InterfaceC1445330niN LIZIZ;
    public final IMCreativeRecordModel LIZJ;
    public IMCreativeEditModel LIZLLL;
    public final C19EG LJ;
    public final C19EG LJFF;
    public final Bundle LJI = new Bundle();
    public volatile InterfaceC1807800x90 LJII;
    public volatile InterfaceSurfaceHolderCallbackC2173441A4g LJIIIIZZ;
    public volatile InterfaceTextureViewSurfaceTextureListenerC2173451A4h LJIIIZ;
    public volatile InterfaceC1821380xUu LJIIJ;
    public volatile InterfaceC1346105Op LJIIJJI;
    public volatile InterfaceC1650320t30 LJIIL;
    public volatile InterfaceC1807690x8p LJIILIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1807680x8o.class, "statusBarAndNavigationController", "getStatusBarAndNavigationController()Lcom/ss/android/ugc/aweme/im/creative/common/api/system/IMStatusBarAndNavigationController;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1807680x8o.class, "surfaceViewManager", "getSurfaceViewManager()Lcom/ss/android/ugc/aweme/im/creative/common/api/surface/IIMSurfaceViewManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1807680x8o.class, "textureViewManager", "getTextureViewManager()Lcom/ss/android/ugc/aweme/im/creative/common/api/surface/IIMTextureViewManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1807680x8o.class, "creativeEventTracker", "getCreativeEventTracker()Lcom/ss/android/ugc/aweme/im/creative/common/api/metric/IMCreativeEventTracker;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1807680x8o.class, "screenAdapter", "getScreenAdapter()Lcom/ss/android/ugc/aweme/im/creative/common/api/system/IMScreenAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1807680x8o.class, "surfaceAnimationAdapter", "getSurfaceAnimationAdapter()Lcom/ss/android/ugc/aweme/im/creative/common/api/system/IMSurfaceAnimationAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1807680x8o.class, "activityResultManager", "getActivityResultManager()Lcom/ss/android/ugc/aweme/im/creative/common/api/system/IMCreativeActivityResultManager;", 0);
        c09r3.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public final InterfaceC1807690x8p LIZ() {
        InterfaceC1807690x8p interfaceC1807690x8p = this.LJIILIIL;
        if (interfaceC1807690x8p == null) {
            synchronized (this) {
                interfaceC1807690x8p = this.LJIILIIL;
                if (interfaceC1807690x8p == null) {
                    1HiV r0 = (1HiV) C1807670x8n.LJLJJI();
                    this.LJIILIIL = r0;
                    return r0;
                }
            }
        }
        return interfaceC1807690x8p;
    }

    public final InterfaceC1821380xUu LIZIZ() {
        InterfaceC1821380xUu interfaceC1821380xUu = this.LJIIJ;
        if (interfaceC1821380xUu == null) {
            synchronized (this) {
                interfaceC1821380xUu = this.LJIIJ;
                if (interfaceC1821380xUu == null) {
                    1Hi6 r0 = (1Hi6) C1807670x8n.LJLJI();
                    this.LJIIJ = r0;
                    return r0;
                }
            }
        }
        return interfaceC1821380xUu;
    }

    public final InterfaceSurfaceHolderCallbackC2173441A4g LJ() {
        InterfaceSurfaceHolderCallbackC2173441A4g interfaceSurfaceHolderCallbackC2173441A4g = this.LJIIIIZZ;
        if (interfaceSurfaceHolderCallbackC2173441A4g == null) {
            synchronized (this) {
                interfaceSurfaceHolderCallbackC2173441A4g = this.LJIIIIZZ;
                if (interfaceSurfaceHolderCallbackC2173441A4g == null) {
                    1Hiv r0 = (1Hiv) C1807670x8n.LJLLL();
                    this.LJIIIIZZ = r0;
                    return r0;
                }
            }
        }
        return interfaceSurfaceHolderCallbackC2173441A4g;
    }

    public final InterfaceTextureViewSurfaceTextureListenerC2173451A4h LJFF() {
        InterfaceTextureViewSurfaceTextureListenerC2173451A4h interfaceTextureViewSurfaceTextureListenerC2173451A4h = this.LJIIIZ;
        if (interfaceTextureViewSurfaceTextureListenerC2173451A4h == null) {
            synchronized (this) {
                interfaceTextureViewSurfaceTextureListenerC2173451A4h = this.LJIIIZ;
                if (interfaceTextureViewSurfaceTextureListenerC2173451A4h == null) {
                    1Hiw r0 = (1Hiw) C1807670x8n.LJLLLL();
                    this.LJIIIZ = r0;
                    return r0;
                }
            }
        }
        return interfaceTextureViewSurfaceTextureListenerC2173451A4h;
    }

    public final InterfaceC1346105Op LIZJ() {
        InterfaceC1346105Op interfaceC1346105Op = this.LJIIJJI;
        if (interfaceC1346105Op == null) {
            synchronized (this) {
                interfaceC1346105Op = this.LJIIJJI;
                if (interfaceC1346105Op == null) {
                    1HiW r0 = (1HiW) C1807670x8n.LJLJJL(this.LJ);
                    this.LJIIJJI = r0;
                    return r0;
                }
            }
        }
        return interfaceC1346105Op;
    }

    public final InterfaceC1650320t30 LIZLLL() {
        InterfaceC1650320t30 interfaceC1650320t30 = this.LJIIL;
        if (interfaceC1650320t30 == null) {
            synchronized (this) {
                interfaceC1650320t30 = this.LJIIL;
                if (interfaceC1650320t30 == null) {
                    1HiY r0 = (1HiY) C1807670x8n.LJLJL(this.LJFF);
                    this.LJIIL = r0;
                    return r0;
                }
            }
        }
        return interfaceC1650320t30;
    }

    public C1807680x8o(C19EG c19eg, InterfaceC1445330niN interfaceC1445330niN, IMCreativeRecordModel iMCreativeRecordModel, IMCreativeEditModel iMCreativeEditModel) {
        this.LIZ = c19eg;
        this.LIZIZ = interfaceC1445330niN;
        this.LIZJ = iMCreativeRecordModel;
        this.LIZLLL = iMCreativeEditModel;
        this.LJ = c19eg;
        this.LJFF = c19eg;
    }
}
