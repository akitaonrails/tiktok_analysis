package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603190NlF extends AbstractC603160NlC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC603180NlE interfaceC603180NlE = (InterfaceC603180NlE) xBaseParamModel;
        Number scene = interfaceC603180NlE.getScene();
        if (!Intrinsics.LJFF(scene, 1) && !Intrinsics.LJFF(scene, 2)) {
            if (Intrinsics.LJFF(scene, 3)) {
                String schema = interfaceC603180NlE.getSchema();
                if (C123100dR.LIZ(schema) && schema != null) {
                    C671610QVz.LJ = System.currentTimeMillis();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C667220QFc(schema, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        String schema2 = interfaceC603180NlE.getSchema();
        if (!C123100dR.LIZ(schema2) || schema2 == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0QFZ(schema2, interfaceC603180NlE, null), 3);
    }
}
