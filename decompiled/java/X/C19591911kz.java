package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;

/* JADX INFO: renamed from: X.11kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19591911kz {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(View view, C19591211ks c19591211ks, InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        FrameLayout.LayoutParams layoutParams;
        C19591311kt.LIZ.getClass();
        C19592211l2 c19592211l2LIZIZ = C19591311kt.LIZIZ(c19591211ks, interactStickerStruct);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if ((view instanceof AbstractC19584411jm) || (view instanceof C19594011lK)) {
            layoutParams2 = new FrameLayout.LayoutParams((int) c19592211l2LIZIZ.LJ, (int) c19592211l2LIZIZ.LJFF);
        }
        if (view instanceof InterfaceC19592111l1) {
            ((InterfaceC19592111l1) view).LIZJ(interactStickerStruct, stickerModel);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2 = layoutParams;
            }
            if (c19591211ks.LIZ == EnumC19589411ka.INTERACT) {
                ((InterfaceC19592111l1) view).LJIJJLI();
            }
        }
        layoutParams2.gravity = 17;
        C786410Ut5.W5(view, layoutParams2);
        C786410Ut5.Jc(view, c19592211l2LIZIZ.LIZ);
        C786410Ut5.ed(view, c19592211l2LIZIZ.LIZIZ);
        if (!(view instanceof C19594011lK)) {
            C786410Ut5.pc(view, c19592211l2LIZIZ.LIZLLL * c19591211ks.LIZJ.LIZJ);
            C786410Ut5.Ob(view, c19592211l2LIZIZ.LIZLLL * c19591211ks.LIZJ.LIZJ);
        }
        C786410Ut5.Ab(view, c19592211l2LIZIZ.LIZJ);
        C786410Ut5.W5(view, layoutParams2);
        c19591211ks.LIZIZ.addView(view);
    }
}
