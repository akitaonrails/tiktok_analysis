package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606230Nq9 extends AbstractC606240NqA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC606250NqB interfaceC606250NqB = (InterfaceC606250NqB) xBaseParamModel;
        if (interfaceC606250NqB.getEventName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "empty event name", null, 4);
            return;
        }
        if (!C606170Nq3.LIZ(interfaceC606250NqB.getType())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid type ");
            sbLIZ.append(interfaceC606250NqB.getType());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, 0, "bridge context is empty", null, 4);
            return;
        }
        InterfaceC606320NqI interfaceC606320NqI = (InterfaceC606320NqI) interfaceC634840OvC.LIZIZ(InterfaceC606320NqI.class);
        if (interfaceC606320NqI == null) {
            C2382909Vj.LIZ(completionBlock, 0, "event center not registered", null, 4);
            return;
        }
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(completionBlock, (CompletionBlock<InterfaceC606260NqC>) this, (C606230Nq9) 99);
        String type = interfaceC606250NqB.getType();
        if (Intrinsics.LJFF(type, EnumC606160Nq2.METHOD.getValue())) {
            interfaceC606320NqI.LIZIZ(new C1775130wIJ(interfaceC634840OvC, interfaceC606250NqB.getEventName()));
            awS410S0200000_9.invoke();
        } else {
            if (!Intrinsics.LJFF(type, EnumC606160Nq2.EVENT.getValue())) {
                return;
            }
            interfaceC606320NqI.LIZ(new C1775130wIJ(interfaceC634840OvC, interfaceC606250NqB.getEventName()));
            awS410S0200000_9.invoke();
        }
    }
}
