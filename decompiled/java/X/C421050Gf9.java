package X;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421050Gf9 extends RecyclerView.ViewHolder {
    public final ObjectAnimator LL;

    public C421050Gf9(View view) {
        super(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view.findViewById(R.id.lno), "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.LL = objectAnimatorOfFloat;
    }
}
