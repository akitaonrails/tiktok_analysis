package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import defpackage.u;
import kotlin.jvm.internal.AwS637S0100000_23;

/* JADX INFO: renamed from: X.0qLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546610qLj extends u {
    public final String LLILLL = "ReuseKitViewMethodIDL";

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        u.b bVar = (u.b) xBaseParamModel;
        C1546500qLY c1546500qLY = C1546560qLe.LIZ;
        C1546510qLZ c1546510qLZ = new C1546510qLZ();
        c1546510qLZ.LJFF = bVar.getBiz();
        Number volumn = bVar.getVolumn();
        if (volumn != null) {
            c1546510qLZ.LIZLLL = ((Integer) volumn).intValue();
        }
        Number expiredTimeInSeconds = bVar.getExpiredTimeInSeconds();
        if (expiredTimeInSeconds != null) {
            c1546510qLZ.LJI = ((Integer) expiredTimeInSeconds).intValue();
        }
        c1546510qLZ.LJIIL = bVar.getAllowSchemaList();
        c1546510qLZ.LJIILIIL = bVar.getDenySchemaList();
        String matchCacheRegex = bVar.getMatchCacheRegex();
        if (matchCacheRegex != null) {
            if (matchCacheRegex.length() < 5) {
                C1530030puz.LIZ(this.LLILLL, "Invalid param, matchCacheRegex too short...", null);
            } else {
                c1546510qLZ.LJIILJJIL = matchCacheRegex;
            }
        }
        c1546510qLZ.LJIIIZ = new AwS637S0100000_23(c1546510qLZ, 18);
        Boolean bool = Boolean.TRUE;
        c1546500qLY.getClass();
        C1546500qLY.LJI(c1546510qLZ, bool);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(u.c.class, null), "");
    }
}
