package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInteractionEffectEnableSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveAsiaBeautyGenderOpt;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U7C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7C {
    public static C0U7E LIZ;

    public static final LiveEffect LIZIZ(EnumC767550U8z enumC767550U8z) {
        if (!LiveEffectStructureOptSetting.INSTANCE.enable()) {
            if (enumC767550U8z == EnumC767550U8z.NONE) {
                return C767250U7v.LIZ();
            }
            return new LiveEffectOld();
        }
        switch (C767540U8y.LIZ[enumC767550U8z.ordinal()]) {
            case 1:
                C0U7E c0u7e = LIZ;
                if (c0u7e != null) {
                    return c0u7e;
                }
                C0U7E c0u7e2 = new C0U7E();
                c0u7e2.LJFF = C497740JfY.LJIJI(2131841685);
                LIZ = c0u7e2;
                return c0u7e2;
            case 2:
                return new C0U7F();
            case 3:
                return new C0U7D();
            case 4:
            case 5:
            case 6:
                return new C0UEP();
            default:
                return new C0UEP();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<LiveEffect> LIZJ(List<? extends LiveEffect> list) {
        if (!LiveInteractionEffectEnableSetting.INSTANCE.inExperiment()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (LJIJ((LiveEffect) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    public static final List<LiveEffect> LIZLLL(Iterable<? extends LiveEffect> iterable) {
        return LJ(LJI(LJFF(iterable)));
    }

    public static final List<LiveEffect> LJ(List<? extends LiveEffect> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public static final List<LiveEffect> LJFF(Iterable<? extends LiveEffect> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LiveEffect liveEffect : iterable) {
            C767780U9w c767780U9w = C767780U9w.LIZ;
            if (!C767780U9w.LIZIZ(liveEffect)) {
                arrayList.add(liveEffect);
            }
        }
        return arrayList;
    }

    public static final List<LiveEffect> LJI(List<? extends LiveEffect> list) {
        Integer num;
        Boolean boolValueOf;
        boolean z;
        AnchorLevelPermission anchorLevelPermission;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            LiveEffect liveEffect = (LiveEffect) obj;
            if (C500260Jjc.LJJIJLIJ()) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                C754060Ti0 c754060Ti0 = (C754060Ti0) dataChannelGlobal.gg0(C931320aLK.class);
                if (c754060Ti0 == null || c754060Ti0.LIZ != 0 || (num = (Integer) dataChannelGlobal.gg0(C930680aKI.class)) == null || num.intValue() != 2 || !liveEffect.LJJJI()) {
                    arrayList.add(obj);
                }
            } else {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                    if (roomAuthStatus != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.effects == 0 && room.cppVersion == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = null;
                }
                if (!C500260Jjc.LJJJI(boolValueOf) || !liveEffect.LJJJI()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static final int LJII(Integer num) {
        if (LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
            if (!InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue()) {
                return -1;
            }
            C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LJJI;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            if ((numLIZIZ == null || numLIZIZ.intValue() != -1) && (num == null || c20337914i1.LIZIZ().intValue() < num.intValue())) {
                return c20337914i1.LIZIZ().intValue();
            }
        } else {
            C20337914i1<Integer> c20337914i12 = InterfaceC766480U4w.LJJI;
            Integer numLIZIZ2 = c20337914i12.LIZIZ();
            if ((numLIZIZ2 == null || numLIZIZ2.intValue() != -1) && (num == null || c20337914i12.LIZIZ().intValue() < num.intValue())) {
                return c20337914i12.LIZIZ().intValue();
            }
        }
        return 0;
    }

    public static final List<LiveEffect> LJIIIIZZ(List<? extends LiveEffect> list) {
        ArrayList arrayList = new ArrayList();
        for (LiveEffect liveEffect : list) {
            LiveEffect liveEffect2 = liveEffect;
            if (!LJIILJJIL(liveEffect2) && !liveEffect2.LJJIJIIJI() && (!liveEffect2.LJIILIIL() || (liveEffect2.LJIILIIL() && C500260Jjc.LJJJI(Boolean.valueOf(liveEffect2.LJLJLJ()))))) {
                arrayList.add(liveEffect);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            boolean z = false;
            for (LiveEffect.ComposerConfig composerConfig : ((LiveEffect) obj).LJJJZ()) {
                composerConfig.LIZ = composerConfig.LIZIZ;
                if (composerConfig.defaultValue != 0) {
                    z = true;
                }
            }
            if (z) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final float LJIIIZ(LiveEffect liveEffect) {
        String str;
        if (liveEffect.LJJIJIIJI()) {
            return 0.0f;
        }
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String resourceId = liveEffect.getResourceId();
        LiveEffect.ComposerConfig composerConfigLJIIJ = LJIIJ(liveEffect);
        if (composerConfigLJIIJ == null || (str = composerConfigLJIIJ.tag) == null) {
            str = "";
        }
        Float fLJIJ = c0u78LIZ.LJIJ(resourceId, str);
        if (fLJIJ == null) {
            return 0.0f;
        }
        return fLJIJ.floatValue();
    }

    public static final LiveEffect.ComposerConfig LJIIJ(LiveEffect liveEffect) {
        LiveEffect.ComposerConfig next;
        LiveEffect.ComposerConfig next2;
        if (liveEffect.LLI() && LiveAsiaBeautyGenderOpt.INSTANCE.enable()) {
            String strLIZ = InterfaceC766480U4w.LJJJJZI.LIZ();
            if (Intrinsics.LJFF(strLIZ, EnumC770010UIl.MALE.value)) {
                Iterator<LiveEffect.ComposerConfig> it2 = liveEffect.LJJJZ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (u.LJIIZILJ(next2.tag, "male", true)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                LiveEffect.ComposerConfig composerConfig = next2;
                if (composerConfig != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getRealBeautyConfig: ");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(", ");
                    sbLIZ.append(composerConfig.LIZ());
                    C20441214yg.LJ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ));
                    return composerConfig;
                }
            } else {
                Iterator<LiveEffect.ComposerConfig> it3 = liveEffect.LJJJZ().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (!u.LJIIZILJ(next.tag, "_male", true)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect.ComposerConfig composerConfig2 = next;
                if (composerConfig2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getRealBeautyConfig: ");
                    sbLIZ2.append(strLIZ);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(composerConfig2.LIZ());
                    C20441214yg.LJ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ2));
                    return composerConfig2;
                }
            }
            LiveEffect.ComposerConfig composerConfig3 = (LiveEffect.ComposerConfig) C13LP.LJJJLL(liveEffect.LJJJZ());
            if (composerConfig3 == null) {
                return null;
            }
            C20441214yg.LJ("BeautyGenderDetect", "getRealBeautyConfig: " + strLIZ + ", firstOrNull(), " + composerConfig3.LIZ());
            return composerConfig3;
        }
        LiveEffect.ComposerConfig composerConfig4 = (LiveEffect.ComposerConfig) C13LP.LJJJLL(liveEffect.LJJJZ());
        if (composerConfig4 == null) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("firstOrNull(), ");
        sbLIZ3.append(composerConfig4.LIZ());
        C20441214yg.LJ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ3));
        return composerConfig4;
    }

    public static final boolean LJIILIIL(LiveEffect liveEffect) {
        List<LiveEffect> listLL;
        List<LiveEffect> listLL2;
        if (!C767250U7v.LIZLLL(liveEffect) || liveEffect == null || (listLL = liveEffect.LL()) == null || listLL.isEmpty()) {
            return false;
        }
        if (liveEffect != null && (listLL2 = liveEffect.LL()) != null) {
            Iterator<LiveEffect> it2 = listLL2.iterator();
            while (it2.hasNext()) {
                if (!C766720U5u.LJIILLIIL(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LJIILJJIL(LiveEffect liveEffect) {
        if (liveEffect.LJJL() == 1 && !C086I.LIZIZ(liveEffect.LL())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(LiveEffect liveEffect) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        if (liveEffect != null && (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) != null) {
            return stickerSDKExtraLJLJLLL.isAvatar;
        }
        return false;
    }

    public static final boolean LJIJ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (!LiveInteractionEffectEnableSetting.INSTANCE.inExperiment() && liveEffect.LLJJJ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(LiveEffect liveEffect) {
        Boolean boolValueOf;
        List<String> listLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Boolean boolValueOf2 = null;
        if (liveEffect != null && (listLIZJ = liveEffect.LIZJ()) != null) {
            boolValueOf = Boolean.valueOf(listLIZJ.contains("TouchGes"));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", ");
        if (liveEffect != null) {
            boolValueOf2 = Boolean.valueOf(liveEffect.LLJJI());
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(", ");
        sbLIZ.append(!C760060Trg.LIZ(liveEffect));
        C20441214yg.LIZIZ("EffectMonitor#checkMG", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect == null) {
            return false;
        }
        if (MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable()) {
            List<String> listLIZJ2 = liveEffect.LIZJ();
            if ((listLIZJ2 != null && listLIZJ2.contains("TouchGes")) || !liveEffect.LLJJI() || C760060Trg.LIZ(liveEffect)) {
                return false;
            }
        } else {
            List<String> listLIZJ3 = liveEffect.LIZJ();
            if ((listLIZJ3 != null && listLIZJ3.contains("TouchGes")) || LJIILLIIL(liveEffect) || !liveEffect.LLJJI() || C760060Trg.LIZ(liveEffect)) {
                return false;
            }
        }
        if (!liveEffect.LLJJJ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (!C767250U7v.LIZLLL(liveEffect) && !LJIILLIIL(liveEffect) && !liveEffect.LJJJJLL()) {
            return false;
        }
        return true;
    }

    public static final void LIZ(LiveEffect liveEffect, String str) {
        String panel = liveEffect.getPanel();
        if (panel == null || panel.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("default: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("EffectMonitor#panelCheck", C2188811AlT.LIZIZ(sbLIZ));
            liveEffect.LJJLJ(str);
        }
    }

    public static final boolean LJIILL(LiveEffect liveEffect, C0U78 c0u78) {
        C0U78 c0u78LIZ;
        Boolean boolValueOf;
        if (c0u78 == null) {
            c0u78LIZ = C0UA1.LIZ();
        } else {
            c0u78LIZ = c0u78;
        }
        boolean z = true;
        if (LJIILJJIL(liveEffect)) {
            List<LiveEffect> listLL = liveEffect.LL();
            if (listLL != null) {
                if (!listLL.isEmpty()) {
                    Iterator<LiveEffect> it2 = listLL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LiveEffect next = it2.next();
                        if (!next.LJJIJIIJI() && !LJIILL(next, c0u78)) {
                            z = false;
                            break;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            return C500260Jjc.LJJJI(boolValueOf);
        }
        if (!liveEffect.LJJIJIIJI()) {
            if (liveEffect.LJJJZ().isEmpty()) {
                if (c0u78LIZ.LJIILL(liveEffect.getFilePath(), "") == -1) {
                    return true;
                }
                return false;
            }
            List<LiveEffect.ComposerConfig> listLJJJZ = liveEffect.LJJJZ();
            if ((listLJJJZ instanceof Collection) && listLJJJZ.isEmpty()) {
                return false;
            }
            Iterator<LiveEffect.ComposerConfig> it3 = listLJJJZ.iterator();
            while (it3.hasNext()) {
                if (c0u78LIZ.LJIILL(liveEffect.getFilePath(), it3.next().tag) == -1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJIIJJI(java.lang.String r6, boolean r7, java.util.List r8) {
        /*
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto Lb
            return r4
        Lb:
            java.lang.String r0 = "beauty"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r6, r0, r4)
            if (r0 == 0) goto L41
            if (r7 == 0) goto L34
            int r2 = r8.size()
            X.14i1<java.lang.Integer> r1 = X.InterfaceC934710aQn.mc
            java.lang.Object r0 = r1.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L33
            if (r0 >= r2) goto L33
            java.lang.Object r0 = r1.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
        L33:
            return r4
        L34:
            int r0 = r8.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = LJII(r0)
            return r4
        L41:
            java.lang.String r5 = "makeup"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r6, r5, r4)
            if (r0 == 0) goto L8d
            X.0U78 r1 = X.C0UA1.LIZ()
            if (r7 == 0) goto L8a
            java.lang.String r0 = "liveguestbeauty"
        L51:
            java.util.List r0 = r1.qr(r0)
            java.util.Iterator r3 = r0.iterator()
        L59:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            java.lang.String r0 = r0.LJLL()
            if (r0 == 0) goto L75
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r0, r5, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L75:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 == 0) goto L59
            if (r1 == 0) goto L8d
            int r1 = r8.indexOf(r1)
            if (r1 < 0) goto L8f
        L83:
            int r0 = r8.size()
            if (r1 >= r0) goto L8f
            return r1
        L8a:
            java.lang.String r0 = X.C0UD4.LJFF
            goto L51
        L8d:
            r1 = 0
            goto L83
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U7C.LJIIJJI(java.lang.String, boolean, java.util.List):int");
    }

    public static final LiveEffect LJIIL(LiveEffect liveEffect, String str, C0U78 c0u78) {
        List<LiveEffect> listLL;
        if (LJIILJJIL(liveEffect) && (listLL = liveEffect.LL()) != null) {
            if (c0u78 == null) {
                c0u78 = C0UA1.LIZ();
            }
            List<LiveEffect> listQr = c0u78.qr(str);
            for (LiveEffect liveEffect2 : listLL) {
                if (listQr.contains(liveEffect2)) {
                    return liveEffect2;
                }
            }
        }
        return null;
    }

    public static void LJIIZILJ(List list, List list2, String str) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            HashMap map = new HashMap();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                map.put(String.valueOf(liveEffect.getEffectId()), liveEffect);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                LiveEffect liveEffect2 = (LiveEffect) it3.next();
                if (C767250U7v.LIZLLL(liveEffect2)) {
                    ArrayList arrayList = new ArrayList();
                    List<String> listLIZ = liveEffect2.LIZ();
                    if (listLIZ != null) {
                        Iterator<String> it4 = listLIZ.iterator();
                        int i = 0;
                        while (it4.hasNext()) {
                            LiveEffect liveEffect3 = (LiveEffect) map.get(it4.next());
                            if (liveEffect3 != null) {
                                liveEffect3.LJJLI(liveEffect2.LJJIJL());
                                liveEffect3.LLILIL(liveEffect2);
                                liveEffect3.LJZ(Integer.valueOf(i));
                                liveEffect3.LJIIJJI(str);
                                liveEffect3.LLJLIL(str);
                                i++;
                                arrayList.add(liveEffect3);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        liveEffect2.LLD(arrayList);
                    }
                }
            }
        }
    }
}
