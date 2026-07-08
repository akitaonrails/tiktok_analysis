package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724570uyl extends AbstractC1724580uym {
    public final String LLILLL = "invalid Parameter";

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1055640dZq interfaceC1055640dZq;
        InterfaceC1724590uyn interfaceC1724590uyn = (InterfaceC1724590uyn) xBaseParamModel;
        String actionType = interfaceC1724590uyn.getActionType();
        List<InterfaceC1724600uyo> actionList = interfaceC1724590uyn.getActionList();
        EnumC1707380uX2[] enumC1707380uX2ArrValues = EnumC1707380uX2.values();
        int length = enumC1707380uX2ArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Intrinsics.LJFF(enumC1707380uX2ArrValues[i].getActionType(), actionType)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            C2382909Vj.LIZ(completionBlock, -3, this.LLILLL, null, 4);
            return;
        }
        if (actionList != null && !actionList.isEmpty()) {
            Iterator<InterfaceC1724600uyo> it2 = actionList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getMethodName().length() == 0) {
                    C2382909Vj.LIZ(completionBlock, -3, this.LLILLL, null, 4);
                    return;
                }
            }
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ != null && (interfaceC1055640dZq = c1874950ytJ.LJIIIIZZ) != null) {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(actionList, 10));
                Iterator<InterfaceC1724600uyo> it3 = actionList.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().getMethodName());
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(actionList, 10));
                Iterator<InterfaceC1724600uyo> it4 = actionList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new JSONObject(it4.next().getParams()));
                }
                interfaceC1055640dZq.LIZIZ(interfaceC634840OvC, actionType, arrayList, arrayList2);
            }
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1724610uyp.class)), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, this.LLILLL, null, 4);
    }
}
