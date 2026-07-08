package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.MvBitMapUtilsExt$makeEffectIcon$2", f = "MvBitMapUtilsExt.kt", l = {}, m = "invokeSuspend")
public final class C2475709n1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ List<Integer> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2475709n1(int i, int i2, int i3, int i4, int i5, Bitmap bitmap, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2475709n1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LL, this.LLIZLLLIL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MvBitMapUtilsExt@16a0.makeEffectIcon$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapCreateBitmap = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("make effect icon, bitmap size = ");
        sbLIZ.append(bitmapCreateBitmap.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(bitmapCreateBitmap.getHeight());
        C201955140j.LIZIZ("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
        List<Integer> list = this.LLILLJJLI;
        if (list != null && list.size() == 2) {
            int width = (int) ((bitmapCreateBitmap.getWidth() * ((Number) ListProtector.get(this.LLILLJJLI, 0)).intValue()) / 100.0f);
            int height = (int) ((bitmapCreateBitmap.getHeight() * ((Number) ListProtector.get(this.LLILLJJLI, 1)).intValue()) / 100.0f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, width / 2, height / 2, bitmapCreateBitmap.getWidth() - width, bitmapCreateBitmap.getHeight() - height);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cropped size, bitmap size = ");
            sbLIZ2.append(bitmapCreateBitmap.getWidth());
            sbLIZ2.append('x');
            sbLIZ2.append(bitmapCreateBitmap.getHeight());
            C201955140j.LIZIZ("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Bitmap bitmapLJII = C2475309mx.LJII(bitmapCreateBitmap, this.LLILLL, this.LLILZ, 0, 1);
        int i = this.LLILZIL;
        if (i > 0) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapLJII.getWidth(), bitmapLJII.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmapLJII.getWidth(), bitmapLJII.getHeight());
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            canvas.drawColor(0);
            float f = i;
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapLJII, rect, rect, paint);
            C2475309mx.LJ(bitmapLJII);
            bitmapLJII = bitmapCreateBitmap2;
        }
        int i2 = this.LLILZLL;
        if (i2 > 0 || this.LLIZ > 0) {
            int i3 = this.LLIZ;
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapLJII.getWidth() + i2, bitmapLJII.getHeight() + i3, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
            canvas2.drawColor(0);
            canvas2.drawBitmap(bitmapLJII, i2 / 2.0f, i3 / 2.0f, (Paint) null);
            C2475309mx.LJ(bitmapLJII);
            bitmapLJII = bitmapCreateBitmap3;
        }
        Boolean boolValueOf = Boolean.valueOf(C2475309mx.LJFF(100, Bitmap.CompressFormat.PNG, bitmapLJII, new C0VSJ(this.LLIZLLLIL)));
        C1C7U.LIZIZ("MvBitMapUtilsExt@16a0.makeEffectIcon$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
