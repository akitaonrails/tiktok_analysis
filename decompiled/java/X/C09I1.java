package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09I1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1", f = "StickerResizeHelper.kt", l = {37, 45}, m = "invokeSuspend")
public final class C09I1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1621190sI1> LLILLJJLI;
    public final /* synthetic */ int[] LLILLL;
    public final /* synthetic */ List<Bitmap> LLILZ;
    public final /* synthetic */ Function2<C09I6, List<Bitmap>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09I1(List<C1621190sI1> list, int[] iArr, List<Bitmap> list2, Function2<? super C09I6, ? super List<Bitmap>, Unit> function2, InterfaceC1364105Vn<? super C09I1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = iArr;
        this.LLILZ = list2;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09I1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                List<C1621190sI1> list = this.LLILLJJLI;
                int[] iArr = this.LLILLL;
                List<Bitmap> list2 = this.LLILZ;
                Iterator<C1621190sI1> it2 = list.iterator();
                while (it2.hasNext()) {
                    Bitmap bitmapLJI = C2475309mx.LJI(iArr[0], iArr[1], 0, 4, it2.next().LIZ);
                    if (bitmapLJI != null) {
                        list2.add(bitmapLJI);
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C09I0 c09i0 = new C09I0(this.LLILLJJLI, this.LLILZ, this.LLILZIL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c09i0) == objLJFF) {
                    C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C09I2 c09i2 = new C09I2(this.LLILZ, null, this.LLILZIL);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c09i2) == objLJFF) {
                C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerResizeHelperKt@f54d.resizePropImagesAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
