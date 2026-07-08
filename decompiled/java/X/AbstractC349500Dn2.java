package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC349500Dn2 {
    public final C1DRG LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1207));
    public final Map<String, InterfaceC349480Dn0> LIZJ = new LinkedHashMap();
    public final Set<NLEResType> LIZLLL = new LinkedHashSet();

    public abstract boolean LIZIZ(C0E48 c0e48, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLEModel nLEModel);

    public AbstractC349500Dn2(C1DRG c1drg) {
        this.LIZ = c1drg;
    }

    public final void LIZJ(C349510Dn3 c349510Dn3) {
        int iIntValue;
        int iIntValue2;
        ArrayList arrayList;
        C0E48 c0e48 = (C0E48) this.LIZIZ.getValue();
        if (c0e48 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            String str = c349510Dn3.LIZ;
            if (this.LIZJ.containsKey(str)) {
                InterfaceC349480Dn0 interfaceC349480Dn0 = (InterfaceC349480Dn0) ((LinkedHashMap) this.LIZJ).get(str);
                NLEModel nLEModel = c349510Dn3.LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                ArrayList<NLETrack> arrayList2 = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    NLETrack nLETrack2 = nLETrack;
                    if (!nLETrack2.getMainTrack() && this.LIZLLL.contains(nLETrack2.getResourceType())) {
                        arrayList2.add(nLETrack);
                    }
                }
                for (NLETrackSlot nLETrackSlot : nLEModel.getMainTrack().getSortedSlots()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(nLETrackSlot.getUUID(), new ArrayList());
                    for (NLETrack nLETrack3 : arrayList2) {
                        int size = nLETrack3.getSlots().size();
                        Integer num = (Integer) linkedHashMap2.get(nLETrack3.getUUID());
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue < size) {
                            Integer num2 = (Integer) linkedHashMap2.get(nLETrack3.getUUID());
                            if (num2 != null) {
                                iIntValue2 = num2.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            while (true) {
                                if (iIntValue2 < size) {
                                    NLETrackSlot nLETrackSlot2 = nLETrack3.getSortedSlots().get(iIntValue2);
                                    if (LIZIZ((C0E48) this.LIZIZ.getValue(), nLETrackSlot2, nLETrackSlot, nLEModel) && (arrayList = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID())) != null) {
                                        arrayList.add(nLETrackSlot2);
                                    }
                                    if (iIntValue2 == size - 1) {
                                        linkedHashMap2.put(nLETrack3.getUUID(), Integer.valueOf(size));
                                        break;
                                    } else {
                                        if (nLETrackSlot2.getStartTime() >= nLETrackSlot.getEndTime()) {
                                            linkedHashMap2.put(nLETrack3.getUUID(), Integer.valueOf(iIntValue2));
                                            break;
                                        }
                                        iIntValue2++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (interfaceC349480Dn0 != null) {
                    interfaceC349480Dn0.LIZ(c349510Dn3.LIZJ, linkedHashMap, c349510Dn3.LIZIZ);
                }
            }
        }
    }

    public final void LIZ(String str, AbstractC349610DnD abstractC349610DnD) {
        this.LIZJ.put(str, abstractC349610DnD);
    }
}
