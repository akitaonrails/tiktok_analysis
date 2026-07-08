package X;

import com.bytedance.im.core.message.media.model.IMEncryptedImageContent;

/* JADX INFO: renamed from: X.0YQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873920YQc implements InterfaceC873930YQd {
    public final IMEncryptedImageContent LIZ;

    public C873920YQc() {
        this(null, 3);
    }

    public C873920YQc(IMEncryptedImageContent iMEncryptedImageContent, int i) {
        this.LIZ = (i & 2) != 0 ? null : iMEncryptedImageContent;
    }
}
