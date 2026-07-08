package X;

import android.app.Application;
import android.content.Context;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.absettings.api.IABSettingsApi;

/* JADX INFO: renamed from: X.0CJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311760CJy implements IABSettingsApi {
    public static final C311760CJy LIZIZ = new C311760CJy();
    public final /* synthetic */ IABSettingsApi LIZ;

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final void LIZ(Application application) {
        this.LIZ.LIZ(application);
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final AbstractC19483511Kn<C0X52<k>> LIZIZ(Context context, String str) {
        return this.LIZ.LIZIZ(context, str);
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final boolean LIZJ(Context context, n nVar, C311600CJi c311600CJi, IABSettingsApi.FetchCallback fetchCallback) {
        return this.LIZ.LIZJ(context, nVar, c311600CJi, fetchCallback);
    }

    @Override // com.tiktok.ef.absettings.api.IABSettingsApi
    public final void LIZLLL(Application application) {
        this.LIZ.LIZLLL(application);
    }

    public C311760CJy() {
        IABSettingsApi iABSettingsApi = (IABSettingsApi) PluggableExtentionKt.pluggableSpi$default(IABSettingsApi.class, false, false, false, 14, null);
        if (iABSettingsApi == null) {
            throw new IllegalArgumentException("Must implement IABSettingsApi");
        }
        this.LIZ = iABSettingsApi;
    }
}
