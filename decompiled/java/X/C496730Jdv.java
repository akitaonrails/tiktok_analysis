package X;

import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0Jdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496730Jdv extends C09AY implements Function0<String> {
    public final /* synthetic */ C496700Jds LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496730Jdv(C496700Jds c496700Jds) {
        super(0);
        this.LL = c496700Jds;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SMBPreviewResponse.ResponseData responseData = this.LL.LIZ;
        return C0KVU.LIZ(responseData != null ? responseData.anchorData : null);
    }
}
