package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1B1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2198181B1k extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableCommitUpload", required = false)
    Boolean getEnableCommitUpload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableSkipMeta", required = false)
    Boolean getEnableSkipMeta();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sliceSize", required = false)
    Number getSliceSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "socketNum", required = false)
    Number getSocketNum();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "traceId", required = false)
    String getTraceId();
}
