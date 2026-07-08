package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0PyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC662340PyS extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aweme", required = true)
    Map<String, Object> getAweme();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "disableSingleActivity", required = false)
    Boolean getDisableSingleActivity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageContainerViewId", required = true)
    String getImageContainerViewId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageViewId", required = true)
    String getImageViewId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    Map<String, Object> getLogExtra();
}
