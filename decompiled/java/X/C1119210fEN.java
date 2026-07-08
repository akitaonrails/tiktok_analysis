package X;

import Y.AcS188S0300000_17;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerAlignIdSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerSettledDurationSettings;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fEN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119210fEN {
    public static final C1119210fEN LIZ = new C1119210fEN();
    public static final int LIZIZ = (int) C497740JfY.LIZIZ(1.9f);
    public static final int LIZJ = (int) C497740JfY.LIZIZ(2.2f);

    public static long LIZJ(RankTypeV2 rankTypeV2) {
        if (rankTypeV2 == null) {
            return 30L;
        }
        return LiveRankStickerSettledDurationSettings.INSTANCE.obtainRankSettledDuration(Integer.valueOf(rankTypeV2.type));
    }

    public static String LIZLLL(RankTypeV2 rankTypeV2) {
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            return C497740JfY.LJIJI(2131855499);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
            return C497740JfY.LJIJI(2131855501);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            return C497740JfY.LJIJI(2131855502);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
            return C497740JfY.LJIJI(2131855500);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            return C497740JfY.LJIJI(2131855503);
        }
        return "";
    }

    public static long LIZ(long j, RankTypeV2 rankTypeV2) {
        if (LiveRankStickerAlignIdSetting.INSTANCE.getValue()) {
            return ((long) rankTypeV2.type) + 18011411000L;
        }
        return j;
    }

    public static InterfaceC1846850y9z LIZIZ(DataChannel dataChannel, RankTypeV2 rankTypeV2) {
        if (dataChannel == null || rankTypeV2 == null) {
            return null;
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            return (InterfaceC1846850y9z) dataChannel.gg0(C1119080fEA.class);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
            return (InterfaceC1846850y9z) dataChannel.gg0(C1119100fEC.class);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            return (InterfaceC1846850y9z) dataChannel.gg0(C1119070fE9.class);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            return (InterfaceC1846850y9z) dataChannel.gg0(C1119110fED.class);
        }
        if (!Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
            return null;
        }
        return (InterfaceC1846850y9z) dataChannel.gg0(C1119090fEB.class);
    }

    public static void LJFF(C1119420fEi c1119420fEi, C1847020yAG c1847020yAG) {
        C1846810y9v c1846810y9v;
        if (c1119420fEi != null && (c1846810y9v = c1119420fEi.LJIIIIZZ) != null && c1846810y9v.LIZ == 2 && c1847020yAG != null && c1847020yAG.LJFF) {
            c1847020yAG.LIZ();
        }
    }

    public static void LJI(RankTypeV2 rankTypeV2, boolean z) {
        if (rankTypeV2 == null) {
            return;
        }
        if (z) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1094280eaA.Md;
            Boolean bool = Boolean.FALSE;
            c20337914i1.LJFF(bool);
            InterfaceC1094280eaA.Qd.LJFF(bool);
            InterfaceC1094280eaA.Nd.LJFF(bool);
            InterfaceC1106030et7.B9.LJFF(bool);
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            InterfaceC1094280eaA.Md.LJFF(Boolean.valueOf(z));
            return;
        }
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
            InterfaceC1094280eaA.Qd.LJFF(Boolean.valueOf(z));
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            InterfaceC1106030et7.B9.LJFF(Boolean.valueOf(z));
        } else {
            if (!Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
                return;
            }
            InterfaceC1094280eaA.Nd.LJFF(Boolean.valueOf(z));
        }
    }

    public static void LJ(Context context, final DataChannel dataChannel, final RankTypeV2 rankTypeV2, final InterfaceC1846850y9z interfaceC1846850y9z, final Function1 function1) {
        boolean z = !InterfaceC1106030et7.D9.LIZIZ().booleanValue();
        final RankTypeV2 rankTypeV2LJIIIZ = C1846800y9u.LJIIIZ(dataChannel);
        if (rankTypeV2LJIIIZ != null && z) {
            if (context != null && rankTypeV2 != null && dataChannel != null) {
                final C013C c013c = new C013C();
                C1119220fEO c1119220fEO = new C1119220fEO(new AwS584S0100000_5(c013c, 1106));
                String strLJIJJ = C497740JfY.LJIJJ(2131855515, LIZLLL(rankTypeV2));
                C782110Um9 c782110Um9 = new C782110Um9(context);
                c782110Um9.LJIIZILJ(2131855516);
                c782110Um9.LJIIIZ(strLJIJJ);
                c782110Um9.LJIJJ = c1119220fEO;
                c782110Um9.LJIILIIL(2131855518, new InterfaceC743640TFa() { // from class: X.0fEL
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
                        boolean z2 = c013c.element;
                        c1119210fEN.getClass();
                        InterfaceC1106030et7.D9.LJFF(Boolean.valueOf(z2));
                        Function1<InterfaceC1846850y9z, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(interfaceC1846850y9z);
                        }
                        C1119410fEh.LJFF(dataChannel, rankTypeV2LJIIIZ, rankTypeV2, "switch", "switch_show");
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIIJ(2131855517, new AcS188S0300000_17(dataChannel, rankTypeV2LJIIIZ, rankTypeV2, 2));
                c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0fEM
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        C1119410fEh.LJFF(dataChannel, rankTypeV2LJIIIZ, rankTypeV2, "cancel", "switch_show");
                    }
                };
                C786410Ut5.E4(c782110Um9.LIZ());
                C1119410fEh.LJI(dataChannel, rankTypeV2LJIIIZ, rankTypeV2, "switch_show");
                return;
            }
            return;
        }
        function1.invoke(interfaceC1846850y9z);
    }
}
