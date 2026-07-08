package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYM extends View implements InterfaceC20742616Eu {
    public final C416860GWe LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    public C0GYM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getMaxCount$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public final void LIZ() {
        String strValueOf;
        C416860GWe c416860GWe = this.LL;
        int variant = getVariant();
        int maxCount = getMaxCount();
        int count = getCount();
        if (variant == 0) {
            strValueOf = "";
        } else if (maxCount == 0 || maxCount > 9) {
            strValueOf = String.valueOf(count);
        } else {
            int i = 1;
            if (1 <= maxCount) {
                int i2 = 1;
                while (true) {
                    i *= 10;
                    if (i2 == maxCount) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int i3 = i - 1;
            if (count > i3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i3);
                sbLIZ.append('+');
                strValueOf = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strValueOf = String.valueOf(count);
            }
        }
        c416860GWe.LJFF = strValueOf;
        invalidate();
        requestLayout();
    }

    public int getDotSize() {
        return this.LL.LIZJ;
    }

    public int getCount() {
        return this.LLILLL;
    }

    public int getMaxCount() {
        return this.LLILZ;
    }

    public int getVariant() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LL.draw(canvas);
    }

    public final void setBadgeBackgroundColor(int i) {
        C416860GWe c416860GWe = this.LL;
        c416860GWe.LIZIZ = i;
        c416860GWe.invalidateSelf();
        invalidate();
    }

    public final void setBadgeTextColor(int i) {
        this.LL.LIZ = i;
        invalidate();
    }

    @Override // X.InterfaceC20742616Eu
    public void setCount(int i) {
        this.LLILLL = i;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setDotSize(int i) {
        C416860GWe c416860GWe = this.LL;
        c416860GWe.LIZJ = i;
        if (c416860GWe.LJFF.length() == 0) {
            requestLayout();
        }
    }

    @Override // X.InterfaceC20742616Eu
    public void setMaxCount(int i) {
        this.LLILZ = i;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setVariant(int i) {
        this.LLILLJJLI = i;
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C416860GWe c416860GWe = this.LL;
        int length = c416860GWe.LJFF.length();
        if (length != 0) {
            if (length != 1) {
                c416860GWe.LIZLLL = (int) Math.ceil(c416860GWe.LJIIJ);
                c416860GWe.LJ = (int) Math.ceil((((double) c416860GWe.LJIIJ) * 0.6666666666666666d) + ((double) c416860GWe.LJI.measureText(c416860GWe.LJFF)));
            } else {
                c416860GWe.LJ = (int) Math.ceil(c416860GWe.LJIIJ);
                c416860GWe.LIZLLL = (int) Math.ceil(c416860GWe.LJIIJ);
            }
        } else {
            int i3 = c416860GWe.LIZJ;
            c416860GWe.LJ = i3;
            c416860GWe.LIZLLL = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LL.LJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LL.LIZLLL, 1073741824));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0GYM(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xd;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAlertBadge, i2, 0);
        this.LL = new C416860GWe(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge__tux_badgeFont, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, -1), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeBackgroundColor, -16777216), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxAlertBadge_tux_badgeDotSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        setVariant(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeVariant, 0));
        setCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeCount, 0));
        setMaxCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeMaxCount, 0));
        typedArrayObtainStyledAttributes.recycle();
        LIZ();
    }
}
