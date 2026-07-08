package X;

import Y.ACListenerS131S0200000_29;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.12Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19765612Va extends RecyclerView.ViewHolder {
    public final C1322110kVd LL;
    public VideoSegment LLILLJJLI;
    public final RelativeLayout LLILLL;
    public final TextView LLILZ;
    public final /* synthetic */ C12W6 LLILZIL;

    public void L5(C19765612Va c19765612Va) {
        C786410Ut5.I7(new ACListenerS131S0200000_29(this, c19765612Va, 50), this.itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19765612Va(C12W6 c12w6, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cz1, viewGroup, false));
        this.LLILZIL = c12w6;
        C1322110kVd c1322110kVd = (C1322110kVd) this.itemView.findViewById(R.id.video_cover);
        this.LL = c1322110kVd;
        this.LLILLL = (RelativeLayout) this.itemView.findViewById(R.id.tsc);
        int i = C12UY.LIZ;
        c1322110kVd.setOutlineProvider(new C1151470g4P(3));
        c1322110kVd.setClipToOutline(true);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.ujz);
    }

    public final void I5(C12W7 c12w7, C19765612Va c19765612Va) {
        String strLJFF;
        VideoSegment videoSegment = c12w7.LIZIZ;
        this.LLILLJJLI = videoSegment;
        if (TextUtils.isEmpty(videoSegment.thumbnail)) {
            strLJFF = c12w7.LIZIZ.LJFF(false);
        } else {
            strLJFF = c12w7.LIZIZ.thumbnail;
        }
        C1463700oC0.LIZIZ(c19765612Va.LL, strLJFF, C426580Go4.LIZJ(637534207, 637534207, 0, 0), C366700EZg.LIZ(48.0d), this.LLILZIL.LLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf((c12w7.LIZIZ.LIZLLL() - c12w7.LIZIZ.LJII()) / (c12w7.LIZIZ.LJI() * 1000.0f))}));
        sbLIZ.append("s");
        c19765612Va.LLILZ.setText(C2188811AlT.LIZIZ(sbLIZ));
        c19765612Va.LLILZ.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.b7));
        L5(c19765612Va);
    }
}
