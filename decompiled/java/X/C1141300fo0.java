package X;

import com.bytedance.common.utility.Logger;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS418S0200000_17;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141300fo0 implements InterfaceC1142480fpu {
    public long LIZ;
    public long LIZIZ;
    public final /* synthetic */ C1141310fo1 LIZJ;

    @Override // X.InterfaceC1142480fpu
    public final void onStart() {
        InterfaceC1140870fnJ interfaceC1140870fnJ;
        this.LIZJ.LLILLJJLI = C1141290fnz.LIZJ().currentTimeMillis();
        C1141310fo1 c1141310fo1 = this.LIZJ;
        C1141100fng c1141100fng = c1141310fo1.LLILZIL;
        if (!c1141310fo1.LLILZ) {
            if (c1141100fng != null && (interfaceC1140870fnJ = c1141100fng.LIZIZ) != null) {
                interfaceC1140870fnJ.LJIIIIZZ(EnumC1138990fkH.ALPHA_PLAYER);
            }
            C1141310fo1 c1141310fo12 = this.LIZJ;
            if (c1141310fo12.LLILZIL == null && c1141310fo12.LLILLJJLI > this.LIZIZ) {
                LIZLLL("onStart_request_is_null");
            }
        }
        this.LIZJ.LLILZ = true;
    }

    @Override // X.InterfaceC1142480fpu
    public final void onStop() {
        InterfaceC1140870fnJ interfaceC1140870fnJ;
        C1141710fof c1141710fof;
        C1141100fng c1141100fng = this.LIZJ.LLILZIL;
        if (c1141100fng != null && (c1141710fof = c1141100fng.LIZJ) != null) {
            c1141710fof.LIZ(null);
        }
        C1141100fng c1141100fng2 = this.LIZJ.LLILZIL;
        if (c1141100fng2 != null && (interfaceC1140870fnJ = c1141100fng2.LIZIZ) != null) {
            interfaceC1140870fnJ.LIZIZ(EnumC1138990fkH.ALPHA_PLAYER);
        }
        C1141100fng c1141100fng3 = this.LIZJ.LLILZIL;
        Logger.i("giftboxprocess", String.valueOf(c1141100fng3 != null ? c1141100fng3.LIZIZ : null));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.hashCode());
        sbLIZ.append(" on stop ");
        C1141100fng c1141100fng4 = this.LIZJ.LLILZIL;
        sbLIZ.append(c1141100fng4 != null ? Integer.valueOf(c1141100fng4.hashCode()) : null);
        Logger.i("hybrid_gift", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LLILZIL = null;
    }

    @Override // X.InterfaceC1142480fpu
    public final void LJII() {
        this.LIZ = C1141290fnz.LIZJ().currentTimeMillis();
        C1141290fnz.LJFF(new AwS418S0200000_17(this.LIZJ, this, 106));
    }

    public C1141300fo0(C1141310fo1 c1141310fo1) {
        this.LIZJ = c1141310fo1;
    }

    @Override // X.InterfaceC1142480fpu
    public final void LIZ(C1141460foG c1141460foG) throws JSONException {
        InterfaceC1140870fnJ interfaceC1140870fnJ;
        Integer numValueOf;
        C1141710fof c1141710fof;
        C1141100fng c1141100fng = this.LIZJ.LLILZIL;
        if (c1141100fng != null && (c1141710fof = c1141100fng.LIZJ) != null) {
            c1141710fof.LIZ(c1141460foG);
        }
        C1138610fjf c1138610fjfLIZ = this.LIZJ.LIZ(c1141460foG);
        C1141100fng c1141100fng2 = this.LIZJ.LLILZIL;
        if (c1141100fng2 != null) {
            interfaceC1140870fnJ = c1141100fng2.LIZIZ;
        } else {
            interfaceC1140870fnJ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.hashCode());
        sbLIZ.append(" on End request: ");
        C1141100fng c1141100fng3 = this.LIZJ.LLILZIL;
        if (c1141100fng3 != null) {
            numValueOf = Integer.valueOf(c1141100fng3.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" listener: ");
        sbLIZ.append(interfaceC1140870fnJ);
        Logger.i("hybrid_gift", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ.LLILZIL = null;
        this.LIZIZ = C1141290fnz.LIZJ().currentTimeMillis();
        if (interfaceC1140870fnJ != null) {
            interfaceC1140870fnJ.LJIIIZ(EnumC1138990fkH.ALPHA_PLAYER, c1138610fjfLIZ);
        }
    }

    @Override // X.InterfaceC1142480fpu
    public final void LIZJ(C1141050fnb c1141050fnb) throws JSONException {
        Integer numValueOf;
        InterfaceC1140870fnJ interfaceC1140870fnJ;
        InterfaceC1140870fnJ interfaceC1140870fnJ2;
        C1141710fof c1141710fof;
        C1141100fng c1141100fng = this.LIZJ.LLILZIL;
        if (c1141100fng != null && (c1141710fof = c1141100fng.LIZJ) != null) {
            c1141710fof.LIZ(null);
        }
        C1138610fjf c1138610fjfLIZ = this.LIZJ.LIZ(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.hashCode());
        sbLIZ.append(" error on End request: ");
        C1141100fng c1141100fng2 = this.LIZJ.LLILZIL;
        if (c1141100fng2 != null) {
            numValueOf = Integer.valueOf(c1141100fng2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        Logger.i("hybrid_gift", C2188811AlT.LIZIZ(sbLIZ));
        if (c1141050fnb == null) {
            C1141100fng c1141100fng3 = this.LIZJ.LLILZIL;
            if (c1141100fng3 != null && (interfaceC1140870fnJ2 = c1141100fng3.LIZIZ) != null) {
                interfaceC1140870fnJ2.LJIIIZ(EnumC1138990fkH.ALPHA_PLAYER, c1138610fjfLIZ);
            }
        } else {
            if (c1141050fnb.LIZLLL == null) {
                c1141050fnb.LIZLLL = c1138610fjfLIZ;
            }
            C1141100fng c1141100fng4 = this.LIZJ.LLILZIL;
            if (c1141100fng4 != null && (interfaceC1140870fnJ = c1141100fng4.LIZIZ) != null) {
                interfaceC1140870fnJ.LJI(EnumC1138990fkH.ALPHA_PLAYER, c1141050fnb);
            }
        }
        this.LIZJ.LLILZIL = null;
        this.LIZIZ = C1141290fnz.LIZJ().currentTimeMillis();
    }

    public final void LIZLLL(String str) {
        InterfaceC1141190fnp interfaceC1141190fnp = (InterfaceC1141190fnp) C2043807zY.LIZ(InterfaceC1141190fnp.class);
        if (interfaceC1141190fnp != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1141310fo1 c1141310fo1 = this.LIZJ;
            linkedHashMap.put("startTs", String.valueOf(c1141310fo1.LLILLL));
            linkedHashMap.put("realStartTs", String.valueOf(c1141310fo1.LLILLJJLI));
            linkedHashMap.put("onFirstFrameTs", String.valueOf(this.LIZ));
            linkedHashMap.put("curTs", String.valueOf(C1141290fnz.LIZJ().currentTimeMillis()));
            linkedHashMap.put("onEndTs", String.valueOf(this.LIZIZ));
            interfaceC1141190fnp.LIZLLL(str, linkedHashMap);
        }
    }

    @Override // X.InterfaceC1142480fpu
    public final void LIZIZ(float f, float f2, float f3, float f4) {
    }
}
