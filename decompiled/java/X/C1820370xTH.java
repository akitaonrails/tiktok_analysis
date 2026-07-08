package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0xTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820370xTH extends ConstraintLayout implements InterfaceC1820620xTg {
    public final View LL;
    public final C20627315nb LLILLJJLI;
    public final C20626615nU LLILLL;

    @Override // X.InterfaceC1820620xTg
    public List<AbstractC20627515nd> getSkeletonTextViews() {
        return C1697810uHb.LJIIJJI(this.LLILLJJLI, this.LLILLL);
    }

    public C1820370xTH(String str, ImageModel imageModel, Context context) {
        super(context);
        View viewInflate = ViewGroup.inflate(context, R.layout.hub, this);
        this.LL = viewInflate;
        C20627315nb c20627315nb = (C20627315nb) viewInflate.findViewById(R.id.wlj);
        this.LLILLJJLI = c20627315nb;
        C20626615nU c20626615nU = (C20626615nU) viewInflate.findViewById(R.id.wln);
        this.LLILLL = c20626615nU;
        TextView textView = (TextView) viewInflate.findViewById(R.id.wlm);
        View viewFindViewById = viewInflate.findViewById(R.id.wli);
        if (str.length() > 0) {
            textView.setText(str);
            C1428300nGu.LIZ(c20626615nU, str);
            C500260Jjc.LLFFF(c20626615nU);
            C500260Jjc.LLFFF(textView);
        } else {
            C500260Jjc.LJIILIIL(c20626615nU);
            C500260Jjc.LJIILIIL(textView);
        }
        if (imageModel != null) {
            C500260Jjc.LLFFF(c20627315nb);
            C500260Jjc.LLFFF(viewFindViewById);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            int iLIZ = C439101nJ.LIZ(44);
            int iLIZ2 = C439101nJ.LIZ(44);
            c1324610kZfLJIIIZ.LJ = iLIZ;
            c1324610kZfLJIIIZ.LJFF = iLIZ2;
            c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(viewFindViewById);
            return;
        }
        C500260Jjc.LJIILIIL(c20627315nb);
        C500260Jjc.LJIILIIL(viewFindViewById);
    }
}
