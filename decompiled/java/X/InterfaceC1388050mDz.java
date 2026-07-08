package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0mDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1388050mDz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    String getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizScene", required = true)
    String getBizScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraETParams", required = false)
    Map<String, Object> getExtraETParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraMap", required = false)
    Map<String, Object> getExtraMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupType", required = false)
    String getGroupType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = false)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uidList", primitiveClassType = String.class, required = false)
    List<String> getUidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uniqueId", required = false)
    String getUniqueId();
}
