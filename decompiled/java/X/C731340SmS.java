package X;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0SmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C731340SmS extends AbstractC731360SmU {
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public TuxTextView LJI;
    public final boolean LIZIZ = C2174761A9i.LIZIZ();
    public final C01GW LJII = C452501pT.LIZIZ(new C731380SmW(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C731370SmV(this));

    @Override // X.AbstractC731360SmU
    public final void LIZ() {
        View view = this.LIZJ;
        if (view != null) {
            C426750GoL.LJIIIZ(view, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(9.5f)))), null, false, 27);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        int iLJJIFFI = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIFFI(iLIZIZ);
        int iLJIL = c19252910Tv.LIZLLL().LJIJI().LJJL().LJIL(iLIZIZ2);
        View view2 = this.LJ;
        if (view2 != null) {
            C618720OOo.LIZIZ(view2, iLJJIFFI, iLJJIFFI);
        }
        View view3 = this.LJFF;
        if (view3 != null) {
            C618720OOo.LIZIZ(view3, iLJIL, iLJIL);
        }
        TuxTextView tuxTextView = this.LJI;
        if (tuxTextView != null) {
            tuxTextView.setTextSize(1, 11.0f);
            C426750GoL.LJIIL(tuxTextView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 23);
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            C732110Snh.LIZIZ();
            C426750GoL.LJIIIZ(tuxTextView, null, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)) / 2), null, false, 25);
        }
    }

    public final Drawable LJ() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, (Drawable) this.LJII.getValue());
        stateListDrawable.addState(new int[]{R.attr.state_selected}, (Drawable) this.LJIIIIZZ.getValue());
        return stateListDrawable;
    }

    public int LJFF() {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }
}
