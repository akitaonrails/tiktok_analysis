package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358530E3v implements InterfaceC371030Egf {
    public final Context LIZ;
    public final InterfaceC358560E3y LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1671));
    public Map<NLETrackSlot, Set<C370780EgG>> LIZLLL = new LinkedHashMap();
    public List<? extends NLETrackSlot> LJ = new ArrayList();
    public int LJFF = C0FU0.LIZJ(C0EHL.LIZ()) / 2;
    public int LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.HashSet, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Set] */
    @Override // X.InterfaceC371030Egf
    public final C371000Egc LIZ() {
        int iLIZ;
        ?? linkedHashSet;
        int i;
        int i2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C358550E3x frameData = this.LIZIZ.getFrameData();
        int curScrollX = this.LIZIZ.getCurScrollX();
        int iLIZJ = C0FU0.LIZJ(C0EHL.LIZ()) / 2;
        float f = curScrollX - this.LJFF;
        float f2 = frameData.LIZ;
        float f3 = f / f2;
        float f4 = (iLIZJ * 2) / f2;
        float f5 = frameData.LIZIZ / f2;
        int i3 = 0;
        for (NLETrackSlot nLETrackSlot : this.LJ) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            if (nLETrackSlot2.getMainSegment().getType() == NLEResType.VIDEO || nLETrackSlot2.getMainSegment().getType() == NLEResType.IMAGE) {
                float startTime = nLETrackSlot2.getStartTime() / 1000.0f;
                long duration = nLETrackSlot2.getDuration();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                float f6 = (duration / j) + startTime;
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                Iterator<? extends NLETrackSlot> it2 = this.LJ.iterator();
                long duration2 = 0;
                while (it2.hasNext()) {
                    duration2 += it2.next().getDuration() / j;
                }
                float f7 = 2;
                float f8 = ((Boolean) this.LIZJ.getValue()).booleanValue() ? (duration2 - f3) - (f4 - ((this.LJI / this.LIZIZ.getFrameData().LIZ) * f7)) : f3;
                float fMax = Math.max(startTime, f8 - f4);
                float fMin = Math.min(f6, f8 + (f7 * f4));
                C370720EgA.LIZ.getClass();
                String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot2);
                boolean z = nLETrackSlot2.getMainSegment().getType() == NLEResType.IMAGE;
                boolean zLLLL = C351220Dpo.LLLL(nLETrackSlot2);
                if (z) {
                    iLIZ = 0;
                } else {
                    iLIZ = C370720EgA.LIZ(((int) nLESegmentVideoDynamicCast.getTimeClipStart()) / LSPassThroughRecordSizeConfig.DEFAULT);
                    long duration3 = nLESegmentVideoDynamicCast.getResource().getDuration() / j;
                    if (iLIZ > duration3) {
                        iLIZ = (int) duration3;
                    }
                }
                if (fMin <= fMax) {
                    linkedHashSet = C093Y.LJ(new C370780EgG(iLIZ, 2, strLIZIZ, z, zLLLL));
                } else {
                    float f9 = f3 + f4;
                    if (z) {
                        if ((fMax > f3 || f3 > fMin) && ((fMax > f9 || f9 > fMin) && (f3 > fMax || fMax > f9))) {
                            i = 1;
                            i2 = 2;
                        } else {
                            i = 1;
                            i2 = 3;
                        }
                        C370780EgG[] c370780EgGArr = new C370780EgG[i];
                        c370780EgGArr[0] = new C370780EgG(iLIZ, i2, nLESegmentVideoDynamicCast.getResource().getResourceFile(), i, zLLLL);
                        linkedHashSet = C093Y.LJ(c370780EgGArr);
                    } else {
                        float timeClipStart = startTime - ((nLESegmentVideoDynamicCast.getTimeClipStart() / j) / C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                        float f10 = timeClipStart;
                        while (true) {
                            float f11 = f10 + f5;
                            if (f11 >= fMax) {
                                break;
                            }
                            f10 = f11;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Float.valueOf(f10));
                        while (true) {
                            f10 += f5;
                            if (f10 > fMin) {
                                break;
                            }
                            arrayList.add(Float.valueOf(f10));
                        }
                        linkedHashSet = new LinkedHashSet();
                        Iterator it3 = arrayList.iterator();
                        boolean z2 = false;
                        while (it3.hasNext()) {
                            float fFloatValue = ((Number) it3.next()).floatValue();
                            int i5 = (fFloatValue + f5 < f3 || fFloatValue - f5 > f9) ? 2 : 3;
                            int iLIZ2 = (int) ((fFloatValue - timeClipStart) * C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                            C370720EgA.LIZ.getClass();
                            int iLIZ3 = C370720EgA.LIZ(iLIZ2);
                            long duration4 = nLESegmentVideoDynamicCast.getResource().getDuration() / j;
                            if (iLIZ3 > duration4) {
                                iLIZ3 = (int) duration4;
                            }
                            if (iLIZ3 == iLIZ) {
                                z2 = true;
                            }
                            linkedHashSet.add(new C370780EgG(iLIZ3, i5, strLIZIZ, false, zLLLL));
                        }
                        if (!z2) {
                            linkedHashSet.add(new C370780EgG(iLIZ, 2, strLIZIZ, false, zLLLL));
                        }
                    }
                }
                Set<C370780EgG> setRemove = this.LIZLLL.remove(nLETrackSlot2);
                if (setRemove == null) {
                    linkedHashSet3.addAll(linkedHashSet);
                } else {
                    linkedHashSet2.addAll(C15442062u.LJII(setRemove, linkedHashSet));
                    linkedHashSet3.addAll(C15442062u.LJII(linkedHashSet, setRemove));
                }
                linkedHashSet4.addAll(linkedHashSet);
                linkedHashMap.put(nLETrackSlot2, linkedHashSet);
            }
            i3 = i4;
        }
        Iterator it4 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (it4.hasNext()) {
            linkedHashSet2.addAll((Set) ((Map.Entry) it4.next()).getValue());
        }
        this.LIZLLL = linkedHashMap;
        return new C371000Egc(new ArrayList(linkedHashSet2), new ArrayList(linkedHashSet3), new ArrayList(linkedHashSet4));
    }

    @Override // X.InterfaceC371030Egf
    public final void LIZIZ(C370820EgK c370820EgK) {
        C354270Duj.LIZJ(0L, new C358540E3w(this, c370820EgK));
    }

    public C358530E3v(Context context, InterfaceC358560E3y interfaceC358560E3y) {
        this.LIZ = context;
        this.LIZIZ = interfaceC358560E3y;
    }
}
