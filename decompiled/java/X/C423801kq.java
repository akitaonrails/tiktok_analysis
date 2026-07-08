package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.SmsSettingItem;
import com.ss.android.ugc.aweme.setting.model.UpdateSmsConsentStatusRequest;
import com.ss.android.ugc.aweme.setting.serverpush.api.SmsConsentApi;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.01kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C423801kq {
    public static final /* synthetic */ C423801kq LIZ = new C423801kq();
    public static final SmsConsentApi LIZIZ = (SmsConsentApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(SmsConsentApi.class);

    public static C19476611Hw LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SmsSettingItem("primary_sms_auth", i, null));
        return LIZIZ.updateSmsConsentStatus(new UpdateSmsConsentStatusRequest(arrayList)).LJL(C11S5.LIZ());
    }
}
