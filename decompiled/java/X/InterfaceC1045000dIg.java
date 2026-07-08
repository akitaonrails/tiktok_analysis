package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1045000dIg extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "adExtra", required = false)
    Map<String, Object> getAdExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeStruct", required = true)
    String getAwemeStruct();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "label", required = true)
    String getLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = false)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tag", required = true)
    String getTag();
}
