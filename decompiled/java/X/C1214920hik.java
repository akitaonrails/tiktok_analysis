package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.IGroupMediaVMFactory;

/* JADX INFO: renamed from: X.0hik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214920hik {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile C904350Zdp LIZ;
    public volatile C904360Zdq LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1214920hik.class, "singleMediaVMFactory", "getSingleMediaVMFactory()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/ISingleMediaVMFactory;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1214920hik.class, "groupMediaVMFactory", "getGroupMediaVMFactory()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/IGroupMediaVMFactory;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final IGroupMediaVMFactory LIZIZ() {
        C904360Zdq c904360Zdq = this.LIZIZ;
        if (c904360Zdq == null) {
            synchronized (this) {
                c904360Zdq = this.LIZIZ;
                if (c904360Zdq == null) {
                    C904360Zdq c904360Zdq2 = (C904360Zdq) C1807670x8n.LLLLLLLZIL();
                    this.LIZIZ = c904360Zdq2;
                    return c904360Zdq2;
                }
            }
        }
        return c904360Zdq;
    }

    public final ViewModelProvider.Factory LIZ(EnumC1216730hlf enumC1216730hlf) {
        int i = C1214910hij.LIZ[enumC1216730hlf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LIZIZ();
            }
            throw new C1954807lC();
        }
        C904350Zdp c904350Zdp = this.LIZ;
        if (c904350Zdp != null) {
            return c904350Zdp;
        }
        synchronized (this) {
            C904350Zdp c904350Zdp2 = this.LIZ;
            if (c904350Zdp2 == null) {
                C904350Zdp c904350Zdp3 = (C904350Zdp) C1807670x8n.u();
                this.LIZ = c904350Zdp3;
                return c904350Zdp3;
            }
            return c904350Zdp2;
        }
    }
}
