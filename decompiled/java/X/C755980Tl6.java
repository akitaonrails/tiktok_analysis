package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Tl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755980Tl6 {
    public static C755980Tl6 LJIIJ;
    public InterfaceC582670MtF LIZ;
    public InterfaceC582670MtF LIZIZ;
    public InterfaceC582670MtF LIZJ;
    public Runnable LIZLLL;
    public final HashMap<String, RoomStruct> LJ = new HashMap<>();
    public volatile Map<String, View> LJFF = null;
    public volatile Map<String, View> LJI = null;
    public volatile Map<Fragment, LinkedList<View>> LJII = null;
    public volatile Map<String, Integer> LJIIIIZZ = null;
    public RunnableC755950Tl3 LJIIIZ;

    public final void LIZLLL() {
        LIZIZ(null);
        InterfaceC582670MtF interfaceC582670MtF = this.LIZIZ;
        if (interfaceC582670MtF != null) {
            interfaceC582670MtF.LIZ(null);
        }
    }

    public static C755980Tl6 LIZ() {
        if (LJIIJ == null) {
            synchronized (C755980Tl6.class) {
                try {
                    if (LJIIJ == null) {
                        LJIIJ = new C755980Tl6();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIJ;
    }

    public final void LIZJ() {
        if (C07IN.LIZ()) {
            if (this.LJII != null) {
                ((ConcurrentHashMap) this.LJII).clear();
                this.LJII = null;
            }
            Runnable runnable = this.LIZLLL;
            if (runnable != null) {
                runnable.run();
            }
        }
        if (this.LJFF != null) {
            ((ConcurrentHashMap) this.LJFF).clear();
            this.LJFF = null;
        }
        if (this.LJI != null) {
            ((ConcurrentHashMap) this.LJI).clear();
            this.LJI = null;
        }
        RunnableC755950Tl3 runnableC755950Tl3 = this.LJIIIZ;
        if (runnableC755950Tl3 != null) {
            runnableC755950Tl3.run();
        }
    }

    public final void LIZIZ(String str) {
        InterfaceC582670MtF interfaceC582670MtF = this.LIZ;
        if (interfaceC582670MtF != null) {
            interfaceC582670MtF.LIZ(str);
        }
        InterfaceC582670MtF interfaceC582670MtF2 = this.LIZJ;
        if (interfaceC582670MtF2 != null) {
            interfaceC582670MtF2.LIZ(str);
        }
    }

    public final void LJ(String str) {
        LIZIZ(str);
        InterfaceC582670MtF interfaceC582670MtF = this.LIZIZ;
        if (interfaceC582670MtF != null) {
            interfaceC582670MtF.LIZ(str);
        }
    }
}
