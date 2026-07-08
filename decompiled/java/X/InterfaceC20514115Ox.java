package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.15Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface InterfaceC20514115Ox extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "contractExpiry", required = false)
    String getContractExpiry();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contractId", required = false)
    String getContractId();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "eea", required = false)
    boolean getEea();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enigma", required = false)
    Map<String, Object> getEnigma();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "from", required = true)
    String getFrom();
}
