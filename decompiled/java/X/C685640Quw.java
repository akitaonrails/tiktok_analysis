package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Quw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity$jumpToResult$7$1", f = "EcTakePhotoActivity.kt", l = {}, m = "invokeSuspend")
public final class C685640Quw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ EcTakePhotoActivity LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C685640Quw(String str, Bitmap bitmap, Function1<? super Bitmap, Unit> function1, long j, EcTakePhotoActivity ecTakePhotoActivity, InterfaceC1364105Vn<? super C685640Quw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = bitmap;
        this.LLILLL = function1;
        this.LLILZ = j;
        this.LLILZIL = ecTakePhotoActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C685640Quw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        C1C7U.LIZ("EcTakePhotoActivity@354a.jumpToResult$7$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1255704vj.LIZ().LJJI(C009N.GET_BITMAP_END, this.LL, false, false, null);
        if (!this.LLILLJJLI.isRecycled()) {
            this.LLILLL.invoke(this.LLILLJJLI);
        } else {
            Long lLJFF = C2286608xc.LJFF(this.LLILZ);
            PhotoSearchEnterParams photoSearchEnterParams = this.LLILZIL.LLJJL;
            if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
                numLJ = C2286608xc.LJ(photoSearchBusinessEnterParams.rootEnterFromType);
            } else {
                numLJ = null;
            }
            C675840Qf8.LIZ("image_load_fail", "search_result_preload_fail", lLJFF, numLJ, null, null, 1008);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcTakePhotoActivity@354a.jumpToResult$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
