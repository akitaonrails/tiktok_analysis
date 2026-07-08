package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.middle.IntermediateAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;

/* JADX INFO: renamed from: X.0QMT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QMT extends C0QMV {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        IntermediateAbility intermediateAbility;
        String containerID;
        View view2;
        SearchTopFragmentAbility searchTopFragmentAbility;
        String containerID2;
        C0QMX c0qmx = (C0QMX) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view2 = interfaceC634840OvC.getView()) != null && (searchTopFragmentAbility = (SearchTopFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJ(view2, null), SearchTopFragmentAbility.class, null)) != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c0qmx.getOffset()));
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                if (!searchTopFragmentAbility.sI(iLIZIZ, containerID2)) {
                    throw new IllegalStateException("top tab scroll failed");
                }
            } else {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (view = interfaceC634840OvC3.getView()) != null && (intermediateAbility = (IntermediateAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IntermediateAbility.class, null)) != null) {
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(c0qmx.getOffset()));
                    c0qmx.getAnimated();
                    if (!intermediateAbility.BL(iLIZIZ2)) {
                        throw new IllegalStateException("scroll failed");
                    }
                } else {
                    throw new IllegalStateException("vscope failed");
                }
            }
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID = interfaceC634840OvC4.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((C0QMZ) C1909107dp.LIZJ(C0QMZ.class, containerID), "true");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, String.valueOf(e.getMessage()), null, 4);
        }
    }
}
