package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417460GYm extends View implements InterfaceC20742616Eu {
    public final C416900GWi LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            X.0GWi r3 = r5.LL
            int r0 = r5.getVariant()
            r4 = 1
            if (r0 != r4) goto L30
            X.0Yvf r0 = X.C889930Yvf.LIZ
            r0.getClass()
            X.0Yvu r0 = X.C890080Yvu.LIZIZ
            r1 = 0
            boolean r0 = r0.LIZJ(r1)
            if (r0 == 0) goto L30
            X.0YwD r0 = X.C890270YwD.LIZIZ
            boolean r0 = r0.LIZJ(r1)
            if (r0 == 0) goto L30
            int r0 = r5.getCount()
            java.lang.String r0 = X.C1618770sE7.LJIIIIZZ(r0)
        L27:
            r3.LJII = r0
            r5.invalidate()
            r5.requestLayout()
            return
        L30:
            int r0 = r5.getVariant()
            int r2 = r5.getMaxCount()
            int r1 = r5.getCount()
            if (r0 != 0) goto L41
            java.lang.String r0 = ""
            goto L27
        L41:
            if (r2 == 0) goto L6b
            r0 = 9
            if (r2 > r0) goto L6b
            if (r4 > r2) goto L51
            r0 = 1
        L4a:
            int r4 = r4 * 10
            if (r0 == r2) goto L51
            int r0 = r0 + 1
            goto L4a
        L51:
            int r0 = r4 + (-1)
            if (r1 <= r0) goto L66
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 43
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            goto L27
        L66:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L27
        L6b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C417460GYm.LIZ():void");
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
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZIZ = i;
        c416900GWi.invalidateSelf();
        invalidate();
    }

    public final void setBadgeContentColor(int i) {
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZ = i;
        c416900GWi.invalidateSelf();
        invalidate();
    }

    @Override // X.InterfaceC20742616Eu
    public void setCount(int i) {
        this.LLILLL = i;
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
        this.LLILZ = i;
        LIZ();
    }

    @Override // X.InterfaceC20742616Eu
    public void setVariant(int i) {
        this.LLILLJJLI = i;
        LIZ();
    }

    public C417460GYm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xd);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAlertBadge, R.attr.xd, 0);
        this.LL = new C416900GWi(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge__tux_badgeFont, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, -1), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeBackgroundColor, -16777216), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxAlertBadge_tux_badgeDotSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        setVariant(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeVariant, 0));
        setCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeCount, 0));
        setMaxCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge_tux_badgeMaxCount, 0));
        typedArrayObtainStyledAttributes.recycle();
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LL.LIZ();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LL.LJI, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LL.LJFF, 1073741824));
    }
}
