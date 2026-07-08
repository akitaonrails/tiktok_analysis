package X;

import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.fcpanchor.access.FeedMultiAnchorAbility;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009130cMp {
    public static final C698300RaG LIZJ(AnoleComponentAnimationModel anoleComponentAnimationModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateValueAnimator,duration = ");
        sbLIZ.append(anoleComponentAnimationModel.duration);
        sbLIZ.append(",interpolator = ");
        sbLIZ.append(anoleComponentAnimationModel.curve);
        C2188811AlT.LIZIZ(sbLIZ);
        Interpolator interpolatorLIZ = C1016660cYy.LIZ(anoleComponentAnimationModel.curve);
        if (interpolatorLIZ != null) {
            return new C698300RaG(anoleComponentAnimationModel.duration, interpolatorLIZ);
        }
        return null;
    }

    public static final EnumC706820Ro0 LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_ALL_INTERACT.getInteractName())) {
            return EnumC706820Ro0.ALL;
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
            return EnumC706820Ro0.LEFT_AREA;
        }
        if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName())) {
            return null;
        }
        return EnumC706820Ro0.RIGHT_AREA;
    }

    public static final void LJ(CommerceInteractionComponent commerceInteractionComponent, C1009100cMm c1009100cMm) {
        List list;
        commerceInteractionComponent.LLLIIIIL = true;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<AnoleComponentBusinessAppearModel> it2 = c1009100cMm.LIZ.iterator();
        while (it2.hasNext()) {
            LIZ(commerceInteractionComponent, it2.next(), linkedHashMap);
        }
        Iterator<AnoleComponentBusinessAppearModel> it3 = c1009100cMm.LIZIZ.iterator();
        while (it3.hasNext()) {
            LIZ(commerceInteractionComponent, it3.next(), linkedHashMap2);
        }
        Object obj = linkedHashMap.get("left_container");
        Object obj2 = linkedHashMap2.get("left_container");
        if (obj != null && obj2 != null) {
            List list2 = (List) obj2;
            Iterator it4 = ((List) obj).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (Intrinsics.LJFF(((C698380RaO) next).LIZ, "left_container")) {
                    if (next == null) {
                        break;
                    }
                }
            }
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next2 = it5.next();
                if (Intrinsics.LJFF(((C698380RaO) next2).LIZ, "left_container")) {
                    if (next2 != null && (list = (List) linkedHashMap.get("left_container")) != null) {
                        list.add(new C698380RaO("left_container_anole_slot", null));
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check toShowComponentList = ");
        sbLIZ.append(linkedHashMap);
        sbLIZ.append(", toHideComponentList = ");
        sbLIZ.append(linkedHashMap2);
        C2188811AlT.LIZIZ(sbLIZ);
        InteractAreaCommonAbility interactAreaCommonAbilityKp = commerceInteractionComponent.kp();
        if (interactAreaCommonAbilityKp != null) {
            interactAreaCommonAbilityKp.fx2(linkedHashMap, linkedHashMap2, (C1AV2) C1AVH.LJJIIJZLJL.getValue());
        }
    }

    public static final String LJFF(CommerceInteractionComponent commerceInteractionComponent, String str) {
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName())) {
            return "left_container";
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName())) {
            return "right_container";
        }
        if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_BOTTOM_INTERACT.getInteractName())) {
            return "bottom_container";
        }
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_MUSIC.getInteractName())) {
            return "left_container_music_info";
        }
        Object obj = null;
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_USER_NAME.getInteractName())) {
            C724270Sb3 c724270Sb3 = commerceInteractionComponent.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            if (AwemeExtKt.isPhotoMode(((VideoItemParams) obj).getAweme())) {
                return "title_container";
            }
            return "left_container_author";
        }
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_DES.getInteractName())) {
            return "left_container_description";
        }
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_LABEL.getInteractName())) {
            if (C693680RIw.LIZ()) {
                return "bottom_tag_container";
            }
            return "ad_desc_label_layout";
        }
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_CTA.getInteractName())) {
            return "native_ad_bottom_label_view";
        }
        if (Intrinsics.LJFF(str, EnumC1009170cMt.ANOLE_LEFT_INTERACT_SUB_ANCHOR.getInteractName())) {
            FeedMultiAnchorAbility feedMultiAnchorAbility = (FeedMultiAnchorAbility) commerceInteractionComponent.LLJLILLLLZIIL.getValue();
            if (feedMultiAnchorAbility == null) {
                return null;
            }
            return feedMultiAnchorAbility.bc0();
        }
        if (Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_AVATAR.getInteractName())) {
            return "right_container_avatar";
        }
        if (Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_LIKE.getInteractName())) {
            return "right_container_digg";
        }
        if (Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_COMMENT.getInteractName())) {
            return "right_container_comment";
        }
        if (Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_SHARE.getInteractName())) {
            return "right_container_share";
        }
        if (Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_MUSIC.getInteractName())) {
            return "right_container_music_cover";
        }
        if (!Intrinsics.LJFF(str, EnumC1009180cMu.ANOLE_RIGHT_INTERACT_SUB_FAV.getInteractName())) {
            return null;
        }
        return "right_container_favorite";
    }

    public static final void LIZ(CommerceInteractionComponent commerceInteractionComponent, AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel, Map<String, List<C698380RaO>> map) {
        String interactName;
        AnoleComponentAnimationModel anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels;
        C698300RaG c698300RaGLIZJ = null;
        if (anoleComponentAnimationModel != null) {
            c698300RaGLIZJ = LIZJ(anoleComponentAnimationModel);
        }
        List<String> list = anoleComponentBusinessAppearModel.businessComponents;
        if (list != null) {
            for (String str : list) {
                if (((List) C1009190cMv.LIZ.getValue()).contains(str)) {
                    interactName = str;
                } else if (((List) C1009190cMv.LIZIZ.getValue()).contains(str)) {
                    interactName = EnumC1009140cMq.ANOLE_LEFT_INTERACT.getInteractName();
                } else if (((List) C1009190cMv.LIZJ.getValue()).contains(str)) {
                    interactName = EnumC1009140cMq.ANOLE_RIGHT_INTERACT.getInteractName();
                }
                if (interactName != null) {
                    String strLJFF = LJFF(commerceInteractionComponent, interactName);
                    String strLJFF2 = LJFF(commerceInteractionComponent, str);
                    if (strLJFF != null && strLJFF2 != null) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                        if (linkedHashMap.get(strLJFF) == null) {
                            map.put(strLJFF, new ArrayList());
                        }
                        List list2 = (List) linkedHashMap.get(strLJFF);
                        if (list2 != null) {
                            list2.add(new C698380RaO(strLJFF2, c698300RaGLIZJ));
                        }
                    }
                }
            }
        }
    }

    public static final void LIZIZ(AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel, List<C1009210cMx> list, boolean z) {
        List<String> list2 = anoleComponentBusinessAppearModel.businessComponents;
        if (list2 != null) {
            for (String str : list2) {
                EnumC1009140cMq[] enumC1009140cMqArrValues = EnumC1009140cMq.values();
                int length = enumC1009140cMqArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (Intrinsics.LJFF(enumC1009140cMqArrValues[i].getInteractName(), str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isAnoleContainerFlag name = ");
                        sbLIZ.append(str);
                        C2188811AlT.LIZIZ(sbLIZ);
                        AnoleComponentAnimationModel anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels;
                        if (anoleComponentAnimationModel != null) {
                            ((ArrayList) list).add(new C1009210cMx(str, LIZJ(anoleComponentAnimationModel), z));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
