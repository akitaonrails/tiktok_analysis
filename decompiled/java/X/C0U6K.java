package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U6K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6K extends RecyclerView.ViewHolder {
    public static final int LLIZ = (int) C497740JfY.LIZIZ(100);
    public final boolean LL;
    public final Integer LLILLJJLI;
    public final Function1<RoomSticker, Boolean> LLILLL;
    public final C1324720kZq LLILZ;
    public View LLILZIL;
    public Integer LLILZLL;

    public final void I5(boolean z) {
        if (!this.LL) {
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = this.itemView.findViewById(R.id.w75);
        }
        C500260Jjc.LJLJLJ(this.LLILZIL, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0U6K(boolean z, View view, Integer num, Function1<? super RoomSticker, Boolean> function1) {
        super(view);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = function1;
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.khb);
    }
}
