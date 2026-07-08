package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: renamed from: X.15CC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15CC extends RecyclerView.ViewHolder {
    public final C15CF LL;
    public final C1126540fQC LLILLJJLI;
    public final int LLILLL;

    public final void L5(ImageModel imageModel) {
        Object tag = this.LLILLJJLI.getTag();
        if (tag instanceof Integer) {
            Number number = (Number) tag;
            if (number.intValue() > -1 && (imageModel == null || number.intValue() != imageModel.hashCode())) {
                return;
            }
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.cjl;
        int i = this.LLILLL;
        c1324610kZfLJIIIZ.LJ = i;
        c1324610kZfLJIIIZ.LJFF = i;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI);
    }

    public C15CC(C15CF c15cf, View view) {
        super(view);
        this.LL = c15cf;
        this.LLILLJJLI = (C1126540fQC) view.findViewById(R.id.l9h);
        this.LLILLL = (int) C497740JfY.LIZIZ(36.0f);
    }

    public final void I5(ImageModel imageModel, boolean z) {
        this.LLILLJJLI.setTag(-1);
        Integer numValueOf = null;
        this.LLILLJJLI.setImageDrawable(null);
        C1126540fQC c1126540fQC = this.LLILLJJLI;
        if (imageModel != null) {
            numValueOf = Integer.valueOf(imageModel.hashCode());
        }
        c1126540fQC.setTag(numValueOf);
        if (z) {
            AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, imageModel, 49);
            C15CF c15cf = this.LL;
            if (c15cf.LLILZ.size() >= c15cf.LLILZIL) {
                c15cf.LLILZ.removeFirst();
            }
            c15cf.LLILZ.addLast(awS432S0200000_31);
            return;
        }
        L5(imageModel);
    }
}
