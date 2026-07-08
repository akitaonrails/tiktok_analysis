package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHasSlideGestureListSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766290U4d {
    public static final boolean LIZJ() {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        ArrayList<LiveEffect> arrayList = new ArrayList();
        arrayList.addAll(c0u78LIZ.qr(C0UD4.LIZIZ));
        arrayList.addAll(c0u78LIZ.qr("livebackground"));
        for (LiveEffect liveEffect : arrayList) {
            List<String> listLIZJ = liveEffect.LIZJ();
            if (listLIZJ != null && listLIZJ.contains("TouchGes") && (liveEffect.LJIILJJIL() || LiveEffectHasSlideGestureListSetting.INSTANCE.canSlide(liveEffect.getResourceId()))) {
                return true;
            }
        }
        arrayList.clear();
        arrayList.addAll(c0u78LIZ.qr("livegame"));
        arrayList.addAll(c0u78LIZ.qr("tiktok_live_boards"));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<String> listLIZJ2 = ((LiveEffect) it2.next()).LIZJ();
            if (listLIZJ2 != null && listLIZJ2.contains("TouchGes")) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZ(C500980Jkm c500980Jkm) {
        c500980Jkm.LIZJ = R.style.ajk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
    }

    public static final void LIZIZ(DialogFragment dialogFragment) {
        if (C500260Jjc.LJ(dialogFragment.getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
            tuxImmersionBarLIZJ.LIZJ(false, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
    }
}
