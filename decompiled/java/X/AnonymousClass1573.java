package X;

import Y.ARunnableS64S0300000_31;
import android.os.Looper;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1573, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1573 extends AnonymousClass1570 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC204675156z interfaceC204675156z = (InterfaceC204675156z) xBaseParamModel;
        String imageUrl = interfaceC204675156z.getImageUrl();
        if (imageUrl != null && imageUrl.length() != 0) {
            if (!Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                C20750016Hq c20750016Hq = new C20750016Hq(completionBlock, interfaceC204675156z, this, 1);
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(interfaceC204675156z.getImageUrl());
                c1331670kl3LJIIIZ.LJJIIJZLJL = AnonymousClass1574.LL;
                c1331670kl3LJIIIZ.LJJIIJ(c20750016Hq);
                return;
            }
            C823050WQl.LIZLLL().execute(new ARunnableS64S0300000_31(interfaceC204675156z, completionBlock, this, 14));
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "image url is empty", null, 4);
    }
}
