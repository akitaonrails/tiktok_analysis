package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342550Dbp {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZIZ(Context context, int i, int i2) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_link;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LJII = i2;
        c384050F3z.LJI = i2;
        return new LayerDrawable(new Drawable[]{c384050F3z.LIZ(context), tuxIconDrawableLIZ});
    }

    public static void LIZ(View view, TuxIconView tuxIconView, TuxTextView tuxTextView, Aweme aweme) {
        long diggCount;
        int i;
        int i2;
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            diggCount = statistics.getDiggCount();
        } else {
            diggCount = 0;
        }
        boolean z = true;
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        if (diggCount <= 0 && !z) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (tuxTextView != null) {
            tuxTextView.setText(C820940WIi.LIZ(diggCount));
        }
        if (tuxIconView != null) {
            if (z) {
                i = R.raw.icon_heart_small_fill;
            } else {
                i = R.raw.icon_heart_small;
            }
            tuxIconView.setIconRes(i);
            if (z) {
                i2 = R.attr.a1r;
            } else {
                i2 = R.attr.zi;
            }
            tuxIconView.setTintColorRes(i2);
        }
    }
}
