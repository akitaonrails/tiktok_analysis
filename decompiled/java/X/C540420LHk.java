package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$nextToPublish$2$1", f = "ImageEditRootScene.kt", l = {}, m = "invokeSuspend")
public final class C540420LHk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImageEditRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540420LHk(ImageEditRootScene imageEditRootScene, InterfaceC1364105Vn<? super C540420LHk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imageEditRootScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540420LHk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditRootScene@a14e.nextToPublish$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL.LLJL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C1436990nUv.LJIIJJI(videoPublishEditModel);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.nextToPublish$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
