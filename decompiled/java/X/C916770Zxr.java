package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestSupportExpandDefaultLayoutSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0Zxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916770Zxr {
    public static final C916770Zxr LIZ = new C916770Zxr();

    public static void LIZ(Context context, String str, Function0 function0, boolean z) {
        int i;
        PosIdentity posIdentity;
        if (!z) {
            function0.invoke();
            return;
        }
        if (!Intrinsics.LJFF(str, "live_show") && !Intrinsics.LJFF(str, "count_down_single")) {
            function0.invoke();
            return;
        }
        if (Intrinsics.LJFF(str, "live_show")) {
            i = 2131854597;
        } else if (Intrinsics.LJFF(str, "count_down_single")) {
            i = 2131854596;
        } else {
            return;
        }
        if (C940770aaZ.LIZ().getDataSource().LJIJJ()) {
            List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
            ArrayList arrayList = new ArrayList();
            for (C957020b0m c957020b0m : listLJIIIZ) {
                C957020b0m c957020b0m2 = c957020b0m;
                PosIdentity posIdentity2 = c957020b0m2.getPosIdentity();
                if (posIdentity2 != null && Integer.valueOf(posIdentity2.type) != null && ((posIdentity = c957020b0m2.getPosIdentity()) == null || posIdentity.type != 0)) {
                    arrayList.add(c957020b0m);
                }
            }
            int size = arrayList.size();
            int i2 = MultiGuestSupportExpandDefaultLayoutSetting.INSTANCE.getValue().maxPosition;
            if (i2 > 0 && size > i2) {
                C766270U4b.LIZLLL(2131850130);
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIIZILJ(2131854598);
            c782110Um9.LJII(i);
            c782110Um9.LJIIJ(2131843523, new InterfaceC743640TFa() { // from class: X.0Zxs
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILIIL(2131854595, new AcS495S0100000_12(function0, 38));
            C786410Ut5.E4(c782110Um9.LIZ());
            return;
        }
        function0.invoke();
    }
}
