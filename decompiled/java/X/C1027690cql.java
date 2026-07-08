package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027690cql extends AbstractC1027740cqq {
    public static final boolean LIZJ(long j, String str, int i) {
        Boolean boolValueOf;
        InterfaceC996520c2U interfaceC996520c2U = (InterfaceC996520c2U) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC996520c2U.class);
        if (interfaceC996520c2U != null) {
            boolValueOf = Boolean.valueOf(interfaceC996520c2U.MY0(i, String.valueOf(j), str));
        } else {
            boolValueOf = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            interfaceC996520c2U.Um2(String.valueOf(j), str);
        }
        return Intrinsics.LJFF(boolValueOf, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:127:0x01ec, B:129:0x01f2, B:132:0x01fa, B:134:0x0202, B:135:0x0207, B:137:0x020b, B:140:0x021a, B:139:0x0211, B:124:0x01d9), top: B:159:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r44, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r45, X.EnumC1063300dmC r46) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027690cql.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
