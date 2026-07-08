package X;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: X.1ASo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179761ASo extends C2179751ASn {
    public C2179761ASo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public C2179761ASo(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }
}
