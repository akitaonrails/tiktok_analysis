package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0dmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1063600dmg implements InterfaceC1063710dmr {
    public C1544610qIV LL;

    @Override // X.InterfaceC1063710dmr
    public final Class<? extends XBaseParamModel> provideParamModel() {
        return null;
    }

    @Override // X.InterfaceC1063710dmr
    public final Class<? extends XBaseResultModel> provideResultModel() {
        return null;
    }

    @Override // X.InterfaceC1063710dmr
    public final void release() {
    }

    @Override // X.InterfaceC1063710dmr
    public EnumC1063530dmZ getAccess() {
        return EnumC1063530dmZ.PRIVATE;
    }

    @Override // X.InterfaceC1063710dmr
    public final EnumC1063610dmh getCompatibility() {
        return EnumC1063610dmh.Compatible;
    }

    @Override // X.InterfaceC1063710dmr
    public final void setBridgeContext(InterfaceC634840OvC interfaceC634840OvC) {
        C1544610qIV c1544610qIV;
        if (interfaceC634840OvC instanceof C1544610qIV) {
            c1544610qIV = (C1544610qIV) interfaceC634840OvC;
        } else {
            c1544610qIV = null;
        }
        this.LL = c1544610qIV;
    }
}
