package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0E6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359170E6h implements C0E8N {
    public final /* synthetic */ C0E7Z LIZ;

    @Override // X.C0E8N
    public final void LIZ() {
        this.LIZ.k5().LJI();
    }

    @Override // X.C0E8N
    public final NLETimeSpaceNode LIZIZ() {
        return this.LIZ.k5().LIZIZ();
    }

    @Override // X.C0E8N
    public final boolean LJ() {
        return this.LIZ.k5().LJ();
    }

    @Override // X.C0E8N
    public final void LJFF() {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        String resourceFile;
        CreativeInfo creativeInfo;
        NLEResourceNode resource;
        C0E48 c0e48F4 = this.LIZ.F4();
        if (c0e48F4 == null || (mainTrack = C350870DpF.LJI(c0e48F4).getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots)) == null) {
            return;
        }
        if (C0E5J.LIZJ(nLETrackSlot)) {
            Activity activity = this.LIZ.LLJJI.mActivity;
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131825493);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
            C0E7Z c0e7z = this.LIZ;
            LJI(c0e7z.LLJJI, c0e48F4, c0e7z.getEditModel(), resourceFile, null, nLETrackSlot, jCurrentTimeMillis);
            return;
        }
        VideoPublishEditModel editModel = this.LIZ.getEditModel();
        if (editModel == null || (creativeInfo = editModel.getCreativeInfo()) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ.LLJJI), null, null, new C353350DtF(nLETrackSlot, creativeInfo, this.LIZ, this, c0e48F4, resourceFile, jCurrentTimeMillis, null), 3);
    }

    @Override // X.C0E8N
    public final void onScaleBegin() {
        this.LIZ.i3(AFwS234S0000000_5.get$arr$(379));
    }

    @Override // X.C0E8N
    public final void onScaleEnd() {
        this.LIZ.i3(AFwS234S0000000_5.get$arr$(380));
    }

    public C359170E6h(C0E7Z c0e7z) {
        this.LIZ = c0e7z;
    }

    @Override // X.C0E8N
    public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
        this.LIZ.k5().LIZJ(nLETimeSpaceNode);
    }

    @Override // X.C0E8N
    public final void LIZLLL(int i, long j, NLETrack nLETrack) {
        this.LIZ.LLJZ.LIZLLL(i, j, nLETrack);
    }

    public static void LJI(C19A3 c19a3, C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, String str, String str2, NLETrackSlot nLETrackSlot, long j) {
        C375820EoO.LIZ(c19a3, c0e48, C376260Ep6.class, new C379120Eti(c0e48, videoPublishEditModel, null, new AIGCGenerationParam(null, null, str, null, false, false, null, null, null, null, 0, 0, null, null, nLETrackSlot.getUUID(), false, false, 0, false, null, null, null, null, null, null, false, false, false, null, null, 0, 0, AIGCBusinessType.AI_EXTEND, null, null, -16389, 6, null), null, C359190E6j.LIZIZ, false, false, false, false, C0E9W.AI_EXTEND, str2, j, EnumC378910EtN.SLOT, 468), 16);
    }
}
