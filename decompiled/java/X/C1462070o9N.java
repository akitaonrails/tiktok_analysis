package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS245S0100000_22;
import Y.AObserverS209S0100000_5;
import Y.AObserverS225S0100000_22;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionAsrExtra;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o9N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1462070o9N extends C19A3 implements InterfaceC1166920gTK, InterfaceC1444170ngV, InterfaceC1406950miT, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZ;
    public final C1DRG LLJILLL;
    public final int LLJJ;
    public final boolean LLJJI;
    public final InterfaceC1462140o9U LLJJIII;
    public final C1664740tQG LLJJIJI;
    public C0LEK LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public InterfaceC1461390o8H LLJJJJLIIL;
    public C121O LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public InterfaceC19626511qZ LLJL;
    public InterfaceC2378409Tq LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public InterfaceC1461350o8D LLJLL;
    public final C1664740tQG LLJLLIL;
    public final C1664740tQG LLJLLL;
    public AnonymousClass1229 LLJZ;
    public InterfaceC19625711qR LLJZIJLIL;
    public final C1664740tQG LLL;
    public final C01GW LLLF;
    public InterfaceC19627111qf LLLFF;
    public final List<InteractStickerStruct> LLLFFI;
    public FrameLayout LLLFZ;
    public FrameLayout LLLI;
    public InterfaceC1461680o8k LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public C0FWT LLLIIIL;
    public InterfaceC384890F7f LLLIIL;
    public ProgressDialogC1399790mWv LLLIILIL;
    public C1DRG LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public final C1664740tQG LLLLILI;
    public final C01GW LLLLJ;
    public InterfaceC19627611qk LLLLJI;
    public final C1664740tQG LLLLL;
    public final C1664740tQG LLLLLIL;
    public InterfaceC1461650o8h LLLLLILLIL;
    public boolean LLLLLJIL;
    public C122Q LLLLLJLJLL;
    public InterfaceC1461660o8i LLLLLL;
    public InterfaceC1465230oET LLLLLLIL;
    public C1455830nzJ LLLLLLJ;
    public final C01GW<C124T> LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public final C01GW LLLLLLZZ;

    @Override // X.InterfaceC1444170ngV
    public final void LJJJJLL() {
    }

    @Override // X.InterfaceC1444170ngV
    public final void LLIIIJ() {
    }

    public void LLLLIL(int i) {
    }

    public void LLLZIIL(C1DRF c1drf) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462070o9N.class, "textToSpeechApiComponent", "getTextToSpeechApiComponent()Lcom/ss/android/ugc/gamora/editor/audio/tts/base/TextToSpeechApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1462070o9N.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1462070o9N.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1462070o9N.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1462070o9N.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1462070o9N.class, "editUgcTemplateApi", "getEditUgcTemplateApi()Lcom/ss/android/ugc/gamora/ugctemplate/EditUgcTemplateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1462070o9N.class, "editCanvasApi", "getEditCanvasApi()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/EditCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1462070o9N.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1462070o9N.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1462070o9N.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1462070o9N.class, "memeSongStickerApi", "getMemeSongStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/memesong/MemeSongStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1462070o9N.class, "imageEditAddYoursStickerApi", "getImageEditAddYoursStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1462070o9N.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1462070o9N.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1462070o9N.class, "dmEditPrePublishApi", "getDmEditPrePublishApi()Lcom/ss/android/ugc/aweme/social/preload/DMEditPrePublishApi;", 0);
        c09r3.getClass();
        LLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15};
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJLI() {
        List<InteractStickerStruct> listNt;
        C1402840mbq shareContext;
        AttributionLinkStickerStruct attributionLinkStickerStruct;
        List<StickerItemModel> list;
        StickerItemModel next;
        List<InteractStickerStruct> interactStickerStruct;
        InteractStickerStruct interactStickerStruct2;
        List<StickerItemModel> list2;
        C122Q c122q;
        ArrayList<StickerItemModel> arrayList;
        C122Q c122q2;
        InteractStickerStruct interactStickerStructHN1;
        CaptionAsrExtra captionAsrExtra;
        ((ArrayList) this.LLLFFI).clear();
        if (u4.LJLJLJ(LLLLLLL())) {
            if (C1416310mxZ.LJJLIIIJJIZ(LLLLLLL())) {
                VideoPublishEditModel videoPublishEditModelLLLLLLL = LLLLLLL();
                InterfaceC1452170ntP value = LLLLLJIL().g().getValue();
                NLEModel nLEModelLIZ = value != null ? C352130DrH.LIZ(value) : null;
                List<TextStickerModel> listLIZJ = C363730ENv.LIZJ(videoPublishEditModelLLLLLLL);
                TextStickerModel textStickerModel = (TextStickerModel) C13LP.LJJJLZIJ(0, listLIZJ);
                if (textStickerModel == null || (interactStickerStructHN1 = textStickerModel.getInteractStickerStruct()) == null) {
                    interactStickerStructHN1 = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (TextStickerModel textStickerModel2 : (ArrayList) listLIZJ) {
                        TextStickerInfo textStickerInfo = textStickerModel2.getTextStickerInfo();
                        if (textStickerInfo == null) {
                            textStickerInfo = new TextStickerInfo("#00000000", "#00FFFFFF", "", 0.0f, 0.0f, 28, 0);
                        }
                        arrayList2.add(new Utterance((long) textStickerModel2.getBaseStickerModel().getStartTime(), (long) textStickerModel2.getBaseStickerModel().getEndTime(), textStickerModel2.getTextStr(), textStickerInfo.bgColor, textStickerInfo.textColor, textStickerInfo.srcWidth, textStickerInfo.srcHeight, textStickerInfo.textSize, textStickerInfo.alignment, "", false));
                    }
                    if (C289240BVi.LIZ(videoPublishEditModelLLLLLLL)) {
                        if (nLEModelLIZ == null || !nLEModelLIZ.hasExtra("ep_text_auto_caption_query_info") || (captionAsrExtra = (CaptionAsrExtra) C051R.LIZ(nLEModelLIZ.getExtra("ep_text_auto_caption_query_info"), CaptionAsrExtra.class)) == null) {
                            captionAsrExtra = new CaptionAsrExtra(0);
                        }
                        interactStickerStructHN1.setCaptionStruct(new CaptionStruct(captionAsrExtra.audioUri, arrayList2, EnumC389920FQo.LEFT_BOTTOM.getValue(), null, null, 0L, captionAsrExtra.srcLanguage, null, captionAsrExtra.asrService));
                        interactStickerStructHN1.getCaptionStruct().setTaskId(captionAsrExtra.taskId);
                    } else {
                        interactStickerStructHN1.setCaptionStruct(new CaptionStruct(null, arrayList2, EnumC389920FQo.LEFT_BOTTOM.getValue(), null, null, 0L, null, null, null));
                    }
                }
            } else {
                InlineCaptionModel inlineCaptionModel = LLLLLLL().creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null && (c122q2 = this.LLLLLJLJLL) != null) {
                    interactStickerStructHN1 = c122q2.hN1(getSceneContext(), arrayList, C0CHQ.LIZ().getGson());
                }
            }
            if (interactStickerStructHN1 != null) {
                ((ArrayList) this.LLLFFI).add(interactStickerStructHN1);
            }
        }
        InfoStickerModel infoStickerModel = LLLLLLL().getInfoStickerModel();
        if (((infoStickerModel != null && (list2 = infoStickerModel.stickers) != null && (!list2.isEmpty()) && (c122q = this.LLLLLJLJLL) != null && (listNt = c122q.nt(getSceneContext(), list2, C0CHQ.LIZ().getGson())) != null) || (listNt = C13BV.INSTANCE) != null) && !listNt.isEmpty()) {
            ((ArrayList) this.LLLFFI).addAll(listNt);
        }
        C1664740tQG c1664740tQG = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZ;
        InterfaceC1457990o2n interfaceC1457990o2n = (InterfaceC1457990o2n) c1664740tQG.getValue(this, interfaceC2217461BqaArr[10]);
        if (interfaceC1457990o2n != null && (interactStickerStruct2 = interfaceC1457990o2n.getInteractStickerStruct()) != null) {
            ((ArrayList) this.LLLFFI).add(interactStickerStruct2);
        }
        InterfaceC1450440nqc interfaceC1450440nqc = (InterfaceC1450440nqc) this.LLJJLIIIJLLLLLLLZ.getValue(this, interfaceC2217461BqaArr[6]);
        if (interfaceC1450440nqc != null && (interactStickerStruct = interfaceC1450440nqc.getInteractStickerStruct()) != null && (!interactStickerStruct.isEmpty())) {
            ((ArrayList) this.LLLFFI).addAll(interactStickerStruct);
        }
        C1429890nJT mainBusinessContext = LLLLLLL().getMainBusinessContext();
        if (mainBusinessContext != null && (shareContext = mainBusinessContext.getShareContext()) != null && (attributionLinkStickerStruct = shareContext.attributionLinkStickerStruct) != null && C123100dR.LIZ(attributionLinkStickerStruct.getUrl()) && C123100dR.LIZ(attributionLinkStickerStruct.getTitle())) {
            InteractStickerStruct interactStickerStruct3 = new InteractStickerStruct();
            interactStickerStruct3.setType(103);
            interactStickerStruct3.setAttributionLinkStickerStruct(attributionLinkStickerStruct);
            interactStickerStruct3.setNoGlobal(true);
            interactStickerStruct3.getTrackList();
            InfoStickerModel infoStickerModel2 = LLLLLLL().getInfoStickerModel();
            if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null) {
                Iterator<StickerItemModel> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (interactStickerStruct3.getType() == 103) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                StickerItemModel stickerItemModel = next;
                if (stickerItemModel != null) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setStartTime(0.0f);
                    normalTrackTimeStamp.setEndTime(stickerItemModel.endTime);
                    normalTrackTimeStamp.setScale(Float.valueOf(stickerItemModel.scale));
                    normalTrackTimeStamp.setX(stickerItemModel.currentOffsetX);
                    normalTrackTimeStamp.setY(stickerItemModel.currentOffsetY);
                    normalTrackTimeStamp.setRotation(360.0f - stickerItemModel.rotateAngle);
                    C19591311kt c19591311kt = C19591311kt.LIZ;
                    List listSingletonList = Collections.singletonList(normalTrackTimeStamp);
                    c19591311kt.getClass();
                    C19591311kt.LJIIIZ(interactStickerStruct3, listSingletonList);
                }
            }
            ((ArrayList) this.LLLFFI).add(interactStickerStruct3);
        }
        LLLLLLL().setMainBusinessData(C1429860nJQ.LJIIIZ(LLLLLLL().getMainBusinessContext(), this.LLLFFI, EnumC1428480nHC.TRACK_PAGE_EDIT));
    }

    public InterfaceC196906122e LLLLLIL() {
        return new InterfaceC196906122e() { // from class: X.0o9R
            @Override // X.InterfaceC196906122e
            public final Pair<Integer, Integer> LJLIL() {
                return null;
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLILLLLZI() {
                return false;
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLJI() {
                return true;
            }

            @Override // X.InterfaceC196906122e
            public final InfoStickerModel LJLI() {
                return this.LIZ.LLLLLLL().getInfoStickerModel();
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLIIIL() {
                return !C1428470nHB.LJJLIIIJLLLLLLLZ(this.LIZ.LLLLLLL());
            }

            @Override // X.InterfaceC196906122e
            public final boolean LJLIIL() {
                InterfaceC377540ErA interfaceC377540ErALLLLLL;
                C1462070o9N c1462070o9N = this.LIZ;
                InterfaceC366660EZc interfaceC366660EZc = (InterfaceC366660EZc) c1462070o9N.LLJJJJJIL.getValue(c1462070o9N, C1462070o9N.LLLLLZ[5]);
                return (interfaceC366660EZc == null || interfaceC366660EZc.uE2()) && !this.LIZ.LLLLIILL() && ((interfaceC377540ErALLLLLL = this.LIZ.LLLLLL()) == null || !interfaceC377540ErALLLLLL.isShowing());
            }

            @Override // X.InterfaceC196906122e
            public final int[] LJLJJI(View view) {
                NowsExtra nowsExtra;
                if (C1428470nHB.LJJLIIIJLLLLLLLZ(this.LIZ.LLLLLLL())) {
                    NowsShootModel nowsShootModel = this.LIZ.LLLLLLL().creativeModel.nowsShootModel;
                    if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
                        return null;
                    }
                    C578880Mn8.LIZIZ(this.LIZ.requireSceneContext(), view);
                    return new int[]{0, C578100Mls.LIZJ(this.LIZ.requireSceneContext())};
                }
                return null;
            }
        };
    }

    public final InterfaceC1455850nzL LLLLLILLIL() {
        return (InterfaceC1455850nzL) this.LLJJIJIL.getValue(this, LLLLLZ[1]);
    }

    public final InterfaceC1455860nzM LLLLLJIL() {
        return (InterfaceC1455860nzM) this.LLJJJ.getValue(this, LLLLLZ[2]);
    }

    public final InterfaceC1456910o13 LLLLLJLJLL() {
        return (InterfaceC1456910o13) this.LLJLILLLLZIIL.getValue(this, LLLLLZ[7]);
    }

    public final InterfaceC377540ErA LLLLLL() {
        return (InterfaceC377540ErA) this.LLJLLIL.getValue(this, LLLLLZ[8]);
    }

    public final InterfaceC391240FVq LLLLLLIL() {
        return (InterfaceC391240FVq) this.LLLLIL.getValue();
    }

    public final InterfaceC1461650o8h LLLLLLJ() {
        InterfaceC1461650o8h interfaceC1461650o8h = this.LLLLLILLIL;
        if (interfaceC1461650o8h != null) {
            return interfaceC1461650o8h;
        }
        return null;
    }

    public final VideoPublishEditModel LLLLLLL() {
        return (VideoPublishEditModel) this.LLJJJIL.getValue(this, LLLLLZ[3]);
    }

    public final InterfaceC1461660o8i LLLLLLLLL() {
        InterfaceC1461660o8i interfaceC1461660o8i = this.LLLLLL;
        if (interfaceC1461660o8i != null) {
            return interfaceC1461660o8i;
        }
        return null;
    }

    public C124T LLLLLLLLLL() {
        return (C124T) this.LLLLLLLLL.getValue();
    }

    public final void LLLLLZL() {
        if (this.LLLLLLLZIL) {
            return;
        }
        this.LLLLLLLZIL = true;
        LLLLLLJ().show();
        LLLLLJIL().MW1().observe(this, new AObserverS225S0100000_22(this, 112));
        C1451630nsX c1451630nsX = (C1451630nsX) this.LLJLLL.getValue(this, LLLLLZ[9]);
        if (c1451630nsX != null) {
            c1451630nsX.LIZ(Collections.singletonList(new C2217381BqS() { // from class: X.0mkx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1408460mku) obj).LIZIZ);
                }
            }), this, new AObjectS245S0100000_22(this, 203));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZ() {
        /*
            Method dump skipped, instruction units count: 2525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462070o9N.LLLLZ():void");
    }

    public final boolean LLLLZLL() {
        MutableLiveData<Boolean> mutableLiveDataMk0;
        if (this.LLJLL == null && LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditStickerApi is not ready when EditStickerScene.isEditing (lifecycle: ");
            sbLIZ.append(getLifecycle().getCurrentState());
            sbLIZ.append(", sceneState: ");
            sbLIZ.append(this.mState.getName());
            sbLIZ.append(", creationId: ");
            sbLIZ.append(LLLLLLL().getCreationId());
            sbLIZ.append(')');
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LLJLL == null && !LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            this.LLJLL = (InterfaceC1461350o8D) this.LLJILLL.LJII(InterfaceC1461350o8D.class, null);
        }
        C122Q c122q = this.LLLLLJLJLL;
        if (c122q != null && c122q.LLLLZLLIL()) {
            return true;
        }
        InterfaceC1461350o8D interfaceC1461350o8D = this.LLJLL;
        return (interfaceC1461350o8D == null || (mutableLiveDataMk0 = interfaceC1461350o8D.Mk0()) == null || !Intrinsics.LJFF(mutableLiveDataMk0.getValue(), Boolean.TRUE)) ? false : true;
    }

    @Override // X.InterfaceC1406950miT
    public final void Bl() {
        C1456140nzo.LIZIZ(LLLLLJIL(), true, false, false, false, 12);
    }

    public boolean C1() {
        return LLLLLLLLL().LJLL() || C1466090oFr.LJIIL(LLLLLLL().creativeModel.stickerModel);
    }

    @Override // X.InterfaceC1406950miT
    public final void Ho() {
        C1456140nzo.LIZIZ(LLLLLJIL(), false, false, false, false, 12);
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJJIIZ() {
        LLLLLLJ().Nm();
    }

    @Override // X.InterfaceC1444170ngV
    public List<TextStickerData> LJJL() {
        return LLLLLLLLL().Et0();
    }

    @Override // X.InterfaceC1444170ngV
    public final boolean LLIIIZ() {
        return LLLLLLLLL().c0();
    }

    public final boolean LLLLIILL() {
        CreativeModel creativeModel;
        AutoCutModel autoCutModel;
        if (LLLLLLL().mIsFromDraft) {
            return false;
        }
        new Object() { // from class: X.0o9o
        }.getClass();
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_autocut_display_title", true) == 2 && TextUtils.equals("EN", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage().toUpperCase(Locale.ROOT))) || C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_autocut_display_title", true) == 1) {
            return LLLLLLL().isCurrentAutoCutMode() || !((creativeModel = LLLLLLL().creativeModel) == null || (autoCutModel = creativeModel.autoCutModel) == null || !autoCutModel.backwardAutoCutProcess);
        }
        return false;
    }

    public C124T LLLLJI() {
        return (C124T) C786410Ut5.LJLLLL((ViewStub) requireViewById(R.id.view_stub_text_sticker_layout));
    }

    public List<?> LLLLL() {
        InterfaceC391240FVq interfaceC391240FVqLLLLLLIL = LLLLLLIL();
        if (interfaceC391240FVqLLLLLLIL != null) {
            return interfaceC391240FVqLLLLLLIL.LLLILZLLLI(EnumC1466150oFx.DM_GROUP_CHAT);
        }
        return null;
    }

    public final C196925122x LLLLLLZ() {
        C122Q c122q;
        List<C196925122x> listHt;
        if (C1416310mxZ.LJJLIIIJJIZ(LLLLLLL()) || (c122q = this.LLLLLJLJLL) == null || (listHt = c122q.ht()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : listHt) {
            C196925122x c196925122x2 = c196925122x;
            if (C0FVW.LIZIZ(c196925122x2) && (c196925122x2 instanceof AnonymousClass1233)) {
                arrayList.add(c196925122x);
            }
        }
        return (C196925122x) C13LP.LJJJLZIJ(0, arrayList);
    }

    public final void LLLLLLZZ() {
        List<?> listLLLLL = LLLLL();
        if (listLLLLL != null && !listLLLLL.isEmpty()) {
            IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
            int i = (iGroupChatStickerApi == null || !iGroupChatStickerApi.LIZLLL()) ? 2131845528 : 2131838718;
            Activity activity = this.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(i);
                creativeToastBuilder.duration(3000L);
                C1390380mHk.LIZ(activity, 9001, creativeToastBuilder);
                return;
            }
            return;
        }
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            C13DA c13da = new C13DA();
            String strLJJIIJ = C1428470nHB.LJJIIJ(LLLLLLL(), false);
            if (strLJJIIJ != null && strLJJIIJ.length() > 0) {
                c13da.put("shoot_enter_from", strLJJIIJ);
            }
            String shootEnterMethod = LLLLLLL().getShootEnterMethod();
            if (shootEnterMethod != null && shootEnterMethod.length() > 0) {
                c13da.put("shoot_enter_method", shootEnterMethod);
            }
            Map mapBuild = c13da.build();
            IGroupChatStickerApi iGroupChatStickerApi2 = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
            if (iGroupChatStickerApi2 != null) {
                iGroupChatStickerApi2.LIZJ(sceneContext, false, new AwS388S0200000_22(this, (C1462070o9N) mapBuild, (Map<String, String>) 137), "click_sticker_on_panel", mapBuild);
            }
        }
    }

    public final boolean LLLLLZ() {
        return LLLLLLLLL().LJJJLZIJ();
    }

    public final void LLLLZIL() {
        if (!C1416310mxZ.LJJLIIIJJIZ(LLLLLLL()) && !this.LLLLLLZ) {
            C122Q c122q = this.LLLLLJLJLL;
            if (c122q != null) {
                c122q.show();
            }
            LLLZZIL();
            C122Q c122q2 = this.LLLLLJLJLL;
            if (c122q2 != null) {
                c122q2.Ss(new InterfaceC196915122n() { // from class: X.0o9Q
                    @Override // X.InterfaceC196915122n
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC196915122n
                    public final void LIZIZ() {
                        if (C545820Lau.LIZIZ(this.LIZ) == null) {
                            return;
                        }
                        this.LIZ.getClass();
                    }

                    @Override // X.InterfaceC196915122n
                    public final void LIZJ() {
                        C0FWY c0fwy = C0FWY.LIZ;
                        ShortVideoCommonParams shortVideoCommonParams = new ShortVideoCommonParams(this.LIZ.LLLLLLL().mShootWay, C1428470nHB.LJIILIIL(this.LIZ.LLLLLLL()), C1428470nHB.LJIILL(this.LIZ.LLLLLLL()), this.LIZ.LLLLLLL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null);
                        c0fwy.getClass();
                        C0FWY.LJI(shortVideoCommonParams);
                    }

                    @Override // X.InterfaceC196915122n
                    public final void LIZ(C196931123d c196931123d) {
                        if (c196931123d.LIZJ) {
                            if (!c196931123d.LJ) {
                                C1456140nzo.LIZIZ(this.LIZ.LLLLLJIL(), true, true, false, false, 12);
                            }
                            this.LIZ.LLLIIIIL = false;
                            return;
                        }
                        C1462070o9N c1462070o9N = this.LIZ;
                        if (!c1462070o9N.LLLIIIIL) {
                            C1456140nzo.LIZIZ(c1462070o9N.LLLLLJIL(), false, true, false, false, 12);
                            this.LIZ.LLLLLLJ().LJJJLZIJ();
                            C122Q c122q3 = this.LIZ.LLLLLJLJLL;
                            if (c122q3 != null) {
                                c122q3.LJJJLZIJ();
                            }
                            this.LIZ.LLLLLZL();
                            InterfaceC1461650o8h interfaceC1461650o8hLLLLLLJ = this.LIZ.LLLLLLJ();
                            if (interfaceC1461650o8hLLLLLLJ.X7() != null) {
                                interfaceC1461650o8hLLLLLLJ.pausePlay();
                            }
                        }
                        this.LIZ.LLLIIIIL = true;
                    }

                    @Override // X.InterfaceC196915122n
                    public final void Yo(C196925122x c196925122x) {
                        C0FWT c0fwt;
                        TextStickerData data = c196925122x.getData();
                        if (data != null && (c0fwt = this.LIZ.LLLIIIL) != null) {
                            String speakerID = data.getSpeakerID();
                            if (speakerID == null) {
                                speakerID = "";
                            }
                            c0fwt.KJ(speakerID, data);
                        }
                    }
                });
            }
            C122Q c122q3 = this.LLLLLJLJLL;
            if (c122q3 != null) {
                c122q3.T3(new AwS601S0100000_22(this, 505));
            }
            C122Q c122q4 = this.LLLLLJLJLL;
            if (c122q4 != null) {
                c122q4.V1(new AwS636S0100000_22(this, 30));
            }
            C122Q c122q5 = this.LLLLLJLJLL;
            if (c122q5 != null) {
                c122q5.f8(new AwS584S0100000_5(this, 186));
            }
            C122Q c122q6 = this.LLLLLJLJLL;
            if (c122q6 != null) {
                c122q6.Jl(new InterfaceC196910122i() { // from class: X.0o9b
                    @Override // X.InterfaceC196910122i
                    public final float LIZ(float f) {
                        return 0.0f;
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LIZJ(C196925122x c196925122x) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final int LIZLLL(C196925122x c196925122x, boolean z, boolean z2) {
                        return 0;
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LJ(C196925122x c196925122x, boolean z, Integer num) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LJFF(C196925122x c196925122x) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LJI(C196925122x c196925122x, C196931123d c196931123d) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LJII(C196925122x c196925122x) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final void LJIIIIZZ(C196925122x c196925122x) {
                    }

                    @Override // X.InterfaceC196910122i
                    public final PointF LIZIZ(C196925122x c196925122x, float f, float f2) {
                        return new PointF();
                    }
                });
            }
            C122Q c122q7 = this.LLLLLJLJLL;
            if (c122q7 != null) {
                c122q7.zl(new InterfaceC196928123a() { // from class: X.0FVN
                    @Override // X.InterfaceC196928123a
                    public final void LIZ() {
                        NLEModel nLEModel;
                        if (this.LIZ.LLLLLJIL().gc() == null) {
                            return;
                        }
                        InterfaceC1452170ntP value = this.LIZ.LLLLLJIL().g().getValue();
                        if (value == null || (nLEModel = C352130DrH.LIZ(value)) == null) {
                            nLEModel = new NLEModel();
                        }
                        u4.LJJL(this.LIZ.LLLLLLL(), nLEModel, this.LIZ.LLLLLLL().creativeModel.postPageModel.isEnterFromEPDirectly ? "ep_to_publish_before" : "edit_to_publish_before", true);
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LIZLLL() {
                        u4.LJJLL(this.LIZ.LLLLLLL(), false);
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LJI() {
                        u4.LJJLIIJ(this.LIZ.LLLLLLL());
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LJ(String str) {
                        u4.LJJLJLI(24, this.LIZ.LLLLLLL(), str, null);
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LJFF(C196925122x c196925122x) {
                        if (C0FVW.LIZ(c196925122x)) {
                            return;
                        }
                        u4.LJJLIIIIJ(this.LIZ.LLLLLLL(), "click_text", 0, c196925122x, null, null, null, null, null, null, 1008);
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LIZIZ(String str, boolean z) {
                        u4.LJJLJ(this.LIZ.LLLLLLL(), str, null, z, 24);
                        if (z) {
                            C0FWY.LJFF(C0FWY.LIZ, new ShortVideoCommonParams(this.LIZ.LLLLLLL().mShootWay, C1428470nHB.LJIILIIL(this.LIZ.LLLLLLL()), C1428470nHB.LJIILL(this.LIZ.LLLLLLL()), this.LIZ.LLLLLLL().getCreationId(), 0, 0, 0, 0, null, null, null, null, null, 8176, null), "bubble");
                        }
                    }

                    @Override // X.InterfaceC196928123a
                    public final void LIZJ(int i, String str, String str2) {
                        u4.LJJLIIIJL(this.LIZ.LLLLLLL(), i, str, str2, 0, null);
                    }
                });
            }
            C122Q c122q8 = this.LLLLLJLJLL;
            if (c122q8 != null) {
                c122q8.xg0(new InterfaceC196933123f() { // from class: X.0o9c
                    @Override // X.InterfaceC196933123f
                    public final void LIZ() {
                        u4.LJJLIL(this.LIZ.LLLLLLL(), null);
                    }

                    @Override // X.InterfaceC196933123f
                    public final void LIZIZ() {
                        u4.LJJLIL(this.LIZ.LLLLLLL(), null);
                    }

                    @Override // X.InterfaceC196933123f
                    public final void LIZJ() {
                        u4.LJJLIL(this.LIZ.LLLLLLL(), null);
                    }
                });
            }
        }
        this.LLLLLLZ = true;
    }

    public final void LLLLZLLLI() {
        MutableLiveData<Pair<String, Integer>> mutableLiveDataVn;
        LiveData<Unit> liveDataKp2;
        LiveData<Unit> liveDataB91;
        MutableLiveData<Integer> mutableLiveDataTk;
        MutableLiveData<Integer> mutableLiveDataGl;
        MutableLiveData<Integer> mutableLiveDataRv;
        LiveEvent<Long> liveEventBi0;
        C385670FAf<List<CaptionUtterance>> c385670FAfSF;
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL != null && (c385670FAfSF = interfaceC1456910o13LLLLLJLJLL.sF()) != null) {
            c385670FAfSF.LIZ(this, new AObjectS240S0100000_5(this, 31));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL2 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL2 != null && (liveEventBi0 = interfaceC1456910o13LLLLLJLJLL2.bi0()) != null) {
            liveEventBi0.LIZ(this, new AObjectS240S0100000_5(this, 32));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL3 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL3 != null && (mutableLiveDataRv = interfaceC1456910o13LLLLLJLJLL3.Rv()) != null) {
            mutableLiveDataRv.observe(this, new AObserverS209S0100000_5(this, 20));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL4 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL4 != null && (mutableLiveDataGl = interfaceC1456910o13LLLLLJLJLL4.Gl()) != null) {
            mutableLiveDataGl.observe(this, new AObserverS209S0100000_5(this, 21));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL5 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL5 != null && (mutableLiveDataTk = interfaceC1456910o13LLLLLJLJLL5.tk()) != null) {
            mutableLiveDataTk.observe(this, new AObserverS209S0100000_5(this, 22));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL6 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL6 != null && (liveDataB91 = interfaceC1456910o13LLLLLJLJLL6.b91()) != null) {
            liveDataB91.observe(this, new AObserverS225S0100000_22(this, 113));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL7 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL7 != null && (liveDataKp2 = interfaceC1456910o13LLLLLJLJLL7.Kp2()) != null) {
            liveDataKp2.observe(this, new AObserverS225S0100000_22(this, 114));
        }
        InterfaceC1456910o13 interfaceC1456910o13LLLLLJLJLL8 = LLLLLJLJLL();
        if (interfaceC1456910o13LLLLLJLJLL8 == null || (mutableLiveDataVn = interfaceC1456910o13LLLLLJLJLL8.Vn()) == null) {
            return;
        }
        mutableLiveDataVn.observe(this, new AObserverS209S0100000_5(this, 23));
    }

    public final void LLLZ() {
        C0CHQ.LIZ().getApplicationService().getClass();
        if (C2214201BlK.LJIIJJI) {
            return;
        }
        InterfaceC1452170ntP value = LLLLLJIL().g().getValue();
        if (value != null) {
            value.setLoopPlay(true);
        }
        InterfaceC1452170ntP value2 = LLLLLJIL().g().getValue();
        if (value2 != null) {
            value2.play();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZ() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLLLL()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJIIJZLJL(r0)
            r3 = 1
            if (r0 != 0) goto L28
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLLLL()
            boolean r0 = r0.hadRecordWithVolume()
            if (r0 != 0) goto L28
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.LLLLLLL()
            boolean r0 = r1.hasMusic()
            if (r0 == 0) goto L54
            float r1 = r1.getMusicVolume()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L54
        L28:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLLLL()
            X.0F1d r1 = r0.getSubtitleMusicChangeChecker()
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLLLL()
            boolean r0 = r1.hasChanged(r0)
            if (r0 != r3) goto L54
        L3c:
            X.199r r0 = r4.getScope()
            java.lang.String r2 = "needRecognize"
            java.lang.Object r1 = r0.LJ(r2)
            X.0o9m r1 = (X.C1462320o9m) r1
            if (r1 == 0) goto L56
            r1.LIZ = r3
            X.199r r0 = r4.getScope()
            r0.LJI(r2, r1)
            return
        L54:
            r3 = 0
            goto L3c
        L56:
            X.199r r1 = r4.getScope()
            X.0o9m r0 = new X.0o9m
            r0.<init>(r3)
            r1.LJI(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462070o9N.LLLZZ():void");
    }

    public void LLLZZIL() {
        VESize initSize;
        InterfaceC1452170ntP value = LLLLLJIL().g().getValue();
        Pair<Integer, Integer> pair = (value == null || (initSize = value.getInitSize()) == null) ? null : new Pair<>(Integer.valueOf(initSize.width), Integer.valueOf(initSize.height));
        C122Q c122q = this.LLLLLJLJLL;
        if (c122q != null) {
            c122q.b(pair);
        }
        AnonymousClass1229 anonymousClass1229 = this.LLJZ;
        if (anonymousClass1229 == null || pair == null) {
            return;
        }
        int iIntValue = Integer.valueOf(pair.getFirst().intValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass1229.mView.getLayoutParams();
        marginLayoutParams.width = iIntValue;
        marginLayoutParams.setMarginStart((ScreenUtils.getScreenWidth(anonymousClass1229.mView.getContext()) - iIntValue) / 2);
        C786410Ut5.W5(anonymousClass1229.mView, marginLayoutParams);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1455850nzL interfaceC1455850nzLLLLLLILLIL = LLLLLILLIL();
        if (interfaceC1455850nzLLLLLLILLIL != null) {
            interfaceC1455850nzLLLLLLILLIL.eg0(null);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (!C1416310mxZ.LJJLIIIJJIZ(LLLLLLL()) || this.LLLLLLL.isInitialized()) {
            C124T c124tLLLLLLLLLL = LLLLLLLLLL();
            C786410Ut5.B3(c124tLLLLLLLLLL.LLILLL.getViewTreeObserver(), c124tLLLLLLLLLL.LLLI);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if ((!C1428470nHB.LJJZZI(LLLLLLL()) && !C1428470nHB.LLIIIJ(LLLLLLL())) || !this.LLLLLJIL) {
            LLLLLLLLL().i7(null);
            this.LLLLLJIL = true;
        }
        this.LLLIIIIL = false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public static boolean LLLLILI(String str) {
        if (str == null) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public static final void LLLLZLLIL(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1111, c0mvy, C0LD3.DUAL_BALL_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    @Override // X.InterfaceC1444170ngV
    public final void LJJJJIZL(C1453040nuo c1453040nuo) {
        LLLLJ(C1697810uHb.LJIIJJI(EnumC1466150oFx.POLL, EnumC1466150oFx.COMMENT, EnumC1466150oFx.DONATION, EnumC1466150oFx.MENTION, EnumC1466150oFx.HASH_TAG, EnumC1466150oFx.LIVE_COUNTDOWN, EnumC1466150oFx.LOCATION));
        if (c1453040nuo == null || c1453040nuo.LIZ) {
            LLLLLLLLL().Yr();
        }
        LJLI();
    }

    public final void LLLLJ(List<? extends EnumC1466150oFx> list) {
        List<StickerModel> listLLLILZLLLI;
        for (EnumC1466150oFx enumC1466150oFx : list) {
            InterfaceC391240FVq interfaceC391240FVqLLLLLLIL = LLLLLLIL();
            if (interfaceC391240FVqLLLLLLIL != null && (listLLLILZLLLI = interfaceC391240FVqLLLLLLIL.LLLILZLLLI(enumC1466150oFx)) != null) {
                for (StickerModel stickerModel : listLLLILZLLLI) {
                    InterfaceC391240FVq interfaceC391240FVqLLLLLLIL2 = LLLLLLIL();
                    if (interfaceC391240FVqLLLLLLIL2 != null) {
                        interfaceC391240FVqLLLLLLIL2.XJ(stickerModel.getId(), null, EnumC356070Dxd.COMMIT);
                    }
                }
            }
        }
    }

    public void LLLZIL(C539960LFq c539960LFq) {
        if (!C1416310mxZ.LJJLIIIJJIZ(LLLLLLL())) {
            EnumC371580EhY enumC371580EhY = EnumC371580EhY.HIDE;
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.LAZY;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register slotUIComponent ");
            sbLIZ.append(C19671511xp.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(InterfaceC1461680o8k.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1461680o8k.class, C19671511xp.class, C12DV.class, R.id.e8o, enumC371580EhY, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, this, 127));
        }
    }

    public final void LLZ(Function1<? super InterfaceC1461350o8D, Unit> function1) {
        InterfaceC1461350o8D interfaceC1461350o8D = this.LLJLL;
        if (interfaceC1461350o8D != null) {
            function1.invoke(interfaceC1461350o8D);
            return;
        }
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && !this.LLJJI) {
            InterfaceC1461350o8D interfaceC1461350o8D2 = (InterfaceC1461350o8D) this.LLJILLL.LJII(InterfaceC1461350o8D.class, null);
            this.LLJLL = interfaceC1461350o8D2;
            function1.invoke(interfaceC1461350o8D2);
            return;
        }
        ((C0ETY) this.LLJILLL.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS388S0200000_22(this, function1, 128));
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C201955140j.LIZJ(C1632480saE.LIZIZ, "EditStickerScene onActivityCreated");
        C545820Lau.LIZIZ(this);
        C1462310o9l c1462310o9l = new C1462310o9l();
        if (C1441980ncy.LIZIZ(LLLLLLL())) {
            c1462310o9l.LIZ = C1428150nGf.LIZLLL();
        }
        C1654320t9S.LIZIZ(this, AFwS266S0000000_25.get$arr$(273));
        C1664590tQ1.LIZLLL(this, "EditStickerScene", false, new AwS388S0200000_22(this, c1462310o9l, 132), 2);
        C1664600tQ2.LIZ(this, "EditStickerScene", new AwS601S0100000_22(this, 502));
        C0LEK c0lekLJ = C1664600tQ2.LJ(this);
        this.LLJJIJIIJIL = c0lekLJ;
        C1642810sqt.LIZ(c0lekLJ, "edit_sticker");
        C0LEK c0lek = this.LLJJIJIIJIL;
        if (c0lek == null) {
            c0lek = null;
        }
        C1DRG c1drgLJFF = c0lek.LJFF();
        if (c1drgLJFF != null) {
            this.LLLLLJLJLL = (C122Q) c1drgLJFF.LJIIL(null, C122Q.class);
            this.LLLLLL = (InterfaceC1461660o8i) c1drgLJFF.LJII(InterfaceC1461660o8i.class, null);
            InterfaceC1455850nzL interfaceC1455850nzLLLLLLILLIL = LLLLLILLIL();
            if (interfaceC1455850nzLLLLLLILLIL != null) {
                interfaceC1455850nzLLLLLLILLIL.nK1((InterfaceC1461660o8i) c1drgLJFF.LJII(InterfaceC1461660o8i.class, null));
            }
            this.LLLLLLIL = (InterfaceC1465230oET) c1drgLJFF.LJIIL(null, InterfaceC1465230oET.class);
            this.LLLLLLJ = (C1455830nzJ) c1drgLJFF.LJIIL(null, C1455830nzJ.class);
            InterfaceC1455850nzL interfaceC1455850nzLLLLLLILLIL2 = LLLLLILLIL();
            if (interfaceC1455850nzLLLLLLILLIL2 != null) {
                interfaceC1455850nzLLLLLLILLIL2.XU(this.LLLLLLIL);
            }
            InterfaceC1455850nzL interfaceC1455850nzLLLLLLILLIL3 = LLLLLILLIL();
            if (interfaceC1455850nzLLLLLLILLIL3 != null) {
                interfaceC1455850nzLLLLLLILLIL3.fE2(this.LLLLLLJ);
            }
            this.LLJLIL = (InterfaceC2378409Tq) c1drgLJFF.LJII(InterfaceC2378409Tq.class, null);
            this.LLLLLILLIL = (InterfaceC1461650o8h) c1drgLJFF.LJII(InterfaceC1461650o8h.class, null);
            InterfaceC1455850nzL interfaceC1455850nzLLLLLLILLIL4 = LLLLLILLIL();
            if (interfaceC1455850nzLLLLLLILLIL4 != null) {
                interfaceC1455850nzLLLLLLILLIL4.eg0(this.LLLLLJLJLL);
            }
            this.LLLII = (InterfaceC1461680o8k) c1drgLJFF.LJIIL(null, InterfaceC1461680o8k.class);
            this.LLLLJI = (InterfaceC19627611qk) c1drgLJFF.LJIIL(null, InterfaceC19627611qk.class);
            this.LLLFF = (InterfaceC19627111qf) c1drgLJFF.LJIIL(null, InterfaceC19627111qf.class);
            this.LLLIIIL = (C0FWT) c1drgLJFF.LJIIL(null, C0FWT.class);
            C1659630tI1.LJIIIIZZ(this, null, null, 6).get(InfoStickerViewModel.class);
            this.LLLIL = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
            LLZ(new AwS601S0100000_22(this, 498));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1406950miT
    public final void L0(Effect effect, String str) {
        LLLZI(effect, str);
    }

    public void LLLLIIIILLL(DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo, Map<String, String> map) {
        InterfaceC391240FVq interfaceC391240FVqLLLLLLIL = LLLLLLIL();
        if (interfaceC391240FVqLLLLLLIL != null) {
            interfaceC391240FVqLLLLLLIL.f3(new DMGroupChatStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), dMGroupChatStickerGroupInfo, EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue(), false, false, map), EnumC356070Dxd.COMMIT);
        }
    }

    public final void LLLZI(Effect effect, String str) {
        C1634780sdw c1634780sdw;
        boolean z = false;
        if (!C1462570oAB.LJIIJJI(effect) && !C1462570oAB.LJFF(effect) && !C1462570oAB.LJI(effect) && ((effect.getTags() == null || !effect.getTags().contains("emoji")) && ((!C1462570oAB.LJIJI(effect) || C0BP7.LIZ()) && !C1462570oAB.LJIILIIL(effect)))) {
            z = true;
        }
        if (effect.getEffectType() != 10 && z && (c1634780sdw = (C1634780sdw) this.LLLILZ.getValue()) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL())), null, null, new C0ES7(effect, c1634780sdw, str, this, null), 3);
        }
    }

    @Override // X.InterfaceC1406950miT
    public void Ph(Effect effect, String str) {
        List<LyricStickerModel> listI4;
        Activity activity;
        List<StickerModel> listLLLILZLLLI;
        LLLLLZL();
        LLZ(AFwS261S0000000_22.get$arr$(215));
        LLLZI(effect, str);
        C1439740nZM c1439740nZM = (C1439740nZM) this.LLJJJJ.getValue(this, LLLLLZ[4]);
        AbstractC214814194y abstractC214814194yLIZIZ = C372650EjH.LIZIZ(this);
        c1439740nZM.getClass();
        new C1645820svk(C1624570sNT.LIZ(effect), abstractC214814194yLIZIZ).LIZ(new C1439760nZO(c1439740nZM, effect));
        if (C1462570oAB.LJII(effect)) {
            LLLLLLZZ();
            return;
        }
        if (C1462570oAB.LJIIJ(effect)) {
            return;
        }
        Map<String, String> mapLJIIIIZZ = null;
        stickerModel = null;
        StickerModel stickerModel = null;
        int i = 0;
        if (effect.getTags().contains("location")) {
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
            if (c1drgLJIIIZ != null) {
                ((InterfaceC1462260o9g) c1drgLJIIIZ.LJII(InterfaceC1462260o9g.class, null)).ew0();
                LLLLLJIL().uG0(false);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (C1462570oAB.LJIIIIZZ(effect)) {
            InterfaceC1462280o9i interfaceC1462280o9i = (InterfaceC1462280o9i) this.LLLILZLLLI.getValue();
            if (interfaceC1462280o9i != null) {
                interfaceC1462280o9i.ZC1(effect.getEffectId());
                interfaceC1462280o9i.dE1();
            }
            C858300Xlk.LIZ(EnumC1462160o9W.DONATION, LLLLLLL());
            return;
        }
        if (C1462570oAB.LIZJ(effect)) {
            if (u4.LJJIJIIJIL(LLLLLLL())) {
                InterfaceC1465010oE7 interfaceC1465010oE7 = (InterfaceC1465010oE7) this.LLLILZJ.getValue();
                if (interfaceC1465010oE7 == null) {
                    return;
                }
                interfaceC1465010oE7.rj(null);
                return;
            }
            InterfaceC1465010oE7 interfaceC1465010oE72 = (InterfaceC1465010oE7) this.LLLILZJ.getValue();
            if (interfaceC1465010oE72 == null) {
                return;
            }
            interfaceC1465010oE72.LJLLL("edit_page_sticker");
            return;
        }
        if (C1462570oAB.LJIJ(effect)) {
            this.LLJJIII.LJII();
            return;
        }
        if (C1462570oAB.LJIIL(effect)) {
            InterfaceC19627411qi interfaceC19627411qi = (InterfaceC19627411qi) this.LLLJIL.getValue();
            if (interfaceC19627411qi == null) {
                return;
            }
            interfaceC19627411qi.LJLLL("edit_page_sticker");
            return;
        }
        if (effect.getTags().contains("emojislidersticker")) {
            InterfaceC19627511qj interfaceC19627511qj = (InterfaceC19627511qj) this.LLLJL.getValue();
            if (interfaceC19627511qj == null) {
                return;
            }
            interfaceC19627511qj.LJLLL("edit_page_sticker");
            return;
        }
        if (C1462570oAB.LJIJJ(effect)) {
            return;
        }
        if (effect.getTags().contains("social_avatar_sticker")) {
            InterfaceC1462270o9h interfaceC1462270o9h = (InterfaceC1462270o9h) this.LLLLIIIILLL.getValue();
            if (interfaceC1462270o9h == null) {
                return;
            }
            interfaceC1462270o9h.W91(effect);
            return;
        }
        if (effect.getTags().contains("linksticker")) {
            if (LLLLLLIL() != null) {
                InterfaceC391240FVq interfaceC391240FVqLLLLLLIL = LLLLLLIL();
                if (interfaceC391240FVqLLLLLLIL != null && (listLLLILZLLLI = interfaceC391240FVqLLLLLLIL.LLLILZLLLI(EnumC1466150oFx.LINK)) != null) {
                    stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI);
                }
                if ((stickerModel instanceof LinkStickerModel) && stickerModel != null && (activity = this.mActivity) != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131824903);
                    creativeToastBuilder.duration(3000L);
                    C1390380mHk.LIZ(activity, 9001, creativeToastBuilder);
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
                InterfaceC19624811qI interfaceC19624811qI = (InterfaceC19624811qI) this.LLLLIIL.getValue();
                if (interfaceC19624811qI != null) {
                    interfaceC19624811qI.LJLLL("edit_page_sticker");
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
            }
            C201955140j.LIZJ(C1632480saE.LIZIZ, "EditStickerScene -> infiniStickerApi is null when adding link sticker");
            return;
        }
        if (effect.getTags().contains("secretreplies")) {
            InterfaceC1462290o9j interfaceC1462290o9j = (InterfaceC1462290o9j) this.LLLLIILLL.getValue();
            if (interfaceC1462290o9j == null) {
                return;
            }
            interfaceC1462290o9j.LJLLL("edit_page_sticker");
            return;
        }
        if (C1462570oAB.LJIILJJIL(effect)) {
            if (this.LLJL == null) {
                this.LLJL = (InterfaceC19626511qZ) this.LLLIL.LJIIL(null, InterfaceC19626511qZ.class);
            }
            InterfaceC19626511qZ interfaceC19626511qZ = this.LLJL;
            if (interfaceC19626511qZ != null) {
                interfaceC19626511qZ.hF(effect.getEffectId());
            }
            InterfaceC19626511qZ interfaceC19626511qZ2 = this.LLJL;
            if (interfaceC19626511qZ2 != null) {
                interfaceC19626511qZ2.A7(null);
            }
            C858300Xlk.LIZ(EnumC1462160o9W.LIVE_CD, LLLLLLL());
            return;
        }
        if (effect.getTags().contains("pollsticker")) {
            InterfaceC391240FVq interfaceC391240FVqLLLLLLIL2 = LLLLLLIL();
            if (interfaceC391240FVqLLLLLLIL2 != null) {
                C391270FVt.LIZ(InterfaceC391240FVq.LJJJJZ, EnumC1466150oFx.POLL, interfaceC391240FVqLLLLLLIL2, null, new AwS388S0200000_22(this, effect, 126), 4);
            }
            String effectId = effect.getEffectId();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", LLLLLLL().getCreationId());
            c0lab.LJ("shoot_way", LLLLLLL().mShootWay);
            c0lab.LJ("content_type", C1428470nHB.LJIILL(LLLLLLL()));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LLLLLLL()));
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("prop_id", effectId);
            c0lab.LJ("is_new_sticker_framework", CardStruct.IStatusCode.DEFAULT);
            C20684815ws.LJIILLIIL("poll_edit", c0lab.LIZ);
            C858300Xlk.LIZ(EnumC1462160o9W.POLL, LLLLLLL());
            return;
        }
        if (C1462570oAB.LJIILL(effect)) {
            C0EZ1 c0ez1 = (C0EZ1) this.LLLJ.getValue();
            if (c0ez1 != null && (listI4 = c0ez1.i4()) != null && !listI4.isEmpty()) {
                return;
            }
            C0EZ1 c0ez12 = (C0EZ1) this.LLLJ.getValue();
            if (c0ez12 != null) {
                c0ez12.ee(EnumC366550EYr.STICKER_PANEL);
            }
            C0EZ7.LIZIZ(LLLLLLL(), "click_on_video_edit_page", false);
            return;
        }
        if (C1462570oAB.LIZLLL(effect)) {
            InterfaceC19639511sf interfaceC19639511sf = (InterfaceC19639511sf) this.LLLLIILL.getValue();
            if (interfaceC19639511sf == null) {
                return;
            }
            interfaceC19639511sf.jm0(requireSceneContext(), "2");
            return;
        }
        if (C1462570oAB.LJIIZILJ(effect)) {
            if (C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS601S0100000_22(this, 499))) {
                return;
            }
            if (this.LLLFF == null) {
                this.LLLFF = (InterfaceC19627111qf) this.LLLIL.LJIIL(null, InterfaceC19627111qf.class);
            }
            InterfaceC19627111qf interfaceC19627111qf = this.LLLFF;
            if (interfaceC19627111qf != null) {
                interfaceC19627111qf.kD0(null, AFwS261S0000000_22.get$arr$(217));
            }
            C858300Xlk.LIZ(EnumC1462160o9W.MENTION, LLLLLLL());
            return;
        }
        if (effect.getTags().contains("hashtag")) {
            if (this.LLJZIJLIL == null) {
                this.LLJZIJLIL = (InterfaceC19625711qR) this.LLLIL.LJIIL(null, InterfaceC19625711qR.class);
            }
            InterfaceC19625711qR interfaceC19625711qR = this.LLJZIJLIL;
            if (interfaceC19625711qR != null) {
                interfaceC19625711qR.A7(null);
            }
            C858300Xlk.LIZ(EnumC1462160o9W.HASHTAG, LLLLLLL());
            return;
        }
        if (!C1462570oAB.LJ(effect) && !C1635160seY.LIZ(effect) && !C1462570oAB.LJFF(effect)) {
            if (C1462570oAB.LJIILLIIL(effect)) {
                InterfaceC1461650o8h interfaceC1461650o8hLLLLLLJ = LLLLLLJ();
                if (interfaceC1461650o8hLLLLLLJ == null) {
                    return;
                }
                interfaceC1461650o8hLLLLLLJ.na2(effect, C2097608Jq.LJIIIIZZ(new Pair("extra", "MagnifierSticker"), new Pair("sticker_source", "2")));
                return;
            }
            if (C1462570oAB.LJIIIZ(effect)) {
                String strLJIIJJI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIJJI();
                if (strLJIIJJI != null) {
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("extra", strLJIIJJI), new Pair("sticker_source", "2"));
                }
                InterfaceC1461650o8h interfaceC1461650o8hLLLLLLJ2 = LLLLLLJ();
                if (interfaceC1461650o8hLLLLLLJ2 == null) {
                    return;
                }
                interfaceC1461650o8hLLLLLLJ2.na2(effect, mapLJIIIIZZ);
                return;
            }
            List<String> tags = effect.getTags();
            if (tags != null && tags.contains("mix_studio_story_sticker")) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str != null) {
                    linkedHashMap.put("extra", str);
                }
                linkedHashMap.put("sticker_source", "2");
                linkedHashMap.put("skip_info_sticker_apply_size", "1");
                InterfaceC1461650o8h interfaceC1461650o8hLLLLLLJ3 = LLLLLLJ();
                if (interfaceC1461650o8hLLLLLLJ3 != null) {
                    interfaceC1461650o8hLLLLLLJ3.na2(effect, linkedHashMap);
                }
                C858300Xlk.LIZ(EnumC1462160o9W.INFO, LLLLLLL());
                return;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str != null) {
                linkedHashMap2.put("extra", str);
            }
            linkedHashMap2.put("sticker_source", "2");
            LLLLLLJ().na2(effect, linkedHashMap2);
            C858300Xlk.LIZ(EnumC1462160o9W.INFO, LLLLLLL());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, Object> concurrentHashMapLIZ = C178100mJ.LIZ(str);
        if (concurrentHashMapLIZ != null) {
            final AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(this, (C1462070o9N) concurrentHashMapLIZ, (ConcurrentHashMap<String, Object>) 65);
            InterfaceC1452170ntP value = LLLLLJIL().g().getValue();
            if (value != null && value.getState() != VEEditor.VEState.STARTED) {
                int iLLL = value.LLL();
                if (iLLL >= 0) {
                    i = iLLL;
                }
                if (value.bg(i, new InterfaceC1464140oCi() { // from class: X.0o9e
                    @Override // X.InterfaceC1464140oCi
                    public final int onGetImageData(byte[] bArr, int i2, int i3, int i4, float f) {
                        C01TT.LIZLLL(new AwS566S0100000_22(awS423S0200000_22, (Function0<Boolean>) 721));
                        return 0;
                    }
                }) != 0) {
                    awS423S0200000_22.invoke();
                }
            } else {
                awS423S0200000_22.invoke();
            }
            if (C1462570oAB.LJ(effect)) {
                Object obj = concurrentHashMapLIZ.get("path");
                if ((obj instanceof String) && C300230Bpl.LIZ()) {
                    C1431680nMM c1431680nMM = (C1431680nMM) this.LLLIIII.getValue();
                    C23250099c.LIZLLL((InterfaceC497601wk) c1431680nMM.LIZJ.getValue(), null, null, new C1431670nML(c1431680nMM, effect.getEffectId(), (String) obj, null), 3);
                }
            }
        }
        C858300Xlk.LIZ(EnumC1462160o9W.CUSTOM, LLLLLLL());
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLFZ = (FrameLayout) requireViewById(R.id.xqt);
        this.LLLI = (FrameLayout) requireViewById(R.id.i3w);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15O7<kotlin.Unit> LLLLLLLZIL(X.InterfaceC1452170ntP r12, X.InterfaceC384890F7f r13, kotlin.jvm.functions.Function2<? super java.lang.String, ? super X.EnumC20228214Cy, java.lang.String> r14) {
        /*
            r11 = this;
            X.0o8i r0 = r11.LLLLLLLLL()
            boolean r0 = r0.LJLL()
            if (r0 == 0) goto L98
            if (r14 == 0) goto L18
            java.lang.String r1 = "text_sticker"
            X.14Cy r0 = X.EnumC20228214Cy.TEXT_STICKER
            java.lang.Object r6 = r14.invoke(r1, r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L2e
        L18:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0o7a r2 = r0.getPathAdapter()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r11.LLLLLLL()
            java.lang.String r0 = ""
            java.lang.String r6 = r2.LJIJ(r1, r0)
        L2e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r11.LLLLLLL()
            com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r0 = r0.getInfoStickerModel()
            if (r0 == 0) goto L3b
            r0.clearTextStickers()
        L3b:
            X.0ngR r0 = r13.LLJIJIL()
            int r7 = r0.LJFF()
            X.0ngR r0 = r13.LLJIJIL()
            int r8 = r0.LIZJ()
            com.ss.android.vesdk.VESize r0 = r12.getInitSize()
            int r9 = r0.width
            com.ss.android.vesdk.VESize r0 = r12.getInitSize()
            int r10 = r0.height
            X.122Q r2 = r11.LLLLLJLJLL
            if (r2 == 0) goto L83
            X.123e r5 = new X.123e
            r5.<init>(r6, r7, r8, r9, r10)
            android.widget.FrameLayout r4 = r11.LLLFZ
            r3 = 0
            if (r4 != 0) goto L66
            r4 = r3
        L66:
            X.1DRG r1 = r11.LLJILLL
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.class
            java.lang.Object r1 = r1.LJII(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r1
            boolean r0 = X.C1428470nHB.LLIIIJ(r1)
            if (r0 != 0) goto L96
            boolean r0 = X.C1428470nHB.LLIIIL(r1)
            if (r0 != 0) goto L96
            r0 = 0
        L7d:
            X.15O7 r2 = r2.jI0(r5, r4, r0)
            if (r2 != 0) goto L89
        L83:
            X.05XG<V> r0 = new java.util.concurrent.Callable() { // from class: X.05XG
                static {
                    /*
                        X.05XG r0 = new X.05XG
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.05XG<V>) X.05XG.LL X.05XG
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XG.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XG.<init>():void");
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    /*
                        r2 = this;
                        java.lang.String r1 = "EditStickerScene@bf5d.compileText$2"
                        X.C1C7U.LIZ(r1)
                        X.13BV r0 = X.C13BV.INSTANCE
                        X.C1C7U.LIZIZ(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XG.call():java.lang.Object");
                }
            }
            X.15O7 r2 = X.C15O7.LIZ(r0)
        L89:
            X.0FXD r1 = new X.0FXD
            r0 = 1
            r1.<init>(r13, r12, r11, r0)
            X.08kh r0 = X.C15O7.LJIIIIZZ
            X.15O7 r0 = r2.LJIIZILJ(r1, r0)
            return r0
        L96:
            r0 = 1
            goto L7d
        L98:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.15O7 r0 = X.C15O7.LJIIJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1462070o9N.LLLLLLLZIL(X.0ntP, X.0F7f, kotlin.jvm.functions.Function2):X.15O7");
    }

    public final void LLLZLZ(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        LLLLLLLLL().LLLLJ();
        LLLLLLJ().a6(i, i2, new int[]{marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin});
        InterfaceC1452410ntn interfaceC1452410ntn = (InterfaceC1452410ntn) this.LLLLII.getValue();
        if (interfaceC1452410ntn != null) {
            interfaceC1452410ntn.wx(i, i2);
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eos, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLLZLL(C1462070o9N c1462070o9N, C388340FKm c388340FKm, Function1 function1, int i) {
        InterfaceC1449590npF interfaceC1449590npF;
        if ((i & 1) != 0) {
            c388340FKm = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        C1664740tQG c1664740tQG = c1462070o9N.LLLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLZ;
        InterfaceC1451520nsM interfaceC1451520nsM = (InterfaceC1451520nsM) c1664740tQG.getValue(c1462070o9N, interfaceC2217461BqaArr[13]);
        if (interfaceC1451520nsM != null) {
            interfaceC1451520nsM.m7("enter text sticker page");
        }
        if (c1462070o9N.LLLLLLL().creativeModel.initialModel.dmCameraModel.enterFromDM && C294750Bgv.LIZIZ && (interfaceC1449590npF = (InterfaceC1449590npF) c1462070o9N.LLLLLIL.getValue(c1462070o9N, interfaceC2217461BqaArr[14])) != null) {
            interfaceC1449590npF.m7("enter text sticker page");
        }
        if (!u4.LJIILIIL(c1462070o9N.LLLLLLL())) {
            if (C1416310mxZ.LJJLIIIJJIZ(c1462070o9N.LLLLLLL())) {
                if (c1462070o9N.LLLLLL != null) {
                    if (function1 != null) {
                        c1462070o9N.LLLLLLLLL().xr("edit_page_entrance", c388340FKm, function1);
                    } else {
                        c1462070o9N.LLLLLLLLL().xr("edit_page_entrance", c388340FKm, AFwS261S0000000_22.get$arr$(140));
                    }
                    View view = c1462070o9N.mView;
                    if (view != null) {
                        C0T6J.LIZ(view, AFwS210S0000000_22.get$arr$(252));
                        return;
                    }
                    return;
                }
                return;
            }
            C122Q c122q = c1462070o9N.LLLLLJLJLL;
            if (c122q != null && c122q.Mw0() != null) {
                c122q.Zn1(c122q.Mw0());
                return;
            }
            c1462070o9N.LLLZZIL();
            C122Q c122q2 = c1462070o9N.LLLLLJLJLL;
            if (c122q2 != null) {
                c122q2.Ze(null);
            }
            c1462070o9N.LLLLLLLLLL().setReadTextIcon(false);
            c1462070o9N.LLLLLLLLLL().LJII();
            c1462070o9N.LLLLLLLLLL().setCurrentClickTime(System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public C1462070o9N(C1DRG c1drg, int i, boolean z, InterfaceC1462140o9U interfaceC1462140o9U, int i2) {
        boolean z2 = false;
        i = (i2 & 2) != 0 ? 0 : i;
        z = (i2 & 4) != 0 ? false : z;
        this.LLJILLL = c1drg;
        this.LLJJ = i;
        this.LLJJI = z;
        this.LLJJIII = interfaceC1462140o9U;
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC391390FWf.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, C1439740nZM.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC366660EZc.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1450440nqc.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456910o13.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(c1drg, C1451630nsX.class, null);
        this.LLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457990o2n.class, null);
        this.LLLF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 726));
        this.LLLFFI = new ArrayList();
        this.LLLIIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 714));
        this.LLLIL = new C1DRG(new C1DRF[0]);
        this.LLLILZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(72));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 715));
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1465010oE7.class, null);
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 717));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 722));
        this.LLLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 181));
        this.LLLJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 719));
        this.LLLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 718));
        this.LLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 728));
        this.LLLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 727));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 725));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 720));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 711));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 723));
        this.LLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 182));
        this.LLLLILI = C1664770tQJ.LIZIZ(c1drg, InterfaceC19530111b1.class, null);
        this.LLLLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 731));
        this.LLLLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451520nsM.class, null);
        this.LLLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1449590npF.class, null);
        this.LLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 730));
        this.LLLLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 729));
        VideoPublishEditModel videoPublishEditModelLLLLLLL = LLLLLLL();
        if (((Boolean) C278960AwY.LIZ.getValue()).booleanValue()) {
            C1453810nw3.LIZ.getClass();
            if (C1453810nw3.LIZ(videoPublishEditModelLLLLLLL)) {
                z2 = true;
            }
        }
        this.LLLLLLLLLL = z2;
        this.LLLLLLZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 183));
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
