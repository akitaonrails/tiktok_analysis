package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverBackData;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.1Ds0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269301Ds0 extends C09AY implements Function0<C1440920nbG> {
    public C2269301Ds0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nbG] */
    @Override // kotlin.jvm.functions.Function0
    public final C1440920nbG invoke() {
        return new InterfaceC1443320nf8() { // from class: X.0nbG
            @Override // X.InterfaceC1443320nf8
            public final C0JHI LIZ() {
                return C1435410nSN.LIZ;
            }

            @Override // X.InterfaceC1443320nf8
            public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                if (videoPublishEditModel == null || !C1443230nez.LJIIJJI(videoPublishEditModel)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1443320nf8
            public final String LJII(String str) {
                return C1443230nez.LJIIIIZZ(str);
            }

            @Override // X.InterfaceC1443320nf8
            public final void LIZIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) throws Throwable {
                C2204961BRm.n(c19eg, videoPublishEditModel, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2pdZreyTDVYNBMgPqHglj45UEzDSsE+hsJes5+T5hU6+rpeGuXeLHOuY+WS+MpCWPSxpxi5chwT8qRtZYpKQ==", null));
            }

            @Override // X.InterfaceC1443320nf8
            public final void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
                if (videoPublishEditModel != null) {
                    C1443230nez.LJ(videoPublishEditModel, str);
                }
            }

            @Override // X.InterfaceC1443320nf8
            public final VideoPublishEditModel LJ(Aweme aweme, Activity activity) {
                String aid;
                String authorUid;
                Integer numValueOf;
                String str;
                C1440930nbH c1440930nbH = new C1440930nbH();
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                c1440930nbH.LIZ = aid;
                if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                    authorUid = "";
                }
                c1440930nbH.LIZIZ = authorUid;
                c1440930nbH.LIZJ = "pcs_course";
                if (aweme != null) {
                    numValueOf = Integer.valueOf(aweme.getAwemeType());
                } else {
                    numValueOf = null;
                }
                c1440930nbH.LIZLLL = numValueOf;
                C857150Xjt.LIZIZ = c1440930nbH;
                VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
                videoPublishEditModel.mShootWay = "pcs_edit_post";
                C1443230nez.LJ(videoPublishEditModel, "");
                if (aweme != null) {
                    C1443230nez.LIZIZ(videoPublishEditModel, aweme, activity);
                }
                long j = 0;
                videoPublishEditModel.creativeModel.pcsPaidVideoMediaModel = new PcsCourseVideoModel(j, j);
                MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData != null && ((str = multiEditVideoRecordData.coverImagePath) == null || str.length() == 0)) {
                    multiEditVideoRecordData.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
                }
                return videoPublishEditModel;
            }

            @Override // X.InterfaceC1443320nf8
            public final NLEError LJIIIIZZ(String str, NLEModel nLEModel) {
                NLETrackSlot next;
                C1440940nbI.LIZ.getClass();
                Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next == null) {
                    return C1440940nbI.LIZ(-1);
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(next.getMainSegment());
                if (nLESegmentAudioDynamicCast == null) {
                    return C1440940nbI.LIZ(-1);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                arrayList.add(nLESegmentAudioDynamicCast.getResource().getResourceFile());
                arrayList2.add(-1L);
                arrayList3.add(-1L);
                arrayList6.add(Float.valueOf(1.0f));
                arrayList4.add(-1L);
                arrayList5.add(-1L);
                int iDetachAudioFromVideos = VEUtils.detachAudioFromVideos(str, (String[]) arrayList.toArray(new String[0]), C13LP.LLIIIILZ(arrayList2), C13LP.LLIIIILZ(arrayList3), C13LP.LLIIIILZ(arrayList4), C13LP.LLIIIILZ(arrayList5), -1L, -1L, C13LP.LLI(arrayList6), 1, 131072, 16000, VEUtils.CompatibleMode.Fill_silence);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return C1440940nbI.LIZ(iDetachAudioFromVideos);
            }

            @Override // X.InterfaceC1443320nf8
            public final void LJI(int i, Intent intent, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function0) {
                if (i == 4 && intent != null) {
                    ChooseCoverBackData chooseCoverBackDataLIZ = C1430420nKK.LIZ(intent);
                    if (chooseCoverBackDataLIZ != null) {
                        chooseCoverBackDataLIZ.LIZ(videoPublishEditModel);
                    }
                    function0.invoke();
                }
            }

            @Override // X.InterfaceC1443320nf8
            public final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, String str, Function0<Unit> function0) {
                String str2;
                MultiEditVideoStatusRecordData multiEditVideoRecordData;
                if (C493401w4.LIZ()) {
                    C0MH8 c0mh8 = C0MH8.LIZ;
                    if (videoPublishEditModel == null) {
                        return;
                    }
                    C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel, bitmap, 0, 0, str, 0, null, AFwS261S0000000_22.get$arr$(318), 108);
                    return;
                }
                if (videoPublishEditModel != null && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
                    str2 = multiEditVideoRecordData.coverImagePath;
                } else {
                    str2 = null;
                }
                C1443400nfG.LJIJI(bitmap, str, str2, null);
            }

            @Override // X.InterfaceC1443320nf8
            public final void LJFF(C19EG c19eg, LifecycleOwner lifecycleOwner, RemoteImageView remoteImageView, VideoPublishEditModel videoPublishEditModel, final Function1 function1) {
                C1443990ngD.LJIIJJI(videoPublishEditModel, remoteImageView, c19eg, new C09K7() { // from class: X.0Xmp
                    @Override // X.C09K7
                    public final void LJJLIIIJLLLLLLLZ(Bitmap bitmap) {
                        Function1<Bitmap, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(bitmap);
                        }
                    }
                }, lifecycleOwner);
            }
        };
    }
}
