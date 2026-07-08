package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0x8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807490x8V extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function2<EnumC1784170wWt, IMQuickReply, Unit> LLILLJJLI;
    public final Function1<RecyclerView.ViewHolder, Unit> LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;

    public final void I5(boolean z, boolean z2) {
        int i;
        View view = this.LLILZ;
        int i2 = 0;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            if (!z2) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1807490x8V(View view, Function2<? super EnumC1784170wWt, ? super IMQuickReply, Unit> function2, Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = function2;
        this.LLILLL = function1;
        this.LLILZ = view.findViewById(R.id.so5);
        this.LLILZIL = view.findViewById(R.id.so7);
        this.LLILZLL = view.findViewById(R.id.so9);
        this.LLJ = (TuxTextView) view.findViewById(R.id.soe);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.smy);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.so_);
    }
}
