package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0vws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1761840vws extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coverImageURL", required = false)
    String getCoverImageURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageURL", required = false)
    String getImageURL();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoBackupURL", required = false)
    String getVideoBackupURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoDuration", required = false)
    Number getVideoDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoHeight", required = false)
    Number getVideoHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoID", required = false)
    String getVideoID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoMainURL", required = false)
    String getVideoMainURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoWidth", required = false)
    Number getVideoWidth();
}
