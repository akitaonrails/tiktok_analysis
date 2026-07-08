package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalPushIntoUIUpdate;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09n2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addPortalShortCutWithLottie$2$4", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
public final class C2475809n2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LL;
    public final /* synthetic */ C259800zU<Bitmap> LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<C1295960jpS> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Uri LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2475809n2(RedEnvelopeWidget redEnvelopeWidget, C259800zU<Bitmap> c259800zU, C259800zU<Bitmap> c259800zU2, C259800zU<String> c259800zU3, C259800zU<C1295960jpS> c259800zU4, C013C c013c, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, Uri uri, InterfaceC1364105Vn<? super C2475809n2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = redEnvelopeWidget;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
        this.LLILZLL = c013c;
        this.LLIZ = str;
        this.LLIZLLLIL = redEnvelopeInfoModel4FE;
        this.LLJ = z;
        this.LLJI = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2475809n2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final Bitmap bitmapCreateBitmap;
        final Bitmap bitmapCreateBitmap2;
        int height;
        float width;
        int height2;
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.context == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$4");
            return unit;
        }
        Bitmap bitmap = this.LLILLJJLI.element;
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height3 = bitmap.getHeight();
            if (bitmap.getWidth() < bitmap.getHeight()) {
                height2 = bitmap.getWidth();
            } else {
                height2 = bitmap.getHeight();
            }
            float f = 192 / height2;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width2 - height2) / 2, (height3 - height2) / 2, height2, height2, matrix, true);
        } else {
            bitmapCreateBitmap = null;
        }
        RedEnvelopeWidget redEnvelopeWidget = this.LL;
        Bitmap bitmap2 = this.LLILLL.element;
        String str = this.LLILZ.element;
        redEnvelopeWidget.getClass();
        int i = 0;
        if (bitmap2 != null) {
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                height = bitmap2.getWidth();
            } else {
                height = bitmap2.getHeight();
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(height, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            float f2 = height / 2.0f;
            canvas.drawCircle(f2, f2, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            float height4 = 0.0f;
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                width = 0.0f;
            } else {
                width = (bitmap2.getWidth() - bitmap2.getHeight()) / 2.0f;
            }
            if (bitmap2.getWidth() < bitmap2.getHeight()) {
                height4 = (bitmap2.getHeight() - bitmap2.getWidth()) / 2.0f;
            }
            canvas.drawBitmap(bitmap2, width, height4, paint);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(redEnvelopeWidget.context), R.layout.hgx, null, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewTd.findViewById(R.id.rif);
            C16F5 c16f5 = (C16F5) viewTd.findViewById(R.id.rig);
            if (c16f5 != null) {
                if (str.length() <= 7) {
                    c16f5.setTextSize(0, 33.0f);
                } else {
                    c16f5.setTextSize(0, 27.0f);
                }
                c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, c16f5.getContext()));
                c16f5.setText(str);
            }
            viewTd.measure(View.MeasureSpec.makeMeasureSpec(192, 1073741824), View.MeasureSpec.makeMeasureSpec(48, 1073741824));
            viewTd.layout(0, 0, viewTd.getMeasuredWidth(), viewTd.getMeasuredHeight());
            appCompatImageView.setImageBitmap(bitmapCreateBitmap3);
            bitmapCreateBitmap2 = Bitmap.createBitmap(viewTd.getWidth(), viewTd.getHeight(), Bitmap.Config.ARGB_8888);
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap2), viewTd);
        } else {
            bitmapCreateBitmap2 = null;
        }
        RedEnvelopeWidget redEnvelopeWidget2 = this.LL;
        View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(redEnvelopeWidget2.context), R.layout.hgv, null, false);
        ((TextView) viewTd2.findViewById(R.id.rid)).setText(redEnvelopeWidget2.context.getString(2131843845));
        viewTd2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(42, 1073741824));
        viewTd2.layout(0, 0, viewTd2.getMeasuredWidth(), viewTd2.getMeasuredHeight());
        final Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(viewTd2.getWidth(), viewTd2.getHeight(), Bitmap.Config.ARGB_8888);
        C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap4), viewTd2);
        final C259800zU<C1295960jpS> c259800zU = this.LLILZIL;
        c259800zU.element.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.09n3
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                Bitmap bitmap3 = bitmapCreateBitmap;
                if (bitmap3 != null) {
                    C259800zU<C1295960jpS> c259800zU2 = c259800zU;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        c259800zU2.element.updateBitmap("image_2", bitmap3);
                    } else {
                        c259800zU2.element.updateBitmap("preview_image", bitmap3);
                    }
                }
                Bitmap bitmap4 = bitmapCreateBitmap2;
                if (bitmap4 != null) {
                    C259800zU<C1295960jpS> c259800zU3 = c259800zU;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        c259800zU3.element.updateBitmap("image_1", bitmap4);
                    } else {
                        c259800zU3.element.updateBitmap("preview_text", bitmap4);
                    }
                }
                Bitmap bitmap5 = bitmapCreateBitmap4;
                if (bitmap5 != null) {
                    C259800zU<C1295960jpS> c259800zU4 = c259800zU;
                    if (PortalPushIntoUIUpdate.INSTANCE.getValue()) {
                        c259800zU4.element.updateBitmap("image_0", bitmap5);
                    } else {
                        c259800zU4.element.updateBitmap("label", bitmap5);
                    }
                }
            }
        });
        if (!this.LLILZLL.element) {
            i = -1;
        }
        C1104350eqP.LIZIZ(i, this.LLIZ, this.LLIZLLLIL.envelopList, Boolean.valueOf(this.LLJ), null, this.LL.LLILZIL);
        this.LL.x1(this.LLJI, this.LLILZIL.element);
        this.LL.A1();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addPortalShortCutWithLottie$2$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
