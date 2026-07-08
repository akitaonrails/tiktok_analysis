package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AIDubbing;
import com.ss.android.ugc.aweme.creative.model.PhotoPublishConfigurationModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.edit.TextPublishUploadModel;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ImagePostData;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoPostContent;
import com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService;
import com.ss.android.ugc.aweme.social.creation.api.addtostory.IAddToStoryService;
import com.ss.android.ugc.aweme.social.creation.api.edit.exp.SocialEffectNotificationExp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import lth.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mo1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410390mo1 {
    public static final void LIZ(C1410350mnx c1410350mnx) {
        C1432270nNJ c1432270nNJLIZ;
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0msW
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "LegacyCAFieldsBuilder";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:134:0x02e2  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x02f7  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0316  */
            /* JADX WARN: Removed duplicated region for block: B:341:0x086c  */
            /* JADX WARN: Removed duplicated region for block: B:410:0x0a55  */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r0v43 */
            @Override // X.InterfaceC1410340mnw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Map<java.lang.String, java.lang.String> LIZ(X.C1410370mnz r34) {
                /*
                    Method dump skipped, instruction units count: 2831
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1413180msW.LIZ(X.0mnz):java.util.Map");
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mnt
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "CloudMergeCAFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                Object obj;
                Object next;
                Iterator<Object> it2 = c1410370mnz.LIZLLL.LIZ.iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof AbstractC1405090mfT) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next instanceof AbstractC1405090mfT) {
                    obj = next;
                }
                AbstractC1405090mfT abstractC1405090mfT = (AbstractC1405090mfT) obj;
                if (abstractC1405090mfT != null && (abstractC1405090mfT instanceof C1405100mfU)) {
                    return C2097908Jt.LIZJ(new Pair("video_id_reuse_scene", String.valueOf(((C1405100mfU) abstractC1405090mfT).LIZIZ)));
                }
                return C2097608Jq.LJ();
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mnu
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "TakoCAFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                Map<String, String> map;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                PhotoPublishConfigurationModel photoPublishConfigurationModel = c1410370mnz.LIZ.creativeModel.initialModel.photoPublishConfigurationModel;
                if (photoPublishConfigurationModel != null && (map = photoPublishConfigurationModel.takoCreateAwemeApiParams) != null) {
                    linkedHashMap.putAll(map);
                }
                return linkedHashMap;
            }
        });
        c1410350mnx.LIZIZ(new C378500Esi());
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0MiQ
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "MixStudioFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                MixStickerInfo mixStickerInfo = c1410370mnz.LIZ.creativeModel.mixStickerInfo;
                if (mixStickerInfo != null) {
                    return C2097908Jt.LIZJ(new Pair("imagine_sticker_info", GsonProtectorUtils.toJson(o.LIZIZ, mixStickerInfo)));
                }
                return C2097608Jq.LJ();
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0MEp
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "AILivePhotoFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                VideoPublishEditModel videoPublishEditModel = c1410370mnz.LIZ;
                if (C565160MEo.LIZIZ(videoPublishEditModel) && videoPublishEditModel.getAILivePhotoModel().LJII()) {
                    PromptModel promptModelLIZJ = videoPublishEditModel.getAILivePhotoModel().LIZJ();
                    return C2097908Jt.LIZJ(new Pair("ai_alive_info", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), new AIAliveInfo(promptModelLIZJ.prompt, promptModelLIZJ.LIZJ(), promptModelLIZJ.promptForAlgorithm, promptModelLIZJ.modelReqKey, ""))));
                }
                return C2097608Jq.LJ();
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mo3
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "AITranslationFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                boolean z;
                Object c098200Yq;
                Boolean enableVideoAIDubbing;
                VideoPublishEditModel videoPublishEditModel = c1410370mnz.LIZ;
                IAIDubbingService iAIDubbingService = (IAIDubbingService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IAIDubbingService.class));
                int iIntValue = 1;
                if (iAIDubbingService != null && iAIDubbingService.LIZ(c1410370mnz.LIZ)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return C2097608Jq.LJ();
                }
                try {
                    AIDubbing aIDubbing = videoPublishEditModel.creativeModel.aiDubbing;
                    if (aIDubbing != null && (enableVideoAIDubbing = aIDubbing.getEnableVideoAIDubbing()) != null) {
                        boolean zBooleanValue = enableVideoAIDubbing.booleanValue();
                        Integer enableVideoAIDubbingType = aIDubbing.getEnableVideoAIDubbingType();
                        if (enableVideoAIDubbingType != null) {
                            iIntValue = enableVideoAIDubbingType.intValue();
                        } else if (!zBooleanValue) {
                            iIntValue = 0;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("enable_video_ai_translate", zBooleanValue);
                        jSONObject.put("enable_video_ai_translate_type", iIntValue);
                        c098200Yq = C2097908Jt.LIZJ(new Pair("ecommerce_ai_translate", C786410Ut5.J3(jSONObject)));
                    } else {
                        c098200Yq = C2097608Jq.LJ();
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = C2097608Jq.LJ();
                }
                return (Map) c098200Yq;
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0MFl
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "AIGCBusinessFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                C548590LfN.LIZ.getClass();
                Map<String, String> mapLJIIJJI = C548590LfN.LIZLLL().LJIIJJI(c1410370mnz.LIZ.creativeModel);
                if (mapLJIIJJI == null) {
                    return C2097608Jq.LJ();
                }
                return mapLJIIJJI;
            }
        });
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0EuE
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "AICrtFieldsBuilder";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0379  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0385  */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r0v41, types: [X.13BV] */
            @Override // X.InterfaceC1410340mnw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Map<java.lang.String, java.lang.String> LIZ(X.C1410370mnz r76) {
                /*
                    Method dump skipped, instruction units count: 1179
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C379440EuE.LIZ(X.0mnz):java.util.Map");
            }
        });
        if (SocialEffectNotificationExp.LIZJ) {
            c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0FPv
                @Override // X.InterfaceC1410340mnw
                public final String getTag() {
                    return "SocialEffectMessageBuilder";
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
                @Override // X.InterfaceC1410340mnw
                public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                    ?? arrayList;
                    List<String> listLJ;
                    VideoPublishEditModel videoPublishEditModel = c1410370mnz.LIZ;
                    SocialCameraEditorService socialCameraEditorService = (SocialCameraEditorService) PluggableExtentionKt.pluggableSpi$default(SocialCameraEditorService.class, false, false, false, 14, null);
                    if (socialCameraEditorService != null && (listLJ = socialCameraEditorService.LJ(videoPublishEditModel)) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
                        Iterator<String> it2 = listLJ.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new JSONObject(it2.next()));
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    if (!arrayList.isEmpty()) {
                        return C2097908Jt.LIZJ(new Pair("effect_states", new JSONArray((Collection) arrayList).toString()));
                    }
                    return C2097608Jq.LJ();
                }
            });
        }
        if (((Boolean) C0B03.LIZ.getValue()).booleanValue()) {
            c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0MFj
                @Override // X.InterfaceC1410340mnw
                public final String getTag() {
                    return "VisualSearchFieldsBuilder";
                }

                @Override // X.InterfaceC1410340mnw
                public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                    String str;
                    if (c1410370mnz.LIZ.creativeModel.privacySettingModel.allowVisualSearch) {
                        str = "1";
                    } else {
                        str = "2";
                    }
                    return C2097908Jt.LIZJ(new Pair("enable_visual_search_entry", str));
                }
            });
        }
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ()) {
            c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mo2
                @Override // X.InterfaceC1410340mnw
                public final String getTag() {
                    return "RevealStoryFieldsBuilder";
                }

                @Override // X.InterfaceC1410340mnw
                public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                    RevealStoryCreationModel revealStoryModel;
                    VideoPublishEditModel videoPublishEditModel = c1410370mnz.LIZ;
                    if (C1453840nw6.LIZLLL(videoPublishEditModel)) {
                        TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel.creativeModel.ttStoryUploadModel;
                        if (tTStoryUploadModel != null && (revealStoryModel = tTStoryUploadModel.getRevealStoryModel()) != null) {
                            C1227904rF.LIZ.getClass();
                            return C2097608Jq.LJIIIIZZ(new Pair("aweme_type", "46"), new Pair("reveal_story", GsonProtectorUtils.toJson(C1227904rF.LJ(), revealStoryModel)));
                        }
                        return C2097608Jq.LJ();
                    }
                    return C2097608Jq.LJ();
                }
            });
        }
        IAddToStoryService iAddToStoryService = (IAddToStoryService) PluggableExtentionKt.pluggableSpi$default(IAddToStoryService.class, false, false, false, 14, null);
        if (iAddToStoryService != null && (c1432270nNJLIZ = iAddToStoryService.LIZ()) != null) {
            c1410350mnx.LIZIZ(c1432270nNJLIZ);
        }
        if (C298470Bmv.LIZ()) {
            c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mnv
                @Override // X.InterfaceC1410340mnw
                public final String getTag() {
                    return "StoryMentionShareFieldBuilder";
                }

                @Override // X.InterfaceC1410340mnw
                public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                    return C2097908Jt.LIZJ(new Pair("private_account_allow_reshare_story_type", String.valueOf(c1410370mnz.LIZ.creativeModel.storyModel.getPrivateAccountAllowReshareStoryType())));
                }
            });
        }
        c1410350mnx.LIZIZ(new InterfaceC1410340mnw() { // from class: X.0mo0
            @Override // X.InterfaceC1410340mnw
            public final String getTag() {
                return "TextPublishFieldsBuilder";
            }

            @Override // X.InterfaceC1410340mnw
            public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
                int coverImageHeight;
                String textContent;
                VideoCreation videoCreation = c1410370mnz.LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                VideoPublishEditModel videoPublishEditModel = c1410370mnz.LIZ;
                int coverImageWidth = 0;
                if (videoPublishEditModel.getTextPublishUploadModel() != null) {
                    String coverTextImageUri = videoCreation.getCoverTextImageUri();
                    String str = "";
                    if (coverTextImageUri == null) {
                        coverTextImageUri = "";
                    }
                    TextPublishUploadModel textPublishUploadModel = videoPublishEditModel.creativeModel.textPublishUploadModel;
                    if (textPublishUploadModel != null) {
                        coverImageHeight = textPublishUploadModel.getCoverImageHeight();
                    } else {
                        coverImageHeight = 0;
                    }
                    TextPublishUploadModel textPublishUploadModel2 = videoPublishEditModel.creativeModel.textPublishUploadModel;
                    if (textPublishUploadModel2 != null) {
                        coverImageWidth = textPublishUploadModel2.getCoverImageWidth();
                    }
                    ImagePostData imagePostData = new ImagePostData(coverTextImageUri, coverImageHeight, coverImageWidth, null, null, null);
                    List listSingletonList = Collections.singletonList(imagePostData);
                    float musicVolume = videoPublishEditModel.getMusicVolume() / 2;
                    TextPublishUploadModel textPublishUploadModel3 = videoPublishEditModel.creativeModel.textPublishUploadModel;
                    if (textPublishUploadModel3 != null && (textContent = textPublishUploadModel3.getTextContent()) != null) {
                        str = textContent;
                    }
                    linkedHashMap.put("image_post_content", GsonProtectorUtils.toJson(o.LIZIZ, new PhotoPostContent(listSingletonList, imagePostData, musicVolume, str, C13BV.INSTANCE)));
                }
                return linkedHashMap;
            }
        });
    }
}
