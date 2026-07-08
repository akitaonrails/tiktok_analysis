package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0ysu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1874700ysu extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarURL", required = true)
    String getAvatarURL();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "boundThirdPartyPlatforms", primitiveClassType = String.class, required = false)
    @InterfaceC1909307dr(option = {"apple", "facebook", "google", "instagram", "kakaotalk", "line", "twitter", "vk"})
    List<String> getBoundThirdPartyPlatforms();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasBoundPhone", required = true)
    Boolean getHasBoundPhone();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nickname", required = true)
    String getNickname();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secUserID", required = true)
    String getSecUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortID", required = false)
    String getShortID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uniqueID", required = true)
    String getUniqueID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userID", required = true)
    String getUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isBoundEmail", required = true)
    Boolean isBoundEmail();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isBoundPhone", required = false)
    Boolean isBoundPhone();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isOrgAccount", required = true)
    Boolean isOrgAccount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isOrgAccountConvInterPeriod", required = true)
    Boolean isOrgAccountConvInterPeriod();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatarURL", required = true)
    void setAvatarURL(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isBoundEmail", required = true)
    void setBoundEmail(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isBoundPhone", required = false)
    void setBoundPhone(Boolean bool);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "boundThirdPartyPlatforms", primitiveClassType = String.class, required = false)
    @InterfaceC1909307dr(option = {"apple", "facebook", "google", "instagram", "kakaotalk", "line", "twitter", "vk"})
    void setBoundThirdPartyPlatforms(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "hasBoundPhone", required = true)
    void setHasBoundPhone(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "nickname", required = true)
    void setNickname(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isOrgAccount", required = true)
    void setOrgAccount(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isOrgAccountConvInterPeriod", required = true)
    void setOrgAccountConvInterPeriod(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "secUserID", required = true)
    void setSecUserID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shortID", required = false)
    void setShortID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uniqueID", required = true)
    void setUniqueID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userID", required = true)
    void setUserID(String str);
}
