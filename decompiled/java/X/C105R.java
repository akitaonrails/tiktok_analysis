package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.105R, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C105R extends AbstractC191867104j {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, C105U.LL);

    public final AbstractC191867104j LIZJ() {
        return (AbstractC191867104j) this.LIZ.getValue();
    }

    public static boolean LIZLLL(long j) {
        AnonymousClass1057.LIZ.getClass();
        Long lLIZIZ = AnonymousClass1057.LIZIZ();
        if (lLIZIZ == null || Math.abs(j - lLIZIZ.longValue()) <= 360000) {
            return false;
        }
        AnonymousClass1057.LIZJ("guide_content_reuse_on_report", AFwS217S0000000_28.get$arr$(800));
        return true;
    }

    @Override // X.AbstractC191867104j
    public final void LIZ(long j) {
        if (!LIZLLL(j)) {
            return;
        }
        AbstractC191867104j abstractC191867104j = C105S.LIZ;
        C105S.LIZ = LIZJ();
    }

    @Override // X.AbstractC191867104j
    public final void LIZIZ(Context context, LifecycleOwner lifecycleOwner, String str, long j) {
        int iIntValue;
        if (!LIZLLL(j) && context != null) {
            AnonymousClass1057.LIZ.getClass();
            C191821102p.LIZIZ().getClass();
            Integer numLJIIIIZZ = C191880104w.LJIIIIZZ("guide_content_reuse_on_report", "type");
            if (numLJIIIIZZ != null && ((iIntValue = numLJIIIIZZ.intValue()) == 1 || iIntValue == 2)) {
                PopupManager.LJIIZILJ(new C19203410Au(context, lifecycleOwner, iIntValue, str), new C1668306g5("privacy_privacy_notify_dialog_report_2_associated_videos_in_6_min"));
            }
            AnonymousClass1057.LIZLLL(null);
        }
        AbstractC191867104j abstractC191867104j = C105S.LIZ;
        C105S.LIZ = LIZJ();
    }
}
