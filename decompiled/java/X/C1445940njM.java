package X;

import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* JADX INFO: renamed from: X.0njM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445940njM implements InterfaceC1445980njQ {
    public final /* synthetic */ MainActivityCallback LIZ;

    public final int LIZIZ() {
        return this.LIZ.LLILZ.publishPermission;
    }

    @Override // X.InterfaceC1445980njQ
    public final BaseShortVideoContext getArgs() {
        return this.LIZ.LLILZ.editModel;
    }

    @Override // X.InterfaceC1445980njQ
    public final int getVideoType() {
        return this.LIZ.LLILZ.videoType;
    }

    public C1445940njM(MainActivityCallback mainActivityCallback) {
        this.LIZ = mainActivityCallback;
    }

    @Override // X.InterfaceC1445980njQ
    public final void LIZ(InterfaceC1433360nP4 interfaceC1433360nP4) {
        this.LIZ.LLILLL.removePublishCallback(interfaceC1433360nP4);
    }
}
