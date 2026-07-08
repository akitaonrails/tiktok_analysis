package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472250IfX extends RecyclerView.ViewHolder {
    public final Function2<Gift, View, Unit> LL;
    public final LiveIconView LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C472250IfX(View view, Function2<? super Gift, ? super View, Unit> function2) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.hpb);
    }
}
