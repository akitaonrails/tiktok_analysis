package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355320DwQ extends C350680Dow implements InterfaceC354950Dvp {
    public InterfaceC355360DwU LJ;
    public InterfaceC355380DwW LJFF;
    public PthreadTimer LJI;
    public final List<String> LJII;

    public final void LLJJIJIIJIL() {
        PthreadTimer pthreadTimer = this.LJI;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJLIL() {
        LLJJIJIIJIL();
        this.LJ = null;
        this.LJFF = null;
    }

    public C355320DwQ(C0E48 c0e48) {
        super(c0e48);
        this.LJII = C1697810uHb.LJIIJJI("video_frame_highlight_tt", "tt_face", "tt_face_extra", "tt_after_effect", "tt_c1_small", "tt_c1_det");
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJJLL(InterfaceC355380DwW interfaceC355380DwW) {
        this.LJFF = interfaceC355380DwW;
    }

    public final void LLJJIJI(float f, float f2) {
        Integer numValueOf;
        INLEMediaRuntime mediaRuntimeApi;
        final C118300cf c118300cf = new C118300cf();
        final int iFloor = (int) Math.floor(((double) 45) / Math.ceil((this.LIZ.Rn().getMaxEnd() / ((long) 10000)) / 500));
        PthreadTimer pthreadTimer = new PthreadTimer("SmartTrimEditorImpl");
        pthreadTimer.schedule(new C0W9W() { // from class: X.0DwS
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SmartTrimEditorImpl@f896.extractTimeStampFrames$1$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    C1524705y1.LIZJ(new AwS132S0201000_5(c118300cf, iFloor, this, 13));
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SmartTrimEditorImpl@f896.extractTimeStampFrames$1$1");
            }
        }, 0L, 500L);
        this.LJI = pthreadTimer;
        VecNLETrackSlotSPtr sortedSlots = this.LIZ.Rn().getSortedSlots();
        if (!(sortedSlots instanceof Collection) || !sortedSlots.isEmpty()) {
            Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
            while (it2.hasNext()) {
                if (!C351220Dpo.LLJJIJIL(it2.next())) {
                    int maxEnd = (int) this.LIZ.Rn().getMaxEnd();
                    int i = maxEnd / 500000;
                    if (maxEnd % 500000 != 0) {
                        i++;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList.add(Long.valueOf((maxEnd * i2) / i));
                    }
                    long j = maxEnd;
                    Long l = (Long) C13LP.LJJLIIIJL(arrayList);
                    if (l == null || j != l.longValue()) {
                        arrayList.add(Long.valueOf(j));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    for (NLETrackSlot nLETrackSlot : this.LIZ.Rn().getSortedSlots()) {
                        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                long jLongValue = ((Number) it3.next()).longValue();
                                long startTime = nLETrackSlot.getStartTime();
                                if (jLongValue <= nLETrackSlot.getEndTime() && startTime <= jLongValue) {
                                    arrayList.remove(Long.valueOf(jLongValue));
                                }
                            }
                        } else {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    long jLongValue2 = ((Number) it4.next()).longValue();
                                    long startTime2 = nLETrackSlot.getStartTime();
                                    if (jLongValue2 > nLETrackSlot.getEndTime() || startTime2 > jLongValue2) {
                                        if (jLongValue2 > nLETrackSlot.getEndTime()) {
                                            long startTime3 = nLETrackSlot.getStartTime() + (nLETrackSlot.getDuration() / ((long) 2));
                                            int iIndexOf = arrayList.indexOf(Long.valueOf(jLongValue2));
                                            if (iIndexOf != -1) {
                                                ListProtector.add(arrayList, iIndexOf, Long.valueOf(startTime3));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    NLE_GET_FRAME_FLAGS nle_get_frame_flags = NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL_SCORE;
                    INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
                    if (iNLEMediaSessionF1 != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
                        numValueOf = Integer.valueOf(mediaRuntimeApi.getImages(new VecLongLong(arrayList), (int) f, (int) f2, nle_get_frame_flags, new INLEListenerGetImage() { // from class: X.0DwX
                            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
                            public final int onGetImageData(byte[] bArr, int i3, int i4, int i5, float f3) {
                                INLEMediaRuntime mediaRuntimeApi2;
                                if (bArr != null) {
                                    return 0;
                                }
                                this.LIZ.LLJJIJIIJIL();
                                INLEMediaSession iNLEMediaSessionF12 = this.LIZ.LIZ.f1();
                                if (iNLEMediaSessionF12 != null) {
                                    C355320DwQ c355320DwQ = this.LIZ;
                                    c355320DwQ.getClass();
                                    long[] highLightResult = iNLEMediaSessionF12.getMediaRuntimeApi().getHighLightResult();
                                    if (highLightResult != null) {
                                        C1524705y1.LIZJ(new AwS406S0200000_5(c355320DwQ, highLightResult, 166));
                                    } else {
                                        C1524705y1.LIZJ(new AwS549S0100000_5(c355320DwQ, 1681));
                                    }
                                } else {
                                    C1524705y1.LIZJ(new AwS549S0100000_5(this.LIZ, 1680));
                                }
                                INLEMediaSession iNLEMediaSessionF13 = this.LIZ.LIZ.f1();
                                if (iNLEMediaSessionF13 == null || (mediaRuntimeApi2 = iNLEMediaSessionF13.getMediaRuntimeApi()) == null) {
                                    return 0;
                                }
                                return mediaRuntimeApi2.cancelGetVideoFrames();
                            }
                        }));
                        if (numValueOf != null && numValueOf.intValue() == 0) {
                            return;
                        }
                    } else {
                        numValueOf = null;
                    }
                    C1524705y1.LIZJ(new AwS406S0200000_5(this, numValueOf, 164));
                    return;
                }
            }
        }
        LLJJIJIIJIL();
        C1524705y1.LIZJ(new AwS549S0100000_5(this, 1679));
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJLJL(final float f, final float f2, InterfaceC355360DwU interfaceC355360DwU) {
        this.LJ = interfaceC355360DwU;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (String str : this.LJII) {
            boolean zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
            boolean zLJFF = Intrinsics.LJFF(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str), "asset://md5_error");
            if (!zIsResourceAvailable || zLJFF) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), new C13MA<Long>() { // from class: X.0DwT
                @Override // X.C13MA
                public final void onSuccess(Long l) {
                    l.longValue();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    InterfaceC355380DwW interfaceC355380DwW = this.LJFF;
                    if (interfaceC355380DwW != null) {
                        interfaceC355380DwW.LIZ(jCurrentTimeMillis2, false);
                    }
                    this.LLJJIJIIJIL();
                    this.LLJJIJI(f, f2);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                    l.longValue();
                }

                @Override // X.C13MA
                public final void onFail(Long l, C1662010tLr c1662010tLr) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    InterfaceC355380DwW interfaceC355380DwW = this.LJFF;
                    if (interfaceC355380DwW != null) {
                        interfaceC355380DwW.LIZ(jCurrentTimeMillis2, false);
                    }
                    this.LLJJIJIIJIL();
                    C1524705y1.LIZJ(new AwS406S0200000_5(this, c1662010tLr, 165));
                }
            });
        }
        final C118300cf c118300cf = new C118300cf();
        PthreadTimer pthreadTimer = new PthreadTimer("SmartTrimEditorImpl");
        pthreadTimer.schedule(new C0W9W() { // from class: X.0DwR
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SmartTrimEditorImpl@f896.applySmartTrim$2$1");
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    C1524705y1.LIZJ(new AwS406S0200000_5(c118300cf, this, 163));
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SmartTrimEditorImpl@f896.applySmartTrim$2$1");
            }
        }, 0L, 500L);
        this.LJI = pthreadTimer;
        if (arrayList.isEmpty()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            InterfaceC355380DwW interfaceC355380DwW = this.LJFF;
            if (interfaceC355380DwW != null) {
                interfaceC355380DwW.LIZ(jCurrentTimeMillis2, true);
            }
            LLJJIJIIJIL();
            LLJJIJI(f, f2);
        }
    }

    @Override // X.InterfaceC354950Dvp
    public final void LLJILJILJ(boolean z, ArrayList arrayList, C351500DqG c351500DqG) {
        Object next;
        ArrayList<Pair<Long, Long>> arrayList2;
        Pair<Long, Long> next2;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        NLEResType type;
        NLEResType type2;
        NLEResType type3;
        NLEResType type4;
        NLEResType type5;
        NLEResType type6;
        NLEResType type7;
        NLEResType type8;
        int iIntValue;
        int iIntValue2;
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TrackLinkageManagerProvider.Companion.getClass();
        AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
        if (businessTrackLinkageManager != null) {
            Set<NLEResType> set = businessTrackLinkageManager.LIZLLL;
            ArrayList<NLETrack> arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            VecNLETrackSPtr tracks = C350870DpF.LJI(this.LIZ).getTracks();
            ArrayList<NLETrack> arrayList6 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (!nLETrack2.getMainTrack() && !C351220Dpo.LLLII(nLETrack2) && !C351220Dpo.LLLLILI(nLETrack2) && !C351220Dpo.LLLLIILL(nLETrack2)) {
                    arrayList6.add(nLETrack);
                }
            }
            for (NLETrack nLETrack3 : arrayList6) {
                if (set.contains(nLETrack3.getResourceType())) {
                    arrayList4.add(nLETrack3);
                } else {
                    arrayList5.add(nLETrack3);
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList3.addAll(((NLETrack) it2.next()).getSortedSlots());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C351480DqE c351480DqE = (C351480DqE) it3.next();
                linkedHashMap.put(c351480DqE, new ArrayList());
                for (NLETrack nLETrack4 : arrayList4) {
                    int size = nLETrack4.getSlots().size();
                    Integer num = (Integer) linkedHashMap2.get(nLETrack4.getUUID());
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < size) {
                        Integer num2 = (Integer) linkedHashMap2.get(nLETrack4.getUUID());
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        while (true) {
                            if (iIntValue2 >= size) {
                                break;
                            }
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(iIntValue2, nLETrack4.getSortedSlots());
                            if (nLETrackSlot != null) {
                                C0E48 c0e48 = this.LIZ;
                                if (businessTrackLinkageManager.LIZIZ(c0e48, nLETrackSlot, c351480DqE.LIZ, C350870DpF.LJI(c0e48))) {
                                    if (z) {
                                        ArrayList arrayList7 = (ArrayList) linkedHashMap.get(c351480DqE);
                                        if (arrayList7 != null) {
                                            arrayList7.add(nLETrackSlot);
                                        }
                                    } else if (nLETrackSlot.hasExtra("is_linkage_slot_before_smart_trim") && !Boolean.parseBoolean(nLETrackSlot.getExtra("is_linkage_slot_before_smart_trim"))) {
                                        arrayList3.add(nLETrackSlot);
                                    } else {
                                        ArrayList arrayList8 = (ArrayList) linkedHashMap.get(c351480DqE);
                                        if (arrayList8 != null) {
                                            arrayList8.add(nLETrackSlot);
                                        }
                                    }
                                } else if (z) {
                                    arrayList3.add(nLETrackSlot);
                                }
                                if (iIntValue2 == size - 1) {
                                    linkedHashMap2.put(nLETrack4.getUUID(), Integer.valueOf(size));
                                    break;
                                } else if (nLETrackSlot.getStartTime() >= c351480DqE.LIZ.getEndTime()) {
                                    linkedHashMap2.put(nLETrack4.getUUID(), Integer.valueOf(iIntValue2));
                                    break;
                                }
                            }
                            iIntValue2++;
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        loop6: while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                C351480DqE c351480DqE2 = (C351480DqE) next;
                if (!c351480DqE2.LIZIZ.isEmpty()) {
                    ArrayList<Pair<Long, Long>> arrayList9 = c351480DqE2.LIZIZ;
                    if (!(arrayList9 instanceof Collection) || !arrayList9.isEmpty()) {
                        for (Pair<Long, Long> pair : arrayList9) {
                            if (pair.getFirst().longValue() != pair.getSecond().longValue()) {
                                break loop6;
                            }
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        C351480DqE c351480DqE3 = (C351480DqE) next;
        if (c351480DqE3 != null && (arrayList2 = c351480DqE3.LIZIZ) != null) {
            Iterator<Pair<Long, Long>> it5 = arrayList2.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next2 = it5.next();
                    Pair<Long, Long> pair2 = next2;
                    if (pair2.getFirst().longValue() != pair2.getSecond().longValue()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Pair<Long, Long> pair3 = next2;
            if (pair3 != null) {
                long jLongValue4 = pair3.getFirst().longValue();
                ArrayList arrayList10 = new ArrayList();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    arrayList10.addAll(((C351480DqE) it6.next()).LIZIZ);
                }
                for (NLETrackSlot nLETrackSlot2 : arrayList3) {
                    nLETrackSlot2.setStartTime(nLETrackSlot2.getStartTime() + C352310DrZ.LIZLLL(jLongValue4));
                    nLETrackSlot2.setEndTime(nLETrackSlot2.getEndTime() + C352310DrZ.LIZLLL(jLongValue4));
                    NLESegment mainSegment = nLETrackSlot2.getMainSegment();
                    if (mainSegment != null) {
                        type5 = mainSegment.getType();
                    } else {
                        type5 = null;
                    }
                    if (type5 == NLEResType.TEXT_STICKER) {
                        c351500DqG.LIZIZ(nLETrackSlot2);
                    }
                    int i = 0;
                    long jLongValue5 = 0;
                    for (Object obj : arrayList10) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Pair pair4 = (Pair) obj;
                            int iLIZ = C352310DrZ.LIZ(nLETrackSlot2.getMeasuredStartTime());
                            int iLIZ2 = C352310DrZ.LIZ(nLETrackSlot2.getMeasuredEndTime());
                            long j = iLIZ;
                            if (j >= ((Number) pair4.getFirst()).longValue() && iLIZ2 <= ((Number) pair4.getSecond()).longValue()) {
                                jLongValue5 = 0;
                            } else {
                                long jLongValue6 = ((Number) pair4.getFirst()).longValue();
                                long jLongValue7 = ((Number) pair4.getSecond()).longValue();
                                if (jLongValue6 <= j && j <= jLongValue7 && iLIZ2 > ((Number) pair4.getSecond()).longValue()) {
                                    NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot2.deepClone(true));
                                    if (nLETrackSlotDynamicCast != null) {
                                        jLongValue5 += ((Number) pair4.getSecond()).longValue() - ((Number) pair4.getFirst()).longValue();
                                        NLETrack nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(C350870DpF.LJI(this.LIZ), nLETrackSlot2.getUUID());
                                        if (nLETrackLJLLILLLL != null) {
                                            nLETrackLJLLILLLL.addSlot(nLETrackSlotDynamicCast);
                                        }
                                        this.LIZ.LLFII().LLJ(nLETrackSlotDynamicCast, 0L, C352310DrZ.LIZLLL(((Number) pair4.getSecond()).longValue()) - nLETrackSlotDynamicCast.getStartTime(), EnumC356070Dxd.NONE);
                                        NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                                        if (mainSegment2 != null) {
                                            type8 = mainSegment2.getType();
                                        } else {
                                            type8 = null;
                                        }
                                        if (type8 == NLEResType.TEXT_STICKER) {
                                            c351500DqG.LIZ(nLETrackSlotDynamicCast);
                                        }
                                    }
                                    Pair pair5 = (Pair) C13LP.LJJJLZIJ(i2, arrayList10);
                                    if (pair5 != null) {
                                        this.LIZ.LLFII().LJIILJJIL(nLETrackSlot2, C352310DrZ.LIZLLL(((Number) pair5.getFirst()).longValue()) - nLETrackSlot2.getStartTime(), C352310DrZ.LIZLLL(jLongValue5), nLETrackSlot2.getDuration() - C352310DrZ.LIZLLL(((Number) pair4.getSecond()).longValue() - ((Number) pair4.getFirst()).longValue()), EnumC356070Dxd.NONE);
                                        NLESegment mainSegment3 = nLETrackSlot2.getMainSegment();
                                        if (mainSegment3 != null) {
                                            type7 = mainSegment3.getType();
                                        } else {
                                            type7 = null;
                                        }
                                        if (type7 == NLEResType.TEXT_STICKER) {
                                            c351500DqG.LIZIZ(nLETrackSlot2);
                                        }
                                    } else {
                                        NLETrack nLETrackLJLLILLLL2 = C351220Dpo.LJLLILLLL(C350870DpF.LJI(this.LIZ), nLETrackSlot2.getUUID());
                                        if (nLETrackLJLLILLLL2 != null) {
                                            nLETrackLJLLILLLL2.removeSlot(nLETrackSlot2);
                                        }
                                        NLESegment mainSegment4 = nLETrackSlot2.getMainSegment();
                                        if (mainSegment4 != null) {
                                            type6 = mainSegment4.getType();
                                        } else {
                                            type6 = null;
                                        }
                                        if (type6 == NLEResType.TEXT_STICKER) {
                                            c351500DqG.LIZJ(nLETrackSlot2);
                                        }
                                    }
                                }
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C351480DqE c351480DqE4 = (C351480DqE) entry.getKey();
                    ArrayList<NLETrackSlot> arrayList11 = (ArrayList) entry.getValue();
                    Pair pair6 = (Pair) C13LP.LJJJLL(c351480DqE4.LIZIZ);
                    if (pair6 != null) {
                        jLongValue = ((Number) pair6.getFirst()).longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLIZ = jLongValue - ((long) C352310DrZ.LIZ(c351480DqE4.LIZ.getStartTime()));
                    ArrayList<Pair<Long, Long>> arrayList12 = c351480DqE4.LIZIZ;
                    Pair pair7 = (Pair) C13LP.LJJJLL(arrayList12);
                    if (pair7 != null) {
                        jLongValue2 = ((Number) pair7.getFirst()).longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    Pair pair8 = (Pair) C13LP.LJJJLL(arrayList12);
                    if (pair8 != null) {
                        jLongValue3 = ((Number) pair8.getSecond()).longValue();
                    } else {
                        jLongValue3 = 0;
                    }
                    if (!arrayList12.isEmpty() && jLongValue2 != jLongValue3) {
                        Pair pair9 = (Pair) C13LP.LJJJLL(arrayList12);
                        if (pair9 != null) {
                            for (NLETrackSlot nLETrackSlot3 : arrayList11) {
                                nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() + C352310DrZ.LIZLLL(jLIZ));
                                nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() + C352310DrZ.LIZLLL(jLIZ));
                                NLESegment mainSegment5 = nLETrackSlot3.getMainSegment();
                                if (mainSegment5 != null) {
                                    type2 = mainSegment5.getType();
                                } else {
                                    type2 = null;
                                }
                                NLEResType nLEResType = NLEResType.TEXT_STICKER;
                                if (type2 == nLEResType) {
                                    c351500DqG.LIZIZ(nLETrackSlot3);
                                }
                                int iLIZ3 = C352310DrZ.LIZ(nLETrackSlot3.getMeasuredStartTime());
                                int iLIZ4 = C352310DrZ.LIZ(nLETrackSlot3.getMeasuredEndTime());
                                long j2 = iLIZ3;
                                if (j2 < ((Number) pair9.getFirst()).longValue() || iLIZ4 > ((Number) pair9.getSecond()).longValue()) {
                                    long jLongValue8 = ((Number) pair9.getFirst()).longValue();
                                    long jLongValue9 = ((Number) pair9.getSecond()).longValue();
                                    if (jLongValue8 <= j2 && j2 <= jLongValue9 && iLIZ4 > ((Number) pair9.getSecond()).longValue()) {
                                        this.LIZ.LLFII().LLJ(nLETrackSlot3, 0L, C352310DrZ.LIZLLL(((Number) pair9.getSecond()).longValue() - j2), EnumC356070Dxd.NONE);
                                        NLESegment mainSegment6 = nLETrackSlot3.getMainSegment();
                                        if (mainSegment6 != null) {
                                            type4 = mainSegment6.getType();
                                        } else {
                                            type4 = null;
                                        }
                                        if (type4 == nLEResType) {
                                            c351500DqG.LIZIZ(nLETrackSlot3);
                                        }
                                    }
                                    if (j2 > ((Number) pair9.getSecond()).longValue()) {
                                        NLETrack nLETrackLJLLILLLL3 = C351220Dpo.LJLLILLLL(C350870DpF.LJI(this.LIZ), nLETrackSlot3.getUUID());
                                        if (nLETrackLJLLILLLL3 != null) {
                                            nLETrackLJLLILLLL3.removeSlot(nLETrackSlot3);
                                        }
                                        NLESegment mainSegment7 = nLETrackSlot3.getMainSegment();
                                        if (mainSegment7 != null) {
                                            type3 = mainSegment7.getType();
                                        } else {
                                            type3 = null;
                                        }
                                        if (type3 == nLEResType) {
                                            c351500DqG.LIZJ(nLETrackSlot3);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        for (NLETrackSlot nLETrackSlot4 : arrayList11) {
                            NLETrack nLETrackLJLLILLLL4 = C351220Dpo.LJLLILLLL(C350870DpF.LJI(this.LIZ), nLETrackSlot4.getUUID());
                            if (nLETrackLJLLILLLL4 != null) {
                                nLETrackLJLLILLLL4.removeSlot(nLETrackSlot4);
                            }
                            NLESegment mainSegment8 = nLETrackSlot4.getMainSegment();
                            if (mainSegment8 != null) {
                                type = mainSegment8.getType();
                            } else {
                                type = null;
                            }
                            if (type == NLEResType.TEXT_STICKER) {
                                c351500DqG.LIZJ(nLETrackSlot4);
                            }
                        }
                    }
                }
                LLJJ(null, EnumC356070Dxd.COMMIT);
            }
        }
    }
}
