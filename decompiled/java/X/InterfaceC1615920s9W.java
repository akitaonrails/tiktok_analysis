package X;

import com.ss.android.ugc.aweme.model.InsightTypeResponse;
import com.ss.android.ugc.aweme.model.InsightTypeResponseV2;

/* JADX INFO: renamed from: X.0s9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1615920s9W {
    public static final C1615930s9X LIZ = C1615930s9X.LIZ;

    @InterfaceC1501200pAU("/aweme/v2/data/insight")
    AbstractC19484711Kz<InsightTypeResponseV2> LIZ(@InterfaceC1501120pAM("type_requests") String str);

    @InterfaceC1501240pAY("/aweme/v1/data/insighs/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<InsightTypeResponse> LIZIZ(@InterfaceC1501100pAK("type_requests") String str);
}
