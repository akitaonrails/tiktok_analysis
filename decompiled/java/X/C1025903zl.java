package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;

/* JADX INFO: renamed from: X.03zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1025903zl {
    @InterfaceC1294060jmO
    public static final <T extends InterfaceC1025703zj<PdpViewModel>> T LIZ(PdpViewModel pdpViewModel, Class<T> cls) {
        C987903td c987903td = pdpViewModel.LLLJIL;
        c987903td.getClass();
        T t = (T) C1025503zh.LIZ(cls, new BizIdentity("", c987903td.LIZ, c987903td.LIZIZ), pdpViewModel);
        if (t != null) {
            return t;
        }
        return pdpViewModel;
    }

    public static final C987903td LIZIZ(Integer num, C040B c040b) {
        String strLIZIZ = C955103oL.LIZIZ(num);
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(num), "product_detail", null, c040b, 4);
        EnumC969503qf.Companion.getClass();
        return C969603qg.LIZIZ(iLJIIJJI, "product_detail", strLIZIZ);
    }
}
