package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244090iTn extends C1662850tND {
    public C19518211Xw LLLLL;
    public C19518211Xw LLLLLIL;

    @Override // X.C1662850tND, X.C1662870tNF
    public final int LJ() {
        return R.layout.fv1;
    }

    public final C19518211Xw getStickerTitleText() {
        C19518211Xw c19518211Xw = this.LLLLL;
        if (c19518211Xw != null) {
            return c19518211Xw;
        }
        return null;
    }

    public final C19518211Xw getStickerUseNumberText() {
        C19518211Xw c19518211Xw = this.LLLLLIL;
        if (c19518211Xw != null) {
            return c19518211Xw;
        }
        return null;
    }

    @Override // X.C1662850tND, X.C1662870tNF
    public final View LIZLLL(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fv1, frameLayout, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        setStickerTitleText((C19518211Xw) viewTd.findViewById(R.id.ueq));
        setStickerUseNumberText((C19518211Xw) viewTd.findViewById(R.id.uer));
        C786410Ut5.W5(viewTd, layoutParams);
        frameLayout.addView(viewTd);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    @Override // X.C1662850tND, X.C1662870tNF
    public final View LJFF(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C19518211Xw c19518211Xw = new C19518211Xw(context, null);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw);
        c19518211Xw.setLayoutParams(layoutParams);
        c19518211Xw.setGravity(8388611);
        return c19518211Xw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1244090iTn.LJIJJLI(java.lang.String):void");
    }

    public final void setStickerTitleText(C19518211Xw c19518211Xw) {
        this.LLLLL = c19518211Xw;
    }

    public final void setStickerUseNumberText(C19518211Xw c19518211Xw) {
        this.LLLLLIL = c19518211Xw;
    }

    @Override // X.C1662870tNF
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        getStickerTitleText().setText(charSequence);
    }

    @Override // X.C1662870tNF
    public final void LIZ(LinearLayout linearLayout, boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
    }

    @Override // X.C1662870tNF
    public final void LJII(View view, FrameLayout frameLayout, int i, int i2, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        C786410Ut5.a6(frameLayout, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        C786410Ut5.W5(view, layoutParams2);
    }

    public C1244090iTn(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, boolean z3, boolean z4, int i7, int i8, int i9, int i10, int i11, int i12, boolean z5, boolean z6) {
        super(context, z, i, i2, i3, 0, 0, i4, z2, 0, 0, i5, i6, 0, 0, z3, z4, i7, i8, i9, i10, i11, i12, z5, z6, false, false, false, false, false, false, 0, 0, null, 0, -134216096, 63);
    }
}
