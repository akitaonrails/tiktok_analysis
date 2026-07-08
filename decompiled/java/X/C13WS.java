package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: X.13WS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WS {
    public static final C13WS LIZ = new C13WS();
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        C1553670qX7 c1553670qX7 = C1553670qX7.LIZ;
        LIZIZ = C1553670qX7.LIZ();
        c1553670qX7.getClass();
        LIZJ = "offlineX";
    }

    public static void LIZ(final C13WQ c13wq, String str) {
        C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
        HashMap map = new HashMap();
        map.put(LIZIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str)));
        AbstractC1552040qUU abstractC1552040qUU = new AbstractC1552040qUU() { // from class: X.13WR
            @Override // X.AbstractC1552040qUU
            public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                C13WQ c13wq2 = c13wq;
                if (c13wq2 != null) {
                    c13wq2.onFail();
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                C13WQ c13wq2 = c13wq;
                if (c13wq2 != null) {
                    c13wq2.onSuccess();
                }
            }
        };
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setListener(abstractC1552040qUU);
        if (c1551950qULLJIILL != null) {
            c1551950qULLJIILL.LIZ("", map, optionCheckUpdateParams);
        }
    }
}
