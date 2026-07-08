package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ENw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363740ENw {
    public static final boolean LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILLL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                if (!LJFF(it3.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.VIDEO || C351220Dpo.LLLII(nLETrack2) || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION") || C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2) || C351220Dpo.LLILL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                if (LIZJ(it3.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(NLETrackSlot nLETrackSlot) {
        boolean enableAudio;
        NLEResourceAV aVFile;
        NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentVideo != null) {
            enableAudio = nLESegmentVideo.getEnableAudio();
        } else {
            enableAudio = true;
        }
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if ((nLESegmentAudio == null || (aVFile = nLESegmentAudio.getAVFile()) == null || aVFile.getHasAudio()) && enableAudio) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(NLETrackSlot nLETrackSlot) {
        boolean enableAudio;
        boolean hasAudio;
        NLEResourceAV aVFile;
        Float fValueOf = null;
        NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentVideo != null) {
            enableAudio = nLESegmentVideo.getEnableAudio();
        } else {
            enableAudio = true;
        }
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentAudio != null && (aVFile = nLESegmentAudio.getAVFile()) != null) {
            hasAudio = aVFile.getHasAudio();
        } else {
            hasAudio = true;
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            fValueOf = Float.valueOf(C351220Dpo.LJLLLL(mainSegment));
        }
        if (Intrinsics.LIZLLL(fValueOf, 0.0f) || !hasAudio || !enableAudio) {
            return true;
        }
        return false;
    }

    public static final ArrayList<CaptionUtterance> LJIIJ(List<TextStickerData> list) {
        ArrayList<CaptionUtterance> arrayList = new ArrayList<>();
        Iterator<TextStickerData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CaptionUtterance(it2.next()));
        }
        return arrayList;
    }

    public static final boolean LJIIJJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.VIDEO || C351220Dpo.LLLII(nLETrack2) || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION") || C351220Dpo.LLILL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                if (!LJFF(it3.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LIZLLL(String str, Iterable<? extends C0EVA> iterable) {
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<? extends C0EVA> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getValue(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJII(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (!C366800EZq.LIZ(videoPublishEditModel, nLEModel)) {
            if (C349560Dn8.LJFF(nLEModel) && C289250BVj.LIZ(videoPublishEditModel)) {
                return false;
            }
            return LJIIJJI(nLEModel);
        }
        return false;
    }

    public static final TextStickerData LJIIIIZZ(NLETrackSlot nLETrackSlot, boolean z) {
        float f;
        TextStickerData textStickerDataLIZIZ = C363430EMr.LIZIZ(nLETrackSlot.getExtra("text_sticker_data"));
        textStickerDataLIZIZ.setRotation(nLETrackSlot.getRotation());
        textStickerDataLIZIZ.setScale(nLETrackSlot.getScale());
        long startTime = nLETrackSlot.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        textStickerDataLIZIZ.setStartTime((int) (startTime / j));
        textStickerDataLIZIZ.setEndTime((int) (nLETrackSlot.getEndTime() / j));
        textStickerDataLIZIZ.setColor(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("color")));
        textStickerDataLIZIZ.setTextWrapList(C363430EMr.LIZJ(nLETrackSlot.getExtra("text_wrap_list")));
        textStickerDataLIZIZ.setFontType(nLETrackSlot.getExtra("font_type"));
        textStickerDataLIZIZ.setAlign(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("align")));
        textStickerDataLIZIZ.setBgMode(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("bg_mode")));
        textStickerDataLIZIZ.setTextStr(nLETrackSlot.getExtra("text"));
        float transformX = nLETrackSlot.getTransformX();
        float f2 = 0.5f;
        if (z) {
            f = 0.5f;
        } else {
            f = 0.0f;
        }
        textStickerDataLIZIZ.setX(transformX + f);
        float transformY = nLETrackSlot.getTransformY();
        if (!z) {
            f2 = 0.0f;
        }
        textStickerDataLIZIZ.setY(transformY + f2);
        textStickerDataLIZIZ.setPlaceholderSlotId(nLETrackSlot.getUUID());
        return textStickerDataLIZIZ;
    }

    public static final ArrayList LJIIIZ(Context context, List list) {
        int iNextIndex;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TextStickerData textStickerData = (TextStickerData) it2.next();
            ArrayList<TextStickerData> arrayList2 = new ArrayList();
            int size = textStickerData.getWords().size();
            if (1 <= size) {
                int i = 1;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i == textStickerData.getWords().size() || (!LIZLLL(((Word) ListProtector.get(textStickerData.getWords(), i2)).getTag(), C13LQ.LJIIJ(C0EVA.values())) && LIZLLL(((Word) ListProtector.get(textStickerData.getWords(), i)).getTag(), C13LQ.LJIIJ(C0EVA.values())))) {
                        long startTime = ((Word) ListProtector.get(textStickerData.getWords(), i3)).getStartTime();
                        long endTime = ((Word) ListProtector.get(textStickerData.getWords(), i2)).getEndTime();
                        TextStickerData textStickerDataM187clone = textStickerData.m187clone();
                        int i4 = (int) startTime;
                        textStickerDataM187clone.setStartTime(i4);
                        int i5 = (int) endTime;
                        textStickerDataM187clone.setEndTime(i5);
                        textStickerDataM187clone.setUiStartTime(i4);
                        textStickerDataM187clone.setUiEndTime(i5);
                        textStickerDataM187clone.setWords(C13LP.LJLLILLLL(textStickerDataM187clone.getWords(), C13LZ.LJIILJJIL(i3, i)));
                        textStickerDataM187clone.setTextStr(C13LP.LJJLIIIJ(textStickerDataM187clone.getWords(), "", null, null, 0, null, AFwS234S0000000_5.get$arr$(10), 30));
                        textStickerDataM187clone.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerDataM187clone, context))));
                        textStickerDataM187clone.setInlineTextStyles(C13BV.INSTANCE);
                        arrayList2.add(textStickerDataM187clone);
                        i3 = i;
                    }
                    if (i < textStickerData.getWords().size() && (!a0.LJJJIL(((Word) ListProtector.get(textStickerData.getWords(), i)).getText()))) {
                        i2 = i;
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(textStickerData);
            }
            for (TextStickerData textStickerData2 : arrayList2) {
                List<Word> words = textStickerData2.getWords();
                ListIterator<Word> listIterator = words.listIterator(words.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (LIZLLL(listIterator.previous().getTag(), C13LQ.LJJLL(C0EVA.values()))) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                List listLJLLILLLL = C13LP.LJLLILLLL(textStickerData2.getWords(), new IntRange(0, iNextIndex));
                if (!listLJLLILLLL.isEmpty()) {
                    Word word = new Word(0L, 0L, "", "", false, false);
                    word.setStartTime(((Word) C13LP.LJJJJZI(listLJLLILLLL)).getStartTime());
                    word.setEndTime(((Word) C13LP.LJJLIIIJJI(listLJLLILLLL)).getEndTime());
                    word.setText(C13LP.LJJLIIIJ(listLJLLILLLL, "", null, null, 0, null, AFwS234S0000000_5.get$arr$(11), 30));
                    word.setTag(((Word) C13LP.LJJJJZI(listLJLLILLLL)).getTag());
                    textStickerData2.setWords(C13LP.LJLIL(C13LP.LJLLILLLL(textStickerData2.getWords(), C13LZ.LJIILJJIL(iNextIndex + 1, textStickerData2.getWords().size())), Collections.singletonList(word)));
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next());
            }
        }
        return arrayList;
    }

    public static final ArrayList<TextStickerData> LJI(C0E48 c0e48, Integer num, Integer num2) {
        VideoPublishEditModel editModel;
        boolean z;
        if (c0e48 == null) {
            return null;
        }
        ArrayList<TextStickerData> arrayList = new ArrayList<>();
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            editModel = C0E1T.LIZ().getEditModel();
        } else {
            editModel = null;
        }
        if (editModel != null && C1416310mxZ.LJJLIIIJJIZ(editModel)) {
            z = true;
        } else {
            z = false;
        }
        Iterator<NLETrackSlot> it2 = C349550Dn7.LIZJ(C350870DpF.LJI(c0e48)).iterator();
        while (it2.hasNext()) {
            TextStickerData textStickerDataLJIIIIZZ = LJIIIIZZ(it2.next(), !z);
            if (num2 != null && num != null) {
                textStickerDataLJIIIIZZ.setX(textStickerDataLJIIIIZZ.getX() * num.intValue());
                textStickerDataLJIIIIZZ.setY(textStickerDataLJIIIIZZ.getY() * num2.intValue());
            }
            arrayList.add(textStickerDataLJIIIIZZ);
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(6));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
