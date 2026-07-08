package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H3C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H3C extends C444090HbD<C0H3D> {
    public final ImageView LL;
    public final int LLILLJJLI;

    public C0H3C(View view) {
        super(view);
        Resources resources = view.getResources();
        this.LL = (ImageView) view.findViewById(R.id.lli);
        this.LLILLJJLI = resources.getDimensionPixelSize(R.dimen.ww);
    }
}
