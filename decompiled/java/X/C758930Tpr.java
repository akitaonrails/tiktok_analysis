package X;

import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.live.slot.util.BcToggleToggleService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758930Tpr implements InterfaceC1141530foN {
    public LiveMode LL;
    public Function0<Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public boolean LLILZ = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 79));

    public final C758920Tpq LIZIZ() {
        return (C758920Tpq) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        int i;
        if (Intrinsics.LJFF("liveBrandToggle", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "toggle_status", "");
            } else {
                strLJFF = null;
            }
            boolean zLJFF = Intrinsics.LJFF(strLJFF, "open");
            if (zLJFF) {
                i = 2;
            } else {
                i = 0;
            }
            C758930Tpr c758930Tpr = BcToggleToggleService.LL;
            C758940Tps c758940Tps = c758930Tpr.LIZIZ().LIZ;
            c758940Tps.getClass();
            int i2 = c758940Tps.LIZ;
            boolean z = c758940Tps.LIZIZ;
            int i3 = c758940Tps.LIZJ;
            boolean z2 = c758940Tps.LIZLLL;
            C758940Tps c758940Tps2 = new C758940Tps(z, i2, i3, c758940Tps.LJ, c758940Tps.LJI, c758940Tps.LJIIIIZZ, z2, c758940Tps.LJFF, c758940Tps.LJII);
            LiveMode liveMode = LiveMode.THIRD_PARTY;
            if (C13LP.LJJJJ(this.LL, C1697810uHb.LJIIJJI(LiveMode.SCREEN_RECORD, liveMode)) && c758940Tps2.LIZJ != 3) {
                LIZIZ().LIZ.LIZLLL = zLJFF;
                LIZ(i, 2, null);
            }
            LiveMode liveMode2 = this.LL;
            LiveMode liveMode3 = LiveMode.VIDEO;
            if (liveMode2 == liveMode3 && c758940Tps2.LJ != 3) {
                LIZIZ().LIZ.LJFF = zLJFF;
                LIZ(i, 2, null);
            }
            if (C13LP.LJJJJ(this.LL, C1697810uHb.LJIIJJI(liveMode3, liveMode)) && c758940Tps2.LIZ != 3) {
                LIZIZ().LIZ.LIZIZ = zLJFF;
                LIZ(i, 1, null);
            }
            if (!Intrinsics.LJFF(c758940Tps2, c758930Tpr.LIZIZ().LIZ)) {
                DataChannelGlobal.LLILZ.HQ2(ECBcToggleChannel.class, c758930Tpr.LIZIZ());
            }
        }
    }

    public final void LIZ(int i, int i2, LiveMode liveMode) {
        LiveMode liveMode2;
        if (liveMode == null) {
            liveMode2 = this.LL;
        } else {
            liveMode2 = liveMode;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BcToggleBusinessID = ");
        sbLIZ.append(i2);
        sbLIZ.append(", BcToggleStatus = ");
        sbLIZ.append(i);
        sbLIZ.append(", currentLiveMode=");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("BcToggleToggleService", C2188811AlT.LIZIZ(sbLIZ));
        C758940Tps c758940Tps = LIZIZ().LIZ;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        c758940Tps.LJIIIIZZ = i;
                        return;
                    }
                    return;
                } else {
                    if (liveMode != LiveMode.VIDEO) {
                        return;
                    }
                    c758940Tps.LJI = i;
                    return;
                }
            }
            if (liveMode2 == LiveMode.VIDEO) {
                c758940Tps.LJ = i;
                return;
            } else {
                c758940Tps.LIZJ = i;
                return;
            }
        }
        c758940Tps.LIZ = i;
    }
}
