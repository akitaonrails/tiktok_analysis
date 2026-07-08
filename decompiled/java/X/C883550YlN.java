package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883550YlN extends C09AY implements Function0<IMChatRoomNetDispatchConfigService> {
    public C883550YlN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMChatRoomNetDispatchConfigService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IMChatRoomNetDispatchConfigService.class);
    }
}
