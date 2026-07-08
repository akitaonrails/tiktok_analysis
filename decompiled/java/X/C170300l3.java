package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C170300l3 implements InterfaceC487230J8v {
    public static final C170300l3 LIZJ = new C170300l3();
    public static final Map<String, String> LIZLLL = C2097908Jt.LIZJ(new Pair("push_cold_start", "enter_deep_link_activity_v2"));
    public final HashMap<String, HashMap<String, String>> LIZ = new HashMap<>();
    public final HashMap<String, Boolean> LIZIZ = new HashMap<>();

    @Override // X.InterfaceC487230J8v
    public final void LIZ() {
        Handler handlerLIZ = C473410IhP.LIZ();
        if (handlerLIZ != null) {
            C786410Ut5.LJJZZIII(handlerLIZ, new RunnableC514901zX(this, 4));
        }
    }

    @Override // X.InterfaceC487230J8v
    public final void LIZIZ(String str) {
        LIZJ(str, String.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC487230J8v
    public final void LIZJ(final String str, final String str2) {
        Handler handlerLIZ = C473410IhP.LIZ();
        if (handlerLIZ != null) {
            C786410Ut5.LJJZZIII(handlerLIZ, new Runnable() { // from class: X.00l2
                public final /* synthetic */ String LL = "push_cold_start";

                public final void LIZ() {
                    Map<String, String> map = C170300l3.LIZLLL;
                    if (map.containsKey(this.LL) && u.LJIJI(map.get(this.LL), str, false)) {
                        this.LIZIZ.put(this.LL, Boolean.TRUE);
                    }
                    if (Intrinsics.LJFF(this.LIZIZ.get(this.LL), Boolean.TRUE)) {
                        if (!this.LIZ.containsKey(this.LL) || this.LIZ.get(this.LL) == null) {
                            this.LIZ.put(this.LL, new HashMap<>());
                        }
                        HashMap<String, String> map2 = this.LIZ.get(this.LL);
                        if (map2 != null) {
                            map2.put(str, str2);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveTimeRecordEventTrack@d6dc.addRecordItem$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveTimeRecordEventTrack@d6dc.addRecordItem$1");
                }
            });
        }
    }
}
