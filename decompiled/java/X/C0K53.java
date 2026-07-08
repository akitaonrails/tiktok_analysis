package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;

/* JADX INFO: renamed from: X.0K53, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K53 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        try {
            C2204961BRm.LJJIJIIJI((ClipboardManager) C786410Ut5.H2(context, "clipboard"), ClipData.newPlainText("label", str), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehbZbdkifFJUT/QTfHUL6dRZTG2bs+5Vw=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().log("ClipboardLancet", e.getLocalizedMessage());
        }
    }
}
