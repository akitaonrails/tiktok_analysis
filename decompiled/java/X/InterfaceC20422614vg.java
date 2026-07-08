package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.14vg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20422614vg extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment", required = false)
    String getComment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "end", required = true)
    boolean getEnd();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minAppVersion", required = true)
    Number getMinAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "next", required = true)
    Number getNext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameter", required = true)
    String getParameter();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prev", primitiveClassType = Number.class, required = true)
    List<Number> getPrev();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();
}
