package X;

import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0YfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879860YfQ implements Serializable {
    public static final int $stable = 8;
    public LastMessageProperty lastMessageProperty;

    public C879860YfQ() {
        this(null);
    }

    public int hashCode() {
        LastMessageProperty lastMessageProperty = this.lastMessageProperty;
        if (lastMessageProperty == null) {
            return 0;
        }
        return lastMessageProperty.hashCode();
    }

    public C879860YfQ(LastMessageProperty lastMessageProperty) {
        this.lastMessageProperty = lastMessageProperty;
    }

    public final void setLastMessageProperty(LastMessageProperty lastMessageProperty) {
        this.lastMessageProperty = lastMessageProperty;
    }
}
