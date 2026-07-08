package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745360TLq extends RecyclerView.ViewHolder {
    public final Function2<? super C745370TLr, ? super Integer, Unit> LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final Gson LLILZ;

    public C745360TLq(View view, Function2<? super C745370TLr, ? super Integer, Unit> function2) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zsp);
        this.LLILLL = (C16F5) view.findViewById(R.id.tv_value);
        this.LLILZ = C19748512Ol.LIZIZ;
    }
}
