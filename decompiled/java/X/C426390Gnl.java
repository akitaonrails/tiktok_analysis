package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426390Gnl extends AbstractC426530Gnz implements InterfaceC430960Gv8, InterfaceC418250Gad {
    public final CharSequence LL;
    public final CharSequence LLILLJJLI;
    public final int LLILLL;
    public final C0GZF LLILZ;
    public final InterfaceC418240Gac LLILZIL;
    public final Map<String, Object> LLILZLL;
    public final int LLIZ = 42;
    public int LLIZLLLIL;

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        return 0.0f;
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1003;
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJI() {
        return C418190GaX.LIZ(this);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJIIIIZZ() {
        return C418190GaX.LIZIZ(this);
    }

    public final void LJIIIZ(Spanned spanned) {
        for (Object obj : spanned.getSpans(0, spanned.length(), C0GZF.class)) {
            C0GZF c0gzf = (C0GZF) obj;
            if (Intrinsics.LJFF(c0gzf, this.LLILZ) && c0gzf != null) {
                int i = this.LLIZLLLIL;
                Drawable drawable = c0gzf.LLILZLL;
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
            }
        }
    }

    @Override // android.text.style.ClickableSpan, X.InterfaceC430960Gv8
    public final void onClick(View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = this.LLILZLL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("origin_url", this.LLILLJJLI);
        InterfaceC418240Gac interfaceC418240Gac = this.LLILZIL;
        if (interfaceC418240Gac != null) {
            interfaceC418240Gac.LIZJ(this, this.LL, linkedHashMap);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(Color.argb(this.LLIZLLLIL, Color.red(this.LLILLL), Color.green(this.LLILLL), Color.blue(this.LLILLL)));
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(this.LLIZ);
        textPaint.setTypeface(c444890HcV.getTypeface());
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
        this.LLIZLLLIL = Color.alpha(this.LLILLL);
        LJIIIZ(spanned);
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
        float fFloatValue;
        float fAlpha = Color.alpha(this.LLILLL);
        Float fLJFF = C1308910kAL.LJFF(R.attr.a36, textView.getContext());
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        this.LLIZLLLIL = (int) (fAlpha * fFloatValue);
        LJIIIZ(spanned);
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
        this.LLIZLLLIL = Color.alpha(this.LLILLL);
        LJIIIZ(spanned);
    }

    public C426390Gnl(CharSequence charSequence, CharSequence charSequence2, int i, C0GZF c0gzf, InterfaceC418240Gac interfaceC418240Gac, Map map) {
        this.LL = charSequence;
        this.LLILLJJLI = charSequence2;
        this.LLILLL = i;
        this.LLILZ = c0gzf;
        this.LLILZIL = interfaceC418240Gac;
        this.LLILZLL = map;
        this.LLIZLLLIL = Color.alpha(i);
    }
}
