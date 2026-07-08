package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CQY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CQY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "branches", primitiveClassType = Number.class, required = true)
    List<Number> getBranches();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment", required = false)
    String getComment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end", required = true)
    Boolean getEnd();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next", required = true)
    Number getNext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prev", primitiveClassType = Number.class, required = true)
    List<Number> getPrev();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tips", required = false)
    String getTips();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "branches", primitiveClassType = Number.class, required = true)
    void setBranches(List<? extends Number> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "comment", required = false)
    void setComment(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "end", required = true)
    void setEnd(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "next", required = true)
    void setNext(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "prev", primitiveClassType = Number.class, required = true)
    void setPrev(List<? extends Number> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tips", required = false)
    void setTips(String str);
}
