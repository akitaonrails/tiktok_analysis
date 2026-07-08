package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839330xxr extends FrameLayout implements InterfaceC1839510xy9 {
    public final C2673011r LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public ObjectAnimator LLILZ;
    public BoardTextFontStyleData LLILZIL;
    public InterfaceC1839510xy9 LLILZLL;
    public final Drawable LLIZ;
    public final Drawable LLIZLLLIL;

    public final void LIZJ() {
        Integer numValueOf;
        BoardTextFontStyleData boardTextFontStyleData = this.LLILZIL;
        if (boardTextFontStyleData == null || (numValueOf = Integer.valueOf(boardTextFontStyleData.LIZIZ)) == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            C786410Ut5.LJZI(4, this.LLILLL);
            return;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() != 3) {
                if (numValueOf.intValue() == 2) {
                    C786410Ut5.LJZI(0, this.LLILLL);
                    ObjectAnimator objectAnimator = this.LLILZ;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    this.LLILZ = null;
                    C786410Ut5.Cb(this.LLILLL, 0.0f);
                    this.LLILLL.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.ckr));
                    return;
                }
                return;
            }
            C786410Ut5.LJZI(0, this.LLILLL);
            this.LLILLL.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.cks));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, "rotation", 0.0f, 360.0f);
            this.LLILZ = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator2 = this.LLILZ;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator3 = this.LLILZ;
            if (objectAnimator3 != null) {
                objectAnimator3.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator4 = this.LLILZ;
            if (objectAnimator4 != null) {
                C786410Ut5.Pd(objectAnimator4);
            }
        }
    }

    public final boolean LJ() {
        BoardTextFontStyleData boardTextFontStyleData = this.LLILZIL;
        return boardTextFontStyleData != null && boardTextFontStyleData.LIZIZ == 1;
    }

    public final boolean LJFF() {
        BoardTextFontStyleData boardTextFontStyleData = this.LLILZIL;
        if (boardTextFontStyleData == null) {
            return false;
        }
        int i = boardTextFontStyleData.LIZIZ;
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            LIZJ();
            return false;
        }
        C497740JfY.LJII();
        try {
            if (C036E.LIZ.LIZIZ()) {
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        BoardTextFontStyleData boardTextFontStyleData2 = this.LLILZIL;
        if (boardTextFontStyleData2 != null) {
            C1839560xyE.LJIIIZ(getContext(), boardTextFontStyleData2, this);
            boardTextFontStyleData2.LIZIZ = 3;
        }
        LIZJ();
        return false;
    }

    public final BoardTextFontStyleData getFontData() {
        return this.LLILZIL;
    }

    public C1839330xxr(Context context) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.gxq, C786410Ut5.ne(context), this);
        C2673011r c2673011r = (C2673011r) viewSd.findViewById(R.id.y3k);
        this.LL = c2673011r;
        this.LLILLL = (ImageView) viewSd.findViewById(R.id.w1c);
        this.LLILLJJLI = viewSd.findViewById(R.id.txt_bg);
        int iLIZIZ = (int) C497740JfY.LIZIZ(99.0f);
        C20736316Cj.LIZIZ(R.attr.exp, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.exp, context);
        C497740JfY.LIZIZ(2.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iLIZIZ2);
        float f = iLIZIZ;
        gradientDrawable.setCornerRadius(f);
        this.LLIZ = gradientDrawable;
        C20736316Cj.LIZIZ(R.attr.exj, context);
        int iLIZIZ3 = C20736316Cj.LIZIZ(R.attr.exj, context);
        C497740JfY.LIZIZ(2.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(iLIZIZ3);
        gradientDrawable2.setCornerRadius(f);
        this.LLIZLLLIL = gradientDrawable2;
        c2673011r.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setFontDataInternal(com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L54
            r6.LLILZIL = r7
            com.bytedance.android.livesdk.model.SMBBoardFontStyle r0 = r7.LIZLLL
            r2 = 0
            if (r0 == 0) goto L9e
            java.lang.String r0 = r0.fontDisplayName
            if (r0 == 0) goto L9e
            int r1 = r0.length()
            if (r1 <= 0) goto L9e
        L13:
            java.lang.String r4 = r7.fontDisplayName
            if (r4 == 0) goto L9c
            int r1 = r4.length()
            if (r1 <= 0) goto L9c
        L1d:
            java.lang.String r5 = "ttlive_boards_gbFonts_"
            if (r0 == 0) goto L55
            X.0fNV r3 = X.C1124870fNV.LIZJ()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r2.append(r5)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r1)
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            r3.getClass()
            java.lang.String r2 = X.C1124870fNV.LIZIZ(r1)
            if (r2 == 0) goto L55
            int r1 = r2.length()
            if (r1 <= 0) goto L55
            r0 = r2
        L49:
            int r1 = r0.length()
            if (r1 <= 0) goto L54
            X.011r r1 = r6.LL
            r1.setText(r0)
        L54:
            return
        L55:
            if (r4 == 0) goto L80
            X.0fNV r3 = X.C1124870fNV.LIZJ()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r2.append(r5)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toLowerCase(r1)
            r2.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            r3.getClass()
            java.lang.String r2 = X.C1124870fNV.LIZIZ(r1)
            if (r2 == 0) goto L80
            int r1 = r2.length()
            if (r1 <= 0) goto L80
            r0 = r2
            goto L49
        L80:
            if (r0 != 0) goto L49
            if (r4 == 0) goto L86
            r0 = r4
            goto L49
        L86:
            com.bytedance.android.livesdk.model.SMBBoardFontStyle r0 = r7.LIZLLL
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.fontIdentifier
            if (r0 == 0) goto L95
            int r1 = r0.length()
            if (r1 <= 0) goto L95
            goto L49
        L95:
            java.lang.String r0 = r7.fontIdentifier
            if (r0 != 0) goto L49
            java.lang.String r0 = ""
            goto L49
        L9c:
            r4 = r2
            goto L1d
        L9e:
            r0 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1839330xxr.setFontDataInternal(com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData):void");
    }

    @Override // X.InterfaceC1839510xy9
    public final void LIZIZ(boolean z) {
        BoardTextFontStyleData boardTextFontStyleData = this.LLILZIL;
        if (boardTextFontStyleData != null) {
            boardTextFontStyleData.LIZIZ = 2;
            LIZJ();
        }
        InterfaceC1839510xy9 interfaceC1839510xy9 = this.LLILZLL;
        if (interfaceC1839510xy9 != null) {
            interfaceC1839510xy9.LIZIZ(z);
        }
    }

    public final void LIZLLL(BoardTextFontStyleData boardTextFontStyleData) {
        Typeface typefaceLJ;
        setFontDataInternal(boardTextFontStyleData);
        BoardTextFontStyleData boardTextFontStyleData2 = this.LLILZIL;
        if (boardTextFontStyleData2 != null && (typefaceLJ = C1839560xyE.LJ(boardTextFontStyleData2.LIZ())) != null) {
            this.LL.setTypeface(typefaceLJ);
        }
        LIZJ();
    }

    public final void setDownloadCallback(InterfaceC1839510xy9 interfaceC1839510xy9) {
        this.LLILZLL = interfaceC1839510xy9;
    }

    public final void setFontData(BoardTextFontStyleData boardTextFontStyleData) {
        this.LLILZIL = boardTextFontStyleData;
    }

    public final void setTextFontTypeLayoutBackground(int i) {
        Drawable drawable;
        int iLIZIZ;
        if (i == 0 || i != 1) {
            drawable = this.LLIZLLLIL;
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exp, getContext());
        } else {
            drawable = this.LLIZ;
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exg, getContext());
        }
        this.LLILLJJLI.setBackground(drawable);
        this.LL.setTextColor(iLIZIZ);
    }

    @Override // X.InterfaceC1839510xy9
    public final void LIZ(BoardTextFontStyleData boardTextFontStyleData, boolean z) {
        Typeface typefaceLJ;
        LIZJ();
        BoardTextFontStyleData boardTextFontStyleData2 = this.LLILZIL;
        boolean z2 = true;
        boolean z3 = false;
        if (boardTextFontStyleData2 != null && boardTextFontStyleData2.LIZIZ != 1) {
            return;
        }
        InterfaceC1839510xy9 interfaceC1839510xy9 = this.LLILZLL;
        if (interfaceC1839510xy9 != null) {
            if (boardTextFontStyleData2 != null) {
                if (boardTextFontStyleData2.LIZIZ != 1) {
                    z2 = false;
                }
                z3 = z2;
            }
            interfaceC1839510xy9.LIZ(boardTextFontStyleData2, z3);
        }
        BoardTextFontStyleData boardTextFontStyleData3 = this.LLILZIL;
        if (boardTextFontStyleData3 != null && (typefaceLJ = C1839560xyE.LJ(boardTextFontStyleData3.LIZ())) != null) {
            this.LL.setTypeface(typefaceLJ);
        }
    }
}
