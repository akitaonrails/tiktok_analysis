package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;

/* JADX INFO: renamed from: X.0Ymu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884500Ymu {
    public static ChatListEngine LIZ() {
        return (ChatListEngine) PluggableExtentionKt.pluggableSpi$default(IChatListEngine.class, false, false, false, 14, null);
    }
}
