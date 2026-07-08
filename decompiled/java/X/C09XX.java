package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene$buildPublishIntent$3", f = "TextToImageChooseScene.kt", l = {}, m = "invokeSuspend")
public final class C09XX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XX(VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C09XX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageChooseScene@ce6c.buildPublishIntent$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FileUtils.INSTANCE.removeFile(this.LL.getVideoCoverPath());
        C0MH8 c0mh8 = C0MH8.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        C0MH8.LJIILJJIL(c0mh8, videoPublishEditModel, videoPublishEditModel.getVideoCoverPath(), null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageChooseScene@ce6c.buildPublishIntent$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
