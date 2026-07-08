package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0E3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358410E3j implements InterfaceC371030Egf {
    public List<C350030Dnt> LIZ;
    public Set<C370780EgG> LIZIZ = new LinkedHashSet();
    public final List<InterfaceC358430E3l> LIZJ = new ArrayList();

    @Override // X.InterfaceC371030Egf
    public final C371000Egc LIZ() {
        List<C350030Dnt> list = this.LIZ;
        Object obj = null;
        if (list == null) {
            List listLLIIII = C13LP.LLIIII(this.LIZIZ);
            C13BV c13bv = C13BV.INSTANCE;
            return new C371000Egc(listLLIIII, c13bv, c13bv);
        }
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<C350030Dnt> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LIZLLL, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        for (NLETrackSlot nLETrackSlot : arrayList) {
            NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(obj, nLETrackSlot.getMainSegment());
            boolean zLLIL = C351220Dpo.LLIL(nLETrackSlot);
            C370720EgA.LIZ.getClass();
            String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
            boolean zLLJJIJIL = C351220Dpo.LLJJIJIL(nLETrackSlot);
            linkedHashSet4.add(new C370780EgG(zLLJJIJIL ? 0 : C370720EgA.LIZ((int) ((nLESegmentAudio != null ? nLESegmentAudio.getTimeClipStart() : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))), 3, strLIZIZ, zLLJJIJIL, C351220Dpo.LLLL(nLETrackSlot), zLLIL));
            obj = null;
        }
        linkedHashSet2.addAll(C15442062u.LJII(linkedHashSet4, this.LIZIZ));
        linkedHashSet.addAll(C15442062u.LJII(this.LIZIZ, linkedHashSet4));
        linkedHashSet3.addAll(linkedHashSet4);
        this.LIZIZ = linkedHashSet4;
        return new C371000Egc(C13LP.LLIIII(linkedHashSet), C13LP.LLIIII(linkedHashSet2), C13LP.LLIIII(linkedHashSet3));
    }

    @Override // X.InterfaceC371030Egf
    public final void LIZIZ(C370820EgK c370820EgK) {
        if (((ArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        C354270Duj.LIZJ(0L, new C358420E3k(this, c370820EgK));
    }
}
