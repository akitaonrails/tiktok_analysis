package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0hDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195410hDH extends LinearLayout {
    public final ViewGroup LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;

    public C1195410hDH(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.e8r, this);
        this.LL = (ViewGroup) findViewById(R.id.rda);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.rd9);
        this.LLILZ = (TuxIconView) findViewById(R.id.rd_);
        this.LLILLL = (TuxTextView) findViewById(R.id.rdb);
    }

    public static void LIZ(Context context, TuxIconView tuxIconView, String str) {
        C698190Ra5 c698190Ra5LJFF;
        if (str == null) {
            C339190DRl.LIZIZ(tuxIconView);
            return;
        }
        try {
            if (u.LJJIIJZLJL(str, "tux://icon", false) && (c698190Ra5LJFF = C2248361CzK.LJFF(context, str)) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                c419910GdJ.LIZLLL = c698190Ra5LJFF.LIZIZ;
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                if (tuxIconDrawableLIZ != null) {
                    tuxIconView.setImageDrawable(tuxIconDrawableLIZ);
                    C339190DRl.LIZLLL(tuxIconView);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "get_icon_drawable", null, e);
        }
        C339190DRl.LIZIZ(tuxIconView);
    }
}
