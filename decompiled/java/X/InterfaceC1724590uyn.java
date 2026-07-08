package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0uyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1724590uyn extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionList", nestedClassType = InterfaceC1724600uyo.class, required = true)
    List<InterfaceC1724600uyo> getActionList();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "actionType", required = true)
    @InterfaceC1909307dr(option = {"closed"})
    String getActionType();
}
