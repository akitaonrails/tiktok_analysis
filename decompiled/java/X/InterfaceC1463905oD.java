package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.05oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1463905oD extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarList", primitiveClassType = String.class, required = false)
    List<String> getAvatarList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "emoji", required = false)
    String getEmoji();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatarList", primitiveClassType = String.class, required = false)
    void setAvatarList(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "emoji", required = false)
    void setEmoji(String str);
}
