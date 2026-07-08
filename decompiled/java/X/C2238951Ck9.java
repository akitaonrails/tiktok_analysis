package X;

import Y.ARunnableS134S0100000_34;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Ck9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238951Ck9 implements InterfaceC928760aHC {
    public static final C01GW<InterfaceC928760aHC> LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(241));
    public String LIZ = "";
    public String LIZIZ = "";
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public boolean LJIIIIZZ;

    @Override // X.InterfaceC928760aHC
    public final void LIZIZ() {
        LJII(this.LJI, new AwS578S0100000_34(this, 133));
    }

    @Override // X.InterfaceC928760aHC
    public final void LIZJ() {
        LJII(this.LJ, new AwS578S0100000_34(this, 135));
    }

    @Override // X.InterfaceC928760aHC
    public final void LJ() {
        LJII(this.LJFF, new AwS578S0100000_34(this, 134));
    }

    @Override // X.InterfaceC928760aHC
    public final void LJFF() {
        LJII(this.LIZLLL, new AwS578S0100000_34(this, 136));
    }

    @Override // X.InterfaceC928760aHC
    public final void LIZLLL(View view) {
        HandlerHook.viewPost(view, new ARunnableS134S0100000_34(this, 63));
    }

    @Override // X.InterfaceC928760aHC
    public final void LIZ(String str, String str2) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene=");
        sbLIZ.append(str);
        sbLIZ.append(", source=");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestPageFirstFrameLogHelper", strLIZIZ);
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = true;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = System.currentTimeMillis();
    }

    public final void LJII(long j, Function0<Unit> function0) {
        if (j <= 0 && this.LJIIIIZZ) {
            function0.invoke();
        }
    }

    public static HashMap LJI(long j, long j2, String str, HashMap map) {
        if (j > 0 && j2 > 0 && j >= j2) {
            map.put(str, String.valueOf(j - j2));
        }
        return map;
    }
}
