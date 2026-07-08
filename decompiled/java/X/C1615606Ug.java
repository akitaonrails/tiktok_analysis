package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06Ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1615606Ug implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final ImageView LLILLJJLI;
    public final ImageView LLILLL;
    public final LinearLayout LLILZ;
    public final TuxTextView LLILZIL;
    public final FrameLayout LLILZLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C1615606Ug LIZ(View view) {
        int i = R.id.coo;
        ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.coo, view);
        if (imageView != null) {
            i = R.id.cpn;
            ImageView imageView2 = (ImageView) C1616006Uk.LIZ(R.id.cpn, view);
            if (imageView2 != null) {
                i = R.id.e0s;
                if (C1616006Uk.LIZ(R.id.e0s, view) != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = R.id.vct;
                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.vct, view);
                    if (tuxTextView != null) {
                        i = R.id.vcv;
                        if (C1616006Uk.LIZ(R.id.vcv, view) != null) {
                            i = R.id.y0w;
                            FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.y0w, view);
                            if (frameLayout != null) {
                                return new C1615606Ug(linearLayout, imageView, imageView2, linearLayout, tuxTextView, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public C1615606Ug(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TuxTextView tuxTextView, FrameLayout frameLayout) {
        this.LL = linearLayout;
        this.LLILLJJLI = imageView;
        this.LLILLL = imageView2;
        this.LLILZ = linearLayout2;
        this.LLILZIL = tuxTextView;
        this.LLILZLL = frameLayout;
    }
}
