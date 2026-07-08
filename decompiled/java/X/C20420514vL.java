package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS610S0100000_31;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: renamed from: X.14vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20420514vL extends ConstraintLayout {
    public Function0<Long> LL;
    public Function0<String> LLILLJJLI;
    public Function0<Boolean> LLILLL;
    public final ConstraintLayout LLILZ;
    public final C1287400jbe LLILZIL;
    public final C1295960jpS LLILZLL;
    public final C1324720kZq LLIZ;
    public final View LLIZLLLIL;
    public final ViewGroup LLJ;
    public final View LLJI;
    public PlayImage LLJIJIL;
    public InterfaceC20420614vM LLJILJIL;

    public final void e0() {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        Function0<Long> function0 = this.LL;
        Long lInvoke = function0 != null ? function0.invoke() : null;
        Function0<String> function02 = this.LLILLJJLI;
        String strInvoke = function02 != null ? function02.invoke() : null;
        Function0<Boolean> function03 = this.LLILLL;
        C978360bZC.LJIJJ("change_cover", "ai_cover_retry", lInvoke, strInvoke, function03 != null ? function03.invoke() : null, 32);
    }

    public final void h0() {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        Function0<Long> function0 = this.LL;
        Long lInvoke = function0 != null ? function0.invoke() : null;
        Function0<String> function02 = this.LLILLJJLI;
        String strInvoke = function02 != null ? function02.invoke() : null;
        Function0<Boolean> function03 = this.LLILLL;
        C978360bZC.LJIJJ("change_cover", "ai_cover", lInvoke, strInvoke, function03 != null ? function03.invoke() : null, 32);
    }

    public final void i0() {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        Function0<Long> function0 = this.LL;
        Long lInvoke = function0 != null ? function0.invoke() : null;
        Function0<String> function02 = this.LLILLJJLI;
        String strInvoke = function02 != null ? function02.invoke() : null;
        Function0<Boolean> function03 = this.LLILLL;
        C978360bZC.LJIJJ("change_cover", "generating", lInvoke, strInvoke, function03 != null ? function03.invoke() : null, 32);
    }

    public final Function0<String> getEditTypeGetter() {
        return this.LLILLJJLI;
    }

    public final Function0<Long> getPlaybookIdGetter() {
        return this.LL;
    }

    public final void setAIGenerate(Function0<Boolean> function0) {
        this.LLILLL = function0;
    }

    public final void setCoverViewListener(InterfaceC20420614vM interfaceC20420614vM) {
        this.LLJILJIL = interfaceC20420614vM;
    }

    public final void setEditTypeGetter(Function0<String> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setPlaybookIdGetter(Function0<Long> function0) {
        this.LL = function0;
    }

    public C20420514vL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.has, C786410Ut5.ne(context), this);
        this.LLILZ = (ConstraintLayout) findViewById(R.id.qph);
        C1287400jbe c1287400jbe = (C1287400jbe) findViewById(R.id.qpj);
        this.LLILZIL = c1287400jbe;
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.qpk);
        this.LLILZLL = c1295960jpS;
        c1295960jpS.setAnimation(R.raw.tux_lottie_common_live_sparkling_loading);
        findViewById(R.id.qpi);
        setClipToOutline(true);
        setOutlineProvider(new C0ID9(2));
        int iRgb = Color.rgb(86, 4, 201);
        int iRgb2 = Color.rgb(4, 79, 255);
        int iRgb3 = Color.rgb(4, 230, 255);
        int iRgb4 = Color.rgb(4, 79, 255);
        int iRgb5 = Color.rgb(184, 113, 255);
        Float fValueOf = Float.valueOf(1.0f);
        c1287400jbe.LIZ(EnumC1287420jbg.SpinDiffuse, new C1287390jbd(10.0f, 3.0f, 0.3f, (List<Float>) C1697810uHb.LJIIJJI(fValueOf, fValueOf), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(4.0f), Float.valueOf(3.0f)), iRgb, iRgb2, iRgb3, iRgb4, iRgb5, 2.0f, 0.0f));
        c1287400jbe.setZOrderMediaOverlay(false);
        c1287400jbe.LIZJ();
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.qpg);
        this.LLIZ = c1324720kZq;
        this.LLIZLLLIL = findViewById(R.id.qpd);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.qpc);
        this.LLJ = viewGroup;
        C500260Jjc.LJLIIIL(500L, viewGroup, new AwS610S0100000_31(this, 39));
        C500260Jjc.LJLIIIL(500L, c1324720kZq, new AwS610S0100000_31(this, 40));
        RadialGradient radialGradient = new RadialGradient(C418440Gaw.LIZIZ(50), C418440Gaw.LIZIZ(50), C418440Gaw.LIZIZ(50), new int[]{1291845632, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        final Paint paint = new Paint(1);
        paint.setShader(radialGradient);
        viewGroup.setBackground(new Drawable() { // from class: X.0GQn
            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                canvas.drawRect(getBounds(), paint);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                paint.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                paint.setColorFilter(colorFilter);
                invalidateSelf();
            }
        });
        View viewFindViewById = findViewById(R.id.qpb);
        this.LLJI = viewFindViewById;
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS610S0100000_31(this, 41));
    }
}
