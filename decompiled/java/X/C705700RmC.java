package X;

import Y.ARunnableS14S0101000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705700RmC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, Context context) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS14S0101000_3(i, context, 7));
    }

    public static void LIZ(ReusedUISlotAssem reusedUISlotAssem, int i, Function0 function0) {
        if (!C1261804wi.LIZ()) {
            function0.invoke();
            return;
        }
        System.currentTimeMillis();
        reusedUISlotAssem.mp(C706450RnP.LIZ);
        function0.invoke();
        C19EG c19egLIZ = C724240Sb0.LIZ(reusedUISlotAssem);
        if (c19egLIZ != null) {
            LIZJ(i, c19egLIZ);
        }
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z, boolean z2, int i2) {
        Activity activityLIZ;
        View viewTd;
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            z2 = true;
        }
        System.currentTimeMillis();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                if (viewGroup != null) {
                    viewTd = C20673215v0.LIZLLL(i, activityLIZ, viewGroup, z);
                } else {
                    viewTd = C20673215v0.LIZJ(i, activityLIZ);
                }
            }
            if (z2 && activityLIZ != null) {
                LIZJ(i, activityLIZ);
            }
            return viewTd;
        }
        activityLIZ = null;
        viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        if (z2) {
            LIZJ(i, activityLIZ);
        }
        return viewTd;
    }
}
