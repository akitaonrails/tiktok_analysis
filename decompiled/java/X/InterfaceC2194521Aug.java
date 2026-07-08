package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1Aug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2194521Aug extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientKeyList", nestedClassType = InterfaceC2194491Aud.class, required = true)
    List<InterfaceC2194491Aud> getClientKeyList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();
}
