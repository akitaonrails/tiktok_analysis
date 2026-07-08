package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0L4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity$jumpToResult$7", f = "EcTakePhotoActivity.kt", l = {1472}, m = "invokeSuspend")
public final class C536940L4a extends C09AX implements InterfaceC1631630sYr<InterfaceC497601wk, Bitmap, Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZIL;
    public final /* synthetic */ EcTakePhotoActivity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C536940L4a(String str, Function1<? super Bitmap, Unit> function1, EcTakePhotoActivity ecTakePhotoActivity, InterfaceC1364105Vn<? super C536940L4a> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = function1;
        this.LLILZLL = ecTakePhotoActivity;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcTakePhotoActivity@354a.jumpToResult$7");
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
            Bitmap bitmap = (Bitmap) this.LLILLJJLI;
            long j = this.LLILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C685640Quw c685640Quw = new C685640Quw(this.LLILZ, bitmap, this.LLILZIL, j, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c685640Quw) == objLJFF) {
                C1C7U.LIZIZ("EcTakePhotoActivity@354a.jumpToResult$7");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcTakePhotoActivity@354a.jumpToResult$7");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Bitmap bitmap, Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        C536940L4a c536940L4a = new C536940L4a(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c536940L4a.LLILLJJLI = bitmap;
        c536940L4a.LLILLL = jLongValue;
        return c536940L4a.invokeSuspend(Unit.LIZ);
    }
}
