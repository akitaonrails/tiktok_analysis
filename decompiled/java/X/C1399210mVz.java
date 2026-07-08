package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.services.story.IAlbumParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.story.IStoryService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399210mVz extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1399220mW0());

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        String modelPrompt;
        C712520RxC c712520RxC;
        List<InterfaceC1393560mMs> listLJIILL;
        Pair[] pairArr = new Pair[2];
        AIAliveInfo aIAliveInfo = LJIIZILJ().aiAliveInfo;
        if (aIAliveInfo == null || (modelPrompt = aIAliveInfo.getModelPrompt()) == null) {
            modelPrompt = null;
        }
        pairArr[0] = new Pair("origin_ai_alive_prompt", modelPrompt);
        pairArr[1] = new Pair("is_story", C893803eS.LIZ(C729510SjV.LJJ(LJIIZILJ())));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map mapLIZ = C1765430w2f.LIZ(mapLJIIJ);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        if ((interfaceC1392640mLO instanceof C712520RxC) && (c712520RxC = (C712520RxC) interfaceC1392640mLO) != null && (listLJIILL = c712520RxC.LJIILL()) != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1393560mMs interfaceC1393560mMs : listLJIILL) {
                if (interfaceC1393560mMs instanceof AbstractC1394010mNb) {
                    arrayList.add(interfaceC1393560mMs);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1400390mXt anchorMobConfiguration = ((InterfaceC1392510mLB) it2.next()).getAnchorMobConfiguration();
                if (anchorMobConfiguration != null) {
                    Map<String, String> mapInvoke = anchorMobConfiguration.LIZ.invoke();
                    if (mapInvoke != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                            if (C1697810uHb.LJIIJJI("tt_template_type", "tt_template_id", "template_dispatch_type").contains(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        mapLJIIJ.putAll(linkedHashMap);
                    }
                    Map<String, String> mapInvoke2 = anchorMobConfiguration.LIZIZ.invoke();
                    if (mapInvoke2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, String> entry2 : mapInvoke2.entrySet()) {
                            if (C1697810uHb.LJIIJJI("tt_template_type", "tt_template_id", "template_dispatch_type").contains(entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        mapLJIIJ.putAll(linkedHashMap2);
                    }
                }
            }
        }
        return new C1400390mXt(new AwS565S0100000_21(mapLJIIJ, (Map<String, String>) 1259), new AwS565S0100000_21(mapLIZ, (Map<String, String>) 1260), null, null, null, 28);
    }

    public final IAILiveService LJJIJIIJI() {
        return (IAILiveService) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1399210mVz();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_LIVE_PHOTO_ANCHOR_TYPE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS422S0200000_21(this, smartImageView, 83));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        IAILiveService aILiveService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        InterfaceC1392640mLO interfaceC1392640mLO = null;
        if (iExternalService != null && (aILiveService = iExternalService.getAILiveService()) != null && aILiveService.isAILiveEnable() && !aILiveService.forbidAnchor()) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO2;
            }
            boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL(interfaceC1392640mLO.LJ());
            boolean zLJIIIIZZ = ((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJJLIIIJJI().LJIIIIZZ(LJIIZILJ());
            if (zLJJIIJZLJL && zLJIIIIZZ) {
                return EnumC1050190dR3.NOT_FOUND;
            }
            return super.LJJJJLL(list);
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String text;
        AIAliveInfo aIAliveInfo;
        String str;
        AIAliveInfo aIAliveInfoCopy;
        EnterStoryParam enterStoryParam;
        EnterStoryParam enterStoryParamCopy;
        FragmentManager supportFragmentManager;
        C19EG c19eg;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        LifecycleOwner lifecycleOwnerLJFF;
        FragmentManager supportFragmentManager2;
        C19EG c19eg2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2;
        LifecycleOwner lifecycleOwnerLJFF2;
        C19EG c19eg3;
        FragmentManager supportFragmentManager3;
        String str2;
        UrlModel thumbnail;
        List<String> urlList;
        AIAliveInfo aIAliveInfo2;
        IAILiveService iAILiveServiceLJJIJIIJI = LJJIJIIJI();
        AIAliveInfo aIAliveInfo3 = LJIIZILJ().aiAliveInfo;
        LifecycleOwner lifecycleOwnerLJFF3 = null;
        if (aIAliveInfo3 != null) {
            text = aIAliveInfo3.getText();
        } else {
            text = null;
        }
        String translateResult = iAILiveServiceLJJIJIIJI.getTranslateResult(text);
        if (!C123100dR.LIZ(translateResult) || translateResult == null || (aIAliveInfo2 = LJIIZILJ().aiAliveInfo) == null || (aIAliveInfo = aIAliveInfo2.copy(translateResult, aIAliveInfo2.promptType, aIAliveInfo2.modelPrompt, aIAliveInfo2.modelKey, aIAliveInfo2.styleImageUrl)) == null) {
            aIAliveInfo = LJIIZILJ().aiAliveInfo;
        }
        if (Intrinsics.LJFF(LJIJJLI(), "homepage_hot")) {
            str = "ai_livephoto_anchor_fyp";
        } else if (C729510SjV.LJJ(LJIIZILJ())) {
            str = "ai_livephoto_anchor_friends";
        } else {
            str = "ai_livephoto_other";
        }
        if (aIAliveInfo == null) {
            String dynamicString$default = IAILiveService.DefaultImpls.getDynamicString$default(LJJIJIIJI(), 2131820733, null, new Object[0], 2, null);
            String dynamicString$default2 = IAILiveService.DefaultImpls.getDynamicString$default(LJJIJIIJI(), 2131820733, null, new Object[0], 2, null);
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct == null || (thumbnail = anchorCommonStruct.getThumbnail()) == null || (urlList = thumbnail.getUrlList()) == null || (str2 = (String) C13LP.LJJJLL(urlList)) == null) {
                str2 = "";
            }
            aIAliveInfo = new AIAliveInfo(dynamicString$default, "default", dynamicString$default2, "", str2);
        }
        AIAliveInfo aIAliveInfo4 = LJIIZILJ().aiAliveInfo;
        if (aIAliveInfo4 != null) {
            aIAliveInfoCopy = aIAliveInfo4.copy(aIAliveInfo4.text, aIAliveInfo4.promptType, aIAliveInfo4.modelPrompt, aIAliveInfo4.modelKey, aIAliveInfo4.styleImageUrl);
        } else {
            aIAliveInfoCopy = null;
        }
        OpenPostAlbumParams openPostAlbumParams = new OpenPostAlbumParams(str, aIAliveInfo, "ai_livephoto_anchor", LJIJJLI(), false, aIAliveInfoCopy, null);
        if (LJJIJIIJI().isPostAILiveEnable() && LJJIJIIJI().shouldShowSheetWhenClickAnchor()) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            Fragment fragmentLJ = interfaceC1392640mLO.LJ();
            if (fragmentLJ == null || (supportFragmentManager3 = fragmentLJ.getChildFragmentManager()) == null) {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                if (interfaceC1392640mLO2 == null) {
                    interfaceC1392640mLO2 = null;
                }
                Activity activityLIZIZ = interfaceC1392640mLO2.LIZIZ();
                if (!(activityLIZIZ instanceof C19EG) || (c19eg3 = (C19EG) activityLIZIZ) == null || (supportFragmentManager3 = c19eg3.getSupportFragmentManager()) == null) {
                    return;
                }
            }
            LJJIJIIJI().refreshQuotaCache(RefreshQuotaScene.CLICK_ANCHOR);
            LJJIJIIJI().provideAILiveSheetContentView(LJIILJJIL(), openPostAlbumParams).show(supportFragmentManager3, "ai_live");
            return;
        }
        if (LJJIJIIJI().isPostAILiveEnable()) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            Fragment fragmentLJ2 = interfaceC1392640mLO3.LJ();
            if (fragmentLJ2 == null || (supportFragmentManager2 = fragmentLJ2.getChildFragmentManager()) == null) {
                Context context = view.getContext();
                if ((context instanceof C19EG) && (c19eg2 = (C19EG) context) != null) {
                    supportFragmentManager2 = c19eg2.getSupportFragmentManager();
                } else {
                    supportFragmentManager2 = null;
                }
            }
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 == null) {
                interfaceC1392640mLO4 = null;
            }
            Fragment fragmentLJ3 = interfaceC1392640mLO4.LJ();
            if (fragmentLJ3 != null && (abstractC1387200mCcLIZIZ2 = C520040KaQ.LIZIZ(fragmentLJ3)) != null && (lifecycleOwnerLJFF2 = abstractC1387200mCcLIZIZ2.LJFF()) != null) {
                lifecycleOwnerLJFF3 = lifecycleOwnerLJFF2;
            } else {
                AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(view);
                if (abstractC1387200mCcLIZ != null) {
                    lifecycleOwnerLJFF3 = abstractC1387200mCcLIZ.LJFF();
                }
            }
            IAILiveService.DefaultImpls.goPostAlbum$default(LJJIJIIJI(), LJIILJJIL(), openPostAlbumParams, lifecycleOwnerLJFF3, supportFragmentManager2, null, 16, null);
            return;
        }
        IAlbumParam iAlbumParamDefaultAlbumParam = LJJIJIIJI().defaultAlbumParam();
        if ((iAlbumParamDefaultAlbumParam instanceof EnterStoryParam) && (enterStoryParam = (EnterStoryParam) iAlbumParamDefaultAlbumParam) != null && (enterStoryParamCopy = enterStoryParam.copy("ai_livephoto_anchor", "ai_livephoto_anchor_story", "ai_live_photo_anchor", enterStoryParam.creationId, enterStoryParam.fromGroupId, enterStoryParam.shootEnterFrom, enterStoryParam.shootEnterMethod, enterStoryParam.storyShootEnterPosition, enterStoryParam.shootExtraData, enterStoryParam.isUploadDirectEnter, enterStoryParam.isStoryEnhancedEntrance, enterStoryParam.enableSwipeUpExit, enterStoryParam.sharedElementTransitionMode, enterStoryParam.sharedElementRoundedMaskInitialY, 18, enterStoryParam.interceptorWhenFailEnterStoryAlbum, enterStoryParam.socAlbumConfig, enterStoryParam.creationSearchModel, enterStoryParam.requestId, enterStoryParam.baseSecretReplyData, enterStoryParam.entranceType, enterStoryParam.isFromSocialCameraEntrance, enterStoryParam.storyArchiveTabName, enterStoryParam.isSubOnlyStory, enterStoryParam.afterPublishLandingMode, enterStoryParam.preselectedMusic)) != null) {
            if (LJJIJIIJI().enableStoryAILivePhotoAlbumEntrance()) {
                LJJIJIIJI().goStoryAlbum(LJIILJJIL(), enterStoryParamCopy);
                return;
            }
            InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
            if (interfaceC1392640mLO5 == null) {
                interfaceC1392640mLO5 = null;
            }
            Fragment fragmentLJ4 = interfaceC1392640mLO5.LJ();
            if (fragmentLJ4 == null || (supportFragmentManager = fragmentLJ4.getChildFragmentManager()) == null) {
                Context context2 = view.getContext();
                if ((context2 instanceof C19EG) && (c19eg = (C19EG) context2) != null) {
                    supportFragmentManager = c19eg.getSupportFragmentManager();
                } else {
                    supportFragmentManager = null;
                }
            }
            InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
            if (interfaceC1392640mLO6 == null) {
                interfaceC1392640mLO6 = null;
            }
            Fragment fragmentLJ5 = interfaceC1392640mLO6.LJ();
            if (fragmentLJ5 != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJ5)) != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF()) != null) {
                lifecycleOwnerLJFF3 = lifecycleOwnerLJFF;
            } else {
                AbstractC1387200mCc abstractC1387200mCcLIZ2 = C520040KaQ.LIZ(view);
                if (abstractC1387200mCcLIZ2 != null) {
                    lifecycleOwnerLJFF3 = abstractC1387200mCcLIZ2.LJFF();
                }
            }
            LJJIJIIJI().goStoryAlbumWithGuideCheck(LJIILJJIL(), view.getContext(), lifecycleOwnerLJFF3, supportFragmentManager, enterStoryParamCopy);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJLIIIJ(C712520RxC c712520RxC, String str, boolean z) {
        String text;
        C19FO c19fo;
        LifecycleCoroutineScope lifecycleScope;
        LJJIJIIJI().downloadGuideResourceIfNeed();
        if (LJJIJIIJI().isPostAILiveEnable()) {
            LJJIJIIJI().refreshQuotaCacheIfNeed(RefreshQuotaScene.FIRST_SHOW_ANCHOR);
            AIAliveInfo aIAliveInfo = LJIIZILJ().aiAliveInfo;
            if (aIAliveInfo != null) {
                text = aIAliveInfo.getText();
            } else {
                text = null;
            }
            if (C123100dR.LIZ(text)) {
                Activity activityLJIILJJIL = LJIILJJIL();
                if ((activityLJIILJJIL instanceof C19EG) && (c19fo = (C19FO) activityLJIILJJIL) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19fo)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C716400S8g(this, aIAliveInfo, null), 2);
                }
            }
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String styleImageUrl = null;
        if (anchorCommonStruct == null) {
            return null;
        }
        C1397480mTC c1397480mTCLIZ = C1397470mTB.LIZ(viewGroup.getContext());
        AIAliveInfo aIAliveInfo = LJIIZILJ().aiAliveInfo;
        if (aIAliveInfo != null) {
            styleImageUrl = aIAliveInfo.getStyleImageUrl();
        }
        UrlModel urlModelLJIILIIL = C0I98.LJIILIIL(styleImageUrl);
        if (urlModelLJIILIIL != null || (urlModelLJIILIIL = anchorCommonStruct.getThumbnail()) != null || (urlModelLJIILIIL = anchorCommonStruct.getIcon()) != null) {
            c1397480mTCLIZ.LIZJ(urlModelLJIILIIL);
        }
        c1397480mTCLIZ.setSubTitle(anchorCommonStruct.getDescription());
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        c1397480mTCLIZ.setTitle(keyword);
        C786410Ut5.I7(new C1401860maG(this, c2344009Gk, 3), c1397480mTCLIZ);
        c1397480mTCLIZ.setButtonIcon(C1392810mLf.LIZIZ(anchorCommonStruct));
        c1397480mTCLIZ.LIZIZ(true);
        c1397480mTCLIZ.setButtonOnClickListener(new AwS230S0300000_21(this, c1397480mTCLIZ, c2344009Gk, 22));
        viewGroup.addView(c1397480mTCLIZ);
        return c1397480mTCLIZ;
    }
}
