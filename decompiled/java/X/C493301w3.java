package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.util.PublishPageUtils$saveCustomWithStickerToFile$1", f = "PublishPageUtils.kt", l = {423}, m = "invokeSuspend")
public final class C493301w3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493301w3(VideoPublishEditModel videoPublishEditModel, C259800zU<String> c259800zU, Bitmap bitmap, Function0<Unit> function0, InterfaceC1364105Vn<? super C493301w3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c259800zU;
        this.LLILZ = bitmap;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493301w3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PublishPageUtils@13bc.saveCustomWithStickerToFile$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C493401w4.LIZ()) {
                C0MH8 c0mh8 = C0MH8.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
                if (videoPublishEditModel == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomWithStickerToFile$1");
                    return unit;
                }
                String str = this.LLILLL.element;
                Bitmap bitmap = this.LLILZ;
                if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    i = 1001;
                } else {
                    i = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                c0mh8.getClass();
                Boolean.valueOf(C0MH8.LJIJ(videoPublishEditModel, bitmap, i, 5, str, 100));
            } else {
                C1443400nfG.LJIJJ(this.LLILZ, this.LLILLL.element);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C493201w2 c493201w2 = new C493201w2(this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c493201w2) == objLJFF) {
                C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomWithStickerToFile$1");
                return objLJFF;
            }
        }
        if (!this.LLILZ.isRecycled() && !C493401w4.LIZ()) {
            C786410Ut5.LJJJJ(this.LLILZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PublishPageUtils@13bc.saveCustomWithStickerToFile$1");
        return unit2;
    }
}
