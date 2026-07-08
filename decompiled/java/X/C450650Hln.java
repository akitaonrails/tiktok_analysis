package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450650Hln extends FrameLayout {
    public final View LL;
    public final C21415018rM LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public Integer LLILZLL;
    public CharSequence LLIZ;
    public Function1<? super ImageView, Unit> LLIZLLLIL;

    public final Function1<ImageView, Unit> getCustomImage() {
        return this.LLIZLLLIL;
    }

    public final CharSequence getMessageContent() {
        return this.LLIZ;
    }

    public final View getView() {
        return this.LL;
    }

    public C450650Hln(Context context) {
        super(context, null, R.attr.z6);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hb, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (C21415018rM) viewTd.findViewById(R.id.o8v);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxTooltip, R.attr.z6, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTooltip__tux_tooltipMessageFont, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTooltip__tux_tooltipMessageTextColor, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(int i) {
        ImageView imageView = (ImageView) this.LL.findViewById(R.id.kb6);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = Integer.valueOf(this.LLILZIL);
        int i2 = this.LLILLL;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        imageView.setImageDrawable(c419910GdJ.LIZ(getContext()));
        if (i != 0) {
            C786410Ut5.LJZI(0, imageView);
        } else {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    public final void LIZIZ(EnumC450670Hlp enumC450670Hlp) {
        ImageView imageView = (ImageView) this.LL.findViewById(R.id.kb6);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = C450660Hlo.LIZ[enumC450670Hlp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    C786410Ut5.c6(imageView, layoutParams);
                    this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    C426750GoL.LJIIIZ(imageView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                    return;
                }
                throw new C1954807lC();
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C786410Ut5.c6(imageView, layoutParams);
            this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C426750GoL.LJIIIZ(imageView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
            return;
        }
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.c6(imageView, layoutParams);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIIZ(imageView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
    }

    public final void LIZJ(CharSequence charSequence) {
        this.LLIZ = charSequence;
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c444830HcP.LIZIZ.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(234));
        c444830HcP.LJIILIIL(this.LLIZ);
        c444830HcP.LJII(this.LLILZ);
        c444830HcP.LJIILJJIL(this.LLILZIL);
        c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
        Integer num = this.LLILZLL;
        if (num != null) {
            c444830HcP.LJIIIZ(num.intValue());
        }
        this.LLILLJJLI.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.6f, true, C431830GwX.LIZ(c444830HcP, null, null), 24));
        if (!TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLLLZIL(this.LLILLJJLI, 0);
        } else {
            C786410Ut5.LLLLZIL(this.LLILLJJLI, 8);
        }
    }

    public final void setCustomImage(Function1<? super ImageView, Unit> function1) {
        this.LLIZLLLIL = function1;
        if (function1 != null) {
            ImageView imageView = (ImageView) this.LL.findViewById(R.id.kb6);
            C786410Ut5.LJZI(0, imageView);
            function1.invoke(imageView);
        }
    }

    public final void setMessageContent$tux_theme_release(CharSequence charSequence) {
        this.LLIZ = charSequence;
    }

    public final void LIZLLL(CharSequence charSequence, Integer num) {
        this.LLIZ = charSequence;
        this.LLILZLL = num;
        LIZJ(charSequence);
    }

    public static void LJ(C450650Hln c450650Hln, CharSequence charSequence, int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, c450650Hln.getContext());
        if (numLIZJ != null) {
            c450650Hln.LLILZIL = numLIZJ.intValue();
        }
        c450650Hln.LIZLLL(charSequence, null);
    }
}
