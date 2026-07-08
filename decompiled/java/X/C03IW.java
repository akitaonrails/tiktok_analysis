package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS2S1100000_1;
import kotlin.jvm.internal.AwS210S0300000_1;

/* JADX INFO: renamed from: X.03IW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IW extends LinearLayout {
    public static final C03IX LLILZ = new C03IX(null, null, null, 0, false, false, 127);
    public static final C03IX LLILZIL;
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;

    static {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_info_circle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        LLILZIL = new C03IX(c419910GdJ, null, null, R.attr.a1j, false, false, 118);
    }

    public final TuxIconView getIvChevronFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l5r);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIvIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l6h);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTvTipsTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z7i);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setIvChevronFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setIvIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setMsg(String str) {
        int i;
        if (C703302op.LIZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this);
        getTvTipsTextFromXml().setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[PHI: r2
      0x005d: PHI (r2v1 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v3 java.lang.Integer) binds: [B:13:0x004f, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStyle(X.C03IX r5) {
        /*
            r4 = this;
            com.bytedance.tux.icon.TuxIconView r1 = r4.getIvIconFromXml()
            boolean r0 = r5.LJFF
            r3 = 0
            if (r0 == 0) goto L8d
            r0 = 0
        La:
            X.C786410Ut5.LJLLLLLL(r0, r1)
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r1 = r5.LIZIZ
            if (r1 == 0) goto L83
            android.content.Context r0 = r4.getContext()
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.requireImage(r0)
            if (r0 == 0) goto L83
            X.0kdB r1 = X.C1326790kdB.LIZ
            X.03IT r0 = r0.toThumbFirstImageUrlModel()
            r1.getClass()
            X.0kl3 r2 = X.C1326790kdB.LIZLLL(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131099686(0x7f060026, float:1.7811732E38)
            android.graphics.drawable.Drawable r0 = X.C1308910kAL.LJ(r0, r1)
            r2.LJJIIZI(r0)
            com.bytedance.tux.icon.TuxIconView r0 = r4.getIvIconFromXml()
            r2.LJJI(r0)
            X.C786410Ut5.h3(r2)
        L44:
            com.bytedance.tux.input.TuxTextView r1 = r4.getTvTipsTextFromXml()
            int r0 = r5.LJ
            r1.setTuxFont(r0)
            java.lang.Integer r2 = r5.LIZJ
            if (r2 != 0) goto L5d
            android.content.Context r1 = r4.getContext()
            int r0 = r5.LIZLLL
            java.lang.Integer r2 = X.C1308910kAL.LIZJ(r0, r1)
            if (r2 == 0) goto L68
        L5d:
            int r1 = r2.intValue()
            com.bytedance.tux.input.TuxTextView r0 = r4.getTvTipsTextFromXml()
            r0.setTextColor(r1)
        L68:
            com.bytedance.tux.icon.TuxIconView r1 = r4.getIvChevronFromXml()
            boolean r0 = r5.LJI
            if (r0 != 0) goto L72
            r3 = 8
        L72:
            X.C786410Ut5.LJLLLLLL(r3, r1)
            boolean r0 = r5.LJI
            if (r0 == 0) goto L82
            if (r2 == 0) goto L82
            int r0 = r2.intValue()
            r1.setTintColor(r0)
        L82:
            return
        L83:
            com.bytedance.tux.icon.TuxIconView r1 = r4.getIvIconFromXml()
            X.0GdJ r0 = r5.LIZ
            r1.setTuxIcon(r0)
            goto L44
        L8d:
            r0 = 8
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03IW.setStyle(X.03IX):void");
    }

    public final void setTvTipsTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public C03IW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aio, this, true);
    }

    public final void LIZ(String str, AwS210S0300000_1 awS210S0300000_1) {
        if (str != null && str.length() != 0 && awS210S0300000_1 != null) {
            setClickable(true);
            C786410Ut5.I7(new AjS2S1100000_1(awS210S0300000_1, str, 9), this);
        } else {
            setClickable(false);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(null);
        }
    }
}
