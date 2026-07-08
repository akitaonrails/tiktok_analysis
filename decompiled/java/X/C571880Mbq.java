package X;

import Y.ACallableS415S0100000_8;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.effect.DraftAllowListResult;
import com.ss.android.ugc.aweme.services.effect.IDraftAllowListProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571880Mbq {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C571880Mbq LIZ = new C571880Mbq();
    public static final ArrayList<String> LIZLLL = new ArrayList<>();
    public static final ArrayList<String> LJ = new ArrayList<>();
    public static final ArrayList<String> LJFF = new ArrayList<>();
    public static final ArrayList<String> LJI = new ArrayList<>();
    public static final ArrayList<String> LJII = new ArrayList<>();
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(185));
    public static final boolean LJIIIZ = C297640Bla.LIZ();

    public static void LIZJ() {
        C443120HZe c443120HZe;
        List<AwemeDraft> listQueryDraftList;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str;
        List<CanvasFilterParam> transformList;
        Boolean boolValueOf;
        InfoStickerModel infoStickerModelLJFF;
        try {
            listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, null, null, null, 126));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C0MAY.LIZIZ, "EPDraftProvider.getDraftListInternal error", e);
        }
        if (listQueryDraftList != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (AwemeDraft awemeDraft : listQueryDraftList) {
                String str2 = awemeDraft.LJII;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
                if (awemeDraft.LJFF() != null && (infoStickerModelLJFF = awemeDraft.LJFF()) != null && infoStickerModelLJFF.stickers != null) {
                    InfoStickerModel infoStickerModelLJFF2 = awemeDraft.LJFF();
                    for (StickerItemModel stickerItemModel : infoStickerModelLJFF2 != null ? infoStickerModelLJFF2.stickers : null) {
                        if (TextUtils.isEmpty(stickerItemModel.path)) {
                            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("InfoStickers_resdir_null:");
                            String str3 = stickerItemModel.stickerId;
                            if (str3 == null) {
                                str3 = "";
                            }
                            sbLIZ.append(str3);
                            interfaceC1637880siwLIZJ.LJI(C2188811AlT.LIZIZ(sbLIZ));
                        } else if (LJIIIZ) {
                            arrayList.add(stickerItemModel.path);
                            String str4 = stickerItemModel.pinAlgorithmFile;
                            if (str4 != null && str4.length() != 0) {
                                arrayList3.add("objectTracking");
                            }
                        } else {
                            String str5 = stickerItemModel.path;
                            arrayList.add(str5.substring(a0.LJJJJI(str5, File.separator, 0, 6) + 1));
                        }
                    }
                }
                for (EffectPointModel effectPointModel : awemeDraft.LJ()) {
                    if (TextUtils.isEmpty(effectPointModel.getResDir())) {
                        InterfaceC1637880siw interfaceC1637880siwLIZJ2 = C0CHQ.LIZ().LIZJ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("EffectListModel_resdir_null:");
                        sbLIZ2.append(effectPointModel.getKey() != null ? effectPointModel.getKey() : "");
                        interfaceC1637880siwLIZJ2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    } else if (LJIIIZ) {
                        arrayList.add(effectPointModel.getResDir());
                    } else {
                        arrayList.add(effectPointModel.getResDir().substring(a0.LJJJJI(effectPointModel.getResDir(), File.separator, 0, 6) + 1));
                    }
                }
                if (awemeDraft.LIZLLL() != null) {
                    DraftVEAudioEffectParam draftVEAudioEffectParamLIZLLL = awemeDraft.LIZLLL();
                    String str6 = draftVEAudioEffectParamLIZLLL != null ? draftVEAudioEffectParamLIZLLL.effectPath : null;
                    if (TextUtils.isEmpty(str6)) {
                        InterfaceC1637880siw interfaceC1637880siwLIZJ3 = C0CHQ.LIZ().LIZJ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("EffectListModel_resdir_null:");
                        sbLIZ3.append(str6 != null ? str6 : "");
                        interfaceC1637880siwLIZJ3.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                    } else if (LJIIIZ) {
                        arrayList.add(str6);
                    } else {
                        if (str6 == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        arrayList.add(str6.substring(a0.LJJJJI(str6, File.separator, 0, 6) + 1));
                    }
                }
                if (LJIIIZ) {
                    CanvasVideoData canvasVideoData = awemeDraft.LJJJJIZL.canvasVideoData;
                    if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<CanvasFilterParam> it2 = transformList.iterator();
                        while (it2.hasNext()) {
                            String animPath = it2.next().getAnimPath();
                            if (animPath != null && (boolValueOf = Boolean.valueOf(arrayList.add(animPath))) != null) {
                                arrayList4.add(boolValueOf);
                            }
                        }
                    }
                    CoverPublishModel coverPublishModel = awemeDraft.LJJJJIZL.coverPublishModel;
                    if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && (str = textSticker.path) != null) {
                        arrayList.add(str);
                    }
                    List<CombineEffectPointModel> list = awemeDraft.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
                    ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<CombineEffectPointModel> it3 = list.iterator();
                    while (it3.hasNext()) {
                        String resDir = it3.next().getResDir();
                        arrayList5.add(resDir != null ? Boolean.valueOf(arrayList.add(resDir)) : null);
                    }
                    if (awemeDraft.LJIIL() && (imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData) != null && (imageList = imageAlbumData.getImageList()) != null) {
                        Iterator<SingleImageData> it4 = imageList.iterator();
                        while (it4.hasNext()) {
                            ImageAdjustInfo adjustInfo = it4.next().getAdjustInfo();
                            if (adjustInfo != null) {
                                Iterator<Map.Entry<String, SingleAdjustInfo>> it5 = adjustInfo.getAdjustMap().entrySet().iterator();
                                while (it5.hasNext()) {
                                    arrayList.add(it5.next().getValue().getUnzipPath());
                                }
                            }
                        }
                    }
                }
            }
            c443120HZe = new C443120HZe(C13LP.LJJJJLI(arrayList), C13LP.LJJJJLI(arrayList2), C13LP.LJJJJLI(arrayList3));
        } else {
            C13BV c13bv = C13BV.INSTANCE;
            c443120HZe = new C443120HZe(c13bv, c13bv, c13bv);
        }
        if (!((Collection) c443120HZe.getFirst()).isEmpty()) {
            ArrayList<String> arrayList6 = LIZLLL;
            arrayList6.clear();
            arrayList6.addAll(new HashSet((Collection) c443120HZe.getFirst()));
        }
        if (!((Collection) c443120HZe.getSecond()).isEmpty()) {
            ArrayList<String> arrayList7 = LJ;
            arrayList7.clear();
            arrayList7.addAll(new HashSet((Collection) c443120HZe.getSecond()));
        }
        if (!((Collection) c443120HZe.getThird()).isEmpty()) {
            ArrayList<String> arrayList8 = LJFF;
            arrayList8.clear();
            arrayList8.addAll(new HashSet((Collection) c443120HZe.getThird()));
        }
    }

    public static void LIZIZ() {
        IDraftAllowListProvider iDraftAllowListProvider = (IDraftAllowListProvider) PluggableExtentionKt.pluggableSpi$default(IDraftAllowListProvider.class, false, false, false, 14, null);
        if (iDraftAllowListProvider == null) {
            LIZJ();
            return;
        }
        DraftAllowListResult draftAllowListResultCollectAllowLists = iDraftAllowListProvider.collectAllowLists();
        ArrayList<String> arrayList = LIZLLL;
        arrayList.clear();
        arrayList.addAll(new HashSet(draftAllowListResultCollectAllowLists.effectList));
        ArrayList<String> arrayList2 = LJ;
        arrayList2.clear();
        arrayList2.addAll(new HashSet(draftAllowListResultCollectAllowLists.musicList));
        ArrayList<String> arrayList3 = LJFF;
        arrayList3.clear();
        arrayList3.addAll(new HashSet(draftAllowListResultCollectAllowLists.effectModelList));
        ArrayList<String> arrayList4 = LJI;
        arrayList4.clear();
        arrayList4.addAll(new HashSet(draftAllowListResultCollectAllowLists.fontList));
        ArrayList<String> arrayList5 = LJII;
        arrayList5.clear();
        arrayList5.addAll(new HashSet(draftAllowListResultCollectAllowLists.mvList));
    }

    public static void LIZ(C571880Mbq c571880Mbq) {
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(86);
        c571880Mbq.getClass();
        AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(87);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(aFwS194S0000000_8, (Function0<Unit>) 128);
        if (!LIZJ) {
            LIZJ = true;
            if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                C15O7.LIZIZ(new ACallableS415S0100000_8(aFwS194S0000000_82, 2), (Executor) LJIIIIZZ.getValue(), null).LJ(new C346480DiA(awS552S0100000_8, 3), C15O7.LJIIIIZZ, null);
            } else {
                aFwS194S0000000_82.invoke();
                awS552S0100000_8.invoke();
            }
        }
    }
}
