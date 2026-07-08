package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766670U5p extends RecyclerView.ViewHolder {
    public final View LL;
    public final ImageView LLILLJJLI;
    public final C16F5 LLILLL;
    public final C1324720kZq LLILZ;
    public final View LLILZIL;
    public final ImageView LLILZLL;

    public C766670U5p(View view) {
        super(view);
        this.LL = view.findViewById(R.id.l22);
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.l51);
        this.LLILLL = (C16F5) view.findViewById(R.id.zym);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.l_v);
        this.LLILZIL = view.findViewById(R.id.c96);
        this.LLILZLL = (ImageView) view.findViewById(R.id.lno);
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dialogUpdate: ");
            sbLIZ.append(view.findViewById(R.id.c96));
            C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
            View viewFindViewById = view.findViewById(R.id.c96);
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundResource(R.drawable.dm3);
            }
        }
    }
}
