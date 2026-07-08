package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2230811CSx extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment", required = false)
    String getComment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end", required = true)
    Boolean getEnd();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next", required = true)
    Number getNext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameter", required = false)
    String getParameter();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prev", primitiveClassType = Number.class, required = true)
    List<Number> getPrev();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "comment", required = false)
    void setComment(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "end", required = true)
    void setEnd(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minAppVersion", required = true)
    void setMinAppVersion(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = true)
    void setName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "next", required = true)
    void setNext(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "parameter", required = false)
    void setParameter(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "prev", primitiveClassType = Number.class, required = true)
    void setPrev(List<? extends Number> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "version", required = true)
    void setVersion(Number number);
}
