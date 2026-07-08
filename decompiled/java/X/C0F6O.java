package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F6O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F6O extends C0F62 {
    public final View LLILZ;
    public final Context LLILZIL;
    public final TuxTextView LLILZLL;
    public final C0HZQ LLIZ;
    public final C0F90 LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final /* synthetic */ C384570F5z LLJIJIL;

    @Override // X.C0F62
    public final Context getContext() {
        return this.LLILZIL;
    }

    @Override // X.C0F62
    public final void L5(int i, boolean z) {
        Editable editableK;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zg, N5());
            if (numLIZJ != null) {
                this.LLILZ.setBackgroundColor(numLIZJ.intValue());
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, N5());
            if (numLIZJ2 != null) {
                this.LLIZLLLIL.setTextColor(numLIZJ2.intValue());
            }
            C384570F5z c384570F5z = this.LLJIJIL;
            if (!c384570F5z.LLJJ && i == c384570F5z.LLJILJIL && c384570F5z.LLJILJILJ != -1) {
                this.LLIZLLLIL.requestFocus();
                int i2 = this.LLJIJIL.LLJILJILJ;
                if (i2 > 0 && (editableK = C2204961BRm.K(this.LLIZLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9fHnYUJBf+25L2uSsYY/FqqbA9yL9IG", null))) != null && i2 <= editableK.length()) {
                    this.LLIZLLLIL.setSelection(this.LLJIJIL.LLJILJILJ);
                    return;
                }
                return;
            }
            return;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.uk, N5());
        if (numLIZJ3 != null) {
            this.LLILZ.setBackgroundColor(numLIZJ3.intValue());
        }
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.zk, N5());
        if (numLIZJ4 == null) {
            return;
        }
        this.LLIZLLLIL.setTextColor(numLIZJ4.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F6O(C384570F5z c384570F5z, View view, Context context) {
        super(context, view);
        this.LLJIJIL = c384570F5z;
        this.LLILZ = view;
        this.LLILZIL = context;
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.tv_start_time);
        this.LLIZ = (C0HZQ) view.findViewById(R.id.ukj);
        this.LLIZLLLIL = (C0F90) view.findViewById(R.id.dch);
        this.LLJ = view.findViewById(R.id.ul3);
        this.LLJI = view.findViewById(R.id.e11);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032a  */
    @Override // X.C0F62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(final com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance r32, final int r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F6O.I5(com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance, int, boolean):void");
    }
}
