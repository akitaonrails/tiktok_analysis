package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS117S1100000_3;

/* JADX INFO: renamed from: X.09Vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2383309Vn extends AbstractC2383209Vm {
    public final AtomicReference<CompletionBlock<C09VC>> LLILLL = new AtomicReference<>();

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        this.LLILLL.set(null);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC2383409Vo interfaceC2383409Vo = (InterfaceC2383409Vo) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C09WT c09wt = C09WT.LIZ;
        String currentUniqueId = interfaceC2383409Vo.getCurrentUniqueId();
        c09wt.getClass();
        if (currentUniqueId.length() > 0) {
            C09WT.LJFF.add(currentUniqueId);
        }
        this.LLILLL.set(completionBlock);
        AtomicReference<CompletionBlock<C09VC>> atomicReference = this.LLILLL;
        String currentUniqueId2 = interfaceC2383409Vo.getCurrentUniqueId();
        Map<String, Object> requestParams = interfaceC2383409Vo.getRequestParams();
        List<String> filePathList = interfaceC2383409Vo.getFilePathList();
        if (filePathList == null) {
            filePathList = C13BV.INSTANCE;
        }
        C23250099c.LIZLLL(C09WT.LIZIZ, null, null, new C13073059r(currentUniqueId2, requestParams, filePathList, new AwS117S1100000_3(atomicReference, this, containerID, 6), null), 3);
    }
}
