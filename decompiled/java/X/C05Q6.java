package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.celebration.CelebrationPosterComponent$createPoster$1$2$result2$1$1", f = "CelebrationPosterComponent.kt", l = {}, m = "invokeSuspend")
public final class C05Q6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C0MPL LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<Bitmap> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q6(C0MPL c0mpl, View view, String str, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C05Q6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mpl;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationPosterComponent@e211.createPoster$1$2$result2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<Bitmap, Canvas> pairX1 = this.LL.X1(this.LLILLJJLI);
        Bitmap first = pairX1.getFirst();
        pairX1.getSecond();
        boolean zLIZ = C2243308qd.LIZ(first, this.LLILLL);
        C786410Ut5.LJJJJ(first);
        Bitmap bitmap = this.LLILZ.element;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        Boolean boolValueOf = Boolean.valueOf(zLIZ);
        C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$2$result2$1$1");
        return boolValueOf;
    }
}
