package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsHandler$handleData$2$1", f = "PrepareParamsHandler.kt", l = {38}, m = "invokeSuspend")
public final class C1433040nOY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1433060nOa>, Object> {
    public int LL;

    public C1433040nOY(InterfaceC1364105Vn<? super C1433040nOY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1433040nOY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrepareParamsHandler@9605.handleData$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19545411dU c19545411dU = C19545411dU.LIZ;
            this.LL = 1;
            c19545411dU.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ListenableFuture<VideoCreation> listenableFutureLIZIZ = C0CHQ.LIZ().getPublishService().LJJIJIIJIL().LIZIZ(null, false);
            C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.0nOZ
                @Override // X.C11U6
                public final void onFailure(Throwable th) {
                    InterfaceC1364105Vn<C1433060nOa> interfaceC1364105Vn = c23260099m;
                    C1433060nOa c1433060nOa = new C1433060nOa();
                    C189200o6.m2constructorimpl(c1433060nOa);
                    interfaceC1364105Vn.resumeWith(c1433060nOa);
                }

                @Override // X.C11U6
                public final void onSuccess(VideoCreation videoCreation) {
                    UploadAuthKeyConfig uploadAuthKeyConfig;
                    boolean z;
                    VideoCreation videoCreation2 = videoCreation;
                    InterfaceC1364105Vn<C1433060nOa> interfaceC1364105Vn = c23260099m;
                    C1433060nOa c1433060nOa = new C1433060nOa();
                    if (videoCreation2 instanceof UploadAuthKeyConfig) {
                        uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation2;
                    } else {
                        uploadAuthKeyConfig = null;
                    }
                    c1433060nOa.LIZIZ = uploadAuthKeyConfig;
                    if (uploadAuthKeyConfig != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1433060nOa.LIZ = z;
                    C189200o6.m2constructorimpl(c1433060nOa);
                    interfaceC1364105Vn.resumeWith(c1433060nOa);
                }
            };
            listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), EnumC2272608vM.LL);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PrepareParamsHandler@9605.handleData$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PrepareParamsHandler@9605.handleData$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1433060nOa> interfaceC1364105Vn) {
        return new C1433040nOY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
