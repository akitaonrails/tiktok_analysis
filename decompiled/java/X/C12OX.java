package X;

import Y.ARunnableS98S0200000_29;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.LiveCenterStatusIssueInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12OX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OX {
    public final DataChannel LIZ;
    public final Function0<View> LIZIZ;
    public final Function0<C12OA> LIZJ;
    public final Function0<EnumC804620VhM> LIZLLL;
    public final Function0<Boolean> LJ;
    public boolean LJI;
    public boolean LJII;
    public ARunnableS98S0200000_29 LJIIIZ;
    public ARunnableS98S0200000_29 LJIIJ;
    public ARunnableS98S0200000_29 LJIIJJI;
    public int LJIILJJIL;
    public long LJIILL;
    public int LJIIZILJ;
    public long LJIJ;
    public int LJIJJ;
    public long LJIJJLI;
    public long LJJ;
    public long LJJIFFI;
    public String LJFF = "live_page";
    public final Map<Integer, C19747512Ob> LJIIIIZZ = new LinkedHashMap();
    public final List<C466140IPs> LJIIL = new ArrayList();
    public int LJIILIIL;
    public int LJIILLIIL;
    public int LJIJI;
    public C19416710xp LJIL = C12OY.LJII(this.LJIILIIL, this.LJIILLIIL, this.LJIJI);
    public String LJJI = "";
    public final C12OZ LJJII = new C12OZ(this);

    public final void LJI() {
        if (C1152720g6Q.LIZ()) {
            C19416710xp c19416710xpLJII = C12OY.LJII(this.LJIILIIL, this.LJIILLIIL, this.LJIJI);
            if (Intrinsics.LJFF(c19416710xpLJII, this.LJIL)) {
                return;
            }
            this.LJIL = c19416710xpLJII;
            LIZLLL(false);
            this.LJJI = c19416710xpLJII.LIZ;
            this.LJJIFFI = this.LJJ;
            this.LJJ = C158B.LIZ();
        }
    }

    public final void LIZ(Runnable runnable) {
        View viewInvoke = this.LIZIZ.invoke();
        if (viewInvoke != null) {
            HandlerHook.viewPostDelay(viewInvoke, runnable, 300000L);
        }
    }

    public final void LIZIZ(C0IQ1 c0iq1) {
        if (!C1152720g6Q.LIZ() || C475760IlC.LJ(c0iq1.LIZIZ, c0iq1.LIZ)) {
            return;
        }
        ((ArrayList) this.LJIIL).add(new C466140IPs(c0iq1.LIZ, c0iq1.LIZIZ, Integer.valueOf(c0iq1.LIZJ), C158B.LIZ()));
        this.LIZ.zW(LiveCenterStatusIssueInfo.class, C13LP.LLIIII(this.LJIIL));
    }

    public final void LIZJ(Runnable runnable) {
        View viewInvoke = this.LIZIZ.invoke();
        if (viewInvoke != null) {
            HandlerHook.viewRemoveCallbacks(viewInvoke, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(boolean r20) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OX.LIZLLL(boolean):void");
    }

    public final boolean LJFF(C0IQ1 c0iq1) {
        List<C466140IPs> list = this.LJIIL;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            for (C466140IPs c466140IPs : (ArrayList) list) {
                if (c466140IPs.LIZ == c0iq1.LIZ) {
                    Integer num = c466140IPs.LIZJ;
                    int i = c0iq1.LIZJ;
                    if (num != null && num.intValue() == i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean LJ(C0IQ1 c0iq1, boolean z, long j) {
        if (this.LJI) {
            return false;
        }
        if (c0iq1.LIZLLL - j < 300000 && !z) {
            return false;
        }
        return true;
    }

    public C12OX(DataChannel dataChannel, AwS573S0100000_29 awS573S0100000_29, AwS573S0100000_29 awS573S0100000_292, AwS573S0100000_29 awS573S0100000_293, AwS573S0100000_29 awS573S0100000_294) {
        this.LIZ = dataChannel;
        this.LIZIZ = awS573S0100000_29;
        this.LIZJ = awS573S0100000_292;
        this.LIZLLL = awS573S0100000_293;
        this.LJ = awS573S0100000_294;
    }
}
