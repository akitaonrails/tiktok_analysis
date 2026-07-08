package X;

import Y.ARunnableS108S0100000_8;
import android.text.format.DateFormat;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.da.DBEvent;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MZK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZK {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(225));

    public static Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static int LIZIZ() {
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        return (int) C844470XAv.LIZLLL();
    }

    public static String LIZ(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    public static void LJ(DBEvent dBEvent) {
        C741040T5a.LIZ.execute(new ARunnableS108S0100000_8(dBEvent, 73));
    }

    public static final void LIZLLL(String str, int i, AwemeDraft awemeDraft) {
        if (Intrinsics.LJFF(str, "user_click")) {
            if (i <= 0) {
                C1448790nnx.LIZIZ("draft_delete_error", String.valueOf(-400), null, 12);
            } else {
                C1448790nnx.LIZJ("draft_delete_success");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitor draft delete: source=");
        sbLIZ.append(str);
        sbLIZ.append(", primaryKey=");
        sbLIZ.append(awemeDraft.LIZJ());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
