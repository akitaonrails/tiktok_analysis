package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0fp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1141950fp3 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    List<Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isMultiGuestRoom", required = true)
    Boolean isMultiGuestRoom();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = true)
    void setData(List<? extends Object> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isMultiGuestRoom", required = true)
    void setMultiGuestRoom(Boolean bool);
}
