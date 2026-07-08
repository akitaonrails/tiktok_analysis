package X;

import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.guide.UploadPicStickerCustomGuideDialog$scheduleLoadTimeout$1", f = "UploadPicStickerCustomGuideDialog.kt", l = {209}, m = "invokeSuspend")
public final class C1427790nG5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19469911Fh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1427790nG5(C19469911Fh c19469911Fh, InterfaceC1364105Vn<? super C1427790nG5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19469911Fh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1427790nG5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPicStickerCustomGuideDialog@a3d1.scheduleLoadTimeout$1");
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
            if (AnonymousClass0958.LIZIZ(15000L, this) == objLJFF) {
                C1C7U.LIZIZ("UploadPicStickerCustomGuideDialog@a3d1.scheduleLoadTimeout$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ(false);
        C1322110kVd c1322110kVd = this.LLILLJJLI.LJI;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 0);
        }
        VideoViewComponent videoViewComponent = this.LLILLJJLI.LIZLLL;
        if (videoViewComponent != null) {
            videoViewComponent.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadPicStickerCustomGuideDialog@a3d1.scheduleLoadTimeout$1");
        return unit;
    }
}
