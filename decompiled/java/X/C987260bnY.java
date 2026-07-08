package X;

import com.bytedance.android.live.effect.api.IEffectService;

/* JADX INFO: renamed from: X.0bnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987260bnY extends AbstractC1542200qEc {
    public final int $t;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 1:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 2:
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 3:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 1:
                C20441214yg.LJIIIZ("SparkViewManager", "sparkView onLoadFinish");
                break;
            case 2:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case 3:
                C20441214yg.LJIIIZ("TakeTheStageLedComponent", "sparkView onLoadFinish");
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        switch (this.$t) {
            case 0:
                onDestroy$0(this);
                break;
            case 1:
            default:
                super.onDestroy();
                break;
            case 2:
                C951960asc.LIZ = null;
                break;
        }
    }

    public C987260bnY(int i) {
        this.$t = i;
    }

    public static final void onDestroy$0(C987260bnY c987260bnY) {
        C20441214yg.LIZIZ("LetsDanceAnchorWidget", "pick song page closed via onDestroy");
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).resumeBGM();
    }

    public static final void LJL$0(C987260bnY c987260bnY, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c987260bnY.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkView onLoadFailed:");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJIIIZ("SparkViewManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJL$1(C987260bnY c987260bnY, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c987260bnY.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkView onLoadFailed:");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJIIIZ("TakeTheStageLedComponent", C2188811AlT.LIZIZ(sbLIZ));
    }
}
