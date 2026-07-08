package X;

import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.0lNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1355710lNp extends ClickableSpan {
    public boolean LL;
    public final /* synthetic */ C1355730lNr LLILLJJLI;

    public AbstractC1355710lNp(C1355730lNr c1355730lNr) {
        this.LLILLJJLI = c1355730lNr;
    }

    public void LIZ(boolean z) {
        this.LL = z;
        this.LLILLJJLI.invalidate();
    }
}
