package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NPY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.vm.TakoRecordFragmentViewModel$onPhotoPreviewStart$2$result$1", f = "TakoRecordFragmentViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0NPY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Uri, ? extends File>>, Object> {
    public final /* synthetic */ TakoRecordFragmentViewModel LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPY(TakoRecordFragmentViewModel takoRecordFragmentViewModel, Context context, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C0NPY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoRecordFragmentViewModel;
        this.LLILLJJLI = context;
        this.LLILLL = bitmap;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("TakoRecordFragmentViewModel@f921.onPhotoPreviewStart$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoRecordFragmentViewModel takoRecordFragmentViewModel = this.LL;
        Context context = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        String str = this.LLILZ;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        takoRecordFragmentViewModel.getClass();
        C1864400ycI c1864400ycI = C1864400ycI.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('_');
        sbLIZ.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        c1864400ycI.getClass();
        String strLIZIZ3 = C1864400ycI.LIZIZ(strLIZIZ2);
        Pair pair = null;
        if (!a0.LJJJIL(strLIZIZ3)) {
            int i = C0NPZ.LIZ[compressFormat.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(a0.LJJZZIII('.', strLIZIZ3, strLIZIZ3));
                    sbLIZ2.append(".jpg");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(a0.LJJZZIII('.', strLIZIZ3, strLIZIZ3));
                    sbLIZ3.append(".webp");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(a0.LJJZZIII('.', strLIZIZ3, strLIZIZ3));
                sbLIZ4.append(".png");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                C0VSV c0vsv = new C0VSV(c0vsj);
                try {
                    bitmap.compress(compressFormat, 100, c0vsv);
                    c0vsv.flush();
                    C2107108Nh.LIZ(c0vsv, null);
                    pair = new Pair(C20189513zB.LIZLLL(context, c0vsj), c0vsj);
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        C1C7U.LIZIZ("TakoRecordFragmentViewModel@f921.onPhotoPreviewStart$2$result$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Uri, ? extends File>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
