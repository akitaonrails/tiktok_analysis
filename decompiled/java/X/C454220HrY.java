package X;

import Y.ACListenerS110S0200000_6;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS114S0101000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454220HrY extends LinearLayout {
    public final TuxTextView LL;
    public final SmartImageView LLILLJJLI;
    public final C197039127h LLILLL;
    public final C197039127h LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public final C054G LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public Boolean LLJ;
    public String LLJI;
    public Map<String, String> LLJIJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public C454220HrY(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        C786410Ut5.LJLLJ(c19eg, R.layout.a4s, this);
        this.LL = (TuxTextView) findViewById(R.id.chn);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.w64);
        this.LLILLL = (C197039127h) findViewById(R.id.uyn);
        this.LLILZ = (C197039127h) findViewById(R.id.tzb);
        this.LLILZIL = (TuxIconView) findViewById(R.id.frh);
        this.LLILZLL = (TuxIconView) findViewById(R.id.fqd);
    }

    public final void LIZJ(C454300Hrg c454300Hrg) {
        this.LLILZ.setLoading(false);
        this.LLILZ.setButtonVariant(c454300Hrg.LIZIZ);
        this.LLILZ.setText(c454300Hrg.LIZ);
        Integer num = c454300Hrg.LIZLLL;
        if (num != null) {
            this.LLILZ.setTextColorRes(num.intValue());
        }
        Integer num2 = c454300Hrg.LIZJ;
        if (num2 != null) {
            this.LLILZ.LJJJJL(new AwS114S0101000_6(this, num2.intValue(), 7));
        }
        C786410Ut5.U8(this.LLILZ, new ACListenerS110S0200000_6(this, c454300Hrg, 45));
        C1350920lG6.LJJIII("use", this.LLJI, this.LLJIJIL);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (this.LLILLL.getVisibility() == 0) {
                C1350920lG6.LJJIII("share", this.LLJI, this.LLJIJIL);
            }
            if (this.LLILZ.getVisibility() == 0) {
                if (Intrinsics.LJFF(this.LLJ, Boolean.TRUE)) {
                    C1350920lG6.LJJIII("use", this.LLJI, this.LLJIJIL);
                } else if (Intrinsics.LJFF(this.LLJ, Boolean.FALSE)) {
                    C1350920lG6.LJJIII("save", this.LLJI, this.LLJIJIL);
                }
            }
            if (this.LLILZIL.getVisibility() == 0) {
                C1350920lG6.LJJIII("report", this.LLJI, this.LLJIJIL);
            }
            if (this.LLILZLL.getVisibility() == 0) {
                C1350920lG6.LJJIII("close", this.LLJI, this.LLJIJIL);
            }
            if (this.LL.getVisibility() == 0) {
                C1350920lG6.LJJIII("sticker_set_name", this.LLJI, this.LLJIJIL);
            }
        }
    }

    public final void LIZIZ(C197039127h c197039127h, C454300Hrg c454300Hrg) {
        c197039127h.setButtonVariant(c454300Hrg.LIZIZ);
        c197039127h.setText(c454300Hrg.LIZ);
        Integer num = c454300Hrg.LIZLLL;
        if (num != null) {
            c197039127h.setTextColorRes(num.intValue());
        }
        Integer num2 = c454300Hrg.LIZJ;
        if (num2 != null) {
            c197039127h.LJJJJL(new AwS114S0101000_6(c197039127h, num2.intValue(), 6));
        }
        C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(this, c454300Hrg, 44));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C454210HrX r28, boolean r29, java.lang.String r30, java.util.Map r31) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454220HrY.LIZ(X.0HrX, boolean, java.lang.String, java.util.Map):void");
    }
}
