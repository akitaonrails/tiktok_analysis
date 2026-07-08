package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F62, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0F62 extends RecyclerView.ViewHolder {
    public final View LL;
    public final Context LLILLJJLI;
    public final C01GW LLILLL;

    public abstract void I5(CaptionUtterance captionUtterance, int i, boolean z);

    public abstract void L5(int i, boolean z);

    public final C1361400lX0 N5() {
        return (C1361400lX0) this.LLILLL.getValue();
    }

    public Context getContext() {
        return this.LLILLJJLI;
    }

    public C0F62(Context context, View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = context;
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 104));
    }
}
