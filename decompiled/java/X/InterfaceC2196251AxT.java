package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1AxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2196251AxT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "fyfCardId", required = false)
    String getFyfCardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameName", required = true)
    String getGameName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gipTaskId", required = false)
    String getGipTaskId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gipTaskName", required = false)
    String getGipTaskName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minisType", required = true)
    String getMinisType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minisVersion", required = true)
    String getMinisVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ttoclid", required = true)
    String getTtoclid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoId", required = false)
    String getVideoId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isGipAnchor", required = false)
    String isGipAnchor();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "fyfCardId", required = false)
    void setFyfCardId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gameName", required = true)
    void setGameName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isGipAnchor", required = false)
    void setGipAnchor(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gipTaskId", required = false)
    void setGipTaskId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "gipTaskName", required = false)
    void setGipTaskName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minisType", required = true)
    void setMinisType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "minisVersion", required = true)
    void setMinisVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ttoclid", required = true)
    void setTtoclid(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "videoId", required = false)
    void setVideoId(String str);
}
