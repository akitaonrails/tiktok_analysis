package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lnn.l;
import lnn.q;

/* JADX INFO: renamed from: X.0sjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638070sjF {
    public static void LIZ(C19GS c19gs, LifecycleOwner lifecycleOwner, View view, boolean z, q qVar, C1DRG c1drg, Function1 function1, Function0 function0) {
        boolean z2;
        int i;
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        if (shortVideoContext != null && C579450Mo3.LIZIZ(shortVideoContext) && C1627490sSB.LIZIZ()) {
            z2 = true;
            i = R.id.ly4;
        } else {
            z2 = false;
            i = R.id.ly3;
        }
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(i);
        C0R06.LIZ(c1322110kVd, R.dimen.b2);
        C417370GYd c417370GYd = (C417370GYd) view.findViewById(R.id.ly7);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gvl);
        if (C256930A5b.LIZ()) {
            C0R06.LIZIZ(c1322110kVd, 56);
            C0R06.LIZIZ(c417370GYd, 56);
        } else {
            if (!z2) {
                int i2 = C1638080sjG.LIZ;
                ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
                layoutParams.height = i2;
                layoutParams.width = i2;
                C786410Ut5.W5(c1322110kVd, layoutParams);
            }
            int i3 = C1638080sjG.LIZ;
            ViewGroup.LayoutParams layoutParams2 = c417370GYd.getLayoutParams();
            layoutParams2.height = i3;
            layoutParams2.width = i3;
            C786410Ut5.W5(c417370GYd, layoutParams2);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        layoutParams3.height = iLIZIZ;
        layoutParams3.width = iLIZIZ2;
        C786410Ut5.W5(viewGroup, layoutParams3);
        C1428310nGv.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), viewGroup, false);
        new l(c19gs, lifecycleOwner, z, qVar, function1, viewGroup, c1322110kVd, z2, c417370GYd, (C417370GYd) view.findViewById(R.id.ly5), c1drg, function0);
    }
}
