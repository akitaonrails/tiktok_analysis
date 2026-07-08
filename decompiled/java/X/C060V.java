package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handleResult$1$customCoverUriDeferred$1", f = "EcEditVideoCoverMethod.kt", l = {164}, m = "invokeSuspend")
public final class C060V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C1432140nN6 LLILLJJLI;
    public final /* synthetic */ UploadImageConfig LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060V(C1432140nN6 c1432140nN6, UploadImageConfig uploadImageConfig, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C060V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1432140nN6;
        this.LLILLL = uploadImageConfig;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060V(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$customCoverUriDeferred$1");
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
            UploadImageConfig uploadImageConfig = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            this.LL = 1;
            int i2 = C1432140nN6.LLILLL;
            c1432140nN6.getClass();
            obj = C1432140nN6.LIZJ(uploadImageConfig, videoPublishEditModel, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$customCoverUriDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$customCoverUriDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
