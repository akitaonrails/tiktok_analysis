package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427770Gpz extends TuxTextView {
    public final Paint LLJJJJ;
    public EnumC428930Grr LLJJJJJIL;
    public Path LLJJJJLIIL;

    public final void LJJJJJ() {
        LJJJJI(this.LLJJJJJIL.getTextSizeDp());
        setLetterSpacing(this.LLJJJJJIL.getLetterSpacing());
    }

    public C427770Gpz(Context context) {
        super(context, null, R.attr.xf);
        this.LLJJJJJIL = EnumC428930Grr.LARGE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxAvatarStackNumberView, R.attr.xf, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAvatarStackNumberView__tux_avatarStackNumberBackgroundColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        paint.setColor(color);
        this.LLJJJJ = paint;
        setEllipsize(TextUtils.TruncateAt.END);
        setGravity(17);
        setAllCaps(true);
        setMaxLines(1);
        setFontFeatureSettings("case, lnum, tnum");
        LJJJJJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float dpFloat$avatar_release = this.LLJJJJJIL.getDpFloat$avatar_release() * 0.5f;
        Path path = this.LLJJJJLIIL;
        if (path == null) {
            canvas.drawCircle(dpFloat$avatar_release, dpFloat$avatar_release, dpFloat$avatar_release, this.LLJJJJ);
            super.onDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipPath(path);
            canvas.drawCircle(dpFloat$avatar_release, dpFloat$avatar_release, dpFloat$avatar_release, this.LLJJJJ);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public final void setBoundaryPath(Path path) {
        this.LLJJJJLIIL = path;
        invalidate();
    }

    public final void setCount(int i) {
        String strLIZIZ;
        if (i <= 0) {
            strLIZIZ = "";
        } else if (i > 99) {
            strLIZIZ = "99+";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(i);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        setText(strLIZIZ);
    }

    public final void setSize(EnumC428930Grr enumC428930Grr) {
        this.LLJJJJJIL = enumC428930Grr;
        LJJJJJ();
        requestLayout();
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(C427740Gpw.LIZ(i, this.LLJJJJJIL.getDp$avatar_release()), C427740Gpw.LIZ(i2, this.LLJJJJJIL.getDp$avatar_release()));
    }
}
