package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S0100300_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20004013Os extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        LIZ(null, null);
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 412));
    }

    public final void LIZ(Function1<? super Integer, Unit> function1, Function1<? super C1662010tLr, Unit> function12) {
        C20008813Qo c20008813QoLJIILIIL;
        boolean z;
        EffectNetListResponse effectNetListResponse;
        C13RD c13rd = this.LIZ;
        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
        EffectChannelModel data = null;
        if (interfaceC20004513Ox != null) {
            c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(C13OQ.LJI(c13rd, this.LIZIZ));
        } else {
            c20008813QoLJIILIIL = null;
        }
        int length = 0;
        if (this.LIZ.LJJJ == 2) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (c20008813QoLJIILIIL == null) {
                C1662010tLr c1662010tLr = new C1662010tLr(10004);
                runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 69));
                if (function12 != null) {
                    ((AwS609S0100000_30) function12).invoke(c1662010tLr);
                    return;
                }
                return;
            }
            try {
                String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
                length = strLJIIIZ.length() / 1024;
                if (z) {
                    C13R7 c13r7 = this.LIZ.LJIJI;
                    if (c13r7 != null && (effectNetListResponse = (EffectNetListResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, EffectNetListResponse.class)) != null) {
                        data = effectNetListResponse.getData();
                    }
                } else {
                    C13R7 c13r72 = this.LIZ.LJIJI;
                    if (c13r72 != null) {
                        data = (EffectChannelModel) c13r72.LIZ.convertJsonToObj(strLJIIIZ, EffectChannelModel.class);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchPanelEffectListCacheTask", strLIZIZ, null);
                C13RD c13rd2 = this.LIZ;
                InterfaceC20004513Ox interfaceC20004513Ox2 = c13rd2.LJJIFFI;
                if (interfaceC20004513Ox2 != null) {
                    interfaceC20004513Ox2.remove(C13OQ.LJI(c13rd2, this.LIZIZ));
                }
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            if (data != null && data.checkValued()) {
                if (z) {
                    C13LD.LIZ.getClass();
                    C13LD.LIZIZ(data);
                }
                EffectChannelResponse effectChannelResponseLIZ = new C1643810ssV(this.LIZIZ, this.LIZ.LJII, !z).LIZ(data);
                C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZJ);
                if (c13maLIZ != null) {
                    c13maLIZ.preProcess(effectChannelResponseLIZ);
                }
                runOnMainThread(new AwS431S0200000_30(this, effectChannelResponseLIZ, 70));
                if (function1 == null) {
                    return;
                }
                ((AwS1S0100300_30) function1).invoke(Integer.valueOf(length));
                return;
            }
            C1662010tLr c1662010tLr2 = new C1662010tLr(10004);
            runOnMainThread(new AwS431S0200000_30(this, c1662010tLr2, 69));
            if (function12 == null) {
                return;
            }
            ((AwS609S0100000_30) function12).invoke(c1662010tLr2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }

    public C20004013Os(C13RD c13rd, String str, String str2) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
