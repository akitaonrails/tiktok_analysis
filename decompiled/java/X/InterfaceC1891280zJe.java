package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1891280zJe extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFiles", nestedClassType = InterfaceC20150013so.class, required = true)
    List<InterfaceC20150013so> getTempFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFiles", nestedClassType = InterfaceC20150013so.class, required = true)
    void setTempFiles(List<? extends InterfaceC20150013so> list);
}
