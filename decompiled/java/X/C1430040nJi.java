package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0nJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handleResult$1$authKey$1", f = "EcEditVideoCoverMethod.kt", l = {153}, m = "invokeSuspend")
public final class C1430040nJi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UploadAuthKeyConfig>, Object> {
    public int LL;
    public final /* synthetic */ C1432140nN6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430040nJi(C1432140nN6 c1432140nN6, InterfaceC1364105Vn<? super C1430040nJi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1432140nN6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430040nJi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$authKey$1");
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
            C1432140nN6 c1432140nN6 = this.LLILLJJLI;
            this.LL = 1;
            c1432140nN6.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ListenableFuture<VideoCreation> listenableFutureLIZIZ = C0CHQ.LIZ().getPublishService().LJJIJIIJIL().LIZIZ(null, false);
            C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.08vT
                @Override // X.C11U6
                public final void onFailure(Throwable th) {
                    InterfaceC20236714Gf<UploadAuthKeyConfig> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }

                @Override // X.C11U6
                public final void onSuccess(VideoCreation videoCreation) {
                    VideoCreation videoCreation2 = videoCreation;
                    InterfaceC20236714Gf<UploadAuthKeyConfig> interfaceC20236714Gf = c2252611DEt;
                    if (!(videoCreation2 instanceof UploadAuthKeyConfig)) {
                        videoCreation2 = null;
                    }
                    C189200o6.m2constructorimpl(videoCreation2);
                    interfaceC20236714Gf.resumeWith(videoCreation2);
                }
            };
            listenableFutureLIZIZ.LJIIJJI(new C135Q(listenableFutureLIZIZ, c11u6), EnumC2272608vM.LL);
            c2252611DEt.LJJII(new AwS601S0100000_22(listenableFutureLIZIZ, (ListenableFuture<VideoCreation>) 741));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$authKey$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$authKey$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UploadAuthKeyConfig> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
