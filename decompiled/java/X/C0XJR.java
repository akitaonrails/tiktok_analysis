package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XJR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJR extends C0XJT {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List listLJJLIIIJILLIZJL;
        C807360Vlm c807360VlmLJIIIIZZ = C2211631BhB.LJIIIIZZ();
        String str = null;
        if (c807360VlmLJIIIIZZ != null) {
            C0XJS c0xjs = (C0XJS) C1909107dp.LIZJ(C0XJS.class, null);
            String str2 = c807360VlmLJIIIIZZ.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            c0xjs.setPre(str2);
            String str3 = c807360VlmLJIIIIZZ.LIZLLL;
            if (str3 == null) {
                str3 = "";
            }
            c0xjs.setPpre(str3);
            c0xjs.setTs(Long.valueOf(System.currentTimeMillis()));
            String str4 = c807360VlmLJIIIIZZ.LIZJ;
            if (str4 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str4, new String[]{e3.d}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 4) {
                str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            }
            c0xjs.setPage(str);
            completionBlock.onSuccess(c0xjs, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
    }
}
