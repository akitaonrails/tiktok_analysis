package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveMonitorEvent;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.052f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12879052f {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(702));

    public static void LIZ(DraftSaveMonitorEvent draftSaveMonitorEvent) {
        ((Keva) LIZ.getValue()).storeString(draftSaveMonitorEvent.creationId, draftSaveMonitorEvent.toString());
    }
}
