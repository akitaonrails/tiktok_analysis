package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.141d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface InterfaceC201975141d extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFiles", nestedClassType = InterfaceC201977141f.class, required = true)
    List<InterfaceC201977141f> getTempFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFiles", nestedClassType = InterfaceC201977141f.class, required = true)
    void setTempFiles(List<? extends InterfaceC201977141f> list);
}
