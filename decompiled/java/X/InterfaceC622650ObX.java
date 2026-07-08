package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ObX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC622650ObX extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "primaryBtnContent", required = true)
    String getPrimaryBtnContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secondaryBtnContent", required = true)
    String getSecondaryBtnContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
