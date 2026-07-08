package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0E8C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E8C implements TrackPanelActionListener {
    public final /* synthetic */ C359740E8m LIZ;

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final boolean disableClip(NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final NLETimeSpaceNode getSelectedKeyframe() {
        return null;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClip(EnumC368970EdL enumC368970EdL, EnumC368970EdL enumC368970EdL2, long j, long j2) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClipEnd(NLETrackSlot nLETrackSlot, long j, long j2, boolean z) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClipMainToMinDuration() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClipStart(NLETrackSlot nLETrackSlot) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onEditClipChange() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onKeyframeSelected(NLETimeSpaceNode nLETimeSpaceNode) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackDragBegin() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackDragEnd(int i, int i2) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackMoveSlot(NLETrackSlot nLETrackSlot, int i, int i2) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onScale(float f) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onScaleBegin() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onScaleEnd() {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onStartAndDuration(NLETrackSlot nLETrackSlot, long j, long j2, int i) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onTransitionClick(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onUnableToSetTransition(int i) {
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onAddResourceClick() {
        this.LIZ.LLLLIL().LJI.onAddResourceClick();
    }

    public C0E8C(C359740E8m c359740E8m) {
        this.LIZ = c359740E8m;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMoveFail(NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot;
        int layer;
        NLEModel nLEModel = this.LIZ.LLLLILI().LIZ.LIZJ.LIZ;
        if (nLEModel != null && (trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot)) != null) {
            C359740E8m c359740E8m = this.LIZ;
            if (C350870DpF.LJIIIIZZ(trackBySlot) == NLETrackType.VIDEO && !trackBySlot.getMainTrack()) {
                int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
                List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
                int i = 0;
                if (listLJJLIIIJLJLI != null && !listLJJLIIIJLJLI.isEmpty()) {
                    Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
                    if (it2.hasNext()) {
                        int layer2 = it2.next().getLayer();
                        while (it2.hasNext()) {
                            int layer3 = it2.next().getLayer();
                            if (layer2 < layer3) {
                                layer2 = layer3;
                            }
                        }
                        i = layer2 + 1;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                if (i == iIntValue) {
                    Activity activity = c359740E8m.mActivity;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131850358);
                    C1390380mHk.LIZ(activity, 1065, creativeToastBuilder);
                    return;
                }
                return;
            }
            if (C351220Dpo.LLJJIII(trackBySlot)) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(C351220Dpo.LJJIJLIJ(nLEModel));
                if (nLETimeSpaceNode != null) {
                    layer = nLETimeSpaceNode.getLayer();
                } else {
                    layer = -1;
                }
                if (layer + 1 >= C356600DyU.LJ()) {
                    Activity activity2 = c359740E8m.mActivity;
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131833284);
                    C1390380mHk.LIZ(activity2, 1065, creativeToastBuilder2);
                    return;
                }
                return;
            }
            if (C351220Dpo.LLJI(trackBySlot) && C349760DnS.LIZIZ(nLEModel)) {
                Activity activity3 = c359740E8m.mActivity;
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.messageRes(2131833347);
                C1390380mHk.LIZ(activity3, 1065, creativeToastBuilder3);
            }
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onVideoPositionChanged(SeekInfo seekInfo) {
        this.LIZ.LLLLIL().LJI.onVideoPositionChanged(seekInfo);
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onAudioMuteClick(boolean z, boolean z2) {
        this.LIZ.LLLLIL().LJI.onAudioMuteClick(z, z2);
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        this.LIZ.LLLLIL().LJI.onMove(i, i2, nLETrackSlot, j, j2, j3, z);
    }
}
