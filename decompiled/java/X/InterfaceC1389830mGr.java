package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0mGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1389830mGr extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cc_template_id", required = true)
    String getCcTemplateId();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "music_begin_time", required = false)
    Number getMusicBeginTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "music_id", required = true)
    String getMusicId();
}
