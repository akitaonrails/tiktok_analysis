package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6Z extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C1324720kZq LLILLJJLI;
    public final View LLILLL;
    public final ImageView LLILZ;

    public C0U6Z(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.zym);
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.l_v);
        this.LLILLL = view.findViewById(R.id.c96);
        this.LLILZ = (ImageView) view.findViewById(R.id.lno);
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
