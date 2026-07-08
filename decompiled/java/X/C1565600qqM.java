package X;

import Y.ACListenerS126S0200000_24;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS459S0200000_24;

/* JADX INFO: renamed from: X.0qqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565600qqM {
    public final TuxTextView LIZ;
    public final C01GW LIZIZ;
    public int LIZJ;
    public final AwS459S0200000_24 LIZLLL;
    public final /* synthetic */ C1565660qqS LJ;

    public final List<Float> LIZ() {
        return (List) this.LIZIZ.getValue();
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ;
        String strLIZIZ;
        Context context;
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme = this.LJ.LLILZIL;
        c589960NBy.getClass();
        if (C589960NBy.LIZ(aweme)) {
            TuxTextView tuxTextView = this.LIZ;
            if (tuxTextView != null) {
                tuxTextView.setEnabled(true);
            }
            TuxTextView tuxTextView2 = this.LIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.zl);
            }
        } else {
            C0S4J c0s4j = this.LJ.LLJI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cannot speed aid: ");
            Aweme aweme2 = this.LJ.LLILZIL;
            sbLIZ2.append(aweme2 != null ? aweme2.getAid() : null);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            TuxTextView tuxTextView3 = this.LIZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setEnabled(false);
            }
            TuxTextView tuxTextView4 = this.LIZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.zk);
            }
        }
        float fLIZIZ = C589960NBy.LIZIZ(this.LJ.LLILZIL);
        int i = 0;
        for (Float f : LIZ()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (fLIZIZ >= f.floatValue()) {
                this.LIZJ = i;
            }
            i = i2;
        }
        TuxTextView tuxTextView5 = this.LIZ;
        if (tuxTextView5 != null) {
            View view = this.LJ.LL;
            boolean z = (view == null || (context = view.getContext()) == null || !C426750GoL.LIZLLL(context)) ? false : true;
            if (fLIZIZ == 3.0f) {
                strLIZIZ = z ? "×3" : "3×";
            } else if (fLIZIZ == 2.0f) {
                strLIZIZ = z ? "×2" : "2×";
            } else if (fLIZIZ == 1.0f) {
                strLIZIZ = z ? "×1" : "1×";
            } else {
                if (z) {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((char) 215);
                    sbLIZ.append(fLIZIZ);
                } else {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(fLIZIZ);
                    sbLIZ.append((char) 215);
                }
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            tuxTextView5.setText(strLIZIZ);
        }
    }

    public C1565600qqM(C1565660qqS c1565660qqS) {
        TuxTextView tuxTextView;
        this.LJ = c1565660qqS;
        View view = c1565660qqS.LL;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.vtx);
        } else {
            tuxTextView = null;
        }
        this.LIZ = tuxTextView;
        this.LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(526));
        this.LIZJ = 1;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS126S0200000_24(c1565660qqS, this, 25));
        }
        C2271391DvN.LIZ(tuxTextView, (C1A5L) C2271381DvM.LJJJZ.getValue());
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(18.0f);
        }
        AwS459S0200000_24 awS459S0200000_24 = new AwS459S0200000_24(c1565660qqS, this, 10);
        this.LIZLLL = awS459S0200000_24;
        C589960NBy.LIZ.getClass();
        ((ArrayList) C589960NBy.LJFF).add(awS459S0200000_24);
    }
}
