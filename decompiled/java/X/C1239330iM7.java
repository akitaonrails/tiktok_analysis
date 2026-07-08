package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.FriendApi;

/* JADX INFO: renamed from: X.0iM7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239330iM7 {
    public static final /* synthetic */ C1239330iM7 LIZ = new C1239330iM7();

    public static FriendApi LIZ() {
        return (FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(FriendApi.class);
    }
}
