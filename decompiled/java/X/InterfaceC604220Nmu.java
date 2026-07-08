package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Nmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC604220Nmu extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupId", required = false)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingBack", required = false)
    Number getLandingBack();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "music", required = true)
    String getMusic();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "musicSelectedFrom", required = true)
    String getMusicSelectedFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shootWay", required = true)
    String getShootWay();
}
