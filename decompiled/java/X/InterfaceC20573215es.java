package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenAccountsResponse;

/* JADX INFO: renamed from: X.15es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20573215es {
    public static final C20573115er LIZ = C20573115er.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/hide/list/")
    C11NZ<HiddenAccountsResponse> LIZ(@InterfaceC1501120pAM("page_token") String str, @InterfaceC1501120pAM("count") int i);

    @InterfaceC1501200pAU("/aweme/v1/hide/open/")
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("hide_types") String str3);

    @InterfaceC1501200pAU("/aweme/v1/hide/close/")
    C11NZ<BaseResponse> LIZJ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("hide_types") String str3);
}
