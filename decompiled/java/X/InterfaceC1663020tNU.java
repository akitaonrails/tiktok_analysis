package X;

import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.UpdateFilterBoxBody;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: renamed from: X.0tNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1663020tNU {
    @InterfaceC1501240pAY("effect/api/filterbox/update")
    AbstractC19484711Kz<BaseNetResponse> LIZ(@C040I UpdateFilterBoxBody updateFilterBoxBody);

    @InterfaceC1501200pAU("effect/api/filterbox/list")
    AbstractC19484711Kz<C20266714Rt> LIZIZ(@InterfaceC1501120pAM("access_key") String str, @InterfaceC1501120pAM("sdk_version") String str2, @InterfaceC1501120pAM("app_version") String str3, @InterfaceC1501120pAM("region") String str4, @InterfaceC1501120pAM("panel") String str5);
}
