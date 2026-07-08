package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper$bindProgressCallback$1$1", f = "PublishProgressDialogAddHelper.kt", l = {324}, m = "invokeSuspend")
public final class C1408920mle extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1408920mle(InterfaceC1364105Vn<? super C1408920mle> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408920mle(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        C1C7U.LIZ("PublishProgressDialogAddHelper@16ce.bindProgressCallback$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(800L, this) == objLJFF) {
                C1C7U.LIZIZ("PublishProgressDialogAddHelper@16ce.bindProgressCallback$1$1");
                return objLJFF;
            }
        }
        PublishProgressDialogAddHelper.LIZ.getClass();
        C1447790nmL c1447790nmL = PublishProgressDialogAddHelper.LJ;
        if (c1447790nmL != null && (baseShortVideoContext = c1447790nmL.LLJIJIL) != null && (baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null) {
            C520040KaQ.LIZ(c1447790nmL);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
            c2344009Gk.LJIIIIZZ("enter_from", videoPublishEditModel.getEnterFrom());
            c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c2344009Gk.LIZJ(C1433730nPf.LJIIL(), "publish_cnt");
            C1609930rzr.LIZLLL(c2344009Gk, videoPublishEditModel);
            C20684815ws.LJIILLIIL("publishing_toast_show", c2344009Gk.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublishProgressDialogAddHelper@16ce.bindProgressCallback$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1408920mle(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
