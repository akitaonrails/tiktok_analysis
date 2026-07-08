package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.AtomAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.RichContentDependRes;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StickerAnimation;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364380EQi extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final InterfaceC1635410sex LIZIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public final Map<String, List<String>> LIZJ = new ConcurrentHashMap();

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 24;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 1800;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C364380EQi(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        List<LyricStickerModel> list;
        Pair<String, String> pairLIZJ;
        Pair<String, String> pairLIZJ2;
        ((ConcurrentHashMap) this.LIZJ).clear();
        StickerNewEngineModel stickerNewEngineModel = this.LIZ.LJ.LIZ.stickerModel;
        if (stickerNewEngineModel != null && (list = stickerNewEngineModel.lyricStickerModels) != null && !list.isEmpty()) {
            ArrayList<LyricFailbackFont> arrayList = new ArrayList();
            Iterator<LyricStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                List<LyricFailbackFont> fallbackFonts = it2.next().getFallbackFonts();
                if (fallbackFonts == null) {
                    fallbackFonts = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(fallbackFonts, arrayList);
            }
            for (LyricFailbackFont lyricFailbackFont : arrayList) {
                Pair<String, String> pairLIZJ3 = C0FGD.LIZJ(lyricFailbackFont.urs);
                if (pairLIZJ3 != null) {
                    String first = pairLIZJ3.getFirst();
                    String second = pairLIZJ3.getSecond();
                    if (first != null && first.length() != 0 && second != null && second.length() != 0 && !C570490MZb.LJ(lyricFailbackFont.path)) {
                        LJIIIIZZ(this, first, second);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<LyricStickerModel> it3 = list.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getTextStickerModels(), arrayList2);
            }
            ArrayList<TextStickerCompatModel> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((TextStickerModel) it4.next()).getCompatModel());
            }
            for (TextStickerCompatModel textStickerCompatModel : arrayList3) {
                List<AtomAnimation> atomAnimations = textStickerCompatModel.getAtomAnimations();
                if (atomAnimations != null) {
                    for (AtomAnimation atomAnimation : atomAnimations) {
                        Pair<String, String> pairLIZJ4 = C0FGD.LIZJ(atomAnimation.getUrs());
                        if (pairLIZJ4 != null) {
                            String first2 = pairLIZJ4.getFirst();
                            String second2 = pairLIZJ4.getSecond();
                            if (first2 != null && first2.length() != 0 && second2 != null && second2.length() != 0 && !C570490MZb.LJ(atomAnimation.getPath())) {
                                LJIIIIZZ(this, first2, second2);
                            }
                        }
                    }
                }
                StickerAnimation stickerAnimation = textStickerCompatModel.getStickerAnimation();
                if (stickerAnimation != null) {
                    String inAnim = stickerAnimation.getInAnim();
                    String outAnim = stickerAnimation.getOutAnim();
                    if (inAnim != null && inAnim.length() != 0 && (pairLIZJ2 = C0FGD.LIZJ(inAnim)) != null) {
                        String first3 = pairLIZJ2.getFirst();
                        String second3 = pairLIZJ2.getSecond();
                        if (first3 != null && first3.length() != 0 && second3 != null && second3.length() != 0 && !C570490MZb.LJ(stickerAnimation.getInAnimPath())) {
                            LJIIIIZZ(this, first3, second3);
                        }
                    }
                    if (outAnim != null && outAnim.length() != 0 && (pairLIZJ = C0FGD.LIZJ(outAnim)) != null) {
                        String first4 = pairLIZJ.getFirst();
                        String second4 = pairLIZJ.getSecond();
                        if (first4 != null && first4.length() != 0 && second4 != null && second4.length() != 0 && !C570490MZb.LJ(stickerAnimation.getOutAnimPath())) {
                            LJIIIIZZ(this, first4, second4);
                        }
                    }
                }
                List<RichContentDependRes> richContentDependRes = textStickerCompatModel.getRichContentDependRes();
                if (richContentDependRes != null) {
                    for (RichContentDependRes richContentDependRes2 : richContentDependRes) {
                        Pair<String, String> pairLIZJ5 = C0FGD.LIZJ(richContentDependRes2.getUrs());
                        if (pairLIZJ5 != null) {
                            String first5 = pairLIZJ5.getFirst();
                            String second5 = pairLIZJ5.getSecond();
                            if (first5 != null && first5.length() != 0 && second5 != null && second5.length() != 0 && !C570490MZb.LJ(richContentDependRes2.getPath())) {
                                LJIIIIZZ(this, first5, second5);
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(((ConcurrentHashMap) this.LIZJ).isEmpty());
        }
        return true;
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZJ(interfaceC1364105Vn);
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        List<LyricStickerModel> list;
        ArrayList arrayList = new ArrayList();
        StickerNewEngineModel stickerNewEngineModel = awemeDraft.LIZ.stickerModel;
        if (stickerNewEngineModel != null && (list = stickerNewEngineModel.lyricStickerModels) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<LyricStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                List<LyricFailbackFont> fallbackFonts = it2.next().getFallbackFonts();
                if (fallbackFonts == null) {
                    fallbackFonts = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(fallbackFonts, arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = ((LyricFailbackFont) it3.next()).path;
                if (str != null && str.length() > 0) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<LyricStickerModel> it4 = list.iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(it4.next().getTextStickerModels(), arrayList3);
            }
            ArrayList<TextStickerCompatModel> arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(((TextStickerModel) it5.next()).getCompatModel());
            }
            for (TextStickerCompatModel textStickerCompatModel : arrayList4) {
                List<AtomAnimation> atomAnimations = textStickerCompatModel.getAtomAnimations();
                if (atomAnimations != null) {
                    Iterator<AtomAnimation> it6 = atomAnimations.iterator();
                    while (it6.hasNext()) {
                        String path = it6.next().getPath();
                        if (path != null && path.length() > 0) {
                            arrayList.add(path);
                        }
                    }
                }
                StickerAnimation stickerAnimation = textStickerCompatModel.getStickerAnimation();
                if (stickerAnimation != null) {
                    String inAnimPath = stickerAnimation.getInAnimPath();
                    if (inAnimPath != null && inAnimPath.length() > 0) {
                        arrayList.add(inAnimPath);
                    }
                    String outAnimPath = stickerAnimation.getOutAnimPath();
                    if (outAnimPath != null && outAnimPath.length() > 0) {
                        arrayList.add(outAnimPath);
                    }
                }
                List<RichContentDependRes> richContentDependRes = textStickerCompatModel.getRichContentDependRes();
                if (richContentDependRes != null) {
                    Iterator<RichContentDependRes> it7 = richContentDependRes.iterator();
                    while (it7.hasNext()) {
                        String path2 = it7.next().getPath();
                        if (path2 != null && path2.length() > 0) {
                            arrayList.add(path2);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return C2097608Jq.LJ();
            }
            return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList));
        }
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        C19EG c19eg;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftLyricRestoreHandler ; fileType : ");
        sbLIZ.append(24);
        sbLIZ.append(" ; restore start ...");
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Context context = this.LIZ.LIZ.get();
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS406S0200000_5(this, c19eg, 141));
        }
        if (((ConcurrentHashMap) this.LIZJ).isEmpty()) {
            ArrayList arrayListLJ = C1697810uHb.LJ(LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
            C189200o6.m2constructorimpl(arrayListLJ);
            c2252611DEt.resumeWith(arrayListLJ);
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(((ConcurrentHashMap) this.LIZJ).size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicReference atomicReference = new AtomicReference(null);
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZJ).entrySet()) {
                this.LIZIZ.Cg(C13LP.LJJJJI((Iterable) entry.getValue()), C2097908Jt.LIZJ(new Pair("panel", entry.getKey())), new IFetchEffectListByIdsListener(this) { // from class: X.0EQm
                    public final /* synthetic */ C364380EQi LIZIZ;

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        AtomicReference<ExceptionResult> atomicReference2 = atomicReference;
                        while (!atomicReference2.compareAndSet(null, exceptionResult) && atomicReference2.get() == null) {
                        }
                        AtomicInteger atomicInteger2 = atomicInteger;
                        InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                        C364380EQi.LJIIIZ(this.LIZIZ, concurrentHashMap, atomicBoolean, atomicInteger2, atomicReference, interfaceC20236714Gf);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(EffectListResponse effectListResponse) {
                        List<Effect> data;
                        List listLJJJJLI;
                        EffectListResponse effectListResponse2 = effectListResponse;
                        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (listLJJJJLI = C13LP.LJJJJLI(data)) != null && !listLJJJJLI.isEmpty()) {
                            InterfaceC1635410sex interfaceC1635410sex = this.LIZIZ.LIZIZ;
                            ArrayList arrayList = new ArrayList(listLJJJJLI);
                            final AtomicReference<ExceptionResult> atomicReference2 = atomicReference;
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            final InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = c2252611DEt;
                            final AtomicBoolean atomicBoolean2 = atomicBoolean;
                            final C364380EQi c364380EQi = this.LIZIZ;
                            final ConcurrentHashMap<String, String> concurrentHashMap2 = concurrentHashMap;
                            interfaceC1635410sex.og(arrayList, new IFetchEffectListListener() { // from class: X.0EQn
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    if (exceptionResult != null) {
                                        AtomicReference<ExceptionResult> atomicReference3 = atomicReference2;
                                        while (!atomicReference3.compareAndSet(null, exceptionResult) && atomicReference3.get() == null) {
                                        }
                                    }
                                    AtomicInteger atomicInteger3 = atomicInteger2;
                                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf2 = interfaceC20236714Gf;
                                    C364380EQi.LJIIIZ(c364380EQi, concurrentHashMap2, atomicBoolean2, atomicInteger3, atomicReference2, interfaceC20236714Gf2);
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(List<Effect> list) {
                                    List<Effect> list2 = list;
                                    if (list2 == null) {
                                        AtomicReference<ExceptionResult> atomicReference3 = atomicReference2;
                                        ExceptionResult exceptionResult = new ExceptionResult(new IllegalArgumentException("response is null"));
                                        while (!atomicReference3.compareAndSet(null, exceptionResult) && atomicReference3.get() == null) {
                                        }
                                        AtomicInteger atomicInteger3 = atomicInteger2;
                                        InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf2 = interfaceC20236714Gf;
                                        C364380EQi.LJIIIZ(c364380EQi, concurrentHashMap2, atomicBoolean2, atomicInteger3, atomicReference2, interfaceC20236714Gf2);
                                        return;
                                    }
                                    List<Effect> listLJJJJLI2 = C13LP.LJJJJLI(list2);
                                    ConcurrentHashMap<String, String> concurrentHashMap3 = concurrentHashMap2;
                                    for (Effect effect : listLJJJJLI2) {
                                        concurrentHashMap3.put(effect.getResourceId(), effect.getUnzipPath());
                                    }
                                    AtomicInteger atomicInteger4 = atomicInteger2;
                                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf3 = interfaceC20236714Gf;
                                    C364380EQi.LJIIIZ(c364380EQi, concurrentHashMap2, atomicBoolean2, atomicInteger4, atomicReference2, interfaceC20236714Gf3);
                                }
                            });
                            return;
                        }
                        AtomicReference<ExceptionResult> atomicReference3 = atomicReference;
                        ExceptionResult exceptionResult = new ExceptionResult(new IllegalArgumentException("response is null"));
                        while (!atomicReference3.compareAndSet(null, exceptionResult) && atomicReference3.get() == null) {
                        }
                        C364380EQi.LJIIIZ(this.LIZIZ, concurrentHashMap, atomicBoolean, atomicInteger, atomicReference, c2252611DEt);
                    }

                    {
                        this.LIZIZ = this;
                    }
                });
            }
            c2252611DEt.LJJII(new AwS584S0100000_5(this, 1034));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final void LJIIIIZZ(C364380EQi c364380EQi, String str, String str2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c364380EQi.LIZJ;
        Object arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            concurrentHashMap.put(str, arrayList);
        }
        List list = (List) arrayList;
        if (!list.contains(str2)) {
            list.add(str2);
        }
    }

    public static final void LJIIIZ(C364380EQi c364380EQi, ConcurrentHashMap concurrentHashMap, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, AtomicReference atomicReference, InterfaceC20236714Gf interfaceC20236714Gf) {
        List<LyricStickerModel> list;
        ArrayList arrayList;
        StickerAnimation stickerAnimationCopy;
        ArrayList arrayList2;
        String urs;
        String str;
        String inAnim;
        String outAnim;
        String inAnimPath;
        String outAnimPath;
        String urs2;
        String str2;
        if (atomicInteger.decrementAndGet() != 0 || !interfaceC20236714Gf.isActive() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        ExceptionResult exceptionResult = (ExceptionResult) atomicReference.get();
        if (exceptionResult != null) {
            C13RX c13rx = C13RX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftLyricRestoreHandler ; fileType : ");
            c364380EQi.getClass();
            sbLIZ.append(24);
            sbLIZ.append(" ; restore failed ... ; e : ");
            sbLIZ.append(exceptionResult.getErrorCode());
            sbLIZ.append(' ');
            sbLIZ.append(exceptionResult.getMsg());
            sbLIZ.append(' ');
            sbLIZ.append(exceptionResult.getLogId());
            C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayListLJ = C1697810uHb.LJ(c364380EQi.LJI(2131832433, false, new DraftFileRestoreException(exceptionResult.getErrorCode() - 30000, exceptionResult.getException(), "EffectPlatform")));
            C189200o6.m2constructorimpl(arrayListLJ);
            interfaceC20236714Gf.resumeWith(arrayListLJ);
            return;
        }
        StickerNewEngineModel stickerNewEngineModel = c364380EQi.LIZ.LJ.LIZ.stickerModel;
        if (stickerNewEngineModel != null && (list = stickerNewEngineModel.lyricStickerModels) != null) {
            Iterator<LyricStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                for (TextStickerModel textStickerModel : it2.next().getTextStickerModels()) {
                    TextStickerCompatModel compatModel = textStickerModel.getCompatModel();
                    List<AtomAnimation> atomAnimations = compatModel.getAtomAnimations();
                    if (atomAnimations != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(atomAnimations, 10));
                        for (AtomAnimation atomAnimationCopy : atomAnimations) {
                            Pair<String, String> pairLIZJ = C0FGD.LIZJ(atomAnimationCopy.getUrs());
                            if (((pairLIZJ != null && (urs2 = pairLIZJ.getSecond()) != null) || (urs2 = atomAnimationCopy.getUrs()) != null) && (str2 = (String) concurrentHashMap.get(urs2)) != null && str2.length() != 0) {
                                atomAnimationCopy = atomAnimationCopy.copy(atomAnimationCopy.urs, str2, atomAnimationCopy.timerange, atomAnimationCopy.property);
                            }
                            arrayList.add(atomAnimationCopy);
                        }
                    } else {
                        arrayList = null;
                    }
                    StickerAnimation stickerAnimation = compatModel.getStickerAnimation();
                    if (stickerAnimation != null) {
                        Pair<String, String> pairLIZJ2 = C0FGD.LIZJ(stickerAnimation.getInAnim());
                        if (pairLIZJ2 == null || (inAnim = pairLIZJ2.getSecond()) == null) {
                            inAnim = stickerAnimation.getInAnim();
                        }
                        Pair<String, String> pairLIZJ3 = C0FGD.LIZJ(stickerAnimation.getOutAnim());
                        if (pairLIZJ3 == null || (outAnim = pairLIZJ3.getSecond()) == null) {
                            outAnim = stickerAnimation.getOutAnim();
                        }
                        if (inAnim == null || (inAnimPath = (String) concurrentHashMap.get(inAnim)) == null) {
                            inAnimPath = stickerAnimation.getInAnimPath();
                        }
                        if (outAnim == null || (outAnimPath = (String) concurrentHashMap.get(outAnim)) == null) {
                            outAnimPath = stickerAnimation.getOutAnimPath();
                        }
                        stickerAnimationCopy = stickerAnimation.copy(stickerAnimation.inAnim, inAnimPath, stickerAnimation.inDuration, stickerAnimation.outAnim, outAnimPath, stickerAnimation.outDuration, stickerAnimation.loop);
                    } else {
                        stickerAnimationCopy = null;
                    }
                    List<RichContentDependRes> richContentDependRes = compatModel.getRichContentDependRes();
                    if (richContentDependRes != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(richContentDependRes, 10));
                        for (RichContentDependRes richContentDependResCopy : richContentDependRes) {
                            Pair<String, String> pairLIZJ4 = C0FGD.LIZJ(richContentDependResCopy.getUrs());
                            if (((pairLIZJ4 != null && (urs = pairLIZJ4.getSecond()) != null) || (urs = richContentDependResCopy.getUrs()) != null) && (str = (String) concurrentHashMap.get(urs)) != null && str.length() != 0) {
                                richContentDependResCopy = richContentDependResCopy.copy(richContentDependResCopy.urs, str);
                            }
                            arrayList2.add(richContentDependResCopy);
                        }
                    } else {
                        arrayList2 = null;
                    }
                    textStickerModel.setCompatModel(TextStickerCompatModel.copy$default(compatModel, false, false, null, null, null, null, null, null, null, false, null, null, null, 0, null, 0.0f, null, arrayList, stickerAnimationCopy, arrayList2, null, 1179647, null));
                }
            }
        }
        ArrayList arrayListLJ2 = C1697810uHb.LJ(c364380EQi.LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
        C189200o6.m2constructorimpl(arrayListLJ2);
        interfaceC20236714Gf.resumeWith(arrayListLJ2);
    }
}
