package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NPU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel$onPhotoPreviewStart$2", f = "TakoRecordFragmentViewModel.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0NPU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoRecordFragmentViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPU(TakoRecordFragmentViewModel takoRecordFragmentViewModel, Context context, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C0NPU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoRecordFragmentViewModel;
        this.LLILLL = context;
        this.LLILZ = bitmap;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Uri uri;
        C1C7U.LIZ("TakoRecordFragmentViewModel@f921.onPhotoPreviewStart$2");
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
            C0NPY c0npy = new C0NPY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0npy);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoRecordFragmentViewModel@f921.onPhotoPreviewStart$2");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        TakoRecordFragmentViewModel takoRecordFragmentViewModel = this.LLILLJJLI;
        File file = null;
        if (pair != null) {
            uri = (Uri) pair.getFirst();
        } else {
            uri = null;
        }
        takoRecordFragmentViewModel.LLILZIL = uri;
        TakoRecordFragmentViewModel takoRecordFragmentViewModel2 = this.LLILLJJLI;
        if (pair != null) {
            file = (File) pair.getSecond();
        }
        takoRecordFragmentViewModel2.LLILZLL = file;
        TakoRecordFragmentViewModel takoRecordFragmentViewModel3 = this.LLILLJJLI;
        takoRecordFragmentViewModel3.setState(new AwS588S0100000_9(takoRecordFragmentViewModel3, 631));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRecordFragmentViewModel@f921.onPhotoPreviewStart$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
