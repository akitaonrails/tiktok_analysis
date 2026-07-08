package X;

import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;

/* JADX INFO: renamed from: X.0XcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC852600XcY {
    public static final C852610XcZ LIZ = C852610XcZ.LIZ;

    @InterfaceC1501240pAY("/passport/shark/safe_verify/v2/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("product_scene") String str, @InterfaceC1501100pAK("mix_mode") Integer num, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2, InterfaceC1364105Vn<? super SafeEnvV2Response> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/passport/shark/safe_verify/v2/")
    @InterfaceC1485505rh
    C15O7<SafeEnvV2Response> LIZIZ(@InterfaceC1501100pAK("product_scene") String str, @InterfaceC1501100pAK("mix_mode") Integer num, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2);
}
