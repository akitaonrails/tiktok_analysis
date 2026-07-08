package X;

import Y.ACListenerS143S0100000_8;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MX1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MX1 extends RecyclerView.ViewHolder {
    public final Function1<C0MX2, Unit> LL;
    public final Function1<C0MX2, Unit> LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public C0MX2 LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0MX1(View view, Function1<? super C0MX2, Unit> function1, Function1<? super C0MX2, Unit> function12) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = (SmartImageView) view.findViewById(R.id.aqm);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aqk);
        this.LLILZ = tuxTextView;
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.aql);
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 25), view);
        C786410Ut5.h9(tuxTextView, new ACListenerS143S0100000_8(this, 26));
    }
}
