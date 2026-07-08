package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1CTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2231001CTq extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "branches", primitiveClassType = Number.class, required = true)
    List<Number> getBranches();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment", required = false)
    String getComment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end", required = true)
    boolean getEnd();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next", required = true)
    Number getNext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prev", primitiveClassType = Number.class, required = true)
    List<Number> getPrev();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tips", required = false)
    String getTips();
}
