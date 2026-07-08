package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748770TYt extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function1<BlockWord, Unit> LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public final LiveIconView LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C748770TYt(View view, Function1<? super BlockWord, Unit> function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = function1;
        this.LLILLL = (C16F5) view.findViewById(R.id.c41);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.c42);
        this.LLILZIL = (LiveIconView) view.findViewById(R.id.c47);
    }
}
