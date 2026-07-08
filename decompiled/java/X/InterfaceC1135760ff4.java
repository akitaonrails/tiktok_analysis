package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ff4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1135760ff4 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error_code", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "result_list", nestedClassType = InterfaceC1135770ff5.class, required = false)
    List<InterfaceC1135770ff5> getResultList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error_code", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result_list", nestedClassType = InterfaceC1135770ff5.class, required = false)
    void setResultList(List<? extends InterfaceC1135770ff5> list);
}
