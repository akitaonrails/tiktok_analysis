package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1103304Tf extends C09AY implements Function0<IIMChatRoomService> {
    public C1103304Tf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IIMChatRoomService invoke() {
        return ServiceManager.get().getService(IIMChatRoomService.class);
    }
}
