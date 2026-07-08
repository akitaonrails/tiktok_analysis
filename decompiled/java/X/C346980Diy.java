package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Diy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346980Diy extends C09AY implements Function1<C348100Dkm, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1452170ntP LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346980Diy(int i, int i2, int i3, InterfaceC1452170ntP interfaceC1452170ntP) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = interfaceC1452170ntP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C348100Dkm c348100Dkm) {
        int i;
        C348100Dkm c348100Dkm2 = c348100Dkm;
        VecNLETrackSPtr tracks = c348100Dkm2.LIZ.getModel().getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getTrackType() == NLETrackType.VIDEO || nLETrack.getTrackType() == NLETrackType.AUDIO) {
                arrayList.add(next);
            }
        }
        int i2 = this.LL;
        int i3 = this.LLILLJJLI;
        int i4 = this.LLILLL;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZ;
        for (NLETrack nLETrack2 : arrayList) {
            NLEFilter nLEFilter = new NLEFilter();
            nLEFilter.setStartTime(((long) i) * 1000);
            long j = i2;
            nLEFilter.setEndTime(j * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            NLEResType nLEResType = NLEResType.FILTER;
            nLEResourceNode.setResourceType(nLEResType);
            nLESegmentAudioVolumeFilter.setEffectSDKFilter(nLEResourceNode);
            nLESegmentAudioVolumeFilter.setVolume(0.0f);
            nLEFilter.setSegment(nLESegmentAudioVolumeFilter);
            NLEFilter nLEFilter2 = new NLEFilter();
            long j2 = i3;
            nLEFilter2.setStartTime(j2 * 1000);
            nLEFilter2.setEndTime(((long) interfaceC1452170ntP.getDuration()) * 1000);
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter2 = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter2.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceType(nLEResType);
            nLESegmentAudioVolumeFilter2.setEffectSDKFilter(nLEResourceNode2);
            nLESegmentAudioVolumeFilter2.setVolume(0.0f);
            nLEFilter2.setSegment(nLESegmentAudioVolumeFilter2);
            NLEFilter nLEFilterLIZ = C1463690oBz.LIZ(j, j2, 0L, i4);
            C1CP7.LIZ.getClass();
            ((HashMap) C1CP7.LJ.getValue()).put(nLETrack2.getUUID(), C1697810uHb.LJ(nLEFilter, nLEFilter2, nLEFilterLIZ));
            nLETrack2.addFilter(nLEFilter);
            nLETrack2.addFilter(nLEFilter2);
            nLETrack2.addFilter(nLEFilterLIZ);
            i = 0;
        }
        c348100Dkm2.LIZ.commit();
        return Unit.LIZ;
    }
}
