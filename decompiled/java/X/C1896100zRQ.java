package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896100zRQ extends AbstractC1896110zRR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String collectionId;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        InterfaceC1896120zRS interfaceC1896120zRS = (InterfaceC1896120zRS) xBaseParamModel;
        String jumpPage = interfaceC1896120zRS.getJumpPage();
        if (jumpPage != null && (collectionId = interfaceC1896120zRS.getCollectionId()) != null) {
            if (Intrinsics.LJFF(jumpPage, "tab")) {
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    boolValueOf2 = Boolean.valueOf(abstractC1896090zRP.LJJIIJ());
                } else {
                    boolValueOf2 = null;
                }
                if (Intrinsics.LJFF(boolValueOf2, Boolean.TRUE)) {
                    AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                    if (abstractC1896090zRP2 != null) {
                        abstractC1896090zRP2.LJJIJL("tab", collectionId);
                    }
                } else {
                    AbstractC1896090zRP abstractC1896090zRP3 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                    if (abstractC1896090zRP3 != null) {
                        abstractC1896090zRP3.LJJIJL("detail", collectionId);
                    }
                }
            } else if (Intrinsics.LJFF(jumpPage, "detail")) {
                C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP4 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                if (abstractC1896090zRP4 != null) {
                    boolValueOf = Boolean.valueOf(abstractC1896090zRP4.LJJIIJ());
                } else {
                    boolValueOf = null;
                }
                if (((Number) C274750Apl.LIZ.getValue()).intValue() == 1 && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    AbstractC1896090zRP abstractC1896090zRP5 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                    if (abstractC1896090zRP5 != null) {
                        abstractC1896090zRP5.LJJIJL("tab", collectionId);
                    }
                } else {
                    AbstractC1896090zRP abstractC1896090zRP6 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                    if (abstractC1896090zRP6 != null) {
                        abstractC1896090zRP6.LJJIJL("detail", collectionId);
                    }
                }
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1896130zRT.class, null), "");
        }
    }
}
