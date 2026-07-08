package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* JADX INFO: renamed from: X.11d0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19542411d0 implements InterfaceC19523111Zt<InterfaceC19543511dB> {
    @Override // X.InterfaceC19523111Zt
    public final C11ZA LJIIIIZZ() {
        return new InterfaceC19543511dB() { // from class: X.0nJu
            @Override // X.InterfaceC19543511dB
            public final Object LJII(C19541611cs c19541611cs) {
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19541611cs));
                ListenableFuture<VideoCreation> listenableFutureLIZIZ = C0CHQ.LIZ().getPublishService().LJJIJIIJIL().LIZIZ(null, false);
                C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.08vU
                    @Override // X.C11U6
                    public final void onFailure(Throwable th) {
                        InterfaceC1364105Vn<UploadAuthKeyConfig> interfaceC1364105Vn = c23260099m;
                        C189200o6.m2constructorimpl(null);
                        interfaceC1364105Vn.resumeWith(null);
                    }

                    @Override // X.C11U6
                    public final void onSuccess(VideoCreation videoCreation) {
                        VideoCreation videoCreation2 = videoCreation;
                        InterfaceC1364105Vn<UploadAuthKeyConfig> interfaceC1364105Vn = c23260099m;
                        if (!(videoCreation2 instanceof UploadAuthKeyConfig)) {
                            videoCreation2 = null;
                        }
                        C189200o6.m2constructorimpl(videoCreation2);
                        interfaceC1364105Vn.resumeWith(videoCreation2);
                    }
                };
                listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), EnumC2272608vM.LL);
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(c19541611cs);
                }
                return objLIZ;
            }
        };
    }
}
