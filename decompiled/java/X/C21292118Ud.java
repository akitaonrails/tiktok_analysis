package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.entry.anchor.AiChatSheetFragment;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21292118Ud implements InterfaceC1397450mT9 {
    public final ConcurrentHashMap<String, C21292318Uf> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ() {
        String strLJJJJLL;
        String strLLIIZ;
        ICaptionKevaService iCaptionKevaService = (ICaptionKevaService) PluggableExtentionKt.pluggableSpi$default(ICaptionKevaService.class, false, false, false, 14, null);
        Boolean boolValueOf = iCaptionKevaService != null ? Boolean.valueOf(iCaptionKevaService.LJLILLLLZI()) : null;
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            if (iTranslationService != null && (strLLIIZ = iTranslationService.LLIIZ()) != null) {
                return strLLIIZ;
            }
        } else if (iTranslationService != null && (strLJJJJLL = iTranslationService.LJJJJLL()) != null) {
            return strLJJJJLL;
        }
        return "en";
    }

    @Override // X.InterfaceC1397450mT9
    public final boolean LIZIZ() {
        C1EPC c1epcLIZIZ;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        return (iAiChatFeatureService == null || (c1epcLIZIZ = iAiChatFeatureService.LIZIZ()) == null || !c1epcLIZIZ.LIZIZ()) ? false : true;
    }

    @Override // X.InterfaceC1397450mT9
    public final String LJFF() {
        EnumC21291418Tw.Companion.getClass();
        return C21291518Tx.LJ(C21291618Ty.LIZ(2131825613), new Object[0]);
    }

    @Override // X.InterfaceC1397450mT9
    public final void LJIIIIZZ() {
        C1727006pY.LIZ.getClass();
        C1727006pY.LIZ();
    }

    @Override // X.InterfaceC1397450mT9
    public final String LIZLLL() {
        return C21288518St.LIZ().defaultPromptUri;
    }

    public static void LJIIJJI(Context context, AIChatGenConsumptionModel aIChatGenConsumptionModel) {
        int i;
        String promptType;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "visual_poet_anchor", true)) {
            CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            C1727006pY.LIZ.getClass();
            int iLIZIZ = C1727006pY.LIZIZ();
            C540800LIw c540800LIw = C540800LIw.LIZ;
            String creationId = creativeInfo.getCreationId();
            if (aIChatGenConsumptionModel.originImageCount == 1) {
                i = 1;
            } else {
                i = 2;
            }
            String str = aIChatGenConsumptionModel.enterMethod;
            AIChatGenModel aIChatGenModel = new AIChatGenModel(new AIChatGenChatRoomModel("anchor", "visual_poet_anchor", aIChatGenConsumptionModel.enterMethod, aIChatGenConsumptionModel.enterFrom, null, creativeInfo.getCreationId(), iLIZIZ, null, 144, null), aIChatGenConsumptionModel, null, 4, null);
            c540800LIw.getClass();
            Bundle bundleLIZ = C540800LIw.LIZ(creationId, i, false, 68, "visual_poet_anchor", str, aIChatGenModel);
            String str2 = MvChoosePhotoActivity._pnsPageId;
            C0L0F.LJ(context, 1028, bundleLIZ);
            C19751912Pt c19751912Pt = C19751912Pt.LIZ;
            String creationId2 = creativeInfo.getCreationId();
            String str3 = aIChatGenConsumptionModel.enterMethod;
            c19751912Pt.getClass();
            C19751912Pt.LIZ(iLIZIZ, null, null, creationId2, "visual_poet_anchor", str3);
            C21287418Si c21287418Si = C21287418Si.LIZ;
            String creationId3 = creativeInfo.getCreationId();
            c21287418Si.getClass();
            IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
            if (iRecordMobService != null) {
                C1449410nox c1449410nox = new C1449410nox(creationId3, "visual_poet_anchor", aIChatGenConsumptionModel.enterFrom, null, null, null, null, null, 248);
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("enter_method", aIChatGenConsumptionModel.enterMethod);
                pairArr[1] = new Pair("is_visual_poet", "1");
                pairArr[2] = new Pair("vp_process_cnt", String.valueOf(C1727006pY.LIZIZ()));
                AIChatGenPrompt aIChatGenPrompt = aIChatGenConsumptionModel.prompt;
                if (aIChatGenPrompt == null || (promptType = aIChatGenPrompt.getPromptType()) == null) {
                    promptType = "";
                }
                pairArr[3] = new Pair("vp_prompt_type", promptType);
                iRecordMobService.LIZLLL(c1449410nox, C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
    }

    @Override // X.InterfaceC1397450mT9
    public final void LIZJ(C19EG c19eg, AIChatGenConsumptionModel aIChatGenConsumptionModel) {
        LJIIJJI(c19eg, aIChatGenConsumptionModel);
    }

    @Override // X.InterfaceC1397450mT9
    public final Map<String, String> LJ(String str, String str2) {
        String str3 = LJIIL(str, str2).LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        return C2097908Jt.LIZJ(new Pair("vp_prompt_type", str3));
    }

    @Override // X.InterfaceC1397450mT9
    public final String LJII(String str, String str2) {
        String str3 = LJIIL(str, str2).LJFF;
        if (str3 != null && str3.length() > 0) {
            return str3;
        }
        return "https://tosv-sg.tiktok-row.org/obj/tiktok-ic-aigc-sg/aciton-bar-image.png";
    }

    public final C21292318Uf LJIIL(String str, String str2) {
        String strLJIL;
        String strLJIL2;
        String strLJIL3;
        int iLJIIJJI;
        String strLJIL4;
        String strLJIL5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("awemeExtra: ");
        sbLIZ.append(str2);
        C21290818Tq.LIZ("AiChatAnchorServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C21292318Uf c21292318Uf = this.LIZ.get(str);
            if (c21292318Uf != null) {
                return c21292318Uf;
            }
            n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), str2).LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("prompt");
            String strLJIL6 = null;
            if (kVarLJJIIZ != null) {
                strLJIL = kVarLJJIIZ.LJIL();
            } else {
                strLJIL = null;
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("prompt_id");
            if (kVarLJJIIZ2 != null) {
                strLJIL2 = kVarLJJIIZ2.LJIL();
            } else {
                strLJIL2 = null;
            }
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("prompt_type");
            String str3 = "default";
            if (kVarLJJIIZ3 == null || (strLJIL3 = kVarLJJIIZ3.LJIL()) == null) {
                strLJIL3 = "default";
            }
            k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("image_count");
            if (kVarLJJIIZ4 != null) {
                iLJIIJJI = kVarLJJIIZ4.LJIIJJI();
            } else {
                iLJIIJJI = 0;
            }
            k kVarLJJIIZ5 = nVarLJIILIIL.LJJIIZ("icon_uri");
            if (kVarLJJIIZ5 != null) {
                strLJIL4 = kVarLJJIIZ5.LJIL();
            } else {
                strLJIL4 = null;
            }
            k kVarLJJIIZ6 = nVarLJIILIIL.LJJIIZ("icon_url");
            if (kVarLJJIIZ6 == null || (strLJIL5 = kVarLJJIIZ6.LJIL()) == null || strLJIL5.length() <= 0) {
                strLJIL5 = "https://tosv-sg.tiktok-row.org/obj/tiktok-ic-aigc-sg/aciton-bar-image.png";
            }
            k kVarLJJIIZ7 = nVarLJIILIIL.LJJIIZ("prompt_uri");
            if (kVarLJJIIZ7 != null) {
                strLJIL6 = kVarLJJIIZ7.LJIL();
            }
            if (!Intrinsics.LJFF(strLJIL3, "input")) {
                str3 = strLJIL3;
            }
            C21292318Uf c21292318Uf2 = new C21292318Uf(strLJIL, strLJIL2, str3, Integer.valueOf(iLJIIJJI), strLJIL4, strLJIL5, strLJIL6);
            this.LIZ.put(str, c21292318Uf2);
            return c21292318Uf2;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C21290818Tq.LIZIZ("AiChatAnchorServiceImpl", "parseExtra JsonSyntaxException", e);
            return new C21292318Uf(0);
        } catch (ClassCastException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C21290818Tq.LIZIZ("AiChatAnchorServiceImpl", "parseExtra ClassCastException", e2);
            return new C21292318Uf(0);
        } catch (IllegalStateException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C21290818Tq.LIZIZ("AiChatAnchorServiceImpl", "parseExtra IllegalStateException", e3);
            return new C21292318Uf(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    @Override // X.InterfaceC1397450mT9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r20, java.lang.String r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21292118Ud.LJIIIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1397450mT9
    public final void LJIIJ(String str, FragmentManager fragmentManager, String str2, String str3, boolean z) {
        int iIntValue;
        String str4;
        C21292318Uf c21292318UfLJIIL = LJIIL(str2, str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str5 = c21292318UfLJIIL.LIZIZ;
        String str6 = this.LIZIZ.get(strLIZIZ);
        if (str6 == null) {
            str6 = c21292318UfLJIIL.LIZ;
        }
        AIChatGenPrompt aIChatGenPrompt = new AIChatGenPrompt(UUID.randomUUID().toString(), str6, c21292318UfLJIIL.LIZJ, str5, c21292318UfLJIIL.LJI, c21292318UfLJIIL.LJ);
        Integer num = c21292318UfLJIIL.LIZLLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            str4 = "visual_poet_anchor_friends";
        } else if (Intrinsics.LJFF(str, "homepage_hot")) {
            str4 = "visual_poet_anchor_fyp";
        } else {
            str4 = "visual_poet_other";
        }
        AIChatGenConsumptionModel aIChatGenConsumptionModel = new AIChatGenConsumptionModel(aIChatGenPrompt, iIntValue, str, str4);
        String str7 = c21292318UfLJIIL.LJFF;
        if (str7 == null || str7.length() <= 0) {
            str7 = "https://tosv-sg.tiktok-row.org/obj/tiktok-ic-aigc-sg/aciton-bar-image.png";
        }
        new AiChatSheetFragment(aIChatGenConsumptionModel, str7).show(fragmentManager, "ai_imagine");
    }

    @Override // X.InterfaceC1397450mT9
    public final void LJI(Context context, String str, FragmentManager fragmentManager, String str2, String str3, boolean z) {
        int iIntValue;
        String str4;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        C1727006pY.LIZ.getClass();
        if (C1727006pY.LIZIZ() <= 0) {
            LJIIJ(str, fragmentManager, str2, str3, z);
            return;
        }
        C21292318Uf c21292318UfLJIIL = LJIIL(str2, str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str5 = c21292318UfLJIIL.LIZIZ;
        String str6 = this.LIZIZ.get(strLIZIZ);
        if (str6 == null) {
            str6 = c21292318UfLJIIL.LIZ;
        }
        AIChatGenPrompt aIChatGenPrompt = new AIChatGenPrompt(UUID.randomUUID().toString(), str6, c21292318UfLJIIL.LIZJ, str5, c21292318UfLJIIL.LJI, c21292318UfLJIIL.LJ);
        Integer num = c21292318UfLJIIL.LIZLLL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (z) {
            str4 = "visual_poet_anchor_friends";
        } else if (Intrinsics.LJFF(str, "homepage_hot")) {
            str4 = "visual_poet_anchor_fyp";
        } else {
            str4 = "visual_poet_other";
        }
        AIChatGenConsumptionModel aIChatGenConsumptionModel = new AIChatGenConsumptionModel(aIChatGenPrompt, iIntValue, str, str4);
        if (aIChatGenConsumptionModel.originImageCount > 0) {
            LJIIJJI(context, aIChatGenConsumptionModel);
            return;
        }
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService == null || (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) == null) {
            return;
        }
        interfaceC21300818XmLIZ.LJIIIZ(context, aIChatGenConsumptionModel);
    }
}
