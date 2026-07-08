package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1$1", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MHQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHQ(Context context, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MHQ(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().LJJJJJ().preloadEffectModel();
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null) {
            creativeModel = videoPublishEditModel.creativeModel;
        } else {
            creativeModel = null;
        }
        if (!C566780MKu.LIZ(creativeModel)) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().downloadTextFont(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.startDownloadVideo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
