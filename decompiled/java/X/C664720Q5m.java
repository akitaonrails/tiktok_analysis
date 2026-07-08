package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Q5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664720Q5m extends FrameLayout {
    public C1012300cRw LL;
    public TuxTextView LLILLJJLI;
    public EnumC664680Q5i LLILLL;
    public CharSequence LLILZ;
    public C0Q6F LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public final TuxTextView getSubtitleContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wm5);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1012300cRw getSubtitleControlIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wm6);
            this.LL = (C1012300cRw) callbackFindViewById;
        }
        return (C1012300cRw) callbackFindViewById;
    }

    public final C0Q6F getDelegate() {
        return this.LLILZIL;
    }

    public final EnumC664680Q5i getState() {
        return this.LLILLL;
    }

    public final CharSequence getText() {
        return this.LLILZ;
    }

    public final void setDelegate(C0Q6F c0q6f) {
        this.LLILZIL = c0q6f;
    }

    public final void setState(EnumC664680Q5i enumC664680Q5i) {
        int i = C664690Q5j.LIZ[enumC664680Q5i.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getSubtitleControlIconFromXml().LIZ(EnumC1012120cRe.ON, false);
                if (enumC664680Q5i != this.LLILLL) {
                    setText("");
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            getSubtitleControlIconFromXml().LIZ(EnumC1012120cRe.OFF, false);
            C337180DJs.LIZ(getSubtitleContentFromXml());
        }
        this.LLILLL = enumC664680Q5i;
    }

    public final void setSubtitleContentFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSubtitleControlIconFromXml(C1012300cRw c1012300cRw) {
        this.LL = c1012300cRw;
    }

    public final void setSubtitleEnabled(boolean z) {
        this.LLILZLL = z;
        if (!z) {
            C337180DJs.LIZ(this);
        }
    }

    public final void setSubtitleVisible(boolean z) {
        if (z && this.LLILZLL && this.LLIZ) {
            C337180DJs.LIZJ(this);
        } else {
            C337180DJs.LIZ(this);
        }
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0 && this.LLILLL != EnumC664680Q5i.CLOSED) {
            C786410Ut5.LLLLZLL(getSubtitleContentFromXml(), 0);
            getSubtitleContentFromXml().setText(charSequence);
        } else {
            C786410Ut5.LLLLZLL(getSubtitleContentFromXml(), 8);
        }
        this.LLILZ = charSequence;
    }

    public final void setVideoPlaying(boolean z) {
        if (z && !this.LLIZ) {
            setText("");
        }
        this.LLIZ = z;
        if (!z) {
            C337180DJs.LIZ(this);
        }
    }

    public C664720Q5m(Context context, AttributeSet attributeSet) {
        Drawable drawableLIZIZ;
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.ezz, this);
        C786410Ut5.Ja(getSubtitleControlIconFromXml(), new ACListenerS145S0100000_10(this, 27));
        TuxTextView subtitleContentFromXml = getSubtitleContentFromXml();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, context);
        if (numLIZJ != null) {
            drawableLIZIZ = C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(4), numLIZJ.intValue());
        } else {
            drawableLIZIZ = null;
        }
        subtitleContentFromXml.setBackground(drawableLIZIZ);
        C426750GoL.LJIIIZ(findViewById(R.id.wm5), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))), false, 23);
        this.LLILLL = EnumC664680Q5i.CLOSED;
        this.LLILZ = "";
    }
}
