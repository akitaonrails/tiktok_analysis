package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.10b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC19275610b4 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authorName", required = false)
    String getAuthorName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "musicID", required = false)
    String getMusicID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "musicName", required = false)
    String getMusicName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "picUrl", required = false)
    String getPicUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "authorName", required = false)
    void setAuthorName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "duration", required = false)
    void setDuration(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "musicID", required = false)
    void setMusicID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "musicName", required = false)
    void setMusicName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "picUrl", required = false)
    void setPicUrl(String str);
}
