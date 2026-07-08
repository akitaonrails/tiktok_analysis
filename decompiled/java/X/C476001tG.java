package X;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.FuzzyImageExtKt$fuzzyAndSave$2", f = "FuzzyImageExt.kt", l = {}, m = "invokeSuspend")
public final class C476001tG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476001tG(Bitmap bitmap, File file, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476001tG(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FuzzyImageExtKt@b1d3.fuzzyAndSave$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.exists()) {
            this.LL.delete();
        }
        C2477909nN.LJFF(this.LLILLJJLI, this.LL.getPath(), Bitmap.CompressFormat.JPEG, 80);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fuzzy img saved to ");
        sbLIZ.append(this.LL.getPath());
        Integer numLJ = C2286608xc.LJ(Log.d("Story", C2188811AlT.LIZIZ(sbLIZ)));
        C1C7U.LIZIZ("FuzzyImageExtKt@b1d3.fuzzyAndSave$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
