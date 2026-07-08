package X;

import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerRemoveEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.model.message.EffectControlMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UEH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEH implements C0UAH {
    public static DataChannel LIZIZ;
    public static boolean LIZJ;
    public static LiveEffect LIZLLL;
    public static LiveEffect LJ;
    public static String LJFF;
    public static EffectControlMessage LJI;
    public static long LJII;
    public static Boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static InterfaceC769000UEo LJIIJJI;
    public static String LJIIL;
    public static final C0UEH LIZ = new C0UEH();
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(384));

    public static void LIZIZ() {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String str = C0UD4.LJ;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(c0u78LIZ.qr(str));
        C0UA1.LIZ().lr(str);
        C924790aAn.LIZLLL().LJFF = null;
        C0UC5.LIZ.LJIIJ(liveEffect, LIZIZ);
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestSelectedStickerEvent.class, new C0UCF(null, "liveinteract", "", false));
        }
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAllCache, source: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = false;
        LIZLLL = null;
        LJ = null;
        LJFF = null;
        LJI = null;
    }

    public static void LJ(EffectControlMessage effectControlMessage, InterfaceC769000UEo interfaceC769000UEo) {
        String resourceId;
        String name;
        int i = effectControlMessage.controlType;
        String str = "multi_guest_countdownforall";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (LJ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("use cached IM, needResumeMultiGuestEffect id is ");
                        LiveEffect liveEffect = LJ;
                        if (liveEffect != null) {
                            resourceId = liveEffect.getResourceId();
                        } else {
                            resourceId = null;
                        }
                        sbLIZ.append(resourceId);
                        sbLIZ.append(", name is ");
                        LiveEffect liveEffect2 = LJ;
                        if (liveEffect2 != null) {
                            name = liveEffect2.getName();
                        } else {
                            name = null;
                        }
                        sbLIZ.append(name);
                        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
                        LiveEffect liveEffect3 = LJ;
                        if (effectControlMessage.scene != 1) {
                            str = "";
                        }
                        if (liveEffect3 != null) {
                            LJFF(liveEffect3, interfaceC769000UEo, new AwS126S1100000_12(liveEffect3, str, 9));
                        }
                    } else if (LJFF != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("use cached IM, needResumeMultiGuestEffectId is ");
                        sbLIZ2.append(LJFF);
                        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ2));
                        String str2 = LJFF;
                        if (effectControlMessage.scene != 1) {
                            str = "";
                        }
                        if (str2 != null && str2.length() != 0) {
                            LIZLLL(str, str2, new AwS126S1100000_12(interfaceC769000UEo, str, 10));
                        }
                    } else if (LIZJ && LIZLLL == null) {
                        C20441214yg.LJIIIZ("EffectControlMessage", "use cached IM, originMultiGuestEffect is null, the guest did not use effect at the beginning, cancel all effects.");
                        interfaceC769000UEo.lr(C0UD4.LJ);
                        DataChannel dataChannel = LIZIZ;
                        if (dataChannel != null) {
                            dataChannel.FQ2(GuestManagePanelStickerRemoveEvent.class);
                        }
                    }
                    LJIIL = null;
                    LIZJ("guest manage panel, RESUME IM");
                    return;
                }
                return;
            }
            C20441214yg.LJIIIZ("EffectControlMessage", "use cached IM, cancelEffectForGuest");
            LJIIL = null;
            interfaceC769000UEo.lr(C0UD4.LJ);
            DataChannel dataChannel2 = LIZIZ;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.FQ2(GuestManagePanelStickerRemoveEvent.class);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("use cached IM, replaceEffectForGuest, resourceId is ");
        sbLIZ3.append(effectControlMessage.resourceId);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ3));
        String str3 = effectControlMessage.resourceId;
        LJIIL = str3;
        boolean z = effectControlMessage.replaceResumeEffect;
        if (effectControlMessage.scene != 1) {
            str = "";
        }
        if (str3 != null) {
            LIZ(str3, z, str, interfaceC769000UEo, AFwS245S0000000_12.get$arr$(185));
        }
        LJI = null;
    }

    public static void LIZLLL(String str, String str2, Function1 function1) {
        LJII = C500260Jjc.LJJLIIIJ(LIZIZ);
        C01GW c01gw = LJIILIIL;
        ((C0UEI) c01gw.getValue()).LIZLLL = str;
        ((C0UEI) c01gw.getValue()).LJ = function1;
        ((C0UEI) c01gw.getValue()).LIZJ = C500260Jjc.LJJLIIIJ(LIZIZ);
        C766720U5u.LJII(C0UD4.LIZIZ, str2, (C0UEI) c01gw.getValue());
    }

    public static void LJFF(LiveEffect liveEffect, InterfaceC769000UEo interfaceC769000UEo, Function1 function1) {
        Boolean boolValueOf;
        C1081600eFi c1081600eFi;
        if (!C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.LJJJJLL())) && !C767250U7v.LIZLLL(liveEffect) && !C767250U7v.LJ(liveEffect) && !C0U7C.LJIILLIIL(liveEffect)) {
            if (liveEffect.LLJZ()) {
                EnumC768840UDy enumC768840UDy = (EnumC768840UDy) DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class);
                Boolean boolValueOf2 = null;
                if (enumC768840UDy != null) {
                    boolValueOf = Boolean.valueOf(enumC768840UDy.isLink());
                } else {
                    boolValueOf = null;
                }
                boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                DataChannel dataChannel = LIZIZ;
                if (dataChannel != null && (c1081600eFi = (C1081600eFi) dataChannel.gg0(MultiLiveRTCLayoutChannel.class)) != null) {
                    boolValueOf2 = Boolean.valueOf(c1081600eFi.LIZ());
                }
                boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf2);
                if (zLJJJI || zLJJIFFI) {
                    return;
                }
            }
            String str = C0UD4.LJ;
            LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLL(interfaceC769000UEo.qr(str));
            if (liveEffect2 == null) {
                interfaceC769000UEo.kr(liveEffect, str);
            } else if (!Intrinsics.LJFF(liveEffect, liveEffect2)) {
                interfaceC769000UEo.Gr(str, liveEffect2, liveEffect);
            }
            function1.invoke(liveEffect2);
        }
    }

    public static void LIZ(String str, boolean z, String str2, InterfaceC769000UEo interfaceC769000UEo, Function1 function1) {
        String resourceId;
        String name;
        if (str.length() == 0) {
            return;
        }
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(interfaceC769000UEo.qr(C0UD4.LJ));
        if (liveEffect == null) {
            liveEffect = C924790aAn.LIZLLL().LJFF;
        }
        if (!LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guest is using effect, current resourceId is ");
            sbLIZ.append(str);
            sbLIZ.append(", effect name is ");
            if (liveEffect != null) {
                name = liveEffect.getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL = liveEffect;
            LIZJ = true;
        }
        if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null && resourceId.equals(str)) {
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("replaceResumeEffect is true, need resume resourceId is ");
                sbLIZ2.append(str);
                C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ2));
                LJ = liveEffect;
                return;
            }
            return;
        }
        LIZLLL(str2, str, new C0UEG(z, liveEffect, interfaceC769000UEo, str2, function1));
    }
}
