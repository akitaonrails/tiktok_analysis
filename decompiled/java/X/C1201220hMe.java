package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.videopublish.rcmdcell.PoiPublishUiOptExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201220hMe {
    public C20627315nb LIZ;
    public LinearLayoutCompat LIZIZ;
    public TuxIconView LIZJ;
    public TuxTextView LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(790));

    public final C20627315nb LIZIZ() {
        C20627315nb c20627315nb = this.LIZ;
        if (c20627315nb != null) {
            return c20627315nb;
        }
        return null;
    }

    public static View LIZ(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e6a, viewGroup, false);
    }

    public final void LIZJ(View view) {
        int i;
        this.LIZ = (C20627315nb) view.findViewById(R.id.veq);
        this.LIZIZ = (LinearLayoutCompat) LIZIZ().findViewById(R.id.nc2);
        this.LIZJ = (TuxIconView) LIZIZ().findViewById(R.id.jxe);
        this.LIZLLL = (TuxTextView) LIZIZ().findViewById(R.id.xkj);
        LIZIZ().setAnimationDuration(800L);
        LinearLayoutCompat linearLayoutCompat = this.LIZIZ;
        TuxIconView tuxIconView = null;
        if (linearLayoutCompat == null) {
            linearLayoutCompat = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        linearLayoutCompat.setBackground(c384050F3z.LIZ(LIZIZ().getContext()));
        C427690Gpr.LJ(LIZIZ(), C418440Gaw.LIZIZ(4));
        TuxTextView tuxTextView = this.LIZLLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        Boolean bool = PoiPublishUiOptExperiment.LIZ.poiPublishFontOpt;
        if (bool != null && bool.booleanValue()) {
            i = 62;
        } else {
            i = 61;
        }
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(16);
        TuxIconView tuxIconView2 = this.LIZJ;
        if (tuxIconView2 != null) {
            tuxIconView = tuxIconView2;
        }
        tuxIconView.setTintColorRes(R.attr.a1h);
    }
}
