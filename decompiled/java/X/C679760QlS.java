package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679760QlS extends RecyclerView.ViewHolder {
    public final View LL;
    public final C1390410mHn LLILLJJLI;
    public final TuxTextView LLILLL;

    public C679760QlS(View view, C1A3S c1a3s) {
        super(view);
        this.LL = view;
        C1390410mHn c1390410mHn = (C1390410mHn) view.findViewById(R.id.jpr);
        this.LLILLJJLI = c1390410mHn;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.jpq);
        this.LLILLL = tuxTextView;
        tuxTextView.setText(c1a3s.LIZJ);
        C0H1U.LIZIZ(tuxTextView);
        C03DZ.LIZJ(c1390410mHn);
        c1390410mHn.LIZJ();
    }
}
