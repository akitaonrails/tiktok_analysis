package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03EB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EB extends FrameLayout {
    public final View LL;
    public final TuxTextView LLILLJJLI;

    private final int getContainerWidth() {
        View view;
        int width;
        int i;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && (i = layoutParams.width) > 0) {
            return i;
        }
        Object parent = getParent();
        return (!(parent instanceof View) || (view = (View) parent) == null || (width = view.getWidth()) <= 0) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : width;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setAvatarBgColor(java.lang.String r5) {
        /*
            r4 = this;
            r1 = 2131100342(0x7f0602b6, float:1.7813063E38)
            if (r5 == 0) goto L34
            X.01GW r0 = X.C2248361CzK.LIZ     // Catch: java.lang.Throwable -> L13
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r3 = X.C2248361CzK.LJ(r0, r5)     // Catch: java.lang.Throwable -> L13
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L13
            goto L1f
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L1f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L26
            r3 = 0
        L26:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L3c
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r3 = X.C1308910kAL.LIZJ(r1, r0)
            if (r3 != 0) goto L3c
        L34:
            android.content.Context r0 = r4.getContext()
            java.lang.Integer r3 = X.C1308910kAL.LIZJ(r1, r0)
        L3c:
            android.view.View r2 = r4.LL
            X.0F3z r1 = new X.0F3z
            r1.<init>()
            r1.LIZ = r3
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.LIZJ = r0
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r2.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03EB.setAvatarBgColor(java.lang.String):void");
    }

    private final void setName(String str) {
        String strSubstring = "";
        String strLJJIFFI = u.LJJIFFI(str, " ", "", false);
        float containerWidth = getContainerWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        TextPaint paint = this.LLILLJJLI.getPaint();
        int length = strLJJIFFI.length();
        int i = 0;
        int i2 = 0;
        while (i <= length) {
            int i3 = (i + length) / 2;
            if (paint.measureText(strLJJIFFI.substring(0, i3)) <= containerWidth) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (i2 > 0) {
            strSubstring = strLJJIFFI.substring(0, i2);
        }
        tuxTextView.setText(strSubstring);
    }

    public C03EB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.e7s, this);
        View viewFindViewById = findViewById(R.id.tqy);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (TuxTextView) viewFindViewById.findViewById(R.id.zym);
    }

    public final void LIZ(String str, String str2) {
        setName(str);
        setAvatarBgColor(str2);
    }
}
