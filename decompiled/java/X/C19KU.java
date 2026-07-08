package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.AnchorTaskProgress;

/* JADX INFO: renamed from: X.19KU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KU extends RecyclerView.ViewHolder {
    public final DataChannel LL;
    public final C16F5 LLILLJJLI;
    public final C16FV LLILLL;
    public final C16F5 LLILZ;
    public final C16FV LLILZIL;
    public final C16FS LLILZLL;
    public final ConstraintLayout LLIZ;
    public final Context LLIZLLLIL;

    public C19KU(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.xeg);
        this.LLILLL = (C16FV) view.findViewById(R.id.xf1);
        this.LLILZ = (C16F5) view.findViewById(R.id.xe4);
        this.LLILZIL = (C16FV) view.findViewById(R.id.xe5);
        this.LLILZLL = (C16FS) view.findViewById(R.id.xe8);
        this.LLIZ = (ConstraintLayout) view.findViewById(R.id.tk7);
        this.LLIZLLLIL = view.getContext();
    }

    public final void I5(SpannableStringBuilder spannableStringBuilder, AnchorTaskProgress anchorTaskProgress, int i) {
        int i2;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\n');
        sbLIZ.append(anchorTaskProgress.taskTargetFinished);
        sbLIZ.append('/');
        sbLIZ.append(anchorTaskProgress.taskTargetValue);
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        int length = String.valueOf(anchorTaskProgress.taskTargetFinished).length();
        if (i > 0 && (i3 = (i2 = i + 1) + length) < spannableStringBuilder.length()) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, this.LLIZLLLIL)), i2, i3, 17);
        }
        int i4 = length + i + 1;
        if (i4 < spannableStringBuilder.length()) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9l, this.LLIZLLLIL)), i4, spannableStringBuilder.length(), 17);
        }
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, i, spannableStringBuilder.length(), 18, 500);
    }
}
