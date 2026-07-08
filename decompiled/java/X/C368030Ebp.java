package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368030Ebp implements InterfaceC371030Egf {
    public final C368630Ecn LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final ConcurrentHashMap<NLETrackSlot, C369110EdZ> LIZLLL = new ConcurrentHashMap<>();
    public Map<NLETrackSlot, Set<C370780EgG>> LJ = new LinkedHashMap();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1075));

    @Override // X.InterfaceC371030Egf
    public final synchronized C371000Egc LIZ() {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        int scrollX;
        int iLIZ;
        C367760EbO c367760EbO;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LJ);
        linkedHashSet = new LinkedHashSet();
        linkedHashSet2 = new LinkedHashSet();
        linkedHashSet3 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        float timelineScale = this.LIZ.getTimelineScale();
        if (((Boolean) this.LJFF.getValue()).booleanValue()) {
            int i = C368630Ecn.LLLLJI;
            this.LIZ.getContext();
            scrollX = -C369020EdQ.LIZ();
            iLIZ = this.LIZ.getScrollX();
        } else {
            scrollX = this.LIZ.getScrollX();
            int i2 = C368630Ecn.LLLLJI;
            this.LIZ.getContext();
            iLIZ = C369020EdQ.LIZ();
        }
        float f = (scrollX - iLIZ) / timelineScale;
        float width = this.LIZ.getWidth() / timelineScale;
        float f2 = C367760EbO.LLILZLL / timelineScale;
        for (Map.Entry<NLETrackSlot, C369110EdZ> entry : this.LIZLLL.entrySet()) {
            NLETrackSlot key = entry.getKey();
            C369110EdZ value = entry.getValue();
            InterfaceC368720Ecw interfaceC368720Ecw = value.LIZIZ;
            if ((interfaceC368720Ecw instanceof C367760EbO) && (c367760EbO = (C367760EbO) interfaceC368720Ecw) != null) {
                if (c367760EbO.LL) {
                    Set set = (Set) linkedHashMap.remove(key);
                    if (set != null) {
                        linkedHashSet3.addAll(set);
                        linkedHashMap2.put(key, set);
                    }
                } else {
                    C367620EbA c367620EbA = c367760EbO.LLILZ;
                    if ((c367620EbA instanceof C367620EbA) && c367620EbA != null) {
                        Set<C370780EgG> setLIZJ = LIZJ(key, value.LIZ, c367620EbA.LLILZLL, f, width, f2);
                        Set set2 = (Set) linkedHashMap.remove(key);
                        if (set2 == null) {
                            linkedHashSet2.addAll(setLIZJ);
                        } else {
                            linkedHashSet.addAll(C15442062u.LJII(set2, setLIZJ));
                            linkedHashSet2.addAll(C15442062u.LJII(setLIZJ, set2));
                        }
                        linkedHashSet3.addAll(setLIZJ);
                        linkedHashMap2.put(key, setLIZJ);
                    }
                }
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll((Set) ((Map.Entry) it2.next()).getValue());
        }
        this.LJ = linkedHashMap2;
        return new C371000Egc(new ArrayList(linkedHashSet), new ArrayList(linkedHashSet2), new ArrayList(linkedHashSet3));
    }

    @Override // X.InterfaceC371030Egf
    public final void LIZIZ(C370820EgK c370820EgK) {
        C354270Duj.LIZJ(0L, new AwS406S0200000_5(this, c370820EgK, 104));
    }

    public C368030Ebp(C368630Ecn c368630Ecn, int i, int i2) {
        this.LIZ = c368630Ecn;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public final Set<C370780EgG> LIZJ(NLETrackSlot nLETrackSlot, int i, boolean z, float f, float f2, float f3) {
        long j;
        long duration;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        String resourceFile;
        NLEResourceNode resource;
        boolean zLLIL = C351220Dpo.LLIL(nLETrackSlot);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (z) {
            j = -((long) ((nLESegmentVideoDynamicCast.getTimeClipStart() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / C351220Dpo.LIZ(nLESegmentVideoDynamicCast)));
        } else {
            j = 0;
        }
        long startTime = nLETrackSlot.getStartTime();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j3 = (startTime / j2) + j;
        double d = f;
        double d2 = f2;
        long jMax = Math.max(j3, (long) (d - (0.5d * d2)));
        if (z) {
            duration = nLESegmentVideoDynamicCast.getDuration() / j2;
        } else {
            duration = nLETrackSlot.getDuration() / j2;
        }
        long jMin = Math.min((nLETrackSlot.getStartTime() / j2) + duration, (long) (d + (d2 * 1.5d)));
        if (jMin - jMax <= 0) {
            return C08CX.INSTANCE;
        }
        int scrollY = this.LIZ.getScrollY();
        int i4 = this.LIZIZ;
        int i5 = (this.LIZJ + i4) * i;
        int i6 = i4 + i5;
        if (i5 - this.LIZ.getHeight() < scrollY && i6 > scrollY) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLLLL = C351220Dpo.LLLL(nLETrackSlot);
        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
            if (nLETrackSlot.getMeasuredEndTime() / j2 > f && nLETrackSlot.getStartTime() / j2 < f + f2) {
                if (z2) {
                    i3 = 3;
                } else {
                    i3 = 1;
                }
            } else if (z2) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            C370780EgG[] c370780EgGArr = new C370780EgG[1];
            if (nLESegmentVideoDynamicCast == null || (resource = nLESegmentVideoDynamicCast.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                resourceFile = "";
            }
            c370780EgGArr[0] = new C370780EgG(0, i3, resourceFile, true, zLLLL, zLLIL);
            return C093Y.LJ(c370780EgGArr);
        }
        float startTime2 = (nLETrackSlot.getStartTime() / j2) - ((nLESegmentVideoDynamicCast.getTimeClipStart() / j2) / C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
        float f4 = startTime2;
        while (true) {
            float f5 = f4 + f3;
            if (f5 >= jMax) {
                break;
            }
            f4 = f5;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(f4));
        if (z2) {
            while (true) {
                f4 += f3;
                if (f4 > jMin) {
                    break;
                }
                arrayList.add(Float.valueOf(f4));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C370720EgA.LIZ.getClass();
        String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            if (fFloatValue + f3 >= f && fFloatValue - f3 <= f + f2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (z3) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
            } else if (z3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int iLIZ = (int) ((fFloatValue - startTime2) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
            C370720EgA.LIZ.getClass();
            int iLIZ2 = C370720EgA.LIZ(iLIZ);
            if (iLIZ2 > nLESegmentVideoDynamicCast.getResource().getDuration() / j2) {
                iLIZ2 = (int) (nLESegmentVideoDynamicCast.getResource().getDuration() / j2);
            }
            zLLLL = zLLLL;
            zLLIL = zLLIL;
            linkedHashSet.add(new C370780EgG(iLIZ2, i2, strLIZIZ, false, zLLLL, zLLIL));
        }
        return linkedHashSet;
    }
}
