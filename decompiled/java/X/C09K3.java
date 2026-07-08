package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09K3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverHelper$processCustomCoverInPicMode$1", f = "ChooseCoverHelper.kt", l = {869}, m = "invokeSuspend")
public final class C09K3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<Bitmap> LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ C1322110kVd LLILZ;
    public final /* synthetic */ C214848196g LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09K3(C259800zU<Bitmap> c259800zU, VideoPublishEditModel videoPublishEditModel, C1322110kVd c1322110kVd, C214848196g c214848196g, boolean z, String str, InterfaceC1364105Vn<? super C09K3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = c1322110kVd;
        this.LLILZIL = c214848196g;
        this.LLILZLL = z;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09K3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseCoverHelper@ec4.processCustomCoverInPicMode$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C09K2 c09k2 = new C09K2(this.LLIZ, this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c09k2) == objLJFF) {
                C1C7U.LIZIZ("ChooseCoverHelper@ec4.processCustomCoverInPicMode$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = this.LLILLJJLI.element;
        if (bitmap != null) {
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            C1322110kVd c1322110kVd = this.LLILZ;
            c1443990ngD.getClass();
            if (!bitmap.isRecycled()) {
                c1322110kVd.setImageBitmap(bitmap);
                C565950MHp.LIZ(videoPublishEditModel);
            }
            this.LLILZIL.LJIILJJIL(this.LLILLL, bitmap, true, this.LLILZLL);
            C196S c196s = this.LLILZIL.LJIIL;
            if (c196s != null) {
                c196s.setCoverInSynthesis(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.processCustomCoverInPicMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
