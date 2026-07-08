package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hCE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194760hCE extends FrameLayout {
    public final View LL;
    public final ViewPager LLILLJJLI;
    public final C1194770hCF LLILLL;

    public final C1194770hCF getIndicator() {
        return this.LLILLL;
    }

    public final ViewPager getViewPager() {
        return this.LLILLJJLI;
    }

    public C1194760hCE(Context context) {
        super(context);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.e9o, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (ViewPager) viewLJLLJ.findViewById(R.id.viewpager);
        this.LLILLL = (C1194770hCF) viewLJLLJ.findViewById(R.id.g3k);
    }
}
