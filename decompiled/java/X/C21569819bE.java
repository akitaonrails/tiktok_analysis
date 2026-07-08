package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19bE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21569819bE extends C21569419bA {
    public final Paint LLJJL;
    public final Paint LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    private final LinearGradient getLinearGradient() {
        return (LinearGradient) this.LLJLLIL.getValue();
    }

    public final float getCx() {
        return ((Number) this.LLJLILLLLZIIL.getValue()).floatValue();
    }

    public final float getCy() {
        return ((Number) this.LLJLL.getValue()).floatValue();
    }

    public final float getRadiusInner() {
        return ((Number) this.LLJLIL.getValue()).floatValue();
    }

    public final float getRadiusOuter() {
        return ((Number) this.LLJL.getValue()).floatValue();
    }

    @Override // X.C21569419bA
    public final void LIZLLL(Canvas canvas) {
        getRadiusOuter();
        getRadiusInner();
        canvas.drawCircle(getCx(), getCy(), getRadiusOuter(), this.LLJJL);
        this.LLJJLIIIJLLLLLLLZ.setShader(getLinearGradient());
        canvas.drawCircle(getCx(), getCy(), getRadiusInner(), this.LLJJLIIIJLLLLLLLZ);
    }

    public final void setOuterCircleColors(int i) {
        this.LLJJL.setColor(i);
    }

    public final void setOuterCircleStrokeWidth(float f) {
        this.LLJJL.setStrokeWidth(f);
    }

    public C21569819bE(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 3);
        paint.setAntiAlias(true);
        this.LLJJL = paint;
        Paint paint2 = new Paint();
        float width = getWidth();
        float height = getHeight();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bh, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bg, getContext());
        paint2.setShader(new LinearGradient(0.0f, 0.0f, width, height, iIntValue, numLIZJ2 != null ? numLIZJ2.intValue() : 0, Shader.TileMode.CLAMP));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.LLJJLIIIJLLLLLLLZ = paint2;
        this.LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4065));
        this.LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4064));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4061));
        this.LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4062));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4063));
    }
}
