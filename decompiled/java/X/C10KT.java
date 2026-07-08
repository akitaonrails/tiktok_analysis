package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10KT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10KT extends AbstractC683590Qrd<C1261860iwS> {
    public final RecSwipeViewModel LL;
    public final C11NJ LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public final boolean LLLFZ() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    public C10KT(RecSwipeViewModel recSwipeViewModel) {
        super(false);
        this.LL = recSwipeViewModel;
        this.LLILLJJLI = new C11NJ();
        this.LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(579));
        this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(578));
    }

    public static final void LLLI(View view) {
        int i;
        int i2;
        if (C19228210Ki.LIZJ()) {
            EnumC19227710Kd enumC19227710KdLIZ = C19228210Ki.LIZ(view.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
            if (enumC19227710KdLIZ == EnumC19227710Kd.WIDE) {
                i2 = 26;
            } else {
                i2 = 16;
            }
            c384050F3z.LIZJ = Float.valueOf(C339190DRl.LIZ(i2));
            Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
            drawableLIZ.setAlpha(25);
            view.setBackground(drawableLIZ);
            return;
        }
        if (C1A9E.LIZLLL()) {
            i = R.drawable.aqy;
        } else {
            i = R.drawable.aqx;
        }
        view.setBackgroundResource(i);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILLJJLI.LJ();
    }
}
