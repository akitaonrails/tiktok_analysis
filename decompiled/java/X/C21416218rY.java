package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18rY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21416218rY extends MetricAffectingSpan implements InterfaceC431020GvE, LineBackgroundSpan {
    public final int LL;
    public final int LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function1<View, Unit> LLILZ;
    public final Message LLILZIL;
    public final C444890HcV LLILZLL;
    public final C444890HcV LLIZ;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    public final boolean LIZ() {
        Message message = this.LLILZIL;
        return message != null && message.retried == 0 && C123100dR.LIZ(message.replyUuid) && C123100dR.LIZ(this.LLILZIL.LJIILJJIL);
    }

    @Override // X.InterfaceC431020GvE
    public final void onClick(View view) {
        if (LIZ()) {
            this.LLILZ.invoke(view);
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (LIZ()) {
            if (textPaint != null) {
                textPaint.setTypeface(this.LLILZLL.getTypeface());
                textPaint.setColor(this.LL);
                return;
            }
            return;
        }
        if (textPaint == null) {
            return;
        }
        textPaint.setTypeface(this.LLIZ.getTypeface());
        textPaint.setColor(this.LLILLJJLI);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        if (LIZ()) {
            textPaint.setTypeface(this.LLILZLL.getTypeface());
        } else {
            textPaint.setTypeface(this.LLIZ.getTypeface());
        }
    }

    public C21416218rY(int i, int i2, AwS576S0100000_32 awS576S0100000_32, AwS611S0100000_32 awS611S0100000_32, Message message) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = awS576S0100000_32;
        this.LLILZ = awS611S0100000_32;
        this.LLILZIL = message;
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(52);
        this.LLILZLL = c444890HcV;
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(51);
        this.LLIZ = c444890HcV2;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        this.LLILLL.invoke();
    }
}
