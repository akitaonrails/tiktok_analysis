package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;

/* JADX INFO: renamed from: X.10a9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19269910a9 {
    public final C11NJ LIZ = new C11NJ();
    public final InterfaceC19269510a5 LIZIZ;
    public InterfaceC19270010aA LIZJ;

    public C19269910a9() {
        InterfaceC19269510a5.LIZ.getClass();
        this.LIZIZ = (InterfaceC19269510a5) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19269510a5.class);
    }

    public final void LIZ(ContentLanguage contentLanguage, int i) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (i == 0) {
                ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZJ(contentLanguage.getLanguageCode());
            } else {
                ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZIZ(contentLanguage);
            }
            this.LIZJ.A();
            return;
        }
        C11NZ<BaseResponse> c11nzLIZ = this.LIZIZ.LIZ("content_language", contentLanguage.getLanguageCode(), i);
        if (c11nzLIZ != null) {
            c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(this, 8));
        }
    }
}
