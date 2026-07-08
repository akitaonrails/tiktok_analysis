package X;

import android.graphics.Bitmap;
import co5.g;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import eo5.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ai5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186711Ai5 implements b {
    public final /* synthetic */ OcrViewModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ Bitmap LIZJ;
    public final /* synthetic */ Function0 LIZLLL;

    public C2186711Ai5(OcrViewModel ocrViewModel, int i, Bitmap bitmap, Function0 function0) {
        this.LIZ = ocrViewModel;
        this.LIZIZ = i;
        this.LIZJ = bitmap;
        this.LIZLLL = function0;
    }

    @Override // eo5.b
    public final void LIZ(int i, int i2, String str, g gVar, String str2) {
        if (i == 1 && i2 == 1 && gVar != null) {
            oo5.b bVar = oo5.b.LJIJJLI;
            long jCurrentTimeMillis = System.currentTimeMillis();
            OcrViewModel ocrViewModel = this.LIZ;
            long j = jCurrentTimeMillis - ocrViewModel.LLILLJJLI;
            long j2 = ocrViewModel.LLILLL;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            bVar.getClass();
            oo5.b.LJI(j, j2, jCurrentTimeMillis2, 0L, "success");
            this.LIZ.LL.postValue(new C2186591Aht(i, i2, str, gVar));
            return;
        }
        OcrViewModel ocrViewModel2 = this.LIZ;
        int i3 = this.LIZIZ - 1;
        Bitmap bitmap = this.LIZJ;
        Function0 function0 = this.LIZLLL;
        ocrViewModel2.getClass();
        if (i3 == 0) {
            function0.invoke();
            return;
        }
        oo5.b bVar2 = oo5.b.LJIJJLI;
        C2186711Ai5 c2186711Ai5 = new C2186711Ai5(ocrViewModel2, i3, bitmap, function0);
        bVar2.getClass();
        oo5.b.LJFF(bitmap, c2186711Ai5);
    }
}
