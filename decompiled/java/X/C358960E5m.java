package X;

import android.content.Context;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0E5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358960E5m {
    public static final Keva LIZ = Keva.getRepo("reduce_noise_model_path");

    public static boolean LIZJ() {
        String string = LIZ.getString("reduce_noise_model_path", "");
        if (string.length() == 0) {
            return false;
        }
        C05YQ.LIZ.getClass();
        return C2286708xd.LIZJ(string);
    }

    public static TuxIconDrawable LIZIZ(Context context) {
        int iLIZ;
        int iLIZ2;
        if (context == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        Integer numLIZ = C0EJA.LIZ();
        if (numLIZ != null) {
            iLIZ = C0EGK.LIZ(numLIZ.intValue());
        } else {
            iLIZ = C0EGK.LIZ(28);
        }
        c419910GdJ.LIZIZ = iLIZ;
        Integer numLIZ2 = C0EJA.LIZ();
        if (numLIZ2 != null) {
            iLIZ2 = C0EGK.LIZ(numLIZ2.intValue());
        } else {
            iLIZ2 = C0EGK.LIZ(28);
        }
        c419910GdJ.LIZJ = iLIZ2;
        c419910GdJ.LIZ = R.raw.icon_color_right_bottom_checkbox;
        return c419910GdJ.LIZ(context);
    }

    public static String LIZ(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        NLETrack trackBySlot;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null && (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) != null && (trackBySlot = nLEModelLLZ.getTrackBySlot(nLETrackSlot)) != null) {
            if (trackBySlot.getMainTrack()) {
                return "bottom_item_edit_reduce_noise";
            }
            if (C351220Dpo.LLLIIL(trackBySlot)) {
                return "bottom_item_overlay_edit_reduce_noise";
            }
            if (C351220Dpo.LLILL(trackBySlot)) {
                return "bottom_item_voiceover_edit_reduce_noise";
            }
            return null;
        }
        return null;
    }

    public static boolean LIZLLL(NLETrackSlot nLETrackSlot, C19A3 c19a3) {
        C1DRG c1drg;
        if (c19a3 == null || (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) == null) {
            return false;
        }
        InterfaceC358970E5n interfaceC358970E5n = (InterfaceC358970E5n) c1drg.LJIIL(null, InterfaceC358970E5n.class);
        if (C351220Dpo.LJJLL(nLETrackSlot) == null) {
            if (interfaceC358970E5n != null) {
                interfaceC358970E5n.wm0(nLETrackSlot);
                return true;
            }
            return true;
        }
        if (interfaceC358970E5n != null) {
            interfaceC358970E5n.jt0(nLETrackSlot);
        }
        return false;
    }
}
