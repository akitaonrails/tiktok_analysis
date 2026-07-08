package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS48S0110000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19726412Fy {
    public static final int LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static int LJIILJJIL;
    public final View LIZ;
    public final View LIZIZ;
    public final TuxTextView LIZJ;
    public final RecyclerView LIZLLL;
    public boolean LJ;
    public VideoPublishEditModel LJFF;
    public int LJI;
    public int LJII;
    public float LJIIIIZZ;
    public final C19726512Fz LJIIIZ = new AbstractC471570IeR() { // from class: X.12Fz
        public final void LJII() {
            C19726412Fy c19726412Fy = this.LIZ;
            HandlerHook.viewPostDelay(c19726412Fy.LIZJ, new ARunnableS129S0100000_29(c19726412Fy, 47), 300L);
        }

        @Override // X.AbstractC471570IeR
        public final void LIZ() {
            LJII();
        }

        @Override // X.AbstractC471570IeR
        public final void LIZLLL(int i, int i2) {
            LJII();
        }

        @Override // X.AbstractC471570IeR
        public final void LJ(int i, int i2) {
            LJII();
        }

        @Override // X.AbstractC471570IeR
        public final void LJFF(int i, int i2) {
            LJII();
        }
    };

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        LJIIJJI = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LJIIL = iLIZIZ2;
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        LJIILIIL = iLIZIZ3;
        LJIILJJIL = iLIZIZ + iLIZIZ2 + iLIZIZ3;
    }

    public final void LIZIZ() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = this.LIZLLL.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        if (viewFindViewByPosition != null) {
            HandlerHook.viewPost(viewFindViewByPosition, new ARunnableS34S0201000_29(viewFindViewByPosition, iFindFirstVisibleItemPosition, this, 3));
        } else {
            this.LJIIIIZZ = this.LJII;
            LJ(C426750GoL.LJFF());
        }
    }

    public final void LIZJ() {
        LIZ(LJIIJ, this.LIZJ, true);
        if (!C1216510hlJ.LIZ().getBoolean("image_collage_expand_keva", false)) {
            this.LIZJ.setText(C1383370m6R.LJIIJ(2131829960));
            HandlerHook.viewPost(this.LIZJ, new ARunnableS48S0110000_29(this, false, 0));
            return;
        }
        this.LIZJ.setText("");
        TuxTextView tuxTextView = this.LIZJ;
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i = LJIIJJI;
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.W5(tuxTextView, layoutParams);
        this.LIZJ.setCompoundDrawablePadding(0);
        HandlerHook.viewPost(this.LIZJ, new ARunnableS48S0110000_29(this, true, 0));
    }

    public final void LIZLLL() {
        EnumC1454080nwU enumC1454080nwULJ;
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        if (videoPublishEditModel == null || (enumC1454080nwULJ = C1454030nwP.LJ(videoPublishEditModel, false)) == null || !enumC1454080nwULJ.getEnableEnter()) {
            LIZ(LJIIJ, this.LIZJ, false);
        } else {
            LIZ(LJIIJ, this.LIZJ, true);
        }
    }

    public final void LJ(boolean z) {
        float fLIZLLL = C13LZ.LIZLLL(this.LJIIIIZZ, 0.0f, this.LJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rvOffset = ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(" fixToSecondLeftPx = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append("  offset = ");
        sbLIZ.append(fLIZLLL);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        TuxTextView tuxTextView = this.LIZJ;
        if (!z) {
            fLIZLLL = -fLIZLLL;
        }
        C786410Ut5.Vc(tuxTextView, fLIZLLL);
    }

    public static void LIZ(int i, TuxTextView tuxTextView, boolean z) {
        int i2;
        if (z) {
            i2 = R.attr.zi;
        } else {
            i2 = R.attr.zj;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_collage_quadruple;
        c419910GdJ.LJ = Integer.valueOf(i2);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, i, i);
        tuxTextView.setCompoundDrawablesRelative(tuxIconDrawableLIZ, null, null, null);
        tuxTextView.setTextColor(C20642515q3.LIZIZ(i2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12Fz] */
    public C19726412Fy(View view, View view2, TuxTextView tuxTextView, RecyclerView recyclerView) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = tuxTextView;
        this.LIZLLL = recyclerView;
    }
}
