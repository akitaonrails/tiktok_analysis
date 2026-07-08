package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0P45, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P45 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.$t != 0) {
            super.updateDrawState(textPaint);
        } else {
            updateDrawState$0(this, textPaint);
        }
    }

    public C0P45(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C0P45 c0p45, View view) {
        C633880Ote.LIZJ = "start";
        C20515215Pi c20515215Pi = C633880Ote.LIZIZ;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
    }

    public static final void onClick$1(C0P45 c0p45, View view) throws Throwable {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        ((MusicDescAssem) c0p45.l0).hZ1();
    }

    public static final void updateDrawState$0(C0P45 c0p45, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, (Context) c0p45.l0);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
