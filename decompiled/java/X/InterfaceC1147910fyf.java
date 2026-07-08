package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0fyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1147910fyf extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestPage", required = false)
    String getRequestPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneType", required = false)
    Number getSceneType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskType", required = false)
    Number getTaskType();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"get", "request"})
    String getType();
}
