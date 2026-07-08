package X;

import android.util.Log;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: renamed from: X.0Pdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649460Pdg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object obj, String str, boolean z) {
        if (obj instanceof DynamicPatch) {
            C649470Pdh.LIZ.getClass();
            if (!C649470Pdh.LJIJJLI((DynamicPatch) obj)) {
                return;
            }
        }
        if (obj instanceof String) {
            C649470Pdh.LIZ.getClass();
            if (!C649470Pdh.LJJ((String) obj)) {
                return;
            }
        }
        String strValueOf = String.valueOf(obj.hashCode());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(strValueOf);
        sbLIZ.append("] - ");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EcProductCardLog", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EcProductCardLog", Log.getStackTraceString(new Throwable()));
        }
    }
}
