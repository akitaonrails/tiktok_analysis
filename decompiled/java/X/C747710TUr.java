package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747710TUr extends RecyclerView.ViewHolder {
    public final Function1<EffectAttribution, Boolean> LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C747710TUr(View view, Function1<? super EffectAttribution, Boolean> function1) {
        super(view);
        this.LL = function1;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.gwv);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.gvi);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.gws);
    }
}
