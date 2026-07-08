package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119780fFI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final int i, final int i2, final int i3, final View view, final EnumC1120860fH2 enumC1120860fH2, final DataChannel dataChannel, final Integer num, final String str, final Function0 function0, final Function0 function02) {
        C486790J7d.LIZLLL(new Runnable() { // from class: X.0fF8
            public final void LIZ() {
                C1119670fF7 c785230UrB;
                View view2 = view;
                if (view2 != null) {
                    Integer num2 = num;
                    String str2 = str;
                    int i4 = i;
                    int i5 = i2;
                    int i6 = i3;
                    Function0<Unit> function03 = function0;
                    Function0<Unit> function04 = function02;
                    if (num2 != null) {
                        c785230UrB = new C785220UrA(view2);
                        c785230UrB.LIZ(R.attr.e7q);
                    } else {
                        c785230UrB = new C785230UrB(view2);
                    }
                    if (str2 == null || str2.length() == 0) {
                        c785230UrB.LIZLLL(i4);
                    } else {
                        c785230UrB.LJIJJ = str2;
                    }
                    if (i5 != 0) {
                        c785230UrB.LIZIZ(i5);
                    }
                    if (i6 != 0) {
                        c785230UrB.LJ(i6);
                    }
                    c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785230UrB.LJIIIZ = true;
                    c785230UrB.LJIILL = new C1151860g52(function03, 2);
                    c785230UrB.LJ = new ACListenerS152S0100000_17(function04, 160);
                    C1119660fF6 c1119660fF6LIZJ = c785230UrB.LIZJ();
                    if (c1119660fF6LIZJ != null) {
                        C1113800f5e.LIZ.LJ(c1119660fF6LIZJ, enumC1120860fH2, dataChannel);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreviewUpsellHelper@7741.showUpsellToolTip$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreviewUpsellHelper@7741.showUpsellToolTip$3");
            }
        }, null, 1000L);
    }
}
