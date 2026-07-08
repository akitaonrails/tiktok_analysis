package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEmojiSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateFilterBean;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleBackground;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ehs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371780Ehs {
    public static final void LIZLLL(Object obj) {
        if (obj != null) {
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public static final C348460DlM LJ(NLETrack nLETrack) {
        NLESegment mainSegment;
        NLESegmentEmojiSticker nLESegmentEmojiStickerDynamicCast;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
        if (nLETrackSlot == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (nLESegmentEmojiStickerDynamicCast = NLESegmentEmojiSticker.dynamicCast((NLENode) mainSegment)) == null) {
            return null;
        }
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILL = "-1";
        c348460DlM.LIZJ = nLETrackSlot.getTransformZ();
        c348460DlM.LJFF = C363400EMo.LIZJ(nLETrackSlot.getTransformX());
        c348460DlM.LJI = C363400EMo.LIZLLL(nLETrackSlot.getTransformY());
        c348460DlM.LJII = nLETrackSlot.getRotation();
        c348460DlM.LJIIJ = nLETrackSlot.getScale();
        c348460DlM.LJIJJ = nLESegmentEmojiStickerDynamicCast.getutf8Code();
        return c348460DlM;
    }

    public static final ImageFilterInfo LJFF(NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLESegmentFilter nLESegmentFilterDynamicCast;
        String first;
        String second;
        long jLongValue;
        String resourceId;
        NLEStringFloatPair nLEStringFloatPair = null;
        if (nLETrack.getTrackType() != NLETrackType.FILTER || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(mainSegment)) == null) {
            return null;
        }
        ImageFilterInfo imageFilterInfo = new ImageFilterInfo("", null, -1.0f, false, null, false, null, "");
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(LJIIL(nLESegmentFilterDynamicCast.getEffectSDKFilter()));
        C0LE8 c0le8 = C0LE8.LIZ;
        c0le8.getClass();
        C389400FOo c389400FOo = C0LE8.LJFF;
        if (pairLIZJ != null) {
            first = pairLIZJ.getFirst();
            second = pairLIZJ.getSecond();
        } else {
            first = null;
            second = null;
        }
        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
        if (effectLIZIZ == null) {
            c0le8.getClass();
            NLEResourceNode effectSDKFilter = nLESegmentFilterDynamicCast.getEffectSDKFilter();
            if (effectSDKFilter != null) {
                resourceId = effectSDKFilter.getResourceId();
            } else {
                resourceId = null;
            }
            effectLIZIZ = c389400FOo.LIZIZ("colorfilter", resourceId);
            if (effectLIZIZ == null) {
                return null;
            }
        }
        imageFilterInfo.setFilterId(effectLIZIZ.getEffectId());
        imageFilterInfo.setFilterLabel(effectLIZIZ.getName());
        imageFilterInfo.setFilterIntensityRatio(nLESegmentFilterDynamicCast.getIntensity());
        imageFilterInfo.setComposer(false);
        TemplateFilterBean templateFilterBean = new TemplateFilterBean(0L, "", "", "", null);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(effectLIZIZ.getEffectId());
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        templateFilterBean.setEffectId(jLongValue);
        templateFilterBean.setName(effectLIZIZ.getName());
        templateFilterBean.setFilterFolder(effectLIZIZ.getUnzipPath());
        templateFilterBean.setResId(effectLIZIZ.getResourceId());
        templateFilterBean.setExtra(effectLIZIZ.getExtra());
        imageFilterInfo.setFilterBean(templateFilterBean);
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment);
        if (nLESegmentComposerFilterDynamicCast != null) {
            imageFilterInfo.setComposer(true);
            Iterator<NLEStringFloatPair> it2 = nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLEStringFloatPair next = it2.next();
                if (Intrinsics.LJFF(next.getFirst(), "Filter_intensity")) {
                    nLEStringFloatPair = next;
                    break;
                }
            }
            NLEStringFloatPair nLEStringFloatPair2 = nLEStringFloatPair;
            if (nLEStringFloatPair2 != null) {
                imageFilterInfo.setFilterIntensityRatio(nLEStringFloatPair2.getSecond());
            }
        }
        return imageFilterInfo;
    }

    public static final Pair<C348460DlM, Integer> LJI(NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast;
        NLEResourceNode effectSDKFile;
        String first;
        String second;
        String first2;
        String second2 = null;
        if (nLETrack.getTrackType() != NLETrackType.STICKER || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment)) == null || (effectSDKFile = nLESegmentInfoStickerDynamicCast.getEffectSDKFile()) == null) {
            return null;
        }
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(LJIIL(effectSDKFile));
        C0LE8.LIZ.getClass();
        C389400FOo c389400FOo = C0LE8.LJFF;
        if (pairLIZJ != null) {
            first = pairLIZJ.getFirst();
            second = pairLIZJ.getSecond();
        } else {
            first = null;
            second = null;
        }
        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
        if (effectLIZIZ == null) {
            return null;
        }
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIIL = effectLIZIZ.getUnzipPath();
        c348460DlM.LJIILL = effectLIZIZ.getEffect_id();
        c348460DlM.LJIILIIL = (String) C13LP.LJJJLL(effectLIZIZ.getIconUrl().getUrlList());
        if (pairLIZJ != null) {
            first2 = pairLIZJ.getFirst();
        } else {
            first2 = null;
        }
        c348460DlM.LJIILLIIL = first2;
        if (pairLIZJ != null) {
            second2 = pairLIZJ.getSecond();
        }
        c348460DlM.LJIIZILJ = second2;
        c348460DlM.LIZJ = nLETrackSlot.getTransformZ();
        c348460DlM.LJFF = C363400EMo.LIZJ(nLETrackSlot.getTransformX());
        c348460DlM.LJI = C363400EMo.LIZLLL(nLETrackSlot.getTransformY());
        c348460DlM.LJII = nLETrackSlot.getRotation();
        c348460DlM.LJIIJ = nLETrackSlot.getScale();
        return new Pair<>(c348460DlM, Integer.valueOf(effectLIZIZ.getEffectType()));
    }

    public static final Effect LJIIIZ(String str) {
        String first;
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(str);
        C0LE8.LIZ.getClass();
        C389400FOo c389400FOo = C0LE8.LJFF;
        String second = null;
        if (pairLIZJ != null) {
            first = pairLIZJ.getFirst();
            second = pairLIZJ.getSecond();
        } else {
            first = null;
        }
        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
        if (effectLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to fetch effect from ");
            sbLIZ.append(str);
            C385200F8k.LIZ("PhotoTemplate", C2188811AlT.LIZIZ(sbLIZ));
        }
        return effectLIZIZ;
    }

    public static final Pair<Integer, Integer> LJIIJ(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2471909mP.LJ(str, options);
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ImageStickerInfoNewEngine LJIIJJI(SingleImageData singleImageData) {
        ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
        if (stickerInfoNewEngine == null) {
            ImageStickerInfoNewEngine imageStickerInfoNewEngine = new ImageStickerInfoNewEngine(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
            singleImageData.setStickerInfoNewEngine(imageStickerInfoNewEngine);
            return imageStickerInfoNewEngine;
        }
        return stickerInfoNewEngine;
    }

    public static final String LJIIL(NLEResourceNode nLEResourceNode) {
        String extra = nLEResourceNode.getExtra("biz_res_id");
        if (C123100dR.LIZ(extra)) {
            return extra;
        }
        return nLEResourceNode.getResourceId();
    }

    public static final Pair<Effect, TextFontStyleData> LJIILIIL(NLEStyText nLEStyText) {
        String resourceId;
        String first;
        String second;
        NLEResourceNode font = nLEStyText.getFont();
        if (font != null) {
            resourceId = font.getResourceId();
        } else {
            resourceId = null;
        }
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(resourceId);
        C0LE8.LIZ.getClass();
        C389400FOo c389400FOo = C0LE8.LJFF;
        if (pairLIZJ != null) {
            first = pairLIZJ.getFirst();
            second = pairLIZJ.getSecond();
        } else {
            first = null;
            second = null;
        }
        Effect effectLIZIZ = c389400FOo.LIZIZ(first, second);
        TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL("default");
        if (effectLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to fetch font from ");
            sbLIZ.append(nLEStyText);
            C385200F8k.LIZLLL("PhotoTemplate", C2188811AlT.LIZIZ(sbLIZ));
            return new Pair<>(null, textFontStyleDataLJIILL);
        }
        TextFontStyleData textFontStyleData = (TextFontStyleData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), effectLIZIZ.getExtra(), TextFontStyleData.class);
        if (textFontStyleData == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("failed to fetch font from ");
            sbLIZ2.append(effectLIZIZ);
            C385200F8k.LIZLLL("PhotoTemplate", C2188811AlT.LIZIZ(sbLIZ2));
            return new Pair<>(effectLIZIZ, null);
        }
        if (!EffectPlatform.LJJJJLI(effectLIZIZ.getPanel(), false)) {
            C0FI2.LJIJJLI(effectLIZIZ.getPanel()).LJJIJIL(effectLIZIZ);
        } else {
            C0FI2.LJIJJ().LJJIJIL(effectLIZIZ);
        }
        TextFontStyleData textFontStyleDataLJIILL2 = C0FI2.LJIILL(textFontStyleData.fileName);
        if (textFontStyleDataLJIILL2 != null) {
            textFontStyleData = textFontStyleDataLJIILL2;
        }
        return new Pair<>(effectLIZIZ, textFontStyleData);
    }

    public static final TextStyleModel LJIILJJIL(NLEStyText nLEStyText) {
        TextStyleBackground textStyleBackground;
        TextStyleStroke textStyleStroke = null;
        if (nLEStyText.hasBackground() && nLEStyText.getBackground() && nLEStyText.hasBackgroundColor()) {
            textStyleBackground = new TextStyleBackground(LJIIZILJ((int) nLEStyText.getBackgroundColor()), 0.0f, 0.0f, 0.0f);
        } else {
            textStyleBackground = null;
        }
        if (nLEStyText.hasOutline() && nLEStyText.getOutline() && nLEStyText.hasOutlineColor()) {
            textStyleStroke = new TextStyleStroke(LJIIZILJ((int) nLEStyText.getOutlineColor()), 0.071428575f);
        }
        return new TextStyleModel("", "", "", "", LJIIZILJ((int) nLEStyText.getTextColor()), null, textStyleBackground, textStyleStroke, false, "", "");
    }

    public static final boolean LJIILL(NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        if (nLETrack.getTrackType() != NLETrackType.STICKER || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || NLESegmentTextTemplate.dynamicCast(mainSegment) == null) {
            return false;
        }
        return true;
    }

    public static final String LJIIZILJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        sbLIZ.append(Integer.toHexString(i));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZ(C11NJ c11nj, InterfaceC420801kM interfaceC420801kM) {
        if (c11nj != null) {
            c11nj.LIZ(interfaceC420801kM);
        }
    }

    public static final BaseStickerModel LIZIZ(int i, NLETrackSlot nLETrackSlot) {
        int i2 = C1450870nrJ.LIZIZ;
        int i3 = C1450870nrJ.LIZ;
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.TEXT;
        float f = i2;
        float fLIZJ = (C363400EMo.LIZJ(nLETrackSlot.getTransformX()) - 0.5f) * f;
        float f2 = i3;
        float fLIZLLL = (C363400EMo.LIZLLL(nLETrackSlot.getTransformY()) - 0.5f) * f2;
        float f3 = 2;
        return new BaseStickerModel(i, nLETrackSlot.getLayer(), enumC1466150oFx, 0, 0, f / f3, f2 / f3, 0, 0, 0, 0, i2, i3, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, fLIZJ, fLIZLLL, nLETrackSlot.getScale(), -nLETrackSlot.getRotation(), 0.0f, nLETrackSlot.getEndTime(), false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -132126824, 15, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel LJII(com.bytedance.ies.nle.editor_jni.NLETrack r182, float r183) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371780Ehs.LJII(com.bytedance.ies.nle.editor_jni.NLETrack, float):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    public static final void LJIILLIIL(InterfaceC1452170ntP interfaceC1452170ntP, NLEModel nLEModel) {
        if (nLEModel == null) {
            return;
        }
        interfaceC1452170ntP.yc(nLEModel);
        interfaceC1452170ntP.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
    }

    public static final void LJIJ(InterfaceC1452170ntP interfaceC1452170ntP, String str, NLETrack nLETrack) {
        NLETrackSlot nLETrackSlotLIZJ;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        String extra;
        Float fLJIIIIZZ;
        C0FW6 c0fw6LJIIIZ;
        C121D c121dLIZ;
        float[] fArrLIZJ;
        C0FW6 c0fw6LJIIIZ2;
        C348440DlK c348440DlKLJJIIJZLJL;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateSwingSync);
        }
        NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
        if (nLEModelLIZ != null && (nLETrackSlotLIZJ = C354870Dvh.LIZJ(nLEModelLIZ, str)) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots())) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (extra = mainSegment.getExtra("width_ratio")) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ2 != null && (c0fw6LJIIIZ = c348100DkmLIZIZ2.LJIIIZ()) != null && (c121dLIZ = c0fw6LJIIIZ.LIZ()) != null && (fArrLIZJ = c121dLIZ.LIZJ(str)) != null) {
                float fAbs = Math.abs(fArrLIZJ[2] - fArrLIZJ[0]);
                if (fAbs != 0.0f) {
                    float f = fFloatValue / fAbs;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update emoji scale: ");
                    sbLIZ.append(f);
                    C385200F8k.LIZ("PhotoTemplate", C2188811AlT.LIZIZ(sbLIZ));
                    nLETrackSlotLIZJ.setScale(nLETrackSlotLIZJ.getScale() * f);
                    C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntP);
                    if (c348100DkmLIZIZ3 != null && (c0fw6LJIIIZ2 = c348100DkmLIZIZ3.LJIIIZ()) != null && (c348440DlKLJJIIJZLJL = c0fw6LJIIIZ2.LJJIIJZLJL(str)) != null) {
                        c348440DlKLJJIIJZLJL.LJIIJ = nLETrackSlotLIZJ.getScale();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[PHI: r2
      0x0047: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:26:0x0045, B:24:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d A[PHI: r2
      0x004d: PHI (r2v4 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:26:0x0045, B:28:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050 A[PHI: r2 r3
      0x0050: PHI (r2v1 java.lang.String) = (r2v4 java.lang.String), (r2v5 java.lang.String) binds: [B:30:0x004e, B:28:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r3v0 java.lang.String) = (r3v3 java.lang.String), (r3v4 java.lang.String) binds: [B:30:0x004e, B:28:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[PHI: r2 r3
      0x0056: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:32:0x0054, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:32:0x0054, B:30:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a A[PHI: r7
      0x009a: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:58:0x0097, B:49:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e A[PHI: r7 r12
      0x009e: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v6 java.lang.String) binds: [B:61:0x009b, B:52:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r12v1 boolean) = (r12v0 boolean), (r12v3 boolean) binds: [B:61:0x009b, B:52:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect r14, com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData r15, com.bytedance.ies.nle.editor_jni.NLEStyText r16, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r17) {
        /*
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r16.getFont()
            r1 = 1
            r9 = 0
            if (r0 == 0) goto Lb1
            java.lang.String r2 = r0.getResourceId()
            if (r2 == 0) goto Lb1
            java.lang.String r0 = "text_template_typeface"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r9)
            if (r0 != r1) goto Lb1
            r0 = 1
        L17:
            java.lang.String r7 = ""
            if (r0 != 0) goto L2f
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r16.getFont()
            if (r0 == 0) goto La4
            java.lang.String r2 = r0.getResourceId()
            if (r2 == 0) goto La4
            java.lang.String r0 = "photomode_designer_textfont"
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r0, r9)
            if (r0 != r1) goto La4
        L2f:
            if (r14 == 0) goto La2
            java.lang.String r0 = r14.getUnzipPath()
        L35:
            java.lang.String r11 = com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools.LJFF(r0)
            if (r11 != 0) goto L3c
        L3b:
            r11 = r7
        L3c:
            if (r14 == 0) goto L44
            java.lang.String r2 = r14.getId()
            if (r2 != 0) goto L47
        L44:
            r2 = r7
            if (r14 == 0) goto L4d
        L47:
            java.lang.String r3 = r14.getResourceId()
            if (r3 != 0) goto L50
        L4d:
            r3 = r7
            if (r14 == 0) goto L56
        L50:
            java.lang.String r4 = r14.getPanel()
            if (r4 != 0) goto L57
        L56:
            r4 = r7
        L57:
            if (r15 == 0) goto L5d
            java.lang.String r6 = r15.fontName
            if (r6 != 0) goto L63
        L5d:
            if (r14 == 0) goto La0
            java.lang.String r6 = r14.getName()
        L63:
            if (r15 == 0) goto L69
            java.lang.String r10 = r15.fileName
            if (r10 != 0) goto L6f
        L69:
            java.lang.String r0 = "/"
            java.lang.String r10 = kotlin.text.a0.LJJLJLI(r11, r0, r7)
        L6f:
            int r8 = r17.getFontSize()
            if (r15 == 0) goto L91
            java.lang.String r0 = r15.title
            if (r0 == 0) goto L91
            r7 = r0
        L7a:
            int r0 = r15.enableBgColor
            if (r0 != r1) goto L9a
            r12 = 1
        L7f:
            int r0 = r15.enableMaskBlurLightColor
            if (r0 != r1) goto L9e
            r13 = 1
        L84:
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel r1 = new com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel
            r5 = 0
            r16 = 12424(0x3088, float:1.741E-41)
            r14 = r9
            r15 = r9
            r17 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L91:
            if (r14 == 0) goto L97
            java.lang.String r7 = r14.getName()
        L97:
            if (r15 == 0) goto L9a
            goto L7a
        L9a:
            r12 = 0
            if (r15 == 0) goto L9e
            goto L7f
        L9e:
            r13 = 0
            goto L84
        La0:
            r6 = r7
            goto L63
        La2:
            r0 = 0
            goto L35
        La4:
            if (r15 == 0) goto Laa
            java.lang.String r11 = r15.LIZ
            if (r11 != 0) goto L3c
        Laa:
            if (r14 == 0) goto L3b
            java.lang.String r11 = r14.getUnzipPath()
            goto L3c
        Lb1:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371780Ehs.LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData, com.bytedance.ies.nle.editor_jni.NLEStyText, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel");
    }

    public static final Float LJIJI(InterfaceC1452170ntP interfaceC1452170ntP, String str, NLETrack nLETrack, float f) {
        Float fLJIIIIZZ;
        NLESegment mainSegment;
        String extra;
        Float fLJIIIIZZ2;
        NLESegment mainSegment2;
        String extra2;
        NLETrackSlot nLETrackSlotLIZJ;
        C0FW6 c0fw6LJIIIZ;
        C348440DlK c348440DlKLJJIIJZLJL;
        NLETrackSlot nLETrackSlotLIZJ2;
        NLESegment mainSegment3;
        String extra3;
        Float fLJIIIIZZ3;
        float fFloatValue;
        C0FW6 c0fw6LJIIIZ2;
        C121D c121dLIZ;
        float[] fArrLIZJ;
        C0FW6 c0fw6LJIIIZ3;
        C348440DlK c348440DlKLJJIIJZLJL2;
        NLESegment mainSegment4;
        String extra4;
        Float fLJIIIIZZ4;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        NLESegment mainSegment5;
        String extra5;
        NLESegment mainSegment6;
        String extra6;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
        if (nLETrackSlot == null || (mainSegment6 = nLETrackSlot.getMainSegment()) == null || (extra6 = mainSegment6.getExtra("max_width_ratio")) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra6)) == null) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
            if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (extra = mainSegment.getExtra("width_ratio")) != null) {
                fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra);
            } else {
                fLJIIIIZZ = null;
            }
        }
        NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
        if (nLETrackSlot3 == null || (mainSegment5 = nLETrackSlot3.getMainSegment()) == null || (extra5 = mainSegment5.getExtra("max_height_ratio")) == null || (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(extra5)) == null) {
            NLETrackSlot nLETrackSlot4 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
            if (nLETrackSlot4 != null && (mainSegment2 = nLETrackSlot4.getMainSegment()) != null && (extra2 = mainSegment2.getExtra("height_ratio")) != null) {
                fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(extra2);
            } else {
                fLJIIIIZZ2 = null;
            }
        }
        float f2 = 1.0f;
        if (fLJIIIIZZ != null && fLJIIIIZZ2 != null && fLJIIIIZZ.floatValue() > 0.0f && fLJIIIIZZ2.floatValue() > 0.0f) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateSwingSync);
            }
            NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
            if (nLEModelLIZ == null || (nLETrackSlotLIZJ2 = C354870Dvh.LIZJ(nLEModelLIZ, str)) == null) {
                return null;
            }
            NLETrackSlot nLETrackSlot5 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
            if (nLETrackSlot5 != null && (mainSegment4 = nLETrackSlot5.getMainSegment()) != null && (extra4 = mainSegment4.getExtra("max_height_ratio")) != null && (fLJIIIIZZ4 = C2327809Ae.LJIIIIZZ(extra4)) != null) {
                fFloatValue = fLJIIIIZZ4.floatValue();
            } else {
                NLETrackSlot nLETrackSlot6 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
                if (nLETrackSlot6 != null && (mainSegment3 = nLETrackSlot6.getMainSegment()) != null && (extra3 = mainSegment3.getExtra("height_ratio")) != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(extra3)) != null) {
                    fFloatValue = fLJIIIIZZ3.floatValue();
                }
                return null;
            }
            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ2 != null && (c0fw6LJIIIZ2 = c348100DkmLIZIZ2.LJIIIZ()) != null && (c121dLIZ = c0fw6LJIIIZ2.LIZ()) != null && (fArrLIZJ = c121dLIZ.LIZJ(str)) != null) {
                float fAbs = Math.abs(fArrLIZJ[2] - fArrLIZJ[0]) * Math.max(nLEModelLIZ.getCanvasRatio() / f, 1.0f);
                float fAbs2 = Math.abs(fArrLIZJ[3] - fArrLIZJ[1]) * Math.max(f / nLEModelLIZ.getCanvasRatio(), 1.0f);
                if (fAbs != 0.0f && fAbs2 != 0.0f) {
                    float fMin = Math.min(fLJIIIIZZ.floatValue() / fAbs, fFloatValue / fAbs2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update sticker scale: ");
                    sbLIZ.append(fMin);
                    C385200F8k.LIZ("updateInfoStickerScale", C2188811AlT.LIZIZ(sbLIZ));
                    nLETrackSlotLIZJ2.setScale(nLETrackSlotLIZJ2.getScale() * fMin);
                    C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(interfaceC1452170ntP);
                    if (c348100DkmLIZIZ3 != null && (c0fw6LJIIIZ3 = c348100DkmLIZIZ3.LJIIIZ()) != null && (c348440DlKLJJIIJZLJL2 = c0fw6LJIIIZ3.LJJIIJZLJL(str)) != null) {
                        c348440DlKLJJIIJZLJL2.LJIIJ = nLETrackSlotLIZJ2.getScale();
                    }
                    return Float.valueOf(nLETrackSlotLIZJ2.getScale());
                }
            }
            return null;
        }
        NLEModel nLEModelLIZ2 = C352130DrH.LIZ(interfaceC1452170ntP);
        if (nLEModelLIZ2 != null && (nLETrackSlotLIZJ = C354870Dvh.LIZJ(nLEModelLIZ2, str)) != null) {
            if (0.75f < f) {
                f2 = 0.75f / f;
            }
            nLETrackSlotLIZJ.setScale(nLETrackSlotLIZJ.getScale() * f2);
            C348100Dkm c348100DkmLIZIZ4 = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ4 != null && (c0fw6LJIIIZ = c348100DkmLIZIZ4.LJIIIZ()) != null && (c348440DlKLJJIIJZLJL = c0fw6LJIIIZ.LJJIIJZLJL(str)) != null) {
                c348440DlKLJJIIJZLJL.LJIIJ = nLETrackSlotLIZJ.getScale();
            }
        }
        return null;
    }

    public static TextStickerModel LJIIIIZZ(NLETrack nLETrack, boolean z, boolean z2, int i, float f, int i2) {
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast;
        NLETextTemplateClip nLETextTemplateClip;
        String strLJIIL;
        String content;
        Pair<Effect, TextFontStyleData> pairLJIILIIL;
        Effect first;
        TextTemplateModel textTemplateModel;
        String strLJI;
        NLEResourceNode font;
        float f2 = f;
        int i3 = i;
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            f2 = 0.75f;
        }
        if (nLETrack.getTrackType() == NLETrackType.STICKER && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment)) != null && (nLETextTemplateClip = (NLETextTemplateClip) C13LP.LJJJLZIJ(0, nLESegmentTextTemplateDynamicCast.getTextClips())) != null) {
            NLEResourceNode effectSDKFile = nLESegmentTextTemplateDynamicCast.getEffectSDKFile();
            if (effectSDKFile != null) {
                strLJIIL = LJIIL(effectSDKFile);
            } else {
                strLJIIL = null;
            }
            Effect effectLJIIIZ = LJIIIZ(strLJIIL);
            if ((!z || effectLJIIIZ != null) && (content = nLETextTemplateClip.getContent()) != null && content.length() != 0 && (first = (pairLJIILIIL = LJIILIIL(nLETextTemplateClip.getContentStyle())).getFirst()) != null) {
                TextFontStyleData second = pairLJIILIIL.getSecond();
                TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
                C363420EMq c363420EMq = C363420EMq.LIZ;
                NLEStyText contentStyle = nLETextTemplateClip.getContentStyle();
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                c363420EMq.getClass();
                C363420EMq.LIZIZ(textStickerData, contentStyle, contextLIZ, z3, false);
                C363420EMq.LIZLLL(nLETextTemplateClip.getContentStyle(), textStickerData);
                NLEStyText contentStyle2 = nLETextTemplateClip.getContentStyle();
                if (contentStyle2 != null && (font = contentStyle2.getFont()) != null) {
                    font.setResourceFile(TextTemplateTools.LJFF(first.getUnzipPath()));
                }
                TextFontModel textFontModelLIZJ = LIZJ(first, second, nLETextTemplateClip.getContentStyle(), textStickerData);
                if (z && effectLJIIIZ != null) {
                    String unzipPath = effectLJIIIZ.getUnzipPath();
                    String effectId = effectLJIIIZ.getEffectId();
                    String name = effectLJIIIZ.getName();
                    boolean zLJIIIIZZ = TextTemplateTools.LJIIIIZZ(effectLJIIIZ);
                    String effectId2 = first.getEffectId();
                    String strLJFF = TextTemplateTools.LJFF(first.getUnzipPath());
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    String uuid = nLETrackSlot.getUUID();
                    NLEStyText contentStyle3 = nLETextTemplateClip.getContentStyle();
                    if (contentStyle3 == null || (strLJI = contentStyle3.toEffectJsonString()) == null) {
                        strLJI = TextTemplateTools.LJI(effectLJIIIZ.getUnzipPath());
                    }
                    textTemplateModel = new TextTemplateModel(unzipPath, true, false, false, "", true, true, false, effectId2, strLJFF, effectId, zLJIIIIZZ, false, name, strLJI, 0, null, false, false, false, false, uuid, null, false, false, 0, null, null, 266309636, null);
                } else {
                    nLETrackSlot.setScale(nLETrackSlot.getScale() * (0.75f / Math.max(f2, 0.75f)));
                    textTemplateModel = new TextTemplateModel(null, false, false, false, null, false, false, false, null, null, null, false, false, null, null, 0, null, false, false, false, false, null, null, false, false, 0, null, null, 268435455, null);
                }
                String content2 = nLETextTemplateClip.getContent();
                String content3 = nLETextTemplateClip.getContent();
                return new TextStickerModel(LIZIZ(i3, nLETrackSlot), null, null, content2, content3, textStickerData.getBgMode(), textStickerData.getColor(), textStickerData.getAlign(), 0.0f, textFontModelLIZJ, false, false, false, false, false, new TTSModel(false, -1, "", null, null, null, 0, null, new ArrayList(), null, false, null, null, null, null, "", "", false, 0L, 0L, new ArrayList(), new TTSAudioBean(null, 1, null), false, "", new LinkedHashMap(), false), null, null, null, null, null, null, null, false, null, 0L, 0L, C0F7S.EDIT, null, textTemplateModel, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -671122172, 64511, null);
            }
        }
        return null;
    }
}
