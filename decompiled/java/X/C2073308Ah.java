package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.08Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2073308Ah {
    public static void LIZ() {
        Keva repo = KevaImpl.getRepo("anr_dispatch_boost", 1);
        repo.storeBoolean("boost_enable", C0C64.LJIILLIIL().LJIIIZ(31744, "anr_dispatch_boost_v2", true, false));
        repo.storeInt("history_message_boost_time", C0C64.LJIILLIIL().LJIJ(31744, -1, "anr_history_message_boost_time", true));
    }
}
