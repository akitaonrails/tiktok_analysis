package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390410mHn extends View {
    public static final /* synthetic */ int LLJJI = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final Paint LLILLL;
    public final PorterDuffXfermode LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;

    public C1390410mHn(Context context) {
        this(context, null, 6);
    }

    public C1390410mHn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        this.LLJ = -1L;
        if (this.LLJI <= 0) {
            setProgressBarInfo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight > measuredWidth) {
            measuredHeight = measuredWidth;
        }
        if (1 <= measuredHeight && measuredHeight < this.LLJI) {
            setProgressBarInfo(measuredHeight);
        }
        this.LLIZ = true;
    }

    public final void LIZJ() {
        String localClassName;
        String tag;
        if (C0BTC.LIZ()) {
            C1390460mHs.LIZ.getClass();
            C01GW c01gw = C1390460mHs.LIZJ;
            if (((C603820NmG) c01gw.getValue()).LIZJ(Integer.valueOf(hashCode())) == null) {
                ((C603820NmG) c01gw.getValue()).LIZLLL(Integer.valueOf(hashCode()), Long.valueOf(System.currentTimeMillis()));
                JSONObject jSONObject = new JSONObject();
                Activity activityLIZ = C0FNT.LIZ(getContext());
                String str = "";
                if (activityLIZ == null || (localClassName = activityLIZ.getLocalClassName()) == null) {
                    localClassName = "";
                }
                jSONObject.put("page_key", localClassName);
                jSONObject.put("network_status", C1390460mHs.LIZIZ());
                Fragment fragmentLIZ = C946803n0.LIZ(this);
                jSONObject.put("host_fragment", fragmentLIZ != null ? fragmentLIZ.getClass().getName() : "");
                if (fragmentLIZ != null && (tag = fragmentLIZ.getTag()) != null) {
                    str = tag;
                }
                jSONObject.put("fragment_tag", str);
                C793770VBv.LJII("loading_view_show", null, jSONObject, null);
                C20684815ws.LJIJ("loading_view_show", jSONObject);
            }
        }
        LIZ();
        this.LLIZLLLIL = true;
        this.LLILZLL = true;
        postInvalidate();
    }

    public final void LIZLLL() {
        String localClassName;
        String tag;
        if (C0BTC.LIZ()) {
            C1390460mHs.LIZ.getClass();
            Long l = (Long) ((C603820NmG) C1390460mHs.LIZJ.getValue()).LIZJ(Integer.valueOf(hashCode()));
            if (l != null) {
                long jLongValue = l.longValue();
                JSONObject jSONObject = new JSONObject();
                Activity activityLIZ = C0FNT.LIZ(getContext());
                String str = "";
                if (activityLIZ == null || (localClassName = activityLIZ.getLocalClassName()) == null) {
                    localClassName = "";
                }
                jSONObject.put("page_key", localClassName);
                jSONObject.put("network_status", C1390460mHs.LIZIZ());
                jSONObject.put("show_duration", System.currentTimeMillis() - jLongValue);
                Fragment fragmentLIZ = C946803n0.LIZ(this);
                jSONObject.put("host_fragment", fragmentLIZ != null ? fragmentLIZ.getClass().getName() : "");
                if (fragmentLIZ != null && (tag = fragmentLIZ.getTag()) != null) {
                    str = tag;
                }
                jSONObject.put("fragment_tag", str);
                C793770VBv.LJII("loading_view_hide", null, jSONObject, null);
                C20684815ws.LJIJ("loading_view_hide", jSONObject);
            }
        }
        this.LLIZLLLIL = false;
        this.LLIZ = false;
        this.LLILZIL = 0.0f;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        boolean z;
        super.onDraw(canvas);
        if ((this.LLIZLLLIL || !this.LLILZLL) && this.LLIZ) {
            if (this.LLILZLL) {
                long jNanoTime = System.nanoTime() / ((long) 1000000);
                if (this.LLJ < 0) {
                    this.LLJ = jNanoTime;
                }
                float f3 = (jNanoTime - this.LLJ) / 400.0f;
                this.LLILZIL = f3;
                int i3 = (int) f3;
                if ((i3 & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLJJ = z;
                this.LLILZIL = f3 - i3;
            }
            float f4 = this.LLILZIL;
            if (f4 < 0.5d) {
                f = 2 * f4 * f4;
            } else {
                float f5 = 2;
                f = ((f5 * f4) * (f5 - f4)) - 1;
            }
            int i4 = this.LLJI;
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LLILLL, 31);
            float f6 = (this.LLJILLL * f) + this.LLJILJILJ;
            if (f < 0.5d) {
                f2 = f * 2.0f;
            } else {
                float f7 = 2;
                f2 = f7 - (f * f7);
            }
            float f8 = this.LLJILJIL;
            float f9 = (0.25f * f2 * f8) + f8;
            Paint paint = this.LLILLL;
            if (this.LLJJ) {
                i = this.LLILLJJLI;
            } else {
                i = this.LL;
            }
            paint.setColor(i);
            canvas.drawCircle(f6, this.LLJIJIL, f9, this.LLILLL);
            float f10 = this.LLJI - f6;
            float f11 = this.LLJILJIL;
            float f12 = f11 - ((f2 * 0.375f) * f11);
            Paint paint2 = this.LLILLL;
            if (this.LLJJ) {
                i2 = this.LL;
            } else {
                i2 = this.LLILLJJLI;
            }
            paint2.setColor(i2);
            this.LLILLL.setXfermode(this.LLILZ);
            canvas.drawCircle(f10, this.LLJIJIL, f12, this.LLILLL);
            this.LLILLL.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
            postInvalidateDelayed(17L);
        }
    }

    public final void setAnimating(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LLJI = i;
            this.LLJIJIL = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LLJILJIL = f;
            float f2 = (i * 0.16f) + f;
            this.LLJILJILJ = f2;
            this.LLJILLL = i - (f2 * 2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            LIZLLL();
        }
    }

    public final void LIZIZ(float f, boolean z) {
        if (!this.LLIZ) {
            LIZ();
        }
        this.LLILZIL = f;
        this.LLIZLLLIL = false;
        this.LLILZLL = false;
        this.LLJJ = z;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > size2) {
            size = size2;
        }
        if (1 <= size && size < this.LLJI) {
            setProgressBarInfo(size);
        }
    }

    public C1390410mHn(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        this.LLILZ = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LLJ = -1L;
        this.LLJI = -1;
        this.LL = ColorProtector.parseColor("#FE2C55");
        this.LLILLJJLI = ColorProtector.parseColor("#25F4EE");
    }
}
