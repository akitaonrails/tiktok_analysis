package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.pipo.ocr.ocr.OcrViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS434S0200000_33;
import njp.a;
import oo5.b;

/* JADX INFO: renamed from: X.1Ai1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.pipo.ocr.ocr.OcrViewModel$fetchOcrInfo$1", f = "OcrViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2186671Ai1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OcrViewModel LL;
    public final /* synthetic */ Uri LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186671Ai1(OcrViewModel ocrViewModel, Uri uri, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ocrViewModel;
        this.LLILLJJLI = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2186671Ai1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x006c: IGET (r2 I:com.bytedance.pipo.ocr.ocr.OcrViewModel) = (r4 I:X.1Ai1) (LINE:16777324) X.1Ai1.LL com.bytedance.pipo.ocr.ocr.OcrViewModel, block:B:12:0x005f */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1Ai1] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r4;
        Bitmap bitmapVQ2;
        C1C7U.LIZ("OcrViewModel@310.fetchOcrInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            bitmapVQ2 = this.LL.vQ2(this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            b bVar = b.LJIJJLI;
            String strValueOf = String.valueOf(108);
            long jCurrentTimeMillis = System.currentTimeMillis();
            OcrViewModel ocrViewModel = r4.LL;
            long j = jCurrentTimeMillis - ocrViewModel.LLILLJJLI;
            long j2 = ocrViewModel.LLILLL;
            long j3 = ocrViewModel.LLILZ;
            long j4 = ocrViewModel.LLILZIL;
            bVar.getClass();
            b.LJI(j, j2, j3, j4, strValueOf);
            r4.LL.LL.postValue(new C2186591Aht(0, 108, String.valueOf(e), null));
        }
        if (bitmapVQ2 == null) {
            this.LL.LL.postValue(new C2186591Aht(0, 108, "bitmap null", null));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OcrViewModel@310.fetchOcrInfo$1");
            return unit;
        }
        if (bitmapVQ2.getByteCount() > 4194304) {
            bitmapVQ2 = C1289680jfK.LIZJ(4194304, bitmapVQ2);
        }
        this.LL.LLILLL = System.currentTimeMillis();
        OcrViewModel ocrViewModel2 = this.LL;
        AwS434S0200000_33 awS434S0200000_33 = new AwS434S0200000_33(this, bitmapVQ2, 155);
        ocrViewModel2.getClass();
        b bVar2 = b.LJIJJLI;
        C2186711Ai5 c2186711Ai5 = new C2186711Ai5(ocrViewModel2, 5, bitmapVQ2, awS434S0200000_33);
        bVar2.getClass();
        b.LJFF(bitmapVQ2, c2186711Ai5);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OcrViewModel@310.fetchOcrInfo$1");
        return unit2;
    }
}
