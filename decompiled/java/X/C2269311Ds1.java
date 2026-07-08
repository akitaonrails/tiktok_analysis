package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ds1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269311Ds1 extends C09AY implements Function0<C348990DmD> {
    public C2269311Ds1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0DmD] */
    @Override // kotlin.jvm.functions.Function0
    public final C348990DmD invoke() {
        return new InterfaceC349000DmE() { // from class: X.0DmD
            @Override // X.InterfaceC349000DmE
            public final boolean LIZ(String str) {
                if (str == null || str.length() == 0) {
                    return false;
                }
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.restore(str);
                C363500EMy c363500EMy = C363500EMy.LIZ;
                NLEModel model = nLEEditorLIZ.getModel();
                c363500EMy.getClass();
                C362740EKa.LIZ.getClass();
                return C362740EKa.LJFF(model);
            }

            @Override // X.InterfaceC349000DmE
            public final List<C1432730nO3> LIZIZ(String str) {
                String extra;
                NLESegmentVideo nLESegmentVideoDynamicCast;
                ArrayList arrayList = new ArrayList();
                if (str != null && str.length() != 0) {
                    NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                    nLEEditorLIZ.restore(str);
                    VecNLETrackSPtr tracks = nLEEditorLIZ.getModel().getTracks();
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (!nLETrack2.getMainTrack() && nLETrack2.hasExtra("track_extra_pip") && Intrinsics.LJFF(nLETrack2.getExtra("track_extra_pip"), "true")) {
                            arrayList2.add(nLETrack);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                            if (nLETrackSlot.hasExtra("library_id")) {
                                extra = nLETrackSlot.getExtra("library_id");
                            } else {
                                extra = "";
                            }
                            if (extra.length() == 0 && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                                String resourceFile = nLESegmentVideoDynamicCast.getAVFile().getResourceFile();
                                long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                arrayList.add(new C1432730nO3(resourceFile, timeClipStart / j, (nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / j));
                            }
                        }
                    }
                    return arrayList;
                }
                return arrayList;
            }
        };
    }
}
