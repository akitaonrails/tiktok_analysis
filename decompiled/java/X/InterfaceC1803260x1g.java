package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0x1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1803260x1g extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "absPipoAvatars", primitiveClassType = String.class, required = true)
    List<String> getAbsPipoAvatars();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "priorityRegion", required = true)
    String getPriorityRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAbsOn", required = true)
    boolean isAbsOn();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAgreed", required = true)
    boolean isAgreed();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isEligible", required = true)
    boolean isEligible();
}
