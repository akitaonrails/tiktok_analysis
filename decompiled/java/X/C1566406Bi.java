package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566406Bi extends C09AY implements Function0<IMChatListBridgeApi> {
    public C1566406Bi() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMChatListBridgeApi invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IMChatListBridgeApi.class);
    }
}
