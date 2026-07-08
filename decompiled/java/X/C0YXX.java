package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0YXX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0YXX extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "desc", required = false)
    String getDesc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ext", required = false)
    Map<String, Object> getExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "icon", required = false)
    String getIcon();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inboxType", required = false)
    Number getInboxType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notice", required = false)
    String getNotice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ownerId", required = true)
    String getOwnerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secOwnerId", required = true)
    String getSecOwnerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version", required = true)
    Number getVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "desc", required = false)
    void setDesc(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ext", required = false)
    void setExt(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "icon", required = false)
    void setIcon(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inboxType", required = false)
    void setInboxType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = true)
    void setName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "notice", required = false)
    void setNotice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ownerId", required = true)
    void setOwnerId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "secOwnerId", required = true)
    void setSecOwnerId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "version", required = true)
    void setVersion(Number number);
}
