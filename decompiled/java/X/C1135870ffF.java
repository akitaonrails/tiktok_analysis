package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135870ffF {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU == null) {
            return -1L;
        }
        if (interfaceC1136020ffU.LJJI().LJIIIZ > 0) {
            return interfaceC1136020ffU.getMessageId() - ((long) interfaceC1136020ffU.LJJI().LJIIJ);
        }
        return interfaceC1136020ffU.getMessageId();
    }

    public static int LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU == null) {
            return 0;
        }
        return interfaceC1136020ffU.getRepeatCount() * LIZJ(interfaceC1136020ffU);
    }

    public static int LIZJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ != null) {
                return interfaceC1136850fgpLJIJ.getDiamondCount();
            }
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ != null) {
                return interfaceC1136160ffiLJIIIIZZ.getDiamondCount();
            }
            return 0;
        }
        return 0;
    }

    public static int LIZLLL(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ != null) {
                return interfaceC1136850fgpLJIJ.getDuration();
            }
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ != null) {
                return interfaceC1136160ffiLJIIIIZZ.getDuration();
            }
            return 0;
        }
        return 0;
    }

    public static String LJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        String name;
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ == null || (name = interfaceC1136850fgpLJIJ.getName()) == null) {
                InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
                if (interfaceC1136160ffiLJIIIIZZ != null) {
                    return interfaceC1136160ffiLJIIIIZZ.getName();
                }
                return "";
            }
            return name;
        }
        return "";
    }

    public static long LJFF(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ != null) {
                return interfaceC1136850fgpLJIJ.LIZ();
            }
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ != null) {
                return interfaceC1136160ffiLJIIIIZZ.LIZ();
            }
            return 0L;
        }
        return 0L;
    }

    public static int LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ != null) {
                return interfaceC1136850fgpLJIJ.LIZJ();
            }
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ != null) {
                return interfaceC1136160ffiLJIIIIZZ.LIZJ();
            }
            return 0;
        }
        return 0;
    }

    public static int LJII(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null && interfaceC1136020ffU.LJIIIIZZ() != null) {
            InterfaceC1136850fgp interfaceC1136850fgpLJIJ = interfaceC1136020ffU.LJIJ();
            if (interfaceC1136850fgpLJIJ != null) {
                return interfaceC1136850fgpLJIJ.getType();
            }
            InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
            if (interfaceC1136160ffiLJIIIIZZ != null) {
                return interfaceC1136160ffiLJIIIIZZ.getType();
            }
            return 0;
        }
        return 0;
    }

    public static int LJIIIIZZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        Boolean boolValueOf;
        if (interfaceC1136020ffU != null) {
            boolValueOf = Boolean.valueOf(interfaceC1136020ffU.LJFF());
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf) ? 1 : 0;
    }

    public static boolean LJIIJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        AssetsModel assetsModelLJIILLIIL;
        if (!LJIILIIL(interfaceC1136020ffU) || interfaceC1136020ffU == null || (assetsModelLJIILLIIL = LJIILLIIL(interfaceC1136020ffU)) == null || assetsModelLJIILLIIL.resourceType != AssetsModel.RESOURCE_TYPE_MP4) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(InterfaceC1136020ffU interfaceC1136020ffU) {
        Integer numValueOf;
        if (!LJIILIIL(interfaceC1136020ffU)) {
            if (interfaceC1136020ffU != null) {
                numValueOf = Integer.valueOf(LJII(interfaceC1136020ffU));
            } else {
                numValueOf = null;
            }
            if (!LJIILJJIL(numValueOf)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LJIILIIL(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU == null) {
            return false;
        }
        if (interfaceC1136020ffU.LJJI().LIZJ == EnumC743790TFp.VIDEO_ONLY) {
            return true;
        }
        if (interfaceC1136020ffU.LJJI().LIZJ == EnumC743790TFp.TRAY_ONLY) {
            return false;
        }
        return LJIILL(Integer.valueOf(LJII(interfaceC1136020ffU)));
    }

    public static boolean LJIILJJIL(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 4 || num.intValue() == 21 || num.intValue() == 22) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIILL(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static AssetsModel LJIILLIIL(InterfaceC1136020ffU interfaceC1136020ffU) {
        GiftEffect giftEffectLJIJI;
        List<AssetsModel> list;
        if (interfaceC1136020ffU == null) {
            return null;
        }
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII == null || (giftEffectLJIJI = interfaceC1136230ffpLJJII.LJIJI()) == null || (list = giftEffectLJIJI.assets) == null) {
                return null;
            }
            return (AssetsModel) C13LP.LJJJLL(list);
        }
        InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII2 == null) {
            return null;
        }
        return interfaceC1136230ffpLJJII2.LJJ();
    }

    public static boolean LJIIZILJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        C1131800fYg.LIZ.getClass();
        if (C781880Ulm.LJFF || interfaceC1136020ffU == null) {
            return false;
        }
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
        if (interactiveGiftInfoLJJIII != null && (((int) interactiveGiftInfoLJJIII.ignoreComponent) & 1) != 0) {
            return false;
        }
        return true;
    }

    public static User LJIJ(InterfaceC1136800fgk interfaceC1136800fgk) {
        return C1135860ffE.LJ(interfaceC1136800fgk);
    }

    public static long LJIJI(InterfaceC1136020ffU interfaceC1136020ffU) {
        if (interfaceC1136020ffU != null) {
            InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
            if (interfaceC1136800fgkLIZJ != null) {
                Long lValueOf = Long.valueOf(interfaceC1136800fgkLIZJ.getId());
                if (lValueOf.longValue() > 0) {
                    return lValueOf.longValue();
                }
            }
            GiftMonitorInfo giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL();
            if (giftMonitorInfoLJIIL != null) {
                return giftMonitorInfoLJIIL.to_user_id;
            }
            return -1L;
        }
        return -1L;
    }

    public static boolean LJIIIZ(InterfaceC1136020ffU interfaceC1136020ffU, InterfaceC1136020ffU interfaceC1136020ffU2) {
        int i;
        int i2;
        C1135880ffG c1135880ffGLJJI;
        C1135880ffG c1135880ffGLJJI2;
        if (interfaceC1136020ffU != null && (c1135880ffGLJJI2 = interfaceC1136020ffU.LJJI()) != null) {
            i = c1135880ffGLJJI2.LJIIJ;
        } else {
            i = 0;
        }
        if (interfaceC1136020ffU2 != null && (c1135880ffGLJJI = interfaceC1136020ffU2.LJJI()) != null) {
            i2 = c1135880ffGLJJI.LJIIJ;
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(InterfaceC1136020ffU interfaceC1136020ffU, C1135810ff9 c1135810ff9) {
        if (interfaceC1136020ffU != null && c1135810ff9 != null && Intrinsics.LJFF(interfaceC1136020ffU.LJJI().LIZIZ, c1135810ff9.LIZLLL) && !LJIIL(interfaceC1136020ffU)) {
            C1133690fbj.LIZ.getClass();
            if (!C1133690fbj.LJ(c1135810ff9)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
