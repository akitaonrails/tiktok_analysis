package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Gu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430270Gu1 extends LinearLayout {
    public final int LL;
    public final C427870Gq9 LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final C01GW LLILZLL;

    private final String getUserId() {
        return (String) this.LLILZLL.getValue();
    }

    public final void LIZIZ() {
        int i = this.LL;
        if (i == 0) {
            this.LLILLL.setTuxFont(61);
            this.LLILZ.setTuxFont(61);
            this.LLILZIL.setTuxFont(61);
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            C1546210qL5.LIZ.getClass();
            layoutParams.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
            layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(16));
            C786410Ut5.F6(this.LLILLJJLI, layoutParams);
            return;
        }
        if (i == 1) {
            this.LLILLL.setTuxFont(71);
            this.LLILZ.setTuxFont(71);
            this.LLILZIL.setTuxFont(71);
            ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.getLayoutParams();
            C1546210qL5.LIZ.getClass();
            layoutParams2.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(14));
            layoutParams2.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(14));
            C786410Ut5.F6(this.LLILLJJLI, layoutParams2);
            return;
        }
        if (i == 2) {
            this.LLILLL.setTuxFont(51);
            this.LLILZ.setTuxFont(51);
            this.LLILZIL.setTuxFont(51);
            ViewGroup.LayoutParams layoutParams3 = this.LLILLJJLI.getLayoutParams();
            C1546210qL5.LIZ.getClass();
            layoutParams3.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(18));
            layoutParams3.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(18));
            C786410Ut5.F6(this.LLILLJJLI, layoutParams3);
        }
    }

    public final int getTextFont() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C430280Gu2 r12) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C430270Gu1.LIZ(X.0Gu2):void");
    }

    public C430270Gu1(int i, Context context) {
        super(context, null, 0);
        this.LL = i;
        this.LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(499));
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bwp, layoutInflaterCloneInContext, this);
        }
        this.LLILLJJLI = (C427870Gq9) findViewById(R.id.winner_avatar);
        this.LLILLL = (TuxTextView) findViewById(R.id.winner_info);
        this.LLILZ = (TuxTextView) findViewById(R.id.p94);
        this.LLILZIL = (TuxTextView) findViewById(R.id.kmo);
    }
}
