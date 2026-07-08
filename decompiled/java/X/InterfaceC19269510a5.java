package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;

/* JADX INFO: renamed from: X.10a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19269510a5 {
    public static final C19269810a8 LIZ = C19269810a8.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/user/set/settings/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("content_language") String str2, @InterfaceC1501100pAK("action_type") int i);

    @InterfaceC1501200pAU("/aweme/v1/config/list/")
    C11NZ<ConfigListResponse> LIZIZ(@InterfaceC1501120pAM("type") String str, @InterfaceC1501120pAM("content_language") String str2);

    @InterfaceC1501240pAY("/aweme/v1/user/set/settings/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZJ(@InterfaceC1501100pAK("field") String str);

    @InterfaceC1501240pAY("/aweme/v1/user/set/settings/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZLLL(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("settings_not_login") String str2);
}
