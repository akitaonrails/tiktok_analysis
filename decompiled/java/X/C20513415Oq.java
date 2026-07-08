package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20513415Oq {
    public final FrameLayout LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final C16F5 LJII;
    public final C16F5 LJIIIIZZ;
    public final C16F5 LJIIIZ;
    public final C16F5 LJIIJ;
    public final C16F5 LJIIJJI;
    public final AppCompatImageView LJIIL;
    public final AppCompatImageView LJIILIIL;
    public final AppCompatImageView LJIILJJIL;
    public final AppCompatImageView LJIILL;
    public final C16F5 LJIILLIIL;
    public final LiveIconView LJIIZILJ;
    public final View LJIJ;
    public final View LJIJI;

    public C20513415Oq(View view) {
        this.LIZ = (FrameLayout) view.findViewById(R.id.h67);
        this.LIZIZ = view.findViewById(R.id.h66);
        View viewFindViewById = view.findViewById(R.id.h69);
        this.LIZJ = viewFindViewById;
        this.LIZLLL = view.findViewById(R.id.h68);
        this.LJ = view.findViewById(R.id.h67);
        this.LJFF = view.findViewById(R.id.yai);
        this.LJI = view.findViewById(R.id.h66);
        this.LJII = (C16F5) view.findViewById(R.id.h6e);
        this.LJIIIIZZ = (C16F5) view.findViewById(R.id.h6b);
        this.LJIIIZ = (C16F5) view.findViewById(R.id.h6_);
        this.LJIIJ = (C16F5) view.findViewById(R.id.h6d);
        this.LJIIJJI = (C16F5) view.findViewById(R.id.h6c);
        this.LJIIL = (AppCompatImageView) view.findViewById(R.id.h61);
        this.LJIILIIL = (AppCompatImageView) view.findViewById(R.id.h62);
        this.LJIILJJIL = (AppCompatImageView) view.findViewById(R.id.h5x);
        this.LJIILL = (AppCompatImageView) view.findViewById(R.id.h5y);
        this.LJIILLIIL = (C16F5) view.findViewById(R.id.h5w);
        this.LJIIZILJ = (LiveIconView) view.findViewById(R.id.h60);
        this.LJIJ = view.findViewById(R.id.h5z);
        this.LJIJI = view.findViewById(R.id.h6a);
        viewFindViewById.setOutlineProvider(new C0ID9(3));
        viewFindViewById.setClipToOutline(true);
        Context context = viewFindViewById.getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            C786410Ut5.Ob(viewFindViewById, -1.0f);
        }
    }
}
