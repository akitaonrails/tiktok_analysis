package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.ImageHeaderModule$onCoverUpdate$1", f = "ImageHeaderModule.kt", l = {828}, m = "invokeSuspend")
public final class C858900Xmi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C214848196g LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858900Xmi(int i, Bitmap bitmap, VideoPublishEditModel videoPublishEditModel, C214848196g c214848196g, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c214848196g;
        this.LLILLL = bitmap;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C214848196g c214848196g = this.LLILLJJLI;
        return new C858900Xmi(this.LLILZIL, this.LLILLL, this.LLILZLL, c214848196g, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("ImageHeaderModule@1844.onCoverUpdate$1");
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
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LIZ;
                Bitmap bitmap = this.LLILLL;
                String str = this.LLILZ;
                if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                    i = 1001;
                } else {
                    i = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                c0mh8.getClass();
                Boolean.valueOf(C0MH8.LJIJ(videoPublishEditModel, bitmap, i, 3, str, 100));
            } else {
                C2477909nN.LJI(this.LLILLL, this.LLILZ, null, 0, 6);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C214848196g c214848196g = this.LLILLJJLI;
            C858920Xmk c858920Xmk = new C858920Xmk(this.LLILZIL, this.LLILLL, this.LLILZLL, c214848196g, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c858920Xmk) == objLJFF) {
                C1C7U.LIZIZ("ImageHeaderModule@1844.onCoverUpdate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.onCoverUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
