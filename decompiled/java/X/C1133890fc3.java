package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0fc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133890fc3 extends LinearLayout {
    public C16F5 LL;
    public C16F5 LLILLJJLI;
    public final int LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Function0<Unit> LLILZLL;

    public final C16F5 getTvText1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z7c);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getTvText2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z7d);
            this.LLILLJJLI = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Pair<String, String> pairLIZ = C430600GuY.LIZ(this.LLILZ, e3.e, e3.f);
        String first = pairLIZ.getFirst();
        String second = pairLIZ.getSecond();
        String strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{second, this.LLILZIL}, 2));
        getTvText1FromXml().setText(strJ4);
        if (getTvText1FromXml().getLineCount() >= this.LLILLL) {
            C500260Jjc.LLFFF(getTvText1FromXml());
            C500260Jjc.LLFFF(getTvText2FromXml());
            getTvText1FromXml().setText(second);
            int lineEnd = getTvText1FromXml().getLayout().getLineEnd(this.LLILLL - 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) getTvText1FromXml().getText().subSequence(0, lineEnd - 3));
            sbLIZ.append("...");
            getTvText1FromXml().setText(C430600GuY.LIZIZ(getContext(), C2188811AlT.LIZIZ(sbLIZ), null, 0, first, null, 92));
            getTvText1FromXml().setMovementMethod(LinkMovementMethod.getInstance());
            getTvText2FromXml().setText(this.LLILZIL);
            C786410Ut5.l8(getTvText2FromXml(), new ACListenerS152S0100000_17(this, 180));
            getTvText1FromXml().invalidate();
            return;
        }
        try {
            if (!a0.LJJIIZI(strJ4.substring(getTvText1FromXml().getLayout().getLineStart(getTvText1FromXml().getLineCount() - 1), getTvText1FromXml().getLayout().getLineEnd(getTvText1FromXml().getLineCount() - 1)), this.LLILZIL, false)) {
                getTvText1FromXml().setText(C430600GuY.LIZIZ(getContext(), second, null, 0, first, null, 92));
                getTvText1FromXml().setMovementMethod(LinkMovementMethod.getInstance());
                getTvText2FromXml().setText(this.LLILZIL);
                C786410Ut5.l8(getTvText2FromXml(), new ACListenerS152S0100000_17(this, 179));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        getTvText1FromXml().setText(C430600GuY.LIZIZ(getContext(), strJ4, this.LLILZIL, 0, first, new AwS561S0100000_17(this, 619), 24));
        getTvText1FromXml().setMovementMethod(LinkMovementMethod.getInstance());
        C500260Jjc.LLFFF(getTvText1FromXml());
        C500260Jjc.LJIILIIL(getTvText2FromXml());
    }

    public final void setOnText2Clicked(Function0<Unit> function0) {
        this.LLILZLL = function0;
        invalidate();
    }

    public final void setTvText1FromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public final void setTvText2FromXml(C16F5 c16f5) {
        this.LLILLJJLI = c16f5;
    }

    public final void setTypeFace(Typeface typeface) {
        C16F5 tvText1FromXml = getTvText1FromXml();
        if (tvText1FromXml != null) {
            tvText1FromXml.setTypeface(typeface);
        }
        C16F5 tvText2FromXml = getTvText2FromXml();
        if (tvText2FromXml != null) {
            tvText2FromXml.setTypeface(typeface);
        }
    }

    public C1133890fc3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 10;
        this.LLILZ = "";
        this.LLILZIL = "";
        LinearLayout.inflate(context, R.layout.h0l, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LineLimitTextView, 0, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.LineLimitTextView_ttlive_maxline, 10);
        this.LLILLL = integer;
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LineLimitTextView_ttlive_text_1);
        this.LLILZ = strXd == null ? "" : strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LineLimitTextView_ttlive_text_2);
        this.LLILZIL = strXd2 != null ? strXd2 : "";
        getTvText1FromXml().setMaxLines(integer);
        typedArrayObtainStyledAttributes.recycle();
    }
}
