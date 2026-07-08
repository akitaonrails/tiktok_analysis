package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0xTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820400xTK extends LinearLayout implements InterfaceC1820620xTg {
    public final View LL;
    public final C20626615nU LLILLJJLI;
    public final C20626615nU LLILLL;

    @Override // X.InterfaceC1820620xTg
    public List<AbstractC20627515nd> getSkeletonTextViews() {
        return C1697810uHb.LJIIJJI(this.LLILLJJLI, this.LLILLL);
    }

    public C1820400xTK(Context context, String str, String str2) {
        super(context);
        View viewInflate = LinearLayout.inflate(context, R.layout.hua, this);
        this.LL = viewInflate;
        C20626615nU c20626615nU = (C20626615nU) viewInflate.findViewById(R.id.wll);
        this.LLILLJJLI = c20626615nU;
        C20626615nU c20626615nU2 = (C20626615nU) viewInflate.findViewById(R.id.wlp);
        this.LLILLL = c20626615nU2;
        ((TextView) viewInflate.findViewById(R.id.wlk)).setText(str);
        ((TextView) viewInflate.findViewById(R.id.wlo)).setText(str2);
        C1428300nGu.LIZ(c20626615nU, str);
        C1428300nGu.LIZ(c20626615nU2, str2);
    }
}
