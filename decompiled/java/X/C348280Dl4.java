package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348280Dl4 extends AbstractC348060Dki {
    public final C348290Dl5 LIZIZ;

    public C348280Dl4(C348290Dl5 c348290Dl5) {
        this.LIZIZ = c348290Dl5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c348290Dl5);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrack next;
        String str;
        if (this.LIZIZ.LIZIZ == null) {
            C1AF0.LIZJ("filterPath must no be null");
            return;
        }
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LJII(next), this.LIZIZ.LIZ.name())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            LJFF("NonComposerFilterUpdateOperation find track ");
            if (Intrinsics.LJFF(this.LIZIZ.LIZIZ, "") && ((str = this.LIZIZ.LJ) == null || Intrinsics.LJFF(str, ""))) {
                return;
            }
            if (nLETrack.getSlots().size() == 0) {
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                NLESegmentFilter nLESegmentFilter = new NLESegmentFilter();
                LJII(nLESegmentFilter);
                nLETrackSlot.setMainSegment(nLESegmentFilter);
                nLETrack.addSlot(nLETrackSlot);
            }
            Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
            while (it3.hasNext()) {
                LJII(NLESegmentFilter.dynamicCast(it3.next().getMainSegment()));
            }
            return;
        }
        LJFF("NonComposerFilterUpdateOperation add track ");
        NLETrack nLETrack2 = new NLETrack();
        nLETrack2.setExtra("FilterTrackType", this.LIZIZ.LIZ.name());
        nLEEditor.getModel().addTrack(nLETrack2);
    }

    public final void LJII(NLESegmentFilter nLESegmentFilter) {
        String strInvoke;
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(this.LIZIZ.LIZIZ);
        if (C1452960nug.LJIIIZ) {
            String str = this.LIZIZ.LJII;
            Function1<? super String, String> function1 = C0FGD.LIZ;
            if (function1 != null) {
                strInvoke = function1.invoke("filter");
            } else {
                strInvoke = null;
            }
            nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(str, strInvoke));
        }
        nLESegmentFilter.setEffectSDKFilter(nLEResourceNode);
        nLESegmentFilter.setIntensity(this.LIZIZ.LIZJ);
        if (this.LIZIZ.LJ != null) {
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceFile(this.LIZIZ.LJ);
            nLESegmentFilter.setRightFilter(nLEResourceNode2);
            nLESegmentFilter.setRightIntensity(this.LIZIZ.LJFF);
            nLESegmentFilter.setFilterPosition(this.LIZIZ.LJI);
        } else {
            nLESegmentFilter.setRightFilter(null);
            nLESegmentFilter.setRightIntensity(0.0f);
            nLESegmentFilter.setFilterPosition(0.0f);
        }
        nLESegmentFilter.setUseFilterV3(this.LIZIZ.LIZLLL);
    }
}
