package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.125j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196989125j extends FrameLayout implements InterfaceC196996125q {
    public final C423220Gie LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public ObjectAnimator LLILZ;
    public TextFontStyleData LLILZIL;
    public InterfaceC196996125q LLILZLL;
    public final Drawable LLIZ;
    public final Drawable LLIZLLLIL;
    public Drawable LLJ;
    public Drawable LLJI;
    public final Integer LLJIJIL;
    public Integer LLJILJIL;
    public int LLJILJILJ;

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    public final void LIZIZ() {
        TextFontStyleData textFontStyleData = this.LLILZIL;
        if (textFontStyleData == null) {
            return;
        }
        int i = textFontStyleData.LIZIZ;
        if (i == 1) {
            C786410Ut5.LJZI(4, this.LLILLL);
            return;
        }
        if (i == 2) {
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
        if (i == 3) {
            C786410Ut5.LJZI(0, this.LLILLL);
            this.LLILLL.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.cks));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, "rotation", 0.0f, 360.0f);
            this.LLILZ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(800L);
            this.LLILZ.setRepeatMode(1);
            this.LLILZ.setRepeatCount(-1);
            C786410Ut5.Pd(this.LLILZ);
        }
    }

    @Override // X.InterfaceC196996125q
    public final void LIZJ() {
        TextFontStyleData textFontStyleData = this.LLILZIL;
        if (textFontStyleData != null) {
            textFontStyleData.LIZIZ = 2;
            LIZIZ();
        }
        InterfaceC196996125q interfaceC196996125q = this.LLILZLL;
        if (interfaceC196996125q != null) {
            interfaceC196996125q.LIZJ();
        }
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZJ(getContext().getResources().getString(2131834850));
        c1233040iBy.LIZLLL();
        Context context = getContext();
        String string = getContext().getResources().getString(2131834850);
        C1233040iBy c1233040iBy2 = new C1233040iBy(context);
        c1233040iBy2.LIZJ(string);
        c1233040iBy2.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r0 = r4.LLILZIL
            if (r0 != 0) goto L5
            return
        L5:
            X.125g r3 = X.C196986125g.LJFF()
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r0 = r4.LLILZIL
            java.lang.String r2 = r0.fileName
            r3.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L52
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r3.LIZIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            int r0 = r0.size()
            if (r0 == 0) goto L52
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r3.LIZIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r2)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L4b
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData> r0 = r3.LIZ
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L52
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData> r0 = r3.LIZ
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r0 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData) r0
            java.lang.String r0 = r0.LIZ
            android.graphics.Typeface r1 = X.C196986125g.LJI(r0)
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r3.LIZIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r2, r1)
        L4b:
            if (r1 == 0) goto L52
            X.0Gie r0 = r4.LL
            r0.setTypeface(r1)
        L52:
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r0 = r4.LLILZIL
            int r1 = r0.enableMaskBlurLightColor
            r0 = 1
            if (r1 != r0) goto L60
            X.0Gie r1 = r4.LL
            r0 = -6400(0xffffffffffffe700, float:NaN)
            r1.setMaskBlurColor(r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196989125j.LJ():void");
    }

    public TextFontStyleData getFontData() {
        return this.LLILZIL;
    }

    private void setFontData(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        this.LLILZIL = textFontStyleData;
        if (!TextUtils.isEmpty(textFontStyleData.title)) {
            this.LL.setText(this.LLILZIL.title);
        }
    }

    public final void LIZLLL(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        setFontData(textFontStyleData);
        LJ();
        LIZIZ();
    }

    public void setBackground(int i) {
        Drawable drawable;
        this.LLJILJILJ = i;
        if (i != 1) {
            drawable = this.LLJI;
        } else {
            drawable = this.LLJ;
        }
        this.LLILLJJLI.setBackground(drawable);
        Integer num = this.LLJILJIL;
        if (num != null) {
            this.LL.setTextColor(num.intValue());
            return;
        }
        Integer num2 = this.LLJIJIL;
        if (num2 == null) {
            return;
        }
        this.LL.setTextColor(num2.intValue());
    }

    public void setDownloadCallback(InterfaceC196996125q interfaceC196996125q) {
        this.LLILZLL = interfaceC196996125q;
    }

    public C196989125j(Context context, int i) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.djn, C786410Ut5.ne(context), this);
        C423220Gie c423220Gie = (C423220Gie) viewSd.findViewById(R.id.y3k);
        this.LL = c423220Gie;
        this.LLILLL = (ImageView) viewSd.findViewById(R.id.w1c);
        this.LLILLJJLI = viewSd.findViewById(R.id.txt_bg);
        int iLIZIZ = (int) C11VU.LIZIZ(6.0f, getContext());
        if (i == 2) {
            int iLIZ = C1388580mEq.LIZ(R.attr.ewy, context);
            this.LLIZ = C426580Go4.LIZJ(iLIZ, 16777215, (int) C11VU.LIZIZ(2.0f, getContext()), iLIZIZ);
            this.LLIZLLLIL = C426580Go4.LIZJ(C20736316Cj.LIZIZ(R.attr.ey9, context), 16777215, (int) C11VU.LIZIZ(2.0f, getContext()), iLIZIZ);
            this.LLJIJIL = Integer.valueOf(iLIZ);
            c423220Gie.setTextColor(iLIZ);
        } else {
            this.LLIZ = C426580Go4.LIZJ(-1, 16777215, (int) C11VU.LIZIZ(2.0f, getContext()), iLIZIZ);
            this.LLIZLLLIL = C426580Go4.LIZJ(889192447, 16777215, 1, iLIZIZ);
            this.LLJIJIL = null;
        }
        this.LLJ = this.LLIZ;
        this.LLJI = this.LLIZLLLIL;
    }

    @Override // X.InterfaceC196996125q
    public final void LIZ(TextFontStyleData textFontStyleData, boolean z) {
        LIZIZ();
        TextFontStyleData textFontStyleData2 = this.LLILZIL;
        int i = textFontStyleData2.LIZIZ;
        boolean z2 = false;
        if (i == 1) {
            InterfaceC196996125q interfaceC196996125q = this.LLILZLL;
            if (interfaceC196996125q != null) {
                if (i == 1) {
                    z2 = true;
                }
                interfaceC196996125q.LIZ(textFontStyleData2, z2);
            }
            LJ();
            return;
        }
        Context context = getContext();
        String string = getContext().getResources().getString(2131834850);
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZJ(string);
        c1233040iBy.LIZLLL();
    }
}
