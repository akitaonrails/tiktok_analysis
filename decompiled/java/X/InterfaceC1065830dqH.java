package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0dqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1065830dqH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "commonParams", required = false)
    String getCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = true)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    String getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = false)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageEnterFrom", required = true)
    String getPageEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prefetchParams", primitiveClassType = String.class, required = false)
    List<String> getPrefetchParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rewards", required = true)
    Number getRewards();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskEventKey", required = false)
    String getTaskEventKey();
}
