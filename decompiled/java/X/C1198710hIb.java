package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198710hIb extends FrameLayout {
    public final Context LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;

    public C1198710hIb(Context context) {
        super(context);
        this.LL = context;
        View viewInflate = FrameLayout.inflate(context, R.layout.e8m, this);
        this.LLILLJJLI = viewInflate;
        this.LLILLL = (TuxTextView) viewInflate.findViewById(R.id.tv_poi_age_graduation_title);
        this.LLILZ = (TuxTextView) viewInflate.findViewById(R.id.tv_poi_age_graduation_link);
        this.LLILZIL = (TuxIconView) viewInflate.findViewById(R.id.jw_);
    }
}
