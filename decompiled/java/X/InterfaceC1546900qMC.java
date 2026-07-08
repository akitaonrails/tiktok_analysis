package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0qMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1546900qMC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "i18nXMeta", nestedClassType = InterfaceC1546930qMF.class, required = true)
    InterfaceC1546930qMF getI18nXMeta();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "locale", required = false)
    String getLocale();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "useLatest", required = false)
    boolean getUseLatest();
}
