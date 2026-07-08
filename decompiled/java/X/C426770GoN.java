package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426770GoN extends View implements InterfaceC20742616Eu {
    public final C416900GWi LL;
    public C419910GdJ LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public CharSequence LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public C426770GoN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getMaxCount$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public int getDotSize() {
        return this.LL.LIZJ;
    }

    public final void LIZ() {
        int i;
        int variant = getVariant();
        InterfaceC426790GoP c07y3 = variant != 0 ? variant != 1 ? variant != 2 ? variant != 3 ? null : new C07Y3(this.LLILZIL) : new C426800GoQ(this.LLILZLL) : new C426780GoO(getMaxCount(), getCount()) : new C1914007ec(getDotSize());
        if ((c07y3 instanceof C426800GoQ) && (i = this.LLILZLL) != 0) {
            C419910GdJ c419910GdJ = this.LLILLJJLI;
            if (c419910GdJ == null || c419910GdJ.LIZ != i) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = this.LLILZLL;
                c419910GdJ2.LIZLLL = Integer.valueOf(this.LLILLL);
                c419910GdJ2.LIZIZ = 44;
                c419910GdJ2.LIZJ = 44;
                this.LLILLJJLI = c419910GdJ2;
                this.LL.LIZLLL = c419910GdJ2.LIZ(getContext());
                TuxIconDrawable tuxIconDrawable = this.LL.LIZLLL;
                setContentDescription(tuxIconDrawable != null ? tuxIconDrawable.LJIILLIIL : null);
            }
        } else if (c07y3 != null) {
            this.LL.LJII = C426760GoM.LIZJ(c07y3);
            setContentDescription(this.LL.LJII);
        }
        invalidate();
        requestLayout();
    }

    public final int getBadgeIconRes() {
        return this.LLILZLL;
    }

    public final CharSequence getBadgeText() {
        return this.LLILZIL;
    }

    public int getCount() {
        return this.LLIZ;
    }

    public int getMaxCount() {
        return this.LLIZLLLIL;
    }

    public int getVariant() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LL.draw(canvas);
    }

    public final void setBadgeBackgroundColor(int i) {
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZIZ = i;
        c416900GWi.invalidateSelf();
        invalidate();
    }

    public final void setBadgeContentColor(int i) {
        this.LL.LIZ = i;
        invalidate();
    }

    public final void setBadgeContentColorRes(int i) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            setBadgeContentColor(numLIZJ.intValue());
        }
    }

    public final void setBadgeIconRes(int i) {
        this.LLILZLL = i;
        LIZ();
    }

    public final void setBadgeText(CharSequence charSequence) {
        this.LLILZIL = charSequence;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setCount(int i) {
        this.LLIZ = i;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setDotSize(int i) {
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZJ = i;
        if (c416900GWi.LJII.length() == 0) {
            requestLayout();
        }
    }

    @Override // X.InterfaceC20742616Eu
    public void setMaxCount(int i) {
        this.LLIZLLLIL = i;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setVariant(int i) {
        this.LLILZ = i;
        this.LL.LJ = i;
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LL.LIZ();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LL.LJI, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LL.LJFF, 1073741824));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C426770GoN(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xd;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAlertBadge, i2, 0);
        this.LL = C426760GoM.LIZ(typedArrayObtainStyledAttributes, 0, -1, -16777216, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        setVariant(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeVariant, 0));
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxAlertBadge__tux_badgeText);
        setBadgeText(strXd == null ? "" : strXd);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, 0);
        setCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeCount, 0));
        setMaxCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeMaxCount, 0));
        setBadgeIconRes(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge__tux_badgeIcon, 0));
        typedArrayObtainStyledAttributes.recycle();
        LIZ();
        setFocusable(true);
        this.LLILZIL = "";
    }
}
