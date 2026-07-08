package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: X.0RIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIJ {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.getDefault());

    public static void LIZ(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC665370Q7z interfaceC665370Q7z) {
        C708910RrN c708910RrN;
        InteractCommonLogicAbility interactCommonLogicAbility;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        View viewFindViewById = viewGroup2.findViewById(R.id.tv_schedule_video_watermark);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = viewGroup2.findViewById(R.id.fu8);
        if (viewFindViewById2 instanceof C708910RrN) {
            c708910RrN = (C708910RrN) viewFindViewById2;
        } else {
            c708910RrN = null;
        }
        if (c708910RrN != null) {
            c708910RrN.setGroupClickable(true);
        }
        if (interfaceC665370Q7z != null && (interactCommonLogicAbility = (InteractCommonLogicAbility) C1558520qew.LIZ(interfaceC665370Q7z, InteractCommonLogicAbility.class, null)) != null) {
            interactCommonLogicAbility.cl1(true);
        }
    }
}
