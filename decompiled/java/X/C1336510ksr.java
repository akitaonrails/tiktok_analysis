package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ksr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336510ksr extends RecyclerView.ViewHolder {
    public C1309500kBI LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    public C1336510ksr(View view, final Function1<? super C1309500kBI, Unit> function1) {
        super(view);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.lkw);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.kdl);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.kc8);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0kss
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view2) {
                C1309500kBI c1309500kBI = this.LLILZ.LL;
                if (c1309500kBI != null) {
                    function1.invoke(c1309500kBI);
                }
            }
        }, view);
    }
}
