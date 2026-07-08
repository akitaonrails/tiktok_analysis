package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.058r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13047058r implements Keva.OnChangeListener {
    public static final C13047058r LIZ = new C13047058r();

    @Override // com.bytedance.keva.Keva.OnChangeListener
    public final void onChanged(Keva keva, String str) {
        if (Intrinsics.LJFF(str, "slark_events_monitor_list")) {
            C13048058s c13048058s = C13048058s.LIZ;
            C13048058s.LIZJ = a0.LJJLIIIJILLIZJL(keva.getString("slark_events_monitor_list", ""), new String[]{","}, 0, 6);
        }
    }
}
