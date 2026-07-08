package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AgreeAuthResponse;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ExposureAuthResponse;

/* JADX INFO: renamed from: X.0vG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1735340vG8 {
    public static final C1735330vG7 LIZ;

    static {
        boolean zLJI = MethodIDManager.LJI(202338);
        LIZ = C1735330vG7.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @InterfaceC1501240pAY("/api/v1/mall/user/auth/apply")
    Object LIZ(@C040I ApplyAuthRequest applyAuthRequest, InterfaceC1364105Vn<? super ApplyAuthResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/mall/user/auth/exposure")
    Object LIZIZ(@C040I ExposureAuthRequest exposureAuthRequest, InterfaceC1364105Vn<? super ExposureAuthResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/mall/user/auth/agree")
    Object LIZJ(@C040I AgreeAuthRequest agreeAuthRequest, InterfaceC1364105Vn<? super AgreeAuthResponse> interfaceC1364105Vn);
}
