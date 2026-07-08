package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896010ZDb extends C09AY implements Function0<IMMessageListApi> {
    public C896010ZDb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMMessageListApi invoke() {
        return ServiceManager.get().getService(IMMessageListApi.class);
    }
}
