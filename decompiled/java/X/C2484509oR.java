package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerView$showLiveEndView$2$onNewResultImpl$1", f = "LiveShareStickerView.kt", l = {752}, m = "invokeSuspend")
public final class C2484509oR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1324720kZq LL;
    public int LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ C19625211qM LLILZ;
    public final /* synthetic */ C1324720kZq LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2484509oR(Bitmap bitmap, C1324720kZq c1324720kZq, C19625211qM c19625211qM, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bitmap;
        this.LLILZ = c19625211qM;
        this.LLILZIL = c1324720kZq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2484509oR(this.LLILLL, this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1324720kZq c1324720kZq;
        C1C7U.LIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1324720kZq = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Bitmap bitmap = this.LLILLL;
            if (bitmap != null) {
                C19625211qM c19625211qM = this.LLILZ;
                c1324720kZq = this.LLILZIL;
                C1DFH c1dfh = C0PEM.LIZ;
                C2484409oQ c2484409oQ = new C2484409oQ(bitmap, c1324720kZq, c19625211qM, null);
                this.LL = c1324720kZq;
                this.LLILLJJLI = 1;
                obj = C23250099c.LJI(this, c1dfh, c2484409oQ);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1");
            return unit;
        }
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 != null) {
            c1324720kZq.setImageBitmap(bitmap2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveShareStickerView@852b.showLiveEndView$2$onNewResultImpl$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
