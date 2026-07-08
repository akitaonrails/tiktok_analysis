package X;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.18qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21410518qd extends C21410918qh {
    public final /* synthetic */ AppCompatTextView LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21410518qd(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.LIZIZ = appCompatTextView;
    }

    @Override // X.C21410918qh, X.InterfaceC21410718qf
    public final void LIZ(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // X.C21410918qh, X.InterfaceC21410718qf
    public final void LIZIZ(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
