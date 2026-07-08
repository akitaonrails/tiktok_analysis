package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$saveDraft$1$1", f = "ImageEditRootScene.kt", l = {3798}, m = "invokeSuspend")
public final class C540330LHb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageEditRootScene LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540330LHb(ImageEditRootScene imageEditRootScene, boolean z, InterfaceC1364105Vn<? super C540330LHb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageEditRootScene;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540330LHb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC540360LHe interfaceC540360LHe;
        C1C7U.LIZ("ImageEditRootScene@a14e.saveDraft$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        VideoPublishEditModel videoPublishEditModel = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI.LLJL;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0LHZ(videoPublishEditModel2, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ImageEditRootScene@a14e.saveDraft$1$1");
                return objLJFF;
            }
        }
        C0CHQ.LIZ().getPublishService().LJJJLL();
        ImageEditRootScene imageEditRootScene = this.LLILLJJLI;
        VideoPublishEditModel videoPublishEditModel3 = imageEditRootScene.LLJL;
        if (videoPublishEditModel3 != null) {
            videoPublishEditModel = videoPublishEditModel3;
        }
        C538590LAj c538590LAj = new C538590LAj(videoPublishEditModel, new C0M2T(false, "ImageEditRootScene", null, 5, false, 28), false);
        if (this.LLILLL) {
            interfaceC540360LHe = imageEditRootScene.LLZL;
        } else {
            interfaceC540360LHe = imageEditRootScene.LLZILL;
        }
        C1431870nMf.LJIIL(c538590LAj, interfaceC540360LHe);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.saveDraft$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
