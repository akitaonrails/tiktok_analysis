package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z72, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z72 implements Serializable {
    public CharSequence chatHint;
    public final C886440Yq2 chatStatus;
    public final C0Z8A contentType;
    public final String sessionId;
    public final AbstractC884010Ym7 sessionUnreadViewState;
    public final boolean showVerifyIcon;
    public final String timestamp;
    public final String title;

    public final C0Z72 copy(String str, String str2, boolean z, C886440Yq2 c886440Yq2, C0Z8A c0z8a, String str3, AbstractC884010Ym7 abstractC884010Ym7, CharSequence charSequence) {
        return new C0Z72(str, str2, z, c886440Yq2, c0z8a, str3, abstractC884010Ym7, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Z72)) {
            return false;
        }
        C0Z72 c0z72 = (C0Z72) obj;
        return Intrinsics.LJFF(this.sessionId, c0z72.sessionId) && Intrinsics.LJFF(this.title, c0z72.title) && this.showVerifyIcon == c0z72.showVerifyIcon && Intrinsics.LJFF(this.chatStatus, c0z72.chatStatus) && Intrinsics.LJFF(this.contentType, c0z72.contentType) && Intrinsics.LJFF(this.timestamp, c0z72.timestamp) && Intrinsics.LJFF(this.sessionUnreadViewState, c0z72.sessionUnreadViewState) && Intrinsics.LJFF(this.chatHint, c0z72.chatHint);
    }

    public final void setChatHint(CharSequence charSequence) {
        this.chatHint = charSequence;
    }

    public C0Z72(String str, String str2, boolean z, C886440Yq2 c886440Yq2, C0Z8A c0z8a, String str3, AbstractC884010Ym7 abstractC884010Ym7, CharSequence charSequence) {
        this.sessionId = str;
        this.title = str2;
        this.showVerifyIcon = z;
        this.chatStatus = c886440Yq2;
        this.contentType = c0z8a;
        this.timestamp = str3;
        this.sessionUnreadViewState = abstractC884010Ym7;
        this.chatHint = charSequence;
    }
}
