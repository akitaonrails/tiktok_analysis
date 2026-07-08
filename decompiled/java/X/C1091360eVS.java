package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091360eVS extends FrameLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final C1322110kVd LLILLL;
    public final TextView LLILZ;

    public final View getContentView() {
        return this.LLILLJJLI;
    }

    public final C1322110kVd getIconImgView() {
        return this.LLILLL;
    }

    public final View getRoot() {
        return this.LL;
    }

    public final TextView getTextView() {
        return this.LLILZ;
    }

    public C1091360eVS(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fv8, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = viewTd.findViewById(R.id.kmw);
        this.LLILLL = (C1322110kVd) viewTd.findViewById(R.id.kmx);
        this.LLILZ = (TextView) viewTd.findViewById(R.id.kmy);
    }
}
