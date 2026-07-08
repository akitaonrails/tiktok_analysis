package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2230901CTg extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "nextStateId", required = true)
    Number getNextStateId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prevStateIds", primitiveClassType = Number.class, required = true)
    List<Number> getPrevStateIds();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", nestedClassType = InterfaceC2230911CTh.class, required = true)
    InterfaceC2230911CTh getState();
}
