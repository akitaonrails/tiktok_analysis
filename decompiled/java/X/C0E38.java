package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E38, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E38 {
    public static NLETrackSlot LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLII(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                for (NLETrackSlot nLETrackSlot2 : slots) {
                    if (nLETrackSlot2.getStartTime() == nLETrackSlot.getStartTime() && nLETrackSlot2.getEndTime() == nLETrackSlot.getEndTime()) {
                        return nLETrackSlot2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NLEError LIZ(String str, NLEModel nLEModel, Function1 function1, Function1 function12, int i, int i2, int i3, Function1 function13, Function1 function14, boolean z, boolean z2, int i4) {
        float f;
        VecNLETrackSlotSPtr slots;
        Float fValueOf;
        Float fValueOf2;
        VecNLETrackSlotSPtr slots2;
        Function1 function15 = function13;
        int i5 = i3;
        Function1 function16 = function14;
        int i6 = i2;
        Function1 function17 = function12;
        int i7 = i;
        Function1 function18 = function1;
        if ((i4 & 4) != 0) {
            function18 = null;
        }
        if ((i4 & 8) != 0) {
            function17 = null;
        }
        if ((i4 & 16) != 0) {
            i7 = 2;
        }
        if ((i4 & 32) != 0) {
            i6 = 128000;
        }
        if ((i4 & 64) != 0) {
            i5 = 44100;
        }
        if ((i4 & 128) != 0) {
            function15 = null;
        }
        if ((i4 & 256) != 0) {
            function16 = null;
        }
        if ((i4 & 512) != 0) {
            z = false;
        }
        if ((i4 & 1024) != 0) {
            z2 = false;
        }
        if (z) {
            NLEModel nLEModel2 = new NLEModel();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (slots2 = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots2) {
                    if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
                        String uuid = nLETrackSlot.getUUID();
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap.put(uuid, bool);
                        NLETrackSlot nLETrackSlotLIZIZ = LIZIZ(nLEModel, nLETrackSlot);
                        if (nLETrackSlotLIZIZ != null) {
                            linkedHashMap.put(nLETrackSlotLIZIZ.getUUID(), bool);
                        }
                    }
                }
            }
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C347830DkL.LIZ(nLETrack2) == NLETrackType.VIDEO && nLETrack2.isAudioEnable() && !Intrinsics.LJFF(nLETrack2.getExtra("RewindTrackType"), "VIDEO") && (function18 == null || ((Boolean) function18.invoke(nLETrack2)).booleanValue())) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack3 : arrayList) {
                NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLETrack3.deepClone());
                if (nLETrackDynamicCast.getMainTrack()) {
                    nLEModel2.addTrack(nLETrackDynamicCast);
                } else {
                    for (NLETrackSlot nLETrackSlot2 : nLETrackDynamicCast.getSlots()) {
                        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudio != null) {
                            fValueOf2 = Float.valueOf(nLESegmentAudio.getVolume());
                        } else {
                            fValueOf2 = null;
                        }
                        if (Intrinsics.LIZLLL(fValueOf2, 0.0f) || ((nLETrack3.getMainTrack() && Intrinsics.LJFF(nLETrackSlot2.getExtra("has_origin_audio_slot"), "true")) || (function15 != null && !((Boolean) function15.invoke(nLETrackSlot2)).booleanValue()))) {
                            if (!linkedHashMap.containsKey(nLETrackSlot2.getUUID())) {
                                nLETrackDynamicCast.removeSlot(nLETrackSlot2);
                            }
                        }
                    }
                    nLEModel2.addTrack(nLETrackDynamicCast);
                }
            }
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack4 : tracks2) {
                NLETrack nLETrack5 = nLETrack4;
                if (C347830DkL.LIZ(nLETrack5) == NLETrackType.AUDIO && (function17 == null || ((Boolean) function17.invoke(nLETrack5)).booleanValue())) {
                    arrayList2.add(nLETrack4);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                NLETrack nLETrackDynamicCast2 = NLETrack.dynamicCast(((NLENode) it2.next()).deepClone());
                for (NLETrackSlot nLETrackSlot3 : nLETrackDynamicCast2.getSlots()) {
                    NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot3.getMainSegment());
                    if (nLESegmentAudio2 != null) {
                        fValueOf = Float.valueOf(nLESegmentAudio2.getVolume());
                    } else {
                        fValueOf = null;
                    }
                    if (Intrinsics.LIZLLL(fValueOf, 0.0f) || (function16 != null && !((Boolean) function16.invoke(nLETrackSlot3)).booleanValue())) {
                        if (!linkedHashMap.containsKey(nLETrackSlot3.getUUID())) {
                            nLETrackDynamicCast2.removeSlot(nLETrackSlot3);
                        }
                    }
                }
                nLEModel2.addTrack(nLETrackDynamicCast2);
            }
            if (nLEModel2.getMainTrack() == null) {
                VecNLETrackSPtr tracks3 = nLEModel2.getTracks();
                if (tracks3 != null) {
                    Iterator<NLETrack> it3 = tracks3.iterator();
                    if (it3.hasNext()) {
                        NLETrack next = it3.next();
                        if (it3.hasNext()) {
                            long measuredEndTime = ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(next.getSortedSlots())).getMeasuredEndTime();
                            do {
                                NLETrack next2 = it3.next();
                                long measuredEndTime2 = ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(next2.getSortedSlots())).getMeasuredEndTime();
                                if (measuredEndTime < measuredEndTime2) {
                                    next = next2;
                                    measuredEndTime = measuredEndTime2;
                                }
                            } while (it3.hasNext());
                        }
                        NLETrack nLETrack6 = next;
                        if (nLETrack6 != null) {
                            nLETrack6.setMainTrack(true);
                            nLETrack6.setEndTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack6.getSortedSlots())).getMeasuredEndTime());
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                throw new RuntimeException("Try to extract audio by detach but NLEModel doesn't have mainTrack.");
            }
            NLETrack mainTrack2 = nLEModel2.getMainTrack();
            if (mainTrack2 != null && C351220Dpo.LLILLJJLI(mainTrack2) && !z2) {
                return NLEMediaUtil.detachAudioStreamFile(str, nLEModel2, i7, i6, i5);
            }
            C1463670oBx c1463670oBx = new C1463670oBx(new C0VSJ(str).getParent(), EnumC1464030oCX.DEFAULT, EnumC1442010nd1.UPLOAD_OTHER, false, null, 0 == true ? 1 : 0, 1016);
            c1463670oBx.yc(nLEModel2);
            NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings = new NLEAudioCompileEncodeSettings();
            nLEAudioCompileEncodeSettings.setChannelCount(i7);
            nLEAudioCompileEncodeSettings.setAudioBps(i6);
            nLEAudioCompileEncodeSettings.setSampleRate(i5);
            nLEAudioCompileEncodeSettings.setEnableAudioCompileGraph(true);
            nLEAudioCompileEncodeSettings.setCompileType(NLE_COMPILE_TYPE.COMPILE_TYPE_AAC);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final C013C c013c = new C013C();
            c1463670oBx.LIZLLL().LIZIZ.getExporterApi().compileOnlyAudio(str, nLEAudioCompileEncodeSettings, new INLEListenerCompile() { // from class: X.0E39
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f2) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    C201955140j.LJIIL("NLEAudioExtractor compile only audio success");
                    c013c.element = true;
                    countDownLatch.countDown();
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i8, int i9, float f2, String str2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NLEAudioExtractor compile only audio error: ");
                    sbLIZ.append(i8);
                    sbLIZ.append(" ext: ");
                    sbLIZ.append(i9);
                    sbLIZ.append(" f: ");
                    sbLIZ.append(f2);
                    sbLIZ.append(" msg: ");
                    sbLIZ.append(str2);
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    c013c.element = false;
                    countDownLatch.countDown();
                }
            });
            try {
                try {
                    countDownLatch.await();
                    try {
                        c1463670oBx.LIZLLL().LIZIZ.getExporterApi().releaseNLEResources();
                        c1463670oBx.destroy();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                    }
                    if (c013c.element) {
                        return NLEError.SUCCESS;
                    }
                    return NLEError.FAILED;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    NLEError nLEError = NLEError.FAILED;
                    try {
                        c1463670oBx.LIZLLL().LIZIZ.getExporterApi().releaseNLEResources();
                        c1463670oBx.destroy();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return nLEError;
                    } catch (Throwable th2) {
                        return nLEError;
                    }
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                try {
                    c1463670oBx.LIZLLL().LIZIZ.getExporterApi().releaseNLEResources();
                    c1463670oBx.destroy();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    throw th3;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        NLEModel nLEModel3 = new NLEModel();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        NLETrack mainTrack3 = nLEModel.getMainTrack();
        if (mainTrack3 != null && (slots = mainTrack3.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot4 : slots) {
                if (nLETrackSlot4.hasExtra("extra_associated_vc_slot_id")) {
                    String uuid2 = nLETrackSlot4.getUUID();
                    Boolean bool2 = Boolean.TRUE;
                    linkedHashMap2.put(uuid2, bool2);
                    NLETrackSlot nLETrackSlotLIZIZ2 = LIZIZ(nLEModel, nLETrackSlot4);
                    if (nLETrackSlotLIZIZ2 != null) {
                        linkedHashMap2.put(nLETrackSlotLIZIZ2.getUUID(), bool2);
                    }
                }
            }
        }
        VecNLETrackSPtr tracks4 = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList3 = new ArrayList();
        for (NLETrack nLETrack7 : tracks4) {
            NLETrack nLETrack8 = nLETrack7;
            if (C347830DkL.LIZ(nLETrack8) == NLETrackType.VIDEO && nLETrack8.isAudioEnable() && !Intrinsics.LJFF(nLETrack8.getExtra("RewindTrackType"), "VIDEO") && (function18 == null || ((Boolean) function18.invoke(nLETrack8)).booleanValue())) {
                arrayList3.add(nLETrack7);
            }
        }
        for (NLETrack nLETrack9 : arrayList3) {
            NLETrack nLETrackDynamicCast3 = NLETrack.dynamicCast(nLETrack9.deepClone());
            for (NLETrackSlot nLETrackSlot5 : nLETrackDynamicCast3.getSlots()) {
                Float fValueOf3 = null;
                NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot5.getMainSegment());
                if (nLESegmentAudio3 != null) {
                    fValueOf3 = Float.valueOf(nLESegmentAudio3.getVolume());
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
                if (Intrinsics.LIZLLL(fValueOf3, f) || ((nLETrack9.getMainTrack() && Intrinsics.LJFF(nLETrackSlot5.getExtra("has_origin_audio_slot"), "true")) || (function15 != null && !((Boolean) function15.invoke(nLETrackSlot5)).booleanValue()))) {
                    if (!linkedHashMap2.containsKey(nLETrackSlot5.getUUID())) {
                        nLETrackDynamicCast3.removeSlot(nLETrackSlot5);
                    }
                }
            }
            nLEModel3.addTrack(nLETrackDynamicCast3);
        }
        VecNLETrackSPtr tracks5 = nLEModel.getTracks();
        ArrayList arrayList4 = new ArrayList();
        for (NLETrack nLETrack10 : tracks5) {
            NLETrack nLETrack11 = nLETrack10;
            if (C347830DkL.LIZ(nLETrack11) == NLETrackType.AUDIO && (function17 == null || ((Boolean) function17.invoke(nLETrack11)).booleanValue())) {
                arrayList4.add(nLETrack10);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            NLETrack nLETrackDynamicCast4 = NLETrack.dynamicCast(((NLENode) it4.next()).deepClone());
            for (NLETrackSlot nLETrackSlot6 : nLETrackDynamicCast4.getSlots()) {
                Float fValueOf4 = null;
                NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot6.getMainSegment());
                if (nLESegmentAudio4 != null) {
                    fValueOf4 = Float.valueOf(nLESegmentAudio4.getVolume());
                }
                if (Intrinsics.LIZLLL(fValueOf4, 0.0f) || (function16 != null && !((Boolean) function16.invoke(nLETrackSlot6)).booleanValue())) {
                    if (!linkedHashMap2.containsKey(nLETrackSlot6.getUUID())) {
                        nLETrackDynamicCast4.removeSlot(nLETrackSlot6);
                    }
                }
            }
            nLEModel3.addTrack(nLETrackDynamicCast4);
        }
        if (nLEModel3.getMainTrack() == null) {
            VecNLETrackSPtr tracks6 = nLEModel3.getTracks();
            if (tracks6 != null) {
                Iterator<NLETrack> it5 = tracks6.iterator();
                if (it5.hasNext()) {
                    NLETrack next3 = it5.next();
                    if (it5.hasNext()) {
                        long measuredEndTime3 = ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(next3.getSortedSlots())).getMeasuredEndTime();
                        do {
                            NLETrack next4 = it5.next();
                            long measuredEndTime4 = ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(next4.getSortedSlots())).getMeasuredEndTime();
                            if (measuredEndTime3 < measuredEndTime4) {
                                next3 = next4;
                                measuredEndTime3 = measuredEndTime4;
                            }
                        } while (it5.hasNext());
                    }
                    NLETrack nLETrack12 = next3;
                    if (nLETrack12 != null) {
                        nLETrack12.setMainTrack(true);
                        nLETrack12.setEndTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack12.getSortedSlots())).getMeasuredEndTime());
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            throw new RuntimeException("Try to extract audio by detach but NLEModel doesn't have mainTrack.");
        }
        return NLEMediaUtil.detachAudioStreamFile(str, nLEModel3, i7, i6, i5);
    }
}
