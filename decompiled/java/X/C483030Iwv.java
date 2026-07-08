package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;

/* JADX INFO: renamed from: X.0Iwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483030Iwv extends RecyclerView.ViewHolder {
    public SurveySecondQuestion LL;

    public C483030Iwv(View view) {
        super(view);
    }

    public final void I5(boolean z) {
        View view = this.itemView;
        if (view instanceof C16F5) {
            if (z) {
                ((AppCompatTextView) view).setBackgroundResource(C483040Iww.LIZ(true));
            } else {
                ((AppCompatTextView) view).setBackgroundResource(C483040Iww.LIZ(false));
            }
        }
    }
}
