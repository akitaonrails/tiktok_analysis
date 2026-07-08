package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiCompliancePopupAuthResponse;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiPassportLoginResponse;

/* JADX INFO: renamed from: X.0gce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1172700gce {
    public static final C1172680gcc LIZ = C1172680gcc.LIZ;

    @InterfaceC1501240pAY("/passport/gec/tiktok/login")
    Object LIZ(@InterfaceC1501370pAl("x-tt-passport-csrf-token") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, InterfaceC1364105Vn<? super PoiPassportLoginResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/ls/auth/agree/v1")
    Object LIZIZ(InterfaceC1364105Vn<? super PoiCompliancePopupAuthResponse> interfaceC1364105Vn);
}
