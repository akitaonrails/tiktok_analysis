package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.14Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20270914Tj extends AbstractC20270814Ti {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        final InterfaceC20271214Tm interfaceC20271214Tm = (InterfaceC20271214Tm) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20271014Tk.class, containerID);
        ((InterfaceC20271014Tk) xBaseModelLIZJ).setHitFrequencyControl(Boolean.valueOf(new AbstractC1201400hMw() { // from class: X.14Tl
            @Override // X.AbstractC1201400hMw
            public final long LIZJ() {
                Number interval = interfaceC20271214Tm.getInterval();
                if (interval != null) {
                    return interval.longValue();
                }
                return -1L;
            }

            @Override // X.AbstractC1201400hMw
            public final String LIZLLL() {
                return interfaceC20271214Tm.getKey();
            }

            @Override // X.AbstractC1201400hMw
            public final int LJ() {
                Number times = interfaceC20271214Tm.getTimes();
                if (times != null) {
                    return times.intValue();
                }
                return 1;
            }
        }.LIZIZ()));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
