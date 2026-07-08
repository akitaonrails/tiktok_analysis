package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0cef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1020190cef extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "ad_id", required = false)
    String getAdId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "creative_id", required = false)
    String getCreativeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "group_id", required = false)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_label", required = false)
    String getTrackLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_url_list", required = false)
    List<Object> getTrackUrlList();
}
