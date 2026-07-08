package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602810Nkd extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "animation", required = false)
    String getAnimation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardInfo", required = true)
    Map<String, Object> getCardInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "index", required = true)
    Number getIndex();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "position", required = false)
    @InterfaceC1909307dr(option = {"bottom", "top"})
    String getPosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "targetList", required = false)
    String getTargetList();
}
