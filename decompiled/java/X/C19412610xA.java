package X;

import Y.ACListenerS163S0100000_29;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.10xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19412610xA extends RecyclerView.ViewHolder {
    public C19413210xG LL;
    public final TextView LLILLJJLI;
    public final /* synthetic */ AbstractC19412510x9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19412610xA(AbstractC19412510x9 abstractC19412510x9, C19412810xC c19412810xC, TextView textView) {
        super(c19412810xC);
        this.LLILLL = abstractC19412510x9;
        this.LLILLJJLI = textView;
        C786410Ut5.T7(textView, new ACListenerS163S0100000_29(this, 161));
    }
}
