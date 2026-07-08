package X;

import X.C360050E9r;
import android.app.Activity;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Enu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC375520Enu<I extends C360050E9r, O> implements InterfaceC375870EoT {
    public I LIZ;

    @Override // X.InterfaceC375870EoT
    public final Object LIZ() {
        return null;
    }

    @Override // X.InterfaceC375870EoT
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC375870EoT
    public final boolean LIZJ(C19A3 c19a3) {
        return false;
    }

    public abstract I LJFF(C0E48 c0e48);

    public abstract AbstractC375510Ent<I, O> LJI();

    @Override // X.InterfaceC375870EoT
    public final void LIZLLL(Object obj) {
        if ((obj instanceof C360050E9r) && obj != null) {
            this.LIZ = (I) obj;
        }
    }

    @Override // X.InterfaceC375870EoT
    public final String LJ(C19A3 c19a3, C0E48 c0e48, AwS406S0200000_5 awS406S0200000_5) {
        Activity activity;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C360050E9r c360050E9rLJFF = this.LIZ;
        if (c360050E9rLJFF == null) {
            c360050E9rLJFF = LJFF(c0e48);
        }
        C0EU3 c0eu3 = C0EU3.LIZ;
        String str = c360050E9rLJFF.LL;
        c0eu3.getClass();
        C0EU3.LIZIZ(c0e48, str);
        c360050E9rLJFF.LLIZ = jCurrentTimeMillis;
        c360050E9rLJFF.LJI();
        c360050E9rLJFF.LJ();
        AbstractC375510Ent<I, O> abstractC375510EntLJI = LJI();
        abstractC375510EntLJI.LLLLILI(c360050E9rLJFF);
        abstractC375510EntLJI.LLJJIJI = c19a3;
        NavigationScene navigationSceneLIZ = C214869197b.LIZ(c19a3, abstractC375510EntLJI.LLJJIII);
        abstractC375510EntLJI.LLJJIII = navigationSceneLIZ;
        C18YA c18ya = new C18YA();
        Integer numLLLLIL = abstractC375510EntLJI.LLLLIL();
        if (numLLLLIL == null) {
            c18ya.LIZ(new AwS549S0100000_5(abstractC375510EntLJI, 1046));
            c18ya.LIZ.LLJLLL = new AwS549S0100000_5(awS406S0200000_5, 1047);
            abstractC375510EntLJI.LLJJI = abstractC375510EntLJI.LLJJIII;
        } else {
            C1658150tFd.LIZJ(c19a3, abstractC375510EntLJI.LLLLJ());
            int iIntValue = numLLLLIL.intValue();
            String strLLLLJ = abstractC375510EntLJI.LLLLJ();
            C214799194j c214799194j = c18ya.LIZ;
            c214799194j.LLJJIJI = true;
            c214799194j.LLJILLL = iIntValue;
            c214799194j.LLJJ = strLLLLJ;
            c214799194j.LLJJI = abstractC375510EntLJI;
            c18ya.LIZ.LLJLLL = new AwS249S0300000_5(awS406S0200000_5, c19a3, abstractC375510EntLJI, 18);
            abstractC375510EntLJI.LLJJI = c19a3;
        }
        c18ya.LIZ.LLJZ = new AwS549S0100000_5(abstractC375510EntLJI, 1048);
        c18ya.LIZ.LLLILZJ = C1447800nmM.LIZ(c19a3);
        NavigationScene navigationScene = abstractC375510EntLJI.LLJJIII;
        if (navigationScene != null && (activity = navigationScene.mActivity) != null) {
            abstractC375510EntLJI.LLLLJI(c18ya, activity);
        }
        C214799194j c214799194j2 = c18ya.LIZ;
        abstractC375510EntLJI.LLJJ = c214799194j2;
        if (abstractC375510EntLJI.LLJJI instanceof NavigationScene) {
            if (c214799194j2 != null) {
                c214799194j2.LLLLL(navigationSceneLIZ);
            }
        } else if (c214799194j2 != null) {
            c214799194j2.LLLLL(c19a3);
        }
        return abstractC375510EntLJI.LLLLJ();
    }
}
