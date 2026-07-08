package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectLoadOptSetting;
import com.bytedance.android.livesdk.model.LastUsedStickerCacheModel;
import com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767750U9t implements C0U86 {
    public static final C767750U9t LIZ = new C767750U9t();
    public static boolean LIZIZ;
    public static LiveEffect LIZJ;
    public static LastUsedStickerCacheModel LIZLLL;
    public static LiveEffect LJ;

    public static int LIZIZ() {
        return C500260Jjc.LJJJI(Boolean.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Sl1())) ? 1 : 0;
    }

    public static void LJFF() {
        InterfaceC766480U4w.LJJJJIZL.LIZJ();
        C20441214yg.LJIIIZ("LastUsedStickerAutoRestoreManager", "null");
    }

    public static boolean LIZJ(LiveEffect liveEffect) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (C767250U7v.LJI(liveEffect)) {
            String resourceId = liveEffect.getResourceId();
            LastUsedStickerCacheModel lastUsedStickerCacheModel = LIZLLL;
            if (lastUsedStickerCacheModel != null) {
                str2 = lastUsedStickerCacheModel.resourceId;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(resourceId, str2)) {
                C768350UCb c768350UCb = C767790U9x.LIZIZ;
                if (c768350UCb != null) {
                    str3 = c768350UCb.LIZ;
                } else {
                    str3 = null;
                }
                LastUsedStickerCacheModel lastUsedStickerCacheModel2 = LIZLLL;
                if (lastUsedStickerCacheModel2 != null) {
                    str4 = lastUsedStickerCacheModel2.subResourceId;
                }
                if (Intrinsics.LJFF(str3, str4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (C767250U7v.LJ(liveEffect)) {
            String strLLILII = liveEffect.LLILII();
            LastUsedStickerCacheModel lastUsedStickerCacheModel3 = LIZLLL;
            if (lastUsedStickerCacheModel3 != null) {
                str = lastUsedStickerCacheModel3.resourceId;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(strLLILII, str)) {
                String resourceId2 = liveEffect.getResourceId();
                LastUsedStickerCacheModel lastUsedStickerCacheModel4 = LIZLLL;
                if (lastUsedStickerCacheModel4 != null) {
                    str4 = lastUsedStickerCacheModel4.subResourceId;
                }
                if (Intrinsics.LJFF(resourceId2, str4)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        String resourceId3 = liveEffect.getResourceId();
        LastUsedStickerCacheModel lastUsedStickerCacheModel5 = LIZLLL;
        if (lastUsedStickerCacheModel5 != null) {
            str4 = lastUsedStickerCacheModel5.resourceId;
        }
        return Intrinsics.LJFF(resourceId3, str4);
    }

    public static void LIZLLL(LiveEffect liveEffect) {
        EnumC767810U9z enumC767810U9z;
        long j;
        if (liveEffect != null) {
            C20337914i1<LastUsedStickerCacheModel> c20337914i1 = InterfaceC766480U4w.LJJJJIZL;
            c20337914i1.LIZIZ().LIZ();
            LastUsedStickerCacheModel lastUsedStickerCacheModelLIZIZ = c20337914i1.LIZIZ();
            if (C767250U7v.LJ(liveEffect)) {
                LastUsedStickerCacheModel lastUsedStickerCacheModelLIZIZ2 = c20337914i1.LIZIZ();
                String strLLILII = liveEffect.LLILII();
                if (strLLILII == null) {
                    strLLILII = "";
                }
                lastUsedStickerCacheModelLIZIZ2.resourceId = strLLILII;
                LastUsedStickerCacheModel lastUsedStickerCacheModelLIZIZ3 = c20337914i1.LIZIZ();
                String strLJJJJI = liveEffect.LJJJJI();
                if (strLJJJJI != null) {
                    j = CastLongProtector.parseLong(strLJJJJI);
                } else {
                    j = 0;
                }
                lastUsedStickerCacheModelLIZIZ3.effectId = j;
                c20337914i1.LIZIZ().subResourceId = liveEffect.getResourceId();
                c20337914i1.LIZIZ().md5 = Collections.singletonList(liveEffect.LLJI());
                enumC767810U9z = EnumC767810U9z.ALBUM;
            } else {
                c20337914i1.LIZIZ().resourceId = liveEffect.getResourceId();
                c20337914i1.LIZIZ().effectId = liveEffect.getEffectId();
                c20337914i1.LIZIZ().md5 = Collections.singletonList(liveEffect.LLJI());
                if (liveEffect.LJJJJLL()) {
                    c20337914i1.LIZIZ().accountType = LIZIZ();
                    enumC767810U9z = EnumC767810U9z.GREEN_SCREEN;
                } else if (C767250U7v.LJI(liveEffect)) {
                    enumC767810U9z = EnumC767810U9z.AVATAR;
                } else {
                    enumC767810U9z = EnumC767810U9z.NORMAL;
                }
            }
            lastUsedStickerCacheModelLIZIZ.stickerType = enumC767810U9z;
            c20337914i1.LIZIZ().categoryId = LJ(liveEffect.LJLL());
            LJFF();
            C20337914i1<LiveEffectAutoRestoreConfig> c20337914i12 = InterfaceC766480U4w.LJJIZ;
            c20337914i12.LJFF(new LiveEffectAutoRestoreConfig("", "", "", "", "", "", ""));
            c20337914i12.LIZJ();
            return;
        }
        C20337914i1<LastUsedStickerCacheModel> c20337914i13 = InterfaceC766480U4w.LJJJJIZL;
        c20337914i13.LIZIZ().LIZ();
        c20337914i13.LIZJ();
    }

    public static String LJ(String str) {
        if (LiveEffectLoadOptSetting.INSTANCE.isEnable()) {
            if (Intrinsics.LJFF(str, "search") || str == null) {
                return "trending";
            }
            return str;
        }
        if (str == null) {
            return "trending";
        }
        return str;
    }

    @Override // X.C0U86
    public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
        String strLJLL;
        LiveEffect.CommerceExtra commerceExtra;
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAdd: ");
        sbLIZ.append(z);
        sbLIZ.append(", panel: ");
        sbLIZ.append(str);
        sbLIZ.append(", tab: ");
        LiveEffect liveEffectLLJZIJLIL = null;
        if (liveEffect != null) {
            strLJLL = liveEffect.LJLL();
        } else {
            strLJLL = null;
        }
        sbLIZ.append(strLJLL);
        sbLIZ.append(" effect: ");
        sbLIZ.append(liveEffect);
        C20441214yg.LIZIZ("LastUsedSticker", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(str, "livebackground")) {
            if (liveEffect != null && (stickerSDKExtraLJLJLLL2 = liveEffect.LJLJLLL()) != null) {
                commerceExtra = stickerSDKExtraLJLJLLL2.commerceExtra;
            } else {
                commerceExtra = null;
            }
            if (commerceExtra == null) {
                if (Intrinsics.LJFF(str, C0UD4.LIZIZ)) {
                    if (liveEffect == null || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null || stickerSDKExtraLJLJLLL.commerceExtra == null) {
                        if (C500260Jjc.LJJIJLIJ()) {
                            LIZIZ = true;
                            if (z && liveEffect != null) {
                                liveEffectLLJZIJLIL = liveEffect.LLJZIJLIL();
                            }
                            LIZJ = liveEffectLLJZIJLIL;
                            C20441214yg.LIZIZ("LastUsedSticker", "isPreview exit");
                            return;
                        }
                        if (C769040UEs.LIZIZ != null) {
                            C20441214yg.LIZIZ("LastUsedSticker", "game exit");
                            return;
                        }
                        if (z) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onChange: ");
                            sbLIZ2.append(liveEffect);
                            C20441214yg.LJIIIZ("LastUsedStickerAutoRestoreManager", C2188811AlT.LIZIZ(sbLIZ2));
                            LIZLLL(liveEffect);
                            return;
                        }
                        C20337914i1<LastUsedStickerCacheModel> c20337914i1 = InterfaceC766480U4w.LJJJJIZL;
                        c20337914i1.LIZIZ().LIZ();
                        c20337914i1.LIZJ();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C20337914i1<LastUsedStickerCacheModel> c20337914i12 = InterfaceC766480U4w.LJJJJIZL;
        c20337914i12.LIZIZ().LIZ();
        c20337914i12.LIZJ();
    }
}
