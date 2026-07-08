package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.inspiration.data.ImageInspirationDataManager$fetchInspirationData$2$labelDataDeferred$1", f = "ImageInspirationDataManager.kt", l = {69}, m = "invokeSuspend")
public final class C1409430mmT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RequestLabelResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1409480mmY LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409430mmT(VideoPublishEditModel videoPublishEditModel, C1409480mmY c1409480mmY, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1409480mmY;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409430mmT(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$labelDataDeferred$1");
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
            C1409480mmY c1409480mmY = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            this.LL = 1;
            obj = c1409480mmY.LIZIZ(videoPublishEditModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$labelDataDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImageInspirationDataManager@3f4f.fetchInspirationData$2$labelDataDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RequestLabelResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
