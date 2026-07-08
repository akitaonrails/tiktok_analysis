package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884170YmN extends C09AY implements Function0<IChatListEngine> {
    public C884170YmN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IChatListEngine invoke() {
        return ServiceManager.get().getService(IChatListEngine.class);
    }
}
