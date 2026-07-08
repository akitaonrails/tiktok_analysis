package X;

import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsResponse;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.UpdateStrengthRequest;

/* JADX INFO: renamed from: X.0gHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1159690gHf {
    public static final C1159700gHg LIZ = C1159700gHg.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/topic-preferences/setting/update")
    C11NZ<ManageTopicsResponse> LIZ(@C040I UpdateStrengthRequest updateStrengthRequest);

    @InterfaceC1501200pAU("/tiktok/v1/topic-preferences/setting/get")
    C11NZ<ManageTopicsResponse> LIZIZ();
}
